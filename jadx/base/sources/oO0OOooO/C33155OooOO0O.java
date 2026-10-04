package oO0OOooO;

import java.lang.reflect.Array;
import oO0OoOoO.C33290OooO00o;
import oO0OoOoO.C33291OooO0O0;

/* JADX INFO: renamed from: oO0OOooO.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33155OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final double[][] f119882OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final double[][] f119883OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public AbstractC33146OooO00o f119884OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public AbstractC33146OooO00o f119885OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final double f119886OooO0o0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a6  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO0OOooO.OooOO0O] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C33155OooOO0O(InterfaceC33145OooO interfaceC33145OooO) {
        double d;
        double d2;
        double d3;
        int i;
        int i2;
        double d4;
        double d5;
        int i3;
        int i4;
        double[] dArr;
        char c = 2;
        int i5 = 1;
        C33155OooOO0O obj = new Object();
        obj.f119886OooO0o0 = C33291OooO0O0.f120516OooO00o;
        if (!interfaceC33145OooO.mo80631b()) {
            throw new C33153OooO0oo(interfaceC33145OooO.mo80632c(), interfaceC33145OooO.mo80628a());
        }
        C33151OooO0o0 c33151OooO0o0 = new C33151OooO0o0(interfaceC33145OooO);
        AbstractC33146OooO00o abstractC33146OooO00o = c33151OooO0o0.f119880OooO0Oo;
        Class cls = Double.TYPE;
        int i6 = 0;
        double[][] dArr2 = c33151OooO0o0.f119877OooO00o;
        if (abstractC33146OooO00o == null) {
            int length = dArr2.length;
            double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, length, length);
            for (int i7 = 0; i7 < length; i7++) {
                if (i7 > 0) {
                    int i8 = i7 - 1;
                    dArr3[i7][i8] = dArr2[i7][i8];
                }
                for (int i9 = i7; i9 < length; i9++) {
                    dArr3[i7][i9] = dArr2[i7][i9];
                }
            }
            c33151OooO0o0.f119880OooO0Oo = C33152OooO0oO.OooO00o(dArr3);
        }
        obj.f119883OooO0O0 = c33151OooO0o0.f119880OooO0Oo.mo80634e();
        double d6 = 0.0d;
        if (c33151OooO0o0.f119879OooO0OO == null) {
            int length2 = dArr2.length;
            int i10 = length2 - 1;
            double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length2, length2);
            int i11 = 0;
            while (i11 < length2) {
                int i12 = 0;
                while (i12 < length2) {
                    dArr4[i11][i12] = i11 == i12 ? 1.0d : 0.0d;
                    i12++;
                }
                i11++;
            }
            for (int i13 = length2 - 2; i13 >= 1; i13--) {
                int i14 = i13 - 1;
                if (dArr2[i13][i14] != 0.0d) {
                    int i15 = i13 + 1;
                    while (true) {
                        dArr = c33151OooO0o0.f119878OooO0O0;
                        if (i15 > i10) {
                            break;
                        }
                        dArr[i15] = dArr2[i15][i14];
                        i15++;
                    }
                    for (int i16 = i13; i16 <= i10; i16++) {
                        double d7 = 0.0d;
                        for (int i17 = i13; i17 <= i10; i17++) {
                            d7 = (dArr[i17] * dArr4[i17][i16]) + d7;
                        }
                        double d8 = (d7 / dArr[i13]) / dArr2[i13][i14];
                        for (int i18 = i13; i18 <= i10; i18++) {
                            double[] dArr5 = dArr4[i18];
                            dArr5[i16] = (dArr[i18] * d8) + dArr5[i16];
                        }
                    }
                }
            }
            c33151OooO0o0.f119879OooO0OO = C33152OooO0oO.OooO00o(dArr4);
        }
        obj.f119882OooO00o = c33151OooO0o0.f119879OooO0OO.mo80634e();
        obj.f119885OooO0Oo = null;
        obj.f119884OooO0OO = null;
        double[][] dArr6 = obj.f119883OooO0O0;
        int length3 = dArr6.length;
        double dOooO00o = 0.0d;
        for (int i19 = 0; i19 < dArr6.length; i19++) {
            int i20 = i19 - 1;
            int i21 = C33290OooO00o.f120515OooO00o;
            for (i20 = i20 <= 0 ? 0 : i20; i20 < dArr6.length; i20++) {
                dOooO00o += C33290OooO00o.OooO00o(dArr6[i19][i20]);
            }
        }
        int i22 = length3 - 1;
        int i23 = i22;
        int i24 = 0;
        double d9 = 0.0d;
        while (i23 >= 0) {
            char c2 = c;
            int i25 = i23;
            double d10 = d6;
            while (true) {
                d = obj.f119886OooO0o0;
                if (i25 <= 0) {
                    break;
                }
                int i26 = i25 - 1;
                double dOooO00o2 = C33290OooO00o.OooO00o(dArr6[i25][i25]) + C33290OooO00o.OooO00o(dArr6[i26][i26]);
                if (C33290OooO00o.OooO00o(dArr6[i25][i26]) < (dOooO00o2 == d10 ? dOooO00o : dOooO00o2) * d) {
                    break;
                } else {
                    i25--;
                }
            }
            if (i25 == i23) {
                double[] dArr7 = dArr6[i23];
                dArr7[i23] = dArr7[i23] + d9;
                i23--;
                i24 = i6;
                c = c2;
                d6 = d10;
            } else {
                int i27 = i5;
                int i28 = i23 - 1;
                int i29 = i6;
                double[][] dArr8 = obj.f119882OooO00o;
                if (i25 == i28) {
                    double[] dArr9 = dArr6[i28];
                    double d11 = dArr9[i28];
                    double[] dArr10 = dArr6[i23];
                    double d12 = dArr10[i23];
                    double d13 = (d11 - d12) / 2.0d;
                    double d14 = (dArr10[i28] * dArr9[i23]) + (d13 * d13);
                    dArr10[i23] = d12 + d9;
                    dArr9[i28] = dArr9[i28] + d9;
                    if (d14 >= d10) {
                        double dSqrt = Math.sqrt(C33290OooO00o.OooO00o(d14));
                        double d15 = d13 >= d10 ? d13 + dSqrt : d13 - dSqrt;
                        double d16 = dArr6[i23][i28];
                        double dOooO00o3 = C33290OooO00o.OooO00o(d15) + C33290OooO00o.OooO00o(d16);
                        double d17 = d16 / dOooO00o3;
                        double d18 = d15 / dOooO00o3;
                        double dSqrt2 = Math.sqrt((d18 * d18) + (d17 * d17));
                        double d19 = d17 / dSqrt2;
                        double d20 = d18 / dSqrt2;
                        for (int i30 = i28; i30 < length3; i30++) {
                            double[] dArr11 = dArr6[i28];
                            double d21 = dArr11[i30];
                            double[] dArr12 = dArr6[i23];
                            dArr11[i30] = (dArr12[i30] * d19) + (d20 * d21);
                            dArr12[i30] = (dArr12[i30] * d20) - (d21 * d19);
                        }
                        for (int i31 = i29; i31 <= i23; i31++) {
                            double[] dArr13 = dArr6[i31];
                            double d22 = dArr13[i28];
                            dArr13[i28] = (dArr13[i23] * d19) + (d20 * d22);
                            dArr13[i23] = (dArr13[i23] * d20) - (d22 * d19);
                        }
                        for (int i32 = i29; i32 <= i22; i32++) {
                            double[] dArr14 = dArr8[i32];
                            double d23 = dArr14[i28];
                            dArr14[i28] = (dArr14[i23] * d19) + (d20 * d23);
                            dArr14[i23] = (dArr14[i23] * d20) - (d23 * d19);
                        }
                    }
                    i23 -= 2;
                    i6 = i29;
                    i24 = i6;
                    c = c2;
                    d6 = d10;
                    i5 = i27;
                } else {
                    double[] dArr15 = dArr6[i23];
                    double d24 = dArr15[i23];
                    if (i25 < i23) {
                        double[] dArr16 = dArr6[i28];
                        d2 = dArr16[i28];
                        d3 = dArr15[i28] * dArr16[i23];
                    } else {
                        d2 = d10;
                        d3 = d2;
                    }
                    if (i24 == 10) {
                        d9 += d24;
                        for (int i33 = i29; i33 <= i23; i33++) {
                            double[] dArr17 = dArr6[i33];
                            dArr17[i33] = dArr17[i33] - d24;
                        }
                        double dOooO00o4 = C33290OooO00o.OooO00o(dArr6[i28][i23 - 2]) + C33290OooO00o.OooO00o(dArr6[i23][i28]);
                        d24 = 0.75d * dOooO00o4;
                        d3 = (-0.4375d) * dOooO00o4 * dOooO00o4;
                        d2 = d24;
                    }
                    if (i24 == 30) {
                        double d25 = (d2 - d24) / 2.0d;
                        double d26 = (d25 * d25) + d3;
                        if (d26 > d10) {
                            int i34 = C33290OooO00o.f120515OooO00o;
                            i = length3;
                            i2 = i22;
                            double dSqrt3 = Math.sqrt(d26);
                            double d27 = d24 - (d3 / (d25 + (d2 < d24 ? -dSqrt3 : dSqrt3)));
                            for (int i35 = i29; i35 <= i23; i35++) {
                                double[] dArr18 = dArr6[i35];
                                dArr18[i35] = dArr18[i35] - d27;
                            }
                            d9 += d27;
                            d24 = 0.964d;
                            d2 = 0.964d;
                            d3 = 0.964d;
                        } else {
                            i = length3;
                            i2 = i22;
                        }
                        i24++;
                        if (i24 > 100) {
                            throw new o00O0o.OooO0o(100, new Object[i29]);
                        }
                        double[] dArr19 = new double[3];
                        int i36 = i23 - 2;
                        while (i36 >= i25) {
                            double[] dArr20 = dArr6[i36];
                            double d28 = dArr20[i36];
                            double d29 = d24 - d28;
                            double d30 = d2 - d28;
                            int i37 = i36 + 1;
                            double[] dArr21 = dArr6[i37];
                            dArr19[i29] = (((d29 * d30) - d3) / dArr21[i36]) + dArr20[i37];
                            dArr19[i27] = ((dArr21[i37] - d28) - d29) - d30;
                            dArr19[c2] = dArr6[i36 + 2][i37];
                            if (i36 == i25) {
                                break;
                            }
                            int i38 = i36 - 1;
                            if ((C33290OooO00o.OooO00o(dArr19[c2]) + C33290OooO00o.OooO00o(dArr19[i27])) * C33290OooO00o.OooO00o(dArr20[i38]) < (C33290OooO00o.OooO00o(dArr6[i37][i37]) + C33290OooO00o.OooO00o(d28) + C33290OooO00o.OooO00o(dArr6[i38][i38])) * C33290OooO00o.OooO00o(dArr19[i29]) * d) {
                                break;
                            } else {
                                i36--;
                            }
                        }
                        int length4 = dArr6.length;
                        double d31 = dArr19[i29];
                        double d32 = dArr19[i27];
                        double d33 = dArr19[c2];
                        int i39 = i36;
                        C33155OooOO0O c33155OooOO0O = obj;
                        while (i39 <= i28) {
                            int i40 = i39 != i28 ? i27 : i29;
                            if (i39 != i36) {
                                int i41 = i39 - 1;
                                double d34 = dArr6[i39][i41];
                                d32 = dArr6[i39 + 1][i41];
                                d33 = i40 != 0 ? dArr6[i39 + 2][i41] : d10;
                                d4 = dOooO00o;
                                int i42 = i40;
                                double dOooO00o5 = C33290OooO00o.OooO00o(d33) + C33290OooO00o.OooO00o(d32) + C33290OooO00o.OooO00o(d34);
                                d5 = d9;
                                i3 = i42;
                                if (C33291OooO0O0.OooO0O0(dOooO00o5, c33155OooOO0O.f119886OooO0o0)) {
                                    i4 = i;
                                    d31 = d34;
                                    d24 = dOooO00o5;
                                    i39++;
                                    c33155OooOO0O = this;
                                    d9 = d5;
                                    dOooO00o = d4;
                                    i = i4;
                                } else {
                                    d31 = d34 / dOooO00o5;
                                    d32 /= dOooO00o5;
                                    d33 /= dOooO00o5;
                                    d24 = dOooO00o5;
                                }
                            } else {
                                d4 = dOooO00o;
                                d5 = d9;
                                i3 = i40;
                            }
                            int i43 = C33290OooO00o.f120515OooO00o;
                            double dSqrt4 = Math.sqrt((d33 * d33) + (d32 * d32) + (d31 * d31));
                            dSqrt4 = d31 < d10 ? -dSqrt4 : dSqrt4;
                            if (dSqrt4 != d10) {
                                if (i39 != i36) {
                                    i4 = i;
                                    dArr6[i39][i39 - 1] = (-dSqrt4) * d24;
                                } else {
                                    i4 = i;
                                    if (i25 != i36) {
                                        double[] dArr22 = dArr6[i39];
                                        int i44 = i39 - 1;
                                        dArr22[i44] = -dArr22[i44];
                                    }
                                }
                                d31 += dSqrt4;
                                double d35 = d31 / dSqrt4;
                                double d36 = d32 / dSqrt4;
                                double d37 = d33 / dSqrt4;
                                d32 /= d31;
                                d33 /= d31;
                                d24 = d35;
                                for (int i45 = i39; i45 < length4; i45++) {
                                    double[] dArr23 = dArr6[i39];
                                    double d38 = dArr23[i45];
                                    double[] dArr24 = dArr6[i39 + 1];
                                    double d39 = (dArr24[i45] * d32) + d38;
                                    if (i3 != 0) {
                                        double[] dArr25 = dArr6[i39 + 2];
                                        double d40 = dArr25[i45];
                                        double d41 = (d33 * d40) + d39;
                                        dArr25[i45] = d40 - (d41 * d37);
                                        d31 = d41;
                                    } else {
                                        d31 = d39;
                                    }
                                    dArr23[i45] = dArr23[i45] - (d31 * d24);
                                    dArr24[i45] = dArr24[i45] - (d31 * d36);
                                }
                                int i46 = i29;
                                while (true) {
                                    int i47 = i39 + 3;
                                    if (i46 > (i23 <= i47 ? i23 : i47)) {
                                        break;
                                    }
                                    double[] dArr26 = dArr6[i46];
                                    int i48 = i39 + 1;
                                    double d42 = (dArr26[i48] * d36) + (dArr26[i39] * d24);
                                    if (i3 != 0) {
                                        int i49 = i39 + 2;
                                        double d43 = dArr26[i49];
                                        double d44 = (d37 * d43) + d42;
                                        dArr26[i49] = d43 - (d44 * d33);
                                        d31 = d44;
                                    } else {
                                        d31 = d42;
                                    }
                                    dArr26[i39] = dArr26[i39] - d31;
                                    dArr26[i48] = dArr26[i48] - (d31 * d32);
                                    i46++;
                                }
                                int length5 = dArr6.length - 1;
                                int i50 = i29;
                                while (i50 <= length5) {
                                    double[] dArr27 = dArr8[i50];
                                    int i51 = i39 + 1;
                                    double d45 = (dArr27[i51] * d36) + (dArr27[i39] * d24);
                                    if (i3 != 0) {
                                        int i52 = i39 + 2;
                                        double d46 = dArr27[i52];
                                        double d47 = (d37 * d46) + d45;
                                        dArr27[i52] = d46 - (d47 * d33);
                                        d45 = d47;
                                    }
                                    dArr27[i39] = dArr27[i39] - d45;
                                    dArr27[i51] = dArr27[i51] - (d45 * d32);
                                    i50++;
                                    d31 = d45;
                                }
                            } else {
                                i4 = i;
                            }
                            i39++;
                            c33155OooOO0O = this;
                            d9 = d5;
                            dOooO00o = d4;
                            i = i4;
                        }
                        int i53 = i;
                        double d48 = dOooO00o;
                        double d49 = d9;
                        int i54 = i36 + 2;
                        for (int i55 = i54; i55 <= i23; i55++) {
                            double[] dArr28 = dArr6[i55];
                            dArr28[i55 - 2] = d10;
                            if (i55 > i54) {
                                dArr28[i55 - 3] = d10;
                            }
                        }
                        obj = this;
                        i6 = i29;
                        c = c2;
                        d6 = d10;
                        i5 = i27;
                        i22 = i2;
                        d9 = d49;
                        dOooO00o = d48;
                        length3 = i53;
                    }
                }
            }
        }
    }
}
