package com.aspose.words;

import com.aspose.words.ref.Ref;

/* JADX INFO: loaded from: classes6.dex */
final class zzYIB {
    private static boolean zzC(zzYIA zzyia) {
        if (((zzYIC) zzyia.zza9()).zzYk1().zzYLA()) {
            return true;
        }
        if (!zzyia.zza7().zzZYM()) {
            return false;
        }
        if (!((zzY6N) ((zzYIC) zzyia.zza9()).zza9()).zzhk() || zzyia.zzYjC()) {
            return true;
        }
        zzYIC zzyic = (zzYIC) ((zzYIC) zzyia.zza9()).zzYTo();
        if (zzyic == null || !zzyic.zzBz()) {
            return false;
        }
        return zzyic.zzYk3().zzYjC();
    }

    private static boolean zzD(zzYIA zzyia) {
        if (((zzYIC) zzyia.zza9()).zzYTm()) {
            return false;
        }
        for (zzWV zzwv = (zzWV) ((zzYIC) ((zzYIC) zzyia.zza9()).zzYTo()).zzZXZ(); zzwv != null; zzwv = (zzWV) zzwv.zzYTp()) {
            if (!((zzZ3B) zzwv.zzYTt()).zzYMV().zzwz(0).isAmbient()) {
                return true;
            }
        }
        return false;
    }

    private static int zzE(zzYIA zzyia) throws Exception {
        int contentHeight = zzyia.getContentHeight();
        zzZ36 zzz36ZzYk1 = ((zzYIC) zzyia.zza9()).zzYk1();
        int heightRule = zzz36ZzYk1.getHeightRule();
        if (heightRule == 0) {
            return Math.max(zzz36ZzYk1.getHeight(), contentHeight);
        }
        if (heightRule == 1) {
            return zzz36ZzYk1.getHeight() - zzyia.zzYjN();
        }
        zzz36ZzYk1.getHeightRule();
        return contentHeight;
    }

    public static int zzF(zzYIA zzyia) throws Exception {
        return Math.max(zzyia.getContentHeight(), zzX(zzyia, true));
    }

    public static int zzG(zzYIA zzyia) throws Exception {
        zzyia.zza9();
        int iZzE = zzE(zzyia);
        return ((zzYIC) zzyia.zza9()).zzYk1().getHeightRule() != 1 ? Math.max(iZzE, zzX(zzyia, true)) : iZzE;
    }

    public static int zzH(zzYIA zzyia) throws Exception {
        return zzG(zzyia) + zzyia.zzYjN() + zzyia.zzYjI();
    }

    public static int zzI(zzYIA zzyia) throws Exception {
        return zzG(zzyia) + zzyia.zzYjN() + zzyia.zzYjM();
    }

    public static int zzJ(zzYIA zzyia) throws Exception {
        int iMax = 0;
        for (zzWT zzwt = (zzWT) zzyia.zz6x(); zzwt != null && !zzwt.zzYnY(); zzwt = (zzWT) zzwt.zz5Z()) {
            if (!((zzWV) zzwt.zza9()).zz6c() && ((zzWV) zzwt.zza9()).zz6m() == 0 && (zzwt.zzYo0() == null || zzwt.zzYo0().zzZZJ() != zzwt.zzZZJ())) {
                iMax = Math.max(iMax, zzwt.getContentHeight());
            }
        }
        return iMax;
    }

    public static zzYCO zzK(zzYIA zzyia) throws Exception {
        int x;
        int width;
        if (((zzYIC) zzyia.zza9()).zz6a()) {
            x = ((zzWT) zzyia.zz6w()).zz5Y().getX();
            width = ((zzWT) zzyia.zz6x()).getRight();
        } else {
            x = ((zzWT) zzyia.zz6x()).getX();
            width = zzyia.getWidth();
        }
        return zzYCO.zzVO(x, width - x);
    }

