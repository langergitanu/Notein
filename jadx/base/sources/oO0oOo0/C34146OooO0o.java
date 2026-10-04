package oO0oOo0;

import oO0oO0Oo.AbstractC34015OooO0OO;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.C34029OooOOo0;
import oO0oO0Oo.C34066Oooooo0;
import oO0oO0Oo.InterfaceC34019OooO0oO;
import oO0oO0Oo.Oooo0;
import oO0oOOoo.C34135OooO0OO;

/* JADX INFO: renamed from: oO0oOo0.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34146OooO0o extends oO0oO0Oo.OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C34163OooOo0O f122692OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public AbstractC34039OooOooO f122693OooOo0o;

    public static C34146OooO0o OooO0oo(Object obj) {
        int i;
        boolean z;
        boolean z2;
        if (obj instanceof C34146OooO0o) {
            return (C34146OooO0o) obj;
        }
        C34163OooOo0O c34163OooOo0O = null;
        if (obj == null) {
            return null;
        }
        AbstractC34039OooOooO abstractC34039OooOooOOooOOoo = AbstractC34039OooOooO.OooOOoo(obj);
        C34146OooO0o c34146OooO0o = new C34146OooO0o();
        c34146OooO0o.f122693OooOo0o = abstractC34039OooOooOOooOOoo;
        if (abstractC34039OooOooOOooOOoo.size() != 3) {
            throw new IllegalArgumentException("sequence wrong size for a certificate");
        }
        InterfaceC34019OooO0oO interfaceC34019OooO0oOOooOo0 = abstractC34039OooOooOOooOOoo.OooOo0(0);
        if (interfaceC34019OooO0oOOooOo0 instanceof C34163OooOo0O) {
            c34163OooOo0O = (C34163OooOo0O) interfaceC34019OooO0oOOooOo0;
        } else if (interfaceC34019OooO0oOOooOo0 != null) {
            AbstractC34039OooOooO abstractC34039OooOooOOooOOoo2 = AbstractC34039OooOooO.OooOOoo(interfaceC34019OooO0oOOooOo0);
            c34163OooOo0O = new C34163OooOo0O();
            c34163OooOo0O.f122753OooOo0o = abstractC34039OooOooOOooOOoo2;
            if (abstractC34039OooOooOOooOOoo2.OooOo0(0) instanceof Oooo0) {
                c34163OooOo0O.f122752OooOo = (C34029OooOOo0) C34029OooOOo0.f122347OooOoO0.OooO0o0((Oooo0) abstractC34039OooOooOOooOOoo2.OooOo0(0), true);
                i = 0;
            } else {
                c34163OooOo0O.f122752OooOo = new C34029OooOOo0(0L);
                i = -1;
            }
            if (c34163OooOo0O.f122752OooOo.OooOOoo(0)) {
                z2 = false;
                z = true;
            } else if (c34163OooOo0O.f122752OooOo.OooOOoo(1)) {
                z = false;
                z2 = true;
            } else {
                if (!c34163OooOo0O.f122752OooOo.OooOOoo(2)) {
                    throw new IllegalArgumentException("version number not recognised");
                }
                z = false;
                z2 = false;
            }
            c34163OooOo0O.f122755OooOoO0 = C34029OooOOo0.OooOOo0(abstractC34039OooOooOOooOOoo2.OooOo0(i + 1));
            c34163OooOo0O.f122754OooOoO = C34142OooO00o.OooO0oo(abstractC34039OooOooOOooOOoo2.OooOo0(i + 2));
            c34163OooOo0O.f122756OooOoOO = C34135OooO0OO.OooO0oo(abstractC34039OooOooOOooOOoo2.OooOo0(i + 3));
            AbstractC34039OooOooO abstractC34039OooOooO = (AbstractC34039OooOooO) abstractC34039OooOooOOooOOoo2.OooOo0(i + 4);
            c34163OooOo0O.f122758OooOoo0 = C34164OooOo0o.OooO0oo(abstractC34039OooOooO.OooOo0(0));
            c34163OooOo0O.f122757OooOoo = C34164OooOo0o.OooO0oo(abstractC34039OooOooO.OooOo0(1));
            c34163OooOo0O.f122759OooOooO = C34135OooO0OO.OooO0oo(abstractC34039OooOooOOooOOoo2.OooOo0(i + 5));
            int i2 = i + 6;
            c34163OooOo0O.f122760OooOooo = C34162OooOo00.OooO0oo(abstractC34039OooOooOOooOOoo2.OooOo0(i2));
            int size = (abstractC34039OooOooOOooOOoo2.size() - i2) - 1;
            if (size != 0 && z) {
                throw new IllegalArgumentException("version 1 certificate contains extra data");
            }
            while (size > 0) {
                Oooo0 oooo0 = (Oooo0) abstractC34039OooOooOOooOOoo2.OooOo0(i2 + size);
                int i3 = oooo0.f122380OooOoO0;
                if (i3 == 1) {
                    c34163OooOo0O.f122761Oooo000 = C34066Oooooo0.OooOo0O(oooo0);
                } else if (i3 == 2) {
                    c34163OooOo0O.f122762Oooo00O = C34066Oooooo0.OooOo0O(oooo0);
                } else {
                    if (i3 != 3) {
                        throw new IllegalArgumentException("Unknown tag encountered in structure: " + oooo0.f122380OooOoO0);
                    }
                    if (z2) {
                        throw new IllegalArgumentException("version 2 certificate cannot contain extensions");
                    }
                    c34163OooOo0O.f122763Oooo00o = C34151OooOO0O.OooO0oo((AbstractC34039OooOooO) AbstractC34039OooOooO.f122370OooOo.OooO0o0(oooo0, true));
                }
                size--;
            }
        }
        c34146OooO0o.f122692OooOo = c34163OooOo0O;
        C34142OooO00o.OooO0oo(abstractC34039OooOooOOooOOoo.OooOo0(1));
        AbstractC34015OooO0OO.OooOOoo(abstractC34039OooOooOOooOOoo.OooOo0(2));
        return c34146OooO0o;
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        return this.f122693OooOo0o;
    }
}
