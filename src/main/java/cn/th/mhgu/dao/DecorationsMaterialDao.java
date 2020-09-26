package cn.th.mhgu.dao;

import cn.th.mhgu.pojo.DecorationsMaterial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DecorationsMaterialDao extends JpaRepository<DecorationsMaterial, Integer> {
    List<DecorationsMaterial> findByDecorationsId(int id);

}
