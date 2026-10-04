package oO0oooO;

import oO0oO0Oo.AbstractC34033OooOo0o;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34029OooOOo0;
import oO0oO0Oo.C34075o00o0O;
import oO0oO0Oo.OooOo00;
import oO0oO0Oo.o00oO0O;

/* JADX INFO: renamed from: oO0oooO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34284OooO0Oo extends OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f123079OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f123080OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final oOO000o.OooO00o f123081OooOoO0;

    public C34284OooO0Oo(int i, int i2, oOO000o.OooO00o oooO00o) {
        this.f123080OooOo0o = i;
        this.f123079OooOo = i2;
        this.f123081OooOoO0 = new oOO000o.OooO00o(oooO00o);
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo();
        c34020OooO0oo.OooO00o(new C34029OooOOo0(this.f123080OooOo0o));
        c34020OooO0oo.OooO00o(new C34029OooOOo0(this.f123079OooOo));
        c34020OooO0oo.OooO00o(new C34075o00o0O(this.f123081OooOoO0.OooO00o()));
        return new o00oO0O(c34020OooO0oo);
    }

    public C34284OooO0Oo(AbstractC34039OooOooO abstractC34039OooOooO) {
        this.f123080OooOo0o = ((C34029OooOOo0) abstractC34039OooOooO.OooOo0(0)).OooOo0();
        this.f123079OooOo = ((C34029OooOOo0) abstractC34039OooOooO.OooOo0(1)).OooOo0();
        this.f123081OooOoO0 = new oOO000o.OooO00o(((AbstractC34033OooOo0o) abstractC34039OooOooO.OooOo0(2)).f122362OooOo0o);
    }
}
