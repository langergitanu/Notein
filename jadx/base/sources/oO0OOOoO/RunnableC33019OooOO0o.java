package oO0OOOoO;

import java.util.concurrent.atomic.AtomicInteger;
import oO0OOOoo.InterfaceC33028OooO0o0;
import oO0OooOO.InterfaceC33499OooOOOO;

/* JADX INFO: renamed from: oO0OOOoO.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class RunnableC33019OooOO0o<T> extends AtomicInteger implements InterfaceC33028OooO0o0<T>, Runnable {
    private static final long serialVersionUID = 3880992722410194083L;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final T f119470OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC33499OooOOOO<? super T> f119471OooOo0o;

    public RunnableC33019OooOO0o(InterfaceC33499OooOOOO<? super T> interfaceC33499OooOOOO, T t) {
        this.f119471OooOo0o = interfaceC33499OooOOOO;
        this.f119470OooOo = t;
    }

    @Override // oO0OOOoo.InterfaceC33027OooO0o
    public final int OooO0O0(int i) {
        lazySet(1);
        return 1;
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final void clear() {
        lazySet(3);
    }

    @Override // oO0OOO00.OooO0O0
    public final void dispose() {
        set(3);
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final boolean isEmpty() {
        return get() != 1;
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final T poll() throws Exception {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.f119470OooOo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            InterfaceC33499OooOOOO<? super T> interfaceC33499OooOOOO = this.f119471OooOo0o;
            interfaceC33499OooOOOO.onNext(this.f119470OooOo);
            if (get() == 2) {
                lazySet(3);
                interfaceC33499OooOOOO.onComplete();
            }
        }
    }
}
