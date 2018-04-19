package com.alvarenga.labo05_lunes;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Serie> serieList;
    RecyclerView recyclerView;
    SeriesAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        serieList = filllist();

        recyclerView = findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManage = new LinearLayoutManager(this);
        adapter = new SeriesAdapter(this, serieList);
        recyclerView.setLayoutManager(linearLayoutManage);
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<Serie> filllist(){
        ArrayList<Serie> l = new ArrayList<>();
        String[] titles = getResources().getStringArray(R.array.SeriesTitle);
        String[] desc = getResources().getStringArray(R.array.SeriesDesc);
        String[] caps = getResources().getStringArray(R.array.SeriesCaps);
        TypedArray img = getResources().obtainTypedArray(R.array.Seriesimg);
        for(int i = 0; i < titles.length; i++){
            l.add(new Serie(img.getResourceId(i, -1), titles[i], desc[i], caps[i]));
        }
        /*l.add(new Serie(1,"Ella", desc));
        l.add(new Serie(1,"Ella contrataca", desc));
        l.add(new Serie(1,"El retorno de ella", desc));*/
        return l;
    }
}
