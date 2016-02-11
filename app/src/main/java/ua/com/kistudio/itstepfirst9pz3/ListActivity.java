package ua.com.kistudio.itstepfirst9pz3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        String[] array = {"first","second","third"};

        ListView listView = (ListView) findViewById(R.id.lvListFirst);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,array);
        listView.setAdapter(arrayAdapter);

    }
}
