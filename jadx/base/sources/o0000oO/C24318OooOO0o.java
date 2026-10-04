package o0000oO;

import java.util.ArrayList;
import o0000oO.AbstractC24322OooOOOo;
import o0000oo.C24342OooO;
import o0000oo.C24346OooO0Oo;
import o0000oo.C24348OooO0o0;

/* JADX INFO: renamed from: o0000oO.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24318OooOO0o extends AbstractC24322OooOOOo {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final int[] f81863OooOO0O = new int[2];

    public static void OooOOO0(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    @Override // o0000oO.AbstractC24322OooOOOo, o0000oO.InterfaceC24311OooO0Oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO00o(InterfaceC24311OooO0Oo interfaceC24311OooO0Oo) {
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        if (this.f81883OooOO0.ordinal() == 3) {
            C24348OooO0o0 c24348OooO0o0 = this.f81876OooO0O0;
            OooOO0o(c24348OooO0o0.f82029Oooo0O0, c24348OooO0o0.f82032Oooo0o0, 0);
            return;
        }
        C24314OooO0oO c24314OooO0oO = this.f81880OooO0o0;
        boolean z = c24314OooO0oO.f81841OooOO0;
        C24348OooO0o0.OooO00o oooO00o = C24348OooO0o0.OooO00o.f82065OooOoO0;
        C24312OooO0o c24312OooO0o = this.f81882OooO0oo;
        C24312OooO0o c24312OooO0o2 = this.f81874OooO;
        if (z || this.f81878OooO0Oo != oooO00o) {
            f = 0.5f;
        } else {
            C24348OooO0o0 c24348OooO0o02 = this.f81876OooO0O0;
            int i2 = c24348OooO0o02.f82009OooOOo;
            if (i2 == 2) {
                f = 0.5f;
                C24348OooO0o0 c24348OooO0o03 = c24348OooO0o02.f82054o000oOoO;
                if (c24348OooO0o03 != null) {
                    if (c24348OooO0o03.f81997OooO0Oo.f81880OooO0o0.f81841OooOO0) {
                        c24314OooO0oO.OooO0Oo((int) ((r3.f81839OooO0oO * c24348OooO0o02.f82016OooOo0o) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = c24348OooO0o02.f82011OooOOoo;
                if (i3 == 0 || i3 == 3) {
                    C24319OooOOO c24319OooOOO = c24348OooO0o02.f81999OooO0o0;
                    C24312OooO0o c24312OooO0o3 = c24319OooOOO.f81882OooO0oo;
                    C24312OooO0o c24312OooO0o4 = c24319OooOOO.f81874OooO;
                    boolean z2 = c24348OooO0o02.f82029Oooo0O0.f81959OooO0o != null;
                    boolean z3 = c24348OooO0o02.f82030Oooo0OO.f81959OooO0o != null;
                    boolean z4 = c24348OooO0o02.f82032Oooo0o0.f81959OooO0o != null;
                    boolean z5 = c24348OooO0o02.f82031Oooo0o.f81959OooO0o != null;
                    f = 0.5f;
                    int i4 = c24348OooO0o02.f82043OoooOoO;
                    if (z2 && z3 && z4 && z5) {
                        float f5 = c24348OooO0o02.f82042OoooOo0;
                        boolean z6 = c24312OooO0o3.f81841OooOO0;
                        int[] iArr = f81863OooOO0O;
                        if (z6 && c24312OooO0o4.f81841OooOO0) {
                            if (c24312OooO0o.f81835OooO0OO && c24312OooO0o2.f81835OooO0OO) {
                                OooOOO0(iArr, ((C24312OooO0o) c24312OooO0o.f81843OooOO0o.get(0)).f81839OooO0oO + c24312OooO0o.f81837OooO0o, ((C24312OooO0o) c24312OooO0o2.f81843OooOO0o.get(0)).f81839OooO0oO - c24312OooO0o2.f81837OooO0o, c24312OooO0o3.f81839OooO0oO + c24312OooO0o3.f81837OooO0o, c24312OooO0o4.f81839OooO0oO - c24312OooO0o4.f81837OooO0o, f5, i4);
                                c24314OooO0oO.OooO0Oo(iArr[0]);
                                this.f81876OooO0O0.f81999OooO0o0.f81880OooO0o0.OooO0Oo(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z7 = c24312OooO0o.f81841OooOO0;
                        ArrayList arrayList = c24312OooO0o3.f81843OooOO0o;
                        if (z7 && c24312OooO0o2.f81841OooOO0) {
                            if (!c24312OooO0o3.f81835OooO0OO || !c24312OooO0o4.f81835OooO0OO) {
                                return;
                            }
                            OooOOO0(iArr, c24312OooO0o.f81839OooO0oO + c24312OooO0o.f81837OooO0o, c24312OooO0o2.f81839OooO0oO - c24312OooO0o2.f81837OooO0o, ((C24312OooO0o) arrayList.get(0)).f81839OooO0oO + c24312OooO0o3.f81837OooO0o, ((C24312OooO0o) c24312OooO0o4.f81843OooOO0o.get(0)).f81839OooO0oO - c24312OooO0o4.f81837OooO0o, f5, i4);
                            c24314OooO0oO.OooO0Oo(iArr[0]);
                            this.f81876OooO0O0.f81999OooO0o0.f81880OooO0o0.OooO0Oo(iArr[1]);
                        }
                        if (!c24312OooO0o.f81835OooO0OO || !c24312OooO0o2.f81835OooO0OO || !c24312OooO0o3.f81835OooO0OO || !c24312OooO0o4.f81835OooO0OO) {
                            return;
                        }
                        OooOOO0(iArr, ((C24312OooO0o) c24312OooO0o.f81843OooOO0o.get(0)).f81839OooO0oO + c24312OooO0o.f81837OooO0o, ((C24312OooO0o) c24312OooO0o2.f81843OooOO0o.get(0)).f81839OooO0oO - c24312OooO0o2.f81837OooO0o, ((C24312OooO0o) arrayList.get(0)).f81839OooO0oO + c24312OooO0o3.f81837OooO0o, ((C24312OooO0o) c24312OooO0o4.f81843OooOO0o.get(0)).f81839OooO0oO - c24312OooO0o4.f81837OooO0o, f5, i4);
                        c24314OooO0oO.OooO0Oo(iArr[0]);
                        this.f81876OooO0O0.f81999OooO0o0.f81880OooO0o0.OooO0Oo(iArr[1]);
                    } else if (z2 && z4) {
                        if (!c24312OooO0o.f81835OooO0OO || !c24312OooO0o2.f81835OooO0OO) {
                            return;
                        }
                        float f6 = c24348OooO0o02.f82042OoooOo0;
                        int i5 = ((C24312OooO0o) c24312OooO0o.f81843OooOO0o.get(0)).f81839OooO0oO + c24312OooO0o.f81837OooO0o;
                        int i6 = ((C24312OooO0o) c24312OooO0o2.f81843OooOO0o.get(0)).f81839OooO0oO - c24312OooO0o2.f81837OooO0o;
                        if (i4 == -1 || i4 == 0) {
                            int iOooO0oO = OooO0oO(i6 - i5, 0);
                            int i7 = (int) ((iOooO0oO * f6) + 0.5f);
                            int iOooO0oO2 = OooO0oO(i7, 1);
                            if (i7 != iOooO0oO2) {
                                iOooO0oO = (int) ((iOooO0oO2 / f6) + 0.5f);
                            }
                            c24314OooO0oO.OooO0Oo(iOooO0oO);
                            this.f81876OooO0O0.f81999OooO0o0.f81880OooO0o0.OooO0Oo(iOooO0oO2);
                        } else if (i4 == 1) {
                            int iOooO0oO3 = OooO0oO(i6 - i5, 0);
                            int i8 = (int) ((iOooO0oO3 / f6) + 0.5f);
                            int iOooO0oO4 = OooO0oO(i8, 1);
                            if (i8 != iOooO0oO4) {
                                iOooO0oO3 = (int) ((iOooO0oO4 * f6) + 0.5f);
                            }
                            c24314OooO0oO.OooO0Oo(iOooO0oO3);
                            this.f81876OooO0O0.f81999OooO0o0.f81880OooO0o0.OooO0Oo(iOooO0oO4);
                        }
                    } else if (z3 && z5) {
                        if (!c24312OooO0o3.f81835OooO0OO || !c24312OooO0o4.f81835OooO0OO) {
                            return;
                        }
                        float f7 = c24348OooO0o02.f82042OoooOo0;
                        int i9 = ((C24312OooO0o) c24312OooO0o3.f81843OooOO0o.get(0)).f81839OooO0oO + c24312OooO0o3.f81837OooO0o;
                        int i10 = ((C24312OooO0o) c24312OooO0o4.f81843OooOO0o.get(0)).f81839OooO0oO - c24312OooO0o4.f81837OooO0o;
                        if (i4 == -1) {
                            int iOooO0oO5 = OooO0oO(i10 - i9, 1);
                            int i11 = (int) ((iOooO0oO5 / f7) + 0.5f);
                            int iOooO0oO6 = OooO0oO(i11, 0);
                            if (i11 != iOooO0oO6) {
                                iOooO0oO5 = (int) ((iOooO0oO6 * f7) + 0.5f);
                            }
                            c24314OooO0oO.OooO0Oo(iOooO0oO6);
                            this.f81876OooO0O0.f81999OooO0o0.f81880OooO0o0.OooO0Oo(iOooO0oO5);
                        } else if (i4 == 0) {
                            int iOooO0oO7 = OooO0oO(i10 - i9, 1);
                            int i12 = (int) ((iOooO0oO7 * f7) + 0.5f);
                            int iOooO0oO8 = OooO0oO(i12, 0);
                            if (i12 != iOooO0oO8) {
                                iOooO0oO7 = (int) ((iOooO0oO8 / f7) + 0.5f);
                            }
                            c24314OooO0oO.OooO0Oo(iOooO0oO8);
                            this.f81876OooO0O0.f81999OooO0o0.f81880OooO0o0.OooO0Oo(iOooO0oO7);
                        } else if (i4 == 1) {
                        }
                    }
                } else {
                    int i13 = c24348OooO0o02.f82043OoooOoO;
                    if (i13 == -1) {
                        f2 = c24348OooO0o02.f81999OooO0o0.f81880OooO0o0.f81839OooO0oO;
                        f3 = c24348OooO0o02.f82042OoooOo0;
                    } else if (i13 == 0) {
                        f4 = c24348OooO0o02.f81999OooO0o0.f81880OooO0o0.f81839OooO0oO / c24348OooO0o02.f82042OoooOo0;
                        i = (int) (f4 + 0.5f);
                        c24314OooO0oO.OooO0Oo(i);
                        f = 0.5f;
                    } else if (i13 != 1) {
                        i = 0;
                        c24314OooO0oO.OooO0Oo(i);
                        f = 0.5f;
                    } else {
                        f2 = c24348OooO0o02.f81999OooO0o0.f81880OooO0o0.f81839OooO0oO;
                        f3 = c24348OooO0o02.f82042OoooOo0;
                    }
                    f4 = f2 * f3;
                    i = (int) (f4 + 0.5f);
                    c24314OooO0oO.OooO0Oo(i);
                    f = 0.5f;
                }
            }
        }
        if (c24312OooO0o.f81835OooO0OO && c24312OooO0o2.f81835OooO0OO) {
            if (c24312OooO0o.f81841OooOO0 && c24312OooO0o2.f81841OooOO0 && c24314OooO0oO.f81841OooOO0) {
                return;
            }
            if (!c24314OooO0oO.f81841OooOO0 && this.f81878OooO0Oo == oooO00o) {
                C24348OooO0o0 c24348OooO0o04 = this.f81876OooO0O0;
                if (c24348OooO0o04.f82009OooOOo == 0 && !c24348OooO0o04.OooOo()) {
                    C24312OooO0o c24312OooO0o5 = (C24312OooO0o) c24312OooO0o.f81843OooOO0o.get(0);
                    C24312OooO0o c24312OooO0o6 = (C24312OooO0o) c24312OooO0o2.f81843OooOO0o.get(0);
                    int i14 = c24312OooO0o5.f81839OooO0oO + c24312OooO0o.f81837OooO0o;
                    int i15 = c24312OooO0o6.f81839OooO0oO + c24312OooO0o2.f81837OooO0o;
                    c24312OooO0o.OooO0Oo(i14);
                    c24312OooO0o2.OooO0Oo(i15);
                    c24314OooO0oO.OooO0Oo(i15 - i14);
                    return;
                }
            }
            if (!c24314OooO0oO.f81841OooOO0 && this.f81878OooO0Oo == oooO00o && this.f81875OooO00o == 1 && c24312OooO0o.f81843OooOO0o.size() > 0 && c24312OooO0o2.f81843OooOO0o.size() > 0) {
                int iMin = Math.min((((C24312OooO0o) c24312OooO0o2.f81843OooOO0o.get(0)).f81839OooO0oO + c24312OooO0o2.f81837OooO0o) - (((C24312OooO0o) c24312OooO0o.f81843OooOO0o.get(0)).f81839OooO0oO + c24312OooO0o.f81837OooO0o), c24314OooO0oO.f81861OooOOO0);
                C24348OooO0o0 c24348OooO0o05 = this.f81876OooO0O0;
                int i16 = c24348OooO0o05.f82015OooOo0O;
                int iMax = Math.max(c24348OooO0o05.f82013OooOo0, iMin);
                if (i16 > 0) {
                    iMax = Math.min(i16, iMax);
                }
                c24314OooO0oO.OooO0Oo(iMax);
            }
            if (c24314OooO0oO.f81841OooOO0) {
                C24312OooO0o c24312OooO0o7 = (C24312OooO0o) c24312OooO0o.f81843OooOO0o.get(0);
                C24312OooO0o c24312OooO0o8 = (C24312OooO0o) c24312OooO0o2.f81843OooOO0o.get(0);
                int i17 = c24312OooO0o7.f81839OooO0oO;
                int i18 = c24312OooO0o.f81837OooO0o + i17;
                int i19 = c24312OooO0o8.f81839OooO0oO;
                int i20 = c24312OooO0o2.f81837OooO0o + i19;
                float f8 = this.f81876OooO0O0.f82049OooooOo;
                if (c24312OooO0o7 == c24312OooO0o8) {
                    f8 = f;
                } else {
                    i17 = i18;
                    i19 = i20;
                }
                c24312OooO0o.OooO0Oo((int) ((((i19 - i17) - c24314OooO0oO.f81839OooO0oO) * f8) + i17 + f));
                c24312OooO0o2.OooO0Oo(c24312OooO0o.f81839OooO0oO + c24314OooO0oO.f81839OooO0oO);
            }
        }
    }

    @Override // o0000oO.AbstractC24322OooOOOo
    public final void OooO0Oo() {
        C24348OooO0o0 c24348OooO0o0;
        C24348OooO0o0 c24348OooO0o02;
        C24348OooO0o0.OooO00o oooO00o;
        C24348OooO0o0 c24348OooO0o03;
        C24348OooO0o0 c24348OooO0o04;
        C24348OooO0o0.OooO00o oooO00o2;
        C24348OooO0o0 c24348OooO0o05 = this.f81876OooO0O0;
        boolean z = c24348OooO0o05.f81994OooO00o;
        C24314OooO0oO c24314OooO0oO = this.f81880OooO0o0;
        if (z) {
            c24314OooO0oO.OooO0Oo(c24348OooO0o05.OooOOo0());
        }
        boolean z2 = c24314OooO0oO.f81841OooOO0;
        C24348OooO0o0.OooO00o oooO00o3 = C24348OooO0o0.OooO00o.f82064OooOoO;
        C24348OooO0o0.OooO00o oooO00o4 = C24348OooO0o0.OooO00o.f82065OooOoO0;
        C24348OooO0o0.OooO00o oooO00o5 = C24348OooO0o0.OooO00o.f82063OooOo0o;
        C24312OooO0o c24312OooO0o = this.f81874OooO;
        C24312OooO0o c24312OooO0o2 = this.f81882OooO0oo;
        if (!z2) {
            C24348OooO0o0 c24348OooO0o06 = this.f81876OooO0O0;
            C24348OooO0o0.OooO00o oooO00o6 = c24348OooO0o06.f82039OoooOO0[0];
            this.f81878OooO0Oo = oooO00o6;
            if (oooO00o6 != oooO00o4) {
                if (oooO00o6 == oooO00o3 && (c24348OooO0o04 = c24348OooO0o06.f82054o000oOoO) != null && ((oooO00o2 = c24348OooO0o04.f82039OoooOO0[0]) == oooO00o5 || oooO00o2 == oooO00o3)) {
                    int iOooOOo0 = (c24348OooO0o04.OooOOo0() - this.f81876OooO0O0.f82029Oooo0O0.OooO0o0()) - this.f81876OooO0O0.f82032Oooo0o0.OooO0o0();
                    AbstractC24322OooOOOo.OooO0O0(c24312OooO0o2, c24348OooO0o04.f81997OooO0Oo.f81882OooO0oo, this.f81876OooO0O0.f82029Oooo0O0.OooO0o0());
                    AbstractC24322OooOOOo.OooO0O0(c24312OooO0o, c24348OooO0o04.f81997OooO0Oo.f81874OooO, -this.f81876OooO0O0.f82032Oooo0o0.OooO0o0());
                    c24314OooO0oO.OooO0Oo(iOooOOo0);
                    return;
                }
                if (oooO00o6 == oooO00o5) {
                    c24314OooO0oO.OooO0Oo(c24348OooO0o06.OooOOo0());
                }
            }
        } else if (this.f81878OooO0Oo == oooO00o3 && (c24348OooO0o02 = (c24348OooO0o0 = this.f81876OooO0O0).f82054o000oOoO) != null && ((oooO00o = c24348OooO0o02.f82039OoooOO0[0]) == oooO00o5 || oooO00o == oooO00o3)) {
            AbstractC24322OooOOOo.OooO0O0(c24312OooO0o2, c24348OooO0o02.f81997OooO0Oo.f81882OooO0oo, c24348OooO0o0.f82029Oooo0O0.OooO0o0());
            AbstractC24322OooOOOo.OooO0O0(c24312OooO0o, c24348OooO0o02.f81997OooO0Oo.f81874OooO, -this.f81876OooO0O0.f82032Oooo0o0.OooO0o0());
            return;
        }
        if (c24314OooO0oO.f81841OooOO0) {
            C24348OooO0o0 c24348OooO0o07 = this.f81876OooO0O0;
            if (c24348OooO0o07.f81994OooO00o) {
                C24346OooO0Oo[] c24346OooO0OoArr = c24348OooO0o07.f82036OoooO0;
                C24346OooO0Oo c24346OooO0Oo = c24346OooO0OoArr[0];
                C24346OooO0Oo c24346OooO0Oo2 = c24346OooO0Oo.f81959OooO0o;
                if (c24346OooO0Oo2 != null && c24346OooO0OoArr[1].f81959OooO0o != null) {
                    if (c24348OooO0o07.OooOo()) {
                        c24312OooO0o2.f81837OooO0o = this.f81876OooO0O0.f82036OoooO0[0].OooO0o0();
                        c24312OooO0o.f81837OooO0o = -this.f81876OooO0O0.f82036OoooO0[1].OooO0o0();
                        return;
                    }
                    C24312OooO0o c24312OooO0oOooO0oo = AbstractC24322OooOOOo.OooO0oo(this.f81876OooO0O0.f82036OoooO0[0]);
                    if (c24312OooO0oOooO0oo != null) {
                        AbstractC24322OooOOOo.OooO0O0(c24312OooO0o2, c24312OooO0oOooO0oo, this.f81876OooO0O0.f82036OoooO0[0].OooO0o0());
                    }
                    C24312OooO0o c24312OooO0oOooO0oo2 = AbstractC24322OooOOOo.OooO0oo(this.f81876OooO0O0.f82036OoooO0[1]);
                    if (c24312OooO0oOooO0oo2 != null) {
                        AbstractC24322OooOOOo.OooO0O0(c24312OooO0o, c24312OooO0oOooO0oo2, -this.f81876OooO0O0.f82036OoooO0[1].OooO0o0());
                    }
                    c24312OooO0o2.f81834OooO0O0 = true;
                    c24312OooO0o.f81834OooO0O0 = true;
                    return;
                }
                if (c24346OooO0Oo2 != null) {
                    C24312OooO0o c24312OooO0oOooO0oo3 = AbstractC24322OooOOOo.OooO0oo(c24346OooO0Oo);
                    if (c24312OooO0oOooO0oo3 != null) {
                        AbstractC24322OooOOOo.OooO0O0(c24312OooO0o2, c24312OooO0oOooO0oo3, this.f81876OooO0O0.f82036OoooO0[0].OooO0o0());
                        AbstractC24322OooOOOo.OooO0O0(c24312OooO0o, c24312OooO0o2, c24314OooO0oO.f81839OooO0oO);
                        return;
                    }
                    return;
                }
                C24346OooO0Oo c24346OooO0Oo3 = c24346OooO0OoArr[1];
                if (c24346OooO0Oo3.f81959OooO0o != null) {
                    C24312OooO0o c24312OooO0oOooO0oo4 = AbstractC24322OooOOOo.OooO0oo(c24346OooO0Oo3);
                    if (c24312OooO0oOooO0oo4 != null) {
                        AbstractC24322OooOOOo.OooO0O0(c24312OooO0o, c24312OooO0oOooO0oo4, -this.f81876OooO0O0.f82036OoooO0[1].OooO0o0());
                        AbstractC24322OooOOOo.OooO0O0(c24312OooO0o2, c24312OooO0o, -c24314OooO0oO.f81839OooO0oO);
                        return;
                    }
                    return;
                }
                if ((c24348OooO0o07 instanceof C24342OooO) || c24348OooO0o07.f82054o000oOoO == null || c24348OooO0o07.OooO(C24346OooO0Oo.OooO00o.f81969OooOoo0).f81959OooO0o != null) {
                    return;
                }
                C24348OooO0o0 c24348OooO0o08 = this.f81876OooO0O0;
                AbstractC24322OooOOOo.OooO0O0(c24312OooO0o2, c24348OooO0o08.f82054o000oOoO.f81997OooO0Oo.f81882OooO0oo, c24348OooO0o08.OooOOo());
                AbstractC24322OooOOOo.OooO0O0(c24312OooO0o, c24312OooO0o2, c24314OooO0oO.f81839OooO0oO);
                return;
            }
        }
        if (this.f81878OooO0Oo == oooO00o4) {
            C24348OooO0o0 c24348OooO0o09 = this.f81876OooO0O0;
            int i = c24348OooO0o09.f82009OooOOo;
            if (i == 2) {
                C24348OooO0o0 c24348OooO0o010 = c24348OooO0o09.f82054o000oOoO;
                if (c24348OooO0o010 != null) {
                    C24314OooO0oO c24314OooO0oO2 = c24348OooO0o010.f81999OooO0o0.f81880OooO0o0;
                    c24314OooO0oO.f81843OooOO0o.add(c24314OooO0oO2);
                    c24314OooO0oO2.f81842OooOO0O.add(c24314OooO0oO);
                    c24314OooO0oO.f81834OooO0O0 = true;
                    c24314OooO0oO.f81842OooOO0O.add(c24312OooO0o2);
                    c24314OooO0oO.f81842OooOO0O.add(c24312OooO0o);
                }
            } else if (i == 3) {
                if (c24348OooO0o09.f82011OooOOoo == 3) {
                    c24312OooO0o2.f81833OooO00o = this;
                    c24312OooO0o.f81833OooO00o = this;
                    C24319OooOOO c24319OooOOO = c24348OooO0o09.f81999OooO0o0;
                    c24319OooOOO.f81882OooO0oo.f81833OooO00o = this;
                    c24319OooOOO.f81874OooO.f81833OooO00o = this;
                    c24314OooO0oO.f81833OooO00o = this;
                    if (c24348OooO0o09.OooOoO0()) {
                        c24314OooO0oO.f81843OooOO0o.add(this.f81876OooO0O0.f81999OooO0o0.f81880OooO0o0);
                        this.f81876OooO0O0.f81999OooO0o0.f81880OooO0o0.f81842OooOO0O.add(c24314OooO0oO);
                        C24319OooOOO c24319OooOOO2 = this.f81876OooO0O0.f81999OooO0o0;
                        c24319OooOOO2.f81880OooO0o0.f81833OooO00o = this;
                        c24314OooO0oO.f81843OooOO0o.add(c24319OooOOO2.f81882OooO0oo);
                        c24314OooO0oO.f81843OooOO0o.add(this.f81876OooO0O0.f81999OooO0o0.f81874OooO);
                        this.f81876OooO0O0.f81999OooO0o0.f81882OooO0oo.f81842OooOO0O.add(c24314OooO0oO);
                        this.f81876OooO0O0.f81999OooO0o0.f81874OooO.f81842OooOO0O.add(c24314OooO0oO);
                    } else if (this.f81876OooO0O0.OooOo()) {
                        this.f81876OooO0O0.f81999OooO0o0.f81880OooO0o0.f81843OooOO0o.add(c24314OooO0oO);
                        c24314OooO0oO.f81842OooOO0O.add(this.f81876OooO0O0.f81999OooO0o0.f81880OooO0o0);
                    } else {
                        this.f81876OooO0O0.f81999OooO0o0.f81880OooO0o0.f81843OooOO0o.add(c24314OooO0oO);
                    }
                } else {
                    C24314OooO0oO c24314OooO0oO3 = c24348OooO0o09.f81999OooO0o0.f81880OooO0o0;
                    c24314OooO0oO.f81843OooOO0o.add(c24314OooO0oO3);
                    c24314OooO0oO3.f81842OooOO0O.add(c24314OooO0oO);
                    this.f81876OooO0O0.f81999OooO0o0.f81882OooO0oo.f81842OooOO0O.add(c24314OooO0oO);
                    this.f81876OooO0O0.f81999OooO0o0.f81874OooO.f81842OooOO0O.add(c24314OooO0oO);
                    c24314OooO0oO.f81834OooO0O0 = true;
                    c24314OooO0oO.f81842OooOO0O.add(c24312OooO0o2);
                    c24314OooO0oO.f81842OooOO0O.add(c24312OooO0o);
                    c24312OooO0o2.f81843OooOO0o.add(c24314OooO0oO);
                    c24312OooO0o.f81843OooOO0o.add(c24314OooO0oO);
                }
            }
        }
        C24348OooO0o0 c24348OooO0o011 = this.f81876OooO0O0;
        C24346OooO0Oo[] c24346OooO0OoArr2 = c24348OooO0o011.f82036OoooO0;
        C24346OooO0Oo c24346OooO0Oo4 = c24346OooO0OoArr2[0];
        C24346OooO0Oo c24346OooO0Oo5 = c24346OooO0Oo4.f81959OooO0o;
        if (c24346OooO0Oo5 != null && c24346OooO0OoArr2[1].f81959OooO0o != null) {
            if (c24348OooO0o011.OooOo()) {
                c24312OooO0o2.f81837OooO0o = this.f81876OooO0O0.f82036OoooO0[0].OooO0o0();
                c24312OooO0o.f81837OooO0o = -this.f81876OooO0O0.f82036OoooO0[1].OooO0o0();
                return;
            }
            C24312OooO0o c24312OooO0oOooO0oo5 = AbstractC24322OooOOOo.OooO0oo(this.f81876OooO0O0.f82036OoooO0[0]);
            C24312OooO0o c24312OooO0oOooO0oo6 = AbstractC24322OooOOOo.OooO0oo(this.f81876OooO0O0.f82036OoooO0[1]);
            if (c24312OooO0oOooO0oo5 != null) {
                c24312OooO0oOooO0oo5.OooO0O0(this);
            }
            if (c24312OooO0oOooO0oo6 != null) {
                c24312OooO0oOooO0oo6.OooO0O0(this);
            }
            this.f81883OooOO0 = AbstractC24322OooOOOo.OooO00o.f81884OooOo;
            return;
        }
        if (c24346OooO0Oo5 != null) {
            C24312OooO0o c24312OooO0oOooO0oo7 = AbstractC24322OooOOOo.OooO0oo(c24346OooO0Oo4);
            if (c24312OooO0oOooO0oo7 != null) {
                AbstractC24322OooOOOo.OooO0O0(c24312OooO0o2, c24312OooO0oOooO0oo7, this.f81876OooO0O0.f82036OoooO0[0].OooO0o0());
                OooO0OO(c24312OooO0o, c24312OooO0o2, 1, c24314OooO0oO);
                return;
            }
            return;
        }
        C24346OooO0Oo c24346OooO0Oo6 = c24346OooO0OoArr2[1];
        if (c24346OooO0Oo6.f81959OooO0o != null) {
            C24312OooO0o c24312OooO0oOooO0oo8 = AbstractC24322OooOOOo.OooO0oo(c24346OooO0Oo6);
            if (c24312OooO0oOooO0oo8 != null) {
                AbstractC24322OooOOOo.OooO0O0(c24312OooO0o, c24312OooO0oOooO0oo8, -this.f81876OooO0O0.f82036OoooO0[1].OooO0o0());
                OooO0OO(c24312OooO0o2, c24312OooO0o, -1, c24314OooO0oO);
                return;
            }
            return;
        }
        if ((c24348OooO0o011 instanceof C24342OooO) || (c24348OooO0o03 = c24348OooO0o011.f82054o000oOoO) == null) {
            return;
        }
        AbstractC24322OooOOOo.OooO0O0(c24312OooO0o2, c24348OooO0o03.f81997OooO0Oo.f81882OooO0oo, c24348OooO0o011.OooOOo());
        OooO0OO(c24312OooO0o, c24312OooO0o2, 1, c24314OooO0oO);
    }

    @Override // o0000oO.AbstractC24322OooOOOo
    public final void OooO0o() {
        this.f81877OooO0OO = null;
        this.f81882OooO0oo.OooO0OO();
        this.f81874OooO.OooO0OO();
        this.f81880OooO0o0.OooO0OO();
        this.f81881OooO0oO = false;
    }

    @Override // o0000oO.AbstractC24322OooOOOo
    public final void OooO0o0() {
        C24312OooO0o c24312OooO0o = this.f81882OooO0oo;
        if (c24312OooO0o.f81841OooOO0) {
            this.f81876OooO0O0.f82044OoooOoo = c24312OooO0o.f81839OooO0oO;
        }
    }

    @Override // o0000oO.AbstractC24322OooOOOo
    public final boolean OooOO0O() {
        return this.f81878OooO0Oo != C24348OooO0o0.OooO00o.f82065OooOoO0 || this.f81876OooO0O0.f82009OooOOo == 0;
    }

    public final void OooOOO() {
        this.f81881OooO0oO = false;
        C24312OooO0o c24312OooO0o = this.f81882OooO0oo;
        c24312OooO0o.OooO0OO();
        c24312OooO0o.f81841OooOO0 = false;
        C24312OooO0o c24312OooO0o2 = this.f81874OooO;
        c24312OooO0o2.OooO0OO();
        c24312OooO0o2.f81841OooOO0 = false;
        this.f81880OooO0o0.f81841OooOO0 = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f81876OooO0O0.f82053Ooooooo;
    }
}
