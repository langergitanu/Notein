package oO00o0o0;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import oO0OOOOo.C32978OooOOo0;
import oO0OooOO.AbstractC33500OooOOOo;
import ooOOo0.C35111OooO0Oo;
import ooOOo0.EnumC35110OooO0OO;

/* JADX INFO: renamed from: oO00o0o0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32377OooO0O0 extends AbstractC33500OooOOOo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C20223OooO0O0 f116413OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final ThreadFactoryC32380OooO0o f116414OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int f116415OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO0OO f116416OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicReference<C20223OooO0O0> f116417OooO00o;

    /* JADX INFO: renamed from: oO00o0o0.OooO0O0$OooO00o */
    public static final class OooO00o extends AbstractC33500OooOOOo.OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final oO0OOO00.OooO00o f116418OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C35111OooO0Oo f116419OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final OooO0OO f116420OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final C35111OooO0Oo f116421OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public volatile boolean f116422OooOoOO;

        public OooO00o(OooO0OO oooO0OO) {
            this.f116420OooOoO = oooO0OO;
            C35111OooO0Oo c35111OooO0Oo = new C35111OooO0Oo();
            this.f116419OooOo0o = c35111OooO0Oo;
            oO0OOO00.OooO00o oooO00o = new oO0OOO00.OooO00o();
            this.f116418OooOo = oooO00o;
            C35111OooO0Oo c35111OooO0Oo2 = new C35111OooO0Oo();
            this.f116421OooOoO0 = c35111OooO0Oo2;
            c35111OooO0Oo2.OooO00o(c35111OooO0Oo);
            c35111OooO0Oo2.OooO00o(oooO00o);
        }

        @Override // oO0OooOO.AbstractC33500OooOOOo.OooO0O0
        public final oO0OOO00.OooO0O0 OooO00o(Runnable runnable, TimeUnit timeUnit) {
            return this.f116422OooOoOO ? EnumC35110OooO0OO.f126094OooOo0o : this.f116420OooOoO.OooO0OO(runnable, TimeUnit.NANOSECONDS, this.f116418OooOo);
        }

        @Override // oO0OooOO.AbstractC33500OooOOOo.OooO0O0
        public final void OooO0O0(C32978OooOOo0.OooO00o oooO00o) {
            if (this.f116422OooOoOO) {
                return;
            }
            this.f116420OooOoO.OooO0OO(oooO00o, TimeUnit.MILLISECONDS, this.f116419OooOo0o);
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            if (this.f116422OooOoOO) {
                return;
            }
            this.f116422OooOoOO = true;
            this.f116421OooOoO0.dispose();
        }
    }

    /* JADX INFO: renamed from: oO00o0o0.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C20223OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f116423OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO0OO[] f116424OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public long f116425OooO0OO;

        public C20223OooO0O0(int i, ThreadFactoryC32380OooO0o threadFactoryC32380OooO0o) {
            this.f116423OooO00o = i;
            this.f116424OooO0O0 = new OooO0OO[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f116424OooO0O0[i2] = new OooO0OO(threadFactoryC32380OooO0o);
            }
        }
    }

    /* JADX INFO: renamed from: oO00o0o0.OooO0O0$OooO0OO */
    public static final class OooO0OO extends C32381OooO0o0 {
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        f116415OooO0Oo = iAvailableProcessors;
        OooO0OO oooO0OO = new OooO0OO(new ThreadFactoryC32380OooO0o("RxComputationShutdown"));
        f116416OooO0o0 = oooO0OO;
        oooO0OO.dispose();
        ThreadFactoryC32380OooO0o threadFactoryC32380OooO0o = new ThreadFactoryC32380OooO0o("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f116414OooO0OO = threadFactoryC32380OooO0o;
        C20223OooO0O0 c20223OooO0O0 = new C20223OooO0O0(0, threadFactoryC32380OooO0o);
        f116413OooO0O0 = c20223OooO0O0;
        for (OooO0OO oooO0OO2 : c20223OooO0O0.f116424OooO0O0) {
            oooO0OO2.dispose();
        }
    }

    public C32377OooO0O0() {
        AtomicReference<C20223OooO0O0> atomicReference;
        ThreadFactoryC32380OooO0o threadFactoryC32380OooO0o = f116414OooO0OO;
        C20223OooO0O0 c20223OooO0O0 = f116413OooO0O0;
        this.f116417OooO00o = new AtomicReference<>(c20223OooO0O0);
        C20223OooO0O0 c20223OooO0O02 = new C20223OooO0O0(f116415OooO0Oo, threadFactoryC32380OooO0o);
        do {
            atomicReference = this.f116417OooO00o;
            if (atomicReference.compareAndSet(c20223OooO0O0, c20223OooO0O02)) {
                return;
            }
        } while (atomicReference.get() == c20223OooO0O0);
        for (OooO0OO oooO0OO : c20223OooO0O02.f116424OooO0O0) {
            oooO0OO.dispose();
        }
    }

    @Override // oO0OooOO.AbstractC33500OooOOOo
    public final AbstractC33500OooOOOo.OooO0O0 OooO00o() {
        OooO0OO oooO0OO;
        C20223OooO0O0 c20223OooO0O0 = this.f116417OooO00o.get();
        int i = c20223OooO0O0.f116423OooO00o;
        if (i == 0) {
            oooO0OO = f116416OooO0o0;
        } else {
            long j = c20223OooO0O0.f116425OooO0OO;
            c20223OooO0O0.f116425OooO0OO = 1 + j;
            oooO0OO = c20223OooO0O0.f116424OooO0O0[(int) (j % ((long) i))];
        }
        return new OooO00o(oooO0OO);
    }

    @Override // oO0OooOO.AbstractC33500OooOOOo
    public final oO0OOO00.OooO0O0 OooO0OO(Runnable runnable) {
        OooO0OO oooO0OO;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        C20223OooO0O0 c20223OooO0O0 = this.f116417OooO00o.get();
        int i = c20223OooO0O0.f116423OooO00o;
        if (i == 0) {
            oooO0OO = f116416OooO0o0;
        } else {
            long j = c20223OooO0O0.f116425OooO0OO;
            c20223OooO0O0.f116425OooO0OO = 1 + j;
            oooO0OO = c20223OooO0O0.f116424OooO0O0[(int) (j % ((long) i))];
        }
        oooO0OO.getClass();
        CallableC32382OooO0oO callableC32382OooO0oO = new CallableC32382OooO0oO(runnable);
        try {
            callableC32382OooO0oO.OooO00o(oooO0OO.f116449OooOo0o.submit(callableC32382OooO0oO));
            return callableC32382OooO0oO;
        } catch (RejectedExecutionException e) {
            oO0OOO0O.OooO00o.OooO0O0(e);
            return EnumC35110OooO0OO.f126094OooOo0o;
        }
    }
}
