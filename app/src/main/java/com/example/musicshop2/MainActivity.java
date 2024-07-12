package com.example.musicshop2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int quantity=0;
 Spinner spiner;
 ArrayList spinnerAL;
 ArrayAdapter spinnerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spiner=findViewById(R.id.spinner);
        spinnerAL=new ArrayList<>();
        spinnerAL.add("Piano");
        spinnerAL.add("Keyboard");
        spinnerAL.add("Guitar");
        spinnerAL.add("Drums");
        spinnerAdapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, spinnerAL);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner.setAdapter(spinnerAdapter);




    }

    public void Quantity(View view) {
            TextView value = findViewById(R.id.value);
        if(quantity<25) {
            quantity++;
            value.setText("" + quantity);
        }
    }
    public void Quantity2(View view) {
        TextView value=findViewById(R.id.value);
        if (quantity!=0) {
            quantity--;
            value.setText(""+quantity);
        }
    }
}