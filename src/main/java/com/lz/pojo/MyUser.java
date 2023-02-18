package com.lz.pojo;

public class MyUser {
    //与试图标签中的name属性值一致
    private String province;
    private int infect1;
    private int infect2;

    public MyUser() {
    }

    public MyUser(String province, int infect1, int infect2) {
        this.province = province;
        this.infect1 = infect1;
        this.infect2 = infect2;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getInfect1() {
        return infect1;
    }

    public void setInfect1(int infect1) {
        this.infect1 = infect1;
    }

    public int getInfect2() {
        return infect2;
    }

    public void setInfect2(int infect2) {
        this.infect2 = infect2;
    }


}
