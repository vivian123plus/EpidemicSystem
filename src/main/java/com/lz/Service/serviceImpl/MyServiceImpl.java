package com.lz.Service.serviceImpl;

import com.lz.DAO.MyDao;
import com.lz.Service.MyService;
import com.lz.pojo.Infector;
import com.lz.pojo.MyUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MyServiceImpl implements MyService {
    @Resource
    MyDao mydao;

    @Override
    public List<MyUser> scatter() {
        return mydao.scatter();
    }

    @Override
    public List<MyUser> bar() {
        return mydao.bar();
    }

    @Override
    public List<Infector> infectList() {
        return mydao.infectList();
    }
}
