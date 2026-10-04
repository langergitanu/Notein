package oO0oO0oo;

import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34029OooOOo0;
import oO0oO0Oo.InterfaceC34019OooO0oO;
import oO0oO0Oo.o00oO0O;
import oO0oOOoo.C34135OooO0OO;

/* JADX INFO: renamed from: oO0oO0oo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34089OooO0o0 extends oO0oO0Oo.OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C34029OooOOo0 f122486OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C34135OooO0OO f122487OooOo0o;

    public static C34089OooO0o0 OooO0oo(InterfaceC34019OooO0oO interfaceC34019OooO0oO) {
        if (interfaceC34019OooO0oO instanceof C34089OooO0o0) {
            return (C34089OooO0o0) interfaceC34019OooO0oO;
        }
        if (interfaceC34019OooO0oO == null) {
            return null;
        }
        AbstractC34039OooOooO abstractC34039OooOooOOooOOoo = AbstractC34039OooOooO.OooOOoo(interfaceC34019OooO0oO);
        C34089OooO0o0 c34089OooO0o0 = new C34089OooO0o0();
        c34089OooO0o0.f122487OooOo0o = C34135OooO0OO.OooO0oo(abstractC34039OooOooOOooOOoo.OooOo0(0));
        c34089OooO0o0.f122486OooOo = (C34029OooOOo0) abstractC34039OooOooOOooOOoo.OooOo0(1);
        return c34089OooO0o0;
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo(2);
        c34020OooO0oo.OooO00o(this.f122487OooOo0o);
        c34020OooO0oo.OooO00o(this.f122486OooOo);
        return new o00oO0O(c34020OooO0oo);
    }
}
