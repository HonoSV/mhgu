package cn.th.mhgu.service.monster;

import cn.th.mhgu.pojo.Monster;

import java.util.List;

public interface MonsterService {

    List<Monster> find(String name);
    List<Monster> findByIds(String ids);

}
