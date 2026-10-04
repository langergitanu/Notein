package o00ooO0;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.ByteArrayOutputStream;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import o00o0o00.C25438OooO00o;
import o00o0o00.C25439OooO0O0;
import o00o0o0o.InterfaceC25445OooO0OO;
import o00o0o0o.InterfaceC25448OooO0o0;

/* JADX INFO: renamed from: o00ooO0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC25738OooO0oO<V> implements InterfaceC25448OooO0o0<V> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final InterfaceC25755Oooo00O f87831OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Class<?> f87832OooO00o = getClass();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC25445OooO0OO f87833OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Oooo000 f87834OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final SparseArray<C25740OooOO0o<V>> f87835OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f87836OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Set<V> f87837OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO00o f87838OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO00o f87839OooO0oo;

    /* JADX INFO: renamed from: o00ooO0.OooO0oO$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f87840OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f87841OooO0O0;

        public final void OooO00o(int i) {
            int i2;
            int i3 = this.f87841OooO0O0;
            if (i3 < i || (i2 = this.f87840OooO00o) <= 0) {
                C25438OooO00o.OooOO0O("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i), Integer.valueOf(this.f87841OooO0O0), Integer.valueOf(this.f87840OooO00o));
            } else {
                this.f87840OooO00o = i2 - 1;
                this.f87841OooO0O0 = i3 - i;
            }
        }
    }

    /* JADX INFO: renamed from: o00ooO0.OooO0oO$OooO0O0 */
    public static class OooO0O0 extends RuntimeException {
        public OooO0O0(Integer num) {
            super("Invalid size: " + num.toString());
        }
    }

    /* JADX INFO: renamed from: o00ooO0.OooO0oO$OooO0OO */
    public static class OooO0OO extends RuntimeException {
    }

    public AbstractC25738OooO0oO(InterfaceC25445OooO0OO interfaceC25445OooO0OO, Oooo000 oooo000, InterfaceC25755Oooo00O interfaceC25755Oooo00O) {
        interfaceC25445OooO0OO.getClass();
        this.f87833OooO0O0 = interfaceC25445OooO0OO;
        oooo000.getClass();
        this.f87834OooO0OO = oooo000;
        interfaceC25755Oooo00O.getClass();
        this.f87831OooO = interfaceC25755Oooo00O;
        SparseArray<C25740OooOO0o<V>> sparseArray = new SparseArray<>();
        this.f87835OooO0Oo = sparseArray;
        SparseIntArray sparseIntArray = new SparseIntArray(0);
        synchronized (this) {
            try {
                sparseArray.clear();
                SparseIntArray sparseIntArray2 = oooo000.f87901OooO0OO;
                if (sparseIntArray2 != null) {
                    for (int i = 0; i < sparseIntArray2.size(); i++) {
                        int iKeyAt = sparseIntArray2.keyAt(i);
                        int iValueAt = sparseIntArray2.valueAt(i);
                        int i2 = sparseIntArray.get(iKeyAt, 0);
                        SparseArray<C25740OooOO0o<V>> sparseArray2 = this.f87835OooO0Oo;
                        int iOooO0oO = OooO0oO(iKeyAt);
                        this.f87834OooO0OO.getClass();
                        sparseArray2.put(iKeyAt, new C25740OooOO0o<>(iOooO0oO, iValueAt, i2));
                    }
                    this.f87836OooO0o = false;
                } else {
                    this.f87836OooO0o = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f87837OooO0o0 = Collections.newSetFromMap(new IdentityHashMap());
        this.f87839OooO0oo = new OooO00o();
        this.f87838OooO0oO = new OooO00o();
    }

    public final synchronized boolean OooO() {
        boolean z;
        z = this.f87838OooO0oO.f87841OooO0O0 + this.f87839OooO0oo.f87841OooO0O0 > this.f87834OooO0OO.f87900OooO0O0;
        if (z) {
            this.f87831OooO.getClass();
        }
        return z;
    }

    public abstract V OooO00o(int i);

    public final synchronized boolean OooO0O0(int i) {
        Oooo000 oooo000 = this.f87834OooO0OO;
        int i2 = oooo000.f87899OooO00o;
        int i3 = this.f87838OooO0oO.f87841OooO0O0;
        if (i > i2 - i3) {
            this.f87831OooO.getClass();
            return false;
        }
        int i4 = oooo000.f87900OooO0O0;
        if (i > i4 - (i3 + this.f87839OooO0oo.f87841OooO0O0)) {
            OooOO0o(i4 - i);
        }
        if (i <= i2 - (this.f87838OooO0oO.f87841OooO0O0 + this.f87839OooO0oo.f87841OooO0O0)) {
            return true;
        }
        this.f87831OooO.getClass();
        return false;
    }

    public abstract void OooO0OO(V v);

    public final synchronized C25740OooOO0o<V> OooO0Oo(int i) {
        try {
            C25740OooOO0o<V> c25740OooOO0o = this.f87835OooO0Oo.get(i);
            if (c25740OooOO0o == null && this.f87836OooO0o) {
                if (C25438OooO00o.f86720OooO00o.OooO00o(2)) {
                    C25438OooO00o.OooO0Oo(this.f87832OooO00o, Integer.valueOf(i), "creating new bucket %s");
                }
                int iOooO0oO = OooO0oO(i);
                this.f87834OooO0OO.getClass();
                C25740OooOO0o<V> c25740OooOO0o2 = new C25740OooOO0o<>(iOooO0oO, Integer.MAX_VALUE, 0);
                this.f87835OooO0Oo.put(i, c25740OooOO0o2);
                return c25740OooOO0o2;
            }
            return c25740OooOO0o;
        } finally {
        }
    }

    public abstract int OooO0o(V v);

    public abstract int OooO0o0(int i);

    public abstract int OooO0oO(int i);

    public synchronized V OooO0oo(C25740OooOO0o<V> c25740OooOO0o) {
        V vOooO00o;
        vOooO00o = c25740OooOO0o.OooO00o();
        if (vOooO00o != null) {
            c25740OooOO0o.f87853OooO0Oo++;
        }
        return vOooO00o;
    }

    public boolean OooOO0(V v) {
        v.getClass();
        return true;
    }

    public final void OooOO0O() {
        if (C25438OooO00o.f86720OooO00o.OooO00o(2)) {
            OooO00o oooO00o = this.f87838OooO0oO;
            Integer numValueOf = Integer.valueOf(oooO00o.f87840OooO00o);
            Integer numValueOf2 = Integer.valueOf(oooO00o.f87841OooO0O0);
            OooO00o oooO00o2 = this.f87839OooO0oo;
            Integer numValueOf3 = Integer.valueOf(oooO00o2.f87840OooO00o);
            Integer numValueOf4 = Integer.valueOf(oooO00o2.f87841OooO0O0);
            Class<?> cls = this.f87832OooO00o;
            if (C25438OooO00o.f86720OooO00o.OooO00o(2)) {
                C25439OooO0O0.OooO0O0(2, cls.getSimpleName(), String.format(null, "Used = (%d, %d); Free = (%d, %d)", numValueOf, numValueOf2, numValueOf3, numValueOf4));
            }
        }
    }

    public final synchronized void OooOO0o(int i) {
        try {
            int i2 = this.f87838OooO0oO.f87841OooO0O0;
            int i3 = this.f87839OooO0oo.f87841OooO0O0;
            int iMin = Math.min((i2 + i3) - i, i3);
            if (iMin <= 0) {
                return;
            }
            if (C25438OooO00o.f86720OooO00o.OooO00o(2)) {
                C25438OooO00o.OooO0o(this.f87832OooO00o, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i), Integer.valueOf(this.f87838OooO0oO.f87841OooO0O0 + this.f87839OooO0oo.f87841OooO0O0), Integer.valueOf(iMin));
            }
            OooOO0O();
            for (int i4 = 0; i4 < this.f87835OooO0Oo.size() && iMin > 0; i4++) {
                C25740OooOO0o<V> c25740OooOO0oValueAt = this.f87835OooO0Oo.valueAt(i4);
                c25740OooOO0oValueAt.getClass();
                while (iMin > 0) {
                    V vOooO00o = c25740OooOO0oValueAt.OooO00o();
                    if (vOooO00o == null) {
                        break;
                    }
                    OooO0OO(vOooO00o);
                    int i5 = c25740OooOO0oValueAt.f87850OooO00o;
                    iMin -= i5;
                    this.f87839OooO0oo.OooO00o(i5);
                }
            }
            OooOO0O();
            if (C25438OooO00o.f86720OooO00o.OooO00o(2)) {
                C25438OooO00o.OooO0o0(this.f87832OooO00o, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i), Integer.valueOf(this.f87838OooO0oO.f87841OooO0O0 + this.f87839OooO0oo.f87841OooO0O0));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [byte[], java.lang.StringBuilder] */
    @Override // o00o0o0o.InterfaceC25448OooO0o0
    public final V get(int i) throws Throwable {
        V vOooO00o;
        V vOooO0oo;
        synchronized (this) {
            try {
                OooOoo0.OooOo00.OooO0o(!OooO() || this.f87839OooO0oo.f87841OooO0O0 == 0);
            } finally {
            }
        }
        int iOooO0o0 = OooO0o0(i);
        synchronized (this) {
            try {
                C25740OooOO0o<V> c25740OooOO0oOooO0Oo = OooO0Oo(iOooO0o0);
                if (c25740OooOO0oOooO0Oo != null && (vOooO0oo = OooO0oo(c25740OooOO0oOooO0Oo)) != null) {
                    OooOoo0.OooOo00.OooO0o(this.f87837OooO0o0.add(vOooO0oo));
                    int iOooO0o = OooO0o(vOooO0oo);
                    int iOooO0oO = OooO0oO(iOooO0o);
                    OooO00o oooO00o = this.f87838OooO0oO;
                    oooO00o.f87840OooO00o++;
                    oooO00o.f87841OooO0O0 += iOooO0oO;
                    this.f87839OooO0oo.OooO00o(iOooO0oO);
                    this.f87831OooO.getClass();
                    OooOO0O();
                    if (C25438OooO00o.f86720OooO00o.OooO00o(2)) {
                        C25438OooO00o.OooO0o0(this.f87832OooO00o, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(vOooO0oo)), Integer.valueOf(iOooO0o));
                    }
                    return vOooO0oo;
                }
                int iOooO0oO2 = OooO0oO(iOooO0o0);
                if (!OooO0O0(iOooO0oO2)) {
                    int i2 = this.f87834OooO0OO.f87899OooO00o;
                    int i3 = this.f87838OooO0oO.f87841OooO0O0;
                    int i4 = this.f87839OooO0oo.f87841OooO0O0;
                    ?? byteArray = ByteArrayOutputStream.toByteArray();
                    byteArray.append(i4);
                    byteArray.append(" Request size = ");
                    byteArray.append(iOooO0oO2);
                    throw new OooO0OO(byteArray.toString());
                }
                OooO00o oooO00o2 = this.f87838OooO0oO;
                oooO00o2.f87840OooO00o++;
                oooO00o2.f87841OooO0O0 += iOooO0oO2;
                if (c25740OooOO0oOooO0Oo != null) {
                    c25740OooOO0oOooO0Oo.f87853OooO0Oo++;
                }
                try {
                    vOooO00o = OooO00o(iOooO0o0);
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f87838OooO0oO.OooO00o(iOooO0oO2);
                        C25740OooOO0o<V> c25740OooOO0oOooO0Oo2 = OooO0Oo(iOooO0o0);
                        if (c25740OooOO0oOooO0Oo2 != null) {
                            OooOoo0.OooOo00.OooO0o(c25740OooOO0oOooO0Oo2.f87853OooO0Oo > 0);
                            c25740OooOO0oOooO0Oo2.f87853OooO0Oo--;
                        }
                        if (Error.class.isInstance(th)) {
                            throw ((Throwable) Error.class.cast(th));
                        }
                        if (RuntimeException.class.isInstance(th)) {
                            throw ((Throwable) RuntimeException.class.cast(th));
                        }
                        vOooO00o = null;
                    }
                }
                synchronized (this) {
                    try {
                        OooOoo0.OooOo00.OooO0o(this.f87837OooO0o0.add(vOooO00o));
                        synchronized (this) {
                            if (OooO()) {
                                OooOO0o(this.f87834OooO0OO.f87900OooO0O0);
                            }
                        }
                        return vOooO00o;
                    } finally {
                    }
                }
                this.f87831OooO.getClass();
                OooOO0O();
                if (C25438OooO00o.f86720OooO00o.OooO00o(2)) {
                    C25438OooO00o.OooO0o0(this.f87832OooO00o, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(vOooO00o)), Integer.valueOf(iOooO0o0));
                }
                return vOooO00o;
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    @Override // o00o0o.InterfaceC25436OooO0OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void release(V v) {
        C25740OooOO0o<V> c25740OooOO0o;
        v.getClass();
        int iOooO0o = OooO0o(v);
        int iOooO0oO = OooO0oO(iOooO0o);
        synchronized (this) {
            try {
                synchronized (this) {
                    c25740OooOO0o = this.f87835OooO0Oo.get(iOooO0o);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!this.f87837OooO0o0.remove(v)) {
            C25438OooO00o.OooO0O0(this.f87832OooO00o, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(iOooO0o));
            OooO0OO(v);
            this.f87831OooO.getClass();
        } else if (c25740OooOO0o != null) {
            if (c25740OooOO0o.f87852OooO0OO.size() + c25740OooOO0o.f87853OooO0Oo <= c25740OooOO0o.f87851OooO0O0 && !OooO() && OooOO0(v)) {
                int i = c25740OooOO0o.f87853OooO0Oo;
                if (i > 0) {
                    c25740OooOO0o.f87853OooO0Oo = i - 1;
                    c25740OooOO0o.f87852OooO0OO.add(v);
                } else {
                    Object[] objArr = {v};
                    if (C25438OooO00o.f86720OooO00o.OooO00o(6)) {
                        C25439OooO0O0.OooO0O0(6, "BUCKET", String.format(null, "Tried to release value %s from an empty bucket!", objArr));
                    }
                }
                OooO00o oooO00o = this.f87839OooO0oo;
                oooO00o.f87840OooO00o++;
                oooO00o.f87841OooO0O0 += iOooO0oO;
                this.f87838OooO0oO.OooO00o(iOooO0oO);
                this.f87831OooO.getClass();
                if (C25438OooO00o.f86720OooO00o.OooO00o(2)) {
                    C25438OooO00o.OooO0o0(this.f87832OooO00o, "release (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(iOooO0o));
                }
            } else {
                if (c25740OooOO0o != null) {
                    OooOoo0.OooOo00.OooO0o(c25740OooOO0o.f87853OooO0Oo > 0);
                    c25740OooOO0o.f87853OooO0Oo--;
                }
                if (C25438OooO00o.f86720OooO00o.OooO00o(2)) {
                    C25438OooO00o.OooO0o0(this.f87832OooO00o, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(iOooO0o));
                }
                OooO0OO(v);
                this.f87838OooO0oO.OooO00o(iOooO0oO);
                this.f87831OooO.getClass();
            }
        }
        OooOO0O();
    }
}
