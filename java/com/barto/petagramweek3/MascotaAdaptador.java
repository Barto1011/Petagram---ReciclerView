package com.barto.petagramweek3;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by brayhancriollo on 8/19/16.
 */
public class MascotaAdaptador  extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder>{

    ArrayList<Mascota> mascotaArrayList;
    Activity activity;
    public int a;

    public MascotaAdaptador(ArrayList<Mascota> mascotaArrayList, Activity activity){
        this.mascotaArrayList = mascotaArrayList;
        this.activity = activity;
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_contacto, parent, false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MascotaViewHolder holder, int position) {
        final Mascota mascota = mascotaArrayList.get(position);
        holder.imFotoCV.setImageResource(mascota.getFoto());
        holder.tvNombreMascotaCV.setText(mascota.getNombre());
        holder.tvRankingMascCV.setText(mascota.getRanking());

        holder.imFotoCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity, "Mascota llamada "+mascota.getNombre(),
                        Toast.LENGTH_LONG).show();
            }});

        holder.btnBoneLikeCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(mascota.getRanking());
                a = a + 1;
                mascota.setRanking(String.valueOf(a));
                Toast.makeText(activity, " Le diste LIKE a "+mascota.getNombre()
                        +" Ranking "+mascota.getRanking(),
                        Toast.LENGTH_LONG).show();
            }});
    }

    @Override
    public int getItemCount() {
        return mascotaArrayList.size();
    }


    public static class MascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView imFotoCV;
        private TextView tvNombreMascotaCV;
        private TextView tvRankingMascCV;
        private ImageButton btnBoneLikeCV;

        public MascotaViewHolder(View itemView) {
            super(itemView);

            imFotoCV            = (ImageView) itemView.findViewById(R.id.imgFotoCV);
            btnBoneLikeCV       = (ImageButton) itemView.findViewById(R.id.btnBoneLikeCV);
            tvNombreMascotaCV   = (TextView) itemView.findViewById(R.id.tvNombreMascotaCV);
            tvRankingMascCV     = (TextView) itemView.findViewById(R.id.tvRankingMascCV);
        }
    }
}
