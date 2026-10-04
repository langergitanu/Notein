package oO0oooO;

import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34029OooOOo0;
import oO0oO0Oo.OooOo00;
import oO0oO0Oo.o00oO0O;
import oO0oOo0.C34142OooO00o;

/* JADX INFO: renamed from: oO0oooO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34288OooO0oo extends OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C34142OooO00o f123105OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C34029OooOOo0 f123106OooOo0o;

    public C34288OooO0oo(AbstractC34039OooOooO abstractC34039OooOooO) {
        this.f123106OooOo0o = C34029OooOOo0.OooOOo0(abstractC34039OooOooO.OooOo0(0));
        this.f123105OooOo = C34142OooO00o.OooO0oo(abstractC34039OooOooO.OooOo0(1));
    }

    public static final C34288OooO0oo OooO0oo(Object obj) {
        if (obj instanceof C34288OooO0oo) {
            return (C34288OooO0oo) obj;
        }
        if (obj != null) {
            return new C34288OooO0oo(AbstractC34039OooOooO.OooOOoo(obj));
        }
        return null;
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo();
        c34020OooO0oo.OooO00o(this.f123106OooOo0o);
        c34020OooO0oo.OooO00o(this.f123105OooOo);
        return new o00oO0O(c34020OooO0oo);
    }

    public C34288OooO0oo(C34142OooO00o c34142OooO00o) {
        this.f123106OooOo0o = new C34029OooOOo0(0L);
        this.f123105OooOo = c34142OooO00o;
    }
}
