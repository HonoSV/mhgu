package cn.th.mhgu.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "competitive")
public class Competitive {
    @Id
    @Column
    private int id;
    @Column(name = "is_cat")
    private Integer isCat;
    @Column(name = "task_name")
    private String taskName;
    @Column(name = "game_map")
    private String gameMap;
    @Column
    private int gold;
    @Column(name = "limit_player")
    private int limitPlayer;
    @Column(name = "s_time")
    private String sTime;
    @Column(name = "a_time")
    private String aTime;
    @Column(name = "b_time")
    private String bTime;
    @Column(name = "monster_name")
    private String monsterName;
    @Column(name = "monster_ids")
    private String monsterIds;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getIsCat() {
        return isCat;
    }

    public void setIsCat(Integer isCat) {
        this.isCat = isCat;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getGameMap() {
        return gameMap;
    }

    public void setGameMap(String gameMap) {
        this.gameMap = gameMap;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getLimitPlayer() {
        return limitPlayer;
    }

    public void setLimitPlayer(int limitPlayer) {
        this.limitPlayer = limitPlayer;
    }

    public String getsTime() {
        return sTime;
    }

    public void setsTime(String sTime) {
        this.sTime = sTime;
    }

    public String getaTime() {
        return aTime;
    }

    public void setaTime(String aTime) {
        this.aTime = aTime;
    }

    public String getbTime() {
        return bTime;
    }

    public void setbTime(String bTime) {
        this.bTime = bTime;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    public String getMonsterIds() {
        return monsterIds;
    }

    public void setMonsterIds(String monsterIds) {
        this.monsterIds = monsterIds;
    }
}
