package com.stubborn.listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayAdapter arrayAdapter;
    String string[] = {"html", "javascript", "css", "bootstrap", "json", "jquery"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);
        arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_dropdown_item_1line, string);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, string[position], Toast.LENGTH_SHORT).show();
            }
        });

    }
}
