package com.barto.petagramweek3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.ActionBar;


public class MascotasLiked extends AppCompatActivity {

    public Toolbar miActionBar;

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
    }
}
