package com.lz.DAO;

import com.lz.pojo.LoginUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LoginDAO {
    List<LoginUser> login(@Param("user") LoginUser user);

    int register(@Param("user") LoginUser user);

    int delete(@Param("user") LoginUser user);

    List<LoginUser> userList();
    //delById与mapper中的标签要一致 函数名=标签id
    int delById(@Param("id") Integer id);

    LoginUser upList(@Param("id") Integer id);

    int updUser(@Param("user") LoginUser user);
}
