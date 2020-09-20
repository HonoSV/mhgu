package cn.th.mhgu.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "skill")
public class Skill {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "skill_name")
    private String skillName;
    @Column(name = "skill_system_name")
    private String skillSystemName;
    @Column(name = "point")
    private int point;
    @Column(name = "description")
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillSystemName() {
        return skillSystemName;
    }

    public void setSkillSystemName(String skillSystemName) {
        this.skillSystemName = skillSystemName;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
