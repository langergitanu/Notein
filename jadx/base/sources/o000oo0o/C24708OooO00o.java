package o000oo0o;

import oO0O000o.InterfaceC32508OooOOOo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: o000oo0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24708OooO00o implements InterfaceC34415OooO0oo.OooO0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final C19644OooO00o f83757OooOo = new C19644OooO00o();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C24723OooOOo f83758OooOo0o;

    /* JADX INFO: renamed from: o000oo0o.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19644OooO00o implements InterfaceC34415OooO0oo.OooO0OO<C24708OooO00o> {
    }

    public C24708OooO00o(C24723OooOOo connectionWrapper) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(connectionWrapper, "connectionWrapper");
        this.f83758OooOo0o = connectionWrapper;
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final <R> R fold(R r, InterfaceC32508OooOOOo<? super R, ? super InterfaceC34415OooO0oo.OooO0O0, ? extends R> interfaceC32508OooOOOo) {
        return interfaceC32508OooOOOo.invoke(r, this);
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final <E extends InterfaceC34415OooO0oo.OooO0O0> E get(InterfaceC34415OooO0oo.OooO0OO<E> oooO0OO) {
        return (E) InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0O0(this, oooO0OO);
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo.OooO0O0
    public final InterfaceC34415OooO0oo.OooO0OO<C24708OooO00o> getKey() {
        return f83757OooOo;
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final InterfaceC34415OooO0oo minusKey(InterfaceC34415OooO0oo.OooO0OO<?> oooO0OO) {
        return InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0OO(this, oooO0OO);
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final InterfaceC34415OooO0oo plus(InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        return InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0Oo(this, interfaceC34415OooO0oo);
    }
}
