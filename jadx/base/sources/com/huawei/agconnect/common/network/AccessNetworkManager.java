package com.huawei.agconnect.common.network;

/* JADX INFO: loaded from: classes8.dex */
public abstract class AccessNetworkManager {
    private static final AccessNetworkManager INSTANCE = new C17573a();

    public interface AccessNetworkCallback {
        void onNetWorkReady();
    }

    public static AccessNetworkManager getInstance() {
        return INSTANCE;
    }

    public abstract void addCallback(AccessNetworkCallback accessNetworkCallback);

    public abstract boolean canAccessNetwork();

    public abstract void setAccessNetwork(boolean z);
}
