package oO0oOOOO;

import java.util.NoSuchElementException;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.AbstractC34040OooOooo;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34029OooOOo0;
import oO0oO0Oo.C34032OooOo0O;
import oO0oO0Oo.C34066Oooooo0;
import oO0oO0Oo.InterfaceC34019OooO0oO;
import oO0oO0Oo.OooOo00;
import oO0oO0Oo.Oooo0;
import oO0oO0Oo.o00oO0O;
import oO0oOOoo.C34135OooO0OO;
import oO0oOo0.C34142OooO00o;
import oO0oOo0.C34162OooOo00;

/* JADX INFO: renamed from: oO0oOOOO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34113OooO0O0 extends OooOo00 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C34114OooO0OO f122576OooOo0o = null;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C34142OooO00o f122575OooOo = null;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C34066Oooooo0 f122577OooOoO0 = null;

    public static C34113OooO0O0 OooO0oo(AbstractC34036OooOoOO abstractC34036OooOoOO) {
        C34112OooO00o c34112OooO00o;
        C34114OooO0OO c34114OooO0OO = null;
        if (abstractC34036OooOoOO == null) {
            return null;
        }
        AbstractC34039OooOooO abstractC34039OooOooOOooOOoo = AbstractC34039OooOooO.OooOOoo(abstractC34036OooOoOO);
        C34113OooO0O0 c34113OooO0O0 = new C34113OooO0O0();
        c34113OooO0O0.f122576OooOo0o = null;
        c34113OooO0O0.f122575OooOo = null;
        c34113OooO0O0.f122577OooOoO0 = null;
        InterfaceC34019OooO0oO interfaceC34019OooO0oOOooOo0 = abstractC34039OooOooOOooOOoo.OooOo0(0);
        if (interfaceC34019OooO0oOOooOo0 instanceof C34114OooO0OO) {
            c34114OooO0OO = (C34114OooO0OO) interfaceC34019OooO0oOOooOo0;
        } else if (interfaceC34019OooO0oOOooOo0 != null) {
            AbstractC34039OooOooO abstractC34039OooOooOOooOOoo2 = AbstractC34039OooOooO.OooOOoo(interfaceC34019OooO0oOOooOo0);
            C34114OooO0OO c34114OooO0OO2 = new C34114OooO0OO();
            c34114OooO0OO2.f122579OooOo0o = new C34029OooOOo0(0L);
            c34114OooO0OO2.f122580OooOoO = null;
            c34114OooO0OO2.f122579OooOo0o = (C34029OooOOo0) abstractC34039OooOooOOooOOoo2.OooOo0(0);
            c34114OooO0OO2.f122578OooOo = C34135OooO0OO.OooO0oo(abstractC34039OooOooOOooOOoo2.OooOo0(1));
            c34114OooO0OO2.f122581OooOoO0 = C34162OooOo00.OooO0oo(abstractC34039OooOooOOooOOoo2.OooOo0(2));
            if (abstractC34039OooOooOOooOOoo2.size() > 3) {
                c34114OooO0OO2.f122580OooOoO = (AbstractC34040OooOooo) AbstractC34040OooOooo.f122374OooOoO0.OooO0o0((Oooo0) abstractC34039OooOooOOooOOoo2.OooOo0(3), false);
            }
            AbstractC34040OooOooo abstractC34040OooOooo = c34114OooO0OO2.f122580OooOoO;
            if (abstractC34040OooOooo != null) {
                int i = 0;
                while (true) {
                    InterfaceC34019OooO0oO[] interfaceC34019OooO0oOArr = abstractC34040OooOooo.f122376OooOo0o;
                    if (i >= interfaceC34019OooO0oOArr.length) {
                        break;
                    }
                    if (i >= interfaceC34019OooO0oOArr.length) {
                        throw new NoSuchElementException();
                    }
                    int i2 = i + 1;
                    InterfaceC34019OooO0oO interfaceC34019OooO0oO = interfaceC34019OooO0oOArr[i];
                    if (interfaceC34019OooO0oO == null || (interfaceC34019OooO0oO instanceof C34112OooO00o)) {
                        c34112OooO00o = (C34112OooO00o) interfaceC34019OooO0oO;
                    } else {
                        if (!(interfaceC34019OooO0oO instanceof AbstractC34039OooOooO)) {
                            throw new IllegalArgumentException("unknown object in factory: ".concat(interfaceC34019OooO0oO.getClass().getName()));
                        }
                        AbstractC34039OooOooO abstractC34039OooOooO = (AbstractC34039OooOooO) interfaceC34019OooO0oO;
                        c34112OooO00o = new C34112OooO00o();
                        c34112OooO00o.f122574OooOo0o = (C34032OooOo0O) abstractC34039OooOooO.OooOo0(0);
                        c34112OooO00o.f122573OooOo = (AbstractC34040OooOooo) abstractC34039OooOooO.OooOo0(1);
                    }
                    if (c34112OooO00o.f122574OooOo0o.OooOO0o(InterfaceC34117OooO0o0.f122610OooOo00) && c34112OooO00o.f122573OooOo.f122376OooOo0o.length != 1) {
                        throw new IllegalArgumentException("challengePassword attribute must have one value");
                    }
                    i = i2;
                }
            }
            if (c34114OooO0OO2.f122578OooOo == null || c34114OooO0OO2.f122579OooOo0o == null || c34114OooO0OO2.f122581OooOoO0 == null) {
                throw new IllegalArgumentException("Not all mandatory fields set in CertificationRequestInfo generator.");
            }
            c34114OooO0OO = c34114OooO0OO2;
        }
        c34113OooO0O0.f122576OooOo0o = c34114OooO0OO;
        c34113OooO0O0.f122575OooOo = C34142OooO00o.OooO0oo(abstractC34039OooOooOOooOOoo.OooOo0(1));
        c34113OooO0O0.f122577OooOoO0 = (C34066Oooooo0) abstractC34039OooOooOOooOOoo.OooOo0(2);
        return c34113OooO0O0;
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo(3);
        c34020OooO0oo.OooO00o(this.f122576OooOo0o);
        c34020OooO0oo.OooO00o(this.f122575OooOo);
        c34020OooO0oo.OooO00o(this.f122577OooOoO0);
        return new o00oO0O(c34020OooO0oo);
    }
}
