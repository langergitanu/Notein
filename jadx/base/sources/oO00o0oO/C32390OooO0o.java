package oO00o0oO;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: oO00o0oO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32390OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f116481OooO00o = new OooO00o("No further exceptions");

    /* JADX INFO: renamed from: oO00o0oO.OooO0o$OooO00o */
    public static final class OooO00o extends Throwable {
        private static final long serialVersionUID = -4649703670690200604L;

        @Override // java.lang.Throwable
        public final Throwable fillInStackTrace() {
            return this;
        }
    }

    public static <T> boolean OooO00o(AtomicReference<Throwable> atomicReference, Throwable th) {
        while (true) {
            Throwable th2 = atomicReference.get();
            if (th2 == f116481OooO00o) {
                return false;
            }
            Throwable oooO00o = th2 == null ? th : new oO00o00O.OooO00o(th2, th);
            while (!atomicReference.compareAndSet(th2, oooO00o)) {
                if (atomicReference.get() != th2) {
                    break;
                }
            }
            return true;
        }
    }

    public static <T> Throwable OooO0O0(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        OooO00o oooO00o = f116481OooO00o;
        return th != oooO00o ? atomicReference.getAndSet(oooO00o) : th;
    }

    public static RuntimeException OooO0OO(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
    }
}
