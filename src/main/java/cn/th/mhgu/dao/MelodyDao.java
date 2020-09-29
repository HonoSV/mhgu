package cn.th.mhgu.dao;

import cn.th.mhgu.pojo.Melody;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MelodyDao extends JpaRepository<Melody, Integer> {
}
