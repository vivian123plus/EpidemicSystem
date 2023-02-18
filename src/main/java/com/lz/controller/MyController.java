package com.lz.controller;

import com.lz.Service.MyService;
import com.lz.pojo.Infector;
import com.lz.pojo.MyUser;
import com.lz.util.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    MyService myService;
    //    my function
    @RequestMapping("/scatterSuccess")
    public String scatterSuccess(){
        return "scatterSuccess";
    }
    @RequestMapping("/scatter")
    @ResponseBody
    public AjaxResult scatter(){
        List<MyUser> list = myService.scatter();
        if(list.size()>0){
            return AjaxResult.success("查询成功",list);
        }
        return AjaxResult.error();
    }
    @RequestMapping("/BarSuccess")
    public String BarSuccess(){
        return "BarSuccess";
    }
    @RequestMapping("/bar")
    @ResponseBody
    public AjaxResult bar(){
        List<MyUser> list = myService.bar();
        if(list.size()>0){
            return AjaxResult.success("查询成功",list);
        }
        return AjaxResult.error();
    }
    @RequestMapping("/infectList")
    @ResponseBody
    public AjaxResult infectList(){
        List<Infector>  list=myService.infectList();
        if(list.size()>0){
            return AjaxResult.success(list);
        }
        return AjaxResult.error();
    }
}
