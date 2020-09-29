package cn.th.mhgu.controller;

import cn.th.mhgu.pojo.Competitive;
import cn.th.mhgu.service.competitive.CompetitiveService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class CompetitiveController {
    @Resource
    private CompetitiveService competitiveService;

    @GetMapping("/competitive")
    public List<Competitive> findAll() {
        return competitiveService.findAll();
    }

    @GetMapping("/competitiveReward")
    public Map<String, Object> findRewards(Integer id, String ids) {
        return competitiveService.findReward(id, ids);
    }
}
