package com.example.juegodados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageButton btnI;
    ImageView iv1 , iv2, iv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnI = findViewById(R.id.btn1);
        iv1 = findViewById(R.id.iv1);
        iv2 = findViewById(R.id.iv2);
        iv3 = findViewById(R.id.iv3);
    }

    public void lanzar(View v){
        int valor1 = 1+ (int) (Math.random()*6);
        int valor2 = 1+ (int) (Math.random()*6);
        int valor3 = 1+ (int) (Math.random()*6);
        switch (valor1){
            case 1 : iv1.setImageResource(R.drawable.dado1);break;
            case 2 : iv1.setImageResource(R.drawable.dado2);break;
            case 3 : iv1.setImageResource(R.drawable.dado3);break;
            case 4 : iv1.setImageResource(R.drawable.dado4);break;
            case 5 : iv1.setImageResource(R.drawable.dado5);break;
            case 6 : iv1.setImageResource(R.drawable.dado6);break;
        }
        switch (valor2){
            case 1 : iv2.setImageResource(R.drawable.dado1);break;
            case 2 : iv2.setImageResource(R.drawable.dado2);break;
            case 3 : iv2.setImageResource(R.drawable.dado3);break;
            case 4 : iv2.setImageResource(R.drawable.dado4);break;
            case 5 : iv2.setImageResource(R.drawable.dado5);break;
            case 6 : iv2.setImageResource(R.drawable.dado6);break;
        }
        switch (valor3){
            case 1 : iv3.setImageResource(R.drawable.dado1);break;
            case 2 : iv3.setImageResource(R.drawable.dado2);break;
            case 3 : iv3.setImageResource(R.drawable.dado3);break;
            case 4 : iv3.setImageResource(R.drawable.dado4);break;
            case 5 : iv3.setImageResource(R.drawable.dado5);break;
            case 6 : iv3.setImageResource(R.drawable.dado6);break;
        }

    }
}