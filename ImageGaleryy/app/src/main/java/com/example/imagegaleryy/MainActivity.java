package com.example.imagegaleryy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //variablers
    Button button;
    ImageView img;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanımla();
        tıkla();
    }

    public void tanımla(){
        button = findViewById(R.id.button);
        img = findViewById(R.id.img);
    }
    public void tıkla(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //when we click on the button, that function  execute
                int randomNumber = (int) (Math.random()*4 +1);
                System.out.println(randomNumber);
                degistir(randomNumber);


            }
        });

    }

    public void degistir(int number){
        if(number==1){
            img.setImageResource(R.drawable.cabin);
        }else if(number ==2){
            img.setImageResource(R.drawable.game);
        }else if(number==3){
            img.setImageResource(R.drawable.circus);
        }else if(number == 4){
            img.setImageResource(R.drawable.cake);
        }

    }


}