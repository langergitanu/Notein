package oO0oO0Oo;

import java.io.IOException;

/* JADX INFO: renamed from: oO0oO0Oo.OoooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34059OoooOoo extends Oooo0 {
    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final void OooO(C34035OooOoO0 c34035OooOoO0, boolean z) throws IOException {
        AbstractC34036OooOoOO abstractC34036OooOoOOOooO0o = this.f122379OooOoO.OooO0o();
        boolean zOooOo0 = OooOo0();
        if (z) {
            int i = this.f122377OooOo;
            if (zOooOo0 || abstractC34036OooOoOOOooO0o.OooOO0()) {
                i |= 32;
            }
            c34035OooOoO0.OooOO0o(i, this.f122380OooOoO0);
        }
        if (!zOooOo0) {
            abstractC34036OooOoOOOooO0o.OooO(c34035OooOoO0, false);
            return;
        }
        c34035OooOoO0.OooO0o(128);
        abstractC34036OooOoOOOooO0o.OooO(c34035OooOoO0, true);
        c34035OooOoO0.OooO0o(0);
        c34035OooOoO0.OooO0o(0);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooOO0() {
        return OooOo0() || this.f122379OooOoO.OooO0o().OooOO0();
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final int OooOO0O(boolean z) throws IOException {
        AbstractC34036OooOoOO abstractC34036OooOoOOOooO0o = this.f122379OooOoO.OooO0o();
        boolean zOooOo0 = OooOo0();
        int iOooOO0O = abstractC34036OooOoOOOooO0o.OooOO0O(zOooOo0);
        if (zOooOo0) {
            iOooOO0O += 3;
        }
        return iOooOO0O + (z ? C34035OooOoO0.OooO0o0(this.f122380OooOoO0) : 0);
    }

    @Override // oO0oO0Oo.Oooo0
    public final AbstractC34039OooOooO OooOo0O(AbstractC34036OooOoOO abstractC34036OooOoOO) {
        return new C34055OoooOOO(abstractC34036OooOoOO);
    }
}
