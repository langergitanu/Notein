package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzJI implements zzGO {
    private static int zzW(byte b, byte b2) {
        if (b == 1 || b2 == 1) {
            return 2;
        }
        if (b == 0 || b2 == 0) {
            return 1;
        }
        return b == b2 ? 0 : 2;
    }

    private static zzJW zzX(zzJJ zzjj) {
        if (zzjj.zzHD().getValues()[0] != 0) {
            return zzjj.zzHD();
        }
        int family = zzjj.getFamily();
        return (family == 0 || family == 1) ? zzjj.getPitch() == 1 ? new zzJW(new byte[]{2, 2, 6, 9, 4, 2, 5, 8, 3, 4}) : new zzJW(new byte[]{2, 2, 6, 3, 5, 4, 5, 2, 3, 4}) : (family == 2 || family == 3) ? zzjj.getPitch() == 1 ? new zzJW(new byte[]{2, 11, 6, 9, 7, 2, 5, 8, 2, 4}) : new zzJW(new byte[]{2, 11, 6, 4, 2, 2, 2, 2, 2, 4}) : family != 4 ? family != 5 ? zzjj.zzHD() : new zzJW(new byte[]{4, 4, 6, 5, 5, 16, 2, 2, 13, 2}) : new zzJW(new byte[]{3, 7, 4, 2, 5, 3, 2, 3, 2, 3});
    }

    private static int zzf(int i, int i2) {
        return zzXU.zz7((int) (((long) (~i2)) & 4294967295L & ((long) i) & 4294967295L));
    }

    @Override // com.aspose.words.internal.zzGO
    public final String zzZ(zzJJ zzjj, Iterable<zzJU> iterable) {
        zzJW zzjwZzX = zzX(zzjj);
        zzK7 zzk7ZzW = zzW(zzjj);
        int i = Integer.MAX_VALUE;
        zzJU zzju = null;
        for (zzJU zzju2 : iterable) {
            int iZzZ = zzZ(zzjwZzX, zzjj.zzHC(), zzk7ZzW, zzju2);
            if (iZzZ < i) {
                zzju = zzju2;
                if (iZzZ == 0) {
                    break;
                }
                i = iZzZ;
            }
        }
        if (zzju != null) {
            return zzju.getFontFamilyName();
        }
        return null;
    }

    private static zzK7 zzW(zzJJ zzjj) {
        return (zzjj.getCharset() < 0 || zzjj.getCharset() > 255) ? zzjj.zzHB() : zzjj.zzHB().zzR((byte) zzjj.getCharset());
    }

    private static int zzZ(zzJW zzjw, zzJG zzjg, zzK7 zzk7, zzJU zzju) {
        return (zzZ(zzjg, zzk7, zzju) * 100) + zzZ(zzjw, zzju.zzHD()) + zzZ(zzjw, zzk7, zzju);
    }

    private static int zzZ(zzJW zzjw, zzK7 zzk7, zzJU zzju) {
        boolean z = true;
        boolean z2 = zzjw.getValues()[0] == 5 || zzk7.zzI8();
        if (zzju.zzHD().getValues()[0] != 5 && !zzju.zzHB().zzI8()) {
            z = false;
        }
        return z2 ^ z ? 100000 : 0;
    }

    private static int zzZ(zzJG zzjg, zzK7 zzk7, zzJU zzju) {
        zzJG zzjgZzHC = zzju.zzHC();
        zzK7 zzk7ZzHB = zzju.zzHB();
        return zzf(zzjg.zzIa(), zzjgZzHC.zzIa()) + zzf(zzjg.zzI9(), zzjgZzHC.zzI9()) + zzf(zzjg.zzHl(), zzjgZzHC.zzHl()) + zzf(zzjg.zzHk(), zzjgZzHC.zzHk()) + zzf(zzk7.zzIa(), zzk7ZzHB.zzIa()) + zzf(zzk7.zzI9(), zzk7ZzHB.zzI9());
    }

    private static int zzZ(zzJW zzjw, zzJW zzjw2) {
        int iZzW = 0;
        byte b = zzjw.getValues()[0];
        byte b2 = zzjw2.getValues()[0];
        if (b == 1 || b2 == 1) {
            return 30;
        }
        if (b == 0 || b2 == 0) {
            return 20;
        }
        if (b != b2) {
            return 30;
        }
        for (int i = 1; i < 10; i++) {
            iZzW += zzW(zzjw.getValues()[i], zzjw2.getValues()[i]);
        }
        return iZzW;
    }
}
