package jaz_s_34333_nbp.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
class NbpRate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String no;
    private String effectiveDate;
    private BigDecimal mid;
    public String NBP;

    public NbpRate() {
    }

    public String getNBP(){
        return  NBP;
    }
    public String getNo() {
        return no;
    }
    public void setNBP(String NBP){
        this.NBP = NBP;
    }
    public void setNo(String no) {
        this.no = no;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public BigDecimal getMid() {
        return mid;
    }

    public void setMid(BigDecimal mid) {
        this.mid = mid;
    }
}