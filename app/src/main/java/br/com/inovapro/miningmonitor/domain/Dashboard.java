package br.com.inovapro.miningmonitor.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MauyrAlexandre on 18/02/2018.
 */

public class Dashboard {
    private List<Wallet> wallet = new ArrayList<>();

    public List<Wallet> getWallet() {
        return wallet;
    }

    public void setWallet(List<Wallet> wallet) {
        this.wallet = wallet;
    }
}
