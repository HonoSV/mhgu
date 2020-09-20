package cn.th.mhgu.service.skill.impl;


import cn.th.mhgu.dao.SkillDao;
import cn.th.mhgu.pojo.Skill;
import cn.th.mhgu.service.skill.SkillService;
import cn.th.mhgu.utils.MyUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SkillServiceImpl implements SkillService {

    @Resource
    SkillDao skillDao;

    @Override
    public List<Skill> findSkill(String name) {

        // TODO delete
        System.out.println("200 OK");
        System.out.println("name:[" + name +"]");

        if (MyUtils.strIsEmpty(name))
            return skillDao.findAll();
        else
            return skillDao.findBySkillNameLikeOrSkillSystemNameLike(MyUtils.getLikeStr(name), MyUtils.getLikeStr(name));

    }

}
