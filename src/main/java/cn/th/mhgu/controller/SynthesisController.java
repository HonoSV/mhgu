package cn.th.mhgu.controller;

import cn.th.mhgu.pojo.Synthesis;
import cn.th.mhgu.service.synthesis.SynthesisService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class SynthesisController {
    @Resource
    private SynthesisService synthesisService;

    @GetMapping(value = "/synthesis")
    public List<Synthesis> findByName(String name) {
        return synthesisService.findByName(name);
    }
}
