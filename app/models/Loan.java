package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
@Entity
public class Loan extends Model {

    @NotNull
    private String name;
    @NotNull
    private String amount;
    @NotNull
    private String date;
    @NotNull
    private String status;
    @NotNull
    private String remarks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
