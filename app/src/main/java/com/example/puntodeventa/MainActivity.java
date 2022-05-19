package com.example.puntodeventa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Metodo del boton para pasar del boton registrar a la pantalla del registro
    public void siguienteR (View view){
        Intent siguienteR = new Intent(this, pantallaRegistrar.class);
        startActivity(siguienteR);
    }

    //Metodo del boton para pasar del boton registrar a la pantalla de iniciar sesión
    public void siguienteIS (View view) {
        Intent siguienteIS = new Intent(this, pantallaIniciarSesion.class);
        startActivity(siguienteIS);
    }
}