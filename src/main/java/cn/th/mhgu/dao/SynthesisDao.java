package cn.th.mhgu.dao;

import cn.th.mhgu.pojo.Synthesis;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SynthesisDao extends JpaRepository<Synthesis, Integer> {
    List<Synthesis> findAllByTargetLike(String name);
}
