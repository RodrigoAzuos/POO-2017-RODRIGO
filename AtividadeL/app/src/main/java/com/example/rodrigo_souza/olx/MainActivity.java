package com.example.rodrigo_souza.olx;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import com.example.rodrigo_souza.olx.adpters.AnuncioAdapter;

import java.util.List;

import io.objectbox.Box;
import io.objectbox.BoxStore;
import io.objectbox.android.AndroidObjectBrowser;

import static android.app.PendingIntent.getActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private FloatingActionButton actionButton;
    private RecyclerView rcView;
    private Box<Produto> produtoBox;
    private List<Produto> produtos;

    public boolean TESTE = false;
    public static BoxStore BOXSTORE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViews();

    }

    @Override
    protected void onResume() {
        super.onResume();
        atualizarLista();
    }

    public void setupViews(){
        actionButton = findViewById(R.id.float_plus);
        rcView = findViewById(R.id.rv_lista_anuncio);
        actionButton.setOnClickListener(this);
        produtoBox = getBox().boxFor(Produto.class);

        registerForContextMenu(rcView);

    }

    public void atualizarLista(){
        produtos = produtoBox.getAll();
        LayoutInflater layoutInflater = getLayoutInflater();
        AnuncioAdapter anuncioAdapter = new AnuncioAdapter(this, produtos, layoutInflater);

        rcView.setAdapter(anuncioAdapter);
        rcView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);

        linearLayoutManager.scrollToPosition(0);
        rcView.setLayoutManager(linearLayoutManager);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.float_plus:
                Intent intent =  new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
                break;
        }
    }

    BoxStore getBox(){
        if (!TESTE){

            BOXSTORE = MyObjectBox.builder().androidContext(MainActivity.this).build();
            if (BuildConfig.DEBUG) {
                new AndroidObjectBrowser(BOXSTORE).start(this);
                TESTE = true;
            }
        }

        return BOXSTORE;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        TESTE = true;
    }
}
