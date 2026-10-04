package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYYB {
    private static zzYXX zzX(zzYYL zzyyl) throws Exception {
        try {
            return new zzYXX(zzyyl);
        } catch (Exception unused) {
            return null;
        }
    }

    public static int zzYV(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        zzYY9 zzyy9ZzZ;
        zzYYL zzyyl = new zzYYL(zzzop);
        zzYXX zzyxxZzX = zzX(zzyyl);
        if (zzyxxZzX == null || !zzyxxZzX.zzYCt() || (zzyy9ZzZ = zzZ(zzyyl, zzyxxZzX)) == null) {
            return 0;
        }
        if (zzyy9ZzZ.zzYCN() == 8) {
            return 2;
        }
        int iZzYCR = zzyy9ZzZ.zzYCR();
        if (!(zzyxxZzX.zztT(iZzYCR) && zzyxxZzX.zzV(zzyyl, iZzYCR)) && zzyxxZzX.zzT(zzyyl) == -1) {
            return zzyy9ZzZ.zzYCN() < 8 ? 1 : 0;
        }
        return 2;
    }

    private static zzYY9 zzZ(zzYYL zzyyl, zzYXX zzyxx) throws Exception {
        try {
            zzyxx.zzW(zzyyl, 0);
            return new zzYY9(zzyyl, 0);
        } catch (Exception unused) {
            return null;
        }
    }
}
