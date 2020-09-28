package cn.th.mhgu.service.decorations;

import cn.th.mhgu.pojo.Decorations;
import cn.th.mhgu.pojo.DecorationsMaterial;

import java.util.List;

public interface DecorationsService {
    List<Decorations> find(String name);
    List<DecorationsMaterial> findMaterial(int id);
    List<Decorations> findBySystemA(String name);
}
