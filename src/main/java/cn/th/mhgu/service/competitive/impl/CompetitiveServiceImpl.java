package cn.th.mhgu.service.competitive.impl;

import cn.th.mhgu.dao.CompetitiveDao;
import cn.th.mhgu.dao.CompetitiveRewardDao;
import cn.th.mhgu.pojo.Competitive;
import cn.th.mhgu.pojo.CompetitiveReward;
import cn.th.mhgu.service.competitive.CompetitiveService;
import cn.th.mhgu.service.monster.MonsterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CompetitiveServiceImpl implements CompetitiveService {
    @Resource
    private CompetitiveDao competitiveDao;
    @Resource
    private CompetitiveRewardDao competitiveRewardDao;
    @Resource
    private MonsterService monsterService;

    @Override
    public List<Competitive> findAll() {
        return competitiveDao.findAll();
    }

    @Override
    public Map<String, Object> findReward(Integer id, String ids) {
        Map<String, Object> map = new HashMap<>();
        map.put("monsterPic", monsterService.findByIds(ids));
        map.put("rewards", competitiveRewardDao.findAllByCompetitiveId(id));
        return map;
    }
}
