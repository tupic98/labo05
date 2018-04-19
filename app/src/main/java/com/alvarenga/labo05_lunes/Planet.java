package com.alvarenga.labo05_lunes;

public class Planet {
    private int id;
    private String title, desc;


    public Planet(int id, String title, String desc) {
        this.desc = desc;
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public String getTitle() {
        return title;
    }
}

