package oO0o0Ooo;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: oO0o0Ooo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C33830OooOO0o<E> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f121937OooO00o = AtomicReferenceFieldUpdater.newUpdater(C33830OooOO0o.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new C33832OooOOO0(8, false);

    public final boolean OooO00o(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121937OooO00o;
            C33832OooOOO0 c33832OooOOO0 = (C33832OooOOO0) atomicReferenceFieldUpdater.get(this);
            int iOooO00o = c33832OooOOO0.OooO00o(runnable);
            if (iOooO00o == 0) {
                return true;
            }
            if (iOooO00o == 1) {
                C33832OooOOO0<E> c33832OooOOO0OooO0OO = c33832OooOOO0.OooO0OO();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c33832OooOOO0, c33832OooOOO0OooO0OO) && atomicReferenceFieldUpdater.get(this) == c33832OooOOO0) {
                }
            } else if (iOooO00o == 2) {
                return false;
            }
        }
    }

    public final void OooO0O0() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121937OooO00o;
            C33832OooOOO0 c33832OooOOO0 = (C33832OooOOO0) atomicReferenceFieldUpdater.get(this);
            if (c33832OooOOO0.OooO0O0()) {
                return;
            }
            C33832OooOOO0<E> c33832OooOOO0OooO0OO = c33832OooOOO0.OooO0OO();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c33832OooOOO0, c33832OooOOO0OooO0OO) && atomicReferenceFieldUpdater.get(this) == c33832OooOOO0) {
            }
        }
    }

    public final int OooO0OO() {
        C33832OooOOO0 c33832OooOOO0 = (C33832OooOOO0) f121937OooO00o.get(this);
        c33832OooOOO0.getClass();
        long j = C33832OooOOO0.f121938OooO0o.get(c33832OooOOO0);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final E OooO0Oo() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121937OooO00o;
            C33832OooOOO0 c33832OooOOO0 = (C33832OooOOO0) atomicReferenceFieldUpdater.get(this);
            E e = (E) c33832OooOOO0.OooO0Oo();
            if (e != C33832OooOOO0.f121940OooO0oO) {
                return e;
            }
            C33832OooOOO0<E> c33832OooOOO0OooO0OO = c33832OooOOO0.OooO0OO();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c33832OooOOO0, c33832OooOOO0OooO0OO) && atomicReferenceFieldUpdater.get(this) == c33832OooOOO0) {
            }
        }
    }
}
