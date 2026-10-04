package oO0o0Ooo;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: oO0o0Ooo.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33832OooOOO0<E> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f121941OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f121942OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f121943OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f121944OooO0Oo;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f121939OooO0o0 = AtomicReferenceFieldUpdater.newUpdater(C33832OooOOO0.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f121938OooO0o = AtomicLongFieldUpdater.newUpdater(C33832OooOOO0.class, "_state$volatile");

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final C33839OooOo0 f121940OooO0oO = new C33839OooOo0("REMOVE_FROZEN");

    /* JADX INFO: renamed from: oO0o0Ooo.OooOOO0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f121945OooO00o;

        public OooO00o(int i) {
            this.f121945OooO00o = i;
        }
    }

    public C33832OooOOO0(int i, boolean z) {
        this.f121941OooO00o = i;
        this.f121942OooO0O0 = z;
        int i2 = i - 1;
        this.f121943OooO0OO = i2;
        this.f121944OooO0Oo = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int OooO00o(Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f121938OooO0o;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f121943OooO0OO;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f121944OooO0Oo;
            if (!this.f121942OooO0O0 && atomicReferenceArray.get(i2 & i3) != null) {
                int i4 = this.f121941OooO00o;
                if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                    return 1;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                atomicReferenceArray.set(i2 & i3, runnable);
                C33832OooOOO0<E> c33832OooOOO0OooO0OO = this;
                while ((atomicLongFieldUpdater.get(c33832OooOOO0OooO0OO) & 1152921504606846976L) != 0) {
                    c33832OooOOO0OooO0OO = c33832OooOOO0OooO0OO.OooO0OO();
                    AtomicReferenceArray atomicReferenceArray2 = c33832OooOOO0OooO0OO.f121944OooO0Oo;
                    int i5 = c33832OooOOO0OooO0OO.f121943OooO0OO & i2;
                    Object obj = atomicReferenceArray2.get(i5);
                    if ((obj instanceof OooO00o) && ((OooO00o) obj).f121945OooO00o == i2) {
                        atomicReferenceArray2.set(i5, runnable);
                    } else {
                        c33832OooOOO0OooO0OO = null;
                    }
                    if (c33832OooOOO0OooO0OO == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    public final boolean OooO0O0() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f121938OooO0o;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C33832OooOOO0<E> OooO0OO() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        C33832OooOOO0<E> c33832OooOOO0;
        while (true) {
            atomicLongFieldUpdater = f121938OooO0o;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                c33832OooOOO0 = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            c33832OooOOO0 = this;
            if (atomicLongFieldUpdater.compareAndSet(c33832OooOOO0, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121939OooO0o0;
            C33832OooOOO0<E> c33832OooOOO02 = (C33832OooOOO0) atomicReferenceFieldUpdater.get(this);
            if (c33832OooOOO02 != null) {
                return c33832OooOOO02;
            }
            C33832OooOOO0 c33832OooOOO03 = new C33832OooOOO0(c33832OooOOO0.f121941OooO00o * 2, c33832OooOOO0.f121942OooO0O0);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = c33832OooOOO0.f121943OooO0OO;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object oooO00o = c33832OooOOO0.f121944OooO0Oo.get(i4);
                if (oooO00o == null) {
                    oooO00o = new OooO00o(i);
                }
                c33832OooOOO03.f121944OooO0Oo.set(c33832OooOOO03.f121943OooO0OO & i, oooO00o);
                i++;
            }
            atomicLongFieldUpdater.set(c33832OooOOO03, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c33832OooOOO03) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo() {
        C33832OooOOO0<E> c33832OooOOO0OooO0OO = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f121938OooO0o;
            long j = atomicLongFieldUpdater.get(c33832OooOOO0OooO0OO);
            if ((j & 1152921504606846976L) != 0) {
                return f121940OooO0oO;
            }
            int i = (int) (j & 1073741823);
            int i2 = c33832OooOOO0OooO0OO.f121943OooO0OO;
            int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 == i4) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = c33832OooOOO0OooO0OO.f121944OooO0Oo;
            Object obj = atomicReferenceArray.get(i4);
            boolean z = c33832OooOOO0OooO0OO.f121942OooO0O0;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof OooO00o) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(c33832OooOOO0OooO0OO, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i4, null);
                    return obj;
                }
                c33832OooOOO0OooO0OO = this;
                if (z) {
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f121938OooO0o;
                        long j3 = atomicLongFieldUpdater2.get(c33832OooOOO0OooO0OO);
                        int i5 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            c33832OooOOO0OooO0OO = c33832OooOOO0OooO0OO.OooO0OO();
                        } else {
                            C33832OooOOO0<E> c33832OooOOO0 = c33832OooOOO0OooO0OO;
                            c33832OooOOO0OooO0OO = c33832OooOOO0;
                            if (atomicLongFieldUpdater2.compareAndSet(c33832OooOOO0, j3, (j3 & (-1073741824)) | j2)) {
                                c33832OooOOO0OooO0OO.f121944OooO0Oo.set(c33832OooOOO0OooO0OO.f121943OooO0OO & i5, null);
                                c33832OooOOO0OooO0OO = null;
                            } else {
                                continue;
                            }
                        }
                        if (c33832OooOOO0OooO0OO == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
