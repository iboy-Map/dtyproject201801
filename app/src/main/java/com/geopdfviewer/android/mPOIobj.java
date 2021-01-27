package com.geopdfviewer.android;


/**
 * 兴趣点缓存类
 * 该类用于兴趣点表的缓存
 * 相比于MPOI类多存储了描述，录音和照片数据
 *
 * @author  李正洋
 *
 * @since   1.1
 *
 * Created by 54286 on 2018/3/20.
 */
public class mPOIobj {
    private String m_POIC;
    private float m_X;
    private float m_Y;
    private String m_time;
    private int m_tapenum;
    private int m_photonum;
    private int m_videonum;
    private String m_name;
    private String m_description;

    public mPOIobj(String m_POIC, String m_name) {
        this.m_POIC = m_POIC;
        this.m_name = m_name;
    }

    public mPOIobj(String m_POIC, float m_X, float m_Y, String m_time, int m_tapenum, int m_photonum, int m_videonum, String m_name, String m_description) {
        this.m_POIC = m_POIC;
        this.m_X = m_X;
        this.m_Y = m_Y;
        this.m_time = m_time;
        this.m_tapenum = m_tapenum;
        this.m_photonum = m_photonum;
        this.m_name = m_name;
        this.m_description = m_description;
        this.m_videonum = m_videonum;
    }

    public int getM_videonum() {
        return m_videonum;
    }

    public void setM_videonum(int m_videonum) {
        this.m_videonum = m_videonum;
    }

    public String getM_POIC() {
        return m_POIC;
    }

    public void setM_POIC(String m_POIC) {
        this.m_POIC = m_POIC;
    }

    public float getM_X() {
        return m_X;
    }

    public void setM_X(float m_X) {
        this.m_X = m_X;
    }

    public float getM_Y() {
        return m_Y;
    }

    public void setM_Y(float m_Y) {
        this.m_Y = m_Y;
    }

    public String getM_time() {
        return m_time;
    }

    public void setM_time(String m_time) {
        this.m_time = m_time;
    }

    public int getM_tapenum() {
        return m_tapenum;
    }

    public void setM_tapenum(int m_tapenum) {
        this.m_tapenum = m_tapenum;
    }

    public int getM_photonum() {
        return m_photonum;
    }

    public void setM_photonum(int m_photonum) {
        this.m_photonum = m_photonum;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public String getM_description() {
        return m_description;
    }

    public void setM_description(String m_description) {
        this.m_description = m_description;
    }
}
