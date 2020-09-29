package cn.th.mhgu.controller;

import cn.th.mhgu.pojo.Melody;
import cn.th.mhgu.service.melody.MelodyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class MelodyController {
    @Resource
    private MelodyService melodyService;

    @GetMapping(value = "/melody")
    public List<Melody> findAll() {
        return melodyService.findAll();
    }
}
