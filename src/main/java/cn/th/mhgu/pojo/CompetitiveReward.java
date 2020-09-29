package cn.th.mhgu.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "competitive_reward")
public class CompetitiveReward {
    @Id
    @Column
    private int id;
    @Column(name = "competitive_id")
    private int competitiveId;
    @Column
    private String reward;
    @Column
    private int num;
    @Column
    private String rate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCompetitiveId() {
        return competitiveId;
    }

    public void setCompetitiveId(int competitiveId) {
        this.competitiveId = competitiveId;
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

}
