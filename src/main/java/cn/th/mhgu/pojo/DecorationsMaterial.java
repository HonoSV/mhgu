package cn.th.mhgu.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "decorations_material")
public class DecorationsMaterial {
    @Id
    @Column
    private int id;
    @Column(name = "decorations_id")
    private int decorationsId;
    @Column
    private String material;
    @Column
    private int num;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDecorationsId() {
        return decorationsId;
    }

    public void setDecorationsId(int decorationsId) {
        this.decorationsId = decorationsId;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
