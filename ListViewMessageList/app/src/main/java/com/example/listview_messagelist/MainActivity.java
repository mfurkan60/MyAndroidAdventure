package com.example.listview_messagelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    //tanımlamalar
    ListView listView;
    //mesajModel türünden Liste  elemanı oluşturduk.
    List<mesajModel> liste;
    // ve en son olarak adapter dosyasını oluşturduktan sonra adapter türünden adp nesnesi
    //oluşturacağız
    mesajAdapter adp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanımla();
        ListDoldur();
    }

    public void tanımla(){
        listView = findViewById(R.id.listview);

    }

    public void ListDoldur(){

        //model clasına ait  nesneler oluşturacağızve bu nesneleride listeye ekleyeceğiz
        liste = new ArrayList<>(); //boş liste buraya atacağız
        mesajModel m1 = new mesajModel("Hello","Mert",R.drawable.ic_launcher_foreground);
        mesajModel m2 = new mesajModel("How are You?","Mert",R.drawable.ic_launcher_foreground);
        mesajModel m3 = new mesajModel("I am Ok!","Mert",R.drawable.ic_launcher_foreground);
        liste.add(m1);
        liste.add(m2);
        liste.add(m3);

        // bu alttaki kodlar en son adımlardır
        adp = new mesajAdapter(liste,this);
        listView.setAdapter(adp);



    }
}