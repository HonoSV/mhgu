package cn.th.mhgu.service.decorations;

import cn.th.mhgu.pojo.Decorations;
import cn.th.mhgu.pojo.DecorationsMaterial;

import java.util.List;

public interface DecorationsService {
    public List<Decorations> find(String name);
    public List<DecorationsMaterial> findMaterial(int id);
}
