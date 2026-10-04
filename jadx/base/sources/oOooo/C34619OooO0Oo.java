package oOooo;

import oO0oO0Oo.AbstractC34033OooOo0o;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34032OooOo0O;
import oO0oO0Oo.C34075o00o0O;
import oO0oO0Oo.C34079o0ooOoO;
import oO0oO0Oo.OooOo00;
import oO0oO0Oo.Oooo0;
import oO0oO0Oo.o00oO0O;
import oO0oOo0.C34162OooOo00;

/* JADX INFO: renamed from: oOooo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34619OooO0Oo extends OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C34162OooOo00 f124014OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C34032OooOo0O f124015OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final byte[] f124016OooOoO0;

    public C34619OooO0Oo(AbstractC34039OooOooO abstractC34039OooOooO) {
        if (abstractC34039OooOooO.size() == 2) {
            this.f124015OooOo0o = C34032OooOo0O.OooOo0(abstractC34039OooOooO.OooOo0(0));
            this.f124016OooOoO0 = AbstractC34033OooOo0o.OooOOo0(abstractC34039OooOooO.OooOo0(1)).f122362OooOo0o;
            this.f124014OooOo = null;
        } else {
            if (abstractC34039OooOooO.size() != 3) {
                throw new IllegalArgumentException("unknown sequence length: " + abstractC34039OooOooO.size());
            }
            this.f124015OooOo0o = C34032OooOo0O.OooOo0(abstractC34039OooOooO.OooOo0(0));
            this.f124014OooOo = C34162OooOo00.OooO0oo(AbstractC34039OooOooO.OooOo00(Oooo0.OooOOoo(abstractC34039OooOooO.OooOo0(1)), false));
            this.f124016OooOoO0 = AbstractC34033OooOo0o.OooOOo0(abstractC34039OooOooO.OooOo0(2)).f122362OooOo0o;
        }
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo(3);
        c34020OooO0oo.OooO00o(this.f124015OooOo0o);
        C34162OooOo00 c34162OooOo00 = this.f124014OooOo;
        if (c34162OooOo00 != null) {
            c34020OooO0oo.OooO00o(new C34079o0ooOoO(false, 0, c34162OooOo00));
        }
        c34020OooO0oo.OooO00o(new C34075o00o0O(this.f124016OooOoO0));
        return new o00oO0O(c34020OooO0oo);
    }
}
