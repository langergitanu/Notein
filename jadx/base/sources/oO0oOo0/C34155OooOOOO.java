package oO0oOo0;

import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34029OooOOo0;
import oO0oO0Oo.C34066Oooooo0;
import oO0oO0Oo.Oooo0;
import oO0oO0Oo.o00oO0O;

/* JADX INFO: renamed from: oO0oOo0.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34155OooOOOO extends oO0oO0Oo.OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C34029OooOOo0 f122725OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C34154OooOOO0 f122726OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C34066Oooooo0 f122727OooOoO0;

    public static C34155OooOOOO OooO0oo(Oooo0 oooo0, boolean z) {
        AbstractC34039OooOooO abstractC34039OooOooO = (AbstractC34039OooOooO) AbstractC34039OooOooO.f122370OooOo.OooO0o0(oooo0, z);
        if (abstractC34039OooOooO == null) {
            return null;
        }
        AbstractC34039OooOooO abstractC34039OooOooOOooOOoo = AbstractC34039OooOooO.OooOOoo(abstractC34039OooOooO);
        C34155OooOOOO c34155OooOOOO = new C34155OooOOOO();
        if (abstractC34039OooOooOOooOOoo.size() != 2 && abstractC34039OooOooOOooOOoo.size() != 3) {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC34039OooOooOOooOOoo.size());
        }
        c34155OooOOOO.f122726OooOo0o = C34154OooOOO0.OooO0oo(abstractC34039OooOooOOooOOoo.OooOo0(0));
        c34155OooOOOO.f122725OooOo = C34029OooOOo0.OooOOo0(abstractC34039OooOooOOooOOoo.OooOo0(1));
        if (abstractC34039OooOooOOooOOoo.size() == 3) {
            c34155OooOOOO.f122727OooOoO0 = C34066Oooooo0.OooOo0(abstractC34039OooOooOOooOOoo.OooOo0(2));
        }
        return c34155OooOOOO;
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo(3);
        c34020OooO0oo.OooO00o(this.f122726OooOo0o);
        c34020OooO0oo.OooO00o(this.f122725OooOo);
        C34066Oooooo0 c34066Oooooo0 = this.f122727OooOoO0;
        if (c34066Oooooo0 != null) {
            c34020OooO0oo.OooO00o(c34066Oooooo0);
        }
        return new o00oO0O(c34020OooO0oo);
    }
}
