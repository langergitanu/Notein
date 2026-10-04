package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PackageManagerCompat;
import com.huawei.hms.network.embedded.C18250l0;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.e0 */
/* JADX INFO: loaded from: classes9.dex */
public class C18152e0 extends AbstractC18166f0 {

    /* JADX INFO: renamed from: h */
    public static final String f54596h = "HttpDetectQuery";

    /* JADX INFO: renamed from: i */
    public static final String f54597i = "DETECT_APP_ID";

    /* JADX INFO: renamed from: f */
    public String f54599f;

    /* JADX INFO: renamed from: e */
    public String f54598e = "";

    /* JADX INFO: renamed from: g */
    public Callable<C18356t> f54600g = new a();

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.e0$a */
    public class a implements Callable<C18356t> {
        public a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public C18356t call() {
            return C18264m0.m79109a(ContextHolder.getAppContext(), C18152e0.this.f54599f + C18250l0.e.f55481a, C18152e0.this.f54598e);
        }
    }

    public C18152e0(ExecutorService executorService) {
        this.f54710b = executorService;
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18166f0
    /* JADX INFO: renamed from: b */
    public C18180g0 mo78285b(AbstractC18434z abstractC18434z) {
        Logger.m76965v(f54596h, "the http detect is coming!");
        abstractC18434z.mo77834b(1);
        this.f54598e = PackageManagerCompat.getMetaDataFromApp(ContextHolder.getAppContext(), f54597i, "");
        Logger.m76965v(f54596h, "the obtain appId is:" + this.f54598e);
        if (TextUtils.isEmpty(this.f54598e)) {
            abstractC18434z.m80014a(C18250l0.d.f55475b);
            this.f54709a.m78519a(false);
        } else {
            String strM79110a = C18264m0.m79110a(ContextHolder.getResourceContext());
            this.f54599f = strM79110a;
            if (!TextUtils.isEmpty(strM79110a)) {
                Logger.m76965v(f54596h, "the detectDomainName is :" + this.f54599f);
                Future futureSubmit = null;
                try {
                    try {
                        try {
                            futureSubmit = this.f54710b.submit(this.f54600g);
                            C18356t c18356t = (C18356t) futureSubmit.get(5000L, TimeUnit.MILLISECONDS);
                            if (c18356t.m79540a() == 404) {
                                this.f54709a.m78519a(false);
                            }
                            abstractC18434z.mo77832a(c18356t.m79540a(), this.f54599f);
                        } catch (RejectedExecutionException unused) {
                            Logger.m76967w(f54596h, "executorService submit is RejectedExecutionException");
                            abstractC18434z.mo77832a(C18250l0.d.f55474a, this.f54599f);
                            if (futureSubmit != null) {
                            }
                            return this.f54709a;
                        }
                    } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException unused2) {
                        Logger.m76967w(f54596h, "the connect is overTime");
                        abstractC18434z.mo77832a(C18250l0.d.f55474a, this.f54599f);
                        if (futureSubmit != null) {
                        }
                        return this.f54709a;
                    }
                    futureSubmit.cancel(true);
                    return this.f54709a;
                } catch (Throwable th) {
                    if (futureSubmit != null) {
                        futureSubmit.cancel(true);
                    }
                    throw th;
                }
            }
            abstractC18434z.m80014a(C18250l0.d.f55476c);
        }
        return this.f54709a;
    }
}
