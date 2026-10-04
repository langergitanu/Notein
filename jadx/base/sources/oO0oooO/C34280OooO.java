package oO0oooO;

import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34029OooOOo0;
import oO0oO0Oo.OooOo00;
import oO0oO0Oo.o00oO0O;
import oO0oOo0.C34142OooO00o;

/* JADX INFO: renamed from: oO0oooO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34280OooO extends OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f123059OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C34029OooOOo0 f123060OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C34142OooO00o f123061OooOoO0;

    public C34280OooO(int i, C34142OooO00o c34142OooO00o) {
        this.f123060OooOo0o = new C34029OooOOo0(0L);
        this.f123059OooOo = i;
        this.f123061OooOoO0 = c34142OooO00o;
    }

    public static C34280OooO OooO0oo(Object obj) {
        if (obj instanceof C34280OooO) {
            return (C34280OooO) obj;
        }
        if (obj != null) {
            return new C34280OooO(AbstractC34039OooOooO.OooOOoo(obj));
        }
        return null;
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo();
        c34020OooO0oo.OooO00o(this.f123060OooOo0o);
        c34020OooO0oo.OooO00o(new C34029OooOOo0(this.f123059OooOo));
        c34020OooO0oo.OooO00o(this.f123061OooOoO0);
        return new o00oO0O(c34020OooO0oo);
    }

    public C34280OooO(AbstractC34039OooOooO abstractC34039OooOooO) {
        this.f123060OooOo0o = C34029OooOOo0.OooOOo0(abstractC34039OooOooO.OooOo0(0));
        this.f123059OooOo = C34029OooOOo0.OooOOo0(abstractC34039OooOooO.OooOo0(1)).OooOo0();
        this.f123061OooOoO0 = C34142OooO00o.OooO0oo(abstractC34039OooOooO.OooOo0(2));
    }
}
