package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Listactivity extends Activity {
    ListView listView;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listactivity);
        listView=(ListView)findViewById(R.id.ListView);
        final ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("iphone");
        arrayList.add("Android");
        arrayList.add("Linux");
        arrayList.add("Windows");
        arrayList.add("BlackBerry");
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),Devicedetailedactivity.class);
                startActivity(intent);


            }
        });
    }


}

