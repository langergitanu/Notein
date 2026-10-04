package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzIW {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("fromB", "fromL", "fromR", "fromT");

    public static zzIW zzRH(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 0) {
            return new zzIV();
        }
        if (iZzTP == 1) {
            return new zzIU();
        }
        if (iZzTP == 2) {
            return new zzIT();
        }
        if (iZzTP == 3) {
            return new zzIS();
        }
        throw new IllegalStateException("Unexpected linear direction parameter.");
    }

    public abstract long zzC(float f, float f2);

    public abstract float zzYb(long j);

    public abstract float zzYc(long j);

    public abstract float zzZ(float f, long j, int i, int i2);

    public abstract long zzZ(float f, float f2, float f3, long j);

    public abstract void zzZ(zz9K zz9k, float f, zzB6 zzb6);

    public abstract void zzZ(zz9K zz9k, long j, zzB6 zzb6);
}
