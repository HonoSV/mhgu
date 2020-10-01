package cn.th.mhgu.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "melody")
public class Melody {
    @Id
    @Column
    private int id;
    @Column
    private String melody;
    @Column
    private String effect;
    @Column
    private String time;
    @Column(name = "enhance_time")
    private String enhanceTime;
    @Column(name = "again_effect")
    private String againEffect;
    @Column(name = "again_time")
    private String againTime;
    @Column(name = "again_enhance_time")
    private String againEnhanceTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMelody() {
        return melody;
    }

    public void setMelody(String melody) {
        this.melody = melody;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getEnhanceTime() {
        return enhanceTime;
    }

    public void setEnhanceTime(String enhanceTime) {
        this.enhanceTime = enhanceTime;
    }

    public String getAgainEffect() {
        return againEffect;
    }

    public void setAgainEffect(String againEffect) {
        this.againEffect = againEffect;
    }

    public String getAgainTime() {
        return againTime;
    }

    public void setAgainTime(String againTime) {
        this.againTime = againTime;
    }

    public String getAgainEnhanceTime() {
        return againEnhanceTime;
    }

    public void setAgainEnhanceTime(String againEnhanceTime) {
        this.againEnhanceTime = againEnhanceTime;
    }
}
