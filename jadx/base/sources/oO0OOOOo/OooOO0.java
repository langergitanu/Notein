package oO0OOOOo;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o0Oo0oOo.o00Oo0;
import o0o0OO0.C30416Oooo0OO;
import oO00o00o.InterfaceC32331OooO0OO;
import oO00o0oO.C32388OooO0OO;
import oO00o0oO.C32390OooO0o;
import oO0OOOo0.EnumC33007OooO0oO;
import oO0OooOO.AbstractC33491OooO0o0;
import oO0OooOO.InterfaceC33493OooO0oo;
import oO0OooOO.InterfaceC33495OooOO0O;
import oO0OooOO.InterfaceC33496OooOO0o;
import ooOOo0.EnumC35109OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0<T, R> extends oO0OOOOo.OooO00o<T, R> {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f119247OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final InterfaceC32331OooO0OO<? super T, ? extends InterfaceC33496OooOO0o<? extends R>> f119248OooOoO0;

    public static final class OooO00o<T, R> extends AtomicInteger implements InterfaceC33493OooO0oo<T>, oOO00OOO.OooO0OO {
        private static final long serialVersionUID = 8600231336733376951L;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final int f119249OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33493OooO0oo f119250OooOo0o;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public final InterfaceC32331OooO0OO<? super T, ? extends InterfaceC33496OooOO0o<? extends R>> f119254OooOoo;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public oOO00OOO.OooO0OO f119257OooOooo;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public volatile boolean f119258Oooo000;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final AtomicLong f119252OooOoO0 = new AtomicLong();

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final oO0OOO00.OooO00o f119251OooOoO = new oO0OOO00.OooO00o();

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final C32388OooO0OO f119255OooOoo0 = new C32388OooO0OO();

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final AtomicInteger f119253OooOoOO = new AtomicInteger(1);

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public final AtomicReference<oO0OOO0o.OooO0O0<R>> f119256OooOooO = new AtomicReference<>();

        /* JADX INFO: renamed from: oO0OOOOo.OooOO0$OooO00o$OooO00o, reason: collision with other inner class name */
        public final class C20292OooO00o extends AtomicReference<oO0OOO00.OooO0O0> implements InterfaceC33495OooOO0O<R>, oO0OOO00.OooO0O0 {
            private static final long serialVersionUID = -502562646270949838L;

            public C20292OooO00o() {
            }

            @Override // oO0OooOO.InterfaceC33495OooOO0O
            public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
                EnumC35109OooO0O0.OooO0Oo(this, oooO0O0);
            }

            @Override // oO0OOO00.OooO0O0
            public final void dispose() {
                EnumC35109OooO0O0.OooO00o(this);
            }

            @Override // oO0OooOO.InterfaceC33495OooOO0O
            public final void onComplete() {
                OooO00o oooO00o = OooO00o.this;
                oooO00o.f119251OooOoO.OooO0OO(this);
                int i = oooO00o.get();
                AtomicInteger atomicInteger = oooO00o.f119253OooOoOO;
                int i2 = oooO00o.f119249OooOo;
                if (i == 0) {
                    if (oooO00o.compareAndSet(0, 1)) {
                        boolean z = atomicInteger.decrementAndGet() == 0;
                        oO0OOO0o.OooO0O0<R> oooO0O0 = oooO00o.f119256OooOooO.get();
                        if (!z || (oooO0O0 != null && !oooO0O0.isEmpty())) {
                            if (i2 != Integer.MAX_VALUE) {
                                oooO00o.f119257OooOooo.request(1L);
                            }
                            if (oooO00o.decrementAndGet() == 0) {
                                return;
                            }
                            oooO00o.OooO0o0();
                            return;
                        }
                        C32388OooO0OO c32388OooO0OO = oooO00o.f119255OooOoo0;
                        c32388OooO0OO.getClass();
                        Throwable thOooO0O0 = C32390OooO0o.OooO0O0(c32388OooO0OO);
                        InterfaceC33493OooO0oo interfaceC33493OooO0oo = oooO00o.f119250OooOo0o;
                        if (thOooO0O0 != null) {
                            interfaceC33493OooO0oo.onError(thOooO0O0);
                            return;
                        } else {
                            interfaceC33493OooO0oo.onComplete();
                            return;
                        }
                    }
                }
                atomicInteger.decrementAndGet();
                if (i2 != Integer.MAX_VALUE) {
                    oooO00o.f119257OooOooo.request(1L);
                }
                oooO00o.OooO0O0();
            }

            @Override // oO0OooOO.InterfaceC33495OooOO0O
            public final void onError(Throwable th) {
                OooO00o oooO00o = OooO00o.this;
                oO0OOO00.OooO00o oooO00o2 = oooO00o.f119251OooOoO;
                oooO00o2.OooO0OO(this);
                C32388OooO0OO c32388OooO0OO = oooO00o.f119255OooOoo0;
                c32388OooO0OO.getClass();
                if (!C32390OooO0o.OooO00o(c32388OooO0OO, th)) {
                    oO0OOO0O.OooO00o.OooO0O0(th);
                    return;
                }
                oooO00o.f119257OooOooo.cancel();
                oooO00o2.dispose();
                oooO00o.f119253OooOoOO.decrementAndGet();
                oooO00o.OooO0O0();
            }

            /* JADX WARN: Removed duplicated region for block: B:35:0x007f  */
            @Override // oO0OooOO.InterfaceC33495OooOO0O
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onSuccess(R r) {
                OooO00o oooO00o = OooO00o.this;
                oooO00o.f119251OooOoO.OooO0OO(this);
                if (oooO00o.get() == 0) {
                    if (oooO00o.compareAndSet(0, 1)) {
                        boolean z = oooO00o.f119253OooOoOO.decrementAndGet() == 0;
                        if (oooO00o.f119252OooOoO0.get() != 0) {
                            oooO00o.f119250OooOo0o.onNext(r);
                            oO0OOO0o.OooO0O0<R> oooO0O0 = oooO00o.f119256OooOooO.get();
                            if (z && (oooO0O0 == null || oooO0O0.isEmpty())) {
                                C32388OooO0OO c32388OooO0OO = oooO00o.f119255OooOoo0;
                                c32388OooO0OO.getClass();
                                Throwable thOooO0O0 = C32390OooO0o.OooO0O0(c32388OooO0OO);
                                if (thOooO0O0 != null) {
                                    oooO00o.f119250OooOo0o.onError(thOooO0O0);
                                    return;
                                } else {
                                    oooO00o.f119250OooOo0o.onComplete();
                                    return;
                                }
                            }
                            o00000.OooOO0.OooO(oooO00o.f119252OooOoO0, 1L);
                            if (oooO00o.f119249OooOo != Integer.MAX_VALUE) {
                                oooO00o.f119257OooOooo.request(1L);
                            }
                        } else {
                            oO0OOO0o.OooO0O0<R> oooO0O0OooO0o = oooO00o.OooO0o();
                            synchronized (oooO0O0OooO0o) {
                                oooO0O0OooO0o.offer(r);
                            }
                        }
                        if (oooO00o.decrementAndGet() == 0) {
                            return;
                        }
                    } else {
                        oO0OOO0o.OooO0O0<R> oooO0O0OooO0o2 = oooO00o.OooO0o();
                        synchronized (oooO0O0OooO0o2) {
                            oooO0O0OooO0o2.offer(r);
                        }
                        oooO00o.f119253OooOoOO.decrementAndGet();
                        if (oooO00o.getAndIncrement() != 0) {
                            return;
                        }
                    }
                }
                oooO00o.OooO0o0();
            }
        }

        public OooO00o(InterfaceC33493OooO0oo interfaceC33493OooO0oo, InterfaceC32331OooO0OO interfaceC32331OooO0OO, int i) {
            this.f119250OooOo0o = interfaceC33493OooO0oo;
            this.f119254OooOoo = interfaceC32331OooO0OO;
            this.f119249OooOo = i;
        }

        public final void OooO00o() {
            oO0OOO0o.OooO0O0<R> oooO0O0 = this.f119256OooOooO.get();
            if (oooO0O0 != null) {
                oooO0O0.clear();
            }
        }

        public final void OooO0O0() {
            if (getAndIncrement() == 0) {
                OooO0o0();
            }
        }

        @Override // oOO00OOO.OooO0O0
        public final void OooO0Oo(oOO00OOO.OooO0OO oooO0OO) {
            if (EnumC33007OooO0oO.OooO0Oo(this.f119257OooOooo, oooO0OO)) {
                this.f119257OooOooo = oooO0OO;
                this.f119250OooOo0o.OooO0Oo(this);
                int i = this.f119249OooOo;
                if (i == Integer.MAX_VALUE) {
                    oooO0OO.request(LocationRequestCompat.PASSIVE_INTERVAL);
                } else {
                    oooO0OO.request(i);
                }
            }
        }

        public final oO0OOO0o.OooO0O0<R> OooO0o() {
            while (true) {
                AtomicReference<oO0OOO0o.OooO0O0<R>> atomicReference = this.f119256OooOooO;
                oO0OOO0o.OooO0O0<R> oooO0O0 = atomicReference.get();
                if (oooO0O0 != null) {
                    return oooO0O0;
                }
                oO0OOO0o.OooO0O0<R> oooO0O02 = new oO0OOO0o.OooO0O0<>(AbstractC33491OooO0o0.f120996OooOo0o);
                while (!atomicReference.compareAndSet(null, oooO0O02)) {
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                return oooO0O02;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0079, code lost:
        
            if (r10 != r6) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
        
            if (r17.f119258Oooo000 == false) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
        
            OooO00o();
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0082, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x008b, code lost:
        
            if (r17.f119255OooOoo0.get() == null) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x008d, code lost:
        
            r2 = r17.f119255OooOoo0;
            r2.getClass();
            r2 = oO00o0oO.C32390OooO0o.OooO0O0(r2);
            OooO00o();
            r1.onError(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x009c, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00a1, code lost:
        
            if (r2.get() != 0) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
        
            r6 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
        
            r6 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00a6, code lost:
        
            r7 = r3.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00ac, code lost:
        
            if (r7 == null) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00b2, code lost:
        
            if (r7.isEmpty() == false) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00b4, code lost:
        
            r13 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00b5, code lost:
        
            if (r6 == false) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00b7, code lost:
        
            if (r13 == false) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00b9, code lost:
        
            r2 = r17.f119255OooOoo0;
            r2.getClass();
            r2 = oO00o0oO.C32390OooO0o.OooO0O0(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00c2, code lost:
        
            if (r2 == null) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00c4, code lost:
        
            r1.onError(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00c7, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00c8, code lost:
        
            r1.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00cb, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00ce, code lost:
        
            if (r10 == 0) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x00d0, code lost:
        
            o00000.OooOO0.OooO(r17.f119252OooOoO0, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00da, code lost:
        
            if (r17.f119249OooOo == Integer.MAX_VALUE) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00dc, code lost:
        
            r17.f119257OooOooo.request(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00e1, code lost:
        
            r5 = addAndGet(-r5);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0o0() {
            InterfaceC33493OooO0oo interfaceC33493OooO0oo = this.f119250OooOo0o;
            AtomicInteger atomicInteger = this.f119253OooOoOO;
            AtomicReference<oO0OOO0o.OooO0O0<R>> atomicReference = this.f119256OooOooO;
            int iAddAndGet = 1;
            do {
                long j = this.f119252OooOoO0.get();
                long j2 = 0;
                while (true) {
                    boolean z = false;
                    if (j2 == j) {
                        break;
                    }
                    if (this.f119258Oooo000) {
                        OooO00o();
                        return;
                    }
                    if (this.f119255OooOoo0.get() != null) {
                        C32388OooO0OO c32388OooO0OO = this.f119255OooOoo0;
                        c32388OooO0OO.getClass();
                        Throwable thOooO0O0 = C32390OooO0o.OooO0O0(c32388OooO0OO);
                        OooO00o();
                        interfaceC33493OooO0oo.onError(thOooO0O0);
                        return;
                    }
                    boolean z2 = atomicInteger.get() == 0;
                    oO0OOO0o.OooO0O0<R> oooO0O0 = atomicReference.get();
                    R rPoll = oooO0O0 != null ? oooO0O0.poll() : null;
                    boolean z3 = rPoll == null;
                    if (z2 && z3) {
                        C32388OooO0OO c32388OooO0OO2 = this.f119255OooOoo0;
                        c32388OooO0OO2.getClass();
                        Throwable thOooO0O02 = C32390OooO0o.OooO0O0(c32388OooO0OO2);
                        if (thOooO0O02 != null) {
                            interfaceC33493OooO0oo.onError(thOooO0O02);
                            return;
                        } else {
                            interfaceC33493OooO0oo.onComplete();
                            return;
                        }
                    }
                    if (z3) {
                        break;
                    }
                    interfaceC33493OooO0oo.onNext(rPoll);
                    j2++;
                }
            } while (iAddAndGet != 0);
        }

        @Override // oOO00OOO.OooO0OO
        public final void cancel() {
            this.f119258Oooo000 = true;
            this.f119257OooOooo.cancel();
            this.f119251OooOoO.dispose();
        }

        @Override // oOO00OOO.OooO0O0
        public final void onComplete() {
            this.f119253OooOoOO.decrementAndGet();
            OooO0O0();
        }

        @Override // oOO00OOO.OooO0O0
        public final void onError(Throwable th) {
            this.f119253OooOoOO.decrementAndGet();
            C32388OooO0OO c32388OooO0OO = this.f119255OooOoo0;
            c32388OooO0OO.getClass();
            if (!C32390OooO0o.OooO00o(c32388OooO0OO, th)) {
                oO0OOO0O.OooO00o.OooO0O0(th);
            } else {
                this.f119251OooOoO.dispose();
                OooO0O0();
            }
        }

        @Override // oOO00OOO.OooO0O0
        public final void onNext(T t) {
            try {
                InterfaceC33496OooOO0o<? extends R> interfaceC33496OooOO0oApply = this.f119254OooOoo.apply(t);
                o00Oo0.OooO00o(interfaceC33496OooOO0oApply, "The mapper returned a null MaybeSource");
                InterfaceC33496OooOO0o<? extends R> interfaceC33496OooOO0o = interfaceC33496OooOO0oApply;
                this.f119253OooOoOO.getAndIncrement();
                C20292OooO00o c20292OooO00o = new C20292OooO00o();
                if (this.f119258Oooo000 || !this.f119251OooOoO.OooO00o(c20292OooO00o)) {
                    return;
                }
                interfaceC33496OooOO0o.OooO00o(c20292OooO00o);
            } catch (Throwable th) {
                C30416Oooo0OO.OooO00o(th);
                this.f119257OooOooo.cancel();
                onError(th);
            }
        }

        @Override // oOO00OOO.OooO0OO
        public final void request(long j) {
            if (EnumC33007OooO0oO.OooO0OO(j)) {
                o00000.OooOO0.OooO0O0(this.f119252OooOoO0, j);
                OooO0O0();
            }
        }
    }

    public OooOO0(AbstractC33491OooO0o0 abstractC33491OooO0o0, InterfaceC32331OooO0OO interfaceC32331OooO0OO) {
        super(abstractC33491OooO0o0);
        this.f119248OooOoO0 = interfaceC32331OooO0OO;
        this.f119247OooOoO = Integer.MAX_VALUE;
    }

    @Override // oO0OooOO.AbstractC33491OooO0o0
    public final void OooO0Oo(oOO00OOO.OooO0O0<? super R> oooO0O0) {
        this.f119186OooOo.OooO0OO(new OooO00o((InterfaceC33493OooO0oo) oooO0O0, this.f119248OooOoO0, this.f119247OooOoO));
    }
}