    public static com.aspose.words.internal.zzZQ4 zzL(zzYIA zzyia) throws Exception {
        float fZzwy;
        ((zzYIC) zzyia.zza9()).zzYk5();
        zzYCO zzycoZzK = zzK(zzyia);
        float length = zzycoZzK.getLength();
        float fZzYbM = zzycoZzK.zzYbM();
        zzZ3C zzz3cZzYMV = ((zzYIC) zzyia.zza9()).zzYk1().zzYMV();
        float fZzwy2 = zzz3cZzYMV.zzwy(1) / 2.0f;
        float f = fZzYbM + fZzwy2;
        float fZzwy3 = length - ((zzz3cZzYMV.zzwy(2) / 2.0f) + fZzwy2);
        float height = zzyia.getHeight() / 1000.0f;
        if (!zzyia.zzYjH() || zzyia.zzYjB()) {
            fZzwy = 0.0f;
        } else {
            fZzwy = zzz3cZzYMV.zzwy(3);
            height -= fZzwy;
        }
        if (zzyia.zzYjG()) {
            height -= zzz3cZzYMV.zzwy(0);
        }
        return new com.aspose.words.internal.zzZQ4(f, fZzwy, fZzwy3, height);
    }

    private static boolean zzM(zzYIA zzyia) {
        return zzyia.zzZZJ().zz60() == 2048;
    }

    private static boolean zzN(zzYIA zzyia) {
        return zzyia.zzqh(2048) != null;
    }

    private static boolean zzO(zzYIA zzyia) {
        int iZz60 = zzyia.zzZZJ().zz60();
        return iZz60 == 2 || iZz60 == 1024 || iZz60 == 16384;
    }

    public static int zzP(zzYIA zzyia) throws Exception {
        int leftPadding;
        int leftPadding2;
        zzyia.zzYjE();
        zzY6N zzy6n = (zzY6N) ((zzYIC) zzyia.zza9()).zza9();
        int i = 0;
        int iZzP = zzy6n.zza7().getAlignTablesRowByRow() ? zzP(zzy6n) - zzU((zzYIC) zzyia.zza9()) : 0;
        int alignment = ((zzYIC) zzyia.zza9()).zzYk1().getAlignment();
        if (alignment == 0) {
            return zzy6n.zzXYf();
        }
        if (alignment == 1) {
            return (iZzP / 2) + zzy6n.zzXYe();
        }
        if (alignment != 2) {
            return zzy6n.zzXYf();
        }
        if (zzO(zzyia) && (zzyia.zzZXN() == null || zzyia.zzZXN().zzZ99() == 21537)) {
            if (((zzYIC) zzyia.zza9()).zzYk4()) {
                leftPadding = zzWU.zzV((zzWV) ((zzYIC) zzy6n.zzZXZ()).zzZXZ());
                leftPadding2 = zzWU.zzV((zzWV) ((zzYIC) zzyia.zza9()).zzZXZ());
            } else {
                leftPadding = ((zzZ3B) ((zzWV) ((zzYIC) zzy6n.zzZXZ()).zzZXZ()).zzYTt()).getLeftPadding();
                leftPadding2 = ((zzZ3B) ((zzWV) ((zzWT) zzyia.zz6x()).zza9()).zzYTt()).getLeftPadding();
            }
            i = leftPadding2 - leftPadding;
        }
        return zzy6n.zzXYd() + i + iZzP;
    }

    private static boolean zzQ(zzYIA zzyia) throws Exception {
        zzyia.zza9();
        zzyia.zzZZJ();
        zzyia.getWidth();
        return true;
    }

    public static boolean zzR(zzYIA zzyia) {
        return zzyia.zzZXN() == null && ((zzYIC) zzyia.zza9()).zz6a();
    }

    private static boolean zzS(zzYIA zzyia) {
        zzUZ zzuz;
        zzYBL zzybl = (zzYBL) zzyia.zzZZJ();
        int iZz60 = zzybl.zz60();
        if (iZz60 == 2) {
            return ((zzZ35) ((zzZ2D) ((zzUZ) zzybl).zza9()).zzYTt()).zzZz();
        }
        if (iZz60 != 16384 || (zzuz = (zzUZ) ((zzYVN) zzybl.zza9()).zzYzk().zzqh(2)) == null) {
            return false;
        }
        zzZ2D zzz2d = (zzZ2D) zzuz.zza9();
        if (zzybl.zzZZJ().zz60() == 256) {
            zzUZ zzuz2 = (zzUZ) zzybl.zzZ8m().zz6x();
            if (zzuz2 != null) {
                zzuz = zzuz2;
            }
            zzz2d = (zzZ2D) zzuz.zza9();
        } else {
            zzybl.zzZZJ();
            if (((zzZ35) zzz2d.zzYTt()).zzYLh() == 3) {
                zzz2d = (zzZ2D) ((zzZ2C) zzz2d.zza9()).zzZXY();
            }
        }
        return ((zzZ35) zzz2d.zzYTt()).zzZz();
    }

