package ua.com.kistudio.itstepfirst9pz3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // Способ создания через ArrayAdapter
        String[] array = {"first","second","third"};

        ListView listView = (ListView) findViewById(R.id.lvListFirst);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,array);
        listView.setAdapter(arrayAdapter);

        // Способ создание через Simple adapter
        // Массив данных для адаптера
        ArrayList<HashMap<String,String>> data = new ArrayList<>();

        // Массивы указателей
        int[] to ={R.id.tvItemUp,R.id.tvItemDown};
        String[] from = {"up","down"};

        // Формирование данных
        for (int i = 0; i<67; i++)
        {
            HashMap<String,String> map = new HashMap<>();
            map.put("up","Up - "+i);
            map.put("down","Down - "+i);
            data.add(map);
        }
        // Создание адаптера
        SimpleAdapter simpleAdapter = new SimpleAdapter(this,data,R.layout.item,from,to);
        // Подключение адаптера
        listView.setAdapter(simpleAdapter);
/*
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                showMassage(id);

            }
        });
*/
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                showLongMassage((String) ((TextView) view.findViewById(R.id.tvItemUp)).getText());
                return false;
            }
        });

    }

    private void showMassage(long id) {
        Toast.makeText(this,"Click on "+id+" item",Toast.LENGTH_SHORT).show();
    }

    private void showLongMassage(String id) {
        Toast.makeText(this,"Long click on "+id+" item",Toast.LENGTH_SHORT).show();
    }
}
