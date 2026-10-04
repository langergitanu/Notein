package OoooooO;

import OooO0O0.C20395OooO0o0;
import OooOoO.C20505OooO0OO;
import OooooOO.InterfaceC21370ooOO;
import OoooooO.AbstractC21410OooO0o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oO0O00oo.C32519OooO0oO;
import oO0O00oo.C32520OooO0oo;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: OoooooO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21422OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f62051OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f62052OooO0O0 = new OooO00o(0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f62053OooO0OO = new OooO00o(0);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f62054OooO0Oo = new OooO00o(0);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO00o f62055OooO0o0 = new OooO00o(0);

    /* JADX INFO: renamed from: OoooooO.OooO0oo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public float f62056OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f62057OooO0O0;

        public OooO00o() {
            this(0);
        }

        public final void OooO00o() {
            this.f62056OooO00o = 0.0f;
            this.f62057OooO0O0 = 0.0f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return Float.compare(this.f62056OooO00o, oooO00o.f62056OooO00o) == 0 && Float.compare(this.f62057OooO0O0, oooO00o.f62057OooO0O0) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f62057OooO0O0) + (Float.hashCode(this.f62056OooO00o) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PathPoint(x=");
            sb.append(this.f62056OooO00o);
            sb.append(", y=");
            return C20505OooO0OO.OooO0O0(sb, this.f62057OooO0O0, ')');
        }

        public OooO00o(int i) {
            this.f62056OooO00o = 0.0f;
            this.f62057OooO0O0 = 0.0f;
        }
    }

    public static void OooO0O0(InterfaceC21370ooOO interfaceC21370ooOO, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = (d7 / ((double) 180)) * 3.141592653589793d;
        double dCos = Math.cos(d10);
        double dSin = Math.sin(d10);
        double dOooO00o = OooO0O0.OooO0OO.OooO00o(d2, dSin, d * dCos, d5);
        double dOooO00o2 = OooO0O0.OooO0OO.OooO00o(d2, dCos, (-d) * dSin, d6);
        double dOooO00o3 = OooO0O0.OooO0OO.OooO00o(d4, dSin, d3 * dCos, d5);
        double dOooO00o4 = OooO0O0.OooO0OO.OooO00o(d4, dCos, (-d3) * dSin, d6);
        double d11 = dOooO00o - dOooO00o3;
        double d12 = dOooO00o2 - dOooO00o4;
        double d13 = 2;
        double d14 = (dOooO00o + dOooO00o3) / d13;
        double d15 = (dOooO00o2 + dOooO00o4) / d13;
        double d16 = (d12 * d12) + (d11 * d11);
        if (d16 == 0.0d) {
            return;
        }
        double d17 = (1.0d / d16) - 0.25d;
        if (d17 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d16) / 1.99999d);
            OooO0O0(interfaceC21370ooOO, d, d2, d3, d4, d5 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d17);
        double d18 = d11 * dSqrt2;
        double d19 = dSqrt2 * d12;
        if (z == z2) {
            d8 = d14 - d19;
            d9 = d15 + d18;
        } else {
            d8 = d14 + d19;
            d9 = d15 - d18;
        }
        double dAtan2 = Math.atan2(dOooO00o2 - d9, dOooO00o - d8);
        double dAtan22 = Math.atan2(dOooO00o4 - d9, dOooO00o3 - d8) - dAtan2;
        if (z2 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d20 = d8 * d5;
        double d21 = d9 * d6;
        double d22 = (d20 * dCos) - (d21 * dSin);
        double d23 = (d21 * dCos) + (d20 * dSin);
        double d24 = 4;
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * d24) / 3.141592653589793d));
        double dCos2 = Math.cos(d10);
        double dSin2 = Math.sin(d10);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d25 = dCos2;
        double d26 = -d5;
        double d27 = d26 * d25;
        double d28 = d6 * dSin2;
        double d29 = (d27 * dSin3) - (d28 * dCos3);
        double d30 = d26 * dSin2;
        double d31 = d6 * d25;
        double d32 = (dCos3 * d31) + (dSin3 * d30);
        double d33 = dAtan22 / ((double) iCeil);
        double d34 = d2;
        double d35 = dAtan2;
        int i = 0;
        double d36 = d;
        while (i < iCeil) {
            double d37 = d35 + d33;
            double dSin4 = Math.sin(d37);
            double dCos4 = Math.cos(d37);
            double d38 = d25;
            double d39 = d22;
            int i2 = i;
            double dOooO00o5 = C20395OooO0o0.OooO00o(d5, d38, dCos4, d39) - (d28 * dSin4);
            double d40 = d13;
            double dOooO00o6 = (d31 * dSin4) + C20395OooO0o0.OooO00o(d5, dSin2, dCos4, d23);
            double d41 = (d27 * dSin4) - (d28 * dCos4);
            double d42 = (dCos4 * d31) + (dSin4 * d30);
            double d43 = d37 - d35;
            double dTan = Math.tan(d43 / d40);
            double d44 = d24;
            double dSqrt3 = ((Math.sqrt(C20395OooO0o0.OooO00o(dTan, 3.0d, dTan, d44)) - ((double) 1)) * Math.sin(d43)) / ((double) 3);
            interfaceC21370ooOO.OooO00o((float) ((d29 * dSqrt3) + d36), (float) ((d32 * dSqrt3) + d34), (float) (dOooO00o5 - (dSqrt3 * d41)), (float) (dOooO00o6 - (dSqrt3 * d42)), (float) dOooO00o5, (float) dOooO00o6);
            i = i2 + 1;
            d36 = dOooO00o5;
            d34 = dOooO00o6;
            d29 = d41;
            d35 = d37;
            d32 = d42;
            d22 = d39;
            d25 = d38;
            d24 = d44;
            iCeil = iCeil;
            d13 = d40;
        }
    }

    public final void OooO00o(char c, float[] fArr) {
        List listOooO0oO;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5 = this.f62051OooO00o;
        if (c == 'z' || c == 'Z') {
            listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(AbstractC21410OooO0o.OooO0O0.f61980OooO0OO);
        } else {
            if (c == 'm') {
                C32519OooO0oO c32519OooO0oOOooO0oo = oO0O00oo.OooOO0.OooO0oo(new oO0O00oo.OooO(0, fArr.length - 2, 1), 2);
                arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(c32519OooO0oOOooO0oo, 10));
                Iterator<Integer> it = c32519OooO0oOOooO0oo.iterator();
                while (((C32520OooO0oo) it).f116817OooOoO0) {
                    int iNextInt = ((oOo000Oo.Oooo000) it).nextInt();
                    float[] fArrOooOO0o = Oooo.OooO0OO.OooOO0o(fArr, iNextInt, iNextInt + 2);
                    float f = fArrOooOO0o[0];
                    float f2 = fArrOooOO0o[1];
                    AbstractC21410OooO0o oooOOO = new AbstractC21410OooO0o.OooOOO(f, f2);
                    if (iNextInt > 0) {
                        oooOOO = new AbstractC21410OooO0o.OooOOO0(f, f2);
                    }
                    arrayList2.add(oooOOO);
                }
            } else if (c == 'M') {
                C32519OooO0oO c32519OooO0oOOooO0oo2 = oO0O00oo.OooOO0.OooO0oo(new oO0O00oo.OooO(0, fArr.length - 2, 1), 2);
                arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(c32519OooO0oOOooO0oo2, 10));
                Iterator<Integer> it2 = c32519OooO0oOOooO0oo2.iterator();
                while (((C32520OooO0oo) it2).f116817OooOoO0) {
                    int iNextInt2 = ((oOo000Oo.Oooo000) it2).nextInt();
                    float[] fArrOooOO0o2 = Oooo.OooO0OO.OooOO0o(fArr, iNextInt2, iNextInt2 + 2);
                    float f3 = fArrOooOO0o2[0];
                    float f4 = fArrOooOO0o2[1];
                    AbstractC21410OooO0o c18988OooO0o = new AbstractC21410OooO0o.C18988OooO0o(f3, f4);
                    if (iNextInt2 > 0) {
                        c18988OooO0o = new AbstractC21410OooO0o.C21412OooO0o0(f3, f4);
                    }
                    arrayList2.add(c18988OooO0o);
                }
            } else if (c == 'l') {
                C32519OooO0oO c32519OooO0oOOooO0oo3 = oO0O00oo.OooOO0.OooO0oo(new oO0O00oo.OooO(0, fArr.length - 2, 1), 2);
                arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(c32519OooO0oOOooO0oo3, 10));
                Iterator<Integer> it3 = c32519OooO0oOOooO0oo3.iterator();
                while (((C32520OooO0oo) it3).f116817OooOoO0) {
                    int iNextInt3 = ((oOo000Oo.Oooo000) it3).nextInt();
                    float[] fArrOooOO0o3 = Oooo.OooO0OO.OooOO0o(fArr, iNextInt3, iNextInt3 + 2);
                    arrayList2.add(new AbstractC21410OooO0o.OooOOO0(fArrOooOO0o3[0], fArrOooOO0o3[1]));
                }
            } else if (c == 'L') {
                C32519OooO0oO c32519OooO0oOOooO0oo4 = oO0O00oo.OooOO0.OooO0oo(new oO0O00oo.OooO(0, fArr.length - 2, 1), 2);
                arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(c32519OooO0oOOooO0oo4, 10));
                Iterator<Integer> it4 = c32519OooO0oOOooO0oo4.iterator();
                while (((C32520OooO0oo) it4).f116817OooOoO0) {
                    int iNextInt4 = ((oOo000Oo.Oooo000) it4).nextInt();
                    float[] fArrOooOO0o4 = Oooo.OooO0OO.OooOO0o(fArr, iNextInt4, iNextInt4 + 2);
                    arrayList2.add(new AbstractC21410OooO0o.C21412OooO0o0(fArrOooOO0o4[0], fArrOooOO0o4[1]));
                }
            } else {
                if (c == 'h') {
                    C32519OooO0oO c32519OooO0oOOooO0oo5 = oO0O00oo.OooOO0.OooO0oo(new oO0O00oo.OooO(0, fArr.length - 1, 1), 1);
                    arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(c32519OooO0oOOooO0oo5, 10));
                    Iterator<Integer> it5 = c32519OooO0oOOooO0oo5.iterator();
                    while (((C32520OooO0oo) it5).f116817OooOoO0) {
                        int iNextInt5 = ((oOo000Oo.Oooo000) it5).nextInt();
                        arrayList4.add(new AbstractC21410OooO0o.C21415OooOO0o(Oooo.OooO0OO.OooOO0o(fArr, iNextInt5, iNextInt5 + 1)[0]));
                    }
                } else if (c == 'H') {
                    C32519OooO0oO c32519OooO0oOOooO0oo6 = oO0O00oo.OooOO0.OooO0oo(new oO0O00oo.OooO(0, fArr.length - 1, 1), 1);
                    arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(c32519OooO0oOOooO0oo6, 10));
                    Iterator<Integer> it6 = c32519OooO0oOOooO0oo6.iterator();
                    while (((C32520OooO0oo) it6).f116817OooOoO0) {
                        int iNextInt6 = ((oOo000Oo.Oooo000) it6).nextInt();
                        arrayList4.add(new AbstractC21410OooO0o.C21411OooO0Oo(Oooo.OooO0OO.OooOO0o(fArr, iNextInt6, iNextInt6 + 1)[0]));
                    }
                } else if (c == 'v') {
                    C32519OooO0oO c32519OooO0oOOooO0oo7 = oO0O00oo.OooOO0.OooO0oo(new oO0O00oo.OooO(0, fArr.length - 1, 1), 1);
                    arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(c32519OooO0oOOooO0oo7, 10));
                    Iterator<Integer> it7 = c32519OooO0oOOooO0oo7.iterator();
                    while (((C32520OooO0oo) it7).f116817OooOoO0) {
                        int iNextInt7 = ((oOo000Oo.Oooo000) it7).nextInt();
                        arrayList4.add(new AbstractC21410OooO0o.C21417OooOOo(Oooo.OooO0OO.OooOO0o(fArr, iNextInt7, iNextInt7 + 1)[0]));
                    }
                } else if (c == 'V') {
                    C32519OooO0oO c32519OooO0oOOooO0oo8 = oO0O00oo.OooOO0.OooO0oo(new oO0O00oo.OooO(0, fArr.length - 1, 1), 1);
                    arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(c32519OooO0oOOooO0oo8, 10));
                    Iterator<Integer> it8 = c32519OooO0oOOooO0oo8.iterator();
                    while (((C32520OooO0oo) it8).f116817OooOoO0) {
                        int iNextInt8 = ((oOo000Oo.Oooo000) it8).nextInt();
                        arrayList4.add(new AbstractC21410OooO0o.C21419OooOOoo(Oooo.OooO0OO.OooOO0o(fArr, iNextInt8, iNextInt8 + 1)[0]));
                    }
                } else {
                    if (c == 'c') {
                        C32519OooO0oO c32519OooO0oOOooO0oo9 = oO0O00oo.OooOO0.OooO0oo(new oO0O00oo.OooO(0, fArr.length - 6, 1), 6);
                        arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(c32519OooO0oOOooO0oo9, 10));
                        Iterator<Integer> it9 = c32519OooO0oOOooO0oo9.iterator();
                        while (((C32520OooO0oo) it9).f116817OooOoO0) {
                            int iNextInt9 = ((oOo000Oo.Oooo000) it9).nextInt();
                            float[] fArrOooOO0o5 = Oooo.OooO0OO.OooOO0o(fArr, iNextInt9, iNextInt9 + 6);
                            arrayList3.add(new AbstractC21410OooO0o.OooOO0O(fArrOooOO0o5[0], fArrOooOO0o5[1], fArrOooOO0o5[2], fArrOooOO0o5[3], fArrOooOO0o5[4], fArrOooOO0o5[5]));
                        }
                    } else if (c == 'C') {
                        C32519OooO0oO c32519OooO0oOOooO0oo10 = oO0O00oo.OooOO0.OooO0oo(new oO0O00oo.OooO(0, fArr.length - 6, 1), 6);
                        arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(c32519OooO0oOOooO0oo10, 10));
                        Iterator<Integer> it10 = c32519OooO0oOOooO0oo10.iterator();
                        while (((C32520OooO0oo) it10).f116817OooOoO0) {
                            int iNextInt10 = ((oOo000Oo.Oooo000) it10).nextInt();
                            float[] fArrOooOO0o6 = Oooo.OooO0OO.OooOO0o(fArr, iNextInt10, iNextInt10 + 6);
                            arrayList3.add(new AbstractC21410OooO0o.OooO0OO(fArrOooOO0o6[0], fArrOooOO0o6[1], fArrOooOO0o6[2], fArrOooOO0o6[3], fArrOooOO0o6[4], fArrOooOO0o6[5]));
                        }
                    } else if (c == 's') {
                        C32519OooO0oO c32519OooO0oOOooO0oo11 = oO0O00oo.OooOO0.OooO0oo(new oO0O00oo.OooO(0, fArr.length - 4, 1), 4);
                        arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(c32519OooO0oOOooO0oo11, 10));
                        Iterator<Integer> it11 = c32519OooO0oOOooO0oo11.iterator();
                        while (((C32520OooO0oo) it11).f116817OooOoO0) {
                            int iNextInt11 = ((oOo000Oo.Oooo000) it11).nextInt();
                            float[] fArrOooOO0o7 = Oooo.OooO0OO.OooOO0o(fArr, iNextInt11, iNextInt11 + 4);
                            arrayList3.add(new AbstractC21410OooO0o.C21416OooOOOo(fArrOooOO0o7[0], fArrOooOO0o7[1], fArrOooOO0o7[2], fArrOooOO0o7[3]));
                        }
                    } else if (c == 'S') {
                        C32519OooO0oO c32519OooO0oOOooO0oo12 = oO0O00oo.OooOO0.OooO0oo(new oO0O00oo.OooO(0, fArr.length - 4, 1), 4);
                        arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(c32519OooO0oOOooO0oo12, 10));
                        Iterator<Integer> it12 = c32519OooO0oOOooO0oo12.iterator();
                        while (((C32520OooO0oo) it12).f116817OooOoO0) {
                            int iNextInt12 = ((oOo000Oo.Oooo000) it12).nextInt();
                            float[] fArrOooOO0o8 = Oooo.OooO0OO.OooOO0o(fArr, iNextInt12, iNextInt12 + 4);
                            arrayList3.add(new AbstractC21410OooO0o.C21414OooO0oo(fArrOooOO0o8[0], fArrOooOO0o8[1], fArrOooOO0o8[2], fArrOooOO0o8[3]));
                        }
                    } else if (c == 'q') {
                        C32519OooO0oO c32519OooO0oOOooO0oo13 = oO0O00oo.OooOO0.OooO0oo(new oO0O00oo.OooO(0, fArr.length - 4, 1), 4);
                        arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(c32519OooO0oOOooO0oo13, 10));
                        Iterator<Integer> it13 = c32519OooO0oOOooO0oo13.iterator();
                        while (((C32520OooO0oo) it13).f116817OooOoO0) {
                            int iNextInt13 = ((oOo000Oo.Oooo000) it13).nextInt();
                            float[] fArrOooOO0o9 = Oooo.OooO0OO.OooOO0o(fArr, iNextInt13, iNextInt13 + 4);
                            arrayList3.add(new AbstractC21410OooO0o.OooOOOO(fArrOooOO0o9[0], fArrOooOO0o9[1], fArrOooOO0o9[2], fArrOooOO0o9[3]));
                        }
                    } else if (c == 'Q') {
                        C32519OooO0oO c32519OooO0oOOooO0oo14 = oO0O00oo.OooOO0.OooO0oo(new oO0O00oo.OooO(0, fArr.length - 4, 1), 4);
                        arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(c32519OooO0oOOooO0oo14, 10));
                        Iterator<Integer> it14 = c32519OooO0oOOooO0oo14.iterator();
                        while (((C32520OooO0oo) it14).f116817OooOoO0) {
                            int iNextInt14 = ((oOo000Oo.Oooo000) it14).nextInt();
                            float[] fArrOooOO0o10 = Oooo.OooO0OO.OooOO0o(fArr, iNextInt14, iNextInt14 + 4);
                            arrayList3.add(new AbstractC21410OooO0o.C21413OooO0oO(fArrOooOO0o10[0], fArrOooOO0o10[1], fArrOooOO0o10[2], fArrOooOO0o10[3]));
                        }
                    } else if (c == 't') {
                        C32519OooO0oO c32519OooO0oOOooO0oo15 = oO0O00oo.OooOO0.OooO0oo(new oO0O00oo.OooO(0, fArr.length - 2, 1), 2);
                        arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(c32519OooO0oOOooO0oo15, 10));
                        Iterator<Integer> it15 = c32519OooO0oOOooO0oo15.iterator();
                        while (((C32520OooO0oo) it15).f116817OooOoO0) {
                            int iNextInt15 = ((oOo000Oo.Oooo000) it15).nextInt();
                            float[] fArrOooOO0o11 = Oooo.OooO0OO.OooOO0o(fArr, iNextInt15, iNextInt15 + 2);
                            arrayList2.add(new AbstractC21410OooO0o.C21418OooOOo0(fArrOooOO0o11[0], fArrOooOO0o11[1]));
                        }
                    } else if (c == 'T') {
                        C32519OooO0oO c32519OooO0oOOooO0oo16 = oO0O00oo.OooOO0.OooO0oo(new oO0O00oo.OooO(0, fArr.length - 2, 1), 2);
                        arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(c32519OooO0oOOooO0oo16, 10));
                        Iterator<Integer> it16 = c32519OooO0oOOooO0oo16.iterator();
                        while (((C32520OooO0oo) it16).f116817OooOoO0) {
                            int iNextInt16 = ((oOo000Oo.Oooo000) it16).nextInt();
                            float[] fArrOooOO0o12 = Oooo.OooO0OO.OooOO0o(fArr, iNextInt16, iNextInt16 + 2);
                            arrayList2.add(new AbstractC21410OooO0o.OooO(fArrOooOO0o12[0], fArrOooOO0o12[1]));
                        }
                    } else {
                        if (c == 'a') {
                            C32519OooO0oO c32519OooO0oOOooO0oo17 = oO0O00oo.OooOO0.OooO0oo(new oO0O00oo.OooO(0, fArr.length - 7, 1), 7);
                            arrayList = new ArrayList(C34428OooOOo.OooOOoo(c32519OooO0oOOooO0oo17, 10));
                            Iterator<Integer> it17 = c32519OooO0oOOooO0oo17.iterator();
                            while (((C32520OooO0oo) it17).f116817OooOoO0) {
                                int iNextInt17 = ((oOo000Oo.Oooo000) it17).nextInt();
                                float[] fArrOooOO0o13 = Oooo.OooO0OO.OooOO0o(fArr, iNextInt17, iNextInt17 + 7);
                                arrayList.add(new AbstractC21410OooO0o.OooOO0(fArrOooOO0o13[0], fArrOooOO0o13[1], fArrOooOO0o13[2], Float.compare(fArrOooOO0o13[3], 0.0f) != 0, Float.compare(fArrOooOO0o13[4], 0.0f) != 0, fArrOooOO0o13[5], fArrOooOO0o13[6]));
                            }
                        } else {
                            if (c != 'A') {
                                throw new IllegalArgumentException(C21421OooO0oO.OooO00o("Unknown command for: ", c));
                            }
                            C32519OooO0oO c32519OooO0oOOooO0oo18 = oO0O00oo.OooOO0.OooO0oo(new oO0O00oo.OooO(0, fArr.length - 7, 1), 7);
                            arrayList = new ArrayList(C34428OooOOo.OooOOoo(c32519OooO0oOOooO0oo18, 10));
                            Iterator<Integer> it18 = c32519OooO0oOOooO0oo18.iterator();
                            while (((C32520OooO0oo) it18).f116817OooOoO0) {
                                int iNextInt18 = ((oOo000Oo.Oooo000) it18).nextInt();
                                float[] fArrOooOO0o14 = Oooo.OooO0OO.OooOO0o(fArr, iNextInt18, iNextInt18 + 7);
                                arrayList.add(new AbstractC21410OooO0o.OooO00o(fArrOooOO0o14[0], fArrOooOO0o14[1], fArrOooOO0o14[2], Float.compare(fArrOooOO0o14[3], 0.0f) != 0, Float.compare(fArrOooOO0o14[4], 0.0f) != 0, fArrOooOO0o14[5], fArrOooOO0o14[6]));
                            }
                        }
                        listOooO0oO = arrayList;
                    }
                    listOooO0oO = arrayList3;
                }
                listOooO0oO = arrayList4;
            }
            listOooO0oO = arrayList2;
        }
        arrayList5.addAll(listOooO0oO);
    }

    public final void OooO0OO(InterfaceC21370ooOO interfaceC21370ooOO) {
        OooO00o oooO00o;
        OooO00o oooO00o2;
        OooO00o oooO00o3;
        ArrayList arrayList;
        int i;
        int i2;
        OooO00o oooO00o4;
        AbstractC21410OooO0o abstractC21410OooO0o;
        InterfaceC21370ooOO target = interfaceC21370ooOO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(target, "target");
        target.reset();
        OooO00o oooO00o5 = this.f62052OooO0O0;
        oooO00o5.OooO00o();
        OooO00o oooO00o6 = this.f62053OooO0OO;
        oooO00o6.OooO00o();
        OooO00o oooO00o7 = this.f62054OooO0Oo;
        oooO00o7.OooO00o();
        OooO00o oooO00o8 = this.f62055OooO0o0;
        oooO00o8.OooO00o();
        ArrayList arrayList2 = this.f62051OooO00o;
        int size = arrayList2.size();
        AbstractC21410OooO0o abstractC21410OooO0o2 = null;
        int i3 = 0;
        while (i3 < size) {
            AbstractC21410OooO0o abstractC21410OooO0o3 = (AbstractC21410OooO0o) arrayList2.get(i3);
            if (abstractC21410OooO0o2 == null) {
                abstractC21410OooO0o2 = abstractC21410OooO0o3;
            }
            if (abstractC21410OooO0o3 instanceof AbstractC21410OooO0o.OooO0O0) {
                oooO00o5.f62056OooO00o = oooO00o7.f62056OooO00o;
                oooO00o5.f62057OooO0O0 = oooO00o7.f62057OooO0O0;
                oooO00o6.f62056OooO00o = oooO00o7.f62056OooO00o;
                oooO00o6.f62057OooO0O0 = oooO00o7.f62057OooO0O0;
                target.close();
                target.moveTo(oooO00o5.f62056OooO00o, oooO00o5.f62057OooO0O0);
            } else if (abstractC21410OooO0o3 instanceof AbstractC21410OooO0o.OooOOO) {
                AbstractC21410OooO0o.OooOOO oooOOO = (AbstractC21410OooO0o.OooOOO) abstractC21410OooO0o3;
                float f = oooO00o5.f62056OooO00o;
                float f2 = oooOOO.f62014OooO0OO;
                oooO00o5.f62056OooO00o = f + f2;
                float f3 = oooO00o5.f62057OooO0O0;
                float f4 = oooOOO.f62015OooO0Oo;
                oooO00o5.f62057OooO0O0 = f3 + f4;
                target.OooO0O0(f2, f4);
                oooO00o7.f62056OooO00o = oooO00o5.f62056OooO00o;
                oooO00o7.f62057OooO0O0 = oooO00o5.f62057OooO0O0;
            } else if (abstractC21410OooO0o3 instanceof AbstractC21410OooO0o.C18988OooO0o) {
                AbstractC21410OooO0o.C18988OooO0o c18988OooO0o = (AbstractC21410OooO0o.C18988OooO0o) abstractC21410OooO0o3;
                float f5 = c18988OooO0o.f61988OooO0OO;
                oooO00o5.f62056OooO00o = f5;
                float f6 = c18988OooO0o.f61989OooO0Oo;
                oooO00o5.f62057OooO0O0 = f6;
                target.moveTo(f5, f6);
                oooO00o7.f62056OooO00o = oooO00o5.f62056OooO00o;
                oooO00o7.f62057OooO0O0 = oooO00o5.f62057OooO0O0;
            } else if (abstractC21410OooO0o3 instanceof AbstractC21410OooO0o.OooOOO0) {
                AbstractC21410OooO0o.OooOOO0 oooOOO0 = (AbstractC21410OooO0o.OooOOO0) abstractC21410OooO0o3;
                float f7 = oooOOO0.f62016OooO0OO;
                float f8 = oooOOO0.f62017OooO0Oo;
                target.OooO0oO(f7, f8);
                oooO00o5.f62056OooO00o += oooOOO0.f62016OooO0OO;
                oooO00o5.f62057OooO0O0 += f8;
            } else if (abstractC21410OooO0o3 instanceof AbstractC21410OooO0o.C21412OooO0o0) {
                AbstractC21410OooO0o.C21412OooO0o0 c21412OooO0o0 = (AbstractC21410OooO0o.C21412OooO0o0) abstractC21410OooO0o3;
                float f9 = c21412OooO0o0.f61990OooO0OO;
                float f10 = c21412OooO0o0.f61991OooO0Oo;
                target.lineTo(f9, f10);
                oooO00o5.f62056OooO00o = c21412OooO0o0.f61990OooO0OO;
                oooO00o5.f62057OooO0O0 = f10;
            } else if (abstractC21410OooO0o3 instanceof AbstractC21410OooO0o.C21415OooOO0o) {
                AbstractC21410OooO0o.C21415OooOO0o c21415OooOO0o = (AbstractC21410OooO0o.C21415OooOO0o) abstractC21410OooO0o3;
                target.OooO0oO(c21415OooOO0o.f62013OooO0OO, 0.0f);
                oooO00o5.f62056OooO00o += c21415OooOO0o.f62013OooO0OO;
            } else if (abstractC21410OooO0o3 instanceof AbstractC21410OooO0o.C21411OooO0Oo) {
                AbstractC21410OooO0o.C21411OooO0Oo c21411OooO0Oo = (AbstractC21410OooO0o.C21411OooO0Oo) abstractC21410OooO0o3;
                target.lineTo(c21411OooO0Oo.f61987OooO0OO, oooO00o5.f62057OooO0O0);
                oooO00o5.f62056OooO00o = c21411OooO0Oo.f61987OooO0OO;
            } else if (abstractC21410OooO0o3 instanceof AbstractC21410OooO0o.C21417OooOOo) {
                AbstractC21410OooO0o.C21417OooOOo c21417OooOOo = (AbstractC21410OooO0o.C21417OooOOo) abstractC21410OooO0o3;
                target.OooO0oO(0.0f, c21417OooOOo.f62026OooO0OO);
                oooO00o5.f62057OooO0O0 += c21417OooOOo.f62026OooO0OO;
            } else if (abstractC21410OooO0o3 instanceof AbstractC21410OooO0o.C21419OooOOoo) {
                AbstractC21410OooO0o.C21419OooOOoo c21419OooOOoo = (AbstractC21410OooO0o.C21419OooOOoo) abstractC21410OooO0o3;
                target.lineTo(oooO00o5.f62056OooO00o, c21419OooOOoo.f62029OooO0OO);
                oooO00o5.f62057OooO0O0 = c21419OooOOoo.f62029OooO0OO;
            } else if (abstractC21410OooO0o3 instanceof AbstractC21410OooO0o.OooOO0O) {
                AbstractC21410OooO0o.OooOO0O oooOO0O = (AbstractC21410OooO0o.OooOO0O) abstractC21410OooO0o3;
                target.OooO0OO(oooOO0O.f62007OooO0OO, oooOO0O.f62008OooO0Oo, oooOO0O.f62010OooO0o0, oooOO0O.f62009OooO0o, oooOO0O.f62011OooO0oO, oooOO0O.f62012OooO0oo);
                oooO00o6.f62056OooO00o = oooO00o5.f62056OooO00o + oooOO0O.f62010OooO0o0;
                oooO00o6.f62057OooO0O0 = oooO00o5.f62057OooO0O0 + oooOO0O.f62009OooO0o;
                oooO00o5.f62056OooO00o += oooOO0O.f62011OooO0oO;
                oooO00o5.f62057OooO0O0 += oooOO0O.f62012OooO0oo;
            } else if (abstractC21410OooO0o3 instanceof AbstractC21410OooO0o.OooO0OO) {
                AbstractC21410OooO0o.OooO0OO oooO0OO = (AbstractC21410OooO0o.OooO0OO) abstractC21410OooO0o3;
                interfaceC21370ooOO.OooO00o(oooO0OO.f61981OooO0OO, oooO0OO.f61982OooO0Oo, oooO0OO.f61984OooO0o0, oooO0OO.f61983OooO0o, oooO0OO.f61985OooO0oO, oooO0OO.f61986OooO0oo);
                oooO00o6.f62056OooO00o = oooO0OO.f61984OooO0o0;
                oooO00o6.f62057OooO0O0 = oooO0OO.f61983OooO0o;
                oooO00o5.f62056OooO00o = oooO0OO.f61985OooO0oO;
                oooO00o5.f62057OooO0O0 = oooO0OO.f61986OooO0oo;
            } else if (abstractC21410OooO0o3 instanceof AbstractC21410OooO0o.C21416OooOOOo) {
                AbstractC21410OooO0o.C21416OooOOOo c21416OooOOOo = (AbstractC21410OooO0o.C21416OooOOOo) abstractC21410OooO0o3;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(abstractC21410OooO0o2);
                if (abstractC21410OooO0o2.f61969OooO00o) {
                    oooO00o8.f62056OooO00o = oooO00o5.f62056OooO00o - oooO00o6.f62056OooO00o;
                    oooO00o8.f62057OooO0O0 = oooO00o5.f62057OooO0O0 - oooO00o6.f62057OooO0O0;
                } else {
                    oooO00o8.OooO00o();
                }
                interfaceC21370ooOO.OooO0OO(oooO00o8.f62056OooO00o, oooO00o8.f62057OooO0O0, c21416OooOOOo.f62022OooO0OO, c21416OooOOOo.f62023OooO0Oo, c21416OooOOOo.f62025OooO0o0, c21416OooOOOo.f62024OooO0o);
                oooO00o6.f62056OooO00o = oooO00o5.f62056OooO00o + c21416OooOOOo.f62022OooO0OO;
                oooO00o6.f62057OooO0O0 = oooO00o5.f62057OooO0O0 + c21416OooOOOo.f62023OooO0Oo;
                oooO00o5.f62056OooO00o += c21416OooOOOo.f62025OooO0o0;
                oooO00o5.f62057OooO0O0 += c21416OooOOOo.f62024OooO0o;
            } else if (abstractC21410OooO0o3 instanceof AbstractC21410OooO0o.C21414OooO0oo) {
                AbstractC21410OooO0o.C21414OooO0oo c21414OooO0oo = (AbstractC21410OooO0o.C21414OooO0oo) abstractC21410OooO0o3;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(abstractC21410OooO0o2);
                if (abstractC21410OooO0o2.f61969OooO00o) {
                    float f11 = 2;
                    oooO00o8.f62056OooO00o = (oooO00o5.f62056OooO00o * f11) - oooO00o6.f62056OooO00o;
                    oooO00o8.f62057OooO0O0 = (f11 * oooO00o5.f62057OooO0O0) - oooO00o6.f62057OooO0O0;
                } else {
                    oooO00o8.f62056OooO00o = oooO00o5.f62056OooO00o;
                    oooO00o8.f62057OooO0O0 = oooO00o5.f62057OooO0O0;
                }
                interfaceC21370ooOO.OooO00o(oooO00o8.f62056OooO00o, oooO00o8.f62057OooO0O0, c21414OooO0oo.f61996OooO0OO, c21414OooO0oo.f61997OooO0Oo, c21414OooO0oo.f61999OooO0o0, c21414OooO0oo.f61998OooO0o);
                oooO00o6.f62056OooO00o = c21414OooO0oo.f61996OooO0OO;
                oooO00o6.f62057OooO0O0 = c21414OooO0oo.f61997OooO0Oo;
                oooO00o5.f62056OooO00o = c21414OooO0oo.f61999OooO0o0;
                oooO00o5.f62057OooO0O0 = c21414OooO0oo.f61998OooO0o;
            } else if (abstractC21410OooO0o3 instanceof AbstractC21410OooO0o.OooOOOO) {
                AbstractC21410OooO0o.OooOOOO oooOOOO = (AbstractC21410OooO0o.OooOOOO) abstractC21410OooO0o3;
                float f12 = oooOOOO.f62018OooO0OO;
                float f13 = oooOOOO.f62019OooO0Oo;
                float f14 = oooOOOO.f62021OooO0o0;
                float f15 = oooOOOO.f62020OooO0o;
                interfaceC21370ooOO.OooO0Oo(f12, f13, f14, f15);
                oooO00o6.f62056OooO00o = oooO00o5.f62056OooO00o + oooOOOO.f62018OooO0OO;
                oooO00o6.f62057OooO0O0 = oooO00o5.f62057OooO0O0 + f13;
                oooO00o5.f62056OooO00o += f14;
                oooO00o5.f62057OooO0O0 += f15;
            } else if (abstractC21410OooO0o3 instanceof AbstractC21410OooO0o.C21413OooO0oO) {
                AbstractC21410OooO0o.C21413OooO0oO c21413OooO0oO = (AbstractC21410OooO0o.C21413OooO0oO) abstractC21410OooO0o3;
                float f16 = c21413OooO0oO.f61992OooO0OO;
                float f17 = c21413OooO0oO.f61993OooO0Oo;
                float f18 = c21413OooO0oO.f61995OooO0o0;
                float f19 = c21413OooO0oO.f61994OooO0o;
                interfaceC21370ooOO.quadraticBezierTo(f16, f17, f18, f19);
                oooO00o6.f62056OooO00o = c21413OooO0oO.f61992OooO0OO;
                oooO00o6.f62057OooO0O0 = f17;
                oooO00o5.f62056OooO00o = f18;
                oooO00o5.f62057OooO0O0 = f19;
            } else if (abstractC21410OooO0o3 instanceof AbstractC21410OooO0o.C21418OooOOo0) {
                AbstractC21410OooO0o.C21418OooOOo0 c21418OooOOo0 = (AbstractC21410OooO0o.C21418OooOOo0) abstractC21410OooO0o3;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(abstractC21410OooO0o2);
                if (abstractC21410OooO0o2.f61970OooO0O0) {
                    oooO00o8.f62056OooO00o = oooO00o5.f62056OooO00o - oooO00o6.f62056OooO00o;
                    oooO00o8.f62057OooO0O0 = oooO00o5.f62057OooO0O0 - oooO00o6.f62057OooO0O0;
                } else {
                    oooO00o8.OooO00o();
                }
                float f20 = oooO00o8.f62056OooO00o;
                float f21 = oooO00o8.f62057OooO0O0;
                float f22 = c21418OooOOo0.f62027OooO0OO;
                float f23 = c21418OooOOo0.f62028OooO0Oo;
                interfaceC21370ooOO.OooO0Oo(f20, f21, f22, f23);
                oooO00o6.f62056OooO00o = oooO00o5.f62056OooO00o + oooO00o8.f62056OooO00o;
                oooO00o6.f62057OooO0O0 = oooO00o5.f62057OooO0O0 + oooO00o8.f62057OooO0O0;
                oooO00o5.f62056OooO00o += c21418OooOOo0.f62027OooO0OO;
                oooO00o5.f62057OooO0O0 += f23;
            } else if (abstractC21410OooO0o3 instanceof AbstractC21410OooO0o.OooO) {
                AbstractC21410OooO0o.OooO oooO = (AbstractC21410OooO0o.OooO) abstractC21410OooO0o3;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(abstractC21410OooO0o2);
                if (abstractC21410OooO0o2.f61970OooO0O0) {
                    float f24 = 2;
                    oooO00o8.f62056OooO00o = (oooO00o5.f62056OooO00o * f24) - oooO00o6.f62056OooO00o;
                    oooO00o8.f62057OooO0O0 = (f24 * oooO00o5.f62057OooO0O0) - oooO00o6.f62057OooO0O0;
                } else {
                    oooO00o8.f62056OooO00o = oooO00o5.f62056OooO00o;
                    oooO00o8.f62057OooO0O0 = oooO00o5.f62057OooO0O0;
                }
                float f25 = oooO00o8.f62056OooO00o;
                float f26 = oooO00o8.f62057OooO0O0;
                float f27 = oooO.f61971OooO0OO;
                float f28 = oooO.f61972OooO0Oo;
                interfaceC21370ooOO.quadraticBezierTo(f25, f26, f27, f28);
                oooO00o6.f62056OooO00o = oooO00o8.f62056OooO00o;
                oooO00o6.f62057OooO0O0 = oooO00o8.f62057OooO0O0;
                oooO00o5.f62056OooO00o = oooO.f61971OooO0OO;
                oooO00o5.f62057OooO0O0 = f28;
            } else {
                if (abstractC21410OooO0o3 instanceof AbstractC21410OooO0o.OooOO0) {
                    AbstractC21410OooO0o.OooOO0 oooOO02 = (AbstractC21410OooO0o.OooOO0) abstractC21410OooO0o3;
                    float f29 = oooOO02.f62006OooO0oo;
                    float f30 = oooO00o5.f62056OooO00o;
                    float f31 = f29 + f30;
                    float f32 = oooO00o5.f62057OooO0O0;
                    float f33 = oooOO02.f62000OooO + f32;
                    OooO00o oooO00o9 = oooO00o5;
                    abstractC21410OooO0o = abstractC21410OooO0o3;
                    oooO00o2 = oooO00o7;
                    oooO00o3 = oooO00o8;
                    i2 = i3;
                    arrayList = arrayList2;
                    i = size;
                    OooO0O0(interfaceC21370ooOO, f30, f32, f31, f33, oooOO02.f62001OooO0OO, oooOO02.f62002OooO0Oo, oooOO02.f62004OooO0o0, oooOO02.f62003OooO0o, oooOO02.f62005OooO0oO);
                    oooO00o9.f62056OooO00o = f31;
                    oooO00o9.f62057OooO0O0 = f33;
                    oooO00o = oooO00o6;
                    oooO00o.f62056OooO00o = f31;
                    oooO00o.f62057OooO0O0 = f33;
                    oooO00o4 = oooO00o9;
                } else {
                    OooO00o oooO00o10 = oooO00o5;
                    oooO00o = oooO00o6;
                    oooO00o2 = oooO00o7;
                    oooO00o3 = oooO00o8;
                    arrayList = arrayList2;
                    i = size;
                    i2 = i3;
                    if (abstractC21410OooO0o3 instanceof AbstractC21410OooO0o.OooO00o) {
                        AbstractC21410OooO0o.OooO00o oooO00o11 = (AbstractC21410OooO0o.OooO00o) abstractC21410OooO0o3;
                        double d = oooO00o10.f62056OooO00o;
                        double d2 = oooO00o10.f62057OooO0O0;
                        double d3 = oooO00o11.f61979OooO0oo;
                        float f34 = oooO00o11.f61973OooO;
                        abstractC21410OooO0o = abstractC21410OooO0o3;
                        OooO0O0(interfaceC21370ooOO, d, d2, d3, f34, oooO00o11.f61974OooO0OO, oooO00o11.f61975OooO0Oo, oooO00o11.f61977OooO0o0, oooO00o11.f61976OooO0o, oooO00o11.f61978OooO0oO);
                        float f35 = oooO00o11.f61979OooO0oo;
                        oooO00o4 = oooO00o10;
                        oooO00o4.f62056OooO00o = f35;
                        oooO00o4.f62057OooO0O0 = f34;
                        oooO00o = oooO00o;
                        oooO00o.f62056OooO00o = f35;
                        oooO00o.f62057OooO0O0 = f34;
                    } else {
                        oooO00o4 = oooO00o10;
                        abstractC21410OooO0o = abstractC21410OooO0o3;
                    }
                }
                i3 = i2 + 1;
                target = interfaceC21370ooOO;
                oooO00o6 = oooO00o;
                oooO00o5 = oooO00o4;
                oooO00o7 = oooO00o2;
                oooO00o8 = oooO00o3;
                arrayList2 = arrayList;
                size = i;
                abstractC21410OooO0o2 = abstractC21410OooO0o;
            }
            oooO00o4 = oooO00o5;
            oooO00o = oooO00o6;
            oooO00o2 = oooO00o7;
            oooO00o3 = oooO00o8;
            arrayList = arrayList2;
            i = size;
            i2 = i3;
            abstractC21410OooO0o = abstractC21410OooO0o3;
            i3 = i2 + 1;
            target = interfaceC21370ooOO;
            oooO00o6 = oooO00o;
            oooO00o5 = oooO00o4;
            oooO00o7 = oooO00o2;
            oooO00o8 = oooO00o3;
            arrayList2 = arrayList;
            size = i;
            abstractC21410OooO0o2 = abstractC21410OooO0o;
        }
    }
}