    private static boolean zzT(zzYIA zzyia) {
        return zzyia.zza7().zzZYM() && ((((zzYIC) zzyia.zza9()).zz6a() && ((zzYIC) zzyia.zza9()).zzYk6() == 0) || zzS(zzyia));
    }

    public static int zzU(zzYIA zzyia) throws Exception {
        zzQ(zzyia);
        zzY6N zzy6n = (zzY6N) ((zzYIC) zzyia.zza9()).zza9();
        if (zzyia.zzYjE()) {
            int iZzZ = zzZ(zzyia, zzyia.zzZZJ().zz5X(), zzyia.zzZZJ().zzZXT());
            return zzR(zzyia) ? zzY(zzyia, iZzZ) : iZzZ;
        }
        if (zzyia.zza7().zzZYM() && zzyia.zzZXN() == null && !zzN(zzyia)) {
            zzYIA zzyiaZzYk3 = ((zzYIC) ((zzY6N) ((zzYIC) zzyia.zza9()).zza9()).zzZXZ()).zzYk3();
            return ((zzYIC) zzyia.zza9()).zz6a() ? zzyiaZzYk3.getRight() - zzyia.getWidth() : zzyiaZzYk3.getX();
        }
        int iZzP = zzP(zzyia);
        int iZzXYc = zzyia.zzYjH() ? zzy6n.zzXYc() : zzy6n.zzXYb();
        return !zzR(zzyia) ? iZzXYc + iZzP : zzY(zzyia, (zzyia.zzZZJ().zz5X() - iZzXYc) + iZzP);
    }

    public static int zzV(zzYIC zzyic) throws Exception {
        return zzV(((zzY6N) zzyic.zza9()).zzXYt(), 0, zzT(zzyic));
    }

    public static int zzW(zzYIC zzyic) throws Exception {
        return ((zzWV) zzyic.zzZXY()).getRight();
    }

    public static int zzX(zzYIA zzyia, int i) throws Exception {
        zzyia.zzYjG();
        int iZzYjL = i - zzyia.zzYjL();
        if (zzyia.zzZXN() != null) {
            iZzYjL = 1073741823;
        }
        zzZ36 zzz36ZzYk1 = ((zzYIC) zzyia.zza9()).zzYk1();
        if (zzz36ZzYk1.getHeightRule() == 1) {
            int height = zzz36ZzYk1.getHeight();
            return (zzyia.zza7().zzZYM() || height <= iZzYjL) ? height : zzD(zzyia) ? iZzYjL + zzyia.zzYjK() : iZzYjL;
        }
        int iZzYjN = zzyia.zzYjN() + zzF(zzyia);
        if (zzz36ZzYk1.getHeightRule() != 0) {
            return iZzYjN;
        }
        int iZzYjN2 = zzyia.zzYjN() + zzz36ZzYk1.getHeight();
        if (!zzyia.zza7().zzZYM() || !zzyia.zzYjO()) {
            iZzYjN2 = Math.min(iZzYjL, iZzYjN2);
        }
        return Math.max(iZzYjN, iZzYjN2);
    }

    public static int zzY(zzYIA zzyia, int i) throws Exception {
        return zzZ(zzyia, i, zzyia.zzZZJ().zz5X(), zzyia.zzZZJ().zzZXT());
    }

    public static int zzZ(zzYIA zzyia, int i, int i2, int i3) throws Exception {
        int width = (i3 - (i - i2)) - zzyia.getWidth();
        return zzT(zzyia) ? Math.max(width, 0) : width;
    }

