package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import android.os.Bundle;

public class wybor_dan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        new TworzenieDan();
        super.onCreate(savedInstanceState);
        pozyskajDania();
        setContentView(R.layout.activity_wybor_dan);

        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
    public List<Dania> zupy = new ArrayList<Dania>(){};
    public List<Dania> daniaGlowne = new ArrayList<Dania>(){};
    public List<Dania> napoje = new ArrayList<Dania>(){};

    public void pozyskajDania(){

        zupy.add(new Dania("Pomidorowa", 15.90));
        zupy.add(new Dania("Ogórkowa", 13.90));
        zupy.add(new Dania("Rosół", 15));

        daniaGlowne.add(new Dania("Kotlet Schabowy", 24.90));
        daniaGlowne.add(new Dania("Pierś z Kurczaka", 22.90));
        daniaGlowne.add(new Dania("Hamburger Wołowy", 23.90));
        daniaGlowne.add(new Dania("Sphagetti Bolognese", 23.90));

        napoje.add(new Dania("Coca Cola 0,33", 4.90));
        napoje.add(new Dania("Sprite 0,33", 4.90));
        napoje.add(new Dania("Fanta 0,33", 4.90));
        napoje.add(new Dania("Herbata Czarna", 5.90));
        napoje.add(new Dania("Herbata owocowa", 6.90));
        napoje.add(new Dania("Sok świeżo wyciskany", 9.90));
    }
}