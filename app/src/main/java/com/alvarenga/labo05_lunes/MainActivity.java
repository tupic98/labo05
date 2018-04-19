package com.alvarenga.labo05_lunes;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Planet> pLanetList;
    RecyclerView recyclerView;
    PlanetAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pLanetList = filllist();

        recyclerView = findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManage = new LinearLayoutManager(this);
        adapter = new PlanetAdapter(this, pLanetList);
        recyclerView.setLayoutManager(linearLayoutManage);
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<Planet> filllist(){
        ArrayList<Planet> l = new ArrayList<>();
        String desc = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. ";
        l.add(new Planet(1,"Ella", desc));
        l.add(new Planet(1,"Ella contrataca", desc));
        l.add(new Planet(1,"El retorno de ella", desc));
        return l;
    }
}
