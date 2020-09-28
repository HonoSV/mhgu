package cn.th.mhgu.service.gameMap;

import cn.th.mhgu.pojo.GameMap;

import java.util.List;


public interface GameMapService {
    List<String> getAllMapName();
    String getPicName(String name);
    String changePic();
    List<GameMap> findAll();
}
