package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o00oo.C25638OooO0oO;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22277OooOooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Executor f67374OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f67375OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final RunnableC22276OooOoo0 f67376OooO0OO = new RunnableC22276OooOoo0(this);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final RunnableC22275OooOoo f67377OooO0Oo = new RunnableC22275OooOoo(this);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public C25638OooO0oO f67379OooO0o0 = null;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f67378OooO0o = 0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public OooO0OO f67380OooO0oO = OooO0OO.f67384OooOo0o;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f67381OooO0oo = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f67373OooO = 0;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OooOooO$OooO00o */
    public interface OooO00o {
        void OooO00o(C25638OooO0oO c25638OooO0oO, int i);
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OooOooO$OooO0O0 */
    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static ScheduledExecutorService f67382OooO00o;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OooOooO$OooO0OO */
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO0OO f67383OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0OO f67384OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO0OO f67385OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO0OO f67386OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final /* synthetic */ OooO0OO[] f67387OooOoOO;

        static {
            OooO0OO oooO0OO = new OooO0OO("IDLE", 0);
            f67384OooOo0o = oooO0OO;
            OooO0OO oooO0OO2 = new OooO0OO("QUEUED", 1);
            f67383OooOo = oooO0OO2;
            OooO0OO oooO0OO3 = new OooO0OO("RUNNING", 2);
            f67386OooOoO0 = oooO0OO3;
            OooO0OO oooO0OO4 = new OooO0OO("RUNNING_AND_PENDING", 3);
            f67385OooOoO = oooO0OO4;
            f67387OooOoOO = new OooO0OO[]{oooO0OO, oooO0OO2, oooO0OO3, oooO0OO4};
        }

        public OooO0OO() {
            throw null;
        }

        public static OooO0OO valueOf(String str) {
            return (OooO0OO) Enum.valueOf(OooO0OO.class, str);
        }

        public static OooO0OO[] values() {
            return (OooO0OO[]) f67387OooOoOO.clone();
        }
    }

    public C22277OooOooO(Executor executor, OooO00o oooO00o) {
        this.f67374OooO00o = executor;
        this.f67375OooO0O0 = oooO00o;
    }

    public static boolean OooO0Oo(C25638OooO0oO c25638OooO0oO, int i) {
        return com.facebook.imagepipeline.producers.OooO0O0.OooO0Oo(i) || com.facebook.imagepipeline.producers.OooO0O0.OooOO0O(i, 4) || C25638OooO0oO.Oooo0OO(c25638OooO0oO);
    }

    public final void OooO00o(long j) {
        RunnableC22275OooOoo runnableC22275OooOoo = this.f67377OooO0Oo;
        if (j <= 0) {
            runnableC22275OooOoo.run();
            return;
        }
        if (OooO0O0.f67382OooO00o == null) {
            OooO0O0.f67382OooO00o = Executors.newSingleThreadScheduledExecutor();
        }
        OooO0O0.f67382OooO00o.schedule(runnableC22275OooOoo, j, TimeUnit.MILLISECONDS);
    }

    public final void OooO0O0() {
        long jMax;
        boolean z;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                if (this.f67380OooO0oO == OooO0OO.f67385OooOoO) {
                    jMax = Math.max(this.f67373OooO + ((long) 100), jUptimeMillis);
                    this.f67381OooO0oo = jUptimeMillis;
                    this.f67380OooO0oO = OooO0OO.f67383OooOo;
                    z = true;
                } else {
                    this.f67380OooO0oO = OooO0OO.f67384OooOo0o;
                    jMax = 0;
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            OooO00o(jMax - jUptimeMillis);
        }
    }

    public final void OooO0OO() {
        long jMax;
        boolean z;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                if (OooO0Oo(this.f67379OooO0o0, this.f67378OooO0o)) {
                    int iOrdinal = this.f67380OooO0oO.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 2) {
                            this.f67380OooO0oO = OooO0OO.f67385OooOoO;
                        }
                        z = false;
                        jMax = 0;
                    } else {
                        jMax = Math.max(this.f67373OooO + ((long) 100), jUptimeMillis);
                        this.f67381OooO0oo = jUptimeMillis;
                        this.f67380OooO0oO = OooO0OO.f67383OooOo;
                        z = true;
                    }
                    if (z) {
                        OooO00o(jMax - jUptimeMillis);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean OooO0o0(C25638OooO0oO c25638OooO0oO, int i) {
        C25638OooO0oO c25638OooO0oO2;
        if (!OooO0Oo(c25638OooO0oO, i)) {
            return false;
        }
        synchronized (this) {
            c25638OooO0oO2 = this.f67379OooO0o0;
            this.f67379OooO0o0 = C25638OooO0oO.OooO00o(c25638OooO0oO);
            this.f67378OooO0o = i;
        }
        C25638OooO0oO.OooO0OO(c25638OooO0oO2);
        return true;
    }
}
