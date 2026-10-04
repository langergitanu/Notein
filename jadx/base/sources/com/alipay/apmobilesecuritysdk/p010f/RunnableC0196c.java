package com.alipay.apmobilesecuritysdk.p010f;

import android.os.Process;

/* JADX INFO: renamed from: com.alipay.apmobilesecuritysdk.f.c */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0196c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0195b f156a;

    public RunnableC0196c(C0195b c0195b) {
        this.f156a = c0195b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Process.setThreadPriority(0);
            while (!this.f156a.f155c.isEmpty()) {
                Runnable runnable = (Runnable) this.f156a.f155c.get(0);
                this.f156a.f155c.remove(0);
                if (runnable != null) {
                    runnable.run();
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            C0195b.m220b(this.f156a);
            throw th;
        }
        C0195b.m220b(this.f156a);
    }
}
