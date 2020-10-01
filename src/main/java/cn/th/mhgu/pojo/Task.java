package cn.th.mhgu.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class Task {
    @Id
    @Column
    private int id;
    @Column
    private String level;
    @Column
    private String type;
    @Column(name = "task_name")
    private String taskName;
    @Column(name = "is_key")
    private String isKey;
    @Column(name = "game_map")
    private String gameMap;
    @Column
    private int time;
    @Column
    private String expend;
    @Column
    private String target;
    @Column
    private String gold;
    @Column
    private String hrp;
    @Column(name = "sub_target")
    private String subTarget;
    @Column(name = "sub_gold")
    private String subGold;
    @Column(name = "sub_hrp")
    private String subHrp;
    @Column(name = "is_cat")
    private String isCat;
    @Column(name = "is_bubble")
    private String isBubble;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getIsKey() {
        return isKey;
    }

    public void setIsKey(String isKey) {
        this.isKey = isKey;
    }

    public String getGameMap() {
        return gameMap;
    }

    public void setGameMap(String gameMap) {
        this.gameMap = gameMap;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getExpend() {
        return expend;
    }

    public void setExpend(String expend) {
        this.expend = expend;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getGold() {
        return gold;
    }

    public void setGold(String gold) {
        this.gold = gold;
    }

    public String getHrp() {
        return hrp;
    }

    public void setHrp(String hrp) {
        this.hrp = hrp;
    }

    public String getSubTarget() {
        return subTarget;
    }

    public void setSubTarget(String subTarget) {
        this.subTarget = subTarget;
    }

    public String getSubGold() {
        return subGold;
    }

    public void setSubGold(String subGold) {
        this.subGold = subGold;
    }

    public String getSubHrp() {
        return subHrp;
    }

    public void setSubHrp(String subHrp) {
        this.subHrp = subHrp;
    }

    public String getIsCat() {
        return isCat;
    }

    public void setIsCat(String isCat) {
        this.isCat = isCat;
    }

    public String getIsBubble() {
        return isBubble;
    }

    public void setIsBubble(String isBubble) {
        this.isBubble = isBubble;
    }
}
