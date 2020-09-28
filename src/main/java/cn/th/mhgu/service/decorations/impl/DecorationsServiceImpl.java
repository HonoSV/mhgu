package cn.th.mhgu.service.decorations.impl;

import cn.th.mhgu.dao.DecorationsDao;
import cn.th.mhgu.dao.DecorationsMaterialDao;
import cn.th.mhgu.pojo.Decorations;
import cn.th.mhgu.pojo.DecorationsMaterial;
import cn.th.mhgu.service.decorations.DecorationsService;
import cn.th.mhgu.utils.MyUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DecorationsServiceImpl implements DecorationsService {

    @Resource
    DecorationsDao decorationsDao;

    @Resource
    DecorationsMaterialDao decorationsMaterialDao;

    @Override
    public List<Decorations> find(String name) {
        List<Decorations> list;
        if (MyUtils.strIsEmpty(name))
            list = decorationsDao.findAll();
        else {
            String n = MyUtils.getLikeStr(name);
            list = decorationsDao.findByDecorationsNameLikeOrSystemALike(n, n);
        }
        if (!MyUtils.collectionIsEmpty(list))  {
            list.forEach(o -> {
                o.setSystemA(o.getSystemA() + " +" + o.getaPoint());
                if (!"---".equals(o.getSystemB()))
                    o.setSystemB(o.getSystemB() + " " + o.getbPoint());
            });
        }
        return list;
    }

    @Override
    public List<DecorationsMaterial> findMaterial(int id) {
        return decorationsMaterialDao.findByDecorationsId(id);
    }

    @Override
    public List<Decorations> findBySystemA(String name) {
        return decorationsDao.findBySystemA(name);
    }
}
