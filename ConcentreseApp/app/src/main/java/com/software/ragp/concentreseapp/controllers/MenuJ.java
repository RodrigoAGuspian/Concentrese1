package com.software.ragp.concentreseapp.controllers;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import com.software.ragp.concentreseapp.R;

public class MenuJ extends AppCompatActivity {
    public static int nivel =4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_j);
    }

    public void jugar(View view) {
        AlertDialog.Builder builder =new AlertDialog.Builder(this);
        builder.setView(R.layout.layout_dificultad);
        builder.setCancelable(false);
        builder.setTitle("Dificultad");
        RadioButton rbtnFacil = findViewById(R.id.rbtnFacilD);
        RadioButton rbtnMedio = findViewById(R.id.rbtnMedioD);
        RadioButton rbtnDificl = findViewById(R.id.rbtnDificilD);
        builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
    }
}
