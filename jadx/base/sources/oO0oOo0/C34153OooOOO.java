package oO0oOo0;

import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34079o0ooOoO;
import oO0oO0Oo.o00oO0O;

/* JADX INFO: renamed from: oO0oOo0.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34153OooOOO extends oO0oO0Oo.OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C34154OooOOO0 f122720OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C34155OooOOOO f122721OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f122722OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C34158OooOOo0 f122723OooOoO0;

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34154OooOOO0 c34154OooOOO0 = this.f122720OooOo;
        C34155OooOOOO c34155OooOOOO = this.f122721OooOo0o;
        if (this.f122722OooOoO != 1) {
            return c34154OooOOO0 != null ? new C34079o0ooOoO(true, 1, c34154OooOOO0) : new C34079o0ooOoO(true, 0, c34155OooOOOO);
        }
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo(3);
        if (c34155OooOOOO != null) {
            c34020OooO0oo.OooO00o(new C34079o0ooOoO(2, 128, 0, c34155OooOOOO));
        }
        if (c34154OooOOO0 != null) {
            c34020OooO0oo.OooO00o(new C34079o0ooOoO(2, 128, 1, c34154OooOOO0));
        }
        C34158OooOOo0 c34158OooOOo0 = this.f122723OooOoO0;
        if (c34158OooOOo0 != null) {
            c34020OooO0oo.OooO00o(new C34079o0ooOoO(2, 128, 2, c34158OooOOo0));
        }
        return new o00oO0O(c34020OooO0oo);
    }
}
