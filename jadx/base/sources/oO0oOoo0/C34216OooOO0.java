package oO0oOoo0;

import OooOOO0.AbstractC20449OooO0Oo;

/* JADX INFO: renamed from: oO0oOoo0.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34216OooOO0 extends AbstractC34210OooO0OO {
    @Override // oO0oOoOo.InterfaceC34201OooO0Oo
    public final String OooO0O0() {
        return "SHA-512";
    }

    @Override // oO0oOoOo.InterfaceC34201OooO0Oo
    public final int OooO0OO() {
        return 64;
    }

    @Override // oO0oOoo0.AbstractC34210OooO0OO
    public final void OooOO0() {
        super.OooOO0();
        this.f122883OooO0o0 = 7640891576956012808L;
        this.f122882OooO0o = -4942790177534073029L;
        this.f122884OooO0oO = 4354685564936845355L;
        this.f122885OooO0oo = -6534734903238641935L;
        this.f122877OooO = 5840696475078001361L;
        this.f122886OooOO0 = -7276294671716946913L;
        this.f122887OooOO0O = 2270897969802886507L;
        this.f122888OooOO0o = 6620516959819538809L;
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
        AbstractC20449OooO0Oo.Oooo0(this.f122887OooOO0O, bArr, i + 48);
        AbstractC20449OooO0Oo.Oooo0(this.f122888OooOO0o, bArr, i + 56);
        OooOO0();
        return 64;
    }
}
