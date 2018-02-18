package br.com.inovapro.miningmonitor.domain;

/**
 * Created by MauyrAlexandre on 18/02/2018.
 */

public enum Pool {

    ANORAK("Anorak", "https://eth.anorak.tech/api/", "accounts"),
    ETHERMINE("Ethermine", "https://", "accounts");

    private String name;
    private String apiUrl;
    private String walletUrl;

    Pool(String name, String apiUrl, String walletUrl) {
        this.name = name;
        this.apiUrl = apiUrl;
        this.walletUrl = walletUrl;
    }

    public String getName() {
        return name;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public String getWalletUrl() {
        return walletUrl;
    }
}
