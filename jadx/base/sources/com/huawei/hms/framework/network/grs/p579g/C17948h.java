package com.huawei.hms.framework.network.grs.p579g;

import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.hms.framework.network.grs.InterfaceC17930b;
import com.huawei.hms.framework.network.grs.p577e.C17933a;
import com.huawei.hms.framework.network.grs.p577e.C17935c;
import com.huawei.hms.framework.network.grs.p579g.p581k.C17952b;
import com.huawei.hms.framework.network.grs.p579g.p581k.C17953c;
import com.huawei.hms.framework.network.grs.p582h.C17958d;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.g.h */
/* JADX INFO: loaded from: classes7.dex */
public class C17948h {

    /* JADX INFO: renamed from: a */
    private final ExecutorService f53724a = ExecutorsUtils.newCachedThreadPool("GRS_RequestController-Task");

    /* JADX INFO: renamed from: b */
    private final Map<String, C17952b> f53725b = new ConcurrentHashMap(16);

    /* JADX INFO: renamed from: c */
    private final Object f53726c = new Object();

    /* JADX INFO: renamed from: d */
    private C17933a f53727d;

    /* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.g.h$a */
    public class a implements Callable<C17944d> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C17953c f53728a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f53729b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C17935c f53730c;

        public a(C17953c c17953c, String str, C17935c c17935c) {
            this.f53728a = c17953c;
            this.f53729b = str;
            this.f53730c = c17935c;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public C17944d call() {
            return new C17943c(this.f53728a, C17948h.this.f53727d).m77077a(C17948h.this.f53724a, this.f53729b, this.f53730c);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.g.h$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C17953c f53732a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f53733b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C17935c f53734c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC17930b f53735d;

        public b(C17953c c17953c, String str, C17935c c17935c, InterfaceC17930b interfaceC17930b) {
            this.f53732a = c17953c;
            this.f53733b = str;
            this.f53734c = c17935c;
            this.f53735d = interfaceC17930b;
        }

        @Override // java.lang.Runnable
        public void run() {
            C17948h c17948h = C17948h.this;
            c17948h.m77120a(c17948h.m77123a(this.f53732a, this.f53733b, this.f53734c), this.f53735d);
        }
    }

    /* JADX INFO: renamed from: a */
    public C17944d m77123a(C17953c c17953c, String str, C17935c c17935c) {
        Future<C17944d> futureSubmit;
        String str2;
        String str3;
        Logger.m76958d("RequestController", "request to server with service name is: " + str);
        String grsParasKey = c17953c.m77136b().getGrsParasKey(true, true, c17953c.m77134a());
        Logger.m76965v("RequestController", "request spUrlKey: " + grsParasKey);
        synchronized (this.f53726c) {
            try {
                if (NetworkUtil.isNetworkAvailable(c17953c.m77134a())) {
                    C17958d.a aVarM77156a = C17958d.m77156a(grsParasKey);
                    C17952b c17952b = this.f53725b.get(grsParasKey);
                    if (c17952b != null && c17952b.m77131b()) {
                        futureSubmit = c17952b.m77130a();
                    } else if (aVarM77156a == null || !aVarM77156a.m77158a()) {
                        Logger.m76958d("RequestController", "hitGrsRequestBean == null or request block is released.");
                        futureSubmit = this.f53724a.submit(new a(c17953c, str, c17935c));
                        this.f53725b.put(grsParasKey, new C17952b(futureSubmit));
                    }
                    try {
                        return futureSubmit.get();
                    } catch (InterruptedException e) {
                        e = e;
                        str2 = "RequestController";
                        str3 = "when check result, find InterruptedException, check others";
                        Logger.m76968w(str2, str3, e);
                        return null;
                    } catch (CancellationException e2) {
                        e = e2;
                        str2 = "RequestController";
                        str3 = "when check result, find CancellationException, check others";
                        Logger.m76968w(str2, str3, e);
                        return null;
                    } catch (ExecutionException e3) {
                        e = e3;
                        str2 = "RequestController";
                        str3 = "when check result, find ExecutionException, check others";
                        Logger.m76968w(str2, str3, e);
                        return null;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m77124a(C17933a c17933a) {
        this.f53727d = c17933a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m77120a(C17944d c17944d, InterfaceC17930b interfaceC17930b) {
        if (interfaceC17930b != null) {
            if (c17944d == null) {
                Logger.m76965v("RequestController", "GrsResponse is null");
                interfaceC17930b.mo76981a();
            } else {
                Logger.m76965v("RequestController", "GrsResponse is not null");
                interfaceC17930b.mo76982a(c17944d);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m77125a(C17953c c17953c, InterfaceC17930b interfaceC17930b, String str, C17935c c17935c) {
        this.f53724a.execute(new b(c17953c, str, c17935c, interfaceC17930b));
    }

    /* JADX INFO: renamed from: a */
    public void m77126a(String str) {
        synchronized (this.f53726c) {
            this.f53725b.remove(str);
        }
    }
}