    private static int zzY(zzYIA zzyia, int i, int i2, int i3, int i4) {
        int iZzYM7;
        boolean zZzZYM = zzyia.zza7().zzZYM();
        if (!zZzZYM) {
            ((zzY6N) ((zzYIC) zzyia.zza9()).zza9()).zzhk();
        }
        zzY6N zzy6n = (zzY6N) ((zzYIC) zzyia.zza9()).zza9();
        zzYIC zzyic = (zzYIC) zzy6n.zzZXZ();
        zzYIC zzyic2 = (zzYIC) zzy6n.zzZXY();
        boolean zZzZz = zzy6n.zzY6a().zzZz();
        int iZzZ = zzWU.zzZ((zzWV) zzyic.zzZXZ(), 1) / 2;
        int iZzZ2 = zzWU.zzZ((zzWV) zzyic.zzZXZ(), 2) / 2;
        int iZzZ3 = zzWU.zzZ((zzWV) ((zzWV) zzyic.zzZXY()).zzYTo(), 1) / 2;
        int iZzZ4 = zzWU.zzZ((zzWV) ((zzWV) zzyic.zzZXY()).zzYTo(), 2) / 2;
        int iZzZ5 = zzWU.zzZ((zzWV) zzyic2.zzZXZ(), 2) / 2;
        int i5 = 0;
        if (i == 1) {
            if (!zzM(zzyia) && zZzZYM) {
                i5 = zZzZz ? (iZzZ3 + iZzZ5) / 2 : (iZzZ - iZzZ4) / 2;
            }
            iZzYM7 = (((i3 - i2) - i4) / 2) + i2 + i5;
        } else if (i != 2) {
            if (!zZzZz) {
                iZzZ2 = iZzZ;
            } else if (zzO(zzyia)) {
                iZzZ2 += iZzZ4;
            }
            iZzYM7 = zzyic.zzYk1().zzYM7() + i2 + iZzZ2;
        } else {
            if (zZzZz || zzM(zzyia) || !zZzZYM) {
                iZzZ4 = 0;
            }
            iZzYM7 = (i3 - i4) - iZzZ4;
        }
        return (zZzZz || !zzT(zzyia)) ? iZzYM7 : Math.max(iZzYM7, iZzZ);
    }

    public static int zzV(int[] iArr, int i, int i2) {
        int length = iArr.length - i2;
        int i3 = 0;
        while (i < length) {
            i3 += iArr[i];
            i++;
        }
        return i3;
    }

    private static int zzZ(zzYIA zzyia, int i, boolean z, int i2, int i3) throws Exception {
        int iZzP;
        zzQ(zzyia);
        if (zzYJP.zzk(zzyia) < 0) {
            if (zzyia.zzZZJ().zz60() == 16) {
                return zzWU.zzZ((zzWV) ((zzYIC) ((zzY6N) ((zzYIC) zzyia.zza9()).zza9()).zzZXZ()).zzZXZ(), 1) / 2;
            }
            return 0;
        }
        if (zzyia.zza7().getAlignTablesRowByRow() && z) {
            iZzP = zzU((zzYIC) zzyia.zza9());
        } else {
            iZzP = zzP((zzY6N) ((zzYIC) zzyia.zza9()).zza9());
        }
        if (!zzyia.zza7().zzZYM() && !((zzY6N) ((zzYIC) zzyia.zza9()).zza9()).zzhk()) {
            return zzZ(zzyia, i, i2, i3, iZzP);
        }
        return zzY(zzyia, i, i2, i3, iZzP);
    }

    public static int zzT(zzYIC zzyic) {
        if (zzyic.zzYTm()) {
            return 0;
        }
        int iZzYjW = zzyic.zzYjW();
        for (zzYIC zzyic2 = (zzYIC) zzyic.zzYTp(); zzyic2 != null && iZzYjW != 0; zzyic2 = (zzYIC) zzyic2.zzYTp()) {
            iZzYjW = Math.min(iZzYjW, zzyic2.zzYjW());
        }
        return iZzYjW;
    }

    public static int zzX(zzYIA zzyia, boolean z) throws Exception {
        int iZzY;
        int iMax = 0;
        for (zzWT zzwt = (zzWT) zzyia.zz6x(); zzwt != null && !zzwt.isVirtual(); zzwt = (zzWT) zzwt.zz5Z()) {
            if (((zzWV) zzwt.zza9()).zz6m() == 3 && !((zzWV) zzwt.zza9()).zz6c()) {
                Ref ref = new Ref(null);
                Ref ref2 = new Ref(null);
                zzWK.zzZ(zzwt, (Ref<zzWT>) ref, (Ref<zzWT>) ref2);
                zzWT zzwt2 = (zzWT) ref.get();
                zzWT zzwt3 = (zzWT) ref2.get();
                zzwt3.zzZZJ();
                zzwt3.zzZZJ();
                zzwt2.zzZZJ();
                if (z) {
                    iZzY = ((zzYIA) zzwt2.zzZZJ()).zzYjN() + zzwt2.getContentHeight();
                } else {
                    iZzY = zzWU.zzY(zzwt2);
                }
                iMax = Math.max(iMax, ((zzwt2.getY() + iZzY) - (zzyia.getY() - ((zzYIA) zzwt2.zzZZJ()).getY())) - zzyia.zzYjN());
            }
        }
        return iMax;
    }

