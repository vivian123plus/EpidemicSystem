package com.lz.DAO;

import com.lz.pojo.LineTrend;
import com.lz.pojo.NocvData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IndexDao {
    @Select("select * from tb_data order by createtime desc limit 7")
    List<LineTrend> findData();
    @Select("select * from tb_city")
    List<NocvData> findDataPie();
}
