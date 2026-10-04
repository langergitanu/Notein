package o0000oO;

import java.util.HashSet;
import java.util.Iterator;
import o0000oO.C24309OooO0O0;
import o0000oo.C24346OooO0Oo;
import o0000oo.C24347OooO0o;
import o0000oo.C24348OooO0o0;
import o0000oo.C24350OooO0oo;

/* JADX INFO: renamed from: o0000oO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24315OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C24309OooO0O0.OooO00o f81862OooO00o = new C24309OooO0O0.OooO00o();

    public static boolean OooO00o(C24348OooO0o0 c24348OooO0o0) {
        C24348OooO0o0.OooO00o[] oooO00oArr = c24348OooO0o0.f82039OoooOO0;
        C24348OooO0o0.OooO00o oooO00o = oooO00oArr[0];
        C24348OooO0o0.OooO00o oooO00o2 = oooO00oArr[1];
        C24348OooO0o0 c24348OooO0o02 = c24348OooO0o0.f82054o000oOoO;
        C24347OooO0o c24347OooO0o = c24348OooO0o02 != null ? (C24347OooO0o) c24348OooO0o02 : null;
        C24348OooO0o0.OooO00o oooO00o3 = C24348OooO0o0.OooO00o.f82063OooOo0o;
        if (c24347OooO0o != null) {
            C24348OooO0o0.OooO00o oooO00o4 = c24347OooO0o.f82039OoooOO0[0];
        }
        if (c24347OooO0o != null) {
            C24348OooO0o0.OooO00o oooO00o5 = c24347OooO0o.f82039OoooOO0[1];
        }
        C24348OooO0o0.OooO00o oooO00o6 = C24348OooO0o0.OooO00o.f82065OooOoO0;
        C24348OooO0o0.OooO00o oooO00o7 = C24348OooO0o0.OooO00o.f82062OooOo;
        boolean z = oooO00o == oooO00o3 || c24348OooO0o0.OooOoOO() || oooO00o == oooO00o7 || (oooO00o == oooO00o6 && c24348OooO0o0.f82009OooOOo == 0 && c24348OooO0o0.f82042OoooOo0 == 0.0f && c24348OooO0o0.OooOo00(0)) || (oooO00o == oooO00o6 && c24348OooO0o0.f82009OooOOo == 1 && c24348OooO0o0.OooOo0(0, c24348OooO0o0.OooOOo0()));
        boolean z2 = oooO00o2 == oooO00o3 || c24348OooO0o0.OooOoo0() || oooO00o2 == oooO00o7 || (oooO00o2 == oooO00o6 && c24348OooO0o0.f82011OooOOoo == 0 && c24348OooO0o0.f82042OoooOo0 == 0.0f && c24348OooO0o0.OooOo00(1)) || (oooO00o2 == oooO00o6 && c24348OooO0o0.f82011OooOOoo == 1 && c24348OooO0o0.OooOo0(1, c24348OooO0o0.OooOO0O()));
        return (c24348OooO0o0.f82042OoooOo0 > 0.0f && (z || z2)) || (z && z2);
    }

    public static void OooO0O0(int i, C24309OooO0O0.InterfaceC19609OooO0O0 interfaceC19609OooO0O0, C24348OooO0o0 c24348OooO0o0, boolean z) {
        C24346OooO0Oo c24346OooO0Oo;
        C24346OooO0Oo c24346OooO0Oo2;
        char c;
        C24346OooO0Oo c24346OooO0Oo3;
        C24346OooO0Oo c24346OooO0Oo4;
        if (c24348OooO0o0.f82006OooOOO0) {
            return;
        }
        if (!(c24348OooO0o0 instanceof C24347OooO0o) && c24348OooO0o0.OooOoO() && OooO00o(c24348OooO0o0)) {
            C24347OooO0o.o000oOoO(c24348OooO0o0, interfaceC19609OooO0O0, new C24309OooO0O0.OooO00o());
        }
        C24346OooO0Oo c24346OooO0OoOooO = c24348OooO0o0.OooO(C24346OooO0Oo.OooO00o.f81964OooOo0o);
        C24346OooO0Oo c24346OooO0OoOooO2 = c24348OooO0o0.OooO(C24346OooO0Oo.OooO00o.f81966OooOoO0);
        int iOooO0Oo = c24346OooO0OoOooO.OooO0Oo();
        int iOooO0Oo2 = c24346OooO0OoOooO2.OooO0Oo();
        HashSet<C24346OooO0Oo> hashSet = c24346OooO0OoOooO.f81955OooO00o;
        C24348OooO0o0.OooO00o oooO00o = C24348OooO0o0.OooO00o.f82065OooOoO0;
        if (hashSet != null && c24346OooO0OoOooO.f81957OooO0OO) {
            Iterator<C24346OooO0Oo> it = hashSet.iterator();
            while (it.hasNext()) {
                C24346OooO0Oo next = it.next();
                C24348OooO0o0 c24348OooO0o02 = next.f81958OooO0Oo;
                int i2 = i + 1;
                boolean zOooO00o = OooO00o(c24348OooO0o02);
                if (c24348OooO0o02.OooOoO() && zOooO00o) {
                    c = 0;
                    C24347OooO0o.o000oOoO(c24348OooO0o02, interfaceC19609OooO0O0, new C24309OooO0O0.OooO00o());
                } else {
                    c = 0;
                }
                C24346OooO0Oo c24346OooO0Oo5 = c24348OooO0o02.f82029Oooo0O0;
                C24346OooO0Oo c24346OooO0Oo6 = c24348OooO0o02.f82032Oooo0o0;
                char c2 = ((next == c24346OooO0Oo5 && (c24346OooO0Oo4 = c24346OooO0Oo6.f81959OooO0o) != null && c24346OooO0Oo4.f81957OooO0OO) || (next == c24346OooO0Oo6 && (c24346OooO0Oo3 = c24346OooO0Oo5.f81959OooO0o) != null && c24346OooO0Oo3.f81957OooO0OO)) ? (char) 1 : c;
                C24348OooO0o0.OooO00o oooO00o2 = c24348OooO0o02.f82039OoooOO0[c];
                if (oooO00o2 != oooO00o || zOooO00o) {
                    if (!c24348OooO0o02.OooOoO()) {
                        if (next == c24346OooO0Oo5 && c24346OooO0Oo6.f81959OooO0o == null) {
                            int iOooO0o0 = c24346OooO0Oo5.OooO0o0() + iOooO0Oo;
                            c24348OooO0o02.Oooo0O0(iOooO0o0, c24348OooO0o02.OooOOo0() + iOooO0o0);
                            OooO0O0(i2, interfaceC19609OooO0O0, c24348OooO0o02, z);
                        } else if (next == c24346OooO0Oo6 && c24346OooO0Oo5.f81959OooO0o == null) {
                            int iOooO0o02 = iOooO0Oo - c24346OooO0Oo6.OooO0o0();
                            c24348OooO0o02.Oooo0O0(iOooO0o02 - c24348OooO0o02.OooOOo0(), iOooO0o02);
                            OooO0O0(i2, interfaceC19609OooO0O0, c24348OooO0o02, z);
                        } else if (c2 != 0 && !c24348OooO0o02.OooOo()) {
                            OooO0OO(i2, interfaceC19609OooO0O0, c24348OooO0o02, z);
                        }
                    }
                } else if (oooO00o2 == oooO00o && c24348OooO0o02.f82015OooOo0O >= 0 && c24348OooO0o02.f82013OooOo0 >= 0 && (c24348OooO0o02.f82052OoooooO == 8 || (c24348OooO0o02.f82009OooOOo == 0 && c24348OooO0o02.f82042OoooOo0 == 0.0f))) {
                    if (!c24348OooO0o02.OooOo() && !c24348OooO0o02.f82027Oooo00O && c2 != 0 && !c24348OooO0o02.OooOo()) {
                        OooO0Oo(i2, c24348OooO0o0, interfaceC19609OooO0O0, c24348OooO0o02, z);
                    }
                }
            }
        }
        if (c24348OooO0o0 instanceof C24350OooO0oo) {
            return;
        }
        HashSet<C24346OooO0Oo> hashSet2 = c24346OooO0OoOooO2.f81955OooO00o;
        if (hashSet2 != null && c24346OooO0OoOooO2.f81957OooO0OO) {
            Iterator<C24346OooO0Oo> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C24346OooO0Oo next2 = it2.next();
                C24348OooO0o0 c24348OooO0o03 = next2.f81958OooO0Oo;
                int i3 = i + 1;
                boolean zOooO00o2 = OooO00o(c24348OooO0o03);
                if (c24348OooO0o03.OooOoO() && zOooO00o2) {
                    C24347OooO0o.o000oOoO(c24348OooO0o03, interfaceC19609OooO0O0, new C24309OooO0O0.OooO00o());
                }
                C24346OooO0Oo c24346OooO0Oo7 = c24348OooO0o03.f82029Oooo0O0;
                C24346OooO0Oo c24346OooO0Oo8 = c24348OooO0o03.f82032Oooo0o0;
                boolean z2 = (next2 == c24346OooO0Oo7 && (c24346OooO0Oo2 = c24346OooO0Oo8.f81959OooO0o) != null && c24346OooO0Oo2.f81957OooO0OO) || (next2 == c24346OooO0Oo8 && (c24346OooO0Oo = c24346OooO0Oo7.f81959OooO0o) != null && c24346OooO0Oo.f81957OooO0OO);
                C24348OooO0o0.OooO00o oooO00o3 = c24348OooO0o03.f82039OoooOO0[0];
                if (oooO00o3 != oooO00o || zOooO00o2) {
                    if (!c24348OooO0o03.OooOoO()) {
                        if (next2 == c24346OooO0Oo7 && c24346OooO0Oo8.f81959OooO0o == null) {
                            int iOooO0o03 = c24346OooO0Oo7.OooO0o0() + iOooO0Oo2;
                            c24348OooO0o03.Oooo0O0(iOooO0o03, c24348OooO0o03.OooOOo0() + iOooO0o03);
                            OooO0O0(i3, interfaceC19609OooO0O0, c24348OooO0o03, z);
                        } else if (next2 == c24346OooO0Oo8 && c24346OooO0Oo7.f81959OooO0o == null) {
                            int iOooO0o04 = iOooO0Oo2 - c24346OooO0Oo8.OooO0o0();
                            c24348OooO0o03.Oooo0O0(iOooO0o04 - c24348OooO0o03.OooOOo0(), iOooO0o04);
                            OooO0O0(i3, interfaceC19609OooO0O0, c24348OooO0o03, z);
                        } else if (z2 && !c24348OooO0o03.OooOo()) {
                            OooO0OO(i3, interfaceC19609OooO0O0, c24348OooO0o03, z);
                        }
                    }
                } else if (oooO00o3 == oooO00o && c24348OooO0o03.f82015OooOo0O >= 0 && c24348OooO0o03.f82013OooOo0 >= 0) {
                    if (c24348OooO0o03.f82052OoooooO == 8 || (c24348OooO0o03.f82009OooOOo == 0 && c24348OooO0o03.f82042OoooOo0 == 0.0f)) {
                        if (!c24348OooO0o03.OooOo() && !c24348OooO0o03.f82027Oooo00O && z2 && !c24348OooO0o03.OooOo()) {
                            OooO0Oo(i3, c24348OooO0o0, interfaceC19609OooO0O0, c24348OooO0o03, z);
                        }
                    }
                }
            }
        }
        c24348OooO0o0.f82006OooOOO0 = true;
    }

    public static void OooO0OO(int i, C24309OooO0O0.InterfaceC19609OooO0O0 interfaceC19609OooO0O0, C24348OooO0o0 c24348OooO0o0, boolean z) {
        float f = c24348OooO0o0.f82049OooooOo;
        C24346OooO0Oo c24346OooO0Oo = c24348OooO0o0.f82029Oooo0O0;
        int iOooO0Oo = c24346OooO0Oo.f81959OooO0o.OooO0Oo();
        C24346OooO0Oo c24346OooO0Oo2 = c24348OooO0o0.f82032Oooo0o0;
        int iOooO0Oo2 = c24346OooO0Oo2.f81959OooO0o.OooO0Oo();
        int iOooO0o0 = c24346OooO0Oo.OooO0o0() + iOooO0Oo;
        int iOooO0o02 = iOooO0Oo2 - c24346OooO0Oo2.OooO0o0();
        if (iOooO0Oo == iOooO0Oo2) {
            f = 0.5f;
        } else {
            iOooO0Oo = iOooO0o0;
            iOooO0Oo2 = iOooO0o02;
        }
        int iOooOOo0 = c24348OooO0o0.OooOOo0();
        int i2 = (iOooO0Oo2 - iOooO0Oo) - iOooOOo0;
        if (iOooO0Oo > iOooO0Oo2) {
            i2 = (iOooO0Oo - iOooO0Oo2) - iOooOOo0;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iOooO0Oo;
        int i4 = i3 + iOooOOo0;
        if (iOooO0Oo > iOooO0Oo2) {
            i4 = i3 - iOooOOo0;
        }
        c24348OooO0o0.Oooo0O0(i3, i4);
        OooO0O0(i + 1, interfaceC19609OooO0O0, c24348OooO0o0, z);
    }

    public static void OooO0Oo(int i, C24348OooO0o0 c24348OooO0o0, C24309OooO0O0.InterfaceC19609OooO0O0 interfaceC19609OooO0O0, C24348OooO0o0 c24348OooO0o02, boolean z) {
        float f = c24348OooO0o02.f82049OooooOo;
        C24346OooO0Oo c24346OooO0Oo = c24348OooO0o02.f82029Oooo0O0;
        int iOooO0o0 = c24346OooO0Oo.OooO0o0() + c24346OooO0Oo.f81959OooO0o.OooO0Oo();
        C24346OooO0Oo c24346OooO0Oo2 = c24348OooO0o02.f82032Oooo0o0;
        int iOooO0Oo = c24346OooO0Oo2.f81959OooO0o.OooO0Oo() - c24346OooO0Oo2.OooO0o0();
        if (iOooO0Oo >= iOooO0o0) {
            int iOooOOo0 = c24348OooO0o02.OooOOo0();
            if (c24348OooO0o02.f82052OoooooO != 8) {
                int i2 = c24348OooO0o02.f82009OooOOo;
                if (i2 == 2) {
                    iOooOOo0 = (int) (c24348OooO0o02.f82049OooooOo * 0.5f * (c24348OooO0o0 instanceof C24347OooO0o ? c24348OooO0o0.OooOOo0() : c24348OooO0o0.f82054o000oOoO.OooOOo0()));
                } else if (i2 == 0) {
                    iOooOOo0 = iOooO0Oo - iOooO0o0;
                }
                iOooOOo0 = Math.max(c24348OooO0o02.f82013OooOo0, iOooOOo0);
                int i3 = c24348OooO0o02.f82015OooOo0O;
                if (i3 > 0) {
                    iOooOOo0 = Math.min(i3, iOooOOo0);
                }
            }
            int i4 = iOooO0o0 + ((int) ((f * ((iOooO0Oo - iOooO0o0) - iOooOOo0)) + 0.5f));
            c24348OooO0o02.Oooo0O0(i4, iOooOOo0 + i4);
            OooO0O0(i + 1, interfaceC19609OooO0O0, c24348OooO0o02, z);
        }
    }

    public static void OooO0o(int i, C24348OooO0o0 c24348OooO0o0, C24309OooO0O0.InterfaceC19609OooO0O0 interfaceC19609OooO0O0, C24348OooO0o0 c24348OooO0o02) {
        float f = c24348OooO0o02.f82051Oooooo0;
        C24346OooO0Oo c24346OooO0Oo = c24348OooO0o02.f82030Oooo0OO;
        int iOooO0o0 = c24346OooO0Oo.OooO0o0() + c24346OooO0Oo.f81959OooO0o.OooO0Oo();
        C24346OooO0Oo c24346OooO0Oo2 = c24348OooO0o02.f82031Oooo0o;
        int iOooO0Oo = c24346OooO0Oo2.f81959OooO0o.OooO0Oo() - c24346OooO0Oo2.OooO0o0();
        if (iOooO0Oo >= iOooO0o0) {
            int iOooOO0O = c24348OooO0o02.OooOO0O();
            if (c24348OooO0o02.f82052OoooooO != 8) {
                int i2 = c24348OooO0o02.f82011OooOOoo;
                if (i2 == 2) {
                    iOooOO0O = (int) (f * 0.5f * (c24348OooO0o0 instanceof C24347OooO0o ? c24348OooO0o0.OooOO0O() : c24348OooO0o0.f82054o000oOoO.OooOO0O()));
                } else if (i2 == 0) {
                    iOooOO0O = iOooO0Oo - iOooO0o0;
                }
                iOooOO0O = Math.max(c24348OooO0o02.f82012OooOo, iOooOO0O);
                int i3 = c24348OooO0o02.f82018OooOoO0;
                if (i3 > 0) {
                    iOooOO0O = Math.min(i3, iOooOO0O);
                }
            }
            int i4 = iOooO0o0 + ((int) ((f * ((iOooO0Oo - iOooO0o0) - iOooOO0O)) + 0.5f));
            c24348OooO0o02.Oooo0OO(i4, iOooOO0O + i4);
            OooO0oO(i + 1, interfaceC19609OooO0O0, c24348OooO0o02);
        }
    }

    public static void OooO0o0(int i, C24309OooO0O0.InterfaceC19609OooO0O0 interfaceC19609OooO0O0, C24348OooO0o0 c24348OooO0o0) {
        float f = c24348OooO0o0.f82051Oooooo0;
        C24346OooO0Oo c24346OooO0Oo = c24348OooO0o0.f82030Oooo0OO;
        int iOooO0Oo = c24346OooO0Oo.f81959OooO0o.OooO0Oo();
        C24346OooO0Oo c24346OooO0Oo2 = c24348OooO0o0.f82031Oooo0o;
        int iOooO0Oo2 = c24346OooO0Oo2.f81959OooO0o.OooO0Oo();
        int iOooO0o0 = c24346OooO0Oo.OooO0o0() + iOooO0Oo;
        int iOooO0o02 = iOooO0Oo2 - c24346OooO0Oo2.OooO0o0();
        if (iOooO0Oo == iOooO0Oo2) {
            f = 0.5f;
        } else {
            iOooO0Oo = iOooO0o0;
            iOooO0Oo2 = iOooO0o02;
        }
        int iOooOO0O = c24348OooO0o0.OooOO0O();
        int i2 = (iOooO0Oo2 - iOooO0Oo) - iOooOO0O;
        if (iOooO0Oo > iOooO0Oo2) {
            i2 = (iOooO0Oo - iOooO0Oo2) - iOooOO0O;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = iOooO0Oo + i3;
        int i5 = i4 + iOooOO0O;
        if (iOooO0Oo > iOooO0Oo2) {
            i4 = iOooO0Oo - i3;
            i5 = i4 - iOooOO0O;
        }
        c24348OooO0o0.Oooo0OO(i4, i5);
        OooO0oO(i + 1, interfaceC19609OooO0O0, c24348OooO0o0);
    }

    public static void OooO0oO(int i, C24309OooO0O0.InterfaceC19609OooO0O0 interfaceC19609OooO0O0, C24348OooO0o0 c24348OooO0o0) {
        boolean z;
        C24346OooO0Oo c24346OooO0Oo;
        C24346OooO0Oo c24346OooO0Oo2;
        C24346OooO0Oo c24346OooO0Oo3;
        C24346OooO0Oo c24346OooO0Oo4;
        if (c24348OooO0o0.f82005OooOOO) {
            return;
        }
        if (!(c24348OooO0o0 instanceof C24347OooO0o) && c24348OooO0o0.OooOoO() && OooO00o(c24348OooO0o0)) {
            C24347OooO0o.o000oOoO(c24348OooO0o0, interfaceC19609OooO0O0, new C24309OooO0O0.OooO00o());
        }
        C24346OooO0Oo c24346OooO0OoOooO = c24348OooO0o0.OooO(C24346OooO0Oo.OooO00o.f81963OooOo);
        C24346OooO0Oo c24346OooO0OoOooO2 = c24348OooO0o0.OooO(C24346OooO0Oo.OooO00o.f81965OooOoO);
        int iOooO0Oo = c24346OooO0OoOooO.OooO0Oo();
        int iOooO0Oo2 = c24346OooO0OoOooO2.OooO0Oo();
        HashSet<C24346OooO0Oo> hashSet = c24346OooO0OoOooO.f81955OooO00o;
        C24348OooO0o0.OooO00o oooO00o = C24348OooO0o0.OooO00o.f82065OooOoO0;
        if (hashSet != null && c24346OooO0OoOooO.f81957OooO0OO) {
            Iterator<C24346OooO0Oo> it = hashSet.iterator();
            while (it.hasNext()) {
                C24346OooO0Oo next = it.next();
                C24348OooO0o0 c24348OooO0o02 = next.f81958OooO0Oo;
                int i2 = i + 1;
                boolean zOooO00o = OooO00o(c24348OooO0o02);
                if (c24348OooO0o02.OooOoO() && zOooO00o) {
                    C24347OooO0o.o000oOoO(c24348OooO0o02, interfaceC19609OooO0O0, new C24309OooO0O0.OooO00o());
                }
                C24346OooO0Oo c24346OooO0Oo5 = c24348OooO0o02.f82030Oooo0OO;
                C24346OooO0Oo c24346OooO0Oo6 = c24348OooO0o02.f82031Oooo0o;
                boolean z2 = (next == c24346OooO0Oo5 && (c24346OooO0Oo4 = c24346OooO0Oo6.f81959OooO0o) != null && c24346OooO0Oo4.f81957OooO0OO) || (next == c24346OooO0Oo6 && (c24346OooO0Oo3 = c24346OooO0Oo5.f81959OooO0o) != null && c24346OooO0Oo3.f81957OooO0OO);
                C24348OooO0o0.OooO00o oooO00o2 = c24348OooO0o02.f82039OoooOO0[1];
                if (oooO00o2 != oooO00o || zOooO00o) {
                    if (!c24348OooO0o02.OooOoO()) {
                        if (next == c24346OooO0Oo5 && c24346OooO0Oo6.f81959OooO0o == null) {
                            int iOooO0o0 = c24346OooO0Oo5.OooO0o0() + iOooO0Oo;
                            c24348OooO0o02.Oooo0OO(iOooO0o0, c24348OooO0o02.OooOO0O() + iOooO0o0);
                            OooO0oO(i2, interfaceC19609OooO0O0, c24348OooO0o02);
                        } else if (next == c24346OooO0Oo6 && c24346OooO0Oo5.f81959OooO0o == null) {
                            int iOooO0o02 = iOooO0Oo - c24346OooO0Oo6.OooO0o0();
                            c24348OooO0o02.Oooo0OO(iOooO0o02 - c24348OooO0o02.OooOO0O(), iOooO0o02);
                            OooO0oO(i2, interfaceC19609OooO0O0, c24348OooO0o02);
                        } else if (z2 && !c24348OooO0o02.OooOoO0()) {
                            OooO0o0(i2, interfaceC19609OooO0O0, c24348OooO0o02);
                        }
                    }
                } else if (oooO00o2 == oooO00o && c24348OooO0o02.f82018OooOoO0 >= 0 && c24348OooO0o02.f82012OooOo >= 0 && (c24348OooO0o02.f82052OoooooO == 8 || (c24348OooO0o02.f82011OooOOoo == 0 && c24348OooO0o02.f82042OoooOo0 == 0.0f))) {
                    if (!c24348OooO0o02.OooOoO0() && !c24348OooO0o02.f82027Oooo00O && z2 && !c24348OooO0o02.OooOoO0()) {
                        OooO0o(i2, c24348OooO0o0, interfaceC19609OooO0O0, c24348OooO0o02);
                    }
                }
            }
        }
        boolean z3 = true;
        z3 = true;
        z3 = true;
        if (c24348OooO0o0 instanceof C24350OooO0oo) {
            return;
        }
        HashSet<C24346OooO0Oo> hashSet2 = c24346OooO0OoOooO2.f81955OooO00o;
        if (hashSet2 != null && c24346OooO0OoOooO2.f81957OooO0OO) {
            Iterator<C24346OooO0Oo> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C24346OooO0Oo next2 = it2.next();
                C24348OooO0o0 c24348OooO0o03 = next2.f81958OooO0Oo;
                int i3 = i + 1;
                boolean zOooO00o2 = OooO00o(c24348OooO0o03);
                if (c24348OooO0o03.OooOoO() && zOooO00o2) {
                    C24347OooO0o.o000oOoO(c24348OooO0o03, interfaceC19609OooO0O0, new C24309OooO0O0.OooO00o());
                }
                C24346OooO0Oo c24346OooO0Oo7 = c24348OooO0o03.f82030Oooo0OO;
                C24346OooO0Oo c24346OooO0Oo8 = c24348OooO0o03.f82031Oooo0o;
                boolean z4 = (next2 == c24346OooO0Oo7 && (c24346OooO0Oo2 = c24346OooO0Oo8.f81959OooO0o) != null && c24346OooO0Oo2.f81957OooO0OO) || (next2 == c24346OooO0Oo8 && (c24346OooO0Oo = c24346OooO0Oo7.f81959OooO0o) != null && c24346OooO0Oo.f81957OooO0OO);
                C24348OooO0o0.OooO00o oooO00o3 = c24348OooO0o03.f82039OoooOO0[1];
                if (oooO00o3 != oooO00o || zOooO00o2) {
                    if (!c24348OooO0o03.OooOoO()) {
                        if (next2 == c24346OooO0Oo7 && c24346OooO0Oo8.f81959OooO0o == null) {
                            int iOooO0o03 = c24346OooO0Oo7.OooO0o0() + iOooO0Oo2;
                            c24348OooO0o03.Oooo0OO(iOooO0o03, c24348OooO0o03.OooOO0O() + iOooO0o03);
                            OooO0oO(i3, interfaceC19609OooO0O0, c24348OooO0o03);
                        } else if (next2 == c24346OooO0Oo8 && c24346OooO0Oo7.f81959OooO0o == null) {
                            int iOooO0o04 = iOooO0Oo2 - c24346OooO0Oo8.OooO0o0();
                            c24348OooO0o03.Oooo0OO(iOooO0o04 - c24348OooO0o03.OooOO0O(), iOooO0o04);
                            OooO0oO(i3, interfaceC19609OooO0O0, c24348OooO0o03);
                        } else if (z4 && !c24348OooO0o03.OooOoO0()) {
                            OooO0o0(i3, interfaceC19609OooO0O0, c24348OooO0o03);
                        }
                    }
                } else if (oooO00o3 == oooO00o && c24348OooO0o03.f82018OooOoO0 >= 0 && c24348OooO0o03.f82012OooOo >= 0 && (c24348OooO0o03.f82052OoooooO == 8 || (c24348OooO0o03.f82011OooOOoo == 0 && c24348OooO0o03.f82042OoooOo0 == 0.0f))) {
                    if (!c24348OooO0o03.OooOoO0() && !c24348OooO0o03.f82027Oooo00O && z4 && !c24348OooO0o03.OooOoO0()) {
                        OooO0o(i3, c24348OooO0o0, interfaceC19609OooO0O0, c24348OooO0o03);
                    }
                }
            }
        }
        C24346OooO0Oo c24346OooO0OoOooO3 = c24348OooO0o0.OooO(C24346OooO0Oo.OooO00o.f81967OooOoOO);
        if (c24346OooO0OoOooO3.f81955OooO00o != null && c24346OooO0OoOooO3.f81957OooO0OO) {
            int iOooO0Oo3 = c24346OooO0OoOooO3.OooO0Oo();
            for (C24346OooO0Oo c24346OooO0Oo9 : c24346OooO0OoOooO3.f81955OooO00o) {
                C24348OooO0o0 c24348OooO0o04 = c24346OooO0Oo9.f81958OooO0Oo;
                int i4 = i + 1;
                boolean zOooO00o3 = OooO00o(c24348OooO0o04);
                if (c24348OooO0o04.OooOoO() && zOooO00o3) {
                    C24347OooO0o.o000oOoO(c24348OooO0o04, interfaceC19609OooO0O0, new C24309OooO0O0.OooO00o());
                }
                if (c24348OooO0o04.f82039OoooOO0[z3 ? 1 : 0] != oooO00o || zOooO00o3) {
                    if (!c24348OooO0o04.OooOoO()) {
                        C24346OooO0Oo c24346OooO0Oo10 = c24348OooO0o04.f82033Oooo0oO;
                        if (c24346OooO0Oo9 == c24346OooO0Oo10) {
                            int iOooO0o05 = c24346OooO0Oo9.OooO0o0() + iOooO0Oo3;
                            if (c24348OooO0o04.f82023OooOooo) {
                                int i5 = iOooO0o05 - c24348OooO0o04.f82046Ooooo0o;
                                int i6 = c24348OooO0o04.f82041OoooOOo + i5;
                                c24348OooO0o04.f82045Ooooo00 = i5;
                                c24348OooO0o04.f82030Oooo0OO.OooOO0o(i5);
                                c24348OooO0o04.f82031Oooo0o.OooOO0o(i6);
                                c24346OooO0Oo10.OooOO0o(iOooO0o05);
                                z = z3 ? 1 : 0;
                                c24348OooO0o04.f82004OooOO0o = z;
                            } else {
                                z = z3 ? 1 : 0;
                            }
                            OooO0oO(i4, interfaceC19609OooO0O0, c24348OooO0o04);
                        }
                        z3 = z;
                    }
                }
                z = z3 ? 1 : 0;
                z3 = z;
            }
        }
        c24348OooO0o0.f82005OooOOO = z3;
    }
}
