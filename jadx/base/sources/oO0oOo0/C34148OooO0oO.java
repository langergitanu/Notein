package oO0oOo0;

import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34025OooOOO0;
import oO0oO0Oo.C34029OooOOo0;
import oO0oO0Oo.C34044Oooo0O0;
import oO0oO0Oo.C34066Oooooo0;
import oO0oO0Oo.InterfaceC34019OooO0oO;
import oO0oO0Oo.Oooo0;
import oO0oO0Oo.o00oO0O;
import oO0oOOoo.C34135OooO0OO;

/* JADX INFO: renamed from: oO0oOo0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34148OooO0oO extends oO0oO0Oo.OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C34142OooO00o f122703OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C34161OooOo0 f122704OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f122705OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C34066Oooooo0 f122706OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f122707OooOoOO;

    public static C34148OooO0oO OooO0oo(Object obj) {
        if (obj instanceof C34148OooO0oO) {
            return (C34148OooO0oO) obj;
        }
        C34161OooOo0 c34161OooOo0 = null;
        if (obj == null) {
            return null;
        }
        AbstractC34039OooOooO abstractC34039OooOooOOooOOoo = AbstractC34039OooOooO.OooOOoo(obj);
        C34148OooO0oO c34148OooO0oO = new C34148OooO0oO();
        int i = 0;
        c34148OooO0oO.f122705OooOoO = false;
        if (abstractC34039OooOooOOooOOoo.size() != 3) {
            throw new IllegalArgumentException("sequence wrong size for CertificateList");
        }
        InterfaceC34019OooO0oO interfaceC34019OooO0oOOooOo0 = abstractC34039OooOooOOooOOoo.OooOo0(0);
        if (interfaceC34019OooO0oOOooOo0 instanceof C34161OooOo0) {
            c34161OooOo0 = (C34161OooOo0) interfaceC34019OooO0oOOooOo0;
        } else if (interfaceC34019OooO0oOOooOo0 != null) {
            AbstractC34039OooOooO abstractC34039OooOooOOooOOoo2 = AbstractC34039OooOooO.OooOOoo(interfaceC34019OooO0oOOooOo0);
            C34161OooOo0 c34161OooOo02 = new C34161OooOo0();
            if (abstractC34039OooOooOOooOOoo2.size() < 3 || abstractC34039OooOooOOooOOoo2.size() > 7) {
                throw new IllegalArgumentException("Bad sequence size: " + abstractC34039OooOooOOooOOoo2.size());
            }
            if (abstractC34039OooOooOOooOOoo2.OooOo0(0) instanceof C34029OooOOo0) {
                c34161OooOo02.f122744OooOo0o = C34029OooOOo0.OooOOo0(abstractC34039OooOooOOooOOoo2.OooOo0(0));
                i = 1;
            } else {
                c34161OooOo02.f122744OooOo0o = null;
            }
            c34161OooOo02.f122743OooOo = C34142OooO00o.OooO0oo(abstractC34039OooOooOOooOOoo2.OooOo0(i));
            c34161OooOo02.f122746OooOoO0 = C34135OooO0OO.OooO0oo(abstractC34039OooOooOOooOOoo2.OooOo0(i + 1));
            int i2 = i + 3;
            c34161OooOo02.f122745OooOoO = C34164OooOo0o.OooO0oo(abstractC34039OooOooOOooOOoo2.OooOo0(i + 2));
            if (i2 < abstractC34039OooOooOOooOOoo2.size() && ((abstractC34039OooOooOOooOOoo2.OooOo0(i2) instanceof C34044Oooo0O0) || (abstractC34039OooOooOOooOOoo2.OooOo0(i2) instanceof C34025OooOOO0) || (abstractC34039OooOooOOooOOoo2.OooOo0(i2) instanceof C34164OooOo0o))) {
                c34161OooOo02.f122747OooOoOO = C34164OooOo0o.OooO0oo(abstractC34039OooOooOOooOOoo2.OooOo0(i2));
                i2 = i + 4;
            }
            if (i2 < abstractC34039OooOooOOooOOoo2.size() && !(abstractC34039OooOooOOooOOoo2.OooOo0(i2) instanceof Oooo0)) {
                c34161OooOo02.f122749OooOoo0 = AbstractC34039OooOooO.OooOOoo(abstractC34039OooOooOOooOOoo2.OooOo0(i2));
                i2++;
            }
            if (i2 < abstractC34039OooOooOOooOOoo2.size() && (abstractC34039OooOooOOooOOoo2.OooOo0(i2) instanceof Oooo0)) {
                c34161OooOo02.f122748OooOoo = C34151OooOO0O.OooO0oo(AbstractC34039OooOooO.OooOo00((Oooo0) abstractC34039OooOooOOooOOoo2.OooOo0(i2), true));
            }
            c34161OooOo0 = c34161OooOo02;
        }
        c34148OooO0oO.f122704OooOo0o = c34161OooOo0;
        c34148OooO0oO.f122703OooOo = C34142OooO00o.OooO0oo(abstractC34039OooOooOOooOOoo.OooOo0(1));
        c34148OooO0oO.f122706OooOoO0 = C34066Oooooo0.OooOo0(abstractC34039OooOooOOooOOoo.OooOo0(2));
        return c34148OooO0oO;
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo(3);
        c34020OooO0oo.OooO00o(this.f122704OooOo0o);
        c34020OooO0oo.OooO00o(this.f122703OooOo);
        c34020OooO0oo.OooO00o(this.f122706OooOoO0);
        return new o00oO0O(c34020OooO0oo);
    }

    @Override // oO0oO0Oo.OooOo00
    public final int hashCode() {
        if (!this.f122705OooOoO) {
            this.f122707OooOoOO = super.hashCode();
            this.f122705OooOoO = true;
        }
        return this.f122707OooOoOO;
    }
}
