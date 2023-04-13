package com.example.tfg_frutosgibaja;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.*;
import java.util.ArrayList;

public class ActivityPrintJuegos extends AppCompatActivity {
    private Button botonPrintJuego;
    private TextView txtViewJuego;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_juegos);
            botonPrintJuego = (Button) findViewById(R.id.btnPrintearJuego);
            botonPrintJuego.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    BBDD bbddManager= null;
                    try {
                        bbddManager = new BBDD();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    ArrayList<Juego> array = new ArrayList<Juego>();
                    Juego jueguito = new Juego();
                    jueguito = array.get(0);
                    txtViewJuego = (TextView) findViewById(R.id.txtViewJuego);
                    try {
                        array=bbddManager.getArrayJuegos();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    txtViewJuego.setText("");
                }
            });

    }
}