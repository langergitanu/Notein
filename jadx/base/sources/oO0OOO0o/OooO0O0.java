package oO0OOO0o;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import oO0OOOoo.InterfaceC33022OooO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0<T> implements InterfaceC33022OooO<T> {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final int f118926OooOooo = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final Object f118927Oooo000 = new Object();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f118928OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AtomicLong f118929OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f118930OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public long f118931OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public AtomicReferenceArray<Object> f118932OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public AtomicReferenceArray<Object> f118933OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final int f118934OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final AtomicLong f118935OooOooO;

    public OooO0O0(int i) {
        AtomicLong atomicLong = new AtomicLong();
        this.f118929OooOo0o = atomicLong;
        this.f118935OooOooO = new AtomicLong();
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i) - 1));
        int i2 = iNumberOfLeadingZeros - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iNumberOfLeadingZeros + 1);
        this.f118932OooOoOO = atomicReferenceArray;
        this.f118930OooOoO = i2;
        this.f118928OooOo = Math.min(iNumberOfLeadingZeros / 4, f118926OooOooo);
        this.f118933OooOoo = atomicReferenceArray;
        this.f118934OooOoo0 = i2;
        this.f118931OooOoO0 = iNumberOfLeadingZeros - 2;
        atomicLong.lazySet(0L);
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final boolean isEmpty() {
        return this.f118929OooOo0o.get() == this.f118935OooOooO.get();
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final boolean offer(T t) {
        if (t == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.f118932OooOoOO;
        AtomicLong atomicLong = this.f118929OooOo0o;
        long j = atomicLong.get();
        int i = this.f118930OooOoO;
        int i2 = ((int) j) & i;
        if (j < this.f118931OooOoO0) {
            atomicReferenceArray.lazySet(i2, t);
            atomicLong.lazySet(j + 1);
            return true;
        }
        long j2 = ((long) this.f118928OooOo) + j;
        if (atomicReferenceArray.get(((int) j2) & i) == null) {
            this.f118931OooOoO0 = j2 - 1;
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
        this.f118932OooOoOO = atomicReferenceArray2;
        this.f118931OooOoO0 = (j + ((long) i)) - 1;
        atomicReferenceArray2.lazySet(i2, t);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i2, f118927Oooo000);
        atomicLong.lazySet(j3);
        return true;
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f118933OooOoo;
        AtomicLong atomicLong = this.f118935OooOooO;
        long j = atomicLong.get();
        int i = this.f118934OooOoo0;
        int i2 = ((int) j) & i;
        T t = (T) atomicReferenceArray.get(i2);
        boolean z = t == f118927Oooo000;
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
        this.f118933OooOoo = atomicReferenceArray2;
        T t2 = (T) atomicReferenceArray2.get(i2);
        if (t2 != null) {
            atomicReferenceArray2.lazySet(i2, null);
            atomicLong.lazySet(j + 1);
        }
        return t2;
    }
}
