package cn.th.mhgu.dao;

import cn.th.mhgu.pojo.Decorations;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DecorationsDao extends JpaRepository<Decorations, Integer> {
    List<Decorations> findByDecorationsNameLikeOrSystemALikeOrSystemBLike(String name, String A, String B);
    List<Decorations> findByDecorationsNameLikeOrSystemALike(String name, String A);
    List<Decorations> findBySystemA(String name);
}
