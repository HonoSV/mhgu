package cn.th.mhgu.service.skill;

import cn.th.mhgu.pojo.Skill;

import java.util.List;


public interface SkillService {

    List<Skill> findSkill(String name);

}
