package oOo00ooo;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import oO00o.InterfaceC32317OooO0Oo;
import oO00o.InterfaceC32319OooO0o0;
import oO00oO0.EnumC32397OooO0O0;
import oO00oO0.EnumC32398OooO0OO;
import oO00oO00.InterfaceC32404OooO0Oo;
import oO00oOO0.C32424OooO00o;
import oO00oOO0.C32425OooO0O0;
import oO00oOo0.C32430OooO00o;
import oO0OO0oO.InterfaceC32925OooO0O0;
import oO0OoooO.C33519OooO00o;
import oO0o0OO.C33669o000oOoO;
import oOo00oO0.C34560OooO00o;
import oOo00oO0.C34561OooO0O0;
import oOo00ooO.InterfaceC34570OooO0O0;
import oOo00ooO.InterfaceC34573OooO0o;
import oOo00ooO.InterfaceC34575OooO0oO;

/* JADX INFO: renamed from: oOo00ooo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34579OooO0OO<T, U> extends AbstractC34577OooO00o<T, U> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C33519OooO00o.C33520OooO0Oo f123833OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f123834OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f123835OooO0Oo;

    /* JADX INFO: renamed from: oOo00ooo.OooO0OO$OooO00o */
    public static final class OooO00o<T, U> extends AtomicReference<InterfaceC32925OooO0O0> implements InterfaceC32319OooO0o0<U> {
        private static final long serialVersionUID = -4606175640614850599L;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public volatile boolean f123836OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final OooO0O0<T, U> f123837OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f123838OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public volatile InterfaceC34575OooO0oO<U> f123839OooOoO0;

        public OooO00o(OooO0O0 oooO0O0) {
            this.f123837OooOo0o = oooO0O0;
        }

        @Override // oO00o.InterfaceC32319OooO0o0
        public final void OooO00o(InterfaceC32925OooO0O0 interfaceC32925OooO0O0) throws Throwable {
            if (EnumC32397OooO0O0.OooO0OO(this, interfaceC32925OooO0O0) && (interfaceC32925OooO0O0 instanceof InterfaceC34570OooO0O0)) {
                InterfaceC34570OooO0O0 interfaceC34570OooO0O0 = (InterfaceC34570OooO0O0) interfaceC32925OooO0O0;
                int iOooO0O0 = interfaceC34570OooO0O0.OooO0O0(7);
                if (iOooO0O0 == 1) {
                    this.f123838OooOoO = iOooO0O0;
                    this.f123839OooOoO0 = interfaceC34570OooO0O0;
                    this.f123836OooOo = true;
                    this.f123837OooOo0o.OooO0Oo();
                    return;
                }
                if (iOooO0O0 == 2) {
                    this.f123838OooOoO = iOooO0O0;
                    this.f123839OooOoO0 = interfaceC34570OooO0O0;
                }
            }
        }

        @Override // oO00o.InterfaceC32319OooO0o0
        public final void onComplete() throws Throwable {
            this.f123836OooOo = true;
            this.f123837OooOo0o.OooO0Oo();
        }

        @Override // oO00o.InterfaceC32319OooO0o0
        public final void onError(Throwable th) throws Throwable {
            if (this.f123837OooOo0o.f123847OooOoo.OooO0O0(th)) {
                OooO0O0<T, U> oooO0O0 = this.f123837OooOo0o;
                oooO0O0.getClass();
                oooO0O0.OooO0OO();
                this.f123836OooOo = true;
                this.f123837OooOo0o.OooO0Oo();
            }
        }

        @Override // oO00o.InterfaceC32319OooO0o0
        public final void onNext(U u) throws Throwable {
            if (this.f123838OooOoO != 0) {
                this.f123837OooOo0o.OooO0Oo();
                return;
            }
            OooO0O0<T, U> oooO0O0 = this.f123837OooOo0o;
            if (oooO0O0.get() == 0 && oooO0O0.compareAndSet(0, 1)) {
                oooO0O0.f123843OooOo0o.onNext(u);
                if (oooO0O0.decrementAndGet() == 0) {
                    return;
                }
            } else {
                InterfaceC34575OooO0oO c32425OooO0O0 = this.f123839OooOoO0;
                if (c32425OooO0O0 == null) {
                    c32425OooO0O0 = new C32425OooO0O0(oooO0O0.f123844OooOoO);
                    this.f123839OooOoO0 = c32425OooO0O0;
                }
                c32425OooO0O0.offer(u);
                if (oooO0O0.getAndIncrement() != 0) {
                    return;
                }
            }
            oooO0O0.OooO0o0();
        }
    }

    /* JADX INFO: renamed from: oOo00ooo.OooO0OO$OooO0O0 */
    public static final class OooO0O0<T, U> extends AtomicInteger implements InterfaceC32925OooO0O0, InterfaceC32319OooO0o0<T> {

        /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
        public static final OooO00o<?, ?>[] f123840Oooo0OO = new OooO00o[0];

        /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
        public static final OooO00o<?, ?>[] f123841Oooo0o0 = new OooO00o[0];
        private static final long serialVersionUID = -2117620485640801370L;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final C33519OooO00o.C33520OooO0Oo f123842OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC32319OooO0o0<? super U> f123843OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final int f123844OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final int f123845OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public volatile InterfaceC34573OooO0o<U> f123846OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public final C34560OooO00o f123847OooOoo = new C34560OooO00o();

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public volatile boolean f123848OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public volatile boolean f123849OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public final AtomicReference<OooO00o<?, ?>[]> f123850OooOooo;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public final ArrayDeque f123851Oooo0;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public InterfaceC32925OooO0O0 f123852Oooo000;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public long f123853Oooo00O;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public int f123854Oooo00o;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        public int f123855Oooo0O0;

        public OooO0O0(InterfaceC32319OooO0o0 interfaceC32319OooO0o0, C33519OooO00o.C33520OooO0Oo c33520OooO0Oo, int i, int i2) {
            this.f123843OooOo0o = interfaceC32319OooO0o0;
            this.f123842OooOo = c33520OooO0Oo;
            this.f123845OooOoO0 = i;
            this.f123844OooOoO = i2;
            if (i != Integer.MAX_VALUE) {
                this.f123851Oooo0 = new ArrayDeque(i);
            }
            this.f123850OooOooo = new AtomicReference<>(f123840Oooo0OO);
        }

        @Override // oO00o.InterfaceC32319OooO0o0
        public final void OooO00o(InterfaceC32925OooO0O0 interfaceC32925OooO0O0) {
            if (EnumC32397OooO0O0.OooO0Oo(this.f123852Oooo000, interfaceC32925OooO0O0)) {
                this.f123852Oooo000 = interfaceC32925OooO0O0;
                this.f123843OooOo0o.OooO00o(this);
            }
        }

        public final boolean OooO0O0() {
            if (!this.f123849OooOooO) {
                if (this.f123847OooOoo.get() == null) {
                    return false;
                }
                OooO0OO();
                C34560OooO00o c34560OooO00o = this.f123847OooOoo;
                InterfaceC32319OooO0o0<? super U> interfaceC32319OooO0o0 = this.f123843OooOo0o;
                Throwable thOooO00o = c34560OooO00o.OooO00o();
                if (thOooO00o == null) {
                    interfaceC32319OooO0o0.onComplete();
                    return true;
                }
                if (thOooO00o != C34561OooO0O0.f123804OooO00o) {
                    interfaceC32319OooO0o0.onError(thOooO00o);
                }
            }
            return true;
        }

        public final boolean OooO0OO() {
            this.f123852Oooo000.dispose();
            AtomicReference<OooO00o<?, ?>[]> atomicReference = this.f123850OooOooo;
            OooO00o<?, ?>[] oooO00oArr = f123841Oooo0o0;
            OooO00o<?, ?>[] andSet = atomicReference.getAndSet(oooO00oArr);
            if (andSet == oooO00oArr) {
                return false;
            }
            for (OooO00o<?, ?> oooO00o : andSet) {
                oooO00o.getClass();
                EnumC32397OooO0O0.OooO00o(oooO00o);
            }
            return true;
        }

        public final void OooO0Oo() throws Throwable {
            if (getAndIncrement() == 0) {
                OooO0o0();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void OooO0o(OooO00o<T, U> oooO00o) {
            OooO00o<?, ?>[] oooO00oArr;
            while (true) {
                AtomicReference<OooO00o<?, ?>[]> atomicReference = this.f123850OooOooo;
                OooO00o<?, ?>[] oooO00oArr2 = atomicReference.get();
                int length = oooO00oArr2.length;
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
                    oooO00oArr = f123840Oooo0OO;
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
        /* JADX WARN: Removed duplicated region for block: B:108:0x00d7 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x00d6 A[PHI: r4
          0x00d6: PHI (r4v6 int) = (r4v4 int), (r4v7 int) binds: [B:61:0x00bc, B:70:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0o0() throws Throwable {
            int size;
            U uPoll;
            boolean z;
            InterfaceC32319OooO0o0<? super U> interfaceC32319OooO0o0 = this.f123843OooOo0o;
            int iAddAndGet = 1;
            while (!OooO0O0()) {
                InterfaceC34573OooO0o<U> interfaceC34573OooO0o = this.f123846OooOoOO;
                int i = 0;
                if (interfaceC34573OooO0o != null) {
                    while (!OooO0O0()) {
                        U uPoll2 = interfaceC34573OooO0o.poll();
                        if (uPoll2 != null) {
                            interfaceC32319OooO0o0.onNext(uPoll2);
                            i++;
                        }
                    }
                    return;
                }
                if (i == 0) {
                    boolean z2 = this.f123848OooOoo0;
                    InterfaceC34573OooO0o<U> interfaceC34573OooO0o2 = this.f123846OooOoOO;
                    OooO00o<?, ?>[] oooO00oArr = this.f123850OooOooo.get();
                    int length = oooO00oArr.length;
                    if (this.f123845OooOoO0 != Integer.MAX_VALUE) {
                        synchronized (this) {
                            size = this.f123851Oooo0.size();
                        }
                    } else {
                        size = 0;
                    }
                    if (z2 && ((interfaceC34573OooO0o2 == null || interfaceC34573OooO0o2.isEmpty()) && length == 0 && size == 0)) {
                        C34560OooO00o c34560OooO00o = this.f123847OooOoo;
                        InterfaceC32319OooO0o0<? super U> interfaceC32319OooO0o02 = this.f123843OooOo0o;
                        Throwable thOooO00o = c34560OooO00o.OooO00o();
                        if (thOooO00o == null) {
                            interfaceC32319OooO0o02.onComplete();
                            return;
                        } else {
                            if (thOooO00o != C34561OooO0O0.f123804OooO00o) {
                                interfaceC32319OooO0o02.onError(thOooO00o);
                                return;
                            }
                            return;
                        }
                    }
                    if (length != 0) {
                        int iMin = Math.min(length - 1, this.f123854Oooo00o);
                        for (int i2 = 0; i2 < length; i2++) {
                            if (OooO0O0()) {
                                return;
                            }
                            OooO00o<T, U> oooO00o = oooO00oArr[iMin];
                            InterfaceC34575OooO0oO<U> interfaceC34575OooO0oO = oooO00o.f123839OooOoO0;
                            if (interfaceC34575OooO0oO != null) {
                                do {
                                    try {
                                        uPoll = interfaceC34575OooO0oO.poll();
                                    } catch (Throwable th) {
                                        C33669o000oOoO.OooO0O0(th);
                                        EnumC32397OooO0O0.OooO00o(oooO00o);
                                        this.f123847OooOoo.OooO0O0(th);
                                        if (OooO0O0()) {
                                            return;
                                        }
                                        OooO0o(oooO00o);
                                        i++;
                                        iMin++;
                                        if (iMin == length) {
                                        }
                                    }
                                    if (uPoll == null) {
                                        z = oooO00o.f123836OooOo;
                                        InterfaceC34575OooO0oO<U> interfaceC34575OooO0oO2 = oooO00o.f123839OooOoO0;
                                        if (z && (interfaceC34575OooO0oO2 == null || interfaceC34575OooO0oO2.isEmpty())) {
                                            OooO0o(oooO00o);
                                            i++;
                                        }
                                        iMin++;
                                        if (iMin != length) {
                                            iMin = 0;
                                        }
                                    } else {
                                        interfaceC32319OooO0o0.onNext(uPoll);
                                    }
                                } while (!OooO0O0());
                                return;
                            }
                            z = oooO00o.f123836OooOo;
                            InterfaceC34575OooO0oO<U> interfaceC34575OooO0oO22 = oooO00o.f123839OooOoO0;
                            if (z) {
                                OooO0o(oooO00o);
                                i++;
                            }
                            iMin++;
                            if (iMin != length) {
                            }
                        }
                        this.f123854Oooo00o = iMin;
                    }
                    if (i == 0) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else if (this.f123845OooOoO0 != Integer.MAX_VALUE) {
                        OooO0oo(i);
                    }
                } else if (this.f123845OooOoO0 != Integer.MAX_VALUE) {
                    OooO0oo(i);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r3v19 */
        /* JADX WARN: Type inference failed for: r3v5, types: [oOo00ooO.OooO0oO] */
        public final void OooO0oO(InterfaceC32317OooO0Oo<? extends U> interfaceC32317OooO0Oo) throws Throwable {
            boolean z;
            do {
                z = false;
                if (!(interfaceC32317OooO0Oo instanceof InterfaceC32404OooO0Oo)) {
                    this.f123853Oooo00O++;
                    OooO00o<?, ?> oooO00o = new OooO00o<>(this);
                    while (true) {
                        AtomicReference<OooO00o<?, ?>[]> atomicReference = this.f123850OooOooo;
                        OooO00o<?, ?>[] oooO00oArr = atomicReference.get();
                        if (oooO00oArr == f123841Oooo0o0) {
                            EnumC32397OooO0O0.OooO00o(oooO00o);
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
                        interfaceC32317OooO0Oo.OooO00o(oooO00o);
                        return;
                    }
                }
                try {
                    Object obj = ((InterfaceC32404OooO0Oo) interfaceC32317OooO0Oo).get();
                    if (obj != null) {
                        if (get() == 0 && compareAndSet(0, 1)) {
                            this.f123843OooOo0o.onNext(obj);
                            if (decrementAndGet() != 0) {
                            }
                        } else {
                            InterfaceC34573OooO0o<U> interfaceC34573OooO0o = this.f123846OooOoOO;
                            ?? r3 = interfaceC34573OooO0o;
                            if (interfaceC34573OooO0o == false) {
                                InterfaceC34573OooO0o<U> c32425OooO0O0 = this.f123845OooOoO0 == Integer.MAX_VALUE ? new C32425OooO0O0(this.f123844OooOoO) : new C32424OooO00o(this.f123845OooOoO0);
                                this.f123846OooOoOO = c32425OooO0O0;
                                r3 = c32425OooO0O0;
                            }
                            r3.offer(obj);
                            if (getAndIncrement() != 0) {
                                return;
                            }
                        }
                        OooO0o0();
                    }
                } catch (Throwable th) {
                    C33669o000oOoO.OooO0O0(th);
                    this.f123847OooOoo.OooO0O0(th);
                    OooO0Oo();
                }
                if (this.f123845OooOoO0 == Integer.MAX_VALUE) {
                    return;
                }
                synchronized (this) {
                    try {
                        interfaceC32317OooO0Oo = (InterfaceC32317OooO0Oo) this.f123851Oooo0.poll();
                        if (interfaceC32317OooO0Oo == null) {
                            this.f123855Oooo0O0--;
                            z = true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } while (!z);
            OooO0Oo();
        }

        public final void OooO0oo(int i) throws Throwable {
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    return;
                }
                synchronized (this) {
                    try {
                        InterfaceC32317OooO0Oo<? extends U> interfaceC32317OooO0Oo = (InterfaceC32317OooO0Oo) this.f123851Oooo0.poll();
                        if (interfaceC32317OooO0Oo == null) {
                            this.f123855Oooo0O0--;
                        } else {
                            OooO0oO(interfaceC32317OooO0Oo);
                        }
                    } finally {
                    }
                }
                i = i2;
            }
        }

        @Override // oO0OO0oO.InterfaceC32925OooO0O0
        public final void dispose() {
            Throwable thOooO00o;
            this.f123849OooOooO = true;
            if (!OooO0OO() || (thOooO00o = this.f123847OooOoo.OooO00o()) == null || thOooO00o == C34561OooO0O0.f123804OooO00o) {
                return;
            }
            C32430OooO00o.OooO00o(thOooO00o);
        }

        @Override // oO00o.InterfaceC32319OooO0o0
        public final void onComplete() throws Throwable {
            if (this.f123848OooOoo0) {
                return;
            }
            this.f123848OooOoo0 = true;
            OooO0Oo();
        }

        @Override // oO00o.InterfaceC32319OooO0o0
        public final void onError(Throwable th) throws Throwable {
            if (this.f123848OooOoo0) {
                C32430OooO00o.OooO00o(th);
            } else if (this.f123847OooOoo.OooO0O0(th)) {
                this.f123848OooOoo0 = true;
                OooO0Oo();
            }
        }

        @Override // oO00o.InterfaceC32319OooO0o0
        public final void onNext(T t) throws Throwable {
            if (this.f123848OooOoo0) {
                return;
            }
            try {
                this.f123842OooOo.getClass();
                Objects.requireNonNull(t, "The mapper returned a null ObservableSource");
                InterfaceC32317OooO0Oo<? extends U> interfaceC32317OooO0Oo = (InterfaceC32317OooO0Oo) t;
                if (this.f123845OooOoO0 != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            int i = this.f123855Oooo0O0;
                            if (i == this.f123845OooOoO0) {
                                this.f123851Oooo0.offer(interfaceC32317OooO0Oo);
                                return;
                            }
                            this.f123855Oooo0O0 = i + 1;
                        } finally {
                        }
                    }
                }
                OooO0oO(interfaceC32317OooO0Oo);
            } catch (Throwable th) {
                C33669o000oOoO.OooO0O0(th);
                this.f123852Oooo000.dispose();
                onError(th);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34579OooO0OO(C34580OooO0Oo c34580OooO0Oo, int i) {
        super(c34580OooO0Oo);
        C33519OooO00o.C33520OooO0Oo c33520OooO0Oo = C33519OooO00o.f121087OooO00o;
        this.f123833OooO0O0 = c33520OooO0Oo;
        this.f123834OooO0OO = 2;
        this.f123835OooO0Oo = i;
    }

    @Override // oO00o.AbstractC32316OooO0OO
    public final void OooO0OO(InterfaceC32319OooO0o0<? super U> interfaceC32319OooO0o0) {
        EnumC32398OooO0OO enumC32398OooO0OO = EnumC32398OooO0OO.f116503OooOo0o;
        InterfaceC32317OooO0Oo interfaceC32317OooO0Oo = this.f123831OooO00o;
        boolean z = interfaceC32317OooO0Oo instanceof InterfaceC32404OooO0Oo;
        C33519OooO00o.C33520OooO0Oo c33520OooO0Oo = this.f123833OooO0O0;
        if (!z) {
            interfaceC32317OooO0Oo.OooO00o(new OooO0O0(interfaceC32319OooO0o0, c33520OooO0Oo, this.f123834OooO0OO, this.f123835OooO0Oo));
            return;
        }
        try {
            Object obj = ((InterfaceC32404OooO0Oo) interfaceC32317OooO0Oo).get();
            if (obj == null) {
                interfaceC32319OooO0o0.OooO00o(enumC32398OooO0OO);
                interfaceC32319OooO0o0.onComplete();
                return;
            }
            try {
                c33520OooO0Oo.getClass();
                InterfaceC32317OooO0Oo interfaceC32317OooO0Oo2 = (InterfaceC32317OooO0Oo) obj;
                if (!(interfaceC32317OooO0Oo2 instanceof InterfaceC32404OooO0Oo)) {
                    interfaceC32317OooO0Oo2.OooO00o(interfaceC32319OooO0o0);
                    return;
                }
                try {
                    Object obj2 = ((InterfaceC32404OooO0Oo) interfaceC32317OooO0Oo2).get();
                    if (obj2 == null) {
                        interfaceC32319OooO0o0.OooO00o(enumC32398OooO0OO);
                        interfaceC32319OooO0o0.onComplete();
                    } else {
                        RunnableC34584OooO0oo runnableC34584OooO0oo = new RunnableC34584OooO0oo(interfaceC32319OooO0o0, obj2);
                        interfaceC32319OooO0o0.OooO00o(runnableC34584OooO0oo);
                        runnableC34584OooO0oo.run();
                    }
                } catch (Throwable th) {
                    C33669o000oOoO.OooO0O0(th);
                    interfaceC32319OooO0o0.OooO00o(enumC32398OooO0OO);
                    interfaceC32319OooO0o0.onError(th);
                }
            } catch (Throwable th2) {
                C33669o000oOoO.OooO0O0(th2);
                interfaceC32319OooO0o0.OooO00o(enumC32398OooO0OO);
                interfaceC32319OooO0o0.onError(th2);
            }
        } catch (Throwable th3) {
            C33669o000oOoO.OooO0O0(th3);
            interfaceC32319OooO0o0.OooO00o(enumC32398OooO0OO);
            interfaceC32319OooO0o0.onError(th3);
        }
    }
}
