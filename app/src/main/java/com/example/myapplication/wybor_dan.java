package com.example.myapplication;

import static java.lang.Double.parseDouble;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class wybor_dan extends AppCompatActivity {
    TextView textview,Cena;
    EditText editzupy,editdania,editnapoje;
    String Soup, Main_dish,Drinks;
    Button OrderButton,FinalButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pozyskajDania();
        setContentView(R.layout.orders);
        OrderButton=findViewById(R.id.orderbutton);
        FinalButton=findViewById(R.id.finalbutton);
        textview=findViewById(R.id.Wynik);
        editzupy=findViewById(R.id.Ilość_zup);
        editdania=findViewById(R.id.Ilość_dańgłównych);
        editnapoje=findViewById(R.id.Ilość_Napoi);
        Cena=findViewById(R.id.Cena);
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
                Drinks= adapterView.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        OrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] Zupy=ZwróćNazweDania(zupy);
                String[] Dania=ZwróćNazweDania(daniaGlowne);
                String[] Napoje=ZwróćNazweDania(napoje);
                String Zawartosc="";
                String pomoc=textview.getText().toString();
                double Suma=0;
                if(Cena.getText().toString().length()>0) {
                    Suma= parseDouble(Cena.getText().toString());
                }
                if(Soup!="Brak") {
                    for (int x = 0; x < Zupy.length; x++) {
                        if (Soup.equals(Zupy[x])) {
                            Zawartosc+=(Soup + " " + ZwróćCeneDania(zupy)[x] + " x " + editzupy.getText().toString()+"\n");
                            Suma+=ZwróćCeneDania(zupy)[x]*parseDouble(editzupy.getText().toString());
                        }
                    }
                }
                if(Main_dish!="Brak") {
                    for (int x = 0; x < Dania.length; x++) {
                        if (Main_dish.equals(Dania[x])) {
                            Zawartosc+=(Main_dish + " " + ZwróćCeneDania(daniaGlowne)[x] + " x " + editdania.getText().toString()+"\n");
                            Suma+=ZwróćCeneDania(daniaGlowne)[x]*parseDouble(editdania.getText().toString());
                        }
                    }
                }
                if(Drinks!="Brak") {
                    for (int x = 0; x < Napoje.length; x++) {
                        if (Drinks.equals(Napoje[x])) {
                            Zawartosc+=(Drinks + " " + ZwróćCeneDania(napoje)[x] + " x " + editnapoje.getText().toString()+"\n");
                            Suma+=ZwróćCeneDania(napoje)[x]*parseDouble(editnapoje.getText().toString());
                        }
                    }
                }
                textview.setText(pomoc+Zawartosc);
                Cena.setText(Double.toString(Suma));
            }
        });
        //TODO Zrobić dodawanie zamówienia na klick do klasy przechowywującej je i dodającej do spinerów w activity2
        FinalButton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                String cena=Cena.getText().toString();
                String text=textview.getText().toString();
                zamówieniaLista.add(new Zamówienia(cena,text));
                //Cena.setText(""); czyszczenie okna
                //textview.setText("");
            }
        });
    }
    public List<Zamówienia> zamówieniaLista=new ArrayList<Zamówienia>(){};
    public List<Dania> zupy = new ArrayList<Dania>(){};
    public List<Dania> daniaGlowne = new ArrayList<Dania>(){};
    public List<Dania> napoje = new ArrayList<Dania>(){};

    public void pozyskajDania(){
        zupy.add(new Dania("Brak", 0));
        zupy.add(new Dania("Pomidorowa", 15.90));
        zupy.add(new Dania("Ogórkowa", 13.90));
        zupy.add(new Dania("Rosół", 15));

        daniaGlowne.add(new Dania("Brak", 0));
        daniaGlowne.add(new Dania("Kotlet Schabowy", 24.90));
        daniaGlowne.add(new Dania("Pierś z Kurczaka", 22.90));
        daniaGlowne.add(new Dania("Hamburger Wołowy", 23.90));
        daniaGlowne.add(new Dania("Sphagetti Bolognese", 23.90));

        napoje.add(new Dania("Brak", 0));
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
    public double[] ZwróćCeneDania(List<Dania>nazwa){
        double[] Prices=new double[nazwa.size()];
        for(int i=0;i<nazwa.size();i++){
            Prices[i]=nazwa.get(i).getCenaDania();
        }
        return Prices;
    }


}