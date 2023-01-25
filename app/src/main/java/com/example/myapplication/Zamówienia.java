package com.example.myapplication;
import android.os.Build;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Zamówienia  {
    String czasutworzenia;
    String cena;
    String textzamowienie;

    public void setCzasutworzenia(String czasutworzenia) {
        this.czasutworzenia = czasutworzenia;
    }

    public String getCena() {
        return cena;
    }

    public void setCena(String cena) {
        this.cena = cena;
    }

    public String getTextzamowienie() {
        return textzamowienie;
    }

    public void setTextzamowienie(String textzamowienie) {
        this.textzamowienie = textzamowienie;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Zamówienia(String cena, String textzamowienie){
        LocalDateTime obj=LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        this.czasutworzenia ="Zamówienie "+obj.format(myFormatObj);
        this.cena=cena;
        this.textzamowienie=textzamowienie;
    }

    public String getCzasutworzenia() {
        return czasutworzenia;
    }
}
