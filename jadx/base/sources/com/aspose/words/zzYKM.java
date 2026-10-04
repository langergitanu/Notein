package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYKM {
    int[] zzXDc;
    int[] zzXDd;
    int zze0;

    public zzYKM(int i, int i2) {
        this.zze0 = i;
        this.zzXDd = new int[i2];
        this.zzXDc = new int[i2];
    }

    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.zzJ((short) this.zze0);
        zzzow.zzJ((short) this.zzXDd.length);
        int i = 0;
        zzzow.zzJ((short) 0);
        while (true) {
            int[] iArr = this.zzXDd;
            if (i >= iArr.length) {
                return;
            }
            zzzow.zzl(iArr[i]);
            zzzow.zzl(this.zzXDc[i]);
            i++;
        }
    }

    public zzYKM(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zze0 = zzzox.zzX9() & 65535;
        int iZzX9 = zzzox.zzX9() & 65535;
        this.zzXDd = new int[iZzX9];
        this.zzXDc = new int[iZzX9];
        zzzox.zzX9();
        for (int i = 0; i < iZzX9; i++) {
            this.zzXDd[i] = zzzox.zzXc();
            this.zzXDc[i] = zzzox.zzXc();
        }
    }
}
