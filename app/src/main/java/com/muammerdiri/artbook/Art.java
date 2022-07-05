package com.muammerdiri.artbook;

import java.io.Serializable;

public class Art implements Serializable {
    int id;
    String name;

    public Art(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

