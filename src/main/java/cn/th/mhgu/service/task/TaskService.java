package cn.th.mhgu.service.task;

import cn.th.mhgu.pojo.Task;

import java.util.List;

public interface TaskService {
    List<Task> findTask(String level, String type, boolean isKey);
}
