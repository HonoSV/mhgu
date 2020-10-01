package cn.th.mhgu.service.task.impl;

import cn.th.mhgu.dao.TaskDao;
import cn.th.mhgu.pojo.Task;
import cn.th.mhgu.service.task.TaskService;
import cn.th.mhgu.utils.MyUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Resource
    private TaskDao taskDao;

    @Override
    public List<Task> findTask(String level, String type, boolean isKey) {
        if (MyUtils.strIsEmpty(level))
            level = "村 1★";
        boolean typeIsNull = MyUtils.strIsEmpty(type) || "全部".equals(type);
        if (typeIsNull && !isKey)
            return taskDao.findAllByLevel(level);
        else if (!typeIsNull && !isKey)
            return taskDao.findAllByLevelAndType(level, type);
        else if (typeIsNull)
            return taskDao.findAllByLevelAndIsKeyNotNull(level);
        else
            return taskDao.findAllByLevelAndTypeAndIsKeyNotNull(level, type);
    }
}
