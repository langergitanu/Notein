package oO0o0OoO;

import oO0O000o.InterfaceC32508OooOOOo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0OoO.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33803OooOOOO implements InterfaceC34415OooO0oo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Throwable f121883OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC34415OooO0oo f121884OooOo0o;

    public C33803OooOOOO(Throwable th, InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        this.f121884OooOo0o = interfaceC34415OooO0oo;
        this.f121883OooOo = th;
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final <R> R fold(R r, InterfaceC32508OooOOOo<? super R, ? super InterfaceC34415OooO0oo.OooO0O0, ? extends R> interfaceC32508OooOOOo) {
        return (R) this.f121884OooOo0o.fold(r, interfaceC32508OooOOOo);
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final <E extends InterfaceC34415OooO0oo.OooO0O0> E get(InterfaceC34415OooO0oo.OooO0OO<E> oooO0OO) {
        return (E) this.f121884OooOo0o.get(oooO0OO);
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final InterfaceC34415OooO0oo minusKey(InterfaceC34415OooO0oo.OooO0OO<?> oooO0OO) {
        return this.f121884OooOo0o.minusKey(oooO0OO);
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final InterfaceC34415OooO0oo plus(InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        return this.f121884OooOo0o.plus(interfaceC34415OooO0oo);
    }
}
