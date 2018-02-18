package br.com.inovapro.miningmonitor.service;

import br.com.inovapro.miningmonitor.dao.ActivePool;
import br.com.inovapro.miningmonitor.domain.Dashboard;
import br.com.inovapro.miningmonitor.repository.PoolRespository;

/**
 * Created by MauyrAlexandre on 18/02/2018.
 */

public class DashboardService {

    public WalletService walletService;

    public PoolRespository poolRespository;

    public Dashboard getDashboardInformation() {
        final Dashboard dashboard = new Dashboard();
        for (ActivePool activePool : poolRespository.getActivePools()) {
            dashboard.getWallet().add(walletService.getWalletInformation(activePool));
        }
        return dashboard;
    }
}
