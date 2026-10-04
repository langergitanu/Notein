package oO00o0OO;

import oO0OOOoo.InterfaceCallableC33030OooO0oo;
import oO0OooOO.AbstractC33485OooO;
import oO0OooOO.InterfaceC33495OooOO0O;
import ooOOo0.EnumC35110OooO0OO;

/* JADX INFO: renamed from: oO00o0OO.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32358OooOOO0<T> extends AbstractC33485OooO<T> implements InterfaceCallableC33030OooO0oo<T> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final T f116327OooOo0o;

    public C32358OooOOO0(T t) {
        this.f116327OooOo0o = t;
    }

    @Override // oO0OooOO.AbstractC33485OooO
    public final void OooO0OO(InterfaceC33495OooOO0O<? super T> interfaceC33495OooOO0O) {
        interfaceC33495OooOO0O.OooO00o(EnumC35110OooO0OO.f126094OooOo0o);
        interfaceC33495OooOO0O.onSuccess(this.f116327OooOo0o);
    }

    @Override // java.util.concurrent.Callable
    public final T call() {
        return this.f116327OooOo0o;
    }
}
