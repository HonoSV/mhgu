package cn.th.mhgu.service.gameMap;

import java.util.List;


public interface GameMapService {
    List<String> getAllMapName();
    String getPicName(String name);
    String changePic();
}
