package com.lz.Service;

import com.lz.pojo.LineTrend;
import com.lz.pojo.NocvData;

import java.util.List;

public interface IndexService {
    List<LineTrend> findData();
    List<NocvData> findDataPie();
}
