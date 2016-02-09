package ua.com.kistudio.itstepfirst9pz3;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Вiталя on 09.02.2016.
 */
public class SecondActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(MainActivity.LOG_TAG, "В методе onCreate SecondActivity");

    }


    protected void onStart(){
        super.onStart();
        Log.d(MainActivity.LOG_TAG, "В методе onStart SecondActivity");

    }

    protected void onResume(){
        super.onResume();
        Log.d(MainActivity.LOG_TAG,"В методе onResume SecondActivity");
    }

    protected void onStop(){
        super.onStop();
        Log.d(MainActivity.LOG_TAG,"В методе onStop SecondActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(MainActivity.LOG_TAG,"В методе onPause SecondActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(MainActivity.LOG_TAG, "В методе onDestroy SecondActivity");

    }
}
