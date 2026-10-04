package oOooo;

import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34079o0ooOoO;
import oO0oO0Oo.InterfaceC34019OooO0oO;
import oO0oO0Oo.OooOo00;
import oO0oO0Oo.Oooo0;
import oO0oO0Oo.o00oO0O;

/* JADX INFO: renamed from: oOooo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34618OooO0OO extends OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C34619OooO0Oo f124012OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C34617OooO0O0 f124013OooOo0o;

    public C34618OooO0OO(AbstractC34039OooOooO abstractC34039OooOooO) {
        InterfaceC34019OooO0oO interfaceC34019OooO0oOOooOo0 = abstractC34039OooOooO.OooOo0(0);
        this.f124013OooOo0o = interfaceC34019OooO0oOOooOo0 instanceof C34617OooO0O0 ? (C34617OooO0O0) interfaceC34019OooO0oOOooOo0 : interfaceC34019OooO0oOOooOo0 != null ? new C34617OooO0O0(AbstractC34039OooOooO.OooOOoo(interfaceC34019OooO0oOOooOo0)) : null;
        this.f124012OooOo = new C34619OooO0Oo(AbstractC34039OooOooO.OooOo00(Oooo0.OooOOoo(abstractC34039OooOooO.OooOo0(1)), false));
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo(2);
        c34020OooO0oo.OooO00o(this.f124013OooOo0o);
        C34619OooO0Oo c34619OooO0Oo = this.f124012OooOo;
        if (c34619OooO0Oo != null) {
            c34020OooO0oo.OooO00o(new C34079o0ooOoO(false, 0, c34619OooO0Oo));
        }
        return new o00oO0O(c34020OooO0oo);
    }
}
