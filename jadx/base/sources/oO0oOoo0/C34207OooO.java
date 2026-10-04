package oO0oOoo0;

import Oooo0oO.o0Oo0oo;

/* JADX INFO: renamed from: oO0oOoo0.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34207OooO extends C34209OooO0O0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34207OooO(int i) {
        super(i);
        if (i != 224 && i != 256 && i != 384 && i != 512) {
            throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i, "'bitLength' ", " not supported for SHA-3"));
        }
    }

    @Override // oO0oOoOo.InterfaceC34201OooO0Oo
    public final String OooO0O0() {
        return "SHA3-" + this.f122875OooO0o0;
    }

    @Override // oO0oOoOo.InterfaceC34201OooO0Oo
    public final int doFinal(byte[] bArr, int i) {
        OooO0o(2, 2);
        OooO0oo(this.f122875OooO0o0, bArr, i);
        OooO0oO(this.f122875OooO0o0);
        return OooO0OO();
    }
}
