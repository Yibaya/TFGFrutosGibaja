package com.example.tfg_frutosgibaja;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginUsuarios extends AppCompatActivity {
    EditText usernameEt, passwordEt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_usuarios);
        usernameEt = (EditText)findViewById(R.id.txtUsuario);
        passwordEt = (EditText)findViewById(R.id.txtPassword);
    }

    public void onLogin(View view){
        String username = usernameEt.getText().toString();
        String password = passwordEt.getText().toString();
        String type = "login";
        BBDD bd = new BBDD(this);
        bd.execute(type, username, password);
    }
}