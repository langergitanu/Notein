package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzWU {
    public static int zzS(zzWV zzwv) {
        if (!((zzYIC) zzwv.zza9()).zzYk5() || zzwv.zzYTn()) {
            return 0;
        }
        int iZzYKt = ((zzYIC) zzwv.zza9()).zzYKt();
        int i = iZzYKt * 2;
        if (zzwv.zz8t()) {
            i += iZzYKt;
        }
        return zzwv.zz8s() ? i + iZzYKt : i;
    }

    public static int zzT(zzWV zzwv) {
        if (zzwv.zzYTn()) {
            zzWV zzwv2 = (zzWV) zzwv.zzYTo();
            if (zzwv2 == null || !zzwv.zz6a()) {
                return 0;
            }
            return zzZ(zzwv2, 1) / 2;
        }
        int iZzZ = zzZ(zzwv, 2);
        if (!((zzYIC) zzwv.zza9()).zzYk4()) {
            return Math.max(((zzZ3B) zzwv.zzYTt()).getRightPadding() + ((zzZ3B) zzwv.zzYTt()).getLeftPadding(), (zzZ(zzwv, 1) + iZzZ) / 2) - zzV(zzwv);
        }
        int rightPadding = ((zzZ3B) zzwv.zzYTt()).getRightPadding();
        int iZzYKt = ((zzYIC) zzwv.zza9()).zzYKt();
        if (zzwv.zz8s()) {
            iZzYKt *= 2;
        }
        return rightPadding + iZzZ + iZzYKt;
    }

    private static int zzU(zzWV zzwv) {
        return (zzZ(zzwv, 1) - zzZ(zzwv, 2)) / 2;
    }

    public static int zzV(zzWV zzwv) {
        if (zzwv.zzYTn()) {
            zzWV zzwv2 = (zzWV) zzwv.zzYTo();
            if (zzwv2 == null || zzwv.zz6a()) {
                return 0;
            }
            return zzZ(zzwv2, 2) / 2;
        }
        int iZzZ = zzZ(zzwv, 1);
        int leftPadding = ((zzZ3B) zzwv.zzYTt()).getLeftPadding();
        if (!((zzYIC) zzwv.zza9()).zzYk4()) {
            int i = iZzZ / 2;
            return zzwv.zz6a() ? Math.max(i, leftPadding + zzU(zzwv)) : Math.max(i, leftPadding);
        }
        int iZzYKt = ((zzYIC) zzwv.zza9()).zzYKt();
        if (zzwv.zz8t()) {
            iZzYKt *= 2;
            iZzZ = Math.max((((zzYIC) zzwv.zza9()).zzYk1().zzYMV().zzwz(1).zzYN3() / 2) - iZzYKt, iZzZ);
        }
        return leftPadding + iZzZ + iZzYKt;
    }

    public static int zzW(zzWV zzwv) throws Exception {
        if (((zzWV) zzwv.zzYTp()) == null) {
            return 0;
        }
        zzwv.zza9();
        ((zzYIC) zzwv.zza9()).zza9();
        ((zzYIC) zzwv.zza9()).zza9();
        int[] iArrZzXYt = ((zzY6N) ((zzYIC) zzwv.zza9()).zza9()).zzXYt();
        int columnIndex = zzwv.getColumnIndex();
        int columnCount = zzwv.getColumnCount();
        int i = 0;
        for (int i2 = 0; i2 < columnCount; i2++) {
            int i3 = columnIndex + i2;
            if (i3 >= iArrZzXYt.length) {
                break;
            }
            i += iArrZzXYt[i3];
        }
        return i;
    }

    public static int zzX(zzWV zzwv) throws Exception {
        return zzwv.zzYTm() ? zzZ((zzYIC) zzwv.zza9()) : ((zzWV) zzwv.zzYTo()).getRight();
    }

    public static int zzY(zzWT zzwt) throws Exception {
        int iZzYjN = ((zzYIA) zzwt.zzZZJ()).zzYjN();
        if (zzwt.isEmpty()) {
            return iZzYjN;
        }
        if (zzwt.zz6x().zz60() == 32) {
            return iZzYjN + zzwt.zz6x().getHeight();
        }
        zzYIA zzyia = (zzYIA) zzwt.zz6x();
        return (zzyia.zz56() - zzyia.zzYjM()) + iZzYjN;
    }

    public static int zzZ(zzWT zzwt) throws Exception {
        if (zzwt.isVirtual() || zzwt.isEmpty()) {
            return 0;
        }
        zzYMD zzymdZzY8k = zzwt.zzY8k();
        return Math.max(zzymdZzY8k != null ? (zzymdZzY8k.getBottom() - zzwt.zz5Q()) - zzwt.zz5W() : 0, zzwt.zz5L());
    }

    public static int zzU(zzWT zzwt) throws Exception {
        zzWV zzwvZzZ = zzWK.zzZ((zzWV) zzwt.zza9(), (zzYIC) ((zzYIA) zzwt.zzZZJ()).zza9());
        zzwvZzZ.zza9();
        ((zzYIA) zzwt.zzZZJ()).zza9();
        int iZzH = 0;
        int iZzYjK = 0;
        for (zzYIA zzyia = (zzYIA) zzwt.zzZZJ(); zzyia != null; zzyia = (zzYIA) com.aspose.words.internal.zzZKW.zzZ(zzyia.zz5Z(), zzYIA.class)) {
            if (zzwvZzZ.zza9() != zzyia.zza9()) {
                zzwvZzZ = zzwvZzZ.zz6n();
            }
            if (zzwvZzZ == null || !zzyia.zzac()) {
                break;
            }
            iZzH += zzYIB.zzH(zzyia);
            if (((zzYIC) zzyia.zza9()).zzYk5()) {
                iZzH += iZzYjK;
                iZzYjK = zzyia.zzYjK();
            }
        }
        return iZzH;
    }

    public static com.aspose.words.internal.zzZQ4 zzX(zzWT zzwt) throws Exception {
        return zzZ(zzwt, true);
    }

    public static int zzZ(zzWV zzwv, int i) {
        zzZ3B zzz3b;
        if ((zzwv.zzYTn() && 1 != i) || (zzz3b = (zzZ3B) zzwv.zzYTt()) == null || zzz3b.zzYMV() == null || zzz3b.zzYMV().zzwz(i) == null) {
            return 0;
        }
        return zzz3b.zzYMV().zzwz(i).zzYN3();
    }

    public static com.aspose.words.internal.zzZQ4 zzS(zzWT zzwt) throws Exception {
        int iZzYjN = ((zzYIA) zzwt.zzZZJ()).zzYjN();
        int iZzV = zzV((zzWV) zzwt.zza9());
        return com.aspose.words.internal.zzSA.zzY(new com.aspose.words.internal.zzZQ5(iZzV, iZzYjN, Math.max(0, (zzwt.getWidth() - iZzV) - zzT((zzWV) zzwt.zza9())), Math.max(0, zzV(zzwt) - ((zzYIA) zzwt.zzZZJ()).zzYjI()) - iZzYjN));
    }

    private static int zzZ(zzYIC zzyic) throws Exception {
        int iZzYka;
        if ((zzyic.zzYk1().getAlignment() != 0 && zzyic.zza7().getAlignTablesRowByRow()) || (iZzYka = zzyic.zzYka()) == 0) {
            return 0;
        }
        int[] iArrZzXYt = ((zzY6N) zzyic.zza9()).zzXYt();
        return zzYIB.zzV(iArrZzXYt, 0, iArrZzXYt.length - iZzYka);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a9 A[PHI: r9
      0x00a9: PHI (r9v3 float) = (r9v2 float), (r9v5 float) binds: [B:5:0x0062, B:7:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.aspose.words.internal.zzZQ4 zzW(zzWT zzwt) throws Exception {
        float f;
        zzYIA zzyia = (zzYIA) zzwt.zzZZJ();
        if (((zzYIC) zzyia.zza9()).zzYk4()) {
            zzZ3C zzz3cZzYMV = ((zzZ3B) ((zzWV) zzwt.zza9()).zzYTt()).zzYMV();
            com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzZ(zzwt, false);
            Border borderZzV = zzZ70.zzV(zzwt, 3);
            float f2 = -borderZzV.zz8S();
            Border borderZzV2 = zzZ70.zzV(zzwt, 1);
            float fZz8S = (-borderZzV2.zz8S()) / 2.0f;
            Border borderZzV3 = zzZ70.zzV(zzwt, 2);
            float fZz8S2 = borderZzV3.zz8S() / 2.0f;
            float fZzYKt = ((zzYIC) ((zzWV) zzwt.zza9()).zza9()).zzYKt() / 1000.0f;
            if (!borderZzV2.isVisible()) {
                fZz8S -= fZzYKt;
                if (((zzWV) zzwt.zza9()).zz8t()) {
                    fZz8S = (fZz8S - fZzYKt) - (zz5.zzZ(zzz3cZzYMV.zzwz(1)).zz8S() / 2.0f);
                    f = 2.0f;
                    if (((zzYIC) ((zzWV) zzwt.zza9()).zza9()).zzYk1().zzYMV().zzwz(5).isVisible()) {
                        zzz3cZzYMV.zzwz(1).isAmbient();
                    }
                } else {
                    f = 2.0f;
                }
            }
            if (!borderZzV3.isVisible()) {
                fZz8S2 += fZzYKt;
                if (((zzWV) zzwt.zza9()).zz8s()) {
                    fZz8S2 = fZz8S2 + fZzYKt + (zz5.zzZ(zzz3cZzYMV.zzwz(2)).zz8S() / f);
                }
            }
            if (!borderZzV.isVisible() && !zzwt.zz5J()) {
                f2 -= fZzYKt;
                if (zzyia.zzYjE()) {
                    f2 -= fZzYKt;
                }
            }
            Border borderZzV4 = zzZ70.zzV(zzwt, 0);
            if ((((zzWV) zzwt.zza9()).zz6m() != 0 && !zzwt.isSink()) || borderZzV4.isVisible() || zzZ70.zzK(zzwt)) {
                fZzYKt = 0.0f;
            } else if (zzyia.zzYjF()) {
                fZzYKt += fZzYKt;
            }
            return new com.aspose.words.internal.zzZQ4(zzzq4ZzZ.getX() + (zzwt.getX() / 1000.0f) + fZz8S, zzzq4ZzZ.getY() + (zzwt.getY() / 1000.0f) + f2, (zzzq4ZzZ.getWidth() - fZz8S) + fZz8S2, (zzzq4ZzZ.getHeight() - f2) + fZzYKt);
        }
        int height = zzyia.getHeight();
        if (zzyia.zzYjG()) {
            height -= zzyia.zzYjK();
        }
        return com.aspose.words.internal.zzSA.zzY(new com.aspose.words.internal.zzZQ5(0, 0, zzwt.getWidth(), height));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzZ(zzWT zzwt, boolean z, boolean z2) throws Exception {
        zzZNL zzznlZzYF;
        zzwt.zza9();
        ((zzWV) zzwt.zza9()).zza9();
        zzYIC zzyic = (zzYIC) ((zzWV) zzwt.zza9()).zza9();
        if (zzyic.zzYk1().getHeightRule() == 1) {
            return zzyic.zzYk1().getHeight() + ((zzYIA) zzwt.zzZZJ()).zzYjM();
        }
        int iMax = 0;
        if (!zzwt.isEmpty() && !zzwt.isVirtual() && ((zzWV) zzwt.zza9()).zz6m() == 0) {
            if (zzwt.zz6x().zz60() == 32) {
                zzZ55 zzz55 = (zzZ55) com.aspose.words.internal.zzZKW.zzZ(zzwt.zz6x(), zzZ55.class);
                int height = zzz55.getHeight();
                if (z2 && (zzznlZzYF = zzwt.zzYF(false)) != null && zzznlZzYF.getCount() > 0) {
                    int bottom = zzz55.getBottom();
                    for (zzZNO zzzno : zzznlZzYF) {
                        if (zzzno.zzZ99() == 25604 && ((zzY9X) ((zzZNH) zzzno).zzZ90()).zzZZJ() == zzz55) {
                            bottom = Math.max(zzzno.zzVI(false).getBottom(), bottom);
                        }
                    }
                    height = bottom - ((zzYIA) zzwt.zzZZJ()).zzYjN();
                }
                if (z || zzwt.zza6().zzY6a().isFloating() || !zzwt.zza7().zzZYM()) {
                    iMax = height;
                } else {
                    zzZ55 zzz552 = (zzZ55) zzwt.zz6x();
                    if (((zzZ37) ((zzYMM) zzz552.zza9()).zzYTt()).zzYLX()) {
                        while (zzz552 != null && !zzz552.zzYnY() && !zzz552.zzYTn()) {
                            zzz552 = (zzZ55) zzz552.zzYo1();
                        }
                        iMax = zzz552.getBottom();
                    }
                }
            } else {
                zzYIA zzyia = (zzYIA) zzwt.zz6x();
                iMax = z ? zzyia.zzYjR() : zzyia.zz56();
                zzYIC zzyic2 = (zzYIC) ((zzYIC) zzyia.zza9()).zzYTp();
                if (zzyia.zza7().zzZYM() && ((zzYIC) zzyia.zza9()).zzBz() && zzyic2 != null) {
                    zzYIA zzyia2 = (zzYIA) zzyic2.zz6x();
                    iMax += (z ? zzyia2.zzYjR() : zzyia2.zz56()) - ((zzYIA) zzwt.zzZZJ()).zzYjM();
                }
            }
        }
        if (!z && zzyic.zzYk1().getHeightRule() == 0) {
            iMax = Math.max(iMax, zzyic.zzYk1().getHeight());
        }
        return ((zzYIA) zzwt.zzZZJ()).zzYjN() + ((zzYIA) zzwt.zzZZJ()).zzYjM() + iMax;
    }

    public static int zzT(zzWT zzwt) throws Exception {
        return ((zzWV) zzwt.zza9()).zz6m() != 1 ? ((zzYIA) zzwt.zzZZJ()).getHeight() : zzU(zzwt);
    }

    public static int zzV(zzWT zzwt) throws Exception {
        zzwt.zzZZJ();
        zzwt.zzZZJ();
        if (((zzWV) zzwt.zza9()).zz6m() != 1) {
            return zzYIB.zzH((zzYIA) zzwt.zzZZJ());
        }
        return zzU(zzwt);
    }

    private static com.aspose.words.internal.zzZQ4 zzZ(zzWT zzwt, boolean z) throws Exception {
        int height;
        zzYIA zzyia;
        int i;
        int width;
        int iZzYjK;
        zzWT zzwtZzM;
        zzwt.zza9();
        int iZzZ = zzZ((zzWV) zzwt.zza9(), 1);
        int iZzZ2 = zzZ((zzWV) zzwt.zza9(), 2);
        int iZzZ3 = zzZ((zzWV) zzwt.zza9(), 3);
        zzYIA zzyia2 = (zzYIA) zzwt.zzZZJ();
        if (((zzWV) zzwt.zza9()).zz6m() != 0 && z) {
            if (zzwt.isShared()) {
                zzwtZzM = zzWK.zzM(zzwt);
                while (((zzYIA) zzwtZzM.zzZZJ()) != zzyia2) {
                    zzwtZzM = zzWK.zzM(zzwtZzM);
                }
            } else {
                zzwtZzM = zzwt;
            }
            zzyia = zzyia2;
            height = 0;
            while (zzwtZzM != null && zzwtZzM.zzZZJ().zzZZJ() == zzyia.zzZZJ()) {
                zzyia = (zzYIA) zzwtZzM.zzZZJ();
                height += zzyia.getHeight();
                zzwtZzM = zzWK.zzM(zzwtZzM);
            }
        } else {
            height = zzyia2.getHeight();
            zzyia = zzyia2;
        }
        if (((zzYIC) zzyia2.zza9()).zzYk4()) {
            int iZzYKt = ((zzYIC) zzyia2.zza9()).zzYKt();
            i = iZzYKt + iZzZ;
            width = (zzwt.getWidth() - (iZzYKt * 2)) - (iZzZ + iZzZ2);
            if (((zzWV) zzwt.zza9()).zz8t()) {
                int iMax = Math.max(0, (zzZ70.zzZ(1, zzwt).zzYN3() - iZzZ) / 2);
                i = i + iZzYKt + iMax;
                width = (width - iZzYKt) - iMax;
            }
            if (((zzWV) zzwt.zza9()).zz8s()) {
                width = (width - iZzYKt) - Math.max(0, (zzZ70.zzZ(2, zzwt).zzYN3() - iZzZ2) / 2);
            }
            if (zzwt.zz5J()) {
                iZzZ3 = 0;
            } else {
                int iZzYjN = zzyia2.zzYjN() - ((zzZ3B) ((zzWV) zzwt.zza9()).zzYTt()).getTopPadding();
                height -= iZzYjN;
                iZzZ3 = iZzYjN;
            }
            if (z || ((zzWV) zzwt.zza9()).zz6m() == 0 || zzwt.isSink() || ((zzYIA) zzwt.zzZZJ()).zzYjG()) {
                iZzYjK = zzyia.zzYjL() - zzyia.zzYjI();
                height -= iZzYjK;
            }
        } else {
            i = iZzZ / 2;
            height -= iZzZ3;
            width = zzwt.getWidth() - ((iZzZ + iZzZ2) / 2);
            if (zzyia.zzYjG()) {
                iZzYjK = zzyia.zzYjK();
                height -= iZzYjK;
            }
        }
        if (width < 0) {
            width = 0;
        }
        return com.aspose.words.internal.zzSA.zzY(new com.aspose.words.internal.zzZQ5(i, iZzZ3, width, height >= 0 ? height : 0));
    }
}
