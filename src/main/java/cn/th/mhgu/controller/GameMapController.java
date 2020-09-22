package cn.th.mhgu.controller;

import cn.th.mhgu.service.gameMap.GameMapService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class GameMapController {
    @Resource
    private GameMapService gameMapService;

    @GetMapping("/mapName")
    public List<String> getAllMapName() {
        return gameMapService.getAllMapName();
    }

    @GetMapping("/picName")
    public String getPicName(String name) {
        return gameMapService.getPicName(name);
    }
}
