package com.spring.mongo.demo.model;

import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Account implements Serializable{

    @Id
    private String id;

    private Double accountNumber;
    private String dateOfCreation;
    private String currency;
    private int mobile;
    private String branch;
    private Double initialBal;
    private Double activeBal;
    private String debitAmnt;
    private String creditAmnt;
    private String debitNarration;
    private String creditNarration;

    

    public Double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Double getInitialBal() {
        return initialBal;
    }

    public void setInitialBal(Double initialBal) {
        this.initialBal = initialBal;
    }

    public Double getActiveBal() {
        return activeBal;
    }

    public void setActiveBal(Double activeBal) {
        this.activeBal = activeBal;
    }

    public String getDebitAmnt() {
        return debitAmnt;
    }

    public void setDebitAmnt(String debitAmnt) {
        this.debitAmnt = debitAmnt;
    }

    public String getCreditAmnt() {
        return creditAmnt;
    }

    public void setCreditAmnt(String creditAmnt) {
        this.creditAmnt = creditAmnt;
    }

    public String getDebitNarration() {
        return debitNarration;
    }

    public void setDebitNarration(String debitNarration) {
        this.debitNarration = debitNarration;
    }

    public String getCreditNarration() {
        return creditNarration;
    }

    public void setCreditNarration(String creditNarration) {
        this.creditNarration = creditNarration;
    }
}
