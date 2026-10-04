package oO0oO0Oo;

import java.io.IOException;

/* JADX INFO: renamed from: oO0oO0Oo.OoooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34055OoooOOO extends AbstractC34039OooOooO {
    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final void OooO(C34035OooOoO0 c34035OooOoO0, boolean z) throws IOException {
        c34035OooOoO0.OooOO0O(z, 48, this.f122371OooOo0o);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final int OooOO0O(boolean z) throws IOException {
        int iOooOO0O = z ? 4 : 3;
        int length = this.f122371OooOo0o.length;
        for (int i = 0; i < length; i++) {
            iOooOO0O += this.f122371OooOo0o[i].OooO0o().OooOO0O(true);
        }
        return iOooOO0O;
    }

    @Override // oO0oO0Oo.AbstractC34039OooOooO
    public final AbstractC34022OooOO0O OooOo() {
        return ((AbstractC34039OooOooO) OooOOOo()).OooOo();
    }

    @Override // oO0oO0Oo.AbstractC34039OooOooO
    public final AbstractC34015OooO0OO OooOo0o() {
        return new C34051OoooO0(OooOOo0());
    }

    @Override // oO0oO0Oo.AbstractC34039OooOooO
    public final AbstractC34040OooOooo OooOoO() {
        return new C34057OoooOo0(false, this.f122371OooOo0o);
    }

    @Override // oO0oO0Oo.AbstractC34039OooOooO
    public final AbstractC34033OooOo0o OooOoO0() {
        AbstractC34033OooOo0o[] abstractC34033OooOo0oArrOooOOo = OooOOo();
        return new C34054OoooOO0(C34054OoooOO0.OooOOoo(abstractC34033OooOo0oArrOooOOo), abstractC34033OooOo0oArrOooOOo);
    }
}
