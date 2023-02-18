package com.lz.Service.serviceImpl;

import com.lz.Service.LoginService;
import com.lz.pojo.LoginUser;
import com.lz.DAO.LoginDAO;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

//业务处理层
@Service
@MapperScan(basePackages = {"com.lz.DAO"})
public class LoginServiceImpl implements LoginService {
    @Resource
    LoginDAO loginDAO;

    @Override
    public List<LoginUser> login(LoginUser user) {
        return loginDAO.login(user);
    }

    @Override
    public int register(LoginUser user) {
        return loginDAO.register(user);
    }

    @Override
    public int delete(LoginUser user) {
        return loginDAO.delete(user);
    }

    @Override
    public List<LoginUser> userList() {
        return loginDAO.userList();
    }

    @Override
    public int delById(int id) {
        return loginDAO.delById(id);
    }

//    @Override
//    public int upList(int id) {
//        return loginDAO.upList(id);
//    }

    @Override
    public LoginUser upList(Integer id) {
        return loginDAO.upList(id);
    }

    @Override
    public int updUser(LoginUser user) {
        return loginDAO.updUser(user);
    }


}
