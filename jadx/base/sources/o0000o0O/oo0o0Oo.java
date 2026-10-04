package o0000o0O;

import oO0O000o.InterfaceC32508OooOOOo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes.dex */
public final class oo0o0Oo implements InterfaceC34415OooO0oo.OooO0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooOOO<?> f81811OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final oo0o0Oo f81812OooOo0o;

    public oo0o0Oo(oo0o0Oo oo0o0oo, OooOOO<?> instance) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(instance, "instance");
        this.f81812OooOo0o = oo0o0oo;
        this.f81811OooOo = instance;
    }

    public final void OooO0O0(OooOOO oooOOO) {
        if (this.f81811OooOo == oooOOO) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        oo0o0Oo oo0o0oo = this.f81812OooOo0o;
        if (oo0o0oo != null) {
            oo0o0oo.OooO0O0(oooOOO);
        }
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
    public final InterfaceC34415OooO0oo.OooO0OO<?> getKey() {
        return o0OO00O.f81795OooOo0o;
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
