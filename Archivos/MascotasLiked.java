package com.barto.petagramweek3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.ActionBar;

import java.util.ArrayList;


public class MascotasLiked extends AppCompatActivity {

    public Toolbar miActionBar;
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    public MascotaAdaptador adaptador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mascotas_liked);

        miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        miActionBar.setTitle("Title");
        setSupportActionBar(miActionBar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.petagram_back);
        actionBar.setDisplayHomeAsUpEnabled(true);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotasLike);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);

        inicializarListaMascotasFav();
        inicializarAdaptador();
    }
    private void inicializarAdaptador() {
        adaptador = new MascotaAdaptador(mascotas, this);
        listaMascotas.setAdapter(adaptador);

    }

    public void inicializarListaMascotasFav(){

        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota (R.drawable.petagram_dog_5, "Lucas", "1"));
        mascotas.add(new Mascota (R.drawable.petagram_dog_4, "Pedro", "2"));
        mascotas.add(new Mascota (R.drawable.petagram_dog_3, "Ramon", "3"));
        mascotas.add(new Mascota (R.drawable.petagram_dog_7, "Bernardo", "4"));
        mascotas.add(new Mascota (R.drawable.petagram_dog_1, "bonso", "5"));
    }
}
