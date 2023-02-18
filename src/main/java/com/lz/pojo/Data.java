package com.lz.pojo;

public class Data {
    private String province;
    private int nownum;

    public Data(String province, int now) {
        this.province = province;
        this.nownum = now;
    }

    public Data() {
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getNownum() {
        return nownum;
    }

    public void setNownum(int nownum) {
        this.nownum = nownum;
    }

}
