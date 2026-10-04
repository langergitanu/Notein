package o0000oO;

import o0000oO.AbstractC24322OooOOOo;
import o0000oo.C24342OooO;
import o0000oo.C24346OooO0Oo;
import o0000oo.C24348OooO0o0;

/* JADX INFO: renamed from: o0000oO.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24319OooOOO extends AbstractC24322OooOOOo {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public C24312OooO0o f81864OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public C24308OooO00o f81865OooOO0o;

    @Override // o0000oO.AbstractC24322OooOOOo, o0000oO.InterfaceC24311OooO0Oo
    public final void OooO00o(InterfaceC24311OooO0Oo interfaceC24311OooO0Oo) {
        float f;
        float f2;
        float f3;
        int i;
        if (this.f81883OooOO0.ordinal() == 3) {
            C24348OooO0o0 c24348OooO0o0 = this.f81876OooO0O0;
            OooOO0o(c24348OooO0o0.f82030Oooo0OO, c24348OooO0o0.f82031Oooo0o, 1);
            return;
        }
        C24314OooO0oO c24314OooO0oO = this.f81880OooO0o0;
        boolean z = c24314OooO0oO.f81835OooO0OO;
        C24348OooO0o0.OooO00o oooO00o = C24348OooO0o0.OooO00o.f82065OooOoO0;
        if (z && !c24314OooO0oO.f81841OooOO0 && this.f81878OooO0Oo == oooO00o) {
            C24348OooO0o0 c24348OooO0o02 = this.f81876OooO0O0;
            int i2 = c24348OooO0o02.f82011OooOOoo;
            if (i2 == 2) {
                C24348OooO0o0 c24348OooO0o03 = c24348OooO0o02.f82054o000oOoO;
                if (c24348OooO0o03 != null) {
                    if (c24348OooO0o03.f81999OooO0o0.f81880OooO0o0.f81841OooOO0) {
                        c24314OooO0oO.OooO0Oo((int) ((r1.f81839OooO0oO * c24348OooO0o02.f82017OooOoO) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C24314OooO0oO c24314OooO0oO2 = c24348OooO0o02.f81997OooO0Oo.f81880OooO0o0;
                if (c24314OooO0oO2.f81841OooOO0) {
                    int i3 = c24348OooO0o02.f82043OoooOoO;
                    if (i3 == -1) {
                        f = c24314OooO0oO2.f81839OooO0oO;
                        f2 = c24348OooO0o02.f82042OoooOo0;
                    } else if (i3 == 0) {
                        f3 = c24314OooO0oO2.f81839OooO0oO * c24348OooO0o02.f82042OoooOo0;
                        i = (int) (f3 + 0.5f);
                        c24314OooO0oO.OooO0Oo(i);
                    } else if (i3 != 1) {
                        i = 0;
                        c24314OooO0oO.OooO0Oo(i);
                    } else {
                        f = c24314OooO0oO2.f81839OooO0oO;
                        f2 = c24348OooO0o02.f82042OoooOo0;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    c24314OooO0oO.OooO0Oo(i);
                }
            }
        }
        C24312OooO0o c24312OooO0o = this.f81882OooO0oo;
        if (c24312OooO0o.f81835OooO0OO) {
            C24312OooO0o c24312OooO0o2 = this.f81874OooO;
            if (c24312OooO0o2.f81835OooO0OO) {
                if (c24312OooO0o.f81841OooOO0 && c24312OooO0o2.f81841OooOO0 && c24314OooO0oO.f81841OooOO0) {
                    return;
                }
                if (!c24314OooO0oO.f81841OooOO0 && this.f81878OooO0Oo == oooO00o) {
                    C24348OooO0o0 c24348OooO0o04 = this.f81876OooO0O0;
                    if (c24348OooO0o04.f82009OooOOo == 0 && !c24348OooO0o04.OooOoO0()) {
                        C24312OooO0o c24312OooO0o3 = (C24312OooO0o) c24312OooO0o.f81843OooOO0o.get(0);
                        C24312OooO0o c24312OooO0o4 = (C24312OooO0o) c24312OooO0o2.f81843OooOO0o.get(0);
                        int i4 = c24312OooO0o3.f81839OooO0oO + c24312OooO0o.f81837OooO0o;
                        int i5 = c24312OooO0o4.f81839OooO0oO + c24312OooO0o2.f81837OooO0o;
                        c24312OooO0o.OooO0Oo(i4);
                        c24312OooO0o2.OooO0Oo(i5);
                        c24314OooO0oO.OooO0Oo(i5 - i4);
                        return;
                    }
                }
                if (!c24314OooO0oO.f81841OooOO0 && this.f81878OooO0Oo == oooO00o && this.f81875OooO00o == 1 && c24312OooO0o.f81843OooOO0o.size() > 0 && c24312OooO0o2.f81843OooOO0o.size() > 0) {
                    C24312OooO0o c24312OooO0o5 = (C24312OooO0o) c24312OooO0o.f81843OooOO0o.get(0);
                    int i6 = (((C24312OooO0o) c24312OooO0o2.f81843OooOO0o.get(0)).f81839OooO0oO + c24312OooO0o2.f81837OooO0o) - (c24312OooO0o5.f81839OooO0oO + c24312OooO0o.f81837OooO0o);
                    int i7 = c24314OooO0oO.f81861OooOOO0;
                    if (i6 < i7) {
                        c24314OooO0oO.OooO0Oo(i6);
                    } else {
                        c24314OooO0oO.OooO0Oo(i7);
                    }
                }
                if (c24314OooO0oO.f81841OooOO0 && c24312OooO0o.f81843OooOO0o.size() > 0 && c24312OooO0o2.f81843OooOO0o.size() > 0) {
                    C24312OooO0o c24312OooO0o6 = (C24312OooO0o) c24312OooO0o.f81843OooOO0o.get(0);
                    C24312OooO0o c24312OooO0o7 = (C24312OooO0o) c24312OooO0o2.f81843OooOO0o.get(0);
                    int i8 = c24312OooO0o6.f81839OooO0oO;
                    int i9 = c24312OooO0o.f81837OooO0o + i8;
                    int i10 = c24312OooO0o7.f81839OooO0oO;
                    int i11 = c24312OooO0o2.f81837OooO0o + i10;
                    float f4 = this.f81876OooO0O0.f82051Oooooo0;
                    if (c24312OooO0o6 == c24312OooO0o7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c24312OooO0o.OooO0Oo((int) ((((i10 - i8) - c24314OooO0oO.f81839OooO0oO) * f4) + i8 + 0.5f));
                    c24312OooO0o2.OooO0Oo(c24312OooO0o.f81839OooO0oO + c24314OooO0oO.f81839OooO0oO);
                }
            }
        }
    }

    @Override // o0000oO.AbstractC24322OooOOOo
    public final void OooO0Oo() {
        C24348OooO0o0 c24348OooO0o0;
        C24348OooO0o0 c24348OooO0o02;
        C24348OooO0o0 c24348OooO0o03;
        C24348OooO0o0 c24348OooO0o04;
        C24348OooO0o0 c24348OooO0o05 = this.f81876OooO0O0;
        boolean z = c24348OooO0o05.f81994OooO00o;
        C24314OooO0oO c24314OooO0oO = this.f81880OooO0o0;
        if (z) {
            c24314OooO0oO.OooO0Oo(c24348OooO0o05.OooOO0O());
        }
        boolean z2 = c24314OooO0oO.f81841OooOO0;
        C24348OooO0o0.OooO00o oooO00o = C24348OooO0o0.OooO00o.f82064OooOoO;
        C24348OooO0o0.OooO00o oooO00o2 = C24348OooO0o0.OooO00o.f82063OooOo0o;
        C24348OooO0o0.OooO00o oooO00o3 = C24348OooO0o0.OooO00o.f82065OooOoO0;
        C24312OooO0o c24312OooO0o = this.f81874OooO;
        C24312OooO0o c24312OooO0o2 = this.f81882OooO0oo;
        if (!z2) {
            C24348OooO0o0 c24348OooO0o06 = this.f81876OooO0O0;
            this.f81878OooO0Oo = c24348OooO0o06.f82039OoooOO0[1];
            if (c24348OooO0o06.f82023OooOooo) {
                this.f81865OooOO0o = new C24308OooO00o(this);
            }
            C24348OooO0o0.OooO00o oooO00o4 = this.f81878OooO0Oo;
            if (oooO00o4 != oooO00o3) {
                if (oooO00o4 == oooO00o && (c24348OooO0o04 = this.f81876OooO0O0.f82054o000oOoO) != null && c24348OooO0o04.f82039OoooOO0[1] == oooO00o2) {
                    int iOooOO0O = (c24348OooO0o04.OooOO0O() - this.f81876OooO0O0.f82030Oooo0OO.OooO0o0()) - this.f81876OooO0O0.f82031Oooo0o.OooO0o0();
                    AbstractC24322OooOOOo.OooO0O0(c24312OooO0o2, c24348OooO0o04.f81999OooO0o0.f81882OooO0oo, this.f81876OooO0O0.f82030Oooo0OO.OooO0o0());
                    AbstractC24322OooOOOo.OooO0O0(c24312OooO0o, c24348OooO0o04.f81999OooO0o0.f81874OooO, -this.f81876OooO0O0.f82031Oooo0o.OooO0o0());
                    c24314OooO0oO.OooO0Oo(iOooOO0O);
                    return;
                }
                if (oooO00o4 == oooO00o2) {
                    c24314OooO0oO.OooO0Oo(this.f81876OooO0O0.OooOO0O());
                }
            }
        } else if (this.f81878OooO0Oo == oooO00o && (c24348OooO0o02 = (c24348OooO0o0 = this.f81876OooO0O0).f82054o000oOoO) != null && c24348OooO0o02.f82039OoooOO0[1] == oooO00o2) {
            AbstractC24322OooOOOo.OooO0O0(c24312OooO0o2, c24348OooO0o02.f81999OooO0o0.f81882OooO0oo, c24348OooO0o0.f82030Oooo0OO.OooO0o0());
            AbstractC24322OooOOOo.OooO0O0(c24312OooO0o, c24348OooO0o02.f81999OooO0o0.f81874OooO, -this.f81876OooO0O0.f82031Oooo0o.OooO0o0());
            return;
        }
        boolean z3 = c24314OooO0oO.f81841OooOO0;
        C24312OooO0o c24312OooO0o3 = this.f81864OooOO0O;
        if (z3) {
            C24348OooO0o0 c24348OooO0o07 = this.f81876OooO0O0;
            if (c24348OooO0o07.f81994OooO00o) {
                C24346OooO0Oo[] c24346OooO0OoArr = c24348OooO0o07.f82036OoooO0;
                C24346OooO0Oo c24346OooO0Oo = c24346OooO0OoArr[2];
                C24346OooO0Oo c24346OooO0Oo2 = c24346OooO0Oo.f81959OooO0o;
                if (c24346OooO0Oo2 != null && c24346OooO0OoArr[3].f81959OooO0o != null) {
                    if (c24348OooO0o07.OooOoO0()) {
                        c24312OooO0o2.f81837OooO0o = this.f81876OooO0O0.f82036OoooO0[2].OooO0o0();
                        c24312OooO0o.f81837OooO0o = -this.f81876OooO0O0.f82036OoooO0[3].OooO0o0();
                    } else {
                        C24312OooO0o c24312OooO0oOooO0oo = AbstractC24322OooOOOo.OooO0oo(this.f81876OooO0O0.f82036OoooO0[2]);
                        if (c24312OooO0oOooO0oo != null) {
                            AbstractC24322OooOOOo.OooO0O0(c24312OooO0o2, c24312OooO0oOooO0oo, this.f81876OooO0O0.f82036OoooO0[2].OooO0o0());
                        }
                        C24312OooO0o c24312OooO0oOooO0oo2 = AbstractC24322OooOOOo.OooO0oo(this.f81876OooO0O0.f82036OoooO0[3]);
                        if (c24312OooO0oOooO0oo2 != null) {
                            AbstractC24322OooOOOo.OooO0O0(c24312OooO0o, c24312OooO0oOooO0oo2, -this.f81876OooO0O0.f82036OoooO0[3].OooO0o0());
                        }
                        c24312OooO0o2.f81834OooO0O0 = true;
                        c24312OooO0o.f81834OooO0O0 = true;
                    }
                    C24348OooO0o0 c24348OooO0o08 = this.f81876OooO0O0;
                    if (c24348OooO0o08.f82023OooOooo) {
                        AbstractC24322OooOOOo.OooO0O0(c24312OooO0o3, c24312OooO0o2, c24348OooO0o08.f82046Ooooo0o);
                        return;
                    }
                    return;
                }
                if (c24346OooO0Oo2 != null) {
                    C24312OooO0o c24312OooO0oOooO0oo3 = AbstractC24322OooOOOo.OooO0oo(c24346OooO0Oo);
                    if (c24312OooO0oOooO0oo3 != null) {
                        AbstractC24322OooOOOo.OooO0O0(c24312OooO0o2, c24312OooO0oOooO0oo3, this.f81876OooO0O0.f82036OoooO0[2].OooO0o0());
                        AbstractC24322OooOOOo.OooO0O0(c24312OooO0o, c24312OooO0o2, c24314OooO0oO.f81839OooO0oO);
                        C24348OooO0o0 c24348OooO0o09 = this.f81876OooO0O0;
                        if (c24348OooO0o09.f82023OooOooo) {
                            AbstractC24322OooOOOo.OooO0O0(c24312OooO0o3, c24312OooO0o2, c24348OooO0o09.f82046Ooooo0o);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C24346OooO0Oo c24346OooO0Oo3 = c24346OooO0OoArr[3];
                if (c24346OooO0Oo3.f81959OooO0o != null) {
                    C24312OooO0o c24312OooO0oOooO0oo4 = AbstractC24322OooOOOo.OooO0oo(c24346OooO0Oo3);
                    if (c24312OooO0oOooO0oo4 != null) {
                        AbstractC24322OooOOOo.OooO0O0(c24312OooO0o, c24312OooO0oOooO0oo4, -this.f81876OooO0O0.f82036OoooO0[3].OooO0o0());
                        AbstractC24322OooOOOo.OooO0O0(c24312OooO0o2, c24312OooO0o, -c24314OooO0oO.f81839OooO0oO);
                    }
                    C24348OooO0o0 c24348OooO0o010 = this.f81876OooO0O0;
                    if (c24348OooO0o010.f82023OooOooo) {
                        AbstractC24322OooOOOo.OooO0O0(c24312OooO0o3, c24312OooO0o2, c24348OooO0o010.f82046Ooooo0o);
                        return;
                    }
                    return;
                }
                C24346OooO0Oo c24346OooO0Oo4 = c24346OooO0OoArr[4];
                if (c24346OooO0Oo4.f81959OooO0o != null) {
                    C24312OooO0o c24312OooO0oOooO0oo5 = AbstractC24322OooOOOo.OooO0oo(c24346OooO0Oo4);
                    if (c24312OooO0oOooO0oo5 != null) {
                        AbstractC24322OooOOOo.OooO0O0(c24312OooO0o3, c24312OooO0oOooO0oo5, 0);
                        AbstractC24322OooOOOo.OooO0O0(c24312OooO0o2, c24312OooO0o3, -this.f81876OooO0O0.f82046Ooooo0o);
                        AbstractC24322OooOOOo.OooO0O0(c24312OooO0o, c24312OooO0o2, c24314OooO0oO.f81839OooO0oO);
                        return;
                    }
                    return;
                }
                if ((c24348OooO0o07 instanceof C24342OooO) || c24348OooO0o07.f82054o000oOoO == null || c24348OooO0o07.OooO(C24346OooO0Oo.OooO00o.f81969OooOoo0).f81959OooO0o != null) {
                    return;
                }
                C24348OooO0o0 c24348OooO0o011 = this.f81876OooO0O0;
                AbstractC24322OooOOOo.OooO0O0(c24312OooO0o2, c24348OooO0o011.f82054o000oOoO.f81999OooO0o0.f81882OooO0oo, c24348OooO0o011.OooOOoo());
                AbstractC24322OooOOOo.OooO0O0(c24312OooO0o, c24312OooO0o2, c24314OooO0oO.f81839OooO0oO);
                C24348OooO0o0 c24348OooO0o012 = this.f81876OooO0O0;
                if (c24348OooO0o012.f82023OooOooo) {
                    AbstractC24322OooOOOo.OooO0O0(c24312OooO0o3, c24312OooO0o2, c24348OooO0o012.f82046Ooooo0o);
                    return;
                }
                return;
            }
        }
        if (z3 || this.f81878OooO0Oo != oooO00o3) {
            c24314OooO0oO.OooO0O0(this);
        } else {
            C24348OooO0o0 c24348OooO0o013 = this.f81876OooO0O0;
            int i = c24348OooO0o013.f82011OooOOoo;
            if (i == 2) {
                C24348OooO0o0 c24348OooO0o014 = c24348OooO0o013.f82054o000oOoO;
                if (c24348OooO0o014 != null) {
                    C24314OooO0oO c24314OooO0oO2 = c24348OooO0o014.f81999OooO0o0.f81880OooO0o0;
                    c24314OooO0oO.f81843OooOO0o.add(c24314OooO0oO2);
                    c24314OooO0oO2.f81842OooOO0O.add(c24314OooO0oO);
                    c24314OooO0oO.f81834OooO0O0 = true;
                    c24314OooO0oO.f81842OooOO0O.add(c24312OooO0o2);
                    c24314OooO0oO.f81842OooOO0O.add(c24312OooO0o);
                }
            } else if (i == 3 && !c24348OooO0o013.OooOoO0()) {
                C24348OooO0o0 c24348OooO0o015 = this.f81876OooO0O0;
                if (c24348OooO0o015.f82009OooOOo != 3) {
                    C24314OooO0oO c24314OooO0oO3 = c24348OooO0o015.f81997OooO0Oo.f81880OooO0o0;
                    c24314OooO0oO.f81843OooOO0o.add(c24314OooO0oO3);
                    c24314OooO0oO3.f81842OooOO0O.add(c24314OooO0oO);
                    c24314OooO0oO.f81834OooO0O0 = true;
                    c24314OooO0oO.f81842OooOO0O.add(c24312OooO0o2);
                    c24314OooO0oO.f81842OooOO0O.add(c24312OooO0o);
                }
            }
        }
        C24348OooO0o0 c24348OooO0o016 = this.f81876OooO0O0;
        C24346OooO0Oo[] c24346OooO0OoArr2 = c24348OooO0o016.f82036OoooO0;
        C24346OooO0Oo c24346OooO0Oo5 = c24346OooO0OoArr2[2];
        C24346OooO0Oo c24346OooO0Oo6 = c24346OooO0Oo5.f81959OooO0o;
        if (c24346OooO0Oo6 != null && c24346OooO0OoArr2[3].f81959OooO0o != null) {
            if (c24348OooO0o016.OooOoO0()) {
                c24312OooO0o2.f81837OooO0o = this.f81876OooO0O0.f82036OoooO0[2].OooO0o0();
                c24312OooO0o.f81837OooO0o = -this.f81876OooO0O0.f82036OoooO0[3].OooO0o0();
            } else {
                C24312OooO0o c24312OooO0oOooO0oo6 = AbstractC24322OooOOOo.OooO0oo(this.f81876OooO0O0.f82036OoooO0[2]);
                C24312OooO0o c24312OooO0oOooO0oo7 = AbstractC24322OooOOOo.OooO0oo(this.f81876OooO0O0.f82036OoooO0[3]);
                if (c24312OooO0oOooO0oo6 != null) {
                    c24312OooO0oOooO0oo6.OooO0O0(this);
                }
                if (c24312OooO0oOooO0oo7 != null) {
                    c24312OooO0oOooO0oo7.OooO0O0(this);
                }
                this.f81883OooOO0 = AbstractC24322OooOOOo.OooO00o.f81884OooOo;
            }
            if (this.f81876OooO0O0.f82023OooOooo) {
                OooO0OO(c24312OooO0o3, c24312OooO0o2, 1, this.f81865OooOO0o);
            }
        } else if (c24346OooO0Oo6 != null) {
            C24312OooO0o c24312OooO0oOooO0oo8 = AbstractC24322OooOOOo.OooO0oo(c24346OooO0Oo5);
            if (c24312OooO0oOooO0oo8 != null) {
                AbstractC24322OooOOOo.OooO0O0(c24312OooO0o2, c24312OooO0oOooO0oo8, this.f81876OooO0O0.f82036OoooO0[2].OooO0o0());
                OooO0OO(c24312OooO0o, c24312OooO0o2, 1, c24314OooO0oO);
                if (this.f81876OooO0O0.f82023OooOooo) {
                    OooO0OO(c24312OooO0o3, c24312OooO0o2, 1, this.f81865OooOO0o);
                }
                if (this.f81878OooO0Oo == oooO00o3) {
                    C24348OooO0o0 c24348OooO0o017 = this.f81876OooO0O0;
                    if (c24348OooO0o017.f82042OoooOo0 > 0.0f) {
                        C24318OooOO0o c24318OooOO0o = c24348OooO0o017.f81997OooO0Oo;
                        if (c24318OooOO0o.f81878OooO0Oo == oooO00o3) {
                            c24318OooOO0o.f81880OooO0o0.f81842OooOO0O.add(c24314OooO0oO);
                            c24314OooO0oO.f81843OooOO0o.add(this.f81876OooO0O0.f81997OooO0Oo.f81880OooO0o0);
                            c24314OooO0oO.f81833OooO00o = this;
                        }
                    }
                }
            }
        } else {
            C24346OooO0Oo c24346OooO0Oo7 = c24346OooO0OoArr2[3];
            if (c24346OooO0Oo7.f81959OooO0o != null) {
                C24312OooO0o c24312OooO0oOooO0oo9 = AbstractC24322OooOOOo.OooO0oo(c24346OooO0Oo7);
                if (c24312OooO0oOooO0oo9 != null) {
                    AbstractC24322OooOOOo.OooO0O0(c24312OooO0o, c24312OooO0oOooO0oo9, -this.f81876OooO0O0.f82036OoooO0[3].OooO0o0());
                    OooO0OO(c24312OooO0o2, c24312OooO0o, -1, c24314OooO0oO);
                    if (this.f81876OooO0O0.f82023OooOooo) {
                        OooO0OO(c24312OooO0o3, c24312OooO0o2, 1, this.f81865OooOO0o);
                    }
                }
            } else {
                C24346OooO0Oo c24346OooO0Oo8 = c24346OooO0OoArr2[4];
                if (c24346OooO0Oo8.f81959OooO0o != null) {
                    C24312OooO0o c24312OooO0oOooO0oo10 = AbstractC24322OooOOOo.OooO0oo(c24346OooO0Oo8);
                    if (c24312OooO0oOooO0oo10 != null) {
                        AbstractC24322OooOOOo.OooO0O0(c24312OooO0o3, c24312OooO0oOooO0oo10, 0);
                        OooO0OO(c24312OooO0o2, c24312OooO0o3, -1, this.f81865OooOO0o);
                        OooO0OO(c24312OooO0o, c24312OooO0o2, 1, c24314OooO0oO);
                    }
                } else if (!(c24348OooO0o016 instanceof C24342OooO) && (c24348OooO0o03 = c24348OooO0o016.f82054o000oOoO) != null) {
                    AbstractC24322OooOOOo.OooO0O0(c24312OooO0o2, c24348OooO0o03.f81999OooO0o0.f81882OooO0oo, c24348OooO0o016.OooOOoo());
                    OooO0OO(c24312OooO0o, c24312OooO0o2, 1, c24314OooO0oO);
                    if (this.f81876OooO0O0.f82023OooOooo) {
                        OooO0OO(c24312OooO0o3, c24312OooO0o2, 1, this.f81865OooOO0o);
                    }
                    if (this.f81878OooO0Oo == oooO00o3) {
                        C24348OooO0o0 c24348OooO0o018 = this.f81876OooO0O0;
                        if (c24348OooO0o018.f82042OoooOo0 > 0.0f) {
                            C24318OooOO0o c24318OooOO0o2 = c24348OooO0o018.f81997OooO0Oo;
                            if (c24318OooOO0o2.f81878OooO0Oo == oooO00o3) {
                                c24318OooOO0o2.f81880OooO0o0.f81842OooOO0O.add(c24314OooO0oO);
                                c24314OooO0oO.f81843OooOO0o.add(this.f81876OooO0O0.f81997OooO0Oo.f81880OooO0o0);
                                c24314OooO0oO.f81833OooO00o = this;
                            }
                        }
                    }
                }
            }
        }
        if (c24314OooO0oO.f81843OooOO0o.size() == 0) {
            c24314OooO0oO.f81835OooO0OO = true;
        }
    }

    @Override // o0000oO.AbstractC24322OooOOOo
    public final void OooO0o() {
        this.f81877OooO0OO = null;
        this.f81882OooO0oo.OooO0OO();
        this.f81874OooO.OooO0OO();
        this.f81864OooOO0O.OooO0OO();
        this.f81880OooO0o0.OooO0OO();
        this.f81881OooO0oO = false;
    }

    @Override // o0000oO.AbstractC24322OooOOOo
    public final void OooO0o0() {
        C24312OooO0o c24312OooO0o = this.f81882OooO0oo;
        if (c24312OooO0o.f81841OooOO0) {
            this.f81876OooO0O0.f82045Ooooo00 = c24312OooO0o.f81839OooO0oO;
        }
    }

    @Override // o0000oO.AbstractC24322OooOOOo
    public final boolean OooOO0O() {
        return this.f81878OooO0Oo != C24348OooO0o0.OooO00o.f82065OooOoO0 || this.f81876OooO0O0.f82011OooOOoo == 0;
    }

    public final void OooOOO0() {
        this.f81881OooO0oO = false;
        C24312OooO0o c24312OooO0o = this.f81882OooO0oo;
        c24312OooO0o.OooO0OO();
        c24312OooO0o.f81841OooOO0 = false;
        C24312OooO0o c24312OooO0o2 = this.f81874OooO;
        c24312OooO0o2.OooO0OO();
        c24312OooO0o2.f81841OooOO0 = false;
        C24312OooO0o c24312OooO0o3 = this.f81864OooOO0O;
        c24312OooO0o3.OooO0OO();
        c24312OooO0o3.f81841OooOO0 = false;
        this.f81880OooO0o0.f81841OooOO0 = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f81876OooO0O0.f82053Ooooooo;
    }
}
