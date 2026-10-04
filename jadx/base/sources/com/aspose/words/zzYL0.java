package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYL0 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("METAFILEPICT");

    public static zzYL0 zzc(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        if (!com.aspose.words.internal.zzZYQ.zzT(zzzox, 8)) {
            return new zzYKZ();
        }
        zzzox.zzXc();
        int iZzXc = zzzox.zzXc();
        if (iZzXc == 0) {
            return new zzYKZ();
        }
        if (iZzXc == 5) {
            return zzUR.zzTP(zzYO6.zzf(zzzox)) != 0 ? new zzYKZ() : new zzYKY(zzzox);
        }
        throw new IllegalStateException("Unexpected FormatID value, PresentationObject is corrupted.");
    }

    public abstract void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception;
}
