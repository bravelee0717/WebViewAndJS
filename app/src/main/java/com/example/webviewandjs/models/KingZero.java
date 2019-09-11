package com.example.webviewandjs.models;

import java.io.Serializable;

/**
 * Created by LiYong on 2019-09-10.
 */
public class KingZero implements Serializable {
    private int resId;
    private String name;

    public KingZero(int resId, String name) {
        this.resId = resId;
        this.name = name;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
