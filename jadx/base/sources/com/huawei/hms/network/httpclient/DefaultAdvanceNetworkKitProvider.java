package com.huawei.hms.network.httpclient;

import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.network.AdvanceNetworkKitProvider;
import com.huawei.hms.network.api.advance.AdvanceNetworkKit;
import com.huawei.hms.network.embedded.C18318q0;
import com.huawei.hms.network.embedded.C18347s3;

/* JADX INFO: loaded from: classes9.dex */
public class DefaultAdvanceNetworkKitProvider extends AdvanceNetworkKitProvider {
    public AdvanceNetworkKit createAdvanceNetworkKit() {
        return C18318q0.getInstance();
    }

    public int getApiLevel() {
        return C18347s3.getApiLevel();
    }

    public String getName() {
        return "com.huawei.hms.network.httpclient.DefaultAdvanceNetworkKitProvider";
    }

    public String getVersion() {
        return C18347s3.getVersion();
    }

    public boolean isDynamicProvider() {
        return ContextHolder.getKitContext() != null;
    }
}
