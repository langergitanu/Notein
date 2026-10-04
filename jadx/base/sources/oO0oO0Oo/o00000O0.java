package oO0oO0Oo;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class o00000O0 extends AbstractC34039OooOooO {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f122428OooOoO0;

    public o00000O0(C34020OooO0oo c34020OooO0oo) {
        super(c34020OooO0oo);
        this.f122428OooOoO0 = -1;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final void OooO(C34035OooOoO0 c34035OooOoO0, boolean z) throws IOException {
        c34035OooOoO0.OooOOO0(48, z);
        o00000 o00000VarOooO0O0 = c34035OooOoO0.OooO0O0();
        int length = this.f122371OooOo0o.length;
        int i = 0;
        if (this.f122428OooOoO0 >= 0 || length > 16) {
            c34035OooOoO0.OooO0oo(OooOoOO());
            while (i < length) {
                o00000VarOooO0O0.OooOOOO(this.f122371OooOo0o[i].OooO0o());
                i++;
            }
            return;
        }
        AbstractC34036OooOoOO[] abstractC34036OooOoOOArr = new AbstractC34036OooOoOO[length];
        int iOooOO0O = 0;
        for (int i2 = 0; i2 < length; i2++) {
            AbstractC34036OooOoOO abstractC34036OooOoOOOooOOOo = this.f122371OooOo0o[i2].OooO0o().OooOOOo();
            abstractC34036OooOoOOArr[i2] = abstractC34036OooOoOOOooOOOo;
            iOooOO0O += abstractC34036OooOoOOOooOOOo.OooOO0O(true);
        }
        this.f122428OooOoO0 = iOooOO0O;
        c34035OooOoO0.OooO0oo(iOooOO0O);
        while (i < length) {
            o00000VarOooO0O0.OooOOOO(abstractC34036OooOoOOArr[i]);
            i++;
        }
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final int OooOO0O(boolean z) throws IOException {
        return C34035OooOoO0.OooO0Oo(OooOoOO(), z);
    }

    @Override // oO0oO0Oo.AbstractC34039OooOooO, oO0oO0Oo.AbstractC34036OooOoOO
    public final AbstractC34036OooOoOO OooOOOo() {
        return this;
    }

    @Override // oO0oO0Oo.AbstractC34039OooOooO
    public final AbstractC34022OooOO0O OooOo() {
        return new o000000O(this);
    }

    @Override // oO0oO0Oo.AbstractC34039OooOooO
    public final AbstractC34015OooO0OO OooOo0o() {
        return new o000OOo(C34051OoooO0.OooOo0(OooOOo0()), false);
    }

    @Override // oO0oO0Oo.AbstractC34039OooOooO
    public final AbstractC34040OooOooo OooOoO() {
        return new o00000OO(false, this.f122371OooOo0o);
    }

    @Override // oO0oO0Oo.AbstractC34039OooOooO
    public final AbstractC34033OooOo0o OooOoO0() {
        return new C34075o00o0O(C34054OoooOO0.OooOOoo(OooOOo()));
    }

    public final int OooOoOO() throws IOException {
        if (this.f122428OooOoO0 < 0) {
            int length = this.f122371OooOo0o.length;
            int iOooOO0O = 0;
            for (int i = 0; i < length; i++) {
                iOooOO0O += this.f122371OooOo0o[i].OooO0o().OooOOOo().OooOO0O(true);
            }
            this.f122428OooOoO0 = iOooOO0O;
        }
        return this.f122428OooOoO0;
    }
}
