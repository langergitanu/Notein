package oO0OOOOo;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o0o0OO0.C30416Oooo0OO;
import oO0OOOo0.EnumC33007OooO0oO;
import oO0OooOO.AbstractC33491OooO0o0;
import oO0OooOO.EnumC33486OooO00o;
import oO0OooOO.InterfaceC33490OooO0o;
import oO0OooOO.InterfaceC33492OooO0oO;
import oO0OooOO.InterfaceC33493OooO0oo;
import ooOOo0.C35112OooO0o0;
import ooOOo0.EnumC35109OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO<T> extends AbstractC33491OooO0o0<T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC33492OooO0oO<T> f119211OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final EnumC33486OooO00o f119212OooOoO0;

    public static abstract class OooO00o<T> extends AtomicLong implements InterfaceC33490OooO0o<T>, oOO00OOO.OooO0OO {
        private static final long serialVersionUID = 7326289992464377023L;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final C35112OooO0o0 f119213OooOo = new C35112OooO0o0();

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33493OooO0oo f119214OooOo0o;

        public OooO00o(InterfaceC33493OooO0oo interfaceC33493OooO0oo) {
            this.f119214OooOo0o = interfaceC33493OooO0oo;
        }

        public final void OooO00o() {
            C35112OooO0o0 c35112OooO0o0 = this.f119213OooOo;
            if (c35112OooO0o0.OooO00o()) {
                return;
            }
            try {
                this.f119214OooOo0o.onComplete();
            } finally {
                EnumC35109OooO0O0.OooO00o(c35112OooO0o0);
            }
        }

        public final boolean OooO0O0(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            C35112OooO0o0 c35112OooO0o0 = this.f119213OooOo;
            if (c35112OooO0o0.OooO00o()) {
                return false;
            }
            try {
                this.f119214OooOo0o.onError(th);
                EnumC35109OooO0O0.OooO00o(c35112OooO0o0);
                return true;
            } catch (Throwable th2) {
                EnumC35109OooO0O0.OooO00o(c35112OooO0o0);
                throw th2;
            }
        }

        public final void OooO0OO(Throwable th) {
            if (OooO0o(th)) {
                return;
            }
            oO0OOO0O.OooO00o.OooO0O0(th);
        }

        public void OooO0Oo() {
        }

        public boolean OooO0o(Throwable th) {
            return OooO0O0(th);
        }

        public void OooO0o0() {
        }

        @Override // oOO00OOO.OooO0OO
        public final void cancel() {
            C35112OooO0o0 c35112OooO0o0 = this.f119213OooOo;
            c35112OooO0o0.getClass();
            EnumC35109OooO0O0.OooO00o(c35112OooO0o0);
            OooO0o0();
        }

        @Override // oOO00OOO.OooO0OO
        public final void request(long j) {
            if (EnumC33007OooO0oO.OooO0OO(j)) {
                o00000.OooOO0.OooO0O0(this, j);
                OooO0Oo();
            }
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public final String toString() {
            return OooO0O0.OooO00o.OooO0O0(getClass().getSimpleName(), "{", super.toString(), "}");
        }
    }

    public static final class OooO0O0<T> extends OooO00o<T> {
        private static final long serialVersionUID = 2427151001689639875L;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public Throwable f119215OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final oO0OOO0o.OooO0O0<T> f119216OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public volatile boolean f119217OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final AtomicInteger f119218OooOoo0;

        public OooO0O0(InterfaceC33493OooO0oo interfaceC33493OooO0oo, int i) {
            super(interfaceC33493OooO0oo);
            this.f119216OooOoO0 = new oO0OOO0o.OooO0O0<>(i);
            this.f119218OooOoo0 = new AtomicInteger();
        }

        @Override // oO0OOOOo.OooO0OO.OooO00o
        public final void OooO0Oo() {
            OooO0oO();
        }

        @Override // oO0OOOOo.OooO0OO.OooO00o
        public final boolean OooO0o(Throwable th) {
            if (this.f119217OooOoOO || this.f119213OooOo.OooO00o()) {
                return false;
            }
            this.f119215OooOoO = th;
            this.f119217OooOoOO = true;
            OooO0oO();
            return true;
        }

        @Override // oO0OOOOo.OooO0OO.OooO00o
        public final void OooO0o0() {
            if (this.f119218OooOoo0.getAndIncrement() == 0) {
                this.f119216OooOoO0.clear();
            }
        }

        public final void OooO0oO() {
            if (this.f119218OooOoo0.getAndIncrement() != 0) {
                return;
            }
            InterfaceC33493OooO0oo interfaceC33493OooO0oo = this.f119214OooOo0o;
            oO0OOO0o.OooO0O0<T> oooO0O0 = this.f119216OooOoO0;
            int iAddAndGet = 1;
            do {
                long j = get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.f119213OooOo.OooO00o()) {
                        oooO0O0.clear();
                        return;
                    }
                    boolean z = this.f119217OooOoOO;
                    T tPoll = oooO0O0.poll();
                    boolean z2 = tPoll == null;
                    if (z && z2) {
                        Throwable th = this.f119215OooOoO;
                        if (th != null) {
                            OooO0O0(th);
                            return;
                        } else {
                            OooO00o();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    interfaceC33493OooO0oo.onNext(tPoll);
                    j2++;
                }
                if (j2 == j) {
                    if (this.f119213OooOo.OooO00o()) {
                        oooO0O0.clear();
                        return;
                    }
                    boolean z3 = this.f119217OooOoOO;
                    boolean zIsEmpty = oooO0O0.isEmpty();
                    if (z3 && zIsEmpty) {
                        Throwable th2 = this.f119215OooOoO;
                        if (th2 != null) {
                            OooO0O0(th2);
                            return;
                        } else {
                            OooO00o();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    o00000.OooOO0.OooO(this, j2);
                }
                iAddAndGet = this.f119218OooOoo0.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // oO0OooOO.InterfaceC33490OooO0o
        public final void onNext(T t) {
            if (this.f119217OooOoOO || this.f119213OooOo.OooO00o()) {
                return;
            }
            if (t == null) {
                OooO0OO(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.f119216OooOoO0.offer(t);
                OooO0oO();
            }
        }
    }

    /* JADX INFO: renamed from: oO0OOOOo.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static final class C20291OooO0OO<T> extends AbstractC32970OooO0oO<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        @Override // oO0OOOOo.OooO0OO.AbstractC32970OooO0oO
        public final void OooO0oO() {
        }
    }

    public static final class OooO0Oo<T> extends AbstractC32970OooO0oO<T> {
        private static final long serialVersionUID = 338953216916120960L;

        @Override // oO0OOOOo.OooO0OO.AbstractC32970OooO0oO
        public final void OooO0oO() {
            OooO0OO(new oO00o00O.OooO0O0("create: could not emit value due to lack of requests"));
        }
    }

    public static final class OooO0o<T> extends OooO00o<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        @Override // oO0OooOO.InterfaceC33490OooO0o
        public final void onNext(T t) {
            long j;
            if (this.f119213OooOo.OooO00o()) {
                return;
            }
            if (t == null) {
                OooO0OO(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            this.f119214OooOo0o.onNext(t);
            do {
                j = get();
                if (j == 0) {
                    return;
                }
            } while (!compareAndSet(j, j - 1));
        }
    }

    /* JADX INFO: renamed from: oO0OOOOo.OooO0OO$OooO0o0, reason: case insensitive filesystem */
    public static final class C32969OooO0o0<T> extends OooO00o<T> {
        private static final long serialVersionUID = 4023437720691792495L;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public Throwable f119219OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final AtomicReference<T> f119220OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public volatile boolean f119221OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final AtomicInteger f119222OooOoo0;

        public C32969OooO0o0(InterfaceC33493OooO0oo interfaceC33493OooO0oo) {
            super(interfaceC33493OooO0oo);
            this.f119220OooOoO0 = new AtomicReference<>();
            this.f119222OooOoo0 = new AtomicInteger();
        }

        @Override // oO0OOOOo.OooO0OO.OooO00o
        public final void OooO0Oo() {
            OooO0oO();
        }

        @Override // oO0OOOOo.OooO0OO.OooO00o
        public final boolean OooO0o(Throwable th) {
            if (this.f119221OooOoOO || this.f119213OooOo.OooO00o()) {
                return false;
            }
            this.f119219OooOoO = th;
            this.f119221OooOoOO = true;
            OooO0oO();
            return true;
        }

        @Override // oO0OOOOo.OooO0OO.OooO00o
        public final void OooO0o0() {
            if (this.f119222OooOoo0.getAndIncrement() == 0) {
                this.f119220OooOoO0.lazySet(null);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
        
            if (r9 != r5) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
        
            if (r17.f119213OooOo.OooO00o() == false) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
        
            r2.lazySet(null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
        
            r5 = r17.f119221OooOoOO;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
        
            if (r2.get() != null) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
        
            r12 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0069, code lost:
        
            if (r5 == false) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x006b, code lost:
        
            if (r12 == false) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x006d, code lost:
        
            r1 = r17.f119219OooOoO;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x006f, code lost:
        
            if (r1 == null) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0071, code lost:
        
            OooO0O0(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0074, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0075, code lost:
        
            OooO00o();
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0078, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x007b, code lost:
        
            if (r9 == 0) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x007d, code lost:
        
            o00000.OooOO0.OooO(r17, r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0080, code lost:
        
            r4 = r17.f119222OooOoo0.addAndGet(-r4);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0oO() {
            if (this.f119222OooOoo0.getAndIncrement() != 0) {
                return;
            }
            InterfaceC33493OooO0oo interfaceC33493OooO0oo = this.f119214OooOo0o;
            AtomicReference<T> atomicReference = this.f119220OooOoO0;
            int iAddAndGet = 1;
            do {
                long j = get();
                long j2 = 0;
                while (true) {
                    boolean z = false;
                    if (j2 == j) {
                        break;
                    }
                    if (this.f119213OooOo.OooO00o()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z2 = this.f119221OooOoOO;
                    T andSet = atomicReference.getAndSet(null);
                    boolean z3 = andSet == null;
                    if (z2 && z3) {
                        Throwable th = this.f119219OooOoO;
                        if (th != null) {
                            OooO0O0(th);
                            return;
                        } else {
                            OooO00o();
                            return;
                        }
                    }
                    if (z3) {
                        break;
                    }
                    interfaceC33493OooO0oo.onNext(andSet);
                    j2++;
                }
            } while (iAddAndGet != 0);
        }

        @Override // oO0OooOO.InterfaceC33490OooO0o
        public final void onNext(T t) {
            if (this.f119221OooOoOO || this.f119213OooOo.OooO00o()) {
                return;
            }
            if (t == null) {
                OooO0OO(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.f119220OooOoO0.set(t);
                OooO0oO();
            }
        }
    }

    /* JADX INFO: renamed from: oO0OOOOo.OooO0OO$OooO0oO, reason: case insensitive filesystem */
    public static abstract class AbstractC32970OooO0oO<T> extends OooO00o<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        public abstract void OooO0oO();

        @Override // oO0OooOO.InterfaceC33490OooO0o
        public final void onNext(T t) {
            if (this.f119213OooOo.OooO00o()) {
                return;
            }
            if (t == null) {
                OooO0OO(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (get() == 0) {
                OooO0oO();
            } else {
                this.f119214OooOo0o.onNext(t);
                o00000.OooOO0.OooO(this, 1L);
            }
        }
    }

    public OooO0OO(InterfaceC33492OooO0oO interfaceC33492OooO0oO) {
        EnumC33486OooO00o enumC33486OooO00o = EnumC33486OooO00o.f120995OooOo0o;
        this.f119211OooOo = interfaceC33492OooO0oO;
        this.f119212OooOoO0 = enumC33486OooO00o;
    }

    @Override // oO0OooOO.AbstractC33491OooO0o0
    public final void OooO0Oo(oOO00OOO.OooO0O0<? super T> oooO0O0) {
        OooO00o oooO0o;
        int iOrdinal = this.f119212OooOoO0.ordinal();
        if (iOrdinal == 0) {
            oooO0o = new OooO0o((InterfaceC33493OooO0oo) oooO0O0);
        } else if (iOrdinal == 1) {
            oooO0o = new OooO0Oo((InterfaceC33493OooO0oo) oooO0O0);
        } else if (iOrdinal == 3) {
            oooO0o = new C20291OooO0OO((InterfaceC33493OooO0oo) oooO0O0);
        } else if (iOrdinal != 4) {
            oooO0o = new OooO0O0((InterfaceC33493OooO0oo) oooO0O0, AbstractC33491OooO0o0.f120996OooOo0o);
        } else {
            oooO0o = new C32969OooO0o0((InterfaceC33493OooO0oo) oooO0O0);
        }
        oooO0O0.OooO0Oo(oooO0o);
        try {
            this.f119211OooOo.subscribe(oooO0o);
        } catch (Throwable th) {
            C30416Oooo0OO.OooO00o(th);
            oooO0o.OooO0OO(th);
        }
    }
}
