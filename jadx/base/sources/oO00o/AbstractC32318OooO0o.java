package oO00o;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import oO00oOO.C32419OooO0o0;
import oO0OO0oO.InterfaceC32925OooO0O0;

/* JADX INFO: renamed from: oO00o.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32318OooO0o {

    /* JADX INFO: renamed from: oO00o.OooO0o$OooO00o */
    public static final class OooO00o implements InterfaceC32925OooO0O0, Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final OooO0O0 f116232OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Runnable f116233OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public Thread f116234OooOoO0;

        public OooO00o(Runnable runnable, OooO0O0 oooO0O0) {
            this.f116233OooOo0o = runnable;
            this.f116232OooOo = oooO0O0;
        }

        @Override // oO0OO0oO.InterfaceC32925OooO0O0
        public final void dispose() {
            if (this.f116234OooOoO0 == Thread.currentThread()) {
                OooO0O0 oooO0O0 = this.f116232OooOo;
                if (oooO0O0 instanceof C32419OooO0o0) {
                    C32419OooO0o0 c32419OooO0o0 = (C32419OooO0o0) oooO0O0;
                    if (c32419OooO0o0.f116572OooOo) {
                        return;
                    }
                    c32419OooO0o0.f116572OooOo = true;
                    c32419OooO0o0.f116573OooOo0o.shutdown();
                    return;
                }
            }
            this.f116232OooOo.dispose();
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f116234OooOoO0 = Thread.currentThread();
            try {
                this.f116233OooOo0o.run();
            } finally {
                dispose();
                this.f116234OooOoO0 = null;
            }
        }
    }

    /* JADX INFO: renamed from: oO00o.OooO0o$OooO0O0 */
    public static abstract class OooO0O0 implements InterfaceC32925OooO0O0 {
        public abstract InterfaceC32925OooO0O0 OooO00o(Runnable runnable, long j, TimeUnit timeUnit);

        public void OooO0O0(Runnable runnable) {
            OooO00o(runnable, 0L, TimeUnit.NANOSECONDS);
        }
    }

    static {
        TimeUnit.MINUTES.toNanos(Long.getLong("rx3.scheduler.drift-tolerance", 15L).longValue());
    }

    public abstract OooO0O0 OooO00o();

    public InterfaceC32925OooO0O0 OooO0O0(Runnable runnable) {
        return OooO0OO(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public InterfaceC32925OooO0O0 OooO0OO(Runnable runnable, long j, TimeUnit timeUnit) {
        OooO0O0 oooO0O0OooO00o = OooO00o();
        Objects.requireNonNull(runnable, "run is null");
        OooO00o oooO00o = new OooO00o(runnable, oooO0O0OooO00o);
        oooO0O0OooO00o.OooO00o(oooO00o, j, timeUnit);
        return oooO00o;
    }
}
