package oO0oOo0;

import java.math.BigInteger;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34029OooOOo0;
import oO0oO0Oo.o00oO0O;

/* JADX INFO: renamed from: oO0oOo0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34149OooO0oo extends oO0oO0Oo.OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C34029OooOOo0 f122708OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C34029OooOOo0 f122709OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C34029OooOOo0 f122710OooOoO0;

    public C34149OooO0oo(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f122709OooOo0o = new C34029OooOOo0(bigInteger);
        this.f122708OooOo = new C34029OooOOo0(bigInteger2);
        this.f122710OooOoO0 = new C34029OooOOo0(bigInteger3);
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo(3);
        c34020OooO0oo.OooO00o(this.f122709OooOo0o);
        c34020OooO0oo.OooO00o(this.f122708OooOo);
        c34020OooO0oo.OooO00o(this.f122710OooOoO0);
        return new o00oO0O(c34020OooO0oo);
    }
}
