package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz91 extends zz95 {
    private int[] zzq4;
    private int[] zzq5;
    private int[] zzq6;

    @Override // com.aspose.words.internal.zz95
    public final void zzY(zzO8 zzo8, int i) throws Exception {
        this.zzq6 = new int[i];
        this.zzq5 = new int[i];
        this.zzq4 = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.zzq6[i2] = zzo8.zzXc();
            this.zzq5[i2] = zzo8.zzXc();
            this.zzq4[i2] = zzo8.zzXc();
        }
    }

    @Override // com.aspose.words.internal.zz95
    public final zzG zzZ(long[] jArr, zzPV[] zzpvArr) {
        zzG zzg = new zzG();
        zzZ8 zzz8 = new zzZ8(this.zzq6.length);
        int i = 0;
        while (true) {
            int[] iArr = this.zzq6;
            if (i >= iArr.length) {
                break;
            }
            int i2 = iArr[i];
            int i3 = this.zzq5[i];
            int i4 = this.zzq4[i];
            zzZ7 zzz7 = new zzZ7(new zzZ6(jArr[i2], zzpvArr[i2]), new zzZ6(jArr[i3], zzpvArr[i3]), new zzZ6(jArr[i4], zzpvArr[i4]));
            if (!zzz7.zzZv().isEmpty()) {
                zzZQG.zzZ(zzz8.zzYO(), zzz7);
            }
            i++;
        }
        if (zzz8.zzYO().size() > 0) {
            zzg.zzX(zzz8);
        }
        return zzg;
    }
}
