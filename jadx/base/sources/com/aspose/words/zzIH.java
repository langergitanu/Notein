package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzIH {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("row", "col");

    public static zzIH zzRG(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 0) {
            return new zzIF();
        }
        if (iZzTP == 1) {
            return new zzIG();
        }
        throw new IllegalStateException("Unexpected flow direction parameter.");
    }

    public abstract long zzY8(long j);

    public abstract long zzY9(long j);

    public abstract zzI3 zzYa(int i, int i2);

    public abstract com.aspose.words.internal.zzZQ4 zzZX(com.aspose.words.internal.zzZQ4 zzzq4);
}
