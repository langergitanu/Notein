package oO0OooOO;

import java.util.concurrent.TimeUnit;
import oO00o0o0.C32381OooO0o0;
import oO0OOOOo.C32978OooOOo0;

/* JADX INFO: renamed from: oO0OooOO.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33500OooOOOo {

    /* JADX INFO: renamed from: oO0OooOO.OooOOOo$OooO00o */
    public static final class OooO00o implements oO0OOO00.OooO0O0, Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final OooO0O0 f120997OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Runnable f120998OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public Thread f120999OooOoO0;

        public OooO00o(Runnable runnable, OooO0O0 oooO0O0) {
            this.f120998OooOo0o = runnable;
            this.f120997OooOo = oooO0O0;
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            if (this.f120999OooOoO0 == Thread.currentThread()) {
                OooO0O0 oooO0O0 = this.f120997OooOo;
                if (oooO0O0 instanceof C32381OooO0o0) {
                    C32381OooO0o0 c32381OooO0o0 = (C32381OooO0o0) oooO0O0;
                    if (c32381OooO0o0.f116448OooOo) {
                        return;
                    }
                    c32381OooO0o0.f116448OooOo = true;
                    c32381OooO0o0.f116449OooOo0o.shutdown();
                    return;
                }
            }
            this.f120997OooOo.dispose();
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f120999OooOoO0 = Thread.currentThread();
            try {
                this.f120998OooOo0o.run();
            } finally {
                dispose();
                this.f120999OooOoO0 = null;
            }
        }
    }

    /* JADX INFO: renamed from: oO0OooOO.OooOOOo$OooO0O0 */
    public static abstract class OooO0O0 implements oO0OOO00.OooO0O0 {
        public abstract oO0OOO00.OooO0O0 OooO00o(Runnable runnable, TimeUnit timeUnit);

        public void OooO0O0(C32978OooOOo0.OooO00o oooO00o) {
            OooO00o(oooO00o, TimeUnit.NANOSECONDS);
        }
    }

    static {
        TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15L).longValue());
    }

    public abstract OooO0O0 OooO00o();

    public oO0OOO00.OooO0O0 OooO0O0(Runnable runnable) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        return OooO0OO(runnable);
    }

    public oO0OOO00.OooO0O0 OooO0OO(Runnable runnable) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        OooO0O0 oooO0O0OooO00o = OooO00o();
        OooO00o oooO00o = new OooO00o(runnable, oooO0O0OooO00o);
        oooO0O0OooO00o.OooO00o(oooO00o, timeUnit);
        return oooO00o;
    }
}
