package cn.th.mhgu.dao;

import cn.th.mhgu.pojo.Monster;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MonsterDao extends JpaRepository<Monster, Integer> {
    List<Monster> findByMonsterNameLike(String name);
}
