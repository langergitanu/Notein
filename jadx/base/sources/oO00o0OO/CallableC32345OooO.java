package oO00o0OO;

import java.util.concurrent.Callable;
import o0o0OO0.C30416Oooo0OO;
import oO0OOO00.C32938OooO0Oo;
import oO0OooOO.AbstractC33485OooO;
import oO0OooOO.InterfaceC33495OooOO0O;

/* JADX INFO: renamed from: oO00o0OO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class CallableC32345OooO<T> extends AbstractC33485OooO<T> implements Callable<T> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Callable<? extends T> f116289OooOo0o;

    public CallableC32345OooO(Callable<? extends T> callable) {
        this.f116289OooOo0o = callable;
    }

    @Override // oO0OooOO.AbstractC33485OooO
    public final void OooO0OO(InterfaceC33495OooOO0O<? super T> interfaceC33495OooOO0O) {
        C32938OooO0Oo c32938OooO0Oo = new C32938OooO0Oo(oO00o0.OooO00o.f116236OooO0O0);
        interfaceC33495OooOO0O.OooO00o(c32938OooO0Oo);
        if (c32938OooO0Oo.OooO00o()) {
            return;
        }
        try {
            T tCall = this.f116289OooOo0o.call();
            if (c32938OooO0Oo.OooO00o()) {
                return;
            }
            if (tCall == null) {
                interfaceC33495OooOO0O.onComplete();
            } else {
                interfaceC33495OooOO0O.onSuccess(tCall);
            }
        } catch (Throwable th) {
            C30416Oooo0OO.OooO00o(th);
            if (c32938OooO0Oo.OooO00o()) {
                oO0OOO0O.OooO00o.OooO0O0(th);
            } else {
                interfaceC33495OooOO0O.onError(th);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final T call() throws Exception {
        return this.f116289OooOo0o.call();
    }
}
