package com.example.rodrigo_souza.olx;

import android.media.Image;

import java.util.Date;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

/**
 * Created by rodrigo-souza on 09/02/18.
 */
@Entity
public class Produto {

    @Id
    long id;

    private float preco;
    private String descricao;
    private Date data;
    private String local;
    private int imagem;

    public Produto(float preco, String descricao,  Date data, String local) {
        this.preco = preco;
        this.descricao = descricao;
        this.data = data;
        this.local = local;

    }

    public Produto() {
    }

    public float getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public Date getData() {
        return data;
    }

    public String getLocal() {
        return local;
    }

    public int getImagem() {
        return imagem;
    }

    public void setID(long ID) {
        this.id = ID;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
