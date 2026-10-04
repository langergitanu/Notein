package com.aspose.words.internal;

import android.graphics.PointF;
import com.aspose.words.internal.zzZIV;
import com.aspose.words.internal.zzZIW;
import com.aspose.words.internal.zzZIX;
import com.aspose.words.internal.zzZQ8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZRB {
    private static boolean zzG(double d, double d2) {
        return Math.abs(d - d2) < 1.0E-4d;
    }

    private static int zzW(double d, double d2, double d3, double d4, double d5, double d6, zzZIV[] zzzivArr) {
        double d7 = d4;
        if ((zzG(d, d3) && zzG(d2, d7)) || (zzG(d, d5) && zzG(d2, d6))) {
            zzzivArr[0] = new zzZIV.zzZ(d, d2);
            return 1;
        }
        double d8 = (d6 - d7) / (d5 - d3);
        if (!zzG((d7 - (d3 * d8)) + (d8 * d), d2)) {
            return 0;
        }
        double d9 = d7 < d6 ? d7 : d6;
        if (d7 <= d6) {
            d7 = d6;
        }
        if ((!zzG(d2, d9) && d2 <= d9) || (!zzG(d2, d7) && d2 >= d7)) {
            return 0;
        }
        zzzivArr[0] = new zzZIV.zzZ(d, d2);
        return 1;
    }

    private static int zzX(double d, double d2, double d3, double d4, double d5, double d6, zzZIV[] zzzivArr) {
        if (!zzG(d2, d5)) {
            return 0;
        }
        double[] dArr = new double[2];
        int iZzZ = zzZ(d < d3 ? d : d3, d > d3 ? d : d3, d4 < d6 ? d4 : d6, d4 > d6 ? d4 : d6, dArr);
        if (iZzZ == 1) {
            zzzivArr[0] = new zzZIV.zzZ(dArr[0], d2);
        }
        if (iZzZ == 2) {
            zzzivArr[0] = new zzZIV.zzZ(dArr[0], d2);
            zzzivArr[1] = new zzZIV.zzZ(dArr[1], d2);
        }
        return iZzZ;
    }

    private static int zzY(double d, double d2, double d3, double d4, double d5, double d6, double d7, zzZIV[] zzzivArr) {
        double d8 = (d7 - d5) / (d6 - d4);
        double d9 = (d2 - (d5 - (d8 * d4))) / d8;
        double d10 = d < d3 ? d : d3;
        double d11 = d > d3 ? d : d3;
        double d12 = d5 < d7 ? d5 : d7;
        double d13 = d5 > d7 ? d5 : d7;
        boolean z = (zzG(d9, d10) || d9 > d10) && (zzG(d9, d11) || d9 < d11);
        boolean z2 = (zzG(d2, d12) || d2 > d12) && (zzG(d2, d13) || d2 < d13);
        if (!z || !z2) {
            return 0;
        }
        zzzivArr[0] = new zzZIV.zzZ(d9, d2);
        return 1;
    }

    private static double zzZ(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        double d11 = 0.0d;
        for (double d12 = 0.0d; d12 <= 1.0d; d12 += 0.001d) {
            double d13 = 1.0d - d12;
            double d14 = d13 * d13 * d13;
            double d15 = 3.0d * d13;
            double d16 = d13 * d15 * d12;
            double d17 = d15 * d12 * d12;
            double d18 = d12 * d12 * d12;
            double d19 = (d18 * d7) + (d17 * d5) + (d16 * d3) + (d14 * d);
            double d20 = d18 * d8;
            double d21 = d20 + (d17 * d6) + (d16 * d4) + (d14 * d2);
            double d22 = d9 - d19;
            double d23 = d10 - d21;
            double d24 = (d23 * d23) + (d22 * d22);
            if (d24 > d11) {
                d11 = d24;
            }
        }
        return d11;
    }

    public static double zzZ(zzZQ8 zzzq8, PointF pointF) {
        Iterator<zzZQ8.zzY> it;
        double d;
        double d2;
        double d3 = pointF.x;
        double d4 = pointF.y;
        Iterator<zzZQ8.zzY> it2 = zzzq8.zzkE().iterator();
        double d5 = 0.0d;
        double d6 = 0.0d;
        double d7 = 0.0d;
        double d8 = 0.0d;
        while (it2.hasNext()) {
            zzZQ8.zzY next = it2.next();
            byte bZzkz = next.zzkz();
            if (bZzkz == 0 || bZzkz == 1) {
                it = it2;
                d = d3;
                d2 = d4;
                double d9 = next.zzky()[0];
                double d10 = next.zzky()[1];
                double d11 = d - d9;
                double d12 = d2 - d10;
                d7 = (d12 * d12) + (d11 * d11);
                d5 = d9;
                d6 = d10;
            } else if (bZzkz == 3) {
                it = it2;
                d = d3;
                d2 = d4;
                double dZzZ = zzZ(d5, d6, next.zzky()[0], next.zzky()[1], next.zzky()[2], next.zzky()[3], next.zzky()[4], next.zzky()[5], d, d2);
                double d13 = next.zzky()[4];
                d7 = dZzZ;
                d6 = next.zzky()[5];
                d5 = d13;
            } else {
                if (bZzkz != 4) {
                    throw new Error("This segment type hasn't been implemented yet.");
                }
                it = it2;
                d = d3;
                d2 = d4;
            }
            if (d7 > d8) {
                it2 = it;
                d8 = d7;
            } else {
                it2 = it;
            }
            d3 = d;
            d4 = d2;
        }
        return d8;
    }

    private static int zzY(double d, double d2, double d3, double d4, double d5, double d6, zzZIV[] zzzivArr) {
        double d7 = d < d3 ? d : d3;
        if (d <= d3) {
            d = d3;
        }
        double d8 = d5 < d6 ? d5 : d6;
        if (d5 <= d6) {
            d5 = d6;
        }
        boolean z = (zzG(d4, d7) || d4 > d7) && (zzG(d4, d) || d4 < d);
        boolean z2 = (zzG(d2, d8) || d2 > d8) && (zzG(d2, d5) || d2 < d5);
        if (!z || !z2) {
            return 0;
        }
        zzzivArr[0] = new zzZIV.zzZ(d4, d2);
        return 1;
    }

    private static int zzY(double d, double d2, double d3, double d4, double d5, zzZIV[] zzzivArr) {
        if (!zzG(d2, d4)) {
            return 0;
        }
        double d6 = d3 < d5 ? d3 : d5;
        if (d3 <= d5) {
            d3 = d5;
        }
        if ((!zzG(d, d6) && d <= d6) || (!zzG(d, d3) && d >= d3)) {
            return 0;
        }
        zzzivArr[0] = new zzZIV.zzZ(d, d2);
        return 1;
    }

    public static zzZIV zzZ(zzZIV zzziv, zzZIV zzziv2, zzZQ8 zzzq8) {
        List<zzZIV> listZzZ = zzZ(new zzZIW.zzZ(zzziv, zzziv2), zzzq8);
        if (listZzZ.size() == 0) {
            return null;
        }
        zzZIV zzziv3 = listZzZ.get(0);
        double dZzY = zzziv3.zzY(zzziv);
        for (int i = 1; i < listZzZ.size(); i++) {
            zzZIV zzziv4 = listZzZ.get(i);
            double dZzY2 = zzziv4.zzY(zzziv);
            if (dZzY2 > dZzY) {
                zzziv3 = zzziv4;
                dZzY = dZzY2;
            }
        }
        return zzziv3;
    }

    private static List<zzZIV> zzZ(zzZIW zzziw, zzZQ8 zzzq8) {
        int i;
        zzZIV.zzZ[] zzzArr;
        ArrayList arrayList = new ArrayList();
        float[] fArr = new float[6];
        zzZIV.zzZ zzz = new zzZIV.zzZ();
        zzZIV.zzZ zzz2 = new zzZIV.zzZ();
        int i2 = 2;
        zzZIV.zzZ[] zzzArr2 = new zzZIV.zzZ[2];
        for (zzZQ8.zzY zzy : zzzq8.zzkE()) {
            zzy.zzN(fArr);
            byte bZzkz = zzy.zzkz();
            if (bZzkz == 0) {
                i = i2;
                zzzArr = zzzArr2;
                zzz.zzC(fArr[0], fArr[1]);
                zzz2.zzC(fArr[0], fArr[1]);
            } else if (bZzkz == 1) {
                zzzArr = zzzArr2;
                int iZzZ = zzZ(new zzZIW.zzZ(zzz2.zzQb(), zzz2.zzYm(), fArr[0], fArr[1]), zzziw, zzzArr);
                if (iZzZ != 0) {
                    arrayList.add(zzzArr[0]);
                }
                i = 2;
                if (iZzZ == 2) {
                    arrayList.add(zzzArr[1]);
                }
                zzz2.zzC(fArr[0], fArr[1]);
            } else if (bZzkz == 3) {
                arrayList.addAll(zzZ(new zzZIX.zzZ(zzz2.zzQb(), zzz2.zzYm(), fArr[0], fArr[1], fArr[i2], fArr[3], fArr[4], fArr[5]), zzziw));
                zzz2.zzC(fArr[4], fArr[5]);
                zzzArr2 = zzzArr2;
                i2 = 2;
            } else if (bZzkz == 4) {
                int iZzZ2 = zzZ(new zzZIW.zzZ(zzz2.zzQb(), zzz2.zzYm(), zzz.zzQb(), zzz.zzYm()), zzziw, zzzArr2);
                if (iZzZ2 != 0) {
                    arrayList.add(zzzArr2[0]);
                }
                if (iZzZ2 == i2) {
                    arrayList.add(zzzArr2[1]);
                }
            } else {
                throw new IllegalStateException();
            }
            zzzArr2 = zzzArr;
            i2 = i;
        }
        return arrayList;
    }

    private static ArrayList<zzZIV> zzZ(zzZIX zzzix, zzZIW zzziw) {
        int i;
        char c;
        double[] dArr = new double[4];
        dArr[0] = zzzix.zzdh();
        dArr[1] = zzzix.zzdd();
        dArr[2] = zzzix.zzdb();
        dArr[3] = zzzix.zzdf();
        double[] dArr2 = new double[4];
        dArr2[0] = zzzix.zzdg();
        dArr2[1] = zzzix.zzdc();
        dArr2[2] = zzzix.zzda();
        dArr2[3] = zzzix.zzde();
        double dZzdh = zzziw.zzdh();
        double dZzdg = zzziw.zzdg();
        double dZzdf = zzziw.zzdf();
        double dZzde = zzziw.zzde();
        if (zzG(dZzdh, dZzdf)) {
            for (int i2 = 0; i2 < 4; i2++) {
                dArr[i2] = dArr[i2] - dZzdh;
            }
            i = 0;
            c = 1;
        } else {
            if (zzG(dZzdg, dZzde)) {
                for (int i3 = 0; i3 < 4; i3++) {
                    dArr2[i3] = dArr2[i3] - dZzdg;
                }
                i = 0;
                c = 1;
            } else {
                double d = (dZzde - dZzdg) / (dZzdf - dZzdh);
                double d2 = dZzdg - (dZzdh * d);
                double d3 = (d * d) + 1.0d;
                double dSqrt = 1.0d / Math.sqrt(d3);
                i = 0;
                c = 1;
                double d4 = -(dSqrt * d);
                double d5 = (-(d * d2)) / d3;
                double d6 = d2 / d3;
                for (int i4 = 0; i4 < 4; i4++) {
                    dArr[i4] = dArr[i4] - d5;
                    double d7 = dArr2[i4] - d6;
                    dArr2[i4] = d7;
                    dArr2[i4] = (d7 * dSqrt) + (dArr[i4] * d4);
                }
            }
            dArr = dArr2;
        }
        double[] dArr3 = new double[4];
        double d8 = dArr[i];
        double d9 = dArr[c];
        double d10 = dArr[2];
        dArr3[3] = (((d9 * 3.0d) + (-d8)) - (d10 * 3.0d)) + dArr[3];
        dArr3[2] = (d10 * 3.0d) + ((d8 * 3.0d) - (6.0d * d9));
        dArr3[c] = (d9 * 3.0d) + ((-3.0d) * d8);
        dArr3[i] = d8;
        int iZzX = zzZIX.zzX(dArr3, dArr3);
        if (iZzX == -1) {
            return new ArrayList<>();
        }
        ArrayList<zzZIV> arrayList = new ArrayList<>(iZzX);
        for (int i5 = i; i5 < iZzX; i5++) {
            double d11 = dArr3[i5];
            if (d11 >= 0.0d && d11 <= 1.0d) {
                zzZIV zzzivZzZ = zzZ(zzzix, d11);
                if (zzZ(zzzivZzZ, zzziw)) {
                    arrayList.add(zzzivZzZ);
                }
            }
        }
        return arrayList;
    }

    private static int zzZ(zzZIW zzziw, zzZIW zzziw2, zzZIV[] zzzivArr) {
        double dZzdh = zzziw.zzdh();
        double dZzdg = zzziw.zzdg();
        double dZzdf = zzziw.zzdf();
        double dZzde = zzziw.zzde();
        double dZzdh2 = zzziw2.zzdh();
        double dZzdg2 = zzziw2.zzdg();
        double dZzdf2 = zzziw2.zzdf();
        double dZzde2 = zzziw2.zzde();
        boolean zZzG = zzG(dZzdg, dZzde);
        boolean zZzG2 = zzG(dZzdh, dZzdf);
        boolean zZzG3 = zzG(dZzdg2, dZzde2);
        boolean zZzG4 = zzG(dZzdh2, dZzdf2);
        if (zZzG && zZzG2) {
            if (zZzG3 && zZzG4) {
                return zzZ(dZzdh, dZzdg, dZzdh2, dZzdg2, zzzivArr);
            }
            if (zZzG3) {
                return zzY(dZzdh, dZzdg, dZzdh2, dZzdg2, dZzdf2, zzzivArr);
            }
            if (zZzG4) {
                return zzZ(dZzdh, dZzdg, dZzdh2, dZzdg2, dZzde2, zzzivArr);
            }
            return zzW(dZzdh, dZzdg, dZzdh2, dZzdg2, dZzdf2, dZzde2, zzzivArr);
        }
        if (zZzG3 && zZzG4) {
            if (zZzG) {
                return zzY(dZzdh2, dZzdg2, dZzdh, dZzdg, dZzdf, zzzivArr);
            }
            if (zZzG2) {
                return zzZ(dZzdh2, dZzdg2, dZzdh, dZzdg, dZzde, zzzivArr);
            }
            return zzW(dZzdh2, dZzdg2, dZzdh, dZzdg, dZzdf, dZzde, zzzivArr);
        }
        if (zZzG) {
            if (zZzG3) {
                return zzX(dZzdh, dZzdg, dZzdf, dZzdh2, dZzdg2, dZzdf2, zzzivArr);
            }
            if (zZzG4) {
                return zzY(dZzdh, dZzdg, dZzdf, dZzdh2, dZzdg2, dZzde2, zzzivArr);
            }
            return zzY(dZzdh, dZzdg, dZzdf, dZzdh2, dZzdg2, dZzdf2, dZzde2, zzzivArr);
        }
        if (zZzG2) {
            if (zZzG3) {
                return zzY(dZzdh2, dZzdg2, dZzdf2, dZzdh, dZzdg, dZzde, zzzivArr);
            }
            if (zZzG4) {
                return zzZ(dZzdh, dZzdg, dZzde, dZzdh2, dZzdg2, dZzde2, zzzivArr);
            }
            return zzZ(dZzdh, dZzdg, dZzde, dZzdh2, dZzdg2, dZzdf2, dZzde2, zzzivArr);
        }
        if (zZzG3) {
            return zzY(dZzdh2, dZzdg2, dZzdf2, dZzdh, dZzdg, dZzdf, dZzde, zzzivArr);
        }
        if (zZzG4) {
            return zzZ(dZzdh2, dZzdg2, dZzde2, dZzdh, dZzdg, dZzdf, dZzde, zzzivArr);
        }
        return zzZ(dZzdh, dZzdg, dZzdf, dZzde, dZzdh2, dZzdg2, dZzdf2, dZzde2, zzzivArr);
    }

    private static boolean zzZ(zzZIV zzziv, zzZIW zzziw) {
        return zzziw.zzZ(zzziv) <= 1.0E-4d;
    }

    private static zzZIV zzZ(zzZIX zzzix, double d) {
        double dZzdh = zzzix.zzdh();
        double dZzdd = zzzix.zzdd();
        double dZzdb = zzzix.zzdb();
        double dZzdf = zzzix.zzdf();
        double dZzdg = zzzix.zzdg();
        double dZzdc = zzzix.zzdc();
        double d2 = 1.0d - d;
        double d3 = d2 * d2 * d2;
        double d4 = 3.0d * d2;
        double d5 = d2 * d4 * d;
        double d6 = d4 * d * d;
        double d7 = dZzdb * d6;
        double d8 = d7 + (dZzdd * d5) + (dZzdh * d3);
        double d9 = d * d * d;
        double d10 = (dZzdf * d9) + d8;
        double d11 = d5 * dZzdc;
        double dZzda = d6 * zzzix.zzda();
        return new zzZIV.zzZ(d10, (d9 * zzzix.zzde()) + dZzda + d11 + (d3 * dZzdg));
    }

    private static int zzZ(double d, double d2, double d3, double d4, double[] dArr) {
        if (zzG(d, d3)) {
            dArr[0] = d;
            if (!zzG(d2, d4) && d2 >= d4) {
                dArr[1] = d4;
            } else {
                dArr[1] = d2;
            }
            return 2;
        }
        if (d < d3) {
            if (zzG(d2, d4)) {
                dArr[0] = d3;
                dArr[1] = d2;
                return 2;
            }
            if (zzG(d3, d2)) {
                dArr[0] = d2;
                return 1;
            }
            if (d3 >= d2) {
                return 0;
            }
            dArr[0] = d3;
            if (d2 >= d4) {
                d2 = d4;
            }
            dArr[1] = d2;
            return 2;
        }
        if (zzG(d2, d4)) {
            dArr[0] = d;
            dArr[1] = d2;
            return 2;
        }
        if (zzG(d, d4)) {
            dArr[0] = d;
            return 1;
        }
        if (d >= d4) {
            return 0;
        }
        dArr[0] = d;
        if (d2 >= d4) {
            d2 = d4;
        }
        dArr[1] = d2;
        return 2;
    }

    private static int zzZ(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, zzZIV[] zzzivArr) {
        double d9 = (d4 - d2) / (d3 - d);
        double d10 = d2 - (d9 * d);
        double d11 = (d8 - d6) / (d7 - d5);
        double d12 = d6 - (d11 * d5);
        if (zzG(d9, d11)) {
            if (!zzG(d10, d12)) {
                return 0;
            }
            double[] dArr = new double[2];
            int iZzZ = zzZ(d < d3 ? d : d3, d > d3 ? d : d3, d5 < d7 ? d5 : d7, d5 > d7 ? d5 : d7, dArr);
            if (iZzZ == 1) {
                double d13 = dArr[0];
                zzzivArr[0] = new zzZIV.zzZ(d13, (d9 * d13) + d10);
            }
            if (iZzZ == 2) {
                double d14 = dArr[0];
                double d15 = dArr[1];
                zzzivArr[0] = new zzZIV.zzZ(d14, (d9 * d14) + d10);
                zzzivArr[1] = new zzZIV.zzZ(d15, (d9 * d15) + d10);
            }
            return iZzZ;
        }
        double d16 = d < d3 ? d : d3;
        double d17 = d > d3 ? d : d3;
        double d18 = d5 < d7 ? d5 : d7;
        double d19 = d5 > d7 ? d5 : d7;
        double d20 = (d10 - d12) / (d11 - d9);
        double d21 = (d9 * d20) + d10;
        boolean z = (zzG(d20, d16) || d20 > d16) && (zzG(d20, d17) || d20 < d17);
        boolean z2 = (zzG(d20, d18) || d20 > d18) && (zzG(d20, d19) || d20 < d19);
        if (!z || !z2) {
            return 0;
        }
        zzzivArr[0] = new zzZIV.zzZ(d20, d21);
        return 1;
    }

    private static int zzZ(double d, double d2, double d3, double d4, double d5, double d6, double d7, zzZIV[] zzzivArr) {
        double d8 = (d7 - d5) / (d6 - d4);
        double d9 = (d8 * d) + (d5 - (d8 * d4));
        double d10 = d2 < d3 ? d2 : d3;
        double d11 = d2 > d3 ? d2 : d3;
        double d12 = d5 < d7 ? d5 : d7;
        double d13 = d5 > d7 ? d5 : d7;
        boolean z = (zzG(d9, d10) || d9 > d10) && (zzG(d9, d11) || d9 < d11);
        boolean z2 = (zzG(d9, d12) || d9 > d12) && (zzG(d9, d13) || d9 < d13);
        if (!z || !z2) {
            return 0;
        }
        zzzivArr[0] = new zzZIV.zzZ(d, d9);
        return 1;
    }

    private static int zzZ(double d, double d2, double d3, double d4, double d5, double d6, zzZIV[] zzzivArr) {
        if (!zzG(d, d4)) {
            return 0;
        }
        double d7 = d2 < d3 ? d2 : d3;
        if (d2 <= d3) {
            d2 = d3;
        }
        double[] dArr = new double[2];
        int iZzZ = zzZ(d7, d2, d5 < d6 ? d5 : d6, d5 > d6 ? d5 : d6, dArr);
        if (iZzZ == 1) {
            zzzivArr[0] = new zzZIV.zzZ(d, dArr[0]);
        }
        if (iZzZ == 2) {
            zzzivArr[0] = new zzZIV.zzZ(d, dArr[0]);
            zzzivArr[1] = new zzZIV.zzZ(d, dArr[1]);
        }
        return iZzZ;
    }

    private static int zzZ(double d, double d2, double d3, double d4, double d5, zzZIV[] zzzivArr) {
        if (!zzG(d, d3)) {
            return 0;
        }
        double d6 = d4 < d5 ? d4 : d5;
        if (d4 <= d5) {
            d4 = d5;
        }
        if ((!zzG(d2, d6) && d2 <= d6) || (!zzG(d2, d4) && d2 >= d4)) {
            return 0;
        }
        zzzivArr[0] = new zzZIV.zzZ(d, d2);
        return 1;
    }

    private static int zzZ(double d, double d2, double d3, double d4, zzZIV[] zzzivArr) {
        if (!zzG(d, d2) || !zzG(d3, d4)) {
            return 0;
        }
        zzzivArr[0] = new zzZIV.zzZ(d, d2);
        return 1;
    }
}
