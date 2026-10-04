package com.microsoft.identity.common.java.interfaces;

import com.microsoft.identity.common.java.exception.ClientException;
import com.microsoft.identity.common.java.providers.oauth2.IStateGenerator;
import com.microsoft.identity.common.java.strategies.IAuthorizationStrategyFactory;
import com.microsoft.identity.common.java.util.IBroadcaster;
import com.microsoft.identity.common.java.util.IClockSkewManager;
import com.microsoft.identity.common.java.util.IPlatformUtil;

/* JADX INFO: loaded from: classes9.dex */
public interface IPlatformComponents extends IPopManagerSupplier {
    IAuthorizationStrategyFactory getAuthorizationStrategyFactory();

    IBroadcaster getBroadcaster() throws ClientException;

    IClockSkewManager getClockSkewManager();

    IHttpClientWrapper getHttpClientWrapper();

    IPlatformUtil getPlatformUtil();

    IStateGenerator getStateGenerator();

    IStorageSupplier getStorageSupplier();
}
