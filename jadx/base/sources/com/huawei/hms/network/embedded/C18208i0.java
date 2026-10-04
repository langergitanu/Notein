package com.huawei.hms.network.embedded;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.hms.network.embedded.C18250l0;
import com.huawei.hms.networkkit.embedded.C18447R;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.i0 */
/* JADX INFO: loaded from: classes9.dex */
public class C18208i0 extends AbstractC18166f0 {

    /* JADX INFO: renamed from: g */
    public static final String f55080g = "PingDetectQuery";

    /* JADX INFO: renamed from: h */
    public static final int f55081h = 6000;

    /* JADX INFO: renamed from: e */
    public int f55082e = 3;

    /* JADX INFO: renamed from: f */
    public int f55083f = 30;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.i0$a */
    public class a implements Callable<C18236k0> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f55084a;

        public a(String str) {
            this.f55084a = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public C18236k0 call() {
            return new C18222j0().m78837a(this.f55084a, C18208i0.this.f55082e, C18208i0.this.f55083f, new StringBuffer());
        }
    }

    public C18208i0(ExecutorService executorService) {
        this.f54710b = executorService;
    }

    /* JADX INFO: renamed from: c */
    private boolean m78747c(String str) {
        return str.equals(ContextHolder.getResourceContext().getString(C18447R.string.spec_ip_0)) || str.equals(ContextHolder.getResourceContext().getString(C18447R.string.spec_ip_1)) || str.equals(ContextHolder.getResourceContext().getString(C18447R.string.spec_ip_2));
    }

    /* JADX INFO: renamed from: d */
    private long m78748d(String str) {
        return (long) (Float.parseFloat(str.replace(TranslateLanguage.MALAY, "").trim()) + 0.5f);
    }

    /* JADX INFO: renamed from: a */
    private boolean m78744a(String str) {
        if (str == null || str.isEmpty() || str.length() > 15 || !str.replace(".", "").matches("[0-9]+")) {
            return false;
        }
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length != 4) {
            return false;
        }
        for (String str2 : strArrSplit) {
            if (str2.length() > 4 || Integer.parseInt(str2) > 255) {
                return false;
            }
        }
        return true;
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18166f0
    /* JADX INFO: renamed from: b */
    public C18180g0 mo78285b(AbstractC18434z abstractC18434z) {
        C18236k0 c18236k0;
        int i;
        abstractC18434z.mo77834b(0);
        if (NetworkUtil.netWork(ContextHolder.getResourceContext()) != 1) {
            return this.f54709a;
        }
        String wifiGatewayIp = NetworkUtil.getWifiGatewayIp(ContextHolder.getResourceContext());
        if (!m78744a(wifiGatewayIp) && !m78746b(wifiGatewayIp)) {
            i = C18250l0.d.f55477d;
        } else {
            if (!m78747c(wifiGatewayIp)) {
                Future futureSubmit = this.f54710b.submit(new a(wifiGatewayIp));
                try {
                    try {
                        c18236k0 = (C18236k0) futureSubmit.get(6000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                        abstractC18434z.m80014a(C18250l0.d.f55474a);
                        c18236k0 = null;
                    }
                    if (c18236k0 == null || !c18236k0.m78948h()) {
                        Logger.m76965v(f55080g, "the ping is failed,and exit detect this time");
                        abstractC18434z.m80014a(C18250l0.d.f55474a);
                    } else {
                        abstractC18434z.m80014a(204);
                        if (c18236k0.m78945e() != null) {
                            if (m78748d(c18236k0.m78945e()) > this.f55083f) {
                                abstractC18434z.m80014a(C18250l0.d.f55479f);
                            } else {
                                this.f54709a.m78522b(true);
                            }
                        }
                    }
                    return this.f54709a;
                } finally {
                    futureSubmit.cancel(true);
                }
            }
            i = C18250l0.d.f55478e;
        }
        abstractC18434z.m80014a(i);
        return this.f54709a;
    }

    /* JADX INFO: renamed from: b */
    private boolean m78746b(String str) {
        if (str == null || str.isEmpty() || str.length() > 39) {
            return false;
        }
        int i = 0;
        for (char c : str.toCharArray()) {
            if (':' == c) {
                i++;
            }
        }
        if (i != 7) {
            return false;
        }
        for (String str2 : str.split("\\:")) {
            if (str2.length() > 4) {
                return false;
            }
        }
        return str.replace(C18241k5.f55433h, "").matches("[A-Fa-f0-9]+");
    }
}
