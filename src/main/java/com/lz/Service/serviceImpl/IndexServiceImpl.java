package com.lz.Service.serviceImpl;

import com.lz.DAO.IndexDao;
import com.lz.pojo.LineTrend;
import com.lz.pojo.NocvData;
import com.lz.Service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IndexServiceImpl implements IndexService {
    @Resource
    IndexDao indexDao;

    @Override
    public List<LineTrend> findData() {
        List<LineTrend> list=indexDao.findData();
        return list;
    }

    @Override
    public List<NocvData> findDataPie() {
        List<NocvData> list = indexDao.findDataPie();
        return list;
    }
}
