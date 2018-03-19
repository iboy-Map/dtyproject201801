package com.geopdfviewer.android;

import org.litepal.crud.DataSupport;

import java.util.List;

/**
 * Created by 54286 on 2018/3/15.
 */

public class Trail extends DataSupport{
    private int id;
    private String ic;
    private String name;
    private String path;
    private long time;

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
