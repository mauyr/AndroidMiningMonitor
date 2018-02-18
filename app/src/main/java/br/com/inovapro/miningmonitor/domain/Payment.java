package br.com.inovapro.miningmonitor.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Created by MauyrAlexandre on 18/02/2018.
 */

public class Payment {
    private LocalDateTime paymentDate;
    private BigDecimal amount;
    private String transactionId;

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}
