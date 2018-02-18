package br.com.inovapro.miningmonitor.pools.adapters;

import br.com.inovapro.miningmonitor.domain.Wallet;

/**
 * Created by MauyrAlexandre on 18/02/2018.
 */

public interface WalletAdapter {
    Wallet toDomain(String json);

    String toJson(Wallet wallet);
}
