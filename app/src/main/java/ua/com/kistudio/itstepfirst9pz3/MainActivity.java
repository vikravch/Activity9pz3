package ua.com.kistudio.itstepfirst9pz3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    public static final String LOG_TAG = "Logs";
    public static final String PASSWORD_KEY ="password";
    public static final String USER_KEY = "user";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "В методе onCreate");
        setContentView(R.layout.activity_main); //подключение разметки

        Button btn = (Button) findViewById(R.id.btnClick);
        btn.setOnClickListener(this);

        Button btnIntent = (Button) findViewById(R.id.btnIntent);
        btnIntent.setOnClickListener(this);
    }

    protected void onStart(){
        super.onStart();
        Log.d(LOG_TAG, "В методе onStart");

    }

    protected void onResume(){
        super.onResume();
        Log.d(LOG_TAG,"В методе onResume");
    }

    protected void onStop(){
        super.onStop();
        Log.d(LOG_TAG,"В методе onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG,"В методе onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "В методе onDestroy");
    }



    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnClick:
                Toast.makeText(this,getResources().getString(R.string.write_text),Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, LoginActivity.class);
                intent.putExtra(PASSWORD_KEY,"1111");
                intent.putExtra(USER_KEY,"user1");
                startActivity(intent);
                break;
            case R.id.btnIntent:
                Intent i = new Intent(this, SecondActivity.class);
                startActivity(i);
                break;
        }


    }
}
