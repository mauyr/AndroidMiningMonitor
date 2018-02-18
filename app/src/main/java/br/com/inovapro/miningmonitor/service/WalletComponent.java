package br.com.inovapro.miningmonitor.service;

import br.com.inovapro.miningmonitor.dao.ActivePool;
import br.com.inovapro.miningmonitor.domain.Wallet;

/**
 * Created by MauyrAlexandre on 18/02/2018.
 */

public interface WalletComponent {
    Wallet getWalletInformation(ActivePool pool);
}
