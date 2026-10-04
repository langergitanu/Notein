package oO0oO0oo;

import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34066Oooooo0;
import oO0oO0Oo.Oooo0;
import oO0oO0Oo.o00oO0O;
import oO0oOo0.C34142OooO00o;

/* JADX INFO: renamed from: oO0oO0oo.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34096OooOOO0 extends oO0oO0Oo.OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C34066Oooooo0 f122503OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C34142OooO00o f122504OooOo0o;

    public static C34096OooOOO0 OooO0oo(Oooo0 oooo0) {
        AbstractC34039OooOooO abstractC34039OooOooOOooOo00 = AbstractC34039OooOooO.OooOo00(oooo0, false);
        if (abstractC34039OooOooOOooOo00 == null) {
            return null;
        }
        AbstractC34039OooOooO abstractC34039OooOooOOooOOoo = AbstractC34039OooOooO.OooOOoo(abstractC34039OooOooOOooOo00);
        C34096OooOOO0 c34096OooOOO0 = new C34096OooOOO0();
        c34096OooOOO0.f122504OooOo0o = C34142OooO00o.OooO0oo(abstractC34039OooOooOOooOOoo.OooOo0(0));
        c34096OooOOO0.f122503OooOo = (C34066Oooooo0) abstractC34039OooOooOOooOOoo.OooOo0(1);
        return c34096OooOOO0;
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo(2);
        c34020OooO0oo.OooO00o(this.f122504OooOo0o);
        c34020OooO0oo.OooO00o(this.f122503OooOo);
        return new o00oO0O(c34020OooO0oo);
    }
}
