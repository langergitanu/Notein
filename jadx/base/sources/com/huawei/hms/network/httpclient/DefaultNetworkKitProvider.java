package com.huawei.hms.network.httpclient;

import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.network.NetworkKit;
import com.huawei.hms.network.NetworkKitProvider;
import com.huawei.hms.network.embedded.C18225j3;
import com.huawei.hms.network.embedded.C18331r0;
import com.huawei.hms.network.embedded.C18347s3;
import com.huawei.hms.network.embedded.C18350s6;
import com.huawei.hms.network.httpclient.internal.IHttpClientBuilder;
import com.huawei.hms.network.restclient.internal.IRestClientBuilder;

/* JADX INFO: loaded from: classes9.dex */
public class DefaultNetworkKitProvider extends NetworkKitProvider {
    @Override // com.huawei.hms.network.NetworkKitProvider
    public IHttpClientBuilder createHttpClientBuilder() {
        return new C18225j3.b();
    }

    @Override // com.huawei.hms.network.NetworkKitProvider
    public NetworkKit createNetworkKit() {
        return C18331r0.getInstance();
    }

    @Override // com.huawei.hms.network.NetworkKitProvider
    public IRestClientBuilder createRestClientBuilder() {
        return new C18350s6.b();
    }

    @Override // com.huawei.hms.network.BaseProvider
    public int getApiLevel() {
        return C18347s3.getApiLevel();
    }

    @Override // com.huawei.hms.network.BaseProvider
    public String getName() {
        return "DefaultHttpClientProvider";
    }

    @Override // com.huawei.hms.network.BaseProvider
    public String getVersion() {
        return C18347s3.getVersion();
    }

    @Override // com.huawei.hms.network.BaseProvider
    public boolean isDynamicProvider() {
        return ContextHolder.getKitContext() != null;
    }
}
