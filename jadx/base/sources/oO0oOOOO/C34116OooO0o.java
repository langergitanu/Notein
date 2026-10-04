package oO0oOOOO;

import java.io.IOException;
import java.util.Enumeration;
import oO0oO0Oo.AbstractC34033OooOo0o;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.AbstractC34040OooOooo;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34029OooOOo0;
import oO0oO0Oo.C34066Oooooo0;
import oO0oO0Oo.C34075o00o0O;
import oO0oO0Oo.C34079o0ooOoO;
import oO0oO0Oo.OooOo00;
import oO0oO0Oo.Oooo0;
import oO0oO0Oo.o00oO0O;
import oO0oOo0.C34142OooO00o;
import oOO000oO.C34333OooO0O0;

/* JADX INFO: renamed from: oO0oOOOO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34116OooO0o extends OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C34142OooO00o f122584OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C34029OooOOo0 f122585OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public AbstractC34040OooOooo f122586OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public AbstractC34033OooOo0o f122587OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C34066Oooooo0 f122588OooOoOO;

    public C34116OooO0o(C34142OooO00o c34142OooO00o, OooOo00 oooOo00, AbstractC34040OooOooo abstractC34040OooOooo, byte[] bArr) throws IOException {
        this.f122585OooOo0o = new C34029OooOOo0(bArr != null ? C34333OooO0O0.f123262OooO0O0 : C34333OooO0O0.f123261OooO00o);
        this.f122584OooOo = c34142OooO00o;
        this.f122587OooOoO0 = new C34075o00o0O(oooOo00.OooO0o().OooO0oO());
        this.f122586OooOoO = abstractC34040OooOooo;
        this.f122588OooOoOO = bArr == null ? null : new C34066Oooooo0(bArr, 0);
    }

    public static C34116OooO0o OooO0oo(Object obj) {
        if (obj instanceof C34116OooO0o) {
            return (C34116OooO0o) obj;
        }
        if (obj == null) {
            return null;
        }
        AbstractC34039OooOooO abstractC34039OooOooOOooOOoo = AbstractC34039OooOooO.OooOOoo(obj);
        C34116OooO0o c34116OooO0o = new C34116OooO0o();
        Enumeration enumerationOooOo0O = abstractC34039OooOooOOooOOoo.OooOo0O();
        C34029OooOOo0 c34029OooOOo0OooOOo0 = C34029OooOOo0.OooOOo0(enumerationOooOo0O.nextElement());
        c34116OooO0o.f122585OooOo0o = c34029OooOOo0OooOOo0;
        int iOooOo0 = c34029OooOOo0OooOOo0.OooOo0();
        if (iOooOo0 < 0 || iOooOo0 > 1) {
            throw new IllegalArgumentException("invalid version for private key info");
        }
        c34116OooO0o.f122584OooOo = C34142OooO00o.OooO0oo(enumerationOooOo0O.nextElement());
        c34116OooO0o.f122587OooOoO0 = AbstractC34033OooOo0o.OooOOo0(enumerationOooOo0O.nextElement());
        int i = -1;
        while (enumerationOooOo0O.hasMoreElements()) {
            Oooo0 oooo0 = (Oooo0) enumerationOooOo0O.nextElement();
            int i2 = oooo0.f122380OooOoO0;
            if (i2 <= i) {
                throw new IllegalArgumentException("invalid optional field in private key info");
            }
            if (i2 == 0) {
                c34116OooO0o.f122586OooOoO = (AbstractC34040OooOooo) AbstractC34040OooOooo.f122374OooOoO0.OooO0o0(oooo0, false);
            } else {
                if (i2 != 1) {
                    throw new IllegalArgumentException("unknown optional field in private key info");
                }
                if (iOooOo0 < 1) {
                    throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                }
                c34116OooO0o.f122588OooOoOO = C34066Oooooo0.OooOo0O(oooo0);
            }
            i = i2;
        }
        return c34116OooO0o;
    }

    public final AbstractC34036OooOoOO OooO() throws IOException {
        return AbstractC34036OooOoOO.OooOOO(this.f122587OooOoO0.f122362OooOo0o);
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo(5);
        c34020OooO0oo.OooO00o(this.f122585OooOo0o);
        c34020OooO0oo.OooO00o(this.f122584OooOo);
        c34020OooO0oo.OooO00o(this.f122587OooOoO0);
        AbstractC34040OooOooo abstractC34040OooOooo = this.f122586OooOoO;
        if (abstractC34040OooOooo != null) {
            c34020OooO0oo.OooO00o(new C34079o0ooOoO(2, 128, 0, abstractC34040OooOooo));
        }
        C34066Oooooo0 c34066Oooooo0 = this.f122588OooOoOO;
        if (c34066Oooooo0 != null) {
            c34020OooO0oo.OooO00o(new C34079o0ooOoO(2, 128, 1, c34066Oooooo0));
        }
        return new o00oO0O(c34020OooO0oo);
    }
}
