package oO0oO0Oo;

import java.io.IOException;

/* JADX INFO: renamed from: oO0oO0Oo.o0ooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34078o0ooOO0 extends AbstractC34040OooOooo {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f122446OooOoO = -1;

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final void OooO(C34035OooOoO0 c34035OooOoO0, boolean z) throws IOException {
        c34035OooOoO0.OooOOO0(49, z);
        oo000o oo000oVarOooO00o = c34035OooOoO0.OooO00o();
        InterfaceC34019OooO0oO[] interfaceC34019OooO0oOArr = this.f122376OooOo0o;
        int length = interfaceC34019OooO0oOArr.length;
        int i = 0;
        if (this.f122446OooOoO >= 0 || length > 16) {
            c34035OooOoO0.OooO0oo(OooOo00());
            while (i < length) {
                interfaceC34019OooO0oOArr[i].OooO0o().OooOOOO().OooO(oo000oVarOooO00o, true);
                i++;
            }
            return;
        }
        AbstractC34036OooOoOO[] abstractC34036OooOoOOArr = new AbstractC34036OooOoOO[length];
        int iOooOO0O = 0;
        for (int i2 = 0; i2 < length; i2++) {
            AbstractC34036OooOoOO abstractC34036OooOoOOOooOOOO = interfaceC34019OooO0oOArr[i2].OooO0o().OooOOOO();
            abstractC34036OooOoOOArr[i2] = abstractC34036OooOoOOOooOOOO;
            iOooOO0O += abstractC34036OooOoOOOooOOOO.OooOO0O(true);
        }
        this.f122446OooOoO = iOooOO0O;
        c34035OooOoO0.OooO0oo(iOooOO0O);
        while (i < length) {
            abstractC34036OooOoOOArr[i].OooO(oo000oVarOooO00o, true);
            i++;
        }
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final int OooOO0O(boolean z) throws IOException {
        return C34035OooOoO0.OooO0Oo(OooOo00(), z);
    }

    @Override // oO0oO0Oo.AbstractC34040OooOooo, oO0oO0Oo.AbstractC34036OooOoOO
    public final AbstractC34036OooOoOO OooOOOO() {
        return this.f122375OooOo ? this : super.OooOOOO();
    }

    @Override // oO0oO0Oo.AbstractC34040OooOooo, oO0oO0Oo.AbstractC34036OooOoOO
    public final AbstractC34036OooOoOO OooOOOo() {
        return this;
    }

    public final int OooOo00() throws IOException {
        if (this.f122446OooOoO < 0) {
            int iOooOO0O = 0;
            for (InterfaceC34019OooO0oO interfaceC34019OooO0oO : this.f122376OooOo0o) {
                iOooOO0O += interfaceC34019OooO0oO.OooO0o().OooOOOO().OooOO0O(true);
            }
            this.f122446OooOoO = iOooOO0O;
        }
        return this.f122446OooOoO;
    }
}
