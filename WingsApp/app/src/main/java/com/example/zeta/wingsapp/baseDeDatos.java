package com.example.zeta.wingsapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Zeta on 28/1/2018.
 */

public class baseDeDatos extends SQLiteOpenHelper
{
    public baseDeDatos (Context Contexto, String Nombre, SQLiteDatabase.CursorFactory Fabrica, int Version)
    {
        super (Contexto, Nombre, Fabrica, Version);
    }

    @Override
    public void onCreate (SQLiteDatabase BDD)
    {
        String queryTablaAlumnos = "create table alumnos (nombre text, apellido text, edad integer, grupo text)";
        String queryTablaAsistencias = "create table asistencias (id_alumno integer, fecha text)";
        String queryTablaPagos = "create table pagos (id_alumno integer, mes text, monto integer)";
        BDD.execSQL(queryTablaAlumnos);
        BDD.execSQL(queryTablaAsistencias);
        BDD.execSQL(queryTablaPagos);
    }

    @Override
    public void onUpgrade (SQLiteDatabase BDD, int VersionAnterior, int VersionNueva)
    {

    }
}
