package cn.th.mhgu.service.competitive;

import cn.th.mhgu.pojo.Competitive;

import java.util.List;
import java.util.Map;

public interface CompetitiveService {

    List<Competitive> findAll();

    Map<String, Object> findReward(Integer id, String ids);

}
