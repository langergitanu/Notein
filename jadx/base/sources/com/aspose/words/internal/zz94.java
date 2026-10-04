package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zz94 extends zz95 {
    private int[] zzq7;
    private int[] zzq8;

    @Override // com.aspose.words.internal.zz95
    public final void zzY(zzO8 zzo8, int i) throws Exception {
        this.zzq8 = new int[i];
        this.zzq7 = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.zzq8[i2] = zzo8.zzXc();
            this.zzq7[i2] = zzo8.zzXc();
        }
    }

    @Override // com.aspose.words.internal.zz95
    public final zzG zzZ(long[] jArr, zzPV[] zzpvArr) {
        zzG zzg = new zzG();
        int i = 0;
        while (true) {
            int[] iArr = this.zzq8;
            if (i >= iArr.length) {
                return zzg;
            }
            int i2 = iArr[i];
            long j = jArr[i2];
            zzPV zzpv = zzpvArr[i2];
            int i3 = this.zzq7[i];
            long j2 = jArr[i3];
            zzPV zzpv2 = zzpvArr[i3];
            zzZQ4 zzzq4Zzv = zzAN.zzv(zzZQ4.zzX(Float.intBitsToFloat((int) j), zzZPY.zzYC(j), Float.intBitsToFloat((int) j2), zzZPY.zzYC(j2)));
            zzZG zzzgZzW = zzZG.zzW(zzzq4Zzv);
            zzzgZzW.zzY(zzZ(j, j2, zzpv, zzpv2));
            zzzgZzW.zzW(zzp(zzzq4Zzv));
            zzg.zzX(zzzgZzW);
            i++;
        }
    }

    public abstract zzPA zzZ(long j, long j2, zzPV zzpv, zzPV zzpv2);

    public abstract zzP9 zzp(zzZQ4 zzzq4);
}
