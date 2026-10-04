package oO0oOo0O;

import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34032OooOo0O;
import oO0oO0Oo.C34066Oooooo0;
import oO0oO0Oo.OooOo00;
import oO0oO0Oo.o00oO0O;
import oO0ooO0.AbstractC34262OooO0O0;

/* JADX INFO: renamed from: oO0oOo0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34167OooO00o extends OooOo00 implements InterfaceC34171OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public byte[] f122772OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public AbstractC34262OooO0O0 f122773OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C34032OooOo0O f122774OooOoO0;

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo(3);
        boolean zOooOO0o = this.f122774OooOoO0.OooOO0o(InterfaceC34171OooO0o.f122779OooO0oo);
        AbstractC34262OooO0O0 abstractC34262OooO0O0 = this.f122773OooOo0o;
        if (zOooOO0o || this.f122774OooOoO0.OooOO0o(InterfaceC34171OooO0o.f122778OooO)) {
            c34020OooO0oo.OooO00o(new C34170OooO0Oo(abstractC34262OooO0O0.f123011OooO0O0).OooO0o());
            C34170OooO0Oo c34170OooO0Oo = new C34170OooO0Oo(abstractC34262OooO0O0.f123012OooO0OO);
            c34020OooO0oo.OooO00o(c34170OooO0Oo.OooO0o());
        }
        byte[] bArr = this.f122772OooOo;
        if (bArr != null) {
            c34020OooO0oo.OooO00o(new C34066Oooooo0(bArr, 0));
        }
        return new o00oO0O(c34020OooO0oo);
    }
}
