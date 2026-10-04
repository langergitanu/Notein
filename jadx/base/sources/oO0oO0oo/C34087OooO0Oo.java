package oO0oO0oo;

import oO0oO0Oo.AbstractC34033OooOo0o;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.AbstractC34040OooOooo;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34029OooOOo0;
import oO0oO0Oo.C34032OooOo0O;
import oO0oO0Oo.C34055OoooOOO;
import oO0oO0Oo.C34079o0ooOoO;
import oO0oO0Oo.InterfaceC34019OooO0oO;
import oO0oO0Oo.Oooo0;
import oO0oOo0.C34142OooO00o;

/* JADX INFO: renamed from: oO0oO0oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34087OooO0Oo extends oO0oO0Oo.OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C34094OooOO0o f122478OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C34029OooOOo0 f122479OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C34086OooO0OO f122480OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public AbstractC34040OooOooo f122481OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public AbstractC34040OooOooo f122482OooOoOO;

    public static C34087OooO0Oo OooO0oo(InterfaceC34019OooO0oO interfaceC34019OooO0oO) {
        int i;
        C34094OooOO0o c34094OooOO0o;
        if (interfaceC34019OooO0oO instanceof C34087OooO0Oo) {
            return (C34087OooO0Oo) interfaceC34019OooO0oO;
        }
        C34086OooO0OO c34086OooO0OO = null;
        if (interfaceC34019OooO0oO == null) {
            return null;
        }
        AbstractC34039OooOooO abstractC34039OooOooOOooOOoo = AbstractC34039OooOooO.OooOOoo(interfaceC34019OooO0oO);
        C34087OooO0Oo c34087OooO0Oo = new C34087OooO0Oo();
        c34087OooO0Oo.f122479OooOo0o = (C34029OooOOo0) abstractC34039OooOooOOooOOoo.OooOo0(0);
        InterfaceC34019OooO0oO interfaceC34019OooO0oOOooOo0 = abstractC34039OooOooOOooOOoo.OooOo0(1);
        boolean z = interfaceC34019OooO0oOOooOo0 instanceof Oooo0;
        AbstractC34040OooOooo.OooO00o oooO00o = AbstractC34040OooOooo.f122374OooOoO0;
        if (z) {
            AbstractC34039OooOooO abstractC34039OooOooOOooOo00 = AbstractC34039OooOooO.OooOo00((Oooo0) interfaceC34019OooO0oOOooOo0, false);
            if (abstractC34039OooOooOOooOo00 != null) {
                AbstractC34039OooOooO abstractC34039OooOooOOooOOoo2 = AbstractC34039OooOooO.OooOOoo(abstractC34039OooOooOOooOo00);
                c34094OooOO0o = new C34094OooOO0o();
                int size = abstractC34039OooOooOOooOOoo2.size();
                if (size != 0) {
                    if (size == 1) {
                        Oooo0 oooo0 = (Oooo0) abstractC34039OooOooOOooOOoo2.OooOo0(0);
                        int i2 = oooo0.f122380OooOoO0;
                        if (i2 == 0) {
                            c34094OooOO0o.f122500OooOo0o = (AbstractC34040OooOooo) oooO00o.OooO0o0(oooo0, false);
                        } else {
                            if (i2 != 1) {
                                throw new IllegalArgumentException("Bad tag in OriginatorInfo: " + oooo0.f122380OooOoO0);
                            }
                            c34094OooOO0o.f122499OooOo = (AbstractC34040OooOooo) oooO00o.OooO0o0(oooo0, false);
                        }
                    } else {
                        if (size != 2) {
                            throw new IllegalArgumentException("OriginatorInfo too big");
                        }
                        c34094OooOO0o.f122500OooOo0o = (AbstractC34040OooOooo) oooO00o.OooO0o0((Oooo0) abstractC34039OooOooOOooOOoo2.OooOo0(0), false);
                        c34094OooOO0o.f122499OooOo = (AbstractC34040OooOooo) oooO00o.OooO0o0((Oooo0) abstractC34039OooOooOOooOOoo2.OooOo0(1), false);
                    }
                }
            } else {
                c34094OooOO0o = null;
            }
            c34087OooO0Oo.f122478OooOo = c34094OooOO0o;
            interfaceC34019OooO0oOOooOo0 = abstractC34039OooOooOOooOOoo.OooOo0(2);
            i = 3;
        } else {
            i = 2;
        }
        c34087OooO0Oo.f122481OooOoO0 = AbstractC34040OooOooo.OooOOo(interfaceC34019OooO0oOOooOo0);
        int i3 = i + 1;
        InterfaceC34019OooO0oO interfaceC34019OooO0oOOooOo02 = abstractC34039OooOooOOooOOoo.OooOo0(i);
        if (interfaceC34019OooO0oOOooOo02 instanceof C34086OooO0OO) {
            c34086OooO0OO = (C34086OooO0OO) interfaceC34019OooO0oOOooOo02;
        } else if (interfaceC34019OooO0oOOooOo02 != null) {
            AbstractC34039OooOooO abstractC34039OooOooOOooOOoo3 = AbstractC34039OooOooO.OooOOoo(interfaceC34019OooO0oOOooOo02);
            c34086OooO0OO = new C34086OooO0OO();
            if (abstractC34039OooOooOOooOOoo3.size() < 2) {
                throw new IllegalArgumentException("Truncated Sequence Found");
            }
            c34086OooO0OO.f122476OooOo0o = (C34032OooOo0O) abstractC34039OooOooOOooOOoo3.OooOo0(0);
            c34086OooO0OO.f122475OooOo = C34142OooO00o.OooO0oo(abstractC34039OooOooOOooOOoo3.OooOo0(1));
            if (abstractC34039OooOooOOooOOoo3.size() > 2) {
                c34086OooO0OO.f122477OooOoO0 = AbstractC34033OooOo0o.OooOOo((Oooo0) abstractC34039OooOooOOooOOoo3.OooOo0(2), false);
            }
        }
        c34087OooO0Oo.f122480OooOoO = c34086OooO0OO;
        if (abstractC34039OooOooOOooOOoo.size() > i3) {
            c34087OooO0Oo.f122482OooOoOO = (AbstractC34040OooOooo) oooO00o.OooO0o0((Oooo0) abstractC34039OooOooOOooOOoo.OooOo0(i3), false);
        }
        return c34087OooO0Oo;
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo(5);
        c34020OooO0oo.OooO00o(this.f122479OooOo0o);
        C34094OooOO0o c34094OooOO0o = this.f122478OooOo;
        if (c34094OooOO0o != null) {
            c34020OooO0oo.OooO00o(new C34079o0ooOoO(false, 0, c34094OooOO0o));
        }
        c34020OooO0oo.OooO00o(this.f122481OooOoO0);
        c34020OooO0oo.OooO00o(this.f122480OooOoO);
        AbstractC34040OooOooo abstractC34040OooOooo = this.f122482OooOoOO;
        if (abstractC34040OooOooo != null) {
            c34020OooO0oo.OooO00o(new C34079o0ooOoO(false, 1, abstractC34040OooOooo));
        }
        return new C34055OoooOOO(c34020OooO0oo);
    }
}
