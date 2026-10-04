package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYXW {
    private com.aspose.words.internal.zzDB zzXXF = new com.aspose.words.internal.zzDB();
    private int zzXXG;
    private com.aspose.words.internal.zzXZ zzXYi;

    public zzYXW(com.aspose.words.internal.zzXZ zzxz) {
        this.zzXYi = zzxz;
    }

    private void zzHK(String str) throws Exception {
        byte[] bArr = new byte[32];
        if (str != null) {
            int iMin = Math.min(str.length(), 31);
            for (int i = 0; i < iMin; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt < ' ' || cCharAt > '~') {
                    cCharAt = '?';
                }
                bArr[i] = (byte) cCharAt;
            }
        }
        this.zzXYi.writeBytes(bArr);
    }

    private void zza(com.aspose.words.internal.zzZQ9 zzzq9) throws Exception {
        this.zzXYi.zzl((int) com.aspose.words.internal.zzZQ9.zzU(zzzq9, new com.aspose.words.internal.zzZQ9(1970, 1, 1)).zzhy());
    }

    public final int zzYCr() {
        return this.zzXXG;
    }

    public final void zzYCs() throws Exception {
        long position = this.zzXYi.zzq().getPosition();
        this.zzXYi.zzq().zzH(this.zzXXF.get(this.zzXXG));
        this.zzXXG++;
        this.zzXYi.zzk((int) position);
        this.zzXYi.zzq().zzH(position);
    }

    public final void zzZ(String str, com.aspose.words.internal.zzZQ9 zzzq9, int i) throws Exception {
        com.aspose.words.internal.zzZQ9.zzZ(zzzq9, com.aspose.words.internal.zzZQ9.zz35);
        zzHK(str);
        this.zzXYi.zzi(0);
        this.zzXYi.zzi(0);
        zza(zzzq9);
        zza(zzzq9);
        zza(zzzq9);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(0);
        this.zzXYi.zzQ(4778124914501567049L);
        this.zzXYi.zzk(0);
        this.zzXYi.zzk(0);
        this.zzXYi.zzi(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.zzXXF.add((int) this.zzXYi.zzq().getPosition());
            this.zzXYi.zzk(0);
            this.zzXYi.zzk(0);
        }
        this.zzXYi.zzi(0);
    }
}
