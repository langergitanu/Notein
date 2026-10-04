package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYZ3 extends zzZ5P {
    private int[] zzXZ3;
    private zzYZ8 zzXZ4;

    public zzYZ3(zzYZ8 zzyz8) {
        this.zzXZ4 = zzyz8;
        zzYZ2 zzyz2ZzYDC = zzyz8.zzYDC();
        if (!zzyz2ZzYDC.zzYDu()) {
            this.zzXZ3 = new int[0];
            return;
        }
        int[] iArrZzJm = zzZ5M.zzJm(zzyz2ZzYDC.getProductName());
        this.zzXZ3 = iArrZzJm;
        if (iArrZzJm.length == 0) {
            throw new IllegalStateException(com.aspose.words.internal.zzZKN.format(zzYCS.zz1(zzYCR.zzYbN()), zzyz2ZzYDC.getProductName()));
        }
    }

    @Override // com.aspose.words.zzZ5P
    public final boolean isMetered() {
        return true;
    }

    public final zzYZ8 zzYDv() {
        return this.zzXZ4;
    }

    @Override // com.aspose.words.zzZ5P
    public final boolean zzYRm() {
        return this.zzXZ3.length != 0;
    }

    @Override // com.aspose.words.zzZ5P
    public final boolean zzYRn() {
        return this.zzXZ3.length == 0;
    }

    @Override // com.aspose.words.zzZ5P
    public final boolean zzxT(int i) {
        for (int i2 : this.zzXZ3) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }
}
