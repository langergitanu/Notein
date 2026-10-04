package oO0oooO;

import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34029OooOOo0;
import oO0oO0Oo.C34075o00o0O;
import oO0oO0Oo.OooOo00;
import oO0oO0Oo.o00oO0O;
import oOO000oO.C34332OooO00o;

/* JADX INFO: renamed from: oO0oooO.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34291OooOO0o extends OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final byte[] f123119OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final byte[] f123120OooOo0o;

    public C34291OooOO0o(byte[] bArr, byte[] bArr2) {
        this.f123120OooOo0o = C34332OooO00o.OooO00o(bArr);
        this.f123119OooOo = C34332OooO00o.OooO00o(bArr2);
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo();
        c34020OooO0oo.OooO00o(new C34029OooOOo0(0L));
        c34020OooO0oo.OooO00o(new C34075o00o0O(this.f123120OooOo0o));
        c34020OooO0oo.OooO00o(new C34075o00o0O(this.f123119OooOo));
        return new o00oO0O(c34020OooO0oo);
    }
}
