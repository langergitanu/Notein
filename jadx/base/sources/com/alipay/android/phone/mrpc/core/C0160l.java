package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0160l implements InterfaceC0147ab {

    /* JADX INFO: renamed from: b */
    public static C0160l f70b;

    /* JADX INFO: renamed from: i */
    public static final ThreadFactory f71i = new ThreadFactoryC0162n();

    /* JADX INFO: renamed from: a */
    public Context f72a;

    /* JADX INFO: renamed from: c */
    public ThreadPoolExecutor f73c;

    /* JADX INFO: renamed from: d */
    public C0150b f74d = C0150b.m52a(TelemetryEventStrings.C18741Os.OS_NAME);

    /* JADX INFO: renamed from: e */
    public long f75e;

    /* JADX INFO: renamed from: f */
    public long f76f;

    /* JADX INFO: renamed from: g */
    public long f77g;

    /* JADX INFO: renamed from: h */
    public int f78h;

    public C0160l(Context context) {
        this.f72a = context;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 11, 3L, TimeUnit.SECONDS, new ArrayBlockingQueue(20), f71i, new ThreadPoolExecutor.CallerRunsPolicy());
        this.f73c = threadPoolExecutor;
        try {
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Exception unused) {
        }
        CookieSyncManager.createInstance(this.f72a);
        CookieManager.getInstance().setAcceptCookie(true);
    }

    /* JADX INFO: renamed from: b */
    public static final synchronized C0160l m77b(Context context) {
        C0160l c0160l = f70b;
        if (c0160l != null) {
            return c0160l;
        }
        C0160l c0160l2 = new C0160l(context);
        f70b = c0160l2;
        return c0160l2;
    }

    /* JADX INFO: renamed from: a */
    public final C0150b m78a() {
        return this.f74d;
    }

    /* JADX INFO: renamed from: c */
    public final void m81c(long j) {
        this.f77g += j;
    }

    /* JADX INFO: renamed from: a */
    public static final C0160l m76a(Context context) {
        C0160l c0160l = f70b;
        return c0160l != null ? c0160l : m77b(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m80b(long j) {
        this.f76f += j;
        this.f78h++;
    }

    @Override // com.alipay.android.phone.mrpc.core.InterfaceC0147ab
    /* JADX INFO: renamed from: a */
    public final Future<C0169u> mo50a(AbstractC0168t abstractC0168t) {
        if (C0167s.m113a(this.f72a)) {
            String str = "HttpManager" + hashCode() + ": Active Task = %d, Completed Task = %d, All Task = %d,Avarage Speed = %d KB/S, Connetct Time = %d ms, All data size = %d bytes, All enqueueConnect time = %d ms, All socket time = %d ms, All request times = %d times";
            Integer numValueOf = Integer.valueOf(this.f73c.getActiveCount());
            Long lValueOf = Long.valueOf(this.f73c.getCompletedTaskCount());
            Long lValueOf2 = Long.valueOf(this.f73c.getTaskCount());
            long j = this.f77g;
            Long lValueOf3 = Long.valueOf(j == 0 ? 0L : ((this.f75e * 1000) / j) >> 10);
            int i = this.f78h;
            String.format(str, numValueOf, lValueOf, lValueOf2, lValueOf3, Long.valueOf(i != 0 ? this.f76f / ((long) i) : 0L), Long.valueOf(this.f75e), Long.valueOf(this.f76f), Long.valueOf(this.f77g), Integer.valueOf(this.f78h));
        }
        CallableC0165q callableC0165q = new CallableC0165q(this, (C0163o) abstractC0168t);
        C0161m c0161m = new C0161m(this, callableC0165q, callableC0165q);
        this.f73c.execute(c0161m);
        return c0161m;
    }

    /* JADX INFO: renamed from: a */
    public final void m79a(long j) {
        this.f75e += j;
    }
}
