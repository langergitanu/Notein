package com.huawei.hms.network.embedded;

import com.huawei.hms.network.embedded.C18118b8;
import com.huawei.hms.network.embedded.InterfaceC18267m3;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.o5 */
/* JADX INFO: loaded from: classes9.dex */
public class C18297o5 implements InterfaceC18267m3.a {

    /* JADX INFO: renamed from: a */
    public C18118b8 f55831a;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.o5$a */
    public static class a implements InterfaceC18325q7 {

        /* JADX INFO: renamed from: b */
        public InterfaceC18335r4 f55832b;

        public a(InterfaceC18335r4 interfaceC18335r4) {
            this.f55832b = interfaceC18335r4;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && this.f55832b.equals(((a) obj).f55832b);
        }

        public int hashCode() {
            return this.f55832b.hashCode();
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18325q7
        public List<InetAddress> lookup(String str) throws UnknownHostException {
            return this.f55832b.lookup(str);
        }
    }

    public C18297o5(C18225j3 c18225j3) {
        C18118b8.c cVarM77986a = C18255l5.getInstance().getClient().m77958s().m77991a(c18225j3.getHostnameVerifier()).m77982a(new a(c18225j3.getDns())).m77986a(c18225j3.getProxy());
        if (c18225j3.getSslSocketFactory() != null && c18225j3.getTrustManager() != null) {
            cVarM77986a.m77993a(c18225j3.getSslSocketFactory(), c18225j3.getTrustManager());
        }
        this.f55831a = cVarM77986a.m77995a();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18267m3.a
    public InterfaceC18267m3 newTask() {
        return new C18283n5(this.f55831a);
    }
}
