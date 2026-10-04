package oO0o0OO;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: oO0o0OO.o00000oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33667o00000oo extends AbstractC33673o0ooOO0 {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f121357OooOoo = AtomicIntegerFieldUpdater.newUpdater(C33667o00000oo.class, "_state$volatile");

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final Thread f121358OooOoOO = Thread.currentThread();

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public InterfaceC33651OoooOoO f121359OooOoo0;
    private volatile /* synthetic */ int _state$volatile;

    public static void OooOO0o(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // oO0o0OO.AbstractC33673o0ooOO0
    public final boolean OooO() {
        return true;
    }

    @Override // oO0o0OO.AbstractC33673o0ooOO0
    public final void OooOO0(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f121357OooOoo;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                OooOO0o(i);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.f121358OooOoOO.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void OooOO0O() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f121357OooOoo;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        OooOO0o(i);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                InterfaceC33651OoooOoO interfaceC33651OoooOoO = this.f121359OooOoo0;
                if (interfaceC33651OoooOoO != null) {
                    interfaceC33651OoooOoO.dispose();
                    return;
                }
                return;
            }
        }
    }
}
