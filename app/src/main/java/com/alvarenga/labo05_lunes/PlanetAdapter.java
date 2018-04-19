package com.alvarenga.labo05_lunes;

import android.content.Context;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class PlanetAdapter extends RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder>{
    Context aCtx;
    List<Planet> planetList;

    public PlanetAdapter(Context aCtx, List<Planet> planetList) {
        this.aCtx = aCtx;
        this.planetList = planetList;
    }

    @Override
    public PlanetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(aCtx);
        View v = inflater.inflate(R.layout.layout_listcard, null);
        return new PlanetViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PlanetViewHolder holder, int position) {
        holder.title.setText(planetList.get(position).getTitle());
        holder.description.setText(planetList.get(position).getDesc());
    }

    @Override
    public int getItemCount() {
        return planetList.size();
    }

    protected class PlanetViewHolder extends RecyclerView.ViewHolder {
        TextView title, description;
        public PlanetViewHolder(View itemView){
            super(itemView);
            title = itemView.findViewById(R.id.cardtitle);
            description = itemView.findViewById(R.id.carddesc);
        }
    }
}
 //Ciclo de vida de fragmento, de actividades; guardar
//Comunicación entre fragmentos, tabbed fragments