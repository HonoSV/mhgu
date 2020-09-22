package cn.th.mhgu.dao;

import cn.th.mhgu.pojo.GameMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameMapDao extends JpaRepository<GameMap, Integer> {
    @Query(value = "select map_name from game_map", nativeQuery = true)
    List<String> getAllMapName();

    @Query(value = "select pic_name from game_map where map_name = ?", nativeQuery = true)
    String getPicName(String name);
}
