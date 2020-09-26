package cn.th.mhgu.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "decorations")
public class Decorations {
    @Id
    @Column
    private int id;
    @Column(name = "decorations_name")
    private String decorationsName;
    @Column
    private int slot;
    @Column
    private int price;
    @Column(name = "system_a")
    private String systemA;
    @Column(name = "a_point")
    private String aPoint;
    @Column(name = "system_b")
    private String systemB;
    @Column(name = "b_point")
    private String bPoint;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDecorationsName() {
        return decorationsName;
    }

    public void setDecorationsName(String decorationsName) {
        this.decorationsName = decorationsName;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSystemA() {
        return systemA;
    }

    public void setSystemA(String systemA) {
        this.systemA = systemA;
    }

    public String getaPoint() {
        return aPoint;
    }

    public void setaPoint(String aPoint) {
        this.aPoint = aPoint;
    }

    public String getSystemB() {
        return systemB;
    }

    public void setSystemB(String systemB) {
        this.systemB = systemB;
    }

    public String getbPoint() {
        return bPoint;
    }

    public void setbPoint(String bPoint) {
        this.bPoint = bPoint;
    }
}
