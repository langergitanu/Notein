package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import com.facebook.imagepipeline.producers.C22277OooOooO;
import o00oo.C25638OooO0oO;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC22276OooOoo0 implements Runnable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C22277OooOooO f67372OooOo0o;

    public RunnableC22276OooOoo0(C22277OooOooO c22277OooOooO) {
        this.f67372OooOo0o = c22277OooOooO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C25638OooO0oO c25638OooO0oO;
        int i;
        C22277OooOooO c22277OooOooO = this.f67372OooOo0o;
        c22277OooOooO.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (c22277OooOooO) {
            c25638OooO0oO = c22277OooOooO.f67379OooO0o0;
            i = c22277OooOooO.f67378OooO0o;
            c22277OooOooO.f67379OooO0o0 = null;
            c22277OooOooO.f67378OooO0o = 0;
            c22277OooOooO.f67380OooO0oO = C22277OooOooO.OooO0OO.f67386OooOoO0;
            c22277OooOooO.f67373OooO = jUptimeMillis;
        }
        try {
            if (C22277OooOooO.OooO0Oo(c25638OooO0oO, i)) {
                c22277OooOooO.f67375OooO0O0.OooO00o(c25638OooO0oO, i);
            }
        } finally {
            C25638OooO0oO.OooO0OO(c25638OooO0oO);
            c22277OooOooO.OooO0O0();
        }
    }
}
