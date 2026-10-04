package oO0oOOOO;

import java.math.BigInteger;
import java.util.Enumeration;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34029OooOOo0;
import oO0oO0Oo.OooOo00;
import oO0oO0Oo.o00oO0O;

/* JADX INFO: renamed from: oO0oOOOO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34119OooO0oo extends OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public BigInteger f122623OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public BigInteger f122624OooOo0o;

    public static C34119OooO0oo OooO0oo(Object obj) {
        if (obj instanceof C34119OooO0oo) {
            return (C34119OooO0oo) obj;
        }
        if (obj == null) {
            return null;
        }
        AbstractC34039OooOooO abstractC34039OooOooOOooOOoo = AbstractC34039OooOooO.OooOOoo(obj);
        C34119OooO0oo c34119OooO0oo = new C34119OooO0oo();
        if (abstractC34039OooOooOOooOOoo.size() != 2) {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC34039OooOooOOooOOoo.size());
        }
        Enumeration enumerationOooOo0O = abstractC34039OooOooOOooOOoo.OooOo0O();
        C34029OooOOo0 c34029OooOOo0OooOOo0 = C34029OooOOo0.OooOOo0(enumerationOooOo0O.nextElement());
        c34029OooOOo0OooOOo0.getClass();
        c34119OooO0oo.f122624OooOo0o = new BigInteger(1, c34029OooOOo0OooOOo0.f122349OooOo0o);
        C34029OooOOo0 c34029OooOOo0OooOOo02 = C34029OooOOo0.OooOOo0(enumerationOooOo0O.nextElement());
        c34029OooOOo0OooOOo02.getClass();
        c34119OooO0oo.f122623OooOo = new BigInteger(1, c34029OooOOo0OooOOo02.f122349OooOo0o);
        return c34119OooO0oo;
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo(2);
        c34020OooO0oo.OooO00o(new C34029OooOOo0(this.f122624OooOo0o));
        c34020OooO0oo.OooO00o(new C34029OooOOo0(this.f122623OooOo));
        return new o00oO0O(c34020OooO0oo);
    }
}
