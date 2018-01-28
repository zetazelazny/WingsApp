package com.example.zeta.wingsapp;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Settings extends AppCompatActivity
{
    baseDeDatos accesoBase;
    SQLiteDatabase baseDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    public void CrearBase (View Vista)
    {
        accesoBase = new baseDeDatos(this, "baseDatosWings", null, 1);
        Log.d("Error de creacion ", "Llega 1");
        baseDatos = accesoBase.getWritableDatabase();
        Log.d("Error de creacion ", "Llega 2");
        if (baseDatos != null)
        {
            Log.d("Error de creacion ", "Llega 3");
            Toast.makeText(this, "Base creada exitosamente", Toast.LENGTH_LONG).show();
            Log.d("Error de creacion ", "Llega 4");
            baseDatos.close();
        }
        else
        {
            Log.d("Error de creacion ", "Llega 5");
            Toast.makeText(this, "Base creada exitosamente", Toast.LENGTH_LONG).show();
        }
        Log.d("Error de creacion ", "Llega 6");
    }
}
