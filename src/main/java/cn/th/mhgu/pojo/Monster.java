package cn.th.mhgu.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "monster")
public class Monster {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "monster_name")
    private String monsterName;
    @Column
    private String icon;
    @Column
    private String fleshy;
    @Column
    private String anti;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getFleshy() {
        return fleshy;
    }

    public void setFleshy(String fleshy) {
        this.fleshy = fleshy;
    }

    public String getAnti() {
        return anti;
    }

    public void setAnti(String anti) {
        this.anti = anti;
    }
}
