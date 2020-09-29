package cn.th.mhgu.controller;

import cn.th.mhgu.pojo.Skill;
import cn.th.mhgu.service.skill.SkillService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;
import java.io.*;
import java.util.List;

@RestController
public class SkillController {

    @Resource
    SkillService skillService;

    @GetMapping("/skill")
    public List<Skill> getSkill(String name) {
        return skillService.findSkill(name);
    }

//    @GetMapping("/pic")
//    public Object getPic() throws IOException {
//        FileInputStream fis = new FileInputStream("F:\\Users\\Nova\\IdeaProjects\\mhgu\\src\\main\\resources\\static\\pic\\metal\\dycp.png");
//        ByteArrayOutputStream bos = new ByteArrayOutputStream();
//        byte[] b = new byte[1024];
//        int len = -1;
//        while ((len = fis.read(b)) != -1) {
//            bos.write(b, 0, len);
//        }
//        byte[] fileByte = bos.toByteArray();
//        BASE64Encoder base64Encoder = new BASE64Encoder();
//        return base64Encoder.encode(fileByte);
//        return fileByte;
//
//    }
}
