package br.com.inovapro.miningmonitor.dao;

import br.com.inovapro.miningmonitor.domain.Pool;

/**
 * Created by MauyrAlexandre on 18/02/2018.
 */

public class ActivePool {
    private String walletAddress;
    private Pool pool;

    public ActivePool(String walletAddress, Pool pool) {
        this.walletAddress = walletAddress;
        this.pool = pool;
    }

    public String getWalletAddress() {
        return walletAddress;
    }

    public void setWalletAddress(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    public Pool getPool() {
        return pool;
    }

    public void setPool(Pool pool) {
        this.pool = pool;
    }
}
