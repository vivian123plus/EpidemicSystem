package com.lz.Service;

import com.lz.pojo.Infector;
import com.lz.pojo.MyUser;

import java.util.List;

public interface MyService {
    List<MyUser> scatter();

    List<MyUser> bar();

    List<Infector> infectList();
}
