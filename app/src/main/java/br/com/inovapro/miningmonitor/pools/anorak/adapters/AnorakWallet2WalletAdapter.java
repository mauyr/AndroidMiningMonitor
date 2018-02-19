package br.com.inovapro.miningmonitor.pools.anorak.adapters;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;

import br.com.inovapro.miningmonitor.domain.Pool;
import br.com.inovapro.miningmonitor.domain.Status;
import br.com.inovapro.miningmonitor.domain.Wallet;
import br.com.inovapro.miningmonitor.domain.Worker;
import br.com.inovapro.miningmonitor.pools.adapters.WalletAdapter;

/**
 * Created by MauyrAlexandre on 18/02/2018.
 */

public class AnorakWallet2WalletAdapter implements WalletAdapter {
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public Wallet toDomain(String json) {
        Wallet wallet = new Wallet();
        wallet.setName(Pool.ANORAK.getName());
        wallet.setBalance(BigDecimal.ZERO);
        wallet.setImmature(BigDecimal.ZERO);
        wallet.setRoundShare(BigDecimal.ZERO);

        Worker worker = new Worker();
        worker.setName("RIG");
        worker.setCurrentHashrate(BigDecimal.ZERO);
        worker.setReportedHashrate(BigDecimal.ZERO);
        worker.setLastShare(LocalDateTime.now());
        worker.setStatus(Status.ONLINE);
        worker.setTotalShares(0);
        worker.setTotalStales(0);
        worker.setTotalInvalids(0);
        return wallet;
    }

    @Override
    public String toJson(Wallet wallet) {
        return null;
    }
}
