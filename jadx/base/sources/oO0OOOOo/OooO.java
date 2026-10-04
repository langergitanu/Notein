package oO0OOOOo;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o0Oo0oOo.o00Oo0;
import o0o0OO0.C30416Oooo0OO;
import oO00o0.OooO00o;
import oO00o0oO.C32388OooO0OO;
import oO00o0oO.C32390OooO0o;
import oO0OOO0o.C32939OooO00o;
import oO0OOOo0.EnumC33007OooO0oO;
import oO0OOOoo.InterfaceC33022OooO;
import oO0OOOoo.InterfaceC33029OooO0oO;
import oO0OOOoo.InterfaceC33031OooOO0;
import oO0OooOO.AbstractC33491OooO0o0;
import oO0OooOO.InterfaceC33493OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO<T, U> extends oO0OOOOo.OooO00o<T, U> {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f119157OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooO00o.OooO0o f119158OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final int f119159OooOoOO;

    public static final class OooO00o<T, U> extends AtomicReference<oOO00OOO.OooO0OO> implements InterfaceC33493OooO0oo<U>, oO0OOO00.OooO0O0 {
        private static final long serialVersionUID = -4606175640614850599L;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final OooO0O0<T, U> f119160OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final long f119161OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final int f119162OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final int f119163OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public volatile boolean f119164OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public long f119165OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public volatile InterfaceC33031OooOO0<U> f119166OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public int f119167OooOooO;

        public OooO00o(OooO0O0<T, U> oooO0O0, long j) {
            this.f119161OooOo0o = j;
            this.f119160OooOo = oooO0O0;
            int i = oooO0O0.f119172OooOoO;
            this.f119162OooOoO = i;
            this.f119163OooOoO0 = i >> 2;
        }

        public final void OooO00o(long j) {
            if (this.f119167OooOooO != 1) {
                long j2 = this.f119165OooOoo + j;
                if (j2 < this.f119163OooOoO0) {
                    this.f119165OooOoo = j2;
                } else {
                    this.f119165OooOoo = 0L;
                    get().request(j2);
                }
            }
        }

        @Override // oOO00OOO.OooO0O0
        public final void OooO0Oo(oOO00OOO.OooO0OO oooO0OO) throws Exception {
            if (EnumC33007OooO0oO.OooO0O0(this, oooO0OO)) {
                if (oooO0OO instanceof InterfaceC33029OooO0oO) {
                    InterfaceC33029OooO0oO interfaceC33029OooO0oO = (InterfaceC33029OooO0oO) oooO0OO;
                    int iOooO0O0 = interfaceC33029OooO0oO.OooO0O0(7);
                    if (iOooO0O0 == 1) {
                        this.f119167OooOooO = iOooO0O0;
                        this.f119166OooOoo0 = interfaceC33029OooO0oO;
                        this.f119164OooOoOO = true;
                        this.f119160OooOo.OooO0O0();
                        return;
                    }
                    if (iOooO0O0 == 2) {
                        this.f119167OooOooO = iOooO0O0;
                        this.f119166OooOoo0 = interfaceC33029OooO0oO;
                    }
                }
                oooO0OO.request(this.f119162OooOoO);
            }
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            EnumC33007OooO0oO.OooO00o(this);
        }

        @Override // oOO00OOO.OooO0O0
        public final void onComplete() throws Exception {
            this.f119164OooOoOO = true;
            this.f119160OooOo.OooO0O0();
        }

        @Override // oOO00OOO.OooO0O0
        public final void onError(Throwable th) throws Exception {
            lazySet(EnumC33007OooO0oO.f119402OooOo0o);
            OooO0O0<T, U> oooO0O0 = this.f119160OooOo;
            C32388OooO0OO c32388OooO0OO = oooO0O0.f119175OooOoo;
            c32388OooO0OO.getClass();
            if (!C32390OooO0o.OooO00o(c32388OooO0OO, th)) {
                oO0OOO0O.OooO00o.OooO0O0(th);
                return;
            }
            this.f119164OooOoOO = true;
            oooO0O0.f119181Oooo00O.cancel();
            for (OooO00o<?, ?> oooO00o : oooO0O0.f119178OooOooo.getAndSet(OooO0O0.f119169Oooo0oO)) {
                oooO00o.getClass();
                EnumC33007OooO0oO.OooO00o(oooO00o);
            }
            oooO0O0.OooO0O0();
        }

        @Override // oOO00OOO.OooO0O0
        public final void onNext(U u) throws Exception {
            if (this.f119167OooOooO == 2) {
                this.f119160OooOo.OooO0O0();
                return;
            }
            OooO0O0<T, U> oooO0O0 = this.f119160OooOo;
            if (oooO0O0.get() == 0 && oooO0O0.compareAndSet(0, 1)) {
                long j = oooO0O0.f119180Oooo000.get();
                InterfaceC33031OooOO0 c32939OooO00o = this.f119166OooOoo0;
                if (j == 0 || !(c32939OooO00o == null || c32939OooO00o.isEmpty())) {
                    if (c32939OooO00o == null && (c32939OooO00o = this.f119166OooOoo0) == null) {
                        c32939OooO00o = new C32939OooO00o(oooO0O0.f119172OooOoO);
                        this.f119166OooOoo0 = c32939OooO00o;
                    }
                    if (!c32939OooO00o.offer(u)) {
                        oooO0O0.onError(new oO00o00O.OooO0O0("Inner queue full?!"));
                        return;
                    }
                } else {
                    oooO0O0.f119171OooOo0o.onNext(u);
                    if (j != LocationRequestCompat.PASSIVE_INTERVAL) {
                        oooO0O0.f119180Oooo000.decrementAndGet();
                    }
                    OooO00o(1L);
                }
                if (oooO0O0.decrementAndGet() == 0) {
                    return;
                }
            } else {
                InterfaceC33031OooOO0 c32939OooO00o2 = this.f119166OooOoo0;
                if (c32939OooO00o2 == null) {
                    c32939OooO00o2 = new C32939OooO00o(oooO0O0.f119172OooOoO);
                    this.f119166OooOoo0 = c32939OooO00o2;
                }
                if (!c32939OooO00o2.offer(u)) {
                    oooO0O0.onError(new oO00o00O.OooO0O0("Inner queue full?!"));
                    return;
                } else if (oooO0O0.getAndIncrement() != 0) {
                    return;
                }
            }
            oooO0O0.OooO0o0();
        }
    }

    public static final class OooO0O0<T, U> extends AtomicInteger implements InterfaceC33493OooO0oo<T>, oOO00OOO.OooO0OO {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o<?, ?>[] f119168Oooo0o = new OooO00o[0];

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public static final OooO00o<?, ?>[] f119169Oooo0oO = new OooO00o[0];
        private static final long serialVersionUID = -2117620485640801370L;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final OooO00o.OooO0o f119170OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33493OooO0oo f119171OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final int f119172OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final int f119173OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public volatile InterfaceC33022OooO<U> f119174OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public final C32388OooO0OO f119175OooOoo = new C32388OooO0OO();

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public volatile boolean f119176OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public volatile boolean f119177OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public final AtomicReference<OooO00o<?, ?>[]> f119178OooOooo;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public long f119179Oooo0;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public final AtomicLong f119180Oooo000;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public oOO00OOO.OooO0OO f119181Oooo00O;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public long f119182Oooo00o;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        public int f119183Oooo0O0;

        /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
        public int f119184Oooo0OO;

        /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
        public final int f119185Oooo0o0;

        public OooO0O0(InterfaceC33493OooO0oo interfaceC33493OooO0oo, OooO00o.OooO0o oooO0o, int i, int i2) {
            AtomicReference<OooO00o<?, ?>[]> atomicReference = new AtomicReference<>();
            this.f119178OooOooo = atomicReference;
            this.f119180Oooo000 = new AtomicLong();
            this.f119171OooOo0o = interfaceC33493OooO0oo;
            this.f119170OooOo = oooO0o;
            this.f119173OooOoO0 = i;
            this.f119172OooOoO = i2;
            this.f119185Oooo0o0 = Math.max(1, i >> 1);
            atomicReference.lazySet(f119168Oooo0o);
        }

        public final boolean OooO00o() {
            if (this.f119177OooOooO) {
                InterfaceC33022OooO<U> interfaceC33022OooO = this.f119174OooOoOO;
                if (interfaceC33022OooO != null) {
                    interfaceC33022OooO.clear();
                    return true;
                }
            } else {
                if (this.f119175OooOoo.get() == null) {
                    return false;
                }
                InterfaceC33022OooO<U> interfaceC33022OooO2 = this.f119174OooOoOO;
                if (interfaceC33022OooO2 != null) {
                    interfaceC33022OooO2.clear();
                }
                C32388OooO0OO c32388OooO0OO = this.f119175OooOoo;
                c32388OooO0OO.getClass();
                Throwable thOooO0O0 = C32390OooO0o.OooO0O0(c32388OooO0OO);
                if (thOooO0O0 != C32390OooO0o.f116481OooO00o) {
                    this.f119171OooOo0o.onError(thOooO0O0);
                }
            }
            return true;
        }

        public final void OooO0O0() throws Exception {
            if (getAndIncrement() == 0) {
                OooO0o0();
            }
        }

        @Override // oOO00OOO.OooO0O0
        public final void OooO0Oo(oOO00OOO.OooO0OO oooO0OO) {
            if (EnumC33007OooO0oO.OooO0Oo(this.f119181Oooo00O, oooO0OO)) {
                this.f119181Oooo00O = oooO0OO;
                this.f119171OooOo0o.OooO0Oo(this);
                if (this.f119177OooOooO) {
                    return;
                }
                int i = this.f119173OooOoO0;
                if (i == Integer.MAX_VALUE) {
                    oooO0OO.request(LocationRequestCompat.PASSIVE_INTERVAL);
                } else {
                    oooO0OO.request(i);
                }
            }
        }

        public final InterfaceC33022OooO OooO0o() {
            InterfaceC33022OooO<U> oooO0O0 = this.f119174OooOoOO;
            if (oooO0O0 == null) {
                oooO0O0 = this.f119173OooOoO0 == Integer.MAX_VALUE ? new oO0OOO0o.OooO0O0<>(this.f119172OooOoO) : new C32939OooO00o<>(this.f119173OooOoO0);
                this.f119174OooOoOO = oooO0O0;
            }
            return oooO0O0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:152:0x018f A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00de  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0o0() throws Exception {
            boolean z;
            long j;
            long j2;
            boolean z2;
            long j3;
            int i;
            OooO00o<T, U>[] oooO00oArr;
            U u;
            InterfaceC33493OooO0oo interfaceC33493OooO0oo = this.f119171OooOo0o;
            int iAddAndGet = 1;
            while (!OooO00o()) {
                InterfaceC33022OooO<U> interfaceC33022OooO = this.f119174OooOoOO;
                long jAddAndGet = this.f119180Oooo000.get();
                boolean z3 = jAddAndGet == LocationRequestCompat.PASSIVE_INTERVAL;
                long j4 = 0;
                if (interfaceC33022OooO != null) {
                    j = 0;
                    do {
                        long j5 = 0;
                        u = null;
                        while (true) {
                            if (jAddAndGet == 0) {
                                z = true;
                                break;
                            }
                            z = true;
                            U uPoll = interfaceC33022OooO.poll();
                            if (OooO00o()) {
                                return;
                            }
                            if (uPoll == null) {
                                u = uPoll;
                                break;
                            }
                            interfaceC33493OooO0oo.onNext(uPoll);
                            j++;
                            j5++;
                            jAddAndGet--;
                            u = uPoll;
                        }
                        if (j5 != 0) {
                            jAddAndGet = z3 ? LocationRequestCompat.PASSIVE_INTERVAL : this.f119180Oooo000.addAndGet(-j5);
                        }
                        if (jAddAndGet == 0) {
                            break;
                        }
                    } while (u != null);
                } else {
                    z = true;
                    j = 0;
                }
                boolean z4 = this.f119176OooOoo0;
                InterfaceC33022OooO<U> interfaceC33022OooO2 = this.f119174OooOoOO;
                OooO00o<?, ?>[] oooO00oArr2 = this.f119178OooOooo.get();
                int length = oooO00oArr2.length;
                if (z4 && ((interfaceC33022OooO2 == null || interfaceC33022OooO2.isEmpty()) && length == 0)) {
                    C32388OooO0OO c32388OooO0OO = this.f119175OooOoo;
                    c32388OooO0OO.getClass();
                    Throwable thOooO0O0 = C32390OooO0o.OooO0O0(c32388OooO0OO);
                    if (thOooO0O0 != C32390OooO0o.f116481OooO00o) {
                        if (thOooO0O0 == null) {
                            interfaceC33493OooO0oo.onComplete();
                            return;
                        } else {
                            interfaceC33493OooO0oo.onError(thOooO0O0);
                            return;
                        }
                    }
                    return;
                }
                if (length != 0) {
                    long j6 = this.f119179Oooo0;
                    int i2 = this.f119183Oooo0O0;
                    if (length > i2) {
                        j3 = 1;
                        if (oooO00oArr2[i2].f119161OooOo0o != j6) {
                        }
                        int i3 = i2;
                        boolean z5 = false;
                        i = 0;
                        while (true) {
                            if (i < length) {
                                oooO00oArr = oooO00oArr2;
                                j2 = j4;
                                break;
                            }
                            if (OooO00o()) {
                                return;
                            }
                            OooO00o<T, U> oooO00o = oooO00oArr2[i3];
                            U uPoll2 = null;
                            while (!OooO00o()) {
                                InterfaceC33031OooOO0<U> interfaceC33031OooOO0 = oooO00o.f119166OooOoo0;
                                if (interfaceC33031OooOO0 == null) {
                                    oooO00oArr = oooO00oArr2;
                                    j2 = j4;
                                } else {
                                    j2 = j4;
                                    while (jAddAndGet != j2) {
                                        try {
                                            uPoll2 = interfaceC33031OooOO0.poll();
                                            if (uPoll2 == null) {
                                                break;
                                            }
                                            interfaceC33493OooO0oo.onNext(uPoll2);
                                            if (OooO00o()) {
                                                return;
                                            }
                                            jAddAndGet -= j3;
                                            j4 += j3;
                                        } catch (Throwable th) {
                                            C30416Oooo0OO.OooO00o(th);
                                            EnumC33007OooO0oO.OooO00o(oooO00o);
                                            C32388OooO0OO c32388OooO0OO2 = this.f119175OooOoo;
                                            c32388OooO0OO2.getClass();
                                            C32390OooO0o.OooO00o(c32388OooO0OO2, th);
                                            this.f119181Oooo00O.cancel();
                                            if (OooO00o()) {
                                                return;
                                            }
                                            OooO0oO(oooO00o);
                                            i++;
                                            oooO00oArr = oooO00oArr2;
                                            z5 = z;
                                        }
                                    }
                                    if (j4 != j2) {
                                        if (z3) {
                                            oooO00oArr = oooO00oArr2;
                                            jAddAndGet = LocationRequestCompat.PASSIVE_INTERVAL;
                                        } else {
                                            oooO00oArr = oooO00oArr2;
                                            jAddAndGet = this.f119180Oooo000.addAndGet(-j4);
                                        }
                                        oooO00o.OooO00o(j4);
                                    } else {
                                        oooO00oArr = oooO00oArr2;
                                    }
                                    if (jAddAndGet != j2 && uPoll2 != null) {
                                        oooO00oArr2 = oooO00oArr;
                                        j4 = j2;
                                    }
                                }
                                boolean z6 = oooO00o.f119164OooOoOO;
                                InterfaceC33031OooOO0<U> interfaceC33031OooOO02 = oooO00o.f119166OooOoo0;
                                if (z6 && (interfaceC33031OooOO02 == null || interfaceC33031OooOO02.isEmpty())) {
                                    OooO0oO(oooO00o);
                                    if (OooO00o()) {
                                        return;
                                    }
                                    j += j3;
                                    z5 = z;
                                }
                                if (jAddAndGet == j2) {
                                    break;
                                }
                                i3++;
                                if (i3 == length) {
                                    i3 = 0;
                                }
                                i++;
                                oooO00oArr2 = oooO00oArr;
                                j4 = j2;
                            }
                            return;
                        }
                        z2 = z5;
                        this.f119183Oooo0O0 = i3;
                        this.f119179Oooo0 = oooO00oArr[i3].f119161OooOo0o;
                    } else {
                        j3 = 1;
                    }
                    if (length <= i2) {
                        i2 = 0;
                    }
                    for (int i4 = 0; i4 < length && oooO00oArr2[i2].f119161OooOo0o != j6; i4++) {
                        i2++;
                        if (i2 == length) {
                            i2 = 0;
                        }
                    }
                    this.f119183Oooo0O0 = i2;
                    this.f119179Oooo0 = oooO00oArr2[i2].f119161OooOo0o;
                    int i32 = i2;
                    boolean z52 = false;
                    i = 0;
                    while (true) {
                        if (i < length) {
                        }
                        i++;
                        oooO00oArr2 = oooO00oArr;
                        j4 = j2;
                    }
                    z2 = z52;
                    this.f119183Oooo0O0 = i32;
                    this.f119179Oooo0 = oooO00oArr[i32].f119161OooOo0o;
                } else {
                    j2 = 0;
                    z2 = false;
                }
                long j7 = j;
                if (j7 != j2 && !this.f119177OooOooO) {
                    this.f119181Oooo00O.request(j7);
                }
                if (!z2 && (iAddAndGet = addAndGet(-iAddAndGet)) == 0) {
                    return;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void OooO0oO(OooO00o<T, U> oooO00o) {
            OooO00o<?, ?>[] oooO00oArr;
            while (true) {
                AtomicReference<OooO00o<?, ?>[]> atomicReference = this.f119178OooOooo;
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
                    oooO00oArr = f119168Oooo0o;
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

        @Override // oOO00OOO.OooO0OO
        public final void cancel() {
            InterfaceC33022OooO<U> interfaceC33022OooO;
            OooO00o<?, ?>[] andSet;
            if (this.f119177OooOooO) {
                return;
            }
            this.f119177OooOooO = true;
            this.f119181Oooo00O.cancel();
            AtomicReference<OooO00o<?, ?>[]> atomicReference = this.f119178OooOooo;
            OooO00o<?, ?>[] oooO00oArr = atomicReference.get();
            OooO00o<?, ?>[] oooO00oArr2 = f119169Oooo0oO;
            if (oooO00oArr != oooO00oArr2 && (andSet = atomicReference.getAndSet(oooO00oArr2)) != oooO00oArr2) {
                for (OooO00o<?, ?> oooO00o : andSet) {
                    oooO00o.getClass();
                    EnumC33007OooO0oO.OooO00o(oooO00o);
                }
                C32388OooO0OO c32388OooO0OO = this.f119175OooOoo;
                c32388OooO0OO.getClass();
                Throwable thOooO0O0 = C32390OooO0o.OooO0O0(c32388OooO0OO);
                if (thOooO0O0 != null && thOooO0O0 != C32390OooO0o.f116481OooO00o) {
                    oO0OOO0O.OooO00o.OooO0O0(thOooO0O0);
                }
            }
            if (getAndIncrement() != 0 || (interfaceC33022OooO = this.f119174OooOoOO) == null) {
                return;
            }
            interfaceC33022OooO.clear();
        }

        @Override // oOO00OOO.OooO0O0
        public final void onComplete() throws Exception {
            if (this.f119176OooOoo0) {
                return;
            }
            this.f119176OooOoo0 = true;
            OooO0O0();
        }

        @Override // oOO00OOO.OooO0O0
        public final void onError(Throwable th) throws Exception {
            if (this.f119176OooOoo0) {
                oO0OOO0O.OooO00o.OooO0O0(th);
                return;
            }
            C32388OooO0OO c32388OooO0OO = this.f119175OooOoo;
            c32388OooO0OO.getClass();
            if (!C32390OooO0o.OooO00o(c32388OooO0OO, th)) {
                oO0OOO0O.OooO00o.OooO0O0(th);
            } else {
                this.f119176OooOoo0 = true;
                OooO0O0();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oOO00OOO.OooO0O0
        public final void onNext(T t) throws Exception {
            if (this.f119176OooOoo0) {
                return;
            }
            try {
                this.f119170OooOo.getClass();
                o00Oo0.OooO00o(t, "The mapper returned a null Publisher");
                oOO00OOO.OooO00o oooO00o = (oOO00OOO.OooO00o) t;
                if (!(oooO00o instanceof Callable)) {
                    long j = this.f119182Oooo00o;
                    this.f119182Oooo00o = 1 + j;
                    OooO00o<?, ?> oooO00o2 = new OooO00o<>(this, j);
                    while (true) {
                        AtomicReference<OooO00o<?, ?>[]> atomicReference = this.f119178OooOooo;
                        OooO00o<?, ?>[] oooO00oArr = atomicReference.get();
                        if (oooO00oArr == f119169Oooo0oO) {
                            EnumC33007OooO0oO.OooO00o(oooO00o2);
                            return;
                        }
                        int length = oooO00oArr.length;
                        OooO00o<?, ?>[] oooO00oArr2 = new OooO00o[length + 1];
                        System.arraycopy(oooO00oArr, 0, oooO00oArr2, 0, length);
                        oooO00oArr2[length] = oooO00o2;
                        while (!atomicReference.compareAndSet(oooO00oArr, oooO00oArr2)) {
                            if (atomicReference.get() != oooO00oArr) {
                                break;
                            }
                        }
                        oooO00o.subscribe(oooO00o2);
                        return;
                    }
                }
                try {
                    Object objCall = ((Callable) oooO00o).call();
                    if (objCall == null) {
                        if (this.f119173OooOoO0 == Integer.MAX_VALUE || this.f119177OooOooO) {
                            return;
                        }
                        int i = this.f119184Oooo0OO + 1;
                        this.f119184Oooo0OO = i;
                        int i2 = this.f119185Oooo0o0;
                        if (i == i2) {
                            this.f119184Oooo0OO = 0;
                            this.f119181Oooo00O.request(i2);
                            return;
                        }
                        return;
                    }
                    if (get() == 0 && compareAndSet(0, 1)) {
                        long j2 = this.f119180Oooo000.get();
                        InterfaceC33022OooO<U> interfaceC33022OooO = this.f119174OooOoOO;
                        if (j2 == 0 || !(interfaceC33022OooO == 0 || interfaceC33022OooO.isEmpty())) {
                            if (interfaceC33022OooO == 0) {
                                interfaceC33022OooO = (InterfaceC33022OooO<U>) OooO0o();
                            }
                            if (!interfaceC33022OooO.offer(objCall)) {
                                onError(new IllegalStateException("Scalar queue full?!"));
                                return;
                            }
                        } else {
                            this.f119171OooOo0o.onNext(objCall);
                            if (j2 != LocationRequestCompat.PASSIVE_INTERVAL) {
                                this.f119180Oooo000.decrementAndGet();
                            }
                            if (this.f119173OooOoO0 != Integer.MAX_VALUE && !this.f119177OooOooO) {
                                int i3 = this.f119184Oooo0OO + 1;
                                this.f119184Oooo0OO = i3;
                                int i4 = this.f119185Oooo0o0;
                                if (i3 == i4) {
                                    this.f119184Oooo0OO = 0;
                                    this.f119181Oooo00O.request(i4);
                                }
                            }
                        }
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    } else if (!OooO0o().offer(objCall)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    } else if (getAndIncrement() != 0) {
                        return;
                    }
                    OooO0o0();
                } catch (Throwable th) {
                    C30416Oooo0OO.OooO00o(th);
                    C32388OooO0OO c32388OooO0OO = this.f119175OooOoo;
                    c32388OooO0OO.getClass();
                    C32390OooO0o.OooO00o(c32388OooO0OO, th);
                    OooO0O0();
                }
            } catch (Throwable th2) {
                C30416Oooo0OO.OooO00o(th2);
                this.f119181Oooo00O.cancel();
                onError(th2);
            }
        }

        @Override // oOO00OOO.OooO0OO
        public final void request(long j) throws Exception {
            if (EnumC33007OooO0oO.OooO0OO(j)) {
                o00000.OooOO0.OooO0O0(this.f119180Oooo000, j);
                OooO0O0();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(C32975OooOO0o c32975OooOO0o, int i) {
        super(c32975OooOO0o);
        OooO00o.OooO0o oooO0o = oO00o0.OooO00o.f116235OooO00o;
        this.f119158OooOoO0 = oooO0o;
        this.f119157OooOoO = 3;
        this.f119159OooOoOO = i;
    }

    @Override // oO0OooOO.AbstractC33491OooO0o0
    public final void OooO0Oo(oOO00OOO.OooO0O0<? super U> oooO0O0) {
        InterfaceC33493OooO0oo interfaceC33493OooO0oo = (InterfaceC33493OooO0oo) oooO0O0;
        AbstractC33491OooO0o0<T> abstractC33491OooO0o0 = this.f119186OooOo;
        OooO00o.OooO0o oooO0o = this.f119158OooOoO0;
        if (OooOo00.OooO00o(abstractC33491OooO0o0, interfaceC33493OooO0oo, oooO0o)) {
            return;
        }
        abstractC33491OooO0o0.OooO0OO(new OooO0O0(interfaceC33493OooO0oo, oooO0o, this.f119157OooOoO, this.f119159OooOoOO));
    }
}
