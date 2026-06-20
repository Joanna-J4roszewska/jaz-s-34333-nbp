package jaz_s_34333_nbp.demo;
import java.util.List;

public class NBPAnswer {
    private String currency;
    private String code;
    private List<NbpRate> rates;
    private String table;

    public NBPAnswer(){

    }

    public NBPAnswer(String currency, String code, String table) {
        this.currency = currency;
        this.code = code;
        this.table = table;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<NbpRate> getRates() {
        return rates;
    }

    public void setRates(List<NbpRate> rates) {
        this.rates = rates;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }
}