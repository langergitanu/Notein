package oO0oooO;

import oO0oO0Oo.AbstractC34033OooOo0o;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34029OooOOo0;
import oO0oO0Oo.C34075o00o0O;
import oO0oO0Oo.OooOo00;
import oO0oO0Oo.o00oO0O;
import oO0oOo0.C34142OooO00o;

/* JADX INFO: renamed from: oO0oooO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34282OooO0O0 extends OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f123068OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f123069OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C34142OooO00o f123070OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final oOO000o.OooO00o f123071OooOoO0;

    public C34282OooO0O0(int i, int i2, oOO000o.OooO00o oooO00o, C34142OooO00o c34142OooO00o) {
        this.f123069OooOo0o = i;
        this.f123068OooOo = i2;
        this.f123071OooOoO0 = new oOO000o.OooO00o(oooO00o.OooO00o());
        this.f123070OooOoO = c34142OooO00o;
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo();
        c34020OooO0oo.OooO00o(new C34029OooOOo0(this.f123069OooOo0o));
        c34020OooO0oo.OooO00o(new C34029OooOOo0(this.f123068OooOo));
        c34020OooO0oo.OooO00o(new C34075o00o0O(this.f123071OooOoO0.OooO00o()));
        c34020OooO0oo.OooO00o(this.f123070OooOoO);
        return new o00oO0O(c34020OooO0oo);
    }

    public C34282OooO0O0(AbstractC34039OooOooO abstractC34039OooOooO) {
        this.f123069OooOo0o = ((C34029OooOOo0) abstractC34039OooOooO.OooOo0(0)).OooOo0();
        this.f123068OooOo = ((C34029OooOOo0) abstractC34039OooOooO.OooOo0(1)).OooOo0();
        this.f123071OooOoO0 = new oOO000o.OooO00o(((AbstractC34033OooOo0o) abstractC34039OooOooO.OooOo0(2)).f122362OooOo0o);
        this.f123070OooOoO = C34142OooO00o.OooO0oo(abstractC34039OooOooO.OooOo0(3));
    }
}
