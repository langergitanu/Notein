package oOo0000O;

import oO0O000o.InterfaceC32508OooOOOo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oOo0000O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC34408OooO00o implements InterfaceC34415OooO0oo.OooO0O0 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC34415OooO0oo.OooO0OO<?> f123417OooOo0o;

    public AbstractC34408OooO00o(InterfaceC34415OooO0oo.OooO0OO<?> oooO0OO) {
        this.f123417OooOo0o = oooO0OO;
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final <R> R fold(R r, InterfaceC32508OooOOOo<? super R, ? super InterfaceC34415OooO0oo.OooO0O0, ? extends R> interfaceC32508OooOOOo) {
        return interfaceC32508OooOOOo.invoke(r, this);
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public <E extends InterfaceC34415OooO0oo.OooO0O0> E get(InterfaceC34415OooO0oo.OooO0OO<E> oooO0OO) {
        return (E) InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0O0(this, oooO0OO);
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo.OooO0O0
    public final InterfaceC34415OooO0oo.OooO0OO<?> getKey() {
        return this.f123417OooOo0o;
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public InterfaceC34415OooO0oo minusKey(InterfaceC34415OooO0oo.OooO0OO<?> oooO0OO) {
        return InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0OO(this, oooO0OO);
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final InterfaceC34415OooO0oo plus(InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        return InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0Oo(this, interfaceC34415OooO0oo);
    }
}
