package oO0oooO;

import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34029OooOOo0;
import oO0oO0Oo.OooOo00;
import oO0oO0Oo.o00oO0O;
import oO0oOo0.C34142OooO00o;

/* JADX INFO: renamed from: oO0oooO.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34289OooOO0 extends OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f123107OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C34029OooOOo0 f123108OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C34142OooO00o f123109OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f123110OooOoO0;

    public C34289OooOO0(int i, int i2, C34142OooO00o c34142OooO00o) {
        this.f123108OooOo0o = new C34029OooOOo0(0L);
        this.f123107OooOo = i;
        this.f123110OooOoO0 = i2;
        this.f123109OooOoO = c34142OooO00o;
    }

    public static C34289OooOO0 OooO0oo(Object obj) {
        if (obj instanceof C34289OooOO0) {
            return (C34289OooOO0) obj;
        }
        if (obj != null) {
            return new C34289OooOO0(AbstractC34039OooOooO.OooOOoo(obj));
        }
        return null;
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo();
        c34020OooO0oo.OooO00o(this.f123108OooOo0o);
        c34020OooO0oo.OooO00o(new C34029OooOOo0(this.f123107OooOo));
        c34020OooO0oo.OooO00o(new C34029OooOOo0(this.f123110OooOoO0));
        c34020OooO0oo.OooO00o(this.f123109OooOoO);
        return new o00oO0O(c34020OooO0oo);
    }

    public C34289OooOO0(AbstractC34039OooOooO abstractC34039OooOooO) {
        this.f123108OooOo0o = C34029OooOOo0.OooOOo0(abstractC34039OooOooO.OooOo0(0));
        this.f123107OooOo = C34029OooOOo0.OooOOo0(abstractC34039OooOooO.OooOo0(1)).OooOo0();
        this.f123110OooOoO0 = C34029OooOOo0.OooOOo0(abstractC34039OooOooO.OooOo0(2)).OooOo0();
        this.f123109OooOoO = C34142OooO00o.OooO0oo(abstractC34039OooOooO.OooOo0(3));
    }
}
