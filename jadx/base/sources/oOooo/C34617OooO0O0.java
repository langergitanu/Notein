package oOooo;

import oO0oO0Oo.AbstractC34033OooOo0o;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34075o00o0O;
import oO0oO0Oo.C34079o0ooOoO;
import oO0oO0Oo.OooOo00;
import oO0oO0Oo.Oooo0;
import oO0oO0Oo.o00oO0O;
import oOO000oO.C34332OooO00o;

/* JADX INFO: renamed from: oOooo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34617OooO0O0 extends OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final byte[] f124009OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final byte[] f124010OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final byte[] f124011OooOoO0;

    public C34617OooO0O0(AbstractC34039OooOooO abstractC34039OooOooO) {
        if (abstractC34039OooOooO.size() == 2) {
            this.f124010OooOo0o = C34332OooO00o.OooO00o(AbstractC34033OooOo0o.OooOOo0(abstractC34039OooOooO.OooOo0(0)).f122362OooOo0o);
            this.f124011OooOoO0 = C34332OooO00o.OooO00o(AbstractC34033OooOo0o.OooOOo0(abstractC34039OooOooO.OooOo0(1)).f122362OooOo0o);
            this.f124009OooOo = null;
        } else {
            if (abstractC34039OooOooO.size() != 3) {
                throw new IllegalArgumentException("unknown sequence length: " + abstractC34039OooOooO.size());
            }
            this.f124010OooOo0o = C34332OooO00o.OooO00o(AbstractC34033OooOo0o.OooOOo0(abstractC34039OooOooO.OooOo0(0)).f122362OooOo0o);
            this.f124009OooOo = C34332OooO00o.OooO00o(AbstractC34033OooOo0o.OooOOo(Oooo0.OooOOoo(abstractC34039OooOooO.OooOo0(1)), false).f122362OooOo0o);
            this.f124011OooOoO0 = C34332OooO00o.OooO00o(AbstractC34033OooOo0o.OooOOo0(abstractC34039OooOooO.OooOo0(2)).f122362OooOo0o);
        }
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo(3);
        byte[] bArr = this.f124010OooOo0o;
        c34020OooO0oo.OooO00o(new C34075o00o0O(bArr));
        if (this.f124009OooOo != null) {
            c34020OooO0oo.OooO00o(new C34079o0ooOoO(false, 0, new C34075o00o0O(bArr)));
        }
        c34020OooO0oo.OooO00o(new C34075o00o0O(this.f124011OooOoO0));
        return new o00oO0O(c34020OooO0oo);
    }
}
