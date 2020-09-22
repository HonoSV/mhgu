package cn.th.mhgu.service.gameMap.impl;

import cn.th.mhgu.dao.GameMapDao;
import cn.th.mhgu.service.gameMap.GameMapService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GameMapServiceImpl implements GameMapService {
    @Resource
    private GameMapDao gameMapDao;

    @Override
    public List<String> getAllMapName() {
        return gameMapDao.getAllMapName();
    }

    @Override
    public String getPicName(String name) {
        return gameMapDao.getPicName(name);
    }
}
