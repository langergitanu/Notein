package com.aspose.words;

import OooOoO.C20503OooO00o;

/* JADX INFO: loaded from: classes6.dex */
final class zzZLG {
    public static int[] zzA(Shape shape) {
        return zzX(shape, com.aspose.words.internal.zzZPW.zzG((int) shape.zzY9d(), (int) (shape.zzY9d() >>> 32)));
    }

    public static boolean zzB(Shape shape) {
        return shape.getTextBox().getLayoutFlow() == 0 || shape.getTextBox().getLayoutFlow() == 4;
    }

    private static int[] zzX(Shape shape, long j) {
        zzZLU[] zzzluArrZzYbo = shape.zzYbo();
        if (zzzluArrZzYbo == null || zzzluArrZzYbo.length == 0) {
            return null;
        }
        int[] iArr = new int[zzzluArrZzYbo.length];
        for (int i = 0; i < zzzluArrZzYbo.length; i++) {
            zzZLU zzzlu = zzzluArrZzYbo[i];
            iArr[i] = zzZ(zzzlu, zzzlu.zzZ5H() ? zzZ(shape, iArr, zzzlu.zzYvs, j) : zzzlu.zzYvs, zzzlu.zzZ5G() ? zzZ(shape, iArr, zzzlu.zzYvr, j) : zzzlu.zzYvr, zzzlu.zzZ5F() ? zzZ(shape, iArr, zzzlu.zzYvq, j) : zzzlu.zzYvq);
        }
        return iArr;
    }

    private static com.aspose.words.internal.zzZQ4 zzXJ(long j) {
        float f = (int) (j >>> 32);
        float f2 = (int) j;
        float f3 = f / f2;
        float f4 = f2 * 0.5f;
        float f5 = f * 0.5f;
        float f6 = f5 * f5;
        float f7 = f4 * f4;
        float fSqrt = (float) Math.sqrt((f7 * f6) / (((f3 * f3) * f7) + f6));
        float f8 = -fSqrt;
        long jZzG = com.aspose.words.internal.zzZPY.zzG(f8 + f4, (f3 * f8) + f5);
        long jZzG2 = com.aspose.words.internal.zzZPY.zzG(fSqrt + f4, (f3 * fSqrt) + f5);
        return new com.aspose.words.internal.zzZQ4(jZzG, com.aspose.words.internal.zzZPW.zzG(Float.intBitsToFloat((int) jZzG2) - Float.intBitsToFloat((int) jZzG), com.aspose.words.internal.zzZPY.zzYC(jZzG2) - com.aspose.words.internal.zzZPY.zzYC(jZzG)));
    }

