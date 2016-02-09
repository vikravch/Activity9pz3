package ua.com.kistudio.itstepfirst9pz3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Intent i = getIntent();
        String password = i.getStringExtra(MainActivity.PASSWORD_KEY);
        String user = i.getStringExtra(MainActivity.USER_KEY);

        TextView tvUser = (TextView) findViewById(R.id.tvUserName);
        Log.d(MainActivity.LOG_TAG, tvUser.getText().toString() );

        TextView tvPassword = (TextView) findViewById(R.id.tvUserPassword);
        Log.d(MainActivity.LOG_TAG, tvPassword.getText().toString());

        tvUser.setText(tvUser.getText().toString()+" "+user);
        tvPassword.setText(tvPassword.getText().toString()+" "+password);
    }
}
