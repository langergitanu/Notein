package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzZXK {
    private static zzZXK zzaM = new zzZXI(zzZO0.zzhS());
    private static zzZXK zzaL = new zzZXI(zzZO0.zzQz(1252));
    private static zzZXK zzaK = new zzZXJ();

    public static zzZXK zzZx(int i, int i2) {
        if (i == 0) {
            return zzaM;
        }
        if (i == 1 && (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 25)) {
            return zzaL;
        }
        if (i == 3 && (i2 == 1 || i2 == 10 || i2 == 0)) {
            return zzaM;
        }
        if (i == 3 && i2 == 3) {
            return zzaK;
        }
        return null;
    }

    public abstract String zzZn(byte[] bArr);
}
