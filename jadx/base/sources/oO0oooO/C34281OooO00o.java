package oO0oooO;

import oO0oO0Oo.AbstractC34033OooOo0o;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34029OooOOo0;
import oO0oO0Oo.C34075o00o0O;
import oO0oO0Oo.OooOo00;
import oO0oO0Oo.o00oO0O;
import oO0oOo0.C34142OooO00o;
import oOO000o.C34328OooO0Oo;
import oOO000o.C34329OooO0o0;

/* JADX INFO: renamed from: oO0oooO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34281OooO00o extends OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f123062OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f123063OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public byte[] f123064OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public byte[] f123065OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public byte[] f123066OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public C34142OooO00o f123067OooOoo0;

    public C34281OooO00o(int i, int i2, oOO000o.OooO0O0 oooO0O0, C34329OooO0o0 c34329OooO0o0, C34328OooO0Oo c34328OooO0Oo, C34142OooO00o c34142OooO00o) {
        this.f123063OooOo0o = i;
        this.f123062OooOo = i2;
        int i3 = oooO0O0.f123239OooO0O0;
        this.f123065OooOoO0 = new byte[]{(byte) i3, (byte) (i3 >>> 8), (byte) (i3 >>> 16), (byte) (i3 >>> 24)};
        this.f123064OooOoO = c34329OooO0o0.OooO0o0();
        this.f123066OooOoOO = c34328OooO0Oo.OooO00o();
        this.f123067OooOoo0 = c34142OooO00o;
    }

    public static C34281OooO00o OooO0oo(AbstractC34036OooOoOO abstractC34036OooOoOO) {
        if (abstractC34036OooOoOO == null) {
            return null;
        }
        AbstractC34039OooOooO abstractC34039OooOooOOooOOoo = AbstractC34039OooOooO.OooOOoo(abstractC34036OooOoOO);
        C34281OooO00o c34281OooO00o = new C34281OooO00o();
        c34281OooO00o.f123063OooOo0o = ((C34029OooOOo0) abstractC34039OooOooOOooOOoo.OooOo0(0)).OooOo0();
        c34281OooO00o.f123062OooOo = ((C34029OooOOo0) abstractC34039OooOooOOooOOoo.OooOo0(1)).OooOo0();
        c34281OooO00o.f123065OooOoO0 = ((AbstractC34033OooOo0o) abstractC34039OooOooOOooOOoo.OooOo0(2)).f122362OooOo0o;
        c34281OooO00o.f123064OooOoO = ((AbstractC34033OooOo0o) abstractC34039OooOooOOooOOoo.OooOo0(3)).f122362OooOo0o;
        c34281OooO00o.f123066OooOoOO = ((AbstractC34033OooOo0o) abstractC34039OooOooOOooOOoo.OooOo0(4)).f122362OooOo0o;
        c34281OooO00o.f123067OooOoo0 = C34142OooO00o.OooO0oo(abstractC34039OooOooOOooOOoo.OooOo0(5));
        return c34281OooO00o;
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo();
        c34020OooO0oo.OooO00o(new C34029OooOOo0(this.f123063OooOo0o));
        c34020OooO0oo.OooO00o(new C34029OooOOo0(this.f123062OooOo));
        c34020OooO0oo.OooO00o(new C34075o00o0O(this.f123065OooOoO0));
        c34020OooO0oo.OooO00o(new C34075o00o0O(this.f123064OooOoO));
        c34020OooO0oo.OooO00o(new C34075o00o0O(this.f123066OooOoOO));
        c34020OooO0oo.OooO00o(this.f123067OooOoo0);
        return new o00oO0O(c34020OooO0oo);
    }
}
