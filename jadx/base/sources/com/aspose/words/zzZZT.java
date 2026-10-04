package com.aspose.words;

import OooO0O0.C20394OooO0Oo;

/* JADX INFO: loaded from: classes6.dex */
final class zzZZT {
    private static double zzYWQ = Math.sqrt(2.0d) / 2.0d;

    private static long[] zzC(long[] jArr) {
        long jZzV = com.aspose.words.internal.zzJ6.zzV(jArr);
        long[] jArr2 = new long[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            jArr2[i] = com.aspose.words.internal.zzJ6.zzX(jArr[i], jZzV, 180.0f);
        }
        return jArr2;
    }

    private static long[] zzT(int i, long[] jArr) {
        long[] jArr2 = new long[i != 46 ? i != 52 ? jArr.length : jArr.length - 2 : jArr.length - 1];
        int i2 = 0;
        for (int i3 = 0; i3 < jArr.length; i3++) {
            if ((i != 46 || i3 != 5) && (i != 52 || (i3 != 5 && i3 != 6))) {
                if (Float.intBitsToFloat((int) jArr[i3]) > 21600.0f) {
                    jArr2[i2] = com.aspose.words.internal.zzZPY.zzG(-(Float.intBitsToFloat((int) jArr[i3]) - 21600.0f), com.aspose.words.internal.zzZPY.zzYC(jArr[i3]));
                } else {
                    jArr2[i2] = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jArr[i3]), com.aspose.words.internal.zzZPY.zzYC(jArr[i3]));
                }
                i2++;
            }
        }
        return jArr2;
    }

    private static long[] zzU(int i, long[] jArr) {
        long[] jArr2 = new long[jArr.length - 1];
        int i2 = i > 45 ? i - 47 : i - 41;
        int i3 = 0;
        for (int i4 = 0; i4 < jArr.length; i4++) {
            if (i4 != i2) {
                jArr2[i3] = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jArr[i4]), com.aspose.words.internal.zzZPY.zzYC(jArr[i4]));
                i3++;
            }
        }
        return jArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static long[] zzV(int i, long[] jArr) {
        if (i == 8) {
            return zzC(jArr);
        }
        switch (i) {
            case 43:
            case 46:
                return zzT(i, jArr);
            case 44:
            case 45:
                return zzU(i, jArr);
            default:
                switch (i) {
                    case 49:
                    case 52:
                        break;
                    case 50:
                    case 51:
                        break;
                    default:
                        switch (i) {
                            case 178:
                            case 179:
                            case 180:
                            case 181:
                                long[] jArr2 = new long[jArr.length];
                                jArr2[0] = com.aspose.words.internal.zzJ6.zzX(jArr[0], jArr[1], 18.0f);
                                for (int i2 = 1; i2 < jArr.length; i2++) {
                                    jArr2[i2] = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jArr[i2]), com.aspose.words.internal.zzZPY.zzYC(jArr[i2]));
                                }
                                return jArr2;
                            default:
                                return jArr;
                        }
                }
                break;
        }
    }

    public static zzYM5[] zzZ(Shape shape, int i, double d, double d2) {
        zzYC3 zzyc3Zzm2 = zzYBW.zzm2(i);
        zzYM5[] zzym5Arr = (zzYM5[]) zzyc3Zzm2.zzPj(StyleIdentifier.LIST_TABLE_4);
        shape.zzWf(d);
        shape.zzWf(d2);
        long[] jArrZzV = zzV(i, zzZLG.zzZ(zzym5Arr, zzZ(shape, zzyc3Zzm2, d, d2)));
        zzYM5[] zzym5Arr2 = new zzYM5[jArrZzV.length];
        for (int i2 = 0; i2 < jArrZzV.length; i2++) {
            zzym5Arr2[i2] = new zzYM5((int) com.aspose.words.internal.zzZKQ.zzZa(Float.intBitsToFloat((int) jArrZzV[i2])), (int) com.aspose.words.internal.zzZKQ.zzZa(com.aspose.words.internal.zzZPY.zzYC(jArrZzV[i2])));
        }
        return zzym5Arr2;
    }

    public static zzYM5[] zzZrU() {
        return new zzYM5[]{new zzYM5(0, 0), new zzYM5(0, 21600), new zzYM5(21600, 21600), new zzYM5(21600, 0)};
    }

    public static zzYM5[] zzZrV() {
        zzYM5[] zzym5Arr = new zzYM5[18];
        int i = 0;
        int i2 = 0;
        while (i < 360) {
            zzym5Arr[i2] = new zzYM5(String.length(), (int) ((Math.sin((((double) i) * 3.141592653589793d) / 180.0d) * 10800.0d) + 10800.0d));
            i += 20;
            i2++;
        }
        return zzym5Arr;
    }

    public static zzYM5[] zzk(double d, double d2) {
        double dSqrt = Math.sqrt((d2 * d2) + (d * d));
        double d3 = com.aspose.words.internal.zzAN.zzZD(dSqrt) ? 0.0d : d2 / dSqrt;
        if (d3 < 0.03d || d3 > 0.9998d) {
            return zzZrU();
        }
        double d4 = zzYWQ;
        if (d3 > d4) {
            d3 = d4 - (((d3 - d4) * d4) / (1.0d - d4));
        }
        int iZzZa = (int) com.aspose.words.internal.zzZKQ.zzZa(C20394OooO0Oo.OooO0O0(1.0d, d3, 0.25d, 21600.0d));
        int i = 21600 - iZzZa;
        return new zzYM5[]{new zzYM5(0, 0), new zzYM5(0, iZzZa), new zzYM5(i, 21600), new zzYM5(21600, 21600), new zzYM5(21600, i), new zzYM5(iZzZa, 0)};
    }

    private static int[] zzZ(Shape shape, zzYC3 zzyc3, double d, double d2) {
        int iIntValue = ((Integer) shape.zzYvW().get(EditingLanguage.LULE_SAMI_NORWAY)).intValue();
        if ((iIntValue == 7 || iIntValue == 8 || iIntValue == 9) && d2 <= d) {
            return zzZ(shape, zzyc3, com.aspose.words.internal.zzAN.zzZD(d) ? 0.0d : d2 / d);
        }
        return zzZLG.zzA(shape);
    }

    private static int[] zzZ(Shape shape, zzYC3 zzyc3, double d) {
        for (int i = 327; i <= 336; i++) {
            if (zzyc3.zzVE(i)) {
                shape.setShapeAttr(i, Integer.valueOf((int) com.aspose.words.internal.zzZKQ.zzZa(((double) ((Integer) zzyc3.get(i)).intValue()) * d)));
            }
        }
        int[] iArrZzA = zzZLG.zzA(shape);
        for (int i2 = StyleIdentifier.LIST_TABLE_6_COLORFUL; i2 <= 336; i2++) {
            shape.removeShapeAttr(i2);
        }
        return iArrZzA;
    }
}
