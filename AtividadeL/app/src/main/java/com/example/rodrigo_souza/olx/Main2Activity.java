package com.example.rodrigo_souza.olx;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import io.objectbox.Box;

public class Main2Activity extends AppCompatActivity {
    Box<Produto> produtoBox;
    EditText descricao;
    EditText valor;
    EditText local;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        setupView();
    }

    public void setupView(){
        produtoBox = MainActivity.BOXSTORE.boxFor(Produto.class);
        descricao = findViewById(R.id.edt_descricao_anuncio);
        valor = findViewById(R.id.edt_valor_anuncio);
        local = findViewById(R.id.edt_local_anuncio);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_cadastro, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.salvar_anuncio:
                salvar();
                return true;
            case R.id.cancelar_anuncio:
                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void salvar() {
            try {
            Produto produto = new Produto(Float.parseFloat(valor.getText().toString()),
                    descricao.getText().toString(), Calendar.getInstance().getTime(),
                    local.getText().toString() );

            produto.setImagem(R.drawable.olx);

            produtoBox.put(produto);
            finish();

            } catch (Exception e){
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            }


    }

}
