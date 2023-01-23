package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;


public class Activity2 extends AppCompatActivity {
    String Zam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);

        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        Button Button=findViewById(R.id.button);
        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenActivity();
            }
        });

        Spinner ord = (Spinner) findViewById(R.id.Zamówienia);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,ZwróćNazweZamówienia(wybor_dan.zamówieniaLista));
        ord.setAdapter(adapter);
        ord.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Zam= adapterView.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }
    public String [] ZwróćNazweZamówienia(List<Zamówienia> lista){
        String []Names=new String[lista.size()];
        for(int i=0;i<lista.size();i++){
            Names[i]="Zamówienie"+lista.get(i).getCzasutworzenia();
        }
        return Names;
    }
    public String WyswietlZamowienie(Zamówienia zam){
        return"Nr zamówienia: "+zam.czasutworzenia+"\n\n"+zam.textzamowienie+"\n\nSuma do zapłaty = "+zam.cena;
    }

    public void OpenActivity(){
        Intent intent = new Intent(this, wybor_dan.class);
        startActivity(intent);
    }

}