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

        // Восстановление состояния
        try {
            Log.d(LOG_TAG, "var - " + savedInstanceState.getInt("var", 0));
        }
        catch (Exception ex){
            Log.d(LOG_TAG,"var - пустой");
        }



        Log.d(LOG_TAG, "В методе onCreate");
        setContentView(R.layout.activity_main); //подключение разметки

        // Описание кнопок
        Button btn = (Button) findViewById(R.id.btnClick);
        btn.setOnClickListener(this);

        Button btnIntent = (Button) findViewById(R.id.btnIntent);
        btnIntent.setOnClickListener(this);

        ((Button) findViewById(R.id.btnListActivity)).setOnClickListener(this);
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
    protected void onSaveInstanceState(Bundle outState) {
        //Bundle b = new Bundle();
        outState.putInt("var", 12);
        super.onSaveInstanceState(outState);

        Log.d(LOG_TAG, "В методе onSaveInstanceState");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        Log.d(LOG_TAG,"Result code - "+resultCode+ "; Request code - "+requestCode);

        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnClick:
                Toast.makeText(this,getResources().getString(R.string.write_text),Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, LoginActivity.class);
                intent.putExtra(PASSWORD_KEY,"1111");
                intent.putExtra(USER_KEY,"user1");
                startActivityForResult(intent, 0);
                break;
            case R.id.btnIntent:
                Intent i = new Intent(this, SecondActivity.class);
                startActivity(i);
                break;
            case R.id.btnListActivity:
                startActivity(new Intent(this,ListActivity.class));
                break;
        }


    }
}
