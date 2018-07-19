package com.software.ragp.concentreseapp.controllers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

import com.software.ragp.concentreseapp.R;

import java.util.ArrayList;
import java.util.List;

public class Juego extends AppCompatActivity {
    private int fondoJuego=0;
    private int[] imagenesJuego;
    private int[] imagenesAleatorias, imagenesFondo;
    private List<Integer> imagenesSelec = new ArrayList<>();
    GridView contenedorJuego;
    TextView txtNombreJ1, txtNombreJ2, txtPuntuacionJ1, txtPuntuacionJ2;
    int movimientos, pos1=-1, pos2=-1, salir, nivel=4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);
    }
}
