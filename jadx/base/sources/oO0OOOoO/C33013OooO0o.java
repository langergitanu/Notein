package oO0OOOoO;

import OooOoO.C20503OooO00o;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o0o0OO0.C30416Oooo0OO;
import oO00o0oO.C32388OooO0OO;
import oO00o0oO.C32390OooO0o;
import oO0OOO0o.C32939OooO00o;
import oO0OOOoo.InterfaceC33022OooO;
import oO0OOOoo.InterfaceC33028OooO0o0;
import oO0OOOoo.InterfaceC33031OooOO0;
import oO0OooOO.AbstractC33498OooOOO0;
import oO0OooOO.InterfaceC33497OooOOO;
import oO0OooOO.InterfaceC33499OooOOOO;
import ooOOo0.EnumC35109OooO0O0;
import ooOOo0.EnumC35110OooO0OO;

/* JADX INFO: renamed from: oO0OOOoO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33013OooO0o<T, U> extends AbstractC33009OooO00o<T, U> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C20503OooO00o f119423OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f119424OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f119425OooOoO0;

    /* JADX INFO: renamed from: oO0OOOoO.OooO0o$OooO00o */
    public static final class OooO00o<T, U> extends AtomicReference<oO0OOO00.OooO0O0> implements InterfaceC33499OooOOOO<U> {
        private static final long serialVersionUID = -4606175640614850599L;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final OooO0O0<T, U> f119426OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final long f119427OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public volatile InterfaceC33031OooOO0<U> f119428OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public volatile boolean f119429OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public int f119430OooOoOO;

        public OooO00o(OooO0O0<T, U> oooO0O0, long j) {
            this.f119427OooOo0o = j;
            this.f119426OooOo = oooO0O0;
        }

        @Override // oO0OooOO.InterfaceC33499OooOOOO
        public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) throws Exception {
            if (EnumC35109OooO0O0.OooO0Oo(this, oooO0O0) && (oooO0O0 instanceof InterfaceC33028OooO0o0)) {
                InterfaceC33028OooO0o0 interfaceC33028OooO0o0 = (InterfaceC33028OooO0o0) oooO0O0;
                int iOooO0O0 = interfaceC33028OooO0o0.OooO0O0(7);
                if (iOooO0O0 == 1) {
                    this.f119430OooOoOO = iOooO0O0;
                    this.f119428OooOoO = interfaceC33028OooO0o0;
                    this.f119429OooOoO0 = true;
                    this.f119426OooOo.OooO0Oo();
                    return;
                }
                if (iOooO0O0 == 2) {
                    this.f119430OooOoOO = iOooO0O0;
                    this.f119428OooOoO = interfaceC33028OooO0o0;
                }
            }
        }

        @Override // oO0OooOO.InterfaceC33499OooOOOO
        public final void onComplete() throws Exception {
            this.f119429OooOoO0 = true;
            this.f119426OooOo.OooO0Oo();
        }

        @Override // oO0OooOO.InterfaceC33499OooOOOO
        public final void onError(Throwable th) throws Exception {
            C32388OooO0OO c32388OooO0OO = this.f119426OooOo.f119438OooOoo;
            c32388OooO0OO.getClass();
            if (!C32390OooO0o.OooO00o(c32388OooO0OO, th)) {
                oO0OOO0O.OooO00o.OooO0O0(th);
                return;
            }
            OooO0O0<T, U> oooO0O0 = this.f119426OooOo;
            oooO0O0.getClass();
            oooO0O0.OooO0OO();
            this.f119429OooOoO0 = true;
            this.f119426OooOo.OooO0Oo();
        }

        @Override // oO0OooOO.InterfaceC33499OooOOOO
        public final void onNext(U u) throws Exception {
            if (this.f119430OooOoOO != 0) {
                this.f119426OooOo.OooO0Oo();
                return;
            }
            OooO0O0<T, U> oooO0O0 = this.f119426OooOo;
            if (oooO0O0.get() == 0 && oooO0O0.compareAndSet(0, 1)) {
                oooO0O0.f119434OooOo0o.onNext(u);
                if (oooO0O0.decrementAndGet() == 0) {
                    return;
                }
            } else {
                InterfaceC33031OooOO0 oooO0O02 = this.f119428OooOoO;
                if (oooO0O02 == null) {
                    oooO0O02 = new oO0OOO0o.OooO0O0(oooO0O0.f119435OooOoO);
                    this.f119428OooOoO = oooO0O02;
                }
                oooO0O02.offer(u);
                if (oooO0O0.getAndIncrement() != 0) {
                    return;
                }
            }
            oooO0O0.OooO0o0();
        }
    }

    /* JADX INFO: renamed from: oO0OOOoO.OooO0o$OooO0O0 */
    public static final class OooO0O0<T, U> extends AtomicInteger implements oO0OOO00.OooO0O0, InterfaceC33499OooOOOO<T> {
        private static final long serialVersionUID = -2117620485640801370L;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final C20503OooO00o f119433OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33499OooOOOO<? super U> f119434OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final int f119435OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final int f119436OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public volatile InterfaceC33022OooO<U> f119437OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public final C32388OooO0OO f119438OooOoo = new C32388OooO0OO();

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public volatile boolean f119439OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public volatile boolean f119440OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public final AtomicReference<OooO00o<?, ?>[]> f119441OooOooo;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public int f119442Oooo0;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public oO0OOO00.OooO0O0 f119443Oooo000;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public long f119444Oooo00O;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public long f119445Oooo00o;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        public final ArrayDeque f119446Oooo0O0;

        /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
        public int f119447Oooo0OO;

        /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
        public static final OooO00o<?, ?>[] f119432Oooo0o0 = new OooO00o[0];

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o<?, ?>[] f119431Oooo0o = new OooO00o[0];

        public OooO0O0(InterfaceC33499OooOOOO interfaceC33499OooOOOO, C20503OooO00o c20503OooO00o, int i, int i2) {
            this.f119434OooOo0o = interfaceC33499OooOOOO;
            this.f119433OooOo = c20503OooO00o;
            this.f119436OooOoO0 = i;
            this.f119435OooOoO = i2;
            if (i != Integer.MAX_VALUE) {
                this.f119446Oooo0O0 = new ArrayDeque(i);
            }
            this.f119441OooOooo = new AtomicReference<>(f119432Oooo0o0);
        }

        @Override // oO0OooOO.InterfaceC33499OooOOOO
        public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
            if (EnumC35109OooO0O0.OooO0o0(this.f119443Oooo000, oooO0O0)) {
                this.f119443Oooo000 = oooO0O0;
                this.f119434OooOo0o.OooO00o(this);
            }
        }

        public final boolean OooO0O0() {
            if (!this.f119440OooOooO) {
                if (this.f119438OooOoo.get() == null) {
                    return false;
                }
                OooO0OO();
                C32388OooO0OO c32388OooO0OO = this.f119438OooOoo;
                c32388OooO0OO.getClass();
                Throwable thOooO0O0 = C32390OooO0o.OooO0O0(c32388OooO0OO);
                if (thOooO0O0 != C32390OooO0o.f116481OooO00o) {
                    this.f119434OooOo0o.onError(thOooO0O0);
                }
            }
            return true;
        }

        public final boolean OooO0OO() {
            OooO00o<?, ?>[] andSet;
            this.f119443Oooo000.dispose();
            AtomicReference<OooO00o<?, ?>[]> atomicReference = this.f119441OooOooo;
            OooO00o<?, ?>[] oooO00oArr = atomicReference.get();
            OooO00o<?, ?>[] oooO00oArr2 = f119431Oooo0o;
            if (oooO00oArr == oooO00oArr2 || (andSet = atomicReference.getAndSet(oooO00oArr2)) == oooO00oArr2) {
                return false;
            }
            for (OooO00o<?, ?> oooO00o : andSet) {
                oooO00o.getClass();
                EnumC35109OooO0O0.OooO00o(oooO00o);
            }
            return true;
        }

        public final void OooO0Oo() throws Exception {
            if (getAndIncrement() == 0) {
                OooO0o0();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void OooO0o(OooO00o<T, U> oooO00o) {
            OooO00o<?, ?>[] oooO00oArr;
            while (true) {
                AtomicReference<OooO00o<?, ?>[]> atomicReference = this.f119441OooOooo;
                OooO00o<?, ?>[] oooO00oArr2 = atomicReference.get();
                int length = oooO00oArr2.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (oooO00oArr2[i] == oooO00o) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    oooO00oArr = f119432Oooo0o0;
                } else {
                    OooO00o<?, ?>[] oooO00oArr3 = new OooO00o[length - 1];
                    System.arraycopy(oooO00oArr2, 0, oooO00oArr3, 0, i);
                    System.arraycopy(oooO00oArr2, i + 1, oooO00oArr3, i, (length - i) - 1);
                    oooO00oArr = oooO00oArr3;
                }
                while (!atomicReference.compareAndSet(oooO00oArr2, oooO00oArr)) {
                    if (atomicReference.get() != oooO00oArr2) {
                        break;
                    }
                }
                return;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void OooO0o0() throws Exception {
            int size;
            InterfaceC33499OooOOOO<? super U> interfaceC33499OooOOOO = this.f119434OooOo0o;
            int iAddAndGet = 1;
            while (!OooO0O0()) {
                InterfaceC33022OooO<U> interfaceC33022OooO = this.f119437OooOoOO;
                if (interfaceC33022OooO != null) {
                    while (!OooO0O0()) {
                        U uPoll = interfaceC33022OooO.poll();
                        if (uPoll != null) {
                            interfaceC33499OooOOOO.onNext(uPoll);
                        } else if (uPoll == null) {
                        }
                    }
                    return;
                }
                boolean z = this.f119439OooOoo0;
                InterfaceC33022OooO<U> interfaceC33022OooO2 = this.f119437OooOoOO;
                OooO00o<?, ?>[] oooO00oArr = this.f119441OooOooo.get();
                int length = oooO00oArr.length;
                boolean z2 = false;
                if (this.f119436OooOoO0 != Integer.MAX_VALUE) {
                    synchronized (this) {
                        size = this.f119446Oooo0O0.size();
                    }
                } else {
                    size = 0;
                }
                if (z && ((interfaceC33022OooO2 == null || interfaceC33022OooO2.isEmpty()) && length == 0 && size == 0)) {
                    C32388OooO0OO c32388OooO0OO = this.f119438OooOoo;
                    c32388OooO0OO.getClass();
                    Throwable thOooO0O0 = C32390OooO0o.OooO0O0(c32388OooO0OO);
                    if (thOooO0O0 != C32390OooO0o.f116481OooO00o) {
                        if (thOooO0O0 == null) {
                            interfaceC33499OooOOOO.onComplete();
                            return;
                        } else {
                            interfaceC33499OooOOOO.onError(thOooO0O0);
                            return;
                        }
                    }
                    return;
                }
                if (length != 0) {
                    long j = this.f119445Oooo00o;
                    int i = this.f119442Oooo0;
                    if (length <= i || oooO00oArr[i].f119427OooOo0o != j) {
                        if (length <= i) {
                            i = 0;
                        }
                        for (int i2 = 0; i2 < length && oooO00oArr[i].f119427OooOo0o != j; i2++) {
                            i++;
                            if (i == length) {
                                i = 0;
                            }
                        }
                        this.f119442Oooo0 = i;
                        this.f119445Oooo00o = oooO00oArr[i].f119427OooOo0o;
                    }
                    int i3 = 0;
                    boolean z3 = false;
                    while (i3 < length) {
                        if (OooO0O0()) {
                            return;
                        }
                        OooO00o<T, U> oooO00o = oooO00oArr[i];
                        while (!OooO0O0()) {
                            InterfaceC33031OooOO0<U> interfaceC33031OooOO0 = oooO00o.f119428OooOoO;
                            if (interfaceC33031OooOO0 != null) {
                                do {
                                    try {
                                        U uPoll2 = interfaceC33031OooOO0.poll();
                                        if (uPoll2 != null) {
                                            interfaceC33499OooOOOO.onNext(uPoll2);
                                        } else if (uPoll2 == null) {
                                        }
                                    } catch (Throwable th) {
                                        C30416Oooo0OO.OooO00o(th);
                                        EnumC35109OooO0O0.OooO00o(oooO00o);
                                        C32388OooO0OO c32388OooO0OO2 = this.f119438OooOoo;
                                        c32388OooO0OO2.getClass();
                                        C32390OooO0o.OooO00o(c32388OooO0OO2, th);
                                        if (OooO0O0()) {
                                            return;
                                        }
                                        OooO0o(oooO00o);
                                        i3++;
                                        z3 = true;
                                    }
                                } while (!OooO0O0());
                                return;
                            }
                            boolean z4 = oooO00o.f119429OooOoO0;
                            InterfaceC33031OooOO0<U> interfaceC33031OooOO02 = oooO00o.f119428OooOoO;
                            if (z4 && (interfaceC33031OooOO02 == null || interfaceC33031OooOO02.isEmpty())) {
                                OooO0o(oooO00o);
                                if (OooO0O0()) {
                                    return;
                                } else {
                                    z3 = true;
                                }
                            }
                            i++;
                            if (i == length) {
                                i = 0;
                            }
                            i3++;
                        }
                        return;
                    }
                    this.f119442Oooo0 = i;
                    this.f119445Oooo00o = oooO00oArr[i].f119427OooOo0o;
                    z2 = z3;
                }
                if (!z2) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (this.f119436OooOoO0 != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            InterfaceC33497OooOOO<? extends U> interfaceC33497OooOOO = (InterfaceC33497OooOOO) this.f119446Oooo0O0.poll();
                            if (interfaceC33497OooOOO == null) {
                                this.f119447Oooo0OO--;
                            } else {
                                OooO0oO(interfaceC33497OooOOO);
                            }
                        } finally {
                        }
                    }
                } else {
                    continue;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v19 */
        /* JADX WARN: Type inference failed for: r3v20 */
        /* JADX WARN: Type inference failed for: r3v5, types: [oO0OOOoo.OooOO0] */
        public final void OooO0oO(InterfaceC33497OooOOO<? extends U> interfaceC33497OooOOO) throws Exception {
            boolean z;
            do {
                z = false;
                if (!(interfaceC33497OooOOO instanceof Callable)) {
                    long j = this.f119444Oooo00O;
                    this.f119444Oooo00O = 1 + j;
                    OooO00o<?, ?> oooO00o = new OooO00o<>(this, j);
                    while (true) {
                        AtomicReference<OooO00o<?, ?>[]> atomicReference = this.f119441OooOooo;
                        OooO00o<?, ?>[] oooO00oArr = atomicReference.get();
                        if (oooO00oArr == f119431Oooo0o) {
                            EnumC35109OooO0O0.OooO00o(oooO00o);
                            return;
                        }
                        int length = oooO00oArr.length;
                        OooO00o<?, ?>[] oooO00oArr2 = new OooO00o[length + 1];
                        System.arraycopy(oooO00oArr, 0, oooO00oArr2, 0, length);
                        oooO00oArr2[length] = oooO00o;
                        while (!atomicReference.compareAndSet(oooO00oArr, oooO00oArr2)) {
                            if (atomicReference.get() != oooO00oArr) {
                                break;
                            }
                        }
                        interfaceC33497OooOOO.OooO0O0(oooO00o);
                        return;
                    }
                }
                try {
                    Object objCall = ((Callable) interfaceC33497OooOOO).call();
                    if (objCall != null) {
                        if (get() == 0 && compareAndSet(0, 1)) {
                            this.f119434OooOo0o.onNext(objCall);
                            if (decrementAndGet() != 0) {
                                OooO0o0();
                            }
                        } else {
                            InterfaceC33022OooO<U> interfaceC33022OooO = this.f119437OooOoOO;
                            ?? r3 = interfaceC33022OooO;
                            if (interfaceC33022OooO == false) {
                                InterfaceC33022OooO<U> oooO0O0 = this.f119436OooOoO0 == Integer.MAX_VALUE ? new oO0OOO0o.OooO0O0(this.f119435OooOoO) : new C32939OooO00o(this.f119436OooOoO0);
                                this.f119437OooOoOO = oooO0O0;
                                r3 = oooO0O0;
                            }
                            if (r3.offer(objCall)) {
                                if (getAndIncrement() != 0) {
                                    return;
                                }
                                OooO0o0();
                            } else {
                                onError(new IllegalStateException("Scalar queue full?!"));
                            }
                        }
                    }
                } catch (Throwable th) {
                    C30416Oooo0OO.OooO00o(th);
                    C32388OooO0OO c32388OooO0OO = this.f119438OooOoo;
                    c32388OooO0OO.getClass();
                    C32390OooO0o.OooO00o(c32388OooO0OO, th);
                    OooO0Oo();
                }
                if (this.f119436OooOoO0 == Integer.MAX_VALUE) {
                    return;
                }
                synchronized (this) {
                    try {
                        interfaceC33497OooOOO = (InterfaceC33497OooOOO) this.f119446Oooo0O0.poll();
                        if (interfaceC33497OooOOO == null) {
                            this.f119447Oooo0OO--;
                            z = true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } while (!z);
            OooO0Oo();
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            if (this.f119440OooOooO) {
                return;
            }
            this.f119440OooOooO = true;
            if (OooO0OO()) {
                C32388OooO0OO c32388OooO0OO = this.f119438OooOoo;
                c32388OooO0OO.getClass();
                Throwable thOooO0O0 = C32390OooO0o.OooO0O0(c32388OooO0OO);
                if (thOooO0O0 == null || thOooO0O0 == C32390OooO0o.f116481OooO00o) {
                    return;
                }
                oO0OOO0O.OooO00o.OooO0O0(thOooO0O0);
            }
        }

        @Override // oO0OooOO.InterfaceC33499OooOOOO
        public final void onComplete() throws Exception {
            if (this.f119439OooOoo0) {
                return;
            }
            this.f119439OooOoo0 = true;
            OooO0Oo();
        }

        @Override // oO0OooOO.InterfaceC33499OooOOOO
        public final void onError(Throwable th) {
            if (this.f119439OooOoo0) {
                oO0OOO0O.OooO00o.OooO0O0(th);
                return;
            }
            C32388OooO0OO c32388OooO0OO = this.f119438OooOoo;
            c32388OooO0OO.getClass();
            if (!C32390OooO0o.OooO00o(c32388OooO0OO, th)) {
                oO0OOO0O.OooO00o.OooO0O0(th);
            } else {
                this.f119439OooOoo0 = true;
                OooO0Oo();
            }
        }

        @Override // oO0OooOO.InterfaceC33499OooOOOO
        public final void onNext(T t) throws Exception {
            if (this.f119439OooOoo0) {
                return;
            }
            try {
                InterfaceC33497OooOOO<? extends U> interfaceC33497OooOOO = (InterfaceC33497OooOOO) this.f119433OooOo.apply(t);
                if (this.f119436OooOoO0 != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            int i = this.f119447Oooo0OO;
                            if (i == this.f119436OooOoO0) {
                                this.f119446Oooo0O0.offer(interfaceC33497OooOOO);
                                return;
                            }
                            this.f119447Oooo0OO = i + 1;
                        } finally {
                        }
                    }
                }
                OooO0oO(interfaceC33497OooOOO);
            } catch (Throwable th) {
                C30416Oooo0OO.OooO00o(th);
                this.f119443Oooo000.dispose();
                onError(th);
            }
        }
    }

    public C33013OooO0o(AbstractC33498OooOOO0 abstractC33498OooOOO0, C20503OooO00o c20503OooO00o, int i) {
        super(abstractC33498OooOOO0);
        this.f119423OooOo = c20503OooO00o;
        this.f119425OooOoO0 = Integer.MAX_VALUE;
        this.f119424OooOoO = i;
    }

    @Override // oO0OooOO.AbstractC33498OooOOO0
    public final void OooO0OO(InterfaceC33499OooOOOO<? super U> interfaceC33499OooOOOO) {
        EnumC35110OooO0OO enumC35110OooO0OO = EnumC35110OooO0OO.f126094OooOo0o;
        InterfaceC33497OooOOO interfaceC33497OooOOO = this.f119410OooOo0o;
        boolean z = interfaceC33497OooOOO instanceof Callable;
        C20503OooO00o c20503OooO00o = this.f119423OooOo;
        if (!z) {
            interfaceC33497OooOOO.OooO0O0(new OooO0O0(interfaceC33499OooOOOO, c20503OooO00o, this.f119425OooOoO0, this.f119424OooOoO));
            return;
        }
        try {
            Object objCall = ((Callable) interfaceC33497OooOOO).call();
            if (objCall == null) {
                interfaceC33499OooOOOO.OooO00o(enumC35110OooO0OO);
                interfaceC33499OooOOOO.onComplete();
                return;
            }
            try {
                InterfaceC33497OooOOO interfaceC33497OooOOO2 = (InterfaceC33497OooOOO) c20503OooO00o.apply(objCall);
                if (!(interfaceC33497OooOOO2 instanceof Callable)) {
                    interfaceC33497OooOOO2.OooO0O0(interfaceC33499OooOOOO);
                    return;
                }
                try {
                    Object objCall2 = ((Callable) interfaceC33497OooOOO2).call();
                    if (objCall2 == null) {
                        interfaceC33499OooOOOO.OooO00o(enumC35110OooO0OO);
                        interfaceC33499OooOOOO.onComplete();
                    } else {
                        RunnableC33019OooOO0o runnableC33019OooOO0o = new RunnableC33019OooOO0o(interfaceC33499OooOOOO, objCall2);
                        interfaceC33499OooOOOO.OooO00o(runnableC33019OooOO0o);
                        runnableC33019OooOO0o.run();
                    }
                } catch (Throwable th) {
                    C30416Oooo0OO.OooO00o(th);
                    interfaceC33499OooOOOO.OooO00o(enumC35110OooO0OO);
                    interfaceC33499OooOOOO.onError(th);
                }
            } catch (Throwable th2) {
                C30416Oooo0OO.OooO00o(th2);
                interfaceC33499OooOOOO.OooO00o(enumC35110OooO0OO);
                interfaceC33499OooOOOO.onError(th2);
            }
        } catch (Throwable th3) {
            C30416Oooo0OO.OooO00o(th3);
            interfaceC33499OooOOOO.OooO00o(enumC35110OooO0OO);
            interfaceC33499OooOOOO.onError(th3);
        }
    }
}
