package oO0oO0Oo;

import java.io.IOException;

/* JADX INFO: renamed from: oO0oO0Oo.OoooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34057OoooOo0 extends AbstractC34040OooOooo {
    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final void OooO(C34035OooOoO0 c34035OooOoO0, boolean z) throws IOException {
        c34035OooOoO0.OooOO0O(z, 49, this.f122376OooOo0o);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final int OooOO0O(boolean z) throws IOException {
        int iOooOO0O = z ? 4 : 3;
        for (InterfaceC34019OooO0oO interfaceC34019OooO0oO : this.f122376OooOo0o) {
            iOooOO0O += interfaceC34019OooO0oO.OooO0o().OooOO0O(true);
        }
        return iOooOO0O;
    }
}
