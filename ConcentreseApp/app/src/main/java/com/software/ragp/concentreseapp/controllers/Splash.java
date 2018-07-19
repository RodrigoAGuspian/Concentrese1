package com.software.ragp.concentreseapp.controllers;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.software.ragp.concentreseapp.R;

public class Splash extends AppCompatActivity {
    public static String jugador1, jugador2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        CountDownTimer countDownTimer = new CountDownTimer(2000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                AlertDialog.Builder builder = new AlertDialog.Builder(Splash.this);
                builder.setView(R.layout.layout_jugadores);
                final EditText txtnombreJ1 = findViewById(R.id.txtJugadorI1);
                final EditText txtnombreJ2 = findViewById(R.id.txtJugadorI2);
                builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        jugador1= txtnombreJ1.getText().toString();
                        jugador2= txtnombreJ2.getText().toString();
                        if (jugador1.length()>1 && jugador2.length()>1){
                            Intent intent = new Intent(Splash.this, MenuJ.class);
                            startActivity(intent);
                            finish();
                        }else {
                            Toast.makeText(Splash.this, "Por favor ingrese el nombre de los dos jugadores", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                builder.setCancelable(false);
                builder.setTitle("Nombre de los jugadores");
                builder.show();
            }
        }.start();
    }
}
