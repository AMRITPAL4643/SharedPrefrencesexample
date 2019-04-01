package com.example.day4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class privateAcitivity extends AppCompatActivity {
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    private Spinner s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_private_acitivity);
        Bundle nextpage = getIntent().getExtras();
        Spinner s = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this,android.R.layout.simple_expandable_list_item_1,cars);
        s.setAdapter(dataAdapter);
        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(),item,Toast.LENGTH_LONG).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }

}
