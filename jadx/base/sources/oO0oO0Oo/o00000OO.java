package oO0oO0Oo;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class o00000OO extends AbstractC34040OooOooo {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f122429OooOoO;

    public o00000OO(boolean z, InterfaceC34019OooO0oO[] interfaceC34019OooO0oOArr) {
        super(z, interfaceC34019OooO0oOArr);
        this.f122429OooOoO = -1;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final void OooO(C34035OooOoO0 c34035OooOoO0, boolean z) throws IOException {
        c34035OooOoO0.OooOOO0(49, z);
        o00000 o00000VarOooO0O0 = c34035OooOoO0.OooO0O0();
        InterfaceC34019OooO0oO[] interfaceC34019OooO0oOArr = this.f122376OooOo0o;
        int length = interfaceC34019OooO0oOArr.length;
        int i = 0;
        if (this.f122429OooOoO >= 0 || length > 16) {
            c34035OooOoO0.OooO0oo(OooOo00());
            while (i < length) {
                o00000VarOooO0O0.OooOOOO(interfaceC34019OooO0oOArr[i].OooO0o());
                i++;
            }
            return;
        }
        AbstractC34036OooOoOO[] abstractC34036OooOoOOArr = new AbstractC34036OooOoOO[length];
        int iOooOO0O = 0;
        for (int i2 = 0; i2 < length; i2++) {
            AbstractC34036OooOoOO abstractC34036OooOoOOOooOOOo = interfaceC34019OooO0oOArr[i2].OooO0o().OooOOOo();
            abstractC34036OooOoOOArr[i2] = abstractC34036OooOoOOOooOOOo;
            iOooOO0O += abstractC34036OooOoOOOooOOOo.OooOO0O(true);
        }
        this.f122429OooOoO = iOooOO0O;
        c34035OooOoO0.OooO0oo(iOooOO0O);
        while (i < length) {
            o00000VarOooO0O0.OooOOOO(abstractC34036OooOoOOArr[i]);
            i++;
        }
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final int OooOO0O(boolean z) throws IOException {
        return C34035OooOoO0.OooO0Oo(OooOo00(), z);
    }

    @Override // oO0oO0Oo.AbstractC34040OooOooo, oO0oO0Oo.AbstractC34036OooOoOO
    public final AbstractC34036OooOoOO OooOOOo() {
        return this;
    }

    public final int OooOo00() throws IOException {
        if (this.f122429OooOoO < 0) {
            int iOooOO0O = 0;
            for (InterfaceC34019OooO0oO interfaceC34019OooO0oO : this.f122376OooOo0o) {
                iOooOO0O += interfaceC34019OooO0oO.OooO0o().OooOOOo().OooOO0O(true);
            }
            this.f122429OooOoO = iOooOO0O;
        }
        return this.f122429OooOoO;
    }
}
