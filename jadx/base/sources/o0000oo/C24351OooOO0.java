package o0000oo;

import o0000.C24041OooO0Oo;
import o0000oo.C24348OooO0o0;

/* JADX INFO: renamed from: o0000oo.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24351OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final boolean[] f82115OooO00o = new boolean[3];

    public static void OooO00o(C24347OooO0o c24347OooO0o, C24041OooO0Oo c24041OooO0Oo, C24348OooO0o0 c24348OooO0o0) {
        c24348OooO0o0.f82007OooOOOO = -1;
        c24348OooO0o0.f82008OooOOOo = -1;
        C24348OooO0o0.OooO00o oooO00o = c24347OooO0o.f82039OoooOO0[0];
        C24348OooO0o0.OooO00o oooO00o2 = C24348OooO0o0.OooO00o.f82062OooOo;
        C24348OooO0o0.OooO00o oooO00o3 = C24348OooO0o0.OooO00o.f82064OooOoO;
        C24348OooO0o0.OooO00o[] oooO00oArr = c24348OooO0o0.f82039OoooOO0;
        if (oooO00o != oooO00o2 && oooO00oArr[0] == oooO00o3) {
            C24346OooO0Oo c24346OooO0Oo = c24348OooO0o0.f82029Oooo0O0;
            int i = c24346OooO0Oo.f81961OooO0oO;
            int iOooOOo0 = c24347OooO0o.OooOOo0();
            C24346OooO0Oo c24346OooO0Oo2 = c24348OooO0o0.f82032Oooo0o0;
            int i2 = iOooOOo0 - c24346OooO0Oo2.f81961OooO0oO;
            c24346OooO0Oo.f81954OooO = c24041OooO0Oo.OooOO0O(c24346OooO0Oo);
            c24346OooO0Oo2.f81954OooO = c24041OooO0Oo.OooOO0O(c24346OooO0Oo2);
            c24041OooO0Oo.OooO0Oo(c24346OooO0Oo.f81954OooO, i);
            c24041OooO0Oo.OooO0Oo(c24346OooO0Oo2.f81954OooO, i2);
            c24348OooO0o0.f82007OooOOOO = 2;
            c24348OooO0o0.f82044OoooOoo = i;
            int i3 = i2 - i;
            c24348OooO0o0.f82040OoooOOO = i3;
            int i4 = c24348OooO0o0.f82047OooooO0;
            if (i3 < i4) {
                c24348OooO0o0.f82040OoooOOO = i4;
            }
        }
        if (c24347OooO0o.f82039OoooOO0[1] == oooO00o2 || oooO00oArr[1] != oooO00o3) {
            return;
        }
        C24346OooO0Oo c24346OooO0Oo3 = c24348OooO0o0.f82030Oooo0OO;
        int i5 = c24346OooO0Oo3.f81961OooO0oO;
        int iOooOO0O = c24347OooO0o.OooOO0O();
        C24346OooO0Oo c24346OooO0Oo4 = c24348OooO0o0.f82031Oooo0o;
        int i6 = iOooOO0O - c24346OooO0Oo4.f81961OooO0oO;
        c24346OooO0Oo3.f81954OooO = c24041OooO0Oo.OooOO0O(c24346OooO0Oo3);
        c24346OooO0Oo4.f81954OooO = c24041OooO0Oo.OooOO0O(c24346OooO0Oo4);
        c24041OooO0Oo.OooO0Oo(c24346OooO0Oo3.f81954OooO, i5);
        c24041OooO0Oo.OooO0Oo(c24346OooO0Oo4.f81954OooO, i6);
        if (c24348OooO0o0.f82046Ooooo0o > 0 || c24348OooO0o0.f82052OoooooO == 8) {
            C24346OooO0Oo c24346OooO0Oo5 = c24348OooO0o0.f82033Oooo0oO;
            c24346OooO0Oo5.f81954OooO = c24041OooO0Oo.OooOO0O(c24346OooO0Oo5);
            c24041OooO0Oo.OooO0Oo(c24346OooO0Oo5.f81954OooO, c24348OooO0o0.f82046Ooooo0o + i5);
        }
        c24348OooO0o0.f82008OooOOOo = 2;
        c24348OooO0o0.f82045Ooooo00 = i5;
        int i7 = i6 - i5;
        c24348OooO0o0.f82041OoooOOo = i7;
        int i8 = c24348OooO0o0.f82048OooooOO;
        if (i7 < i8) {
            c24348OooO0o0.f82041OoooOOo = i8;
        }
    }

    public static final boolean OooO0O0(int i, int i2) {
        return (i & i2) == i2;
    }
}
