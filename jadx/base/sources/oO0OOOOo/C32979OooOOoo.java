package oO0OOOOo;

import androidx.core.location.LocationRequestCompat;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o0o0OO0.C30416Oooo0OO;
import oO00o0oO.C32389OooO0Oo;
import oO00o0oO.C32390OooO0o;
import oO00o0oO.EnumC32392OooO0oO;
import oO0OOO0o.C32939OooO00o;
import oO0OOOo0.EnumC33007OooO0oO;
import oO0OOOoo.InterfaceC33029OooO0oO;
import oO0OOOoo.InterfaceC33031OooOO0;
import oO0OOoOO.AbstractC33127OooO00o;
import oO0OooOO.AbstractC33491OooO0o0;
import oO0OooOO.InterfaceC33493OooO0oo;

/* JADX INFO: renamed from: oO0OOOOo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32979OooOOoo<T> extends AbstractC33127OooO00o<T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final AbstractC33491OooO0o0<T> f119324OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f119325OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final AtomicReference<OooO0OO<T>> f119326OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final OooO00o f119327OooOoOO;

    /* JADX INFO: renamed from: oO0OOOOo.OooOOoo$OooO00o */
    public static final class OooO00o<T> implements oOO00OOO.OooO00o<T> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final int f119328OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final AtomicReference<OooO0OO<T>> f119329OooOo0o;

        public OooO00o(AtomicReference<OooO0OO<T>> atomicReference, int i) {
            this.f119329OooOo0o = atomicReference;
            this.f119328OooOo = i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0008, code lost:
        
            continue;
         */
        @Override // oOO00OOO.OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void subscribe(oOO00OOO.OooO0O0<? super T> oooO0O0) {
            OooO0OO<T> oooO0OO;
            OooO0O0<T> oooO0O02 = new OooO0O0<>(oooO0O0);
            oooO0O0.OooO0Oo(oooO0O02);
            loop0: while (true) {
                OooO0OO<T> oooO0OO2 = this.f119329OooOo0o.get();
                if (oooO0OO2 == null || oooO0OO2.OooO0o0()) {
                    OooO0OO<T> oooO0OO3 = new OooO0OO<>(this.f119329OooOo0o, this.f119328OooOo);
                    AtomicReference<OooO0OO<T>> atomicReference = this.f119329OooOo0o;
                    while (!atomicReference.compareAndSet(oooO0OO2, oooO0OO3)) {
                        if (atomicReference.get() != oooO0OO2) {
                            break;
                        }
                    }
                    oooO0OO = oooO0OO3;
                } else {
                    oooO0OO = oooO0OO2;
                }
                while (true) {
                    AtomicReference<OooO0O0<T>[]> atomicReference2 = oooO0OO.f119338OooOoO0;
                    OooO0O0<T>[] oooO0O0Arr = atomicReference2.get();
                    if (oooO0O0Arr != OooO0OO.f119334Oooo000) {
                        int length = oooO0O0Arr.length;
                        OooO0O0<T>[] oooO0O0Arr2 = new OooO0O0[length + 1];
                        System.arraycopy(oooO0O0Arr, 0, oooO0O0Arr2, 0, length);
                        oooO0O0Arr2[length] = oooO0O02;
                        while (!atomicReference2.compareAndSet(oooO0O0Arr, oooO0O0Arr2)) {
                            if (atomicReference2.get() != oooO0O0Arr) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
            }
            if (oooO0O02.get() == Long.MIN_VALUE) {
                oooO0OO.OooO0o(oooO0O02);
            } else {
                oooO0O02.f119330OooOo = oooO0OO;
            }
            oooO0OO.OooO0O0();
        }
    }

    /* JADX INFO: renamed from: oO0OOOOo.OooOOoo$OooO0O0 */
    public static final class OooO0O0<T> extends AtomicLong implements oOO00OOO.OooO0OO {
        private static final long serialVersionUID = -4453897557930727610L;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public volatile OooO0OO<T> f119330OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final oOO00OOO.OooO0O0<? super T> f119331OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public long f119332OooOoO0;

        public OooO0O0(oOO00OOO.OooO0O0<? super T> oooO0O0) {
            this.f119331OooOo0o = oooO0O0;
        }

        @Override // oOO00OOO.OooO0OO
        public final void cancel() {
            OooO0OO<T> oooO0OO;
            if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE || (oooO0OO = this.f119330OooOo) == null) {
                return;
            }
            oooO0OO.OooO0o(this);
            oooO0OO.OooO0O0();
        }

        @Override // oOO00OOO.OooO0OO
        public final void request(long j) {
            long j2;
            if (EnumC33007OooO0oO.OooO0OO(j)) {
                do {
                    j2 = get();
                    if (j2 == Long.MIN_VALUE || j2 == LocationRequestCompat.PASSIVE_INTERVAL) {
                        break;
                    }
                } while (!compareAndSet(j2, o00000.OooOO0.OooO0OO(j2, j)));
                OooO0OO<T> oooO0OO = this.f119330OooOo;
                if (oooO0OO != null) {
                    oooO0OO.OooO0O0();
                }
            }
        }
    }

    /* JADX INFO: renamed from: oO0OOOOo.OooOOoo$OooO0OO */
    public static final class OooO0OO<T> extends AtomicInteger implements InterfaceC33493OooO0oo<T>, oO0OOO00.OooO0O0 {

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public static final OooO0O0[] f119333OooOooo = new OooO0O0[0];

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public static final OooO0O0[] f119334Oooo000 = new OooO0O0[0];
        private static final long serialVersionUID = -202316842419149694L;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final int f119335OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final AtomicReference<OooO0OO<T>> f119336OooOo0o;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public int f119340OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public volatile Serializable f119341OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public volatile InterfaceC33031OooOO0<T> f119342OooOooO;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final AtomicReference<oOO00OOO.OooO0OO> f119339OooOoOO = new AtomicReference<>();

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final AtomicReference<OooO0O0<T>[]> f119338OooOoO0 = new AtomicReference<>(f119333OooOooo);

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final AtomicBoolean f119337OooOoO = new AtomicBoolean();

        public OooO0OO(AtomicReference<OooO0OO<T>> atomicReference, int i) {
            this.f119336OooOo0o = atomicReference;
            this.f119335OooOo = i;
        }

        public final boolean OooO00o(Object obj, boolean z) {
            int i = 0;
            if (obj != null) {
                EnumC32392OooO0oO enumC32392OooO0oO = EnumC32392OooO0oO.f116485OooOo0o;
                OooO0O0<T>[] oooO0O0Arr = f119334Oooo000;
                AtomicReference<OooO0O0<T>[]> atomicReference = this.f119338OooOoO0;
                AtomicReference<OooO0OO<T>> atomicReference2 = this.f119336OooOo0o;
                if (obj != enumC32392OooO0oO) {
                    EnumC32392OooO0oO.OooO00o oooO00o = (EnumC32392OooO0oO.OooO00o) obj;
                    while (!atomicReference2.compareAndSet(this, null) && atomicReference2.get() == this) {
                    }
                    OooO0O0<T>[] andSet = atomicReference.getAndSet(oooO0O0Arr);
                    int length = andSet.length;
                    Throwable th = oooO00o.f116486OooOo0o;
                    if (length != 0) {
                        int length2 = andSet.length;
                        while (i < length2) {
                            andSet[i].f119331OooOo0o.onError(th);
                            i++;
                        }
                    } else {
                        oO0OOO0O.OooO00o.OooO0O0(th);
                    }
                    return true;
                }
                if (z) {
                    while (!atomicReference2.compareAndSet(this, null) && atomicReference2.get() == this) {
                    }
                    OooO0O0<T>[] andSet2 = atomicReference.getAndSet(oooO0O0Arr);
                    int length3 = andSet2.length;
                    while (i < length3) {
                        andSet2[i].f119331OooOo0o.onComplete();
                        i++;
                    }
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:75:0x0124, code lost:
        
            r4 = r0;
            r3 = true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0O0() {
            boolean z;
            T tPoll;
            OooO0O0<T>[] oooO0O0Arr;
            long j;
            T tPoll2;
            OooO0O0<T>[] oooO0O0Arr2;
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<OooO0O0<T>[]> atomicReference = this.f119338OooOoO0;
            boolean z2 = true;
            OooO0O0<T>[] oooO0O0Arr3 = atomicReference.get();
            int iAddAndGet = 1;
            while (true) {
                Serializable serializable = this.f119341OooOoo0;
                InterfaceC33031OooOO0<T> interfaceC33031OooOO0 = this.f119342OooOooO;
                boolean z3 = (interfaceC33031OooOO0 == null || interfaceC33031OooOO0.isEmpty()) ? z2 : false;
                if (OooO00o(serializable, z3)) {
                    return;
                }
                if (z3) {
                    z = z2;
                } else {
                    int length = oooO0O0Arr3.length;
                    int i = 0;
                    long jMin = LocationRequestCompat.PASSIVE_INTERVAL;
                    for (OooO0O0<T> oooO0O0 : oooO0O0Arr3) {
                        long j2 = oooO0O0.get();
                        if (j2 != Long.MIN_VALUE) {
                            jMin = Math.min(jMin, j2 - oooO0O0.f119332OooOoO0);
                        } else {
                            i++;
                        }
                    }
                    long j3 = 1;
                    if (length == i) {
                        Serializable serializable2 = this.f119341OooOoo0;
                        try {
                            tPoll = interfaceC33031OooOO0.poll();
                        } catch (Throwable th) {
                            C30416Oooo0OO.OooO00o(th);
                            this.f119339OooOoOO.get().cancel();
                            EnumC32392OooO0oO.OooO00o oooO00o = new EnumC32392OooO0oO.OooO00o(th);
                            this.f119341OooOoo0 = oooO00o;
                            serializable2 = oooO00o;
                            tPoll = null;
                        }
                        if (OooO00o(serializable2, tPoll == null ? z2 : false)) {
                            return;
                        }
                        if (this.f119340OooOoo != z2) {
                            this.f119339OooOoOO.get().request(1L);
                        }
                        z = z2;
                        oooO0O0Arr = oooO0O0Arr3;
                    } else {
                        int i2 = 0;
                        while (true) {
                            j = i2;
                            if (j >= jMin) {
                                break;
                            }
                            Serializable serializable3 = this.f119341OooOoo0;
                            try {
                                tPoll2 = interfaceC33031OooOO0.poll();
                            } catch (Throwable th2) {
                                C30416Oooo0OO.OooO00o(th2);
                                this.f119339OooOoOO.get().cancel();
                                EnumC32392OooO0oO.OooO00o oooO00o2 = new EnumC32392OooO0oO.OooO00o(th2);
                                this.f119341OooOoo0 = oooO00o2;
                                serializable3 = oooO00o2;
                                tPoll2 = null;
                            }
                            boolean z4 = tPoll2 == null ? z2 : false;
                            if (OooO00o(serializable3, z4)) {
                                return;
                            }
                            if (z4) {
                                z3 = z4;
                                break;
                            }
                            int length2 = oooO0O0Arr3.length;
                            int i3 = 0;
                            boolean z5 = false;
                            while (i3 < length2) {
                                long j4 = j3;
                                OooO0O0<T> oooO0O02 = oooO0O0Arr3[i3];
                                long j5 = oooO0O02.get();
                                if (j5 != Long.MIN_VALUE) {
                                    oooO0O0Arr2 = oooO0O0Arr3;
                                    if (j5 != LocationRequestCompat.PASSIVE_INTERVAL) {
                                        oooO0O02.f119332OooOoO0 += j4;
                                    }
                                    oooO0O02.f119331OooOo0o.onNext(tPoll2);
                                } else {
                                    oooO0O0Arr2 = oooO0O0Arr3;
                                    z5 = true;
                                }
                                i3++;
                                oooO0O0Arr3 = oooO0O0Arr2;
                                j3 = j4;
                            }
                            OooO0O0<T>[] oooO0O0Arr4 = oooO0O0Arr3;
                            long j6 = j3;
                            i2++;
                            OooO0O0<T>[] oooO0O0Arr5 = atomicReference.get();
                            if (z5 || oooO0O0Arr5 != oooO0O0Arr4) {
                                break;
                            }
                            oooO0O0Arr3 = oooO0O0Arr4;
                            z3 = z4;
                            j3 = j6;
                            z2 = true;
                        }
                        oooO0O0Arr = oooO0O0Arr3;
                        if (i2 > 0) {
                            z = true;
                            if (this.f119340OooOoo != 1) {
                                this.f119339OooOoOO.get().request(j);
                            }
                        } else {
                            z = true;
                        }
                        if (jMin == 0 || z3) {
                        }
                        z2 = z;
                    }
                    oooO0O0Arr3 = oooO0O0Arr;
                    z2 = z;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                oooO0O0Arr3 = atomicReference.get();
                z2 = z;
            }
        }

        @Override // oOO00OOO.OooO0O0
        public final void OooO0Oo(oOO00OOO.OooO0OO oooO0OO) {
            if (EnumC33007OooO0oO.OooO0O0(this.f119339OooOoOO, oooO0OO)) {
                if (oooO0OO instanceof InterfaceC33029OooO0oO) {
                    InterfaceC33029OooO0oO interfaceC33029OooO0oO = (InterfaceC33029OooO0oO) oooO0OO;
                    int iOooO0O0 = interfaceC33029OooO0oO.OooO0O0(3);
                    if (iOooO0O0 == 1) {
                        this.f119340OooOoo = iOooO0O0;
                        this.f119342OooOooO = interfaceC33029OooO0oO;
                        this.f119341OooOoo0 = EnumC32392OooO0oO.f116485OooOo0o;
                        OooO0O0();
                        return;
                    }
                    if (iOooO0O0 == 2) {
                        this.f119340OooOoo = iOooO0O0;
                        this.f119342OooOooO = interfaceC33029OooO0oO;
                        oooO0OO.request(this.f119335OooOo);
                        return;
                    }
                }
                this.f119342OooOooO = new C32939OooO00o(this.f119335OooOo);
                oooO0OO.request(this.f119335OooOo);
            }
        }

        public final void OooO0o(OooO0O0<T> oooO0O0) {
            OooO0O0<T>[] oooO0O0Arr;
            while (true) {
                AtomicReference<OooO0O0<T>[]> atomicReference = this.f119338OooOoO0;
                OooO0O0<T>[] oooO0O0Arr2 = atomicReference.get();
                int length = oooO0O0Arr2.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (oooO0O0Arr2[i].equals(oooO0O0)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    oooO0O0Arr = f119333OooOooo;
                } else {
                    OooO0O0<T>[] oooO0O0Arr3 = new OooO0O0[length - 1];
                    System.arraycopy(oooO0O0Arr2, 0, oooO0O0Arr3, 0, i);
                    System.arraycopy(oooO0O0Arr2, i + 1, oooO0O0Arr3, i, (length - i) - 1);
                    oooO0O0Arr = oooO0O0Arr3;
                }
                while (!atomicReference.compareAndSet(oooO0O0Arr2, oooO0O0Arr)) {
                    if (atomicReference.get() != oooO0O0Arr2) {
                        break;
                    }
                }
                return;
            }
        }

        public final boolean OooO0o0() {
            return this.f119338OooOoO0.get() == f119334Oooo000;
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            AtomicReference<OooO0OO<T>> atomicReference;
            AtomicReference<OooO0O0<T>[]> atomicReference2 = this.f119338OooOoO0;
            OooO0O0<T>[] oooO0O0Arr = atomicReference2.get();
            OooO0O0<T>[] oooO0O0Arr2 = f119334Oooo000;
            if (oooO0O0Arr == oooO0O0Arr2 || atomicReference2.getAndSet(oooO0O0Arr2) == oooO0O0Arr2) {
                return;
            }
            do {
                atomicReference = this.f119336OooOo0o;
                if (atomicReference.compareAndSet(this, null)) {
                    break;
                }
            } while (atomicReference.get() == this);
            EnumC33007OooO0oO.OooO00o(this.f119339OooOoOO);
        }

        @Override // oOO00OOO.OooO0O0
        public final void onComplete() {
            if (this.f119341OooOoo0 == null) {
                this.f119341OooOoo0 = EnumC32392OooO0oO.f116485OooOo0o;
                OooO0O0();
            }
        }

        @Override // oOO00OOO.OooO0O0
        public final void onError(Throwable th) {
            if (this.f119341OooOoo0 != null) {
                oO0OOO0O.OooO00o.OooO0O0(th);
            } else {
                this.f119341OooOoo0 = new EnumC32392OooO0oO.OooO00o(th);
                OooO0O0();
            }
        }

        @Override // oOO00OOO.OooO0O0
        public final void onNext(T t) {
            if (this.f119340OooOoo != 0 || this.f119342OooOooO.offer(t)) {
                OooO0O0();
            } else {
                onError(new oO00o00O.OooO0O0("Prefetch queue is full?!"));
            }
        }
    }

    public C32979OooOOoo(OooO00o oooO00o, AbstractC33491OooO0o0 abstractC33491OooO0o0, AtomicReference atomicReference, int i) {
        this.f119327OooOoOO = oooO00o;
        this.f119324OooOo = abstractC33491OooO0o0;
        this.f119326OooOoO0 = atomicReference;
        this.f119325OooOoO = i;
    }

    @Override // oO0OooOO.AbstractC33491OooO0o0
    public final void OooO0Oo(oOO00OOO.OooO0O0<? super T> oooO0O0) {
        this.f119327OooOoOO.subscribe(oooO0O0);
    }

    @Override // oO0OOoOO.AbstractC33127OooO00o
    public final void OooO0o0(C32389OooO0Oo c32389OooO0Oo) {
        OooO0OO<T> oooO0OO;
        loop0: while (true) {
            AtomicReference<OooO0OO<T>> atomicReference = this.f119326OooOoO0;
            oooO0OO = atomicReference.get();
            if (oooO0OO != null && !oooO0OO.OooO0o0()) {
                break;
            }
            OooO0OO<T> oooO0OO2 = new OooO0OO<>(atomicReference, this.f119325OooOoO);
            while (!atomicReference.compareAndSet(oooO0OO, oooO0OO2)) {
                if (atomicReference.get() != oooO0OO) {
                    break;
                }
            }
            oooO0OO = oooO0OO2;
            break loop0;
        }
        AtomicBoolean atomicBoolean = oooO0OO.f119337OooOoO;
        boolean z = false;
        if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
            z = true;
        }
        try {
            c32389OooO0Oo.f116480OooOo0o = oooO0OO;
            if (z) {
                this.f119324OooOo.OooO0OO(oooO0OO);
            }
        } catch (Throwable th) {
            C30416Oooo0OO.OooO00o(th);
            throw C32390OooO0o.OooO0OO(th);
        }
    }
}
