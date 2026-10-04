package oO0oOOOO;

import java.math.BigInteger;
import java.util.Enumeration;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34029OooOOo0;
import oO0oO0Oo.OooOo00;
import oO0oO0Oo.o00oO0O;

/* JADX INFO: renamed from: oO0oOOOO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34118OooO0oO extends OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public BigInteger f122613OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public BigInteger f122614OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public BigInteger f122615OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public BigInteger f122616OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public BigInteger f122617OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public BigInteger f122618OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public BigInteger f122619OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public BigInteger f122620OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public BigInteger f122621OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public AbstractC34039OooOooO f122622Oooo000;

    public static C34118OooO0oO OooO0oo(AbstractC34039OooOooO abstractC34039OooOooO) {
        AbstractC34039OooOooO abstractC34039OooOooOOooOOoo = AbstractC34039OooOooO.OooOOoo(abstractC34039OooOooO);
        C34118OooO0oO c34118OooO0oO = new C34118OooO0oO();
        c34118OooO0oO.f122622Oooo000 = null;
        Enumeration enumerationOooOo0O = abstractC34039OooOooOOooOOoo.OooOo0O();
        C34029OooOOo0 c34029OooOOo0 = (C34029OooOOo0) enumerationOooOo0O.nextElement();
        int iOooOo0 = c34029OooOOo0.OooOo0();
        if (iOooOo0 < 0 || iOooOo0 > 1) {
            throw new IllegalArgumentException("wrong version for RSA private key");
        }
        c34118OooO0oO.f122614OooOo0o = c34029OooOOo0.OooOOo();
        c34118OooO0oO.f122613OooOo = ((C34029OooOOo0) enumerationOooOo0O.nextElement()).OooOOo();
        c34118OooO0oO.f122616OooOoO0 = ((C34029OooOOo0) enumerationOooOo0O.nextElement()).OooOOo();
        c34118OooO0oO.f122615OooOoO = ((C34029OooOOo0) enumerationOooOo0O.nextElement()).OooOOo();
        c34118OooO0oO.f122617OooOoOO = ((C34029OooOOo0) enumerationOooOo0O.nextElement()).OooOOo();
        c34118OooO0oO.f122619OooOoo0 = ((C34029OooOOo0) enumerationOooOo0O.nextElement()).OooOOo();
        c34118OooO0oO.f122618OooOoo = ((C34029OooOOo0) enumerationOooOo0O.nextElement()).OooOOo();
        c34118OooO0oO.f122620OooOooO = ((C34029OooOOo0) enumerationOooOo0O.nextElement()).OooOOo();
        c34118OooO0oO.f122621OooOooo = ((C34029OooOOo0) enumerationOooOo0O.nextElement()).OooOOo();
        if (enumerationOooOo0O.hasMoreElements()) {
            c34118OooO0oO.f122622Oooo000 = (AbstractC34039OooOooO) enumerationOooOo0O.nextElement();
        }
        return c34118OooO0oO;
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo(10);
        c34020OooO0oo.OooO00o(new C34029OooOOo0(this.f122614OooOo0o));
        c34020OooO0oo.OooO00o(new C34029OooOOo0(this.f122613OooOo));
        c34020OooO0oo.OooO00o(new C34029OooOOo0(this.f122616OooOoO0));
        c34020OooO0oo.OooO00o(new C34029OooOOo0(this.f122615OooOoO));
        c34020OooO0oo.OooO00o(new C34029OooOOo0(this.f122617OooOoOO));
        c34020OooO0oo.OooO00o(new C34029OooOOo0(this.f122619OooOoo0));
        c34020OooO0oo.OooO00o(new C34029OooOOo0(this.f122618OooOoo));
        c34020OooO0oo.OooO00o(new C34029OooOOo0(this.f122620OooOooO));
        c34020OooO0oo.OooO00o(new C34029OooOOo0(this.f122621OooOooo));
        AbstractC34039OooOooO abstractC34039OooOooO = this.f122622Oooo000;
        if (abstractC34039OooOooO != null) {
            c34020OooO0oo.OooO00o(abstractC34039OooOooO);
        }
        return new o00oO0O(c34020OooO0oo);
    }
}
