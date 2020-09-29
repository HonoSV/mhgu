package cn.th.mhgu.service.monster.impl;

import cn.th.mhgu.dao.MonsterDao;
import cn.th.mhgu.pojo.Monster;
import cn.th.mhgu.service.monster.MonsterService;
import cn.th.mhgu.utils.MyUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class MonsterServiceImpl implements MonsterService {

    @Resource
    MonsterDao monsterDao;

    @Override
    public List<Monster> find(String name) {
        if (MyUtils.strIsEmpty(name))
            return monsterDao.findAll();
        else
            return monsterDao.findByMonsterNameLike(MyUtils.getLikeStr(name));
    }

    @Override
    public List<Monster> findByIds(String ids) {
        String[] idArray = ids.split(",");
        List<Integer> idList = new ArrayList<>();
        for (String id : idArray) {
            idList.add(Integer.parseInt(id));
        }
        return monsterDao.findAllById(idList);
    }
}
