package cn.th.mhgu.controller;

import cn.th.mhgu.pojo.Decorations;
import cn.th.mhgu.pojo.DecorationsMaterial;
import cn.th.mhgu.service.decorations.DecorationsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DecorationsController {

    @Resource
    DecorationsService decorationsService;

    @GetMapping(value = "/decorations")
    public List<Decorations> find(String name) {
        return decorationsService.find(name);
    }

    @GetMapping(value = "/decorationsMaterial")
    public List<DecorationsMaterial> findMaterial(int id) {
        return decorationsService.findMaterial(id);
    }
}
