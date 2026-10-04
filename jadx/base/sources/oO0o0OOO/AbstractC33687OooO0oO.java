package oO0o0OOO;

import o000o0o.C24613OooO0OO;
import oO0o0OO.AbstractC33630OooOooO;
import oO0o0OO.C33640Oooo0o0;
import oO0o0OO.C33641Oooo0oO;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33645OoooO00;
import oO0o0OO.InterfaceC33651OoooOoO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0OOO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33687OooO0oO extends AbstractC33630OooOooO implements InterfaceC33645OoooO00 {
    public InterfaceC33651OoooOoO OooOooo(long j, Runnable runnable, InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        return C33641Oooo0oO.f121324OooO00o.OooOooo(j, runnable, interfaceC34415OooO0oo);
    }

    @Override // oO0o0OO.AbstractC33630OooOooO
    public AbstractC33630OooOooO o000OOo0(int i) {
        C24613OooO0OO.OooO0O0(1);
        return this;
    }

    public abstract AbstractC33687OooO0oO o000OOoO();

    @Override // oO0o0OO.AbstractC33630OooOooO
    public String toString() {
        AbstractC33687OooO0oO abstractC33687OooO0oOO000OOoO;
        String str;
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        AbstractC33687OooO0oO abstractC33687OooO0oO = C33833OooOOOO.f121946OooO00o;
        if (this == abstractC33687OooO0oO) {
            str = "Dispatchers.Main";
        } else {
            try {
                abstractC33687OooO0oOO000OOoO = abstractC33687OooO0oO.o000OOoO();
            } catch (UnsupportedOperationException unused) {
                abstractC33687OooO0oOO000OOoO = null;
            }
            str = this == abstractC33687OooO0oOO000OOoO ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + C33640Oooo0o0.OooO00o(this);
    }
}
