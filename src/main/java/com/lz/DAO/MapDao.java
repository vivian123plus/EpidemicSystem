package com.lz.DAO;

import com.lz.pojo.MapData;
import com.lz.pojo.MapData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MapDao {
    List<MapData> mapDataList();

    int mapDatanow();

    int mapDatanoi();

    int mapDatanow2();

    int mapDatanoi2();

    List<MapData> dataList();
    int mapDatayes1();

    int mapDatayes2();

    int mapDatayes3();

    int mapDatayes4();
}
