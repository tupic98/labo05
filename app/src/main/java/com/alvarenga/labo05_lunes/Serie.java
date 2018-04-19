package com.alvarenga.labo05_lunes;

public class Serie {
    private int id;
    private String title, desc, caps;


    public Serie(int id, String title, String desc, String caps) {
        this.desc = desc;
        this.id = id;
        this.title = title;
        this.caps = caps;
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

    public String getCaps() {
        return caps;
    }
}

