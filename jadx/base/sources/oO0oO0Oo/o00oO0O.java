package oO0oO0Oo;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class o00oO0O extends AbstractC34039OooOooO {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f122444OooOoO0;

    public o00oO0O() {
        this.f122444OooOoO0 = -1;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final void OooO(C34035OooOoO0 c34035OooOoO0, boolean z) throws IOException {
        c34035OooOoO0.OooOOO0(48, z);
        oo000o oo000oVarOooO00o = c34035OooOoO0.OooO00o();
        int length = this.f122371OooOo0o.length;
        int i = 0;
        if (this.f122444OooOoO0 >= 0 || length > 16) {
            c34035OooOoO0.OooO0oo(OooOoOO());
            while (i < length) {
                this.f122371OooOo0o[i].OooO0o().OooOOOO().OooO(oo000oVarOooO00o, true);
                i++;
            }
            return;
        }
        AbstractC34036OooOoOO[] abstractC34036OooOoOOArr = new AbstractC34036OooOoOO[length];
        int iOooOO0O = 0;
        for (int i2 = 0; i2 < length; i2++) {
            AbstractC34036OooOoOO abstractC34036OooOoOOOooOOOO = this.f122371OooOo0o[i2].OooO0o().OooOOOO();
            abstractC34036OooOoOOArr[i2] = abstractC34036OooOoOOOooOOOO;
            iOooOO0O += abstractC34036OooOoOOOooOOOO.OooOO0O(true);
        }
        this.f122444OooOoO0 = iOooOO0O;
        c34035OooOoO0.OooO0oo(iOooOO0O);
        while (i < length) {
            abstractC34036OooOoOOArr[i].OooO(oo000oVarOooO00o, true);
            i++;
        }
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final int OooOO0O(boolean z) throws IOException {
        return C34035OooOoO0.OooO0Oo(OooOoOO(), z);
    }

    @Override // oO0oO0Oo.AbstractC34039OooOooO, oO0oO0Oo.AbstractC34036OooOoOO
    public final AbstractC34036OooOoOO OooOOOO() {
        return this;
    }

    @Override // oO0oO0Oo.AbstractC34039OooOooO, oO0oO0Oo.AbstractC34036OooOoOO
    public final AbstractC34036OooOoOO OooOOOo() {
        return this;
    }

    @Override // oO0oO0Oo.AbstractC34039OooOooO
    public final AbstractC34022OooOO0O OooOo() {
        return new C34065Oooooo(this);
    }

    @Override // oO0oO0Oo.AbstractC34039OooOooO
    public final AbstractC34015OooO0OO OooOo0o() {
        return new C34066Oooooo0(C34051OoooO0.OooOo0(OooOOo0()), false);
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
        if (this.f122444OooOoO0 < 0) {
            int length = this.f122371OooOo0o.length;
            int iOooOO0O = 0;
            for (int i = 0; i < length; i++) {
                iOooOO0O += this.f122371OooOo0o[i].OooO0o().OooOOOO().OooOO0O(true);
            }
            this.f122444OooOoO0 = iOooOO0O;
        }
        return this.f122444OooOoO0;
    }

    public o00oO0O(C34020OooO0oo c34020OooO0oo) {
        super(c34020OooO0oo);
        this.f122444OooOoO0 = -1;
    }

    public o00oO0O(InterfaceC34019OooO0oO[] interfaceC34019OooO0oOArr) {
        if (interfaceC34019OooO0oOArr != null) {
            for (InterfaceC34019OooO0oO interfaceC34019OooO0oO : interfaceC34019OooO0oOArr) {
                if (interfaceC34019OooO0oO != null) {
                }
            }
            this.f122371OooOo0o = interfaceC34019OooO0oOArr.length < 1 ? C34020OooO0oo.f122324OooO0Oo : (InterfaceC34019OooO0oO[]) interfaceC34019OooO0oOArr.clone();
            this.f122444OooOoO0 = -1;
            return;
        }
        throw new NullPointerException("'elements' cannot be null, or contain null");
    }
}
