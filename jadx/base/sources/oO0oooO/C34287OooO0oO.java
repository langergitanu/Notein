package oO0oooO;

import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34029OooOOo0;
import oO0oO0Oo.C34032OooOo0O;
import oO0oO0Oo.C34075o00o0O;
import oO0oO0Oo.InterfaceC34019OooO0oO;
import oO0oO0Oo.OooOo00;
import oO0oO0Oo.o00oO0O;

/* JADX INFO: renamed from: oO0oooO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34287OooO0oO extends OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C34032OooOo0O f123099OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C34029OooOOo0 f123100OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public byte[][] f123101OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C34029OooOOo0 f123102OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public byte[][] f123103OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public byte[] f123104OooOoo0;

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo();
        InterfaceC34019OooO0oO interfaceC34019OooO0oO = this.f123100OooOo0o;
        if (interfaceC34019OooO0oO == null) {
            interfaceC34019OooO0oO = this.f123099OooOo;
        }
        c34020OooO0oo.OooO00o(interfaceC34019OooO0oO);
        c34020OooO0oo.OooO00o(this.f123102OooOoO0);
        C34020OooO0oo c34020OooO0oo2 = new C34020OooO0oo();
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[][] bArr = this.f123101OooOoO;
            if (i2 >= bArr.length) {
                break;
            }
            c34020OooO0oo2.OooO00o(new C34075o00o0O(bArr[i2]));
            i2++;
        }
        c34020OooO0oo.OooO00o(new o00oO0O(c34020OooO0oo2));
        C34020OooO0oo c34020OooO0oo3 = new C34020OooO0oo();
        while (true) {
            byte[][] bArr2 = this.f123103OooOoOO;
            if (i >= bArr2.length) {
                c34020OooO0oo.OooO00o(new o00oO0O(c34020OooO0oo3));
                C34020OooO0oo c34020OooO0oo4 = new C34020OooO0oo();
                c34020OooO0oo4.OooO00o(new C34075o00o0O(this.f123104OooOoo0));
                c34020OooO0oo.OooO00o(new o00oO0O(c34020OooO0oo4));
                return new o00oO0O(c34020OooO0oo);
            }
            c34020OooO0oo3.OooO00o(new C34075o00o0O(bArr2[i]));
            i++;
        }
    }
}
