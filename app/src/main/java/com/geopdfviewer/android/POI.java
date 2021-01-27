package com.geopdfviewer.android;

import org.litepal.crud.LitePalSupport;

/**
 * 兴趣点类
 * 用于记录兴趣点内容
 *
 * @author  李正洋
 *
 * @since   1.3
 *
 * Created by 54286 on 2018/3/15.
 */

public class POI  extends LitePalSupport {
    private int id;
    private String ic;
    private String name;
    private String poic;
    private String type;
    private int photonum;
    private String description;
    private int tapenum;
    private int vedionum;
    private float x;
    private float y;
    private String time;

    public int getVedionum() {
        return vedionum;
    }

    public void setVedionum(int vedionum) {
        this.vedionum = vedionum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPoic() {
        return poic;
    }

    public void setPoic(String poic) {
        this.poic = poic;
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
