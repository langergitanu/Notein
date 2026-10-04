package oO0oOo0;

import oO0oO0Oo.AbstractC34015OooO0OO;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34025OooOOO0;
import oO0oO0Oo.C34029OooOOo0;
import oO0oO0Oo.C34066Oooooo0;
import oO0oO0Oo.InterfaceC34019OooO0oO;
import oO0oO0Oo.Oooo0;
import oO0oO0Oo.o00oO0O;

/* JADX INFO: renamed from: oO0oOo0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34145OooO0Oo extends oO0oO0Oo.OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C34142OooO00o f122689OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C34147OooO0o0 f122690OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C34066Oooooo0 f122691OooOoO0;

    /* JADX WARN: Removed duplicated region for block: B:74:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C34145OooO0Oo OooO0oo(Object obj) {
        C34147OooO0o0 c34147OooO0o0;
        int i;
        C34144OooO0OO c34144OooO0OO;
        C34153OooOOO c34153OooOOO;
        InterfaceC34019OooO0oO interfaceC34019OooO0oOOooOo0;
        C34143OooO0O0 c34143OooO0O0;
        InterfaceC34019OooO0oO interfaceC34019OooO0oOOooOo02;
        C34144OooO0OO c34144OooO0OO2;
        int i2;
        if (obj instanceof C34145OooO0Oo) {
            return (C34145OooO0Oo) obj;
        }
        if (obj == null) {
            return null;
        }
        AbstractC34039OooOooO abstractC34039OooOooOOooOOoo = AbstractC34039OooOooO.OooOOoo(obj);
        C34145OooO0Oo c34145OooO0Oo = new C34145OooO0Oo();
        if (abstractC34039OooOooOOooOOoo.size() != 3) {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC34039OooOooOOooOOoo.size());
        }
        InterfaceC34019OooO0oO interfaceC34019OooO0oOOooOo03 = abstractC34039OooOooOOooOOoo.OooOo0(0);
        if (interfaceC34019OooO0oOOooOo03 instanceof C34147OooO0o0) {
            c34147OooO0o0 = (C34147OooO0o0) interfaceC34019OooO0oOOooOo03;
        } else if (interfaceC34019OooO0oOOooOo03 != null) {
            AbstractC34039OooOooO abstractC34039OooOooOOooOOoo2 = AbstractC34039OooOooO.OooOOoo(interfaceC34019OooO0oOOooOo03);
            C34147OooO0o0 c34147OooO0o02 = new C34147OooO0o0();
            char c = 6;
            if (abstractC34039OooOooOOooOOoo2.size() < 6 || abstractC34039OooOooOOooOOoo2.size() > 9) {
                throw new IllegalArgumentException("Bad sequence size: " + abstractC34039OooOooOOooOOoo2.size());
            }
            if (abstractC34039OooOooOOooOOoo2.OooOo0(0) instanceof C34029OooOOo0) {
                c34147OooO0o02.f122695OooOo0o = C34029OooOOo0.OooOOo0(abstractC34039OooOooOOooOOoo2.OooOo0(0));
                i = 1;
            } else {
                c34147OooO0o02.f122695OooOo0o = new C34029OooOOo0(0L);
                i = 0;
            }
            InterfaceC34019OooO0oO interfaceC34019OooO0oOOooOo04 = abstractC34039OooOooOOooOOoo2.OooOo0(i);
            boolean z = interfaceC34019OooO0oOOooOo04 instanceof C34153OooOOO;
            AbstractC34039OooOooO.OooO00o oooO00o = AbstractC34039OooOooO.f122370OooOo;
            if (z) {
                c34153OooOOO = (C34153OooOOO) interfaceC34019OooO0oOOooOo04;
            } else if (interfaceC34019OooO0oOOooOo04 instanceof Oooo0) {
                Oooo0 oooo0OooOOoo = Oooo0.OooOOoo(interfaceC34019OooO0oOOooOo04);
                C34153OooOOO c34153OooOOO2 = new C34153OooOOO();
                c34153OooOOO2.f122722OooOoO = 1;
                int i3 = oooo0OooOOoo.f122380OooOoO0;
                if (i3 == 0) {
                    c34153OooOOO2.f122721OooOo0o = C34155OooOOOO.OooO0oo(oooo0OooOOoo, true);
                } else {
                    if (i3 != 1) {
                        throw new IllegalArgumentException("unknown tag in Holder");
                    }
                    c34153OooOOO2.f122720OooOo = new C34154OooOOO0((AbstractC34039OooOooO) oooO00o.OooO0o0(oooo0OooOOoo, true));
                }
                c34153OooOOO2.f122722OooOoO = 0;
                c34153OooOOO = c34153OooOOO2;
            } else {
                if (interfaceC34019OooO0oOOooOo04 != null) {
                    AbstractC34039OooOooO abstractC34039OooOooOOooOOoo3 = AbstractC34039OooOooO.OooOOoo(interfaceC34019OooO0oOOooOo04);
                    C34153OooOOO c34153OooOOO3 = new C34153OooOOO();
                    c34153OooOOO3.f122722OooOoO = 1;
                    c34144OooO0OO = null;
                    if (abstractC34039OooOooOOooOOoo3.size() > 3) {
                        throw new IllegalArgumentException("Bad sequence size: " + abstractC34039OooOooOOooOOoo3.size());
                    }
                    int i4 = 0;
                    while (i4 != abstractC34039OooOooOOooOOoo3.size()) {
                        Oooo0 oooo0OooOOoo2 = Oooo0.OooOOoo(abstractC34039OooOooOOooOOoo3.OooOo0(i4));
                        char c2 = c;
                        int i5 = oooo0OooOOoo2.f122380OooOoO0;
                        if (i5 == 0) {
                            c34153OooOOO3.f122721OooOo0o = C34155OooOOOO.OooO0oo(oooo0OooOOoo2, false);
                        } else if (i5 == 1) {
                            c34153OooOOO3.f122720OooOo = new C34154OooOOO0((AbstractC34039OooOooO) oooO00o.OooO0o0(oooo0OooOOoo2, false));
                        } else {
                            if (i5 != 2) {
                                throw new IllegalArgumentException("unknown tag in Holder");
                            }
                            c34153OooOOO3.f122723OooOoO0 = C34158OooOOo0.OooO0oo(oooo0OooOOoo2);
                        }
                        i4++;
                        c = c2;
                    }
                    c34153OooOOO3.f122722OooOoO = 1;
                    c34153OooOOO = c34153OooOOO3;
                } else {
                    c34144OooO0OO = null;
                    c34153OooOOO = null;
                }
                c34147OooO0o02.f122694OooOo = c34153OooOOO;
                interfaceC34019OooO0oOOooOo0 = abstractC34039OooOooOOooOOoo2.OooOo0(i + 1);
                if (interfaceC34019OooO0oOOooOo0 != null || (interfaceC34019OooO0oOOooOo0 instanceof C34143OooO0O0)) {
                    c34143OooO0O0 = (C34143OooO0O0) interfaceC34019OooO0oOOooOo0;
                } else if (interfaceC34019OooO0oOOooOo0 instanceof C34160OooOo) {
                    c34143OooO0O0 = new C34143OooO0O0(C34160OooOo.OooO0oo(interfaceC34019OooO0oOOooOo0));
                } else if (interfaceC34019OooO0oOOooOo0 instanceof C34154OooOOO0) {
                    c34143OooO0O0 = new C34143OooO0O0((C34154OooOOO0) interfaceC34019OooO0oOOooOo0);
                } else if (interfaceC34019OooO0oOOooOo0 instanceof Oooo0) {
                    c34143OooO0O0 = new C34143OooO0O0(C34160OooOo.OooO0oo((AbstractC34039OooOooO) oooO00o.OooO0o0((Oooo0) interfaceC34019OooO0oOOooOo0, false)));
                } else {
                    if (!(interfaceC34019OooO0oOOooOo0 instanceof AbstractC34039OooOooO)) {
                        throw new IllegalArgumentException("unknown object in factory: ".concat(interfaceC34019OooO0oOOooOo0.getClass().getName()));
                    }
                    c34143OooO0O0 = new C34143OooO0O0(C34154OooOOO0.OooO0oo(interfaceC34019OooO0oOOooOo0));
                }
                c34147OooO0o02.f122697OooOoO0 = c34143OooO0O0;
                c34147OooO0o02.f122696OooOoO = C34142OooO00o.OooO0oo(abstractC34039OooOooOOooOOoo2.OooOo0(i + 2));
                c34147OooO0o02.f122698OooOoOO = C34029OooOOo0.OooOOo0(abstractC34039OooOooOOooOOoo2.OooOo0(i + 3));
                interfaceC34019OooO0oOOooOo02 = abstractC34039OooOooOOooOOoo2.OooOo0(i + 4);
                if (!(interfaceC34019OooO0oOOooOo02 instanceof C34144OooO0OO)) {
                    c34144OooO0OO2 = (C34144OooO0OO) interfaceC34019OooO0oOOooOo02;
                } else if (interfaceC34019OooO0oOOooOo02 != null) {
                    AbstractC34039OooOooO abstractC34039OooOooOOooOOoo4 = AbstractC34039OooOooO.OooOOoo(interfaceC34019OooO0oOOooOo02);
                    C34144OooO0OO c34144OooO0OO3 = new C34144OooO0OO();
                    if (abstractC34039OooOooOOooOOoo4.size() != 2) {
                        throw new IllegalArgumentException("Bad sequence size: " + abstractC34039OooOooOOooOOoo4.size());
                    }
                    c34144OooO0OO3.f122688OooOo0o = C34025OooOOO0.OooOOoo(abstractC34039OooOooOOooOOoo4.OooOo0(0));
                    c34144OooO0OO3.f122687OooOo = C34025OooOOO0.OooOOoo(abstractC34039OooOooOOooOOoo4.OooOo0(1));
                    c34144OooO0OO2 = c34144OooO0OO3;
                } else {
                    c34144OooO0OO2 = c34144OooO0OO;
                }
                c34147OooO0o02.f122700OooOoo0 = c34144OooO0OO2;
                c34147OooO0o02.f122699OooOoo = AbstractC34039OooOooO.OooOOoo(abstractC34039OooOooOOooOOoo2.OooOo0(i + 5));
                for (i2 = i + 6; i2 < abstractC34039OooOooOOooOOoo2.size(); i2++) {
                    InterfaceC34019OooO0oO interfaceC34019OooO0oOOooOo05 = abstractC34039OooOooOOooOOoo2.OooOo0(i2);
                    if (interfaceC34019OooO0oOOooOo05 instanceof AbstractC34015OooO0OO) {
                        c34147OooO0o02.f122701OooOooO = AbstractC34015OooO0OO.OooOOoo(abstractC34039OooOooOOooOOoo2.OooOo0(i2));
                    } else if ((interfaceC34019OooO0oOOooOo05 instanceof AbstractC34039OooOooO) || (interfaceC34019OooO0oOOooOo05 instanceof C34151OooOO0O)) {
                        c34147OooO0o02.f122702OooOooo = C34151OooOO0O.OooO0oo(abstractC34039OooOooOOooOOoo2.OooOo0(i2));
                    }
                }
                c34147OooO0o0 = c34147OooO0o02;
            }
            c34144OooO0OO = null;
            c34147OooO0o02.f122694OooOo = c34153OooOOO;
            interfaceC34019OooO0oOOooOo0 = abstractC34039OooOooOOooOOoo2.OooOo0(i + 1);
            if (interfaceC34019OooO0oOOooOo0 != null) {
                c34143OooO0O0 = (C34143OooO0O0) interfaceC34019OooO0oOOooOo0;
                c34147OooO0o02.f122697OooOoO0 = c34143OooO0O0;
                c34147OooO0o02.f122696OooOoO = C34142OooO00o.OooO0oo(abstractC34039OooOooOOooOOoo2.OooOo0(i + 2));
                c34147OooO0o02.f122698OooOoOO = C34029OooOOo0.OooOOo0(abstractC34039OooOooOOooOOoo2.OooOo0(i + 3));
                interfaceC34019OooO0oOOooOo02 = abstractC34039OooOooOOooOOoo2.OooOo0(i + 4);
                if (!(interfaceC34019OooO0oOOooOo02 instanceof C34144OooO0OO)) {
                }
                c34147OooO0o02.f122700OooOoo0 = c34144OooO0OO2;
                c34147OooO0o02.f122699OooOoo = AbstractC34039OooOooO.OooOOoo(abstractC34039OooOooOOooOOoo2.OooOo0(i + 5));
                while (i2 < abstractC34039OooOooOOooOOoo2.size()) {
                }
                c34147OooO0o0 = c34147OooO0o02;
            }
        } else {
            c34147OooO0o0 = null;
        }
        c34145OooO0Oo.f122690OooOo0o = c34147OooO0o0;
        c34145OooO0Oo.f122689OooOo = C34142OooO00o.OooO0oo(abstractC34039OooOooOOooOOoo.OooOo0(1));
        c34145OooO0Oo.f122691OooOoO0 = C34066Oooooo0.OooOo0(abstractC34039OooOooOOooOOoo.OooOo0(2));
        return c34145OooO0Oo;
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo(3);
        c34020OooO0oo.OooO00o(this.f122690OooOo0o);
        c34020OooO0oo.OooO00o(this.f122689OooOo);
        c34020OooO0oo.OooO00o(this.f122691OooOoO0);
        return new o00oO0O(c34020OooO0oo);
    }
}
