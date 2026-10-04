package oO0OOO0o;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import oO0OOOoo.InterfaceC33022OooO;

/* JADX INFO: renamed from: oO0OOO0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32939OooO00o<E> extends AtomicReferenceArray<E> implements InterfaceC33022OooO<E> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final Integer f118920OooOoo0 = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final AtomicLong f118921OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f118922OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final AtomicLong f118923OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public long f118924OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final int f118925OooOoOO;

    public C32939OooO00o(int i) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i - 1)));
        this.f118922OooOo0o = length() - 1;
        this.f118921OooOo = new AtomicLong();
        this.f118923OooOoO = new AtomicLong();
        this.f118925OooOoOO = Math.min(i / 4, f118920OooOoo0.intValue());
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
        return this.f118921OooOo.get() == this.f118923OooOoO.get();
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final boolean offer(E e) {
        if (e == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicLong atomicLong = this.f118921OooOo;
        long j = atomicLong.get();
        int i = this.f118922OooOo0o;
        int i2 = ((int) j) & i;
        if (j >= this.f118924OooOoO0) {
            long j2 = ((long) this.f118925OooOoOO) + j;
            if (get(i & ((int) j2)) == null) {
                this.f118924OooOoO0 = j2;
            } else if (get(i2) != null) {
                return false;
            }
        }
        lazySet(i2, e);
        atomicLong.lazySet(j + 1);
        return true;
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final E poll() {
        AtomicLong atomicLong = this.f118923OooOoO;
        long j = atomicLong.get();
        int i = ((int) j) & this.f118922OooOo0o;
        E e = get(i);
        if (e == null) {
            return null;
        }
        atomicLong.lazySet(j + 1);
        lazySet(i, null);
        return e;
    }
}
