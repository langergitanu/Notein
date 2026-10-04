package com.huawei.hms.network.embedded;

import com.huawei.hms.network.conf.api.ConfigAPI;
import com.huawei.hms.network.inner.api.NetworkService;
import com.huawei.hms.network.p586ai.AIPolicyService;
import java.net.InetAddress;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.p1 */
/* JADX INFO: loaded from: classes9.dex */
public class C18306p1 {

    /* JADX INFO: renamed from: a */
    public boolean f55850a;

    /* JADX INFO: renamed from: b */
    public C18279n1 f55851b;

    /* JADX INFO: renamed from: c */
    public C18293o1 f55852c;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.p1$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final C18306p1 f55853a = new C18306p1();
    }

    public C18306p1() {
        boolean z = false;
        this.f55850a = false;
        this.f55852c = new C18293o1();
        if (AIPolicyService.isAiEnable() && ((Boolean) ConfigAPI.getValue(NetworkService.Constants.AI_IPSORT)).booleanValue()) {
            z = true;
        }
        this.f55850a = z;
        if (z) {
            this.f55851b = new C18279n1(this.f55852c);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C18306p1 m79332b() {
        return b.f55853a;
    }

    /* JADX INFO: renamed from: a */
    public int m79333a(InetAddress inetAddress, InetAddress inetAddress2) {
        if (this.f55850a) {
            return this.f55851b.m79224a(inetAddress, inetAddress2);
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public List<InetAddress> m79334a(List<InetAddress> list) {
        return !this.f55850a ? list : this.f55851b.m79226b(list);
    }

    /* JADX INFO: renamed from: a */
    public void m79335a() {
        C18383v0.m79659a().m79663a(C18357t0.f56144d, this.f55852c);
        if (this.f55850a) {
            C18097a1.m77836c().m77840a(C18357t0.f56144d, this.f55851b);
        }
    }
}
