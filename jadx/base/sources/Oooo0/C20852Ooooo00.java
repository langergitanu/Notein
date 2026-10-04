package Oooo0;

import OoooOoO.InterfaceC21235OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: Oooo0.Ooooo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20852Ooooo00 implements InterfaceC21235OooO0oO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C20852Ooooo00 f59958OooOo0o = new C20852Ooooo00();

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final <R> R fold(R r, InterfaceC32508OooOOOo<? super R, ? super InterfaceC34415OooO0oo.OooO0O0, ? extends R> interfaceC32508OooOOOo) {
        return interfaceC32508OooOOOo.invoke(r, this);
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final <E extends InterfaceC34415OooO0oo.OooO0O0> E get(InterfaceC34415OooO0oo.OooO0OO<E> key) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        return (E) InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0O0(this, key);
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final InterfaceC34415OooO0oo minusKey(InterfaceC34415OooO0oo.OooO0OO<?> key) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        return InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0OO(this, key);
    }

    @Override // OoooOoO.InterfaceC21235OooO0oO
    public final float o00000OO() {
        return 1.0f;
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final InterfaceC34415OooO0oo plus(InterfaceC34415OooO0oo context) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        return InterfaceC34415OooO0oo.OooO00o.OooO00o(this, context);
    }
}
