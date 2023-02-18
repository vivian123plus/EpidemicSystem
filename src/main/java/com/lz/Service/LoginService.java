package com.lz.Service;

import com.lz.pojo.LoginUser;

import java.util.List;

public interface LoginService {
    List<LoginUser> login(LoginUser user);

    int register(LoginUser user);

    int delete(LoginUser user);

    List<LoginUser> userList();

    int delById(int id);

    LoginUser upList(Integer id);

    int updUser(LoginUser user);
}
