package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYV {
    private int zzXL;
    private String zzXM;

    public zzYV(byte[] bArr, int i, int i2) {
        this.zzXM = zzZQB.zzS(bArr, 0, i2);
    }

    public static String zzZ(byte[] bArr, String str) {
        zzYV zzyv = new zzYV(bArr, 0, bArr.length);
        StringBuilder sb = new StringBuilder();
        while (true) {
            zzZNH.zzU(sb, zzyv.zzYx());
            if (zzyv.zzYC()) {
                zzZNH.zzU(sb, str);
                return sb.toString();
            }
            zzZNH.zzU(sb, str);
        }
    }

    public final boolean zzYC() {
        return this.zzXL >= this.zzXM.length();
    }

    public final String zzYx() {
        int iMin = Math.min(76, this.zzXM.length() - this.zzXL);
        String str = this.zzXM;
        int i = this.zzXL;
        String strSubstring = str.substring(i, i + iMin);
        this.zzXL += iMin;
        return strSubstring;
    }
}
