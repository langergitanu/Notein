package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzCD extends zzCK {
    private String zzCx;
    private int zztF;
    private int zztG;

    public zzCD() {
    }

    private static zzCD zzX(zzCF zzcf, String str) {
        return zzY((zzGK) zzZKW.zzZ(zzcf, zzGK.class), zzcf.getPath(), str, null);
    }

    public static zzCD zzY(zzCF zzcf, String str) {
        return zzX(zzcf, str);
    }

    private zzCD(String str, String str2, int i, int i2, Exception exc) {
        super(str, exc);
        this.zzCx = str2;
        this.zztG = i;
        this.zztF = i2;
    }

    private static zzCD zzY(zzGK zzgk, String str, String str2, Exception exc) {
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
        return new zzCD(strZzZ, str, i, iZzFz, null);
    }
}
