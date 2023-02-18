package com.lz.DAO;

import com.lz.pojo.Infector;
import com.lz.pojo.MyUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*
持久层
*/
@Mapper
public interface MyDao {
    List<MyUser> scatter();

    List<MyUser> bar();

    List<Infector> infectList();
//           登录接口
//    @Param("user") 代表传参变量  变量名称
//    List<loginUser> login( @Param("user") loginUser user);

}
