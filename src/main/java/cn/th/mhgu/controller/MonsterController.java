package cn.th.mhgu.controller;

import cn.th.mhgu.pojo.Monster;
import cn.th.mhgu.service.monster.MonsterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class MonsterController {
    @Resource
    MonsterService monsterService;

    @GetMapping("/monster")
    public List<Monster> find(String name) {
        return monsterService.find(name);
    }
}
