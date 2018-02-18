package br.com.inovapro.miningmonitor.pools.anorak.connectors;

import java.math.BigDecimal;

import br.com.inovapro.miningmonitor.dao.ActivePool;
import br.com.inovapro.miningmonitor.domain.Wallet;
import br.com.inovapro.miningmonitor.domain.Worker;
import br.com.inovapro.miningmonitor.pools.adapters.WalletAdapter;
import br.com.inovapro.miningmonitor.pools.anorak.adapters.AnorakWallet2Wallet;
import br.com.inovapro.miningmonitor.service.WalletComponent;

/**
 * Created by MauyrAlexandre on 18/02/2018.
 */

public class AnorakWalletComponent implements WalletComponent {
    @Override
    public Wallet getWalletInformation(ActivePool pool) {
        return this.getWalletAdapter().toDomain("");
    }

    private WalletAdapter getWalletAdapter() {
        return new AnorakWallet2Wallet();
    }
}
