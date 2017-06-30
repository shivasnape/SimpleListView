package com.snape.shivichu.simplelistviewnew;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);


        String[] values = new String[]{"Television", "Desktop Computers", "Laptops", "MobilePhones", "Washing Machines", "Grinder", "Watches",
                "SchoolBags", "Umbrella"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                //int position;
                int itemPosition = i;
                String itemvalue = (String) listView.getItemAtPosition(i);
                Toast.makeText(getApplicationContext(), "position:" + itemPosition + "ListItem:" + itemvalue, Toast.LENGTH_SHORT).show();

            }
        });


    }

}