package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZST extends zzZT7 {
    private int[] zzQi;

    public zzZST() {
        super(61726, 0);
    }

    @Override // com.aspose.words.zzZT7
    public final void zzD(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        int iZzZim = zzZii().zzZim();
        this.zzQi = new int[iZzZim];
        for (int i = 0; i < iZzZim; i++) {
            this.zzQi[i] = zzzox.zzXc();
        }
    }

    @Override // com.aspose.words.zzZT7
    public final void zzZ(zzZSP zzzsp) throws Exception {
        zzZii().zzE7(this.zzQi.length);
        int i = 0;
        while (true) {
            int[] iArr = this.zzQi;
            if (i >= iArr.length) {
                return;
            }
            zzzsp.write(iArr[i]);
            i++;
        }
    }
}
