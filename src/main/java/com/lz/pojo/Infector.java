package com.lz.pojo;

public class Infector {
    String id;
    String province;
    String nowInfect;
    String noInfect;

    public Infector() {
    }

    public Infector(String id, String province, String nowInfect, String noInfect) {
        this.id = id;
        this.province = province;
        this.nowInfect = nowInfect;
        this.noInfect = noInfect;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getNowInfect() {
        return nowInfect;
    }

    public void setNowInfect(String nowInfect) {
        this.nowInfect = nowInfect;
    }

    public String getNoInfect() {
        return noInfect;
    }

    public void setNoInfect(String noInfect) {
        this.noInfect = noInfect;
    }
}
