package com.example.tfg_frutosgibaja;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.List;

public class JuegoAdapter extends ArrayAdapter<Juego> {

    public JuegoAdapter(Context context, List<Juego> juegos){
        super(context, 0, juegos);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Juego juego = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.juego_cell, parent, false);
        }
        TextView nombre = convertView.findViewById(R.id.textNombre);
        TextView compania = convertView.findViewById(R.id.textCompania);
        TextView anio = convertView.findViewById(R.id.textAnio);
        TextView plataforma = convertView.findViewById(R.id.textPlataforma);

        nombre.setText(juego.getNombre());
        compania.setText(juego.getCompania());
        anio.setText(juego.getAnio().toString());
        plataforma.setText(juego.getPlataforma());

        return convertView;
    }
}
