package oOo00ooo;

import java.util.concurrent.atomic.AtomicInteger;
import oO00o.InterfaceC32319OooO0o0;
import oOo00ooO.InterfaceC34570OooO0O0;

/* JADX INFO: renamed from: oOo00ooo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class RunnableC34584OooO0oo<T> extends AtomicInteger implements InterfaceC34570OooO0O0<T>, Runnable {
    private static final long serialVersionUID = 3880992722410194083L;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final T f123877OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC32319OooO0o0<? super T> f123878OooOo0o;

    public RunnableC34584OooO0oo(InterfaceC32319OooO0o0<? super T> interfaceC32319OooO0o0, T t) {
        this.f123878OooOo0o = interfaceC32319OooO0o0;
        this.f123877OooOo = t;
    }

    @Override // oOo00ooO.InterfaceC34571OooO0OO
    public final int OooO0O0(int i) {
        lazySet(1);
        return 1;
    }

    @Override // oOo00ooO.InterfaceC34575OooO0oO
    public final void clear() {
        lazySet(3);
    }

    @Override // oO0OO0oO.InterfaceC32925OooO0O0
    public final void dispose() {
        set(3);
    }

    @Override // oOo00ooO.InterfaceC34575OooO0oO
    public final boolean isEmpty() {
        return get() != 1;
    }

    @Override // oOo00ooO.InterfaceC34575OooO0oO
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // oOo00ooO.InterfaceC34575OooO0oO
    public final T poll() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.f123877OooOo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            T t = this.f123877OooOo;
            InterfaceC32319OooO0o0<? super T> interfaceC32319OooO0o0 = this.f123878OooOo0o;
            interfaceC32319OooO0o0.onNext(t);
            if (get() == 2) {
                lazySet(3);
                interfaceC32319OooO0o0.onComplete();
            }
        }
    }
}
