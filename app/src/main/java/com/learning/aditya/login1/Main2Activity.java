package com.learning.aditya.login1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}
    String list[]={"sdds","list kedua","list ketiga"};
Spinner spinner = (Spinner) findViewById(R.id.spinner1);
    ArrayAdapter<String> AdapterList = new ArrayAdapter<String>(this,
            android.R.layout.simple_spinner_dropdown_item,list);
spinner.setAdapter(AdapterList);