package com.lz.Service.serviceImpl;

import com.lz.DAO.MapDao;
import com.lz.Service.MapService;
import com.lz.pojo.MapData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MapServiceImpl implements MapService {
    @Resource
    MapDao dao;

    @Override
    public List<MapData> mapDataList() {
        return dao.mapDataList();
    }

    @Override
    public int mapDatanow() {
        return dao.mapDatanow();
    }

    @Override
    public int mapDatanoi() {
        return dao.mapDatanoi();
    }

    @Override
    public int mapDatanow2() {
        return dao.mapDatanow2();
    }

    @Override
    public int mapDatanoi2() {
        return dao.mapDatanoi2();
    }

    @Override
    public List<MapData> dataList() {
        return dao.dataList();
    }
    @Override
    public int mapDatayes1() {
        return dao.mapDatayes1();
    }

    @Override
    public int mapDatayes2() {
        return dao.mapDatayes2();
    }

    @Override
    public int mapDatayes3() {
        return dao.mapDatayes3();
    }

    @Override
    public int mapDatayes4() {
        return dao.mapDatayes4();
    }
}
