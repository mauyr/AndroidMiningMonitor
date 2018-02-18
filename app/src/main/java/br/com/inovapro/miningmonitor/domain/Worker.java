package br.com.inovapro.miningmonitor.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Created by MauyrAlexandre on 18/02/2018.
 */

public class Worker {
    private String name;
    private BigDecimal reportedHashrate;
    private BigDecimal currentHashrate;
    private LocalDateTime lastShare;
    private Status status;
    private long totalShares;
    private long totalStales;
    private long totalInvalids;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getReportedHashrate() {
        return reportedHashrate;
    }

    public void setReportedHashrate(BigDecimal reportedHashrate) {
        this.reportedHashrate = reportedHashrate;
    }

    public BigDecimal getCurrentHashrate() {
        return currentHashrate;
    }

    public void setCurrentHashrate(BigDecimal currentHashrate) {
        this.currentHashrate = currentHashrate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getLastShare() {
        return lastShare;
    }

    public void setLastShare(LocalDateTime lastShare) {
        this.lastShare = lastShare;
    }

    public long getTotalShares() {
        return totalShares;
    }

    public void setTotalShares(long totalShares) {
        this.totalShares = totalShares;
    }

    public long getTotalStales() {
        return totalStales;
    }

    public void setTotalStales(long totalStales) {
        this.totalStales = totalStales;
    }

    public long getTotalInvalids() {
        return totalInvalids;
    }

    public void setTotalInvalids(long totalInvalids) {
        this.totalInvalids = totalInvalids;
    }
}
