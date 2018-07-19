package com.software.ragp.concentreseapp.models;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class GestorDB extends SQLiteOpenHelper {
    public GestorDB(Context context) {
        super(context,Constants.DATABASE_NAME,null,Constants.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Constants.script);
    }

    public List<Score> listResultados(String modo, String difucltad){
        List<Score> results = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM SCORE WHERE MODO='"+modo+"' AND DIFICULTAD='"+difucltad+"' ORDER BY PUNTUACION DESC",null);
        if (cursor.moveToFirst()){
            do {
                Score score = new Score();
                score.setJugador(cursor.getString(0));
                score.setDificultad(cursor.getString(1));
                score.setModo(cursor.getString(2));
                score.setPuntuacion(cursor.getString(3));
                results.add(score);

            }while (cursor.moveToNext());
        }

        cursor.close();
        db.close();

        return results;
    }

    public void inputData(Score score){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("JUGADOR",score.getJugador());
        values.put("MODO",score.getJugador());
        values.put("DIFICULTAD",score.getJugador());
        values.put("PUNTUACION",score.getJugador());
        db.insert("SCORE",null,values);
        db.close();

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
