package oO0oO0oo;

import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34032OooOo0O;
import oO0oO0Oo.C34055OoooOOO;
import oO0oO0Oo.C34059OoooOoo;
import oO0oO0Oo.Oooo0;

/* JADX INFO: renamed from: oO0oO0oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34085OooO0O0 extends oO0oO0Oo.OooOo00 implements InterfaceC34084OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public oO0oO0Oo.OooOo00 f122473OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C34032OooOo0O f122474OooOo0o;

    public static C34085OooO0O0 OooO0oo(AbstractC34036OooOoOO abstractC34036OooOoOO) {
        if (abstractC34036OooOoOO == null) {
            return null;
        }
        AbstractC34039OooOooO abstractC34039OooOooOOooOOoo = AbstractC34039OooOooO.OooOOoo(abstractC34036OooOoOO);
        C34085OooO0O0 c34085OooO0O0 = new C34085OooO0O0();
        if (abstractC34039OooOooOOooOOoo.size() < 1 || abstractC34039OooOooOOooOOoo.size() > 2) {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC34039OooOooOOooOOoo.size());
        }
        c34085OooO0O0.f122474OooOo0o = (C34032OooOo0O) abstractC34039OooOooOOooOOoo.OooOo0(0);
        if (abstractC34039OooOooOOooOOoo.size() <= 1) {
            return c34085OooO0O0;
        }
        Oooo0 oooo0 = (Oooo0) abstractC34039OooOooOOooOOoo.OooOo0(1);
        if (!oooo0.OooOo0() || oooo0.f122380OooOoO0 != 0) {
            throw new IllegalArgumentException("Bad tag for 'content'");
        }
        c34085OooO0O0.f122473OooOo = oooo0.OooOo00();
        return c34085OooO0O0;
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo(2);
        c34020OooO0oo.OooO00o(this.f122474OooOo0o);
        oO0oO0Oo.OooOo00 oooOo00 = this.f122473OooOo;
        if (oooOo00 != null) {
            c34020OooO0oo.OooO00o(new C34059OoooOoo(true, 0, oooOo00));
        }
        return new C34055OoooOOO(c34020OooO0oo);
    }
}
