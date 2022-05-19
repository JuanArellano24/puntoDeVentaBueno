package com.example.puntodeventa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class pantallaIniciarSesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_iniciar_sesion);
    }
    public void siguieteP (View view){
        Intent siguienteP = new Intent(this, pantallaPerfil.class);
        startActivity(siguienteP);

    }

}