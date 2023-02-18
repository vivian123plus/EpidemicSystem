package com.lz.controller;
import com.lz.Service.LoginService;
import com.lz.Service.MyService;
import com.lz.pojo.LoginUser;
import com.lz.pojo.MyUser;
import com.lz.util.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

//控制层
@Controller
public class LoginController {
    @Autowired
    LoginService loginService;
    //    与前端请求一致
    @RequestMapping("/login")
    public ModelAndView login(LoginUser user){
        List<LoginUser> list=loginService.login(user);
        ModelAndView modelAndView = new ModelAndView();
        if(list.size()>0){
            modelAndView.setViewName("welcome");
            modelAndView.addObject("id",list.get(0).getId());
            modelAndView.addObject("username",list.get(0).getUsername());
            return modelAndView;
        }
        return modelAndView;
    }
    @RequestMapping("/useradd")
    public String register(LoginUser user){
        int i=loginService.register(user);
        if(i>0){
            return "redirect:/static/login.html";
        }
        else{
            return "redirect:/static/register.html";
        }
    }
    @RequestMapping("/userList")
//    如果是Ajex访问的必须加上
    @ResponseBody
    public AjaxResult userList(){
        List<LoginUser> list = loginService.userList();
        if(list.size()>0){
            return AjaxResult.success("查询成功",list);
        }
        return AjaxResult.error();
    }
    @RequestMapping("/upList")
    public ModelAndView upList(int id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("update");
        modelAndView.addObject(id);
        return modelAndView;
    }
    @RequestMapping("/updGet")
    @ResponseBody
    public AjaxResult updGet(Integer id){
        LoginUser user =loginService.upList(id);
        if(user!=null){
            return AjaxResult.success("查询成功",user);
        }
        return AjaxResult.error("查询失败");
    }
    @RequestMapping("updUser")
    public ModelAndView updUser(LoginUser user){
        int i=loginService.updUser(user);
        ModelAndView modelAndView = new ModelAndView();
        if(i>0){
            modelAndView.addObject("code",2300);
            modelAndView.setViewName("redirect:/static/login.html");
            return modelAndView;
        }
        return null;
    }

//    lz function
    @RequestMapping("/success")
    public String success(){
        return "success";
    }

}
