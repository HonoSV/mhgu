package cn.th.mhgu.dao;

import cn.th.mhgu.pojo.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SkillDao extends JpaRepository<Skill, Integer> {
    List<Skill> findBySkillNameLikeOrSkillSystemNameLike(String name, String systemName);
}
