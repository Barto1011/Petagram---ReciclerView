package com.barto.petagramweek3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotaArrayList;
    private RecyclerView listaMascotas;
    private Toolbar miActionBarLiked;
    private ImageView tbStartActionTBM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);
        tbStartActionTBM    = (ImageView) findViewById(R.id.tbStartActionTBM);
        miActionBarLiked = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBarLiked);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);


        tbStartActionTBM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Actividad_Likes",
                        Toast.LENGTH_LONG).show();
                Intent i = new  Intent(MainActivity.this, MascotasLiked.class);
                startActivity(i);
            }});

        cargarMascotas();
        inicAdapter();
    }

    public void cargarMascotas(){
            mascotaArrayList = new ArrayList<Mascota>();
            mascotaArrayList.add(new Mascota(R.drawable.petagram_dog_7, "Bernardo", "4"));
            mascotaArrayList.add(new Mascota(R.drawable.petagram_dog_2, "Zeus","5"));
            mascotaArrayList.add(new Mascota(R.drawable.petagram_dog_3, "Ramon","4"));
            mascotaArrayList.add(new Mascota(R.drawable.petagram_dog_1, "Bonso","3"));
            mascotaArrayList.add(new Mascota(R.drawable.petagram_dog_5, "Lucas","2"));
            mascotaArrayList.add(new Mascota(R.drawable.petagram_dog_6, "Robotin","1"));
    }

    public void inicAdapter(){
        MascotaAdaptador adp = new MascotaAdaptador(mascotaArrayList, this);
        listaMascotas.setAdapter(adp);
    }
}
