package cn.th.mhgu.service.synthesis;

import cn.th.mhgu.pojo.Synthesis;

import java.util.List;

public interface SynthesisService {
    List<Synthesis> findByName(String name);
}
