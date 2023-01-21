package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class wybor_dan extends AppCompatActivity {
    TextView textview;
    String Soup, Main_dish,Drinks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        textview=findViewById(R.id.Wynik);
        super.onCreate(savedInstanceState);
        pozyskajDania();
        setContentView(R.layout.orders);

        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        Spinner soup = (Spinner) findViewById(R.id.zupy);
        Spinner main_plate = (Spinner) findViewById(R.id.dania_glowne);
        Spinner drinks = (Spinner) findViewById(R.id.napoje);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,ZwróćNazweDania(zupy));
        soup.setAdapter(adapter);
        soup.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(wybor_dan.this, "Selected " + adapterView.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
                Soup= adapterView.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        ArrayAdapter adapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,ZwróćNazweDania(daniaGlowne));
        main_plate.setAdapter(adapter2);
        main_plate.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(wybor_dan.this, "Selected " + adapterView.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
                Main_dish= adapterView.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        ArrayAdapter adapter3 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,ZwróćNazweDania(napoje));
        drinks.setAdapter(adapter3);
        drinks.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(wybor_dan.this, "Selected " + adapterView.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
                Drinks= adapterView.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    public List<Dania> zupy = new ArrayList<Dania>(){};
    public List<Dania> daniaGlowne = new ArrayList<Dania>(){};
    public List<Dania> napoje = new ArrayList<Dania>(){};

    public void pozyskajDania(){

        zupy.add(new Dania("Pomidorowa", 15.90));
        zupy.add(new Dania("Ogórkowa", 13.90));
        zupy.add(new Dania("Rosół", 15));
        zupy.add(new Dania("Brak", 0));

        daniaGlowne.add(new Dania("Kotlet Schabowy", 24.90));
        daniaGlowne.add(new Dania("Pierś z Kurczaka", 22.90));
        daniaGlowne.add(new Dania("Hamburger Wołowy", 23.90));
        daniaGlowne.add(new Dania("Sphagetti Bolognese", 23.90));
        daniaGlowne.add(new Dania("Brak", 23.90));

        napoje.add(new Dania("Coca Cola 0,33", 4.90));
        napoje.add(new Dania("Sprite 0,33", 4.90));
        napoje.add(new Dania("Fanta 0,33", 4.90));
        napoje.add(new Dania("Herbata Czarna", 5.90));
        napoje.add(new Dania("Herbata owocowa", 6.90));
        napoje.add(new Dania("Sok świeżo wyciskany", 9.90));
    }
    public String[] ZwróćNazweDania(List<Dania>nazwa){
        String[] Names=new String[nazwa.size()];
        for(int i=0;i<nazwa.size();i++){
            Names[i]=nazwa.get(i).getNazwaDania();
        }
        return Names;
    }

}