package com.geopdfviewer.android;

import android.util.Log;

import java.util.Iterator;

/**
 * 叶地图类，类似于菜单项
 * 用于存储没有下一级地图的地图数据
 *
 * @author  李正洋
 *
 * @since   1.6
 */
public class MapItem extends MapComponent {
    private static final String TAG = "MapItem";
    private String position;
    private String name;
    private String uri;
    private String imguri;
    private int maptype;

    public MapItem(String position, String name, String uri, String imguri, int maptype) {
        this.position = position;
        this.name = name;
        this.uri = uri;
        this.imguri = imguri;
        this.maptype = maptype;
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }

    @Override
    public void print() {
        Log.w(TAG, "print: " + name + "\n"
                + "uri: " + uri + "\n"
        + "imguri: " + imguri + "\n"
        + "position: " + position + "\n"
        + "maptype: " + getMapTypeForString(maptype));
    }

    @Override
    public String getMapTypeForString(int maptype) {
        String mMaptype = "";
        switch (maptype){
            case EnumClass.ROOTMAP:
                mMaptype = "根地图";
                break;
            case EnumClass.FIRSTMAP:
                mMaptype = "第一层地图";
                break;
            case EnumClass.SECONDMAP:
                mMaptype = "第二层地图";
                break;
            case EnumClass.THIRDMAP:
                mMaptype = "第三层地图";
                break;
            case EnumClass.FORTHMAP:
                mMaptype = "第四层地图";
                break;
            case EnumClass.FIFTHMAP:
                mMaptype = "第五层地图";
                break;
            case EnumClass.LEAFMAP:
                mMaptype = "叶子地图";
                break;
        }
        return mMaptype;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public String getUri() {
        return uri;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getImgUri() {
        return imguri;
    }

    @Override
    public int getMapType() {
        return maptype;
    }
}
