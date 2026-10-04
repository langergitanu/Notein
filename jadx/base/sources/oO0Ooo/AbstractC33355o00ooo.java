package oO0Ooo;

import java.util.List;

/* JADX INFO: renamed from: oO0Ooo.o00ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33355o00ooo extends AbstractC33320OooOoo {
    @Override // oO0Ooo.AbstractC33320OooOoo
    public final oO0Oo0o0.OooOO0 OooOOO0() {
        return o00000Oo().OooOOO0();
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public final InterfaceC33342OoooOo0 o00000() {
        return o00000Oo().o00000();
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public final List<InterfaceC33348OooooOO> o000000O() {
        return o00000Oo().o000000O();
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public final C33339OoooOOO o000000o() {
        return o00000Oo().o000000o();
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public final boolean o00000O0() {
        return o00000Oo().o00000O0();
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public final AbstractC33354o00o0O o00000OO() {
        AbstractC33320OooOoo abstractC33320OooOooO00000Oo = o00000Oo();
        while (abstractC33320OooOooO00000Oo instanceof AbstractC33355o00ooo) {
            abstractC33320OooOooO00000Oo = ((AbstractC33355o00ooo) abstractC33320OooOooO00000Oo).o00000Oo();
        }
        kotlin.jvm.internal.OooOOO0.OooO0o0(abstractC33320OooOooO00000Oo, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (AbstractC33354o00o0O) abstractC33320OooOooO00000Oo;
    }

    public abstract AbstractC33320OooOoo o00000Oo();

    public boolean o00000o0() {
        return true;
    }

    public final String toString() {
        return o00000o0() ? o00000Oo().toString() : "<Not computed yet>";
    }
}
