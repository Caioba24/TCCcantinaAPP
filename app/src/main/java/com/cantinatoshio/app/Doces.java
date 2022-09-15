package com.cantinatoshio.app;

import android.widget.ImageView;
import android.widget.TextView;

public class Doces {

    public int doce;
    public String titulo;
    public String descricao;
    public String preco;


    public Doces(String preco, String titulo, String descricao, int doce) {
        this.doce = doce;
        this.preco = preco;
        this.descricao = descricao;
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPreco() {return preco;}

    public void setPreco(String avaliacao) {this.preco = avaliacao;}

    public int getimgDoces() {
        return doce;
    }

    public void setimgDoces(int imgDoce) {
        this.doce = imgDoce;
    }
}

