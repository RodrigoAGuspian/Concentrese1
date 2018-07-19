package com.software.ragp.concentreseapp.models;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class AdapterJ extends BaseAdapter{
    private int [] imagenessjuego;
    private int alto, ancho;
    private Context context;

    public AdapterJ(int[] imagenessjuego, int alto, int ancho, Context context) {
        this.imagenessjuego = imagenessjuego;
        this.alto = alto;
        this.ancho = ancho;
        this.context = context;
    }

    @Override
    public int getCount() {
        return imagenessjuego.length;
    }

    @Override
    public Object getItem(int position) {
        return imagenessjuego[position];
    }

    @Override
    public long getItemId(int position) {
        return imagenessjuego[position];
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView item = new ImageView(context);
        BitmapFactory.Options op = new BitmapFactory.Options();
        op.inSampleSize=4;
        item.setPadding(4,4,4,4);
        item.setLayoutParams(new GridView.LayoutParams(ancho,alto));
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), imagenessjuego[position], op);
        item.setImageBitmap(bitmap);
        return item;
    }
}
