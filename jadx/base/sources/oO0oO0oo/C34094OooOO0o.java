package oO0oO0oo;

import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34040OooOooo;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34079o0ooOoO;
import oO0oO0Oo.o00oO0O;

/* JADX INFO: renamed from: oO0oO0oo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34094OooOO0o extends oO0oO0Oo.OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public AbstractC34040OooOooo f122499OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public AbstractC34040OooOooo f122500OooOo0o;

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo(2);
        AbstractC34040OooOooo abstractC34040OooOooo = this.f122500OooOo0o;
        if (abstractC34040OooOooo != null) {
            c34020OooO0oo.OooO00o(new C34079o0ooOoO(false, 0, abstractC34040OooOooo));
        }
        AbstractC34040OooOooo abstractC34040OooOooo2 = this.f122499OooOo;
        if (abstractC34040OooOooo2 != null) {
            c34020OooO0oo.OooO00o(new C34079o0ooOoO(false, 1, abstractC34040OooOooo2));
        }
        return new o00oO0O(c34020OooO0oo);
    }
}
