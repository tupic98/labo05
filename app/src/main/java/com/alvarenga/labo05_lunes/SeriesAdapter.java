package com.alvarenga.labo05_lunes;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class SeriesAdapter extends RecyclerView.Adapter<SeriesAdapter.SerieViewHolder>{
    Context aCtx;
    List<Serie> serieList;
    public static Button btn;

    public SeriesAdapter(Context aCtx, List<Serie> serieList) {
        this.aCtx = aCtx;
        this.serieList = serieList;
    }

    @Override
    public SerieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(aCtx);
        View v = inflater.inflate(R.layout.layout_listcard, null);
        return new SerieViewHolder(v);
    }

    @Override
    public void onBindViewHolder(SerieViewHolder holder, final int position) {
        holder.title.setText(serieList.get(position).getTitle());
        //holder.description.setText(serieList.get(position).getDesc());
        holder.img.setImageResource(serieList.get(position).getId());
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), serieList.get(position).getDesc(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return serieList.size();
    }

    protected class SerieViewHolder extends RecyclerView.ViewHolder {
        TextView title, description;
        ImageView img;
        CardView card;
        public SerieViewHolder(View itemView){
            super(itemView);
            title = itemView.findViewById(R.id.cardtitle);
            img = itemView.findViewById(R.id.cardimage);
            btn = itemView.findViewById(R.id.cardbutton);
        }
    }
}
 //Ciclo de vida de fragmento, de actividades; guardar
//Comunicación entre fragmentos, tabbed fragments