    private static int zzZ(zzYIA zzyia, int i, int i2, int i3, int i4) {
        int iMax;
        zzyia.zza7();
        zzYIC zzyic = (zzYIC) zzyia.zza9();
        boolean zZzYk4 = ((zzYIC) zzyia.zza9()).zzYk4();
        int iZzYKt = ((zzYIC) zzyia.zza9()).zzYKt() + ((zzZ3B) ((zzWV) ((zzWT) zzyia.zz6x()).zza9()).zzYTt()).getLeftPadding() + zzZ70.zzZ(1, (zzWT) zzyia.zz6x()).zzYN3();
        if (i == 1) {
            return (((i3 - i2) - i4) / 2) + i2;
        }
        if (i != 2) {
            zzYIC zzyic2 = (zzYIC) ((zzY6N) zzyic.zza9()).zzZXZ();
            int iZzYM7 = zzyic2.zzYk1().zzYM7() + i2;
            if (zzyia.zzZZJ().zz60() == 16) {
                return iZzYM7;
            }
            if (zzyic.zz6a()) {
                int iZzZ = zzWU.zzZ((zzWV) zzyic.zzZXZ(), 2) / 2;
                int leftPadding = ((zzZ3B) ((zzWV) zzyic.zzZXZ()).zzYTt()).getLeftPadding();
                if (zZzYk4) {
                    iMax = Math.max(iZzYKt, iZzZ);
                } else {
                    iMax = Math.max(leftPadding, iZzZ);
                }
                return iZzYM7 - iMax;
            }
            return iZzYM7 - zzWU.zzV((zzWV) zzyic2.zzZXZ());
        }
        int i5 = i3 - i4;
        if (!zzO(zzyia)) {
            return i5;
        }
        if (zZzYk4) {
            if (!((zzYIC) zzyia.zza9()).zz6a()) {
                iZzYKt = zzWU.zzV((zzWV) zzyic.zzZXZ());
            }
        } else {
            iZzYKt = ((zzZ3B) ((zzWV) zzyic.zzZXZ()).zzYTt()).getLeftPadding();
        }
        return i5 + iZzYKt;
    }

    public static int zzU(zzYIC zzyic) throws Exception {
        return zzV(((zzY6N) zzyic.zza9()).zzXYt(), zzyic.zzYka(), zzyic.zzYk8());
    }

    public static int zzP(zzY6N zzy6n) throws Exception {
        return zzV(zzy6n.zzXYt(), 0, 0);
    }

    public static int zzY(zzYIA zzyia, boolean z) throws Exception {
        return zzZ(zzyia, z, false);
    }

    public static int zzZ(zzYIA zzyia, boolean z, boolean z2) throws Exception {
        int iZzZ = zzZ(zzyia, z, true, z2);
        return !zzC(zzyia) ? Math.max(zzyia.zz0t(), iZzZ) : iZzZ;
    }

    public static int zzZ(zzYIA zzyia, boolean z, boolean z2, boolean z3) throws Exception {
        if (zzyia.zza6().zzhk() && !zzyia.zza7().zzZYM() && z2) {
            z = true;
        }
        int iMax = 0;
        for (zzWT zzwt = (zzWT) zzyia.zz6x(); zzwt != null && !zzwt.zzYnY(); zzwt = (zzWT) zzwt.zz5Z()) {
            iMax = Math.max(iMax, zzWU.zzZ(zzwt, z, z3));
        }
        return iMax;
    }

    public static int zzZ(zzYIA zzyia, int i, int i2) throws Exception {
        return zzZ(zzyia, ((zzYIC) zzyia.zza9()).zzYk1().getAlignment(), true, i, i2);
    }

    public static int zzZ(zzY6N zzy6n, int i, int i2, int i3) throws Exception {
        return zzZ(((zzYIC) zzy6n.zzZXZ()).zzYk3(), i, false, i2, i3);
    }
}
