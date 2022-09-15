package com.cantinatoshio.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TelaAberta extends AppCompatActivity {

    private TextView txtPreco, txtDesc;
    private ImageView imgDoces;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_aberta);

        txtPreco = findViewById(R.id.precoAberto);
        txtDesc = findViewById(R.id.descricao);
        imgDoces = findViewById(R.id.imgoDoce);

        Intent intent = getIntent();

        String preco, descricao;
        int imgdoces;

        preco = intent.getExtras().getString("Preco");
        descricao = intent.getExtras().getString("Descricao");
        imgdoces = intent.getExtras().getInt("ImgDoce");

        txtPreco.setText(preco);
        txtDesc.setText(descricao);
        imgDoces.setImageResource(imgdoces);
    }
}