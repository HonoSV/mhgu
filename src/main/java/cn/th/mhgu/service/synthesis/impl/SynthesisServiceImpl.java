package cn.th.mhgu.service.synthesis.impl;

import cn.th.mhgu.dao.SynthesisDao;
import cn.th.mhgu.pojo.Synthesis;
import cn.th.mhgu.service.synthesis.SynthesisService;
import cn.th.mhgu.utils.MyUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SynthesisServiceImpl implements SynthesisService {
    @Resource
    private SynthesisDao synthesisDao;

    @Override
    public List<Synthesis> findByName(String name) {
        if (MyUtils.strIsEmpty(name))
            return synthesisDao.findAll();
        else
            return synthesisDao.findAllByTargetLike(MyUtils.getLikeStr(name));
    }
}
