package oO0oOo0;

import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34079o0ooOoO;
import oO0oO0Oo.InterfaceC34019OooO0oO;
import oO0oO0Oo.Oooo0;
import oO0oO0Oo.o00oO0O;

/* JADX INFO: renamed from: oO0oOo0.OooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34160OooOo extends oO0oO0Oo.OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C34155OooOOOO f122740OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C34154OooOOO0 f122741OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C34158OooOOo0 f122742OooOoO0;

    public static C34160OooOo OooO0oo(InterfaceC34019OooO0oO interfaceC34019OooO0oO) {
        int i;
        if (interfaceC34019OooO0oO instanceof C34160OooOo) {
            return (C34160OooOo) interfaceC34019OooO0oO;
        }
        if (interfaceC34019OooO0oO == null) {
            return null;
        }
        AbstractC34039OooOooO abstractC34039OooOooOOooOOoo = AbstractC34039OooOooO.OooOOoo(interfaceC34019OooO0oO);
        C34160OooOo c34160OooOo = new C34160OooOo();
        if (abstractC34039OooOooOOooOOoo.size() > 3) {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC34039OooOooOOooOOoo.size());
        }
        if (abstractC34039OooOooOOooOOoo.OooOo0(0) instanceof Oooo0) {
            i = 0;
        } else {
            c34160OooOo.f122741OooOo0o = C34154OooOOO0.OooO0oo(abstractC34039OooOooOOooOOoo.OooOo0(0));
            i = 1;
        }
        while (i != abstractC34039OooOooOOooOOoo.size()) {
            Oooo0 oooo0OooOOoo = Oooo0.OooOOoo(abstractC34039OooOooOOooOOoo.OooOo0(i));
            int i2 = oooo0OooOOoo.f122380OooOoO0;
            if (i2 == 0) {
                c34160OooOo.f122740OooOo = C34155OooOOOO.OooO0oo(oooo0OooOOoo, false);
            } else {
                if (i2 != 1) {
                    throw new IllegalArgumentException("Bad tag number: " + oooo0OooOOoo.f122380OooOoO0);
                }
                c34160OooOo.f122742OooOoO0 = C34158OooOOo0.OooO0oo(oooo0OooOOoo);
            }
            i++;
        }
        return c34160OooOo;
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo(3);
        C34154OooOOO0 c34154OooOOO0 = this.f122741OooOo0o;
        if (c34154OooOOO0 != null) {
            c34020OooO0oo.OooO00o(c34154OooOOO0);
        }
        C34155OooOOOO c34155OooOOOO = this.f122740OooOo;
        if (c34155OooOOOO != null) {
            c34020OooO0oo.OooO00o(new C34079o0ooOoO(false, 0, c34155OooOOOO));
        }
        C34158OooOOo0 c34158OooOOo0 = this.f122742OooOoO0;
        if (c34158OooOOo0 != null) {
            c34020OooO0oo.OooO00o(new C34079o0ooOoO(false, 1, c34158OooOOo0));
        }
        return new o00oO0O(c34020OooO0oo);
    }
}
