package br.com.inovapro.miningmonitor.service;

import br.com.inovapro.miningmonitor.dao.ActivePool;
import br.com.inovapro.miningmonitor.domain.Pool;
import br.com.inovapro.miningmonitor.domain.Wallet;
import br.com.inovapro.miningmonitor.pools.anorak.connectors.AnorakWalletComponent;

/**
 * Created by MauyrAlexandre on 18/02/2018.
 */

public class WalletService {

    public Wallet getWalletInformation(ActivePool activePool) {
        return this.getWalletComponent(activePool.getPool()).getWalletInformation(activePool);
    }

    private WalletComponent getWalletComponent(Pool pool) {
        return new AnorakWalletComponent();
    }
}
