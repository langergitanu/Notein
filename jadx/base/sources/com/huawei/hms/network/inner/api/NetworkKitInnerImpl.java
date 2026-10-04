package com.huawei.hms.network.inner.api;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.network.embedded.C18256l6;
import com.huawei.hms.network.embedded.C18270m6;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class NetworkKitInnerImpl {
    public static final NetworkKitInnerImpl INSTANCE = new NetworkKitInnerImpl();
    public ProtocolStackManager protocolStackManager;

    public static NetworkKitInnerImpl getInstance() {
        return INSTANCE;
    }

    private C18270m6 getNetworkServiceManager() {
        return C18270m6.m79118c();
    }

    public List<NetworkService> getAll() {
        return getNetworkServiceManager().m79120a();
    }

    public List<String> getHostsInConnectionPool() {
        ProtocolStackManager protocolStackManager = this.protocolStackManager;
        return protocolStackManager != null ? protocolStackManager.getHostsInConnectionPool() : new ArrayList();
    }

    public InterceptorNetworkService getInterceptorNetworkService(String str) {
        NetworkService networkServiceM79119a = getNetworkServiceManager().m79119a(str);
        if (networkServiceM79119a instanceof InterceptorNetworkService) {
            return (InterceptorNetworkService) networkServiceM79119a;
        }
        return null;
    }

    public C18256l6 getNetworkBroadcastManager() {
        return C18256l6.m79045b();
    }

    public PolicyNetworkService getPolicyNetworkService(String str) {
        NetworkService networkServiceM79119a = getNetworkServiceManager().m79119a(str);
        if (networkServiceM79119a instanceof PolicyNetworkService) {
            return (PolicyNetworkService) networkServiceM79119a;
        }
        return null;
    }

    public NetworkService getService(String str) {
        return getNetworkServiceManager().m79119a(str);
    }

    public NetworkKitInnerImpl init(Context context, String str, Bundle bundle) {
        getNetworkServiceManager().m79121a(context, str, bundle);
        return this;
    }

    public void setPolicyExecutor(PolicyNetworkService policyNetworkService) {
        getNetworkServiceManager().m79122a(policyNetworkService);
    }

    public void setProtocolStackManager(ProtocolStackManager protocolStackManager) {
        this.protocolStackManager = protocolStackManager;
    }
}
