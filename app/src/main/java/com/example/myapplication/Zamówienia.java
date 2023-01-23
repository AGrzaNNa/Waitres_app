package com.example.myapplication;
import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Zamówienia {
    String czasutworzenia;
    String cena;
    String textzamowienie;
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Zamówienia(String cena, String textzamowienie){
        LocalDateTime obj=LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        this.czasutworzenia = obj.format(myFormatObj);
        this.cena=cena;
        this.textzamowienie=textzamowienie;
    }

    public String getCzasutworzenia() {
        return czasutworzenia;
    }
    public String [] ZwróćNazweZamówienia(List<Zamówienia> lista){
        String []Names=new String[lista.size()];
        for(int i=0;i<lista.size();i++){
            Names[i]=lista.get(i).getCzasutworzenia();
        }
        return Names;
    }
    public String WyswietlZamowienie(Zamówienia zam){
        return"Nr zamówienia: "+zam.czasutworzenia+"\n\n"+zam.textzamowienie+"\n\nSuma do zapłaty = "+zam.cena;
    }
}
