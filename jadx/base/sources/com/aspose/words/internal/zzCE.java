package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzCE extends zzCK {
    private String zzCx;
    private int zztF;
    private int zztG;

    public zzCE() {
    }

    public static zzCE zzZ(zzCF zzcf, String str) {
        return zzZ(zzcf, str, null);
    }

    private zzCE(String str, String str2, int i, int i2, Exception exc) {
        super(str, exc);
        this.zzCx = str2;
        this.zztG = i;
        this.zztF = i2;
    }

    public static zzCE zzZ(zzCF zzcf, String str, Exception exc) {
        return zzZ((zzGK) zzZKW.zzZ(zzcf, zzGK.class), zzcf.getPath(), str, exc);
    }

    private static zzCE zzZ(zzGK zzgk, String str, String str2, Exception exc) {
        int i;
        int iZzFz;
        String strZzZ = zzCI.zzZ(zzgk, str, str2);
        if (zzgk != null) {
            int lineNumber = zzgk.getLineNumber();
            iZzFz = zzgk.zzFz();
            i = lineNumber;
        } else {
            i = 0;
            iZzFz = 0;
        }
        return new zzCE(strZzZ, str, i, iZzFz, exc);
    }
}
