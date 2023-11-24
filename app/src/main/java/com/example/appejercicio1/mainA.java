package com.example.appejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class mainA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txtSaludo = (TextView)findViewById(R.id.txtSaludo);
        Bundle bundle = this.getIntent().getExtras();
        txtSaludo.setText("Hola!, Bienvenido \n " + bundle.getString("NOMBRE"));
    }
}