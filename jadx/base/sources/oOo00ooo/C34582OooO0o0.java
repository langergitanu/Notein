package oOo00ooo;

import oO00o.AbstractC32316OooO0OO;
import oO00o.InterfaceC32319OooO0o0;
import oOo00ooO.InterfaceC34574OooO0o0;

/* JADX INFO: renamed from: oOo00ooo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34582OooO0o0<T> extends AbstractC32316OooO0OO<T> implements InterfaceC34574OooO0o0<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final T f123864OooO00o;

    public C34582OooO0o0(T t) {
        this.f123864OooO00o = t;
    }

    @Override // oO00o.AbstractC32316OooO0OO
    public final void OooO0OO(InterfaceC32319OooO0o0<? super T> interfaceC32319OooO0o0) {
        RunnableC34584OooO0oo runnableC34584OooO0oo = new RunnableC34584OooO0oo(interfaceC32319OooO0o0, this.f123864OooO00o);
        interfaceC32319OooO0o0.OooO00o(runnableC34584OooO0oo);
        runnableC34584OooO0oo.run();
    }

    @Override // oO00oO00.InterfaceC32404OooO0Oo
    public final T get() {
        return this.f123864OooO00o;
    }
}
