package com.lz.controller;

import com.lz.pojo.LineTrend;
import com.lz.pojo.NocvData;
import com.lz.Service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sound.sampled.Line;
import java.util.*;

@Controller
public class IndexController {

    @Autowired
    IndexService indexService;

    @RequestMapping("/toLine")
    public String toLine(){
        return "line";
    }

    @RequestMapping("/toPie")
    public String toPie(){
        return "pie";
    }

    @RequestMapping("/queryPie")
    @ResponseBody
    public List<NocvData> queryPieData() {
        List<NocvData> list = indexService.findDataPie();
        return list;
    }

    @RequestMapping("/queryLine")
    @ResponseBody
    public Map<String, List<Object>> queryLineData(){
        //1.查询所有数据
        List<LineTrend> list=indexService.findData();
        Collections.reverse(list);
        //2.封装数据
        List<Integer> confirmList=new ArrayList<>();
        List<Integer> isolationList=new ArrayList<>();
        List<Integer> cureList=new ArrayList<>();
        List<Integer> deadList=new ArrayList<>();
        List<Integer> similarList=new ArrayList<>();
        for (LineTrend data:list) {
            confirmList.add(data.getConfirm());
            isolationList.add(data.getIsolation());
            cureList.add(data.getCure());
            deadList.add(data.getDead());
            similarList.add(data.getSimilar());
        }

        //返回数据的格式容器map
        Map map=new HashMap();
        map.put( "confirmList",confirmList);
        map.put( "isolationList",isolationList);
        map.put( "cureList",cureList);
        map.put( "deadList",deadList);
        map.put( "similarList",similarList);

        return map;
    }

}
