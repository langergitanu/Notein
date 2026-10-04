package oO00oOO0;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import oOo00ooO.InterfaceC34573OooO0o;

/* JADX INFO: renamed from: oO00oOO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32424OooO00o<E> extends AtomicReferenceArray<E> implements InterfaceC34573OooO0o<E> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final Integer f116599OooOoo0 = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final AtomicLong f116600OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f116601OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final AtomicLong f116602OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public long f116603OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final int f116604OooOoOO;

    public C32424OooO00o(int i) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i - 1)));
        this.f116601OooOo0o = length() - 1;
        this.f116600OooOo = new AtomicLong();
        this.f116602OooOoO = new AtomicLong();
        this.f116604OooOoOO = Math.min(i / 4, f116599OooOoo0.intValue());
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
        return this.f116600OooOo.get() == this.f116602OooOoO.get();
    }

    @Override // oOo00ooO.InterfaceC34575OooO0oO
    public final boolean offer(E e) {
        if (e == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicLong atomicLong = this.f116600OooOo;
        long j = atomicLong.get();
        int i = this.f116601OooOo0o;
        int i2 = ((int) j) & i;
        if (j >= this.f116603OooOoO0) {
            long j2 = ((long) this.f116604OooOoOO) + j;
            if (get(i & ((int) j2)) == null) {
                this.f116603OooOoO0 = j2;
            } else if (get(i2) != null) {
                return false;
            }
        }
        lazySet(i2, e);
        atomicLong.lazySet(j + 1);
        return true;
    }

    @Override // oOo00ooO.InterfaceC34575OooO0oO
    public final E poll() {
        AtomicLong atomicLong = this.f116602OooOoO;
        long j = atomicLong.get();
        int i = ((int) j) & this.f116601OooOo0o;
        E e = get(i);
        if (e == null) {
            return null;
        }
        atomicLong.lazySet(j + 1);
        lazySet(i, null);
        return e;
    }
}
