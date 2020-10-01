package cn.th.mhgu.dao;

import cn.th.mhgu.pojo.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TaskDao extends JpaRepository<Task, Integer> {
    List<Task> findAllByLevelAndTypeAndIsKeyNotNull(String level, String type);
    List<Task> findAllByLevelAndType(String level, String type);
    List<Task> findAllByLevel(String level);
    List<Task> findAllByLevelAndIsKeyNotNull(String level);
    @Query(value = "select level from task group by level", nativeQuery = true)
    List<String> getAllLevel();
    @Query(value = "select type from task group by type", nativeQuery = true)
    List<String> getAllType();
}
