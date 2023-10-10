package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText InputNumero1;
    private EditText InputNumero2;
    private TextView textViewTotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InputNumero1 = findViewById(R.id.InputNumero1);
        InputNumero2 = findViewById(R.id.InputNumero2);

        textViewTotal = findViewById(R.id.textViewTotal);
    }

    public void somar(View view) {
        int valor1 = Integer.parseInt(InputNumero1.getText().toString());
        int valor2 = Integer.parseInt(InputNumero2.getText().toString());

        textViewTotal.setText(String.valueOf(valor1 + valor2));
    }

    public void subtrair(View view){
        int valor1 = Integer.parseInt(InputNumero1.getText().toString());
        int valor2 = Integer.parseInt(InputNumero2.getText().toString());

        textViewTotal.setText(String.valueOf(valor1 - valor2));
    }

    public void dividir (View view){
        int valor1 = Integer.parseInt(InputNumero1.getText().toString());
        int valor2 = Integer.parseInt(InputNumero2.getText().toString());

        textViewTotal.setText(String.valueOf(valor1 / valor2));
    }

    public void multiplicar (View view){
        int valor1 = Integer.parseInt(InputNumero1.getText().toString());
        int valor2 = Integer.parseInt(InputNumero2.getText().toString());

        textViewTotal.setText(String.valueOf(valor1 / valor2));
    }

}