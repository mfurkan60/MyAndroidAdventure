package com.example.radiobtn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Genel atamalar
    RadioButton secenek1;
    RadioButton secenek2;
    RadioButton secenek3;
    RadioButton secenek4;
    RadioGroup radioGroup;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Genel tanımlamalar
    public  void tanımlamalar(){
            secenek1 = findViewById(R.id.secenek1);
            secenek2 = findViewById(R.id.secenek2);
            secenek3 = findViewById(R.id.secenek3);
            secenek4 = findViewById(R.id.secenek4);
            radioGroup = findViewById(R.id.radioGroup);
            btn = findViewById(R.id.btn);
    }
    public void gelenId(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //biz burada radio butonların id leine göre eriştik
                int gelenid = radioGroup.getCheckedRadioButtonId();
                calıstır(gelenid); //butona tıklandıgında id değerlerine göre işlemler yapar
            }
        });

    }
    public void tıklamaozelligi(){
        //burada her bir raido butonuna tıklama özelliği verdik
        secenek1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Bu değeri seçtiniz" + secenek1.getText(),Toast.LENGTH_LONG).show();
            }
        });
        secenek2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Bu değeri seçtiniz" + secenek2.getText(),Toast.LENGTH_LONG).show();
            }
        });
        secenek3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Bu değeri seçtiniz" + secenek3.getText(),Toast.LENGTH_LONG).show();
            }
        });
        secenek4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Bu değeri seçtiniz" + secenek4.getText(),Toast.LENGTH_LONG).show();
            }
        });
    }
    public void calıstır(int deger){
        if(deger == R.id.secenek1 ){
            Toast.makeText(getApplicationContext(),"Bu değeri seçtiniz" + secenek1.getText(),Toast.LENGTH_LONG).show();
        }else if(deger == R.id.secenek2){

            Toast.makeText(getApplicationContext(),"Bu değeri seçtiniz" + secenek2.getText(),Toast.LENGTH_LONG).show();
        }else if(deger == R.id.secenek3){
            Toast.makeText(getApplicationContext(),"Bu değeri seçtiniz" + secenek3.getText(),Toast.LENGTH_LONG).show();
        }else if(deger == R.id.secenek4){
            Toast.makeText(getApplicationContext(),"Bu değeri seçtiniz" + secenek4.getText(),Toast.LENGTH_LONG).show();
        }
        }


}