package cn.th.mhgu.controller;

import cn.th.mhgu.pojo.Task;
import cn.th.mhgu.service.task.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TaskController {
    @Resource
    private TaskService taskService;

    @GetMapping("/task")
    public List<Task> findTask(String level, String type, boolean isKey) {
        return taskService.findTask(level, type, isKey);
    }
}
