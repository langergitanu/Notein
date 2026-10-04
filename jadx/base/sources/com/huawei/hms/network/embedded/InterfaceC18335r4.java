package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import com.huawei.hms.network.inner.api.DnsNetworkService;
import com.huawei.hms.network.inner.api.NetworkKitInnerImpl;
import com.huawei.hms.network.inner.api.NetworkService;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.r4 */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC18335r4 {
    public static final InterfaceC18335r4 DEFAULT = new a();

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.r4$a */
    public static class a implements InterfaceC18335r4 {

        /* JADX INFO: renamed from: a */
        public DnsNetworkService f56003a;

        @Override // com.huawei.hms.network.embedded.InterfaceC18335r4
        public List<InetAddress> lookup(String str) throws UnknownHostException {
            if (TextUtils.isEmpty(str)) {
                throw new UnknownHostException("hostname == null");
            }
            if (this.f56003a == null) {
                NetworkService service = NetworkKitInnerImpl.getInstance().getService("dns");
                if (!(service instanceof DnsNetworkService)) {
                    throw new IllegalStateException("DNS service not available");
                }
                this.f56003a = (DnsNetworkService) service;
            }
            return this.f56003a.lookup(str);
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18335r4
        public void setDnstime(int i) {
        }
    }

    List<InetAddress> lookup(String str) throws UnknownHostException;

    void setDnstime(int i);
}
