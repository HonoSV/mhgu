package cn.th.mhgu.dao;

import cn.th.mhgu.pojo.CompetitiveReward;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompetitiveRewardDao extends JpaRepository<CompetitiveReward, Integer> {
    List<CompetitiveReward> findAllByCompetitiveId(int id);
}
