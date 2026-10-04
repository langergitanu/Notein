package com.huawei.hms.network.embedded;

import com.huawei.hms.network.embedded.InterfaceC18267m3;
import java.net.Proxy;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.g6 */
/* JADX INFO: loaded from: classes9.dex */
public class C18186g6 implements InterfaceC18267m3.a {

    /* JADX INFO: renamed from: a */
    public C18225j3 f54914a;

    public C18186g6(C18225j3 c18225j3) {
        this.f54914a = c18225j3;
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.f54914a.getHostnameVerifier();
    }

    public Proxy getProxy() {
        return this.f54914a.getProxy();
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f54914a.getSslSocketFactory();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18267m3.a
    public InterfaceC18267m3 newTask() {
        return new C18172f6(this);
    }
}
