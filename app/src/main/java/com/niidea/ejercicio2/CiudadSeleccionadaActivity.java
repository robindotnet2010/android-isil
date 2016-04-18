package com.niidea.ejercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CiudadSeleccionadaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciudad_seleccionada);
        Bundle datosLeer = getIntent().getExtras();
        //Asi se recuperan los datos que trajo el intent
        String cSeleccionada = datosLeer.getString("ciudadElegida");
        //Asi se lee el dato con la clave con la que fue guardada en el Bundle
        this.setTitle(cSeleccionada);
    }
}
