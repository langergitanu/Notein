package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.embedded.C18321q3;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.inner.api.PolicyNetworkService;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.t5 */
/* JADX INFO: loaded from: classes9.dex */
public class C18362t5 {

    /* JADX INFO: renamed from: b */
    public static final String f56222b = "HostRoute";

    /* JADX INFO: renamed from: c */
    public static volatile C18362t5 f56223c = null;

    /* JADX INFO: renamed from: d */
    public static final int f56224d = 1000;

    /* JADX INFO: renamed from: e */
    public static final int f56225e = 500;

    /* JADX INFO: renamed from: f */
    public static final int f56226f = 400;

    /* JADX INFO: renamed from: g */
    public static final int f56227g = 3;

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap<String, a> f56228a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.t5$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f56229a = 500;

        /* JADX INFO: renamed from: b */
        public int f56230b = 1;
    }

    public static C18362t5 getInstance() {
        if (f56223c == null) {
            synchronized (C18362t5.class) {
                try {
                    if (f56223c == null) {
                        f56223c = new C18362t5();
                    }
                } finally {
                }
            }
        }
        return f56223c;
    }

    /* JADX INFO: renamed from: a */
    public Request m79552a(C18321q3.d dVar) {
        a aVar = this.f56228a.get(new C18185g5(dVar.getUrl()).getHost());
        if (aVar == null || aVar.f56229a == dVar.getNetConfig().getConcurrentConnectDelay()) {
            Logger.m76965v(f56222b, "request not change: ");
            return dVar;
        }
        Logger.m76965v(f56222b, "  old delay time = " + dVar.getNetConfig().getConcurrentConnectDelay() + " new delay time " + aVar.f56229a);
        dVar.getNetConfig().setValue(PolicyNetworkService.RequestConstants.CONCURRENT_CONNECT_DELAY, aVar.f56229a);
        return dVar;
    }

    /* JADX INFO: renamed from: a */
    public void m79553a(long j, String str) {
        int i;
        if (j <= 0 || str == null) {
            return;
        }
        if (this.f56228a.get(str) == null) {
            this.f56228a.putIfAbsent(str, new a());
        }
        a aVar = this.f56228a.get(str);
        if (j > 400) {
            aVar.f56229a = 1000;
            aVar.f56230b = 1;
        } else if (aVar.f56229a == 1000 && (i = aVar.f56230b) < 3) {
            aVar.f56230b = i + 1;
        } else {
            aVar.f56230b = 1;
            aVar.f56229a = 500;
        }
    }
}
