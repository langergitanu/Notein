package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZKW {
    private zzZKV[] zzYtM = new zzZKV[6];

    private int zzAh(int i) {
        int i2 = i - 6;
        if (i2 < 0 || i2 > this.zzYtM.length) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: storyType");
        }
        return i2;
    }

    public static int zzY(zzYN8 zzyn8, boolean z) {
        int i = z ? 7 : 9;
        zzZ2D zzz2d = (zzZ2D) zzyn8.zza9();
        return (((zzZ35) zzz2d.zzYTt()).zzYLp() && zzyn8 == ((zzYN8) ((zzZ2D) zzyn8.zza9()).zzYJ9().zzZZJ())) ? z ? 10 : 11 : (!zzz2d.zza7().zzYMN() || zzyn8.zzYqk()) ? i : z ? 6 : 8;
    }

    public final zzZKV zzZ(zzZYW zzzyw, int i, boolean z) {
        int iZzAh = zzAh(i);
        zzZKV zzzkv = this.zzYtM[iZzAh];
        if (zzzkv != null || zzzyw == null || !z) {
            return zzzkv;
        }
        zzZKV zzzkv2 = new zzZKV(zzzyw, i);
        this.zzYtM[iZzAh] = zzzkv2;
        return zzzkv2;
    }

    public static zzZKV zzZ(zzYN8 zzyn8, boolean z) throws Exception {
        int iZzY = zzY(zzyn8, z);
        zzZKV zzzkvZzZ = zzZ((zzZ2D) zzyn8.zza9(), iZzY, true);
        if (zzzkvZzZ == null) {
            return null;
        }
        zzZKV zzzkv = new zzZKV(zzyn8.zzab(), iZzY);
        zzY9E.zzZ(zzzkvZzZ, zzzkv);
        zzzkv.zzU(zzyn8);
        return zzzkv;
    }

    public static zzZKV zzZ(zzZ2D zzz2d, int i, boolean z) throws Exception {
        zzZKV zzzkvZzZ = null;
        while (zzz2d != null && zzzkvZzZ == null) {
            if (zzz2d.zzZXV().zzY7m() != null) {
                zzzkvZzZ = zzz2d.zzZXV().zzY7m().zzZ((zzZYW) null, i, z);
            }
            zzz2d = (zzZ2D) zzz2d.zzYTo();
        }
        return zzzkvZzZ;
    }
}
