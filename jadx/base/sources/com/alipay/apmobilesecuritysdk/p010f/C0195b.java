package com.alipay.apmobilesecuritysdk.p010f;

import java.util.LinkedList;

/* JADX INFO: renamed from: com.alipay.apmobilesecuritysdk.f.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0195b {

    /* JADX INFO: renamed from: a */
    public static C0195b f153a = new C0195b();

    /* JADX INFO: renamed from: b */
    public Thread f154b = null;

    /* JADX INFO: renamed from: c */
    public LinkedList<Runnable> f155c = new LinkedList<>();

    /* JADX INFO: renamed from: a */
    public static C0195b m218a() {
        return f153a;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Thread m220b(C0195b c0195b) {
        c0195b.f154b = null;
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m221a(Runnable runnable) {
        this.f155c.add(runnable);
        if (this.f154b == null) {
            Thread thread = new Thread(new RunnableC0196c(this));
            this.f154b = thread;
            thread.start();
        }
    }
}
