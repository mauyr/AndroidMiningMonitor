package br.com.inovapro.miningmonitor.repository;

import java.util.Arrays;
import java.util.List;

import br.com.inovapro.miningmonitor.dao.ActivePool;
import br.com.inovapro.miningmonitor.domain.Pool;

/**
 * Created by MauyrAlexandre on 18/02/2018.
 */

public class PoolRespository {

    public List<ActivePool> getActivePools() {
        return Arrays.asList(new ActivePool("Anorak", Pool.ANORAK));
    }
}
