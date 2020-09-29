package cn.th.mhgu.service.melody.impl;

import cn.th.mhgu.dao.MelodyDao;
import cn.th.mhgu.pojo.Melody;
import cn.th.mhgu.service.melody.MelodyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MelodyServiceImpl implements MelodyService {
    @Resource
    private MelodyDao melodyDao;

    @Override
    public List<Melody> findAll() {
        return melodyDao.findAll();
    }
}
