package oO0oOoo0;

import oO0oOoOo.InterfaceC34204OooO0oO;

/* JADX INFO: renamed from: oO0oOoo0.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34217OooOO0O extends C34209OooO0O0 implements InterfaceC34204OooO0oO {
    public C34217OooOO0O() {
        super(256);
    }

    @Override // oO0oOoOo.InterfaceC34204OooO0oO
    public final int OooO00o(int i, int i2, byte[] bArr) {
        if (!this.f122874OooO0o) {
            OooO0o(15, 4);
        }
        OooO0oo(((long) i2) * 8, bArr, i);
        OooO0oO(this.f122875OooO0o0);
        return i2;
    }

    @Override // oO0oOoOo.InterfaceC34201OooO0Oo
    public final String OooO0O0() {
        return "SHAKE" + this.f122875OooO0o0;
    }

    @Override // oO0oOoo0.C34209OooO0O0, oO0oOoOo.InterfaceC34201OooO0Oo
    public final int OooO0OO() {
        return this.f122875OooO0o0 / 4;
    }

    @Override // oO0oOoOo.InterfaceC34201OooO0Oo
    public final int doFinal(byte[] bArr, int i) {
        int i2 = this.f122875OooO0o0 / 4;
        OooO00o(i, i2, bArr);
        return i2;
    }
}
