package br.com.inovapro.miningmonitor.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MauyrAlexandre on 18/02/2018.
 */

public class Wallet {
    private String name;
    private BigDecimal roundShare;
    private BigDecimal balance;
    private BigDecimal immature;
    private List<Worker> workers = new ArrayList<>();
    private List<Payment> payments = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Worker> getWorker() {
        return workers;
    }

    public void setWorker(List<Worker> workers) {
        this.workers = workers;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public BigDecimal getRoundShare() {
        return roundShare;
    }

    public void setRoundShare(BigDecimal roundShare) {
        this.roundShare = roundShare;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getImmature() {
        return immature;
    }

    public void setImmature(BigDecimal immature) {
        this.immature = immature;
    }
}
