package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYOF {
    protected String zzZqL;

    public static zzYOF zzj(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        zzYTQ zzytqZzl = zzYTQ.zzl(zzzox);
        if (zzytqZzl == null) {
            return null;
        }
        int iZzYyi = zzytqZzl.zzYyi();
        if (iZzYyi == 1) {
            return new zzYOH(zzytqZzl, zzzox);
        }
        if (iZzYyi == 2) {
            return new zzYOG(zzytqZzl, zzzox);
        }
        throw new IllegalStateException("Unexpected OleObjectType value.");
    }

    public final String getClassName() {
        return this.zzZqL;
    }

    public abstract int zzYrF();

    public abstract void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception;
}
