package com.lz.controller;

import com.lz.Service.MapService;
import com.lz.pojo.MapData;
import com.lz.Service.MapService;
import com.lz.util.AjaxResult;
import com.lz.pojo.MapData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MapController {
    @Autowired
    MapService mapservice;

    @RequestMapping("/mapDataList")
    @ResponseBody
    public AjaxResult mapDataList(){
        List<MapData> list = mapservice.mapDataList();
        if(list.size()>0){
            return AjaxResult.success("查询成功",list);
        }
        return AjaxResult.error("查询失败");
    }

    @RequestMapping("/mapDatanow")
    @ResponseBody
    public AjaxResult mapDatanow(){
        int i=mapservice.mapDatanow();
        if(i>0){
            return AjaxResult.success(i);
        }
        return AjaxResult.error();
    }

    @RequestMapping("/mapDatanoi")
    @ResponseBody
    public AjaxResult mapDatanoi(){
        int i=mapservice.mapDatanoi();
        if(i>0){
            return AjaxResult.success(i);
        }
        return AjaxResult.error();
    }

    @RequestMapping("/mapDatanow2")
    @ResponseBody
    public AjaxResult mapDatanow2(){
        int i=mapservice.mapDatanow2();
        if(i>0){
            return AjaxResult.success(i);
        }
        return AjaxResult.error();
    }

    @RequestMapping("/mapDatanoi2")
    @ResponseBody
    public AjaxResult mapDatanoi2(){
        int i=mapservice.mapDatanoi2();
        if(i>0){
            return AjaxResult.success(i);
        }
        return AjaxResult.error();
    }

    @RequestMapping("/dataList")
    @ResponseBody
    public AjaxResult dataList(){
        List<MapData> list = mapservice.dataList();
        if(list.size()>0){
            return AjaxResult.success("查询成功",list);
        }
        return AjaxResult.error("查询失败");
    }
    @RequestMapping("/mapDatayes1")
    @ResponseBody
    public AjaxResult mapDatayes1(){
        int i=mapservice.mapDatayes1();
        if(i>0){
            return AjaxResult.success(i);
        }
        return AjaxResult.error();
    }

    @RequestMapping("/mapDatayes2")
    @ResponseBody
    public AjaxResult mapDatayes2(){
        int i=mapservice.mapDatayes2();
        if(i>0){
            return AjaxResult.success(i);
        }
        return AjaxResult.error();
    }

    @RequestMapping("/mapDatayes3")
    @ResponseBody
    public AjaxResult mapDatayes3(){
        int i=mapservice.mapDatayes3();
        if(i>0){
            return AjaxResult.success(i);
        }
        return AjaxResult.error();
    }

    @RequestMapping("/mapDatayes4")
    @ResponseBody
    public AjaxResult mapDatayes4(){
        int i=mapservice.mapDatayes4();
        if(i>0){
            return AjaxResult.success(i);
        }
        return AjaxResult.error();
    }
}
