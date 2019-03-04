package com.example.calculaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void suma(View v){
        int a=5,b=10,suma;
        String sumaString;
        suma = a + b;
        sumaString=Integer.toString(suma);
        Log.d("MIS_ETIQUETAS","La suma es "+sumaString.toString());
    }
    public void resta(View v){
        int a=5,b=10;
        String restaString;
        int suma = a + b;
        restaString=Integer.toString(suma);
        Log.d("MIS_ETIQUETAS","La suma es "+restaString.toString());
    }
    public void multiplicacion(View v){
        int a=5,b=10;
        String multiplicacionString;
        int suma = a + b;
        multiplicacionString=Integer.toString(suma);
        Log.d("MIS_ETIQUETAS","La suma es "+multiplicacionString.toString());
    }
    public void division(View v){
        int a=5,b=10;
        String divisionString;
        int suma = a + b;
        divisionString=Integer.toString(suma);
        Log.d("MIS_ETIQUETAS","La suma es "+divisionString.toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
