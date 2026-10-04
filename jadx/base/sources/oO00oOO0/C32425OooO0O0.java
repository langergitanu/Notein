package oO00oOO0;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import oOo00ooO.InterfaceC34573OooO0o;

/* JADX INFO: renamed from: oO00oOO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32425OooO0O0<T> implements InterfaceC34573OooO0o<T> {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final int f116605OooOooo = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final Object f116606Oooo000 = new Object();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f116607OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AtomicLong f116608OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f116609OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public long f116610OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public AtomicReferenceArray<Object> f116611OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public AtomicReferenceArray<Object> f116612OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final int f116613OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final AtomicLong f116614OooOooO;

    public C32425OooO0O0(int i) {
        AtomicLong atomicLong = new AtomicLong();
        this.f116608OooOo0o = atomicLong;
        this.f116614OooOooO = new AtomicLong();
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i) - 1));
        int i2 = iNumberOfLeadingZeros - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iNumberOfLeadingZeros + 1);
        this.f116611OooOoOO = atomicReferenceArray;
        this.f116609OooOoO = i2;
        this.f116607OooOo = Math.min(iNumberOfLeadingZeros / 4, f116605OooOooo);
        this.f116612OooOoo = atomicReferenceArray;
        this.f116613OooOoo0 = i2;
        this.f116610OooOoO0 = iNumberOfLeadingZeros - 2;
        atomicLong.lazySet(0L);
    }

    @Override // oOo00ooO.InterfaceC34575OooO0oO
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // oOo00ooO.InterfaceC34575OooO0oO
    public final boolean isEmpty() {
        return this.f116608OooOo0o.get() == this.f116614OooOooO.get();
    }

    @Override // oOo00ooO.InterfaceC34575OooO0oO
    public final boolean offer(T t) {
        if (t == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.f116611OooOoOO;
        AtomicLong atomicLong = this.f116608OooOo0o;
        long j = atomicLong.get();
        int i = this.f116609OooOoO;
        int i2 = ((int) j) & i;
        if (j < this.f116610OooOoO0) {
            atomicReferenceArray.lazySet(i2, t);
            atomicLong.lazySet(j + 1);
            return true;
        }
        long j2 = ((long) this.f116607OooOo) + j;
        if (atomicReferenceArray.get(((int) j2) & i) == null) {
            this.f116610OooOoO0 = j2 - 1;
            atomicReferenceArray.lazySet(i2, t);
            atomicLong.lazySet(j + 1);
            return true;
        }
        long j3 = j + 1;
        if (atomicReferenceArray.get(((int) j3) & i) == null) {
            atomicReferenceArray.lazySet(i2, t);
            atomicLong.lazySet(j3);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f116611OooOoOO = atomicReferenceArray2;
        this.f116610OooOoO0 = (j + ((long) i)) - 1;
        atomicReferenceArray2.lazySet(i2, t);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i2, f116606Oooo000);
        atomicLong.lazySet(j3);
        return true;
    }

    @Override // oOo00ooO.InterfaceC34575OooO0oO
    public final T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f116612OooOoo;
        AtomicLong atomicLong = this.f116614OooOooO;
        long j = atomicLong.get();
        int i = this.f116613OooOoo0;
        int i2 = ((int) j) & i;
        T t = (T) atomicReferenceArray.get(i2);
        boolean z = t == f116606Oooo000;
        if (t != null && !z) {
            atomicReferenceArray.lazySet(i2, null);
            atomicLong.lazySet(j + 1);
            return t;
        }
        if (!z) {
            return null;
        }
        int i3 = i + 1;
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
        atomicReferenceArray.lazySet(i3, null);
        this.f116612OooOoo = atomicReferenceArray2;
        T t2 = (T) atomicReferenceArray2.get(i2);
        if (t2 != null) {
            atomicReferenceArray2.lazySet(i2, null);
            atomicLong.lazySet(j + 1);
        }
        return t2;
    }
}
