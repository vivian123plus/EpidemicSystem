package com.lz.pojo;

public class LoginUser {
    //    与试图中标签内容一致
    private int id;
    private String username;
    private String password;
    private String email;
    private String tel;
    private String birth;

    public LoginUser(int id, String username, String password, String email, String tel, String birth) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.tel = tel;
        this.birth = birth;
    }

    public LoginUser() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
}
