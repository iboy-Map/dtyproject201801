package com.geopdfviewer.android;

import org.litepal.crud.DataSupport;

/**
 * Created by 54286 on 2018/3/15.
 */

public class POI  extends DataSupport {
    private int id;
    private String ic;
    private String name;
    private String POIC;
    private int photonum;
    private String description;
    private int tapenum;
    private float x;
    private float y;
    private String time;

    public String getPOIC() {
        return POIC;
    }

    public void setPOIC(String POIC) {
        this.POIC = POIC;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public int getPhotonum() {
        return photonum;
    }

    public void setPhotonum(int photonum) {
        this.photonum = photonum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTapenum() {
        return tapenum;
    }

    public void setTapenum(int tapenum) {
        this.tapenum = tapenum;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
