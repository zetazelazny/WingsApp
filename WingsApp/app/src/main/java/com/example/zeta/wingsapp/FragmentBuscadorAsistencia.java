package com.example.zeta.wingsapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Zeta on 28/1/2018.
 */

public class FragmentBuscadorAsistencia extends Fragment
{
    public View onCreateView (LayoutInflater Inflador, ViewGroup Grupo, Bundle DatosRecibidos)
    {
        View VistaADevolver;
        VistaADevolver = Inflador.inflate(R.layout.fragment_buscador_asistencias, Grupo, false);
        return VistaADevolver;
    }
}
