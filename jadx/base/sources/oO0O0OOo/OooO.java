package oO0O0OOo;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO<E> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f117331OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f117332OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AtomicReferenceArray<Object> f117333OooO0OO;
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooO00o f117329OooO0o = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f117328OooO0Oo = AtomicReferenceFieldUpdater.newUpdater(OooO.class, Object.class, "_next");

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f117330OooO0o0 = AtomicLongFieldUpdater.newUpdater(OooO.class, "_state");

    public static final class OooO00o {
        public final String toString() {
            return "REMOVE_FROZEN";
        }
    }

    public static final class OooO0O0 {
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f117334OooO00o;

        public OooO0OO(int i) {
            this.f117334OooO00o = i;
        }
    }

    public OooO(int i) {
        this.f117331OooO00o = i;
        int i2 = i - 1;
        this.f117332OooO0O0 = i2;
        this.f117333OooO0OO = new AtomicReferenceArray<>(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int OooO00o(OooOO0O element) {
        long j;
        int i;
        kotlin.jvm.internal.OooOOO0.OooO0oO(element, "element");
        do {
            j = this._state;
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            i = (int) ((1152921503533105152L & j) >> 30);
            int i2 = this.f117332OooO0O0;
            if (((i + 2) & i2) == (((int) (1073741823 & j)) & i2)) {
                return 1;
            }
        } while (!f117330OooO0o0.compareAndSet(this, j, (((long) ((i + 1) & 1073741823)) << 30) | ((-1152921503533105153L) & j)));
        this.f117333OooO0OO.set(this.f117332OooO0O0 & i, element);
        OooO<E> oooOOooO0Oo = this;
        while ((oooOOooO0Oo._state & 1152921504606846976L) != 0) {
            oooOOooO0Oo = oooOOooO0Oo.OooO0Oo();
            AtomicReferenceArray<Object> atomicReferenceArray = oooOOooO0Oo.f117333OooO0OO;
            int i3 = oooOOooO0Oo.f117332OooO0O0 & i;
            Object obj = atomicReferenceArray.get(i3);
            if ((obj instanceof OooO0OO) && ((OooO0OO) obj).f117334OooO00o == i) {
                atomicReferenceArray.set(i3, element);
            } else {
                oooOOooO0Oo = null;
            }
            if (oooOOooO0Oo == null) {
                return 0;
            }
        }
        return 0;
    }

    public final boolean OooO0O0() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f117330OooO0o0.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    public final boolean OooO0OO() {
        long j = this._state;
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    public final OooO<E> OooO0Oo() {
        long j;
        OooO<E> oooO;
        while (true) {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                oooO = this;
                break;
            }
            long j2 = j | 1152921504606846976L;
            oooO = this;
            if (f117330OooO0o0.compareAndSet(oooO, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            OooO<E> oooO2 = (OooO) oooO._next;
            if (oooO2 != null) {
                return oooO2;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f117328OooO0Oo;
            OooO oooO3 = new OooO(oooO.f117331OooO00o * 2);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = oooO.f117332OooO0O0;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                AtomicReferenceArray<Object> atomicReferenceArray = oooO3.f117333OooO0OO;
                int i5 = oooO3.f117332OooO0O0 & i;
                Object oooO0OO = oooO.f117333OooO0OO.get(i4);
                if (oooO0OO == null) {
                    oooO0OO = new OooO0OO(i);
                }
                atomicReferenceArray.set(i5, oooO0OO);
                i++;
            }
            oooO3._state = (-1152921504606846977L) & j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, oooO3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object OooO0o0() {
        Object obj;
        long j = this._state;
        if ((j & 1152921504606846976L) != 0) {
            return f117329OooO0o;
        }
        int i = (int) (j & 1073741823);
        int i2 = this.f117332OooO0O0;
        int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
        int i4 = i2 & i;
        if (i3 == i4 || (obj = this.f117333OooO0OO.get(i4)) == null || (obj instanceof OooO0OO)) {
            return null;
        }
        long j2 = (i + 1) & 1073741823;
        if (f117330OooO0o0.compareAndSet(this, j, (j & (-1073741824)) | j2)) {
            this.f117333OooO0OO.set(this.f117332OooO0O0 & i, null);
            return obj;
        }
        OooO<E> oooOOooO0Oo = this;
        while (true) {
            long j3 = oooOOooO0Oo._state;
            int i5 = (int) (j3 & 1073741823);
            if (i5 != i) {
                throw new IllegalStateException("This queue can have only one consumer");
            }
            if ((j3 & 1152921504606846976L) != 0) {
                oooOOooO0Oo = oooOOooO0Oo.OooO0Oo();
            } else {
                OooO<E> oooO = oooOOooO0Oo;
                if (f117330OooO0o0.compareAndSet(oooO, j3, (j3 & (-1073741824)) | j2)) {
                    oooO.f117333OooO0OO.set(oooO.f117332OooO0O0 & i5, null);
                    oooOOooO0Oo = null;
                } else {
                    oooOOooO0Oo = oooO;
                }
            }
            if (oooOOooO0Oo == null) {
                return obj;
            }
        }
    }
}