    public static com.aspose.words.internal.zzZQ4 zzY(Shape shape, int[] iArr) {
        boolean zZzB = zzB(shape);
        zzYM4[] zzym4ArrZzYaD = shape.zzYaD();
        int length = zzym4ArrZzYaD.length;
        if (length == 1) {
            return zzZ(zzym4ArrZzYaD[0], iArr, (zzYBX) null);
        }
        if (length != 2) {
            return length != 3 ? length != 6 ? new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, (int) shape.zzY9d(), (int) (shape.zzY9d() >>> 32)) : zzZ(shape, zzym4ArrZzYaD, iArr, (zzYBX) null) : zzZ(shape, zzym4ArrZzYaD, iArr, (zzYBX) null);
        }
        return zzZ(zZzB ? zzym4ArrZzYaD[0] : zzym4ArrZzYaD[1], iArr, (zzYBX) null);
    }

    public static zzYC8 zzZ(Shape shape, long j, long j2, zzYBX zzybx) {
        shape.getClass();
        int[] iArrZzX = zzX(shape, zzybx.zzY8H());
        int[] iArrZzX2 = (shape.zzYbm() == 0 && shape.zzYbl() == 0) ? iArrZzX : zzX(shape, com.aspose.words.internal.zzZPX.zzYA(shape.zzY9d()));
        long[] jArrZzZ = zzZ(shape.zzYbp(), iArrZzX);
        zzYC8 zzyc8 = new zzYC8(j, j2);
        zzyc8.zzZ(zzZ5J.zzp(shape));
        zzyc8.zzYZ(zzY(shape, iArrZzX2));
        zzZ(shape, zzyc8, jArrZzZ);
        return zzyc8;
    }

    private static com.aspose.words.internal.zzZQ4 zzY(long j, zzYC8 zzyc8) {
        zzyc8.zzY(new zzYM6[2]);
        zzyc8.zzY91()[0] = new zzYM6(162, 3);
        zzyc8.zzy(new long[]{0, 0, 0});
        float f = ((int) j) * 0.5f;
        float f2 = ((int) (j >>> 32)) * 0.5f;
        zzyc8.zzY90()[0] = com.aspose.words.internal.zzZPY.zzG(f, f2);
        zzyc8.zzY90()[1] = com.aspose.words.internal.zzZPY.zzG(f, f2);
        zzyc8.zzY90()[2] = com.aspose.words.internal.zzZPY.zzG(0.0f, -2.359296E7f);
        zzyc8.zzY91()[1] = new zzYM6(3, 0);
        return zzXJ(j);
    }

    public static long[] zzZ(zzYM5[] zzym5Arr, int[] iArr) {
        if (zzym5Arr == null) {
            return null;
        }
        long[] jArr = new long[zzym5Arr.length];
        for (int i = 0; i < zzym5Arr.length; i++) {
            zzYM5 zzym5 = zzym5Arr[i];
            int value = zzym5.zzYnG().getValue();
            int value2 = zzym5.zzYnF().getValue();
            if (iArr != null) {
                if (zzym5.zzYnG().zzYnC()) {
                    value = iArr[zzym5.zzYnG().getValue()];
                }
                if (zzym5.zzYnF().zzYnC()) {
                    value2 = iArr[zzym5.zzYnF().getValue()];
                }
            }
            jArr[i] = com.aspose.words.internal.zzZPY.zzG(value, value2);
        }
        return jArr;
    }

    private static float zzY(zzYM2 zzym2, int[] iArr) {
        if (zzym2.zzYnC() && iArr == null) {
            return 0.0f;
        }
        return zzym2.zzYnC() ? iArr[r1] : zzym2.getValue();
    }

    private static com.aspose.words.internal.zzZQ4 zzZ(Shape shape, zzYM4[] zzym4Arr, int[] iArr, zzYBX zzybx) {
        float fZzZ;
        float fZzZ2;
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ;
        float f;
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ2;
        int i = (zzym4Arr.length != 6 || zzB(shape)) ? 0 : 3;
        if (shape.zzYaE() != null && shape.zzYaE().length != 0) {
            zzZL3 zzzl3 = shape.zzYaE()[0];
            int iZzmi = shape.zzmi(1);
            if (zzzl3.zzYu1.getType() == 5 && zzzl3.zzYu1.getValue() == 0) {
                fZzZ = zzZ(zzzl3.zzYtX, iArr);
                fZzZ2 = zzZ(zzzl3.zzYtW, iArr);
            } else {
                fZzZ = zzZ(zzzl3.zzYtV, iArr);
                fZzZ2 = zzZ(zzzl3.zzYtU, iArr);
            }
            float fOooO0O0 = C20503OooO00o.OooO0O0(fZzZ2, fZzZ, 2.0f, fZzZ);
            float f2 = iZzmi;
            if (f2 < fOooO0O0) {
                zzzq4ZzZ2 = zzZ(zzym4Arr[i], iArr, (zzYBX) null);
                zzzq4ZzZ = zzZ(zzym4Arr[i + 1], iArr, (zzYBX) null);
                f = f2 / (fOooO0O0 - fZzZ);
            } else {
                com.aspose.words.internal.zzZQ4 zzzq4ZzZ3 = zzZ(zzym4Arr[i + 1], iArr, (zzYBX) null);
                zzzq4ZzZ = zzZ(zzym4Arr[i + 2], iArr, (zzYBX) null);
                f = (f2 - fOooO0O0) / (fZzZ2 - fOooO0O0);
                zzzq4ZzZ2 = zzzq4ZzZ3;
            }
            return zzZ(zzzq4ZzZ2, zzzq4ZzZ, f);
        }
        return zzZ(zzym4Arr[i], iArr, (zzYBX) null);
    }

    private static com.aspose.words.internal.zzZQ4 zzZ(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42, float f) {
        float x = zzzq4.getX();
        float x2 = ((zzzq42.getX() - x) * f) + x;
        float y = zzzq4.getY();
        float y2 = ((zzzq42.getY() - y) * f) + y;
        float fZzkw = zzzq4.zzkw();
        float fZzkw2 = (((zzzq42.zzkw() - fZzkw) * f) + fZzkw) - x2;
        float fZzZn = zzzq4.zzZn();
        return new com.aspose.words.internal.zzZQ4(x2, y2, fZzkw2, (((zzzq42.zzZn() - fZzZn) * f) + fZzZn) - y2);
    }

    private static com.aspose.words.internal.zzZQ4 zzZ(zzYM4 zzym4, int[] iArr, zzYBX zzybx) {
        float fZzY = zzY(zzym4.zzXFj, iArr);
        float fZzY2 = zzY(zzym4.zzXFi, iArr);
        float fZzY3 = zzY(zzym4.zzXFh, iArr);
        float fZzY4 = zzY(zzym4.zzXFg, iArr);
        if (zzybx == null) {
            return new com.aspose.words.internal.zzZQ4(fZzY, fZzY2, fZzY3 - fZzY, fZzY4 - fZzY2);
        }
        int iZzYbm = zzybx.getShape().zzYbm();
        int iZzYbl = zzybx.getShape().zzYbl();
        long jZzX = zzybx.zzX(com.aspose.words.internal.zzZPY.zzG(fZzY, fZzY2), zzZ5I.zzZ(zzym4.zzXFj, zzym4.zzXFi, iZzYbm, iZzYbl));
        long jZzX2 = zzybx.zzX(com.aspose.words.internal.zzZPY.zzG(fZzY3, fZzY4), zzZ5I.zzZ(zzym4.zzXFh, zzym4.zzXFg, iZzYbm, iZzYbl));
        int i = (int) jZzX;
        return new com.aspose.words.internal.zzZQ4(Float.intBitsToFloat(i), com.aspose.words.internal.zzZPY.zzYC(jZzX), Float.intBitsToFloat((int) jZzX2) - Float.intBitsToFloat(i), com.aspose.words.internal.zzZPY.zzYC(jZzX2) - com.aspose.words.internal.zzZPY.zzYC(jZzX));
    }

    private static void zzZ(Shape shape, zzYC8 zzyc8, long[] jArr) {
        int shapeType = shape.getShapeType();
        if (shapeType == 1) {
            zzZ(shape.zzY9d(), zzyc8);
            return;
        }
        if (shapeType == 2) {
            long jZzY9d = shape.zzY9d();
            int iZzmi = shape.zzmi(1);
            if (iZzmi <= 0) {
                zzZ(shape.zzY9d(), zzyc8);
                return;
            } else {
                zzZ(iZzmi, jZzY9d, zzyc8);
                return;
            }
        }
        if (shapeType == 3) {
            zzyc8.zzYZ(zzY(shape.zzY9d(), zzyc8));
            return;
        }
        if (shapeType != 20) {
            if (shape.getShapeType() == 0 && shape.zzYbq() == null && !com.aspose.words.internal.zzZPW.zzYF(shape.getSize())) {
                zzZ(shape.zzY9d(), zzyc8);
                return;
            } else {
                zzyc8.zzY(shape.zzYbq());
                zzyc8.zzy(jArr);
                return;
            }
        }
        zzZ(shape.zzY9d(), zzyc8, jArr);
    }

    private static void zzZ(long j, zzYC8 zzyc8) {
        zzyc8.zzY(new zzYM6[3]);
        zzyc8.zzY91()[0] = new zzYM6(2, 0);
        zzyc8.zzY91()[1] = new zzYM6(0, 3);
        zzyc8.zzy(new long[]{0, 0, 0, 0});
        zzyc8.zzY90()[0] = 0;
        float f = (int) j;
        zzyc8.zzY90()[1] = com.aspose.words.internal.zzZPY.zzG(f, 0.0f);
        float f2 = (int) (j >>> 32);
        zzyc8.zzY90()[2] = com.aspose.words.internal.zzZPY.zzG(f, f2);
        zzyc8.zzY90()[3] = com.aspose.words.internal.zzZPY.zzG(0.0f, f2);
        zzyc8.zzY91()[2] = new zzYM6(3, 0);
    }

    private static void zzZ(long j, zzYC8 zzyc8, long[] jArr) {
        zzyc8.zzY(new zzYM6[2]);
        zzyc8.zzY91()[0] = new zzYM6(2, 0);
        zzyc8.zzY91()[1] = new zzYM6(0, 1);
        if (jArr != null && jArr.length > 1) {
            zzyc8.zzy(jArr);
        } else {
            zzyc8.zzy(new long[]{0, 0});
            zzyc8.zzY90()[1] = com.aspose.words.internal.zzZPY.zzG((int) j, (int) (j >>> 32));
        }
    }

    private static void zzZ(int i, long j, zzYC8 zzyc8) {
        int iZzYz;
        int i2 = i;
        long jZzY8X = zzyc8.zzY8X();
        int i3 = (int) jZzY8X;
        if (Float.intBitsToFloat(i3) > com.aspose.words.internal.zzZPW.zzYz(jZzY8X)) {
            iZzYz = (int) ((com.aspose.words.internal.zzZPW.zzYz(jZzY8X) / Float.intBitsToFloat(i3)) * i2);
        } else {
            int iIntBitsToFloat = (int) ((Float.intBitsToFloat(i3) / com.aspose.words.internal.zzZPW.zzYz(jZzY8X)) * i2);
            iZzYz = i2;
            i2 = iIntBitsToFloat;
        }
        zzyc8.zzY(new zzYM6[10]);
        zzyc8.zzy(new long[]{0, 0, 0, 0, 0, 0, 0, 0});
        zzyc8.zzY91()[0] = new zzYM6(2, 0);
        float f = i2;
        zzyc8.zzY90()[0] = com.aspose.words.internal.zzZPY.zzG(0.0f, f);
        zzyc8.zzY91()[1] = new zzYM6(168, 1);
        float f2 = iZzYz;
        zzyc8.zzY90()[1] = com.aspose.words.internal.zzZPY.zzG(f2, 0.0f);
        zzyc8.zzY91()[2] = new zzYM6(0, 1);
        int i4 = (int) j;
        float f3 = i4 - iZzYz;
        zzyc8.zzY90()[2] = com.aspose.words.internal.zzZPY.zzG(f3, 0.0f);
        zzyc8.zzY91()[3] = new zzYM6(167, 1);
        float f4 = i4;
        zzyc8.zzY90()[3] = com.aspose.words.internal.zzZPY.zzG(f4, f);
        zzyc8.zzY91()[4] = new zzYM6(0, 1);
        int i5 = (int) (j >>> 32);
        float f5 = i5 - i2;
        zzyc8.zzY90()[4] = com.aspose.words.internal.zzZPY.zzG(f4, f5);
        zzyc8.zzY91()[5] = new zzYM6(168, 1);
        float f6 = i5;
        zzyc8.zzY90()[5] = com.aspose.words.internal.zzZPY.zzG(f3, f6);
        zzyc8.zzY91()[6] = new zzYM6(0, 1);
        zzyc8.zzY90()[6] = com.aspose.words.internal.zzZPY.zzG(f2, f6);
        zzyc8.zzY91()[7] = new zzYM6(167, 1);
        zzyc8.zzY90()[7] = com.aspose.words.internal.zzZPY.zzG(0.0f, f5);
        zzyc8.zzY91()[8] = new zzYM6(3, 1);
        zzyc8.zzY91()[9] = new zzYM6(4, 0);
    }

    private static float zzZ(zzYM2 zzym2, int[] iArr) {
        return zzym2.zzYnC() ? iArr[r1 - 3] : zzym2.getValue();
    }

    private static int zzZ(zzZLU zzzlu, int i, int i2, int i3) {
        switch (zzzlu.zzYvt) {
            case 0:
                return (i + i2) - i3;
            case 1:
                int i4 = i * i2;
                return i3 != 0 ? i4 / i3 : i4;
            case 2:
                return (i + i2) / 2;
            case 3:
                return Math.abs(i);
            case 4:
                return Math.min(i, i2);
            case 5:
                return Math.max(i, i2);
            case 6:
                return i > 0 ? i2 : i3;
            case 7:
                return com.aspose.words.internal.zzQO.zze(Math.sqrt((i3 * i3) + (i2 * i2) + (i * i)));
            case 8:
                return com.aspose.words.internal.zzQO.zze(com.aspose.words.internal.zzAN.zzZK(Math.atan2(i2, i)) * 65536.0d);
            case 9:
                return com.aspose.words.internal.zzQO.zze(Math.sin(com.aspose.words.internal.zzAN.zzZL(i2 / 65536.0f)) * ((double) i));
            case 10:
                return com.aspose.words.internal.zzQO.zze(Math.cos(com.aspose.words.internal.zzAN.zzZL(i2 / 65536.0f)) * ((double) i));
            case 11:
                return com.aspose.words.internal.zzQO.zze(Math.cos(Math.atan2(i3, i2)) * ((double) i));
            case 12:
                return com.aspose.words.internal.zzQO.zze(Math.sin(Math.atan2(i3, i2)) * ((double) i));
            case 13:
                return com.aspose.words.internal.zzQO.zze(Math.floor(Math.sqrt(i)));
            case 14:
                return ((i2 * 65536) + i) - (i3 * 65536);
            case 15:
                return com.aspose.words.internal.zzQO.zze(Math.sqrt(1.0d - Math.pow(((double) i) / ((double) i2), 2.0d)) * ((double) i3));
            case 16:
                return com.aspose.words.internal.zzQO.zze(Math.tan(com.aspose.words.internal.zzAN.zzZL(i2 / 65536.0f)) * ((double) i));
            default:
                throw new IllegalArgumentException();
        }
    }

    private static int zzZ(Shape shape, int[] iArr, int i, long j) {
        int iZzZyh;
        int iZzZG;
        if (i >= 1024 && i <= 1151) {
            return iArr[i - 1024];
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) j);
        float fZzYz = com.aspose.words.internal.zzZPW.zzYz(j);
        if (i == 339) {
            return shape.zzYbm();
        }
        if (i == 340) {
            return shape.zzYbl();
        }
        if (i == 508) {
            return shape.getStroked() ? 1 : 0;
        }
        switch (i) {
            case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_6 /* 320 */:
                iZzZyh = shape.zzY9h().zzZyh();
                iZzZG = com.aspose.words.internal.zzAN.zzZG(fIntBitsToFloat / 2.0f);
                break;
            case StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_6 /* 321 */:
                iZzZyh = shape.zzY9h().zzZyg();
                iZzZG = com.aspose.words.internal.zzAN.zzZG(fZzYz / 2.0f);
                break;
            case StyleIdentifier.LIST_TABLE_1_LIGHT /* 322 */:
                return com.aspose.words.internal.zzAN.zzZG(fIntBitsToFloat);
            case StyleIdentifier.LIST_TABLE_2 /* 323 */:
                return com.aspose.words.internal.zzAN.zzZG(fZzYz);
            default:
                switch (i) {
                    case StyleIdentifier.LIST_TABLE_6_COLORFUL /* 327 */:
                        return shape.zzmi(1);
                    case StyleIdentifier.LIST_TABLE_7_COLORFUL /* 328 */:
                        return shape.zzmi(2);
                    case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_1 /* 329 */:
                        return shape.zzmi(3);
                    case StyleIdentifier.LIST_TABLE_2_ACCENT_1 /* 330 */:
                        return shape.zzmi(4);
                    case StyleIdentifier.LIST_TABLE_3_ACCENT_1 /* 331 */:
                        return shape.zzmi(5);
                    case StyleIdentifier.LIST_TABLE_4_ACCENT_1 /* 332 */:
                        return shape.zzmi(6);
                    case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_1 /* 333 */:
                        return shape.zzmi(7);
                    case StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_1 /* 334 */:
                        return shape.zzmi(8);
                    default:
                        switch (i) {
                            case 1271:
                                return (int) com.aspose.words.internal.zzSA.zzYz((int) shape.getStrokeWeight());
                            case 1272:
                                return (int) ConvertUtil.pointToPixel(Float.intBitsToFloat((int) shape.zzYzG().getSize()));
                            case 1273:
                                return (int) ConvertUtil.pointToPixel(com.aspose.words.internal.zzZPW.zzYz(shape.zzYzG().getSize()));
                            default:
                                switch (i) {
                                    case 1276:
                                        return com.aspose.words.internal.zzSA.zzp(Float.intBitsToFloat((int) shape.zzYzG().getSize()));
                                    case 1277:
                                        return com.aspose.words.internal.zzSA.zzp(com.aspose.words.internal.zzZPW.zzYz(shape.zzYzG().getSize()));
                                    case 1278:
                                        return com.aspose.words.internal.zzSA.zzp(Float.intBitsToFloat((int) shape.zzYzG().getSize()) * 0.5f);
                                    case 1279:
                                        return com.aspose.words.internal.zzSA.zzp(Float.intBitsToFloat((int) shape.zzYzG().getSize()) * 0.5f);
                                    default:
                                        throw new IllegalArgumentException(com.aspose.words.internal.zzZKN.format("Formula calculated parameter has value of: {0}", Integer.valueOf(i)) + "\r\nParameter name: param");
                                }
                        }
                }
        }
        return iZzZG + iZzZyh;
    }
}
