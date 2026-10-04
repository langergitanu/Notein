package oO0oO0Oo;

import java.io.IOException;

/* JADX INFO: renamed from: oO0oO0Oo.o0ooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34079o0ooOoO extends Oooo0 {
    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final void OooO(C34035OooOoO0 c34035OooOoO0, boolean z) throws IOException {
        AbstractC34036OooOoOO abstractC34036OooOoOOOooOOOO = this.f122379OooOoO.OooO0o().OooOOOO();
        boolean zOooOo0 = OooOo0();
        if (z) {
            int i = this.f122377OooOo;
            if (zOooOo0 || abstractC34036OooOoOOOooOOOO.OooOO0()) {
                i |= 32;
            }
            c34035OooOoO0.OooOO0o(i, this.f122380OooOoO0);
        }
        if (zOooOo0) {
            c34035OooOoO0.OooO0oo(abstractC34036OooOoOOOooOOOO.OooOO0O(true));
        }
        abstractC34036OooOoOOOooOOOO.OooO(c34035OooOoO0.OooO00o(), zOooOo0);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooOO0() {
        return OooOo0() || this.f122379OooOoO.OooO0o().OooOOOO().OooOO0();
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final int OooOO0O(boolean z) throws IOException {
        AbstractC34036OooOoOO abstractC34036OooOoOOOooOOOO = this.f122379OooOoO.OooO0o().OooOOOO();
        boolean zOooOo0 = OooOo0();
        int iOooOO0O = abstractC34036OooOoOOOooOOOO.OooOO0O(zOooOo0);
        if (zOooOo0) {
            iOooOO0O += C34035OooOoO0.OooO0OO(iOooOO0O);
        }
        return iOooOO0O + (z ? C34035OooOoO0.OooO0o0(this.f122380OooOoO0) : 0);
    }

    @Override // oO0oO0Oo.Oooo0, oO0oO0Oo.AbstractC34036OooOoOO
    public final AbstractC34036OooOoOO OooOOOO() {
        return this;
    }

    @Override // oO0oO0Oo.Oooo0, oO0oO0Oo.AbstractC34036OooOoOO
    public final AbstractC34036OooOoOO OooOOOo() {
        return this;
    }

    @Override // oO0oO0Oo.Oooo0
    public final AbstractC34039OooOooO OooOo0O(AbstractC34036OooOoOO abstractC34036OooOoOO) {
        o00oO0O o00oo0o = new o00oO0O(abstractC34036OooOoOO);
        o00oo0o.f122444OooOoO0 = -1;
        return o00oo0o;
    }
}
