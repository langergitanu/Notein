package oO00oOO;

import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import oO00o.AbstractC32318OooO0o;
import oO00oO0.C32399OooO0Oo;
import oO00oO0.EnumC32398OooO0OO;
import oO00oOo0.C32430OooO00o;
import oO0OO0oO.C32924OooO00o;
import oO0OO0oO.InterfaceC32925OooO0O0;

/* JADX INFO: renamed from: oO00oOO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32415OooO0O0 extends AbstractC32318OooO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C20228OooO0O0 f116536OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final ThreadFactoryC32418OooO0o f116537OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int f116538OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO0OO f116539OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicReference<C20228OooO0O0> f116540OooO00o;

    /* JADX INFO: renamed from: oO00oOO.OooO0O0$OooO00o */
    public static final class OooO00o extends AbstractC32318OooO0o.OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final C32924OooO00o f116541OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C32399OooO0Oo f116542OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final OooO0OO f116543OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final C32399OooO0Oo f116544OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public volatile boolean f116545OooOoOO;

        public OooO00o(OooO0OO oooO0OO) {
            this.f116543OooOoO = oooO0OO;
            C32399OooO0Oo c32399OooO0Oo = new C32399OooO0Oo();
            this.f116542OooOo0o = c32399OooO0Oo;
            C32924OooO00o c32924OooO00o = new C32924OooO00o();
            this.f116541OooOo = c32924OooO00o;
            C32399OooO0Oo c32399OooO0Oo2 = new C32399OooO0Oo();
            this.f116544OooOoO0 = c32399OooO0Oo2;
            c32399OooO0Oo2.OooO0OO(c32399OooO0Oo);
            c32399OooO0Oo2.OooO0OO(c32924OooO00o);
        }

        @Override // oO00o.AbstractC32318OooO0o.OooO0O0
        public final InterfaceC32925OooO0O0 OooO00o(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.f116545OooOoOO ? EnumC32398OooO0OO.f116503OooOo0o : this.f116543OooOoO.OooO0OO(runnable, j, timeUnit, this.f116541OooOo);
        }

        @Override // oO00o.AbstractC32318OooO0o.OooO0O0
        public final void OooO0O0(Runnable runnable) {
            if (this.f116545OooOoOO) {
                return;
            }
            this.f116543OooOoO.OooO0OO(runnable, 0L, TimeUnit.MILLISECONDS, this.f116542OooOo0o);
        }

        @Override // oO0OO0oO.InterfaceC32925OooO0O0
        public final void dispose() {
            if (this.f116545OooOoOO) {
                return;
            }
            this.f116545OooOoOO = true;
            this.f116544OooOoO0.dispose();
        }
    }

    /* JADX INFO: renamed from: oO00oOO.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C20228OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f116546OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO0OO[] f116547OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public long f116548OooO0OO;

        public C20228OooO0O0(int i, ThreadFactoryC32418OooO0o threadFactoryC32418OooO0o) {
            this.f116546OooO00o = i;
            this.f116547OooO0O0 = new OooO0OO[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f116547OooO0O0[i2] = new OooO0OO(threadFactoryC32418OooO0o);
            }
        }
    }

    /* JADX INFO: renamed from: oO00oOO.OooO0O0$OooO0OO */
    public static final class OooO0OO extends C32419OooO0o0 {
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx3.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        f116538OooO0Oo = iAvailableProcessors;
        OooO0OO oooO0OO = new OooO0OO(new ThreadFactoryC32418OooO0o("RxComputationShutdown"));
        f116539OooO0o0 = oooO0OO;
        oooO0OO.dispose();
        ThreadFactoryC32418OooO0o threadFactoryC32418OooO0o = new ThreadFactoryC32418OooO0o("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx3.computation-priority", 5).intValue())), true);
        f116537OooO0OO = threadFactoryC32418OooO0o;
        C20228OooO0O0 c20228OooO0O0 = new C20228OooO0O0(0, threadFactoryC32418OooO0o);
        f116536OooO0O0 = c20228OooO0O0;
        for (OooO0OO oooO0OO2 : c20228OooO0O0.f116547OooO0O0) {
            oooO0OO2.dispose();
        }
    }

    public C32415OooO0O0() {
        AtomicReference<C20228OooO0O0> atomicReference;
        ThreadFactoryC32418OooO0o threadFactoryC32418OooO0o = f116537OooO0OO;
        C20228OooO0O0 c20228OooO0O0 = f116536OooO0O0;
        this.f116540OooO00o = new AtomicReference<>(c20228OooO0O0);
        C20228OooO0O0 c20228OooO0O02 = new C20228OooO0O0(f116538OooO0Oo, threadFactoryC32418OooO0o);
        do {
            atomicReference = this.f116540OooO00o;
            if (atomicReference.compareAndSet(c20228OooO0O0, c20228OooO0O02)) {
                return;
            }
        } while (atomicReference.get() == c20228OooO0O0);
        for (OooO0OO oooO0OO : c20228OooO0O02.f116547OooO0O0) {
            oooO0OO.dispose();
        }
    }

    @Override // oO00o.AbstractC32318OooO0o
    public final AbstractC32318OooO0o.OooO0O0 OooO00o() {
        OooO0OO oooO0OO;
        C20228OooO0O0 c20228OooO0O0 = this.f116540OooO00o.get();
        int i = c20228OooO0O0.f116546OooO00o;
        if (i == 0) {
            oooO0OO = f116539OooO0o0;
        } else {
            long j = c20228OooO0O0.f116548OooO0OO;
            c20228OooO0O0.f116548OooO0OO = 1 + j;
            oooO0OO = c20228OooO0O0.f116547OooO0O0[(int) (j % ((long) i))];
        }
        return new OooO00o(oooO0OO);
    }

    @Override // oO00o.AbstractC32318OooO0o
    public final InterfaceC32925OooO0O0 OooO0OO(Runnable runnable, long j, TimeUnit timeUnit) {
        OooO0OO oooO0OO;
        C20228OooO0O0 c20228OooO0O0 = this.f116540OooO00o.get();
        int i = c20228OooO0O0.f116546OooO00o;
        if (i == 0) {
            oooO0OO = f116539OooO0o0;
        } else {
            long j2 = c20228OooO0O0.f116548OooO0OO;
            c20228OooO0O0.f116548OooO0OO = 1 + j2;
            oooO0OO = c20228OooO0O0.f116547OooO0O0[(int) (j2 % ((long) i))];
        }
        oooO0OO.getClass();
        Objects.requireNonNull(runnable, "run is null");
        CallableC32420OooO0oO callableC32420OooO0oO = new CallableC32420OooO0oO(runnable);
        ScheduledExecutorService scheduledExecutorService = oooO0OO.f116573OooOo0o;
        try {
            callableC32420OooO0oO.OooO00o(j <= 0 ? scheduledExecutorService.submit(callableC32420OooO0oO) : scheduledExecutorService.schedule(callableC32420OooO0oO, j, timeUnit));
            return callableC32420OooO0oO;
        } catch (RejectedExecutionException e) {
            C32430OooO00o.OooO00o(e);
            return EnumC32398OooO0OO.f116503OooOo0o;
        }
    }
}
