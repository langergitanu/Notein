package oOo00OoO;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: oOo00OoO.OooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34539OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C34543OooOo0o f123763OooO00o = new C34543OooOo0o(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int f123764OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final AtomicReference<C34543OooOo0o>[] f123765OooO0OO;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f123764OooO0O0 = iHighestOneBit;
        AtomicReference<C34543OooOo0o>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        f123765OooO0OO = atomicReferenceArr;
    }

    public static final void OooO00o(C34543OooOo0o segment) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(segment, "segment");
        if (segment.f123784OooO0o != null || segment.f123786OooO0oO != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f123783OooO0Oo) {
            return;
        }
        AtomicReference<C34543OooOo0o> atomicReference = f123765OooO0OO[(int) (Thread.currentThread().getId() & (((long) f123764OooO0O0) - 1))];
        C34543OooOo0o c34543OooOo0o = f123763OooO00o;
        C34543OooOo0o andSet = atomicReference.getAndSet(c34543OooOo0o);
        if (andSet == c34543OooOo0o) {
            return;
        }
        int i = andSet != null ? andSet.f123782OooO0OO : 0;
        if (i >= 65536) {
            atomicReference.set(andSet);
            return;
        }
        segment.f123784OooO0o = andSet;
        segment.f123781OooO0O0 = 0;
        segment.f123782OooO0OO = i + 8192;
        atomicReference.set(segment);
    }

    public static final C34543OooOo0o OooO0O0() {
        AtomicReference<C34543OooOo0o> atomicReference = f123765OooO0OO[(int) (Thread.currentThread().getId() & (((long) f123764OooO0O0) - 1))];
        C34543OooOo0o c34543OooOo0o = f123763OooO00o;
        C34543OooOo0o andSet = atomicReference.getAndSet(c34543OooOo0o);
        if (andSet == c34543OooOo0o) {
            return new C34543OooOo0o();
        }
        if (andSet == null) {
            atomicReference.set(null);
            return new C34543OooOo0o();
        }
        atomicReference.set(andSet.f123784OooO0o);
        andSet.f123784OooO0o = null;
        andSet.f123782OooO0OO = 0;
        return andSet;
    }
}
