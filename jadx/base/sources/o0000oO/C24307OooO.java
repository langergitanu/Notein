package o0000oO;

import java.util.ArrayList;
import o0000oo.C24342OooO;
import o0000oo.C24348OooO0o0;
import o0000oo.C24350OooO0oo;

/* JADX INFO: renamed from: o0000oO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24307OooO {
    public static C24321OooOOOO OooO00o(C24348OooO0o0 c24348OooO0o0, int i, ArrayList<C24321OooOOOO> arrayList, C24321OooOOOO c24321OooOOOO) {
        int i2;
        int i3 = i == 0 ? c24348OooO0o0.f82058o00o0O : c24348OooO0o0.f82059o00ooo;
        if (i3 != -1 && (c24321OooOOOO == null || i3 != c24321OooOOOO.f81870OooO0O0)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                C24321OooOOOO c24321OooOOOO2 = arrayList.get(i4);
                if (c24321OooOOOO2.f81870OooO0O0 == i3) {
                    if (c24321OooOOOO != null) {
                        c24321OooOOOO.OooO0OO(i, c24321OooOOOO2);
                        arrayList.remove(c24321OooOOOO);
                    }
                    c24321OooOOOO = c24321OooOOOO2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return c24321OooOOOO;
        }
        if (c24321OooOOOO == null) {
            if (c24348OooO0o0 instanceof C24342OooO) {
                C24342OooO c24342OooO = (C24342OooO) c24348OooO0o0;
                int i5 = 0;
                while (true) {
                    if (i5 >= c24342OooO.f81931o00oO0o) {
                        i2 = -1;
                        break;
                    }
                    C24348OooO0o0 c24348OooO0o02 = c24342OooO.f81932oo000o[i5];
                    if ((i == 0 && (i2 = c24348OooO0o02.f82058o00o0O) != -1) || (i == 1 && (i2 = c24348OooO0o02.f82059o00ooo) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        C24321OooOOOO c24321OooOOOO3 = arrayList.get(i6);
                        if (c24321OooOOOO3.f81870OooO0O0 == i2) {
                            c24321OooOOOO = c24321OooOOOO3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (c24321OooOOOO == null) {
                c24321OooOOOO = new C24321OooOOOO();
                c24321OooOOOO.f81869OooO00o = new ArrayList<>();
                c24321OooOOOO.f81872OooO0Oo = null;
                c24321OooOOOO.f81873OooO0o0 = -1;
                int i7 = C24321OooOOOO.f81868OooO0o;
                C24321OooOOOO.f81868OooO0o = i7 + 1;
                c24321OooOOOO.f81870OooO0O0 = i7;
                c24321OooOOOO.f81871OooO0OO = i;
            }
            arrayList.add(c24321OooOOOO);
        }
        ArrayList<C24348OooO0o0> arrayList2 = c24321OooOOOO.f81869OooO00o;
        if (arrayList2.contains(c24348OooO0o0)) {
            return c24321OooOOOO;
        }
        arrayList2.add(c24348OooO0o0);
        if (c24348OooO0o0 instanceof C24350OooO0oo) {
            C24350OooO0oo c24350OooO0oo = (C24350OooO0oo) c24348OooO0o0;
            c24350OooO0oo.f82111o0ooOO0.OooO0OO(c24350OooO0oo.f82112o0ooOOo == 0 ? 1 : 0, arrayList, c24321OooOOOO);
        }
        int i8 = c24321OooOOOO.f81870OooO0O0;
        if (i == 0) {
            c24348OooO0o0.f82058o00o0O = i8;
            c24348OooO0o0.f82029Oooo0O0.OooO0OO(i, arrayList, c24321OooOOOO);
            c24348OooO0o0.f82032Oooo0o0.OooO0OO(i, arrayList, c24321OooOOOO);
        } else {
            c24348OooO0o0.f82059o00ooo = i8;
            c24348OooO0o0.f82030Oooo0OO.OooO0OO(i, arrayList, c24321OooOOOO);
            c24348OooO0o0.f82033Oooo0oO.OooO0OO(i, arrayList, c24321OooOOOO);
            c24348OooO0o0.f82031Oooo0o.OooO0OO(i, arrayList, c24321OooOOOO);
        }
        c24348OooO0o0.f82037OoooO00.OooO0OO(i, arrayList, c24321OooOOOO);
        return c24321OooOOOO;
    }

    public static boolean OooO0O0(C24348OooO0o0.OooO00o oooO00o, C24348OooO0o0.OooO00o oooO00o2, C24348OooO0o0.OooO00o oooO00o3, C24348OooO0o0.OooO00o oooO00o4) {
        C24348OooO0o0.OooO00o oooO00o5 = C24348OooO0o0.OooO00o.f82063OooOo0o;
        C24348OooO0o0.OooO00o oooO00o6 = C24348OooO0o0.OooO00o.f82064OooOoO;
        C24348OooO0o0.OooO00o oooO00o7 = C24348OooO0o0.OooO00o.f82062OooOo;
        return (oooO00o3 == oooO00o5 || oooO00o3 == oooO00o7 || (oooO00o3 == oooO00o6 && oooO00o != oooO00o7)) || (oooO00o4 == oooO00o5 || oooO00o4 == oooO00o7 || (oooO00o4 == oooO00o6 && oooO00o2 != oooO00o7));
    }
}
