package oO0oOOoo;

import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34032OooOo0O;
import oO0oO0Oo.InterfaceC34019OooO0oO;
import oO0oO0Oo.OooOo00;
import oO0oO0Oo.o00oO0O;

/* JADX INFO: renamed from: oO0oOOoo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34133OooO00o extends OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public InterfaceC34019OooO0oO f122666OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C34032OooOo0O f122667OooOo0o;

    public static C34133OooO00o OooO0oo(InterfaceC34019OooO0oO interfaceC34019OooO0oO) {
        if (interfaceC34019OooO0oO instanceof C34133OooO00o) {
            return (C34133OooO00o) interfaceC34019OooO0oO;
        }
        if (interfaceC34019OooO0oO == null) {
            throw new IllegalArgumentException("null value in getInstance()");
        }
        AbstractC34039OooOooO abstractC34039OooOooOOooOOoo = AbstractC34039OooOooO.OooOOoo(interfaceC34019OooO0oO);
        C34133OooO00o c34133OooO00o = new C34133OooO00o();
        c34133OooO00o.f122667OooOo0o = (C34032OooOo0O) abstractC34039OooOooOOooOOoo.OooOo0(0);
        c34133OooO00o.f122666OooOo = abstractC34039OooOooOOooOOoo.OooOo0(1);
        return c34133OooO00o;
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo(2);
        c34020OooO0oo.OooO00o(this.f122667OooOo0o);
        c34020OooO0oo.OooO00o(this.f122666OooOo);
        return new o00oO0O(c34020OooO0oo);
    }
}
