package com.geopdfviewer.android;

import org.litepal.crud.LitePalSupport;

/**
 * 盘龙区兴趣点类
 * 用于记录由kml数据直接转换来的盘龙区兴趣点数据
 * 该表通过xh字段与plqzp表和plqyp表相连接
 * 该内容有对应的数据表
 *
 * @author  李正洋
 *
 * @since   1.4
 */
public class kmltest extends LitePalSupport{
    private String xh;
    private String dmbzmc;
    private String dmszxzqdm;
    private String dy;
    private float lat;
    private float longi;
    private String dmbzbzmc;
    private String szxzq;
    private String szdw;
    private String sccj;

    public kmltest(String xh, String dmbzmc) {
        this.xh = xh;
        this.dmbzmc = dmbzmc;
    }

    public kmltest() {
    }

    private String gg;
    private String zp;

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLongi() {
        return longi;
    }

    public void setLongi(float longi) {
        this.longi = longi;
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public String getDmbzmc() {
        return dmbzmc;
    }

    public void setDmbzmc(String dmbzmc) {
        this.dmbzmc = dmbzmc;
    }

    public String getDmszxzqdm() {
        return dmszxzqdm;
    }

    public void setDmszxzqdm(String dmszxzqdm) {
        this.dmszxzqdm = dmszxzqdm;
    }

    public String getDy() {
        return dy;
    }

    public void setDy(String dy) {
        this.dy = dy;
    }

    public String getDmbzbzmc() {
        return dmbzbzmc;
    }

    public void setDmbzbzmc(String dmbzbzmc) {
        this.dmbzbzmc = dmbzbzmc;
    }

    public String getSzxzq() {
        return szxzq;
    }

    public void setSzxzq(String szxzq) {
        this.szxzq = szxzq;
    }

    public String getSzdw() {
        return szdw;
    }

    public void setSzdw(String szdw) {
        this.szdw = szdw;
    }

    public String getSccj() {
        return sccj;
    }

    public void setSccj(String sccj) {
        this.sccj = sccj;
    }

    public String getGg() {
        return gg;
    }

    public void setGg(String gg) {
        this.gg = gg;
    }

    public String getZp() {
        return zp;
    }

    public void setZp(String zp) {
        this.zp = zp;
    }
}
