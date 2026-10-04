package oO0oOoo0;

import OooOOO0.AbstractC20449OooO0Oo;

/* JADX INFO: renamed from: oO0oOoo0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34215OooO0oo extends AbstractC34210OooO0OO {
    @Override // oO0oOoOo.InterfaceC34201OooO0Oo
    public final String OooO0O0() {
        return "SHA-384";
    }

    @Override // oO0oOoOo.InterfaceC34201OooO0Oo
    public final int OooO0OO() {
        return 48;
    }

    @Override // oO0oOoo0.AbstractC34210OooO0OO
    public final void OooOO0() {
        super.OooOO0();
        this.f122883OooO0o0 = -3766243637369397544L;
        this.f122882OooO0o = 7105036623409894663L;
        this.f122884OooO0oO = -7973340178411365097L;
        this.f122885OooO0oo = 1526699215303891257L;
        this.f122877OooO = 7436329637833083697L;
        this.f122886OooOO0 = -8163818279084223215L;
        this.f122887OooOO0O = -2662702644619276377L;
        this.f122888OooOO0o = 5167115440072839076L;
    }

    @Override // oO0oOoOo.InterfaceC34201OooO0Oo
    public final int doFinal(byte[] bArr, int i) {
        OooO0oo();
        AbstractC20449OooO0Oo.Oooo0(this.f122883OooO0o0, bArr, i);
        AbstractC20449OooO0Oo.Oooo0(this.f122882OooO0o, bArr, i + 8);
        AbstractC20449OooO0Oo.Oooo0(this.f122884OooO0oO, bArr, i + 16);
        AbstractC20449OooO0Oo.Oooo0(this.f122885OooO0oo, bArr, i + 24);
        AbstractC20449OooO0Oo.Oooo0(this.f122877OooO, bArr, i + 32);
        AbstractC20449OooO0Oo.Oooo0(this.f122886OooOO0, bArr, i + 40);
        OooOO0();
        return 48;
    }
}
