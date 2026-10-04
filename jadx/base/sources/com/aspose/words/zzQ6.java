package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzQ6 extends zzMC {
    private zzQ9[] zzZqC;
    private int[] zzZqD;
    private com.aspose.words.internal.zzD7 zzZqE;
    private com.aspose.words.internal.zzD7 zzZqF;

    public zzQ6(zzQ7 zzq7, int i) {
        super(zzq7, i);
        this.zzZqF = new com.aspose.words.internal.zzD7();
        this.zzZqE = new com.aspose.words.internal.zzD7();
        zzQ9[] zzq9ArrZzZWs = zzq7.zzZWs();
        this.zzZqC = zzq9ArrZzZWs;
        int[] iArr = new int[zzq9ArrZzZWs.length];
        this.zzZqD = iArr;
        int length = iArr.length - 1;
        iArr[iArr.length - 1] = length;
        for (int length2 = iArr.length - 1; length2 > 0; length2--) {
            if (this.zzZqC[length2] instanceof zzPN) {
                int i2 = length2 - 1;
                this.zzZqD[i2] = length;
                length = i2;
            } else {
                this.zzZqD[length2 - 1] = -1;
            }
        }
        this.zzZqF.zzVF(length);
        this.zzZqE.zzVF(0);
    }

    @Override // com.aspose.words.zzMC
    public final boolean zzZ(zzZBM zzzbm) {
        int iZzCR = this.zzZqF.zzCR();
        int iZzCR2 = this.zzZqE.zzCR();
        boolean z = !zzzbm.isImplicit() && zzZ(zzzbm, iZzCR, this.zzZqF.getCount(), iZzCR2);
        int i = z ? this.zzZqD[iZzCR] : iZzCR;
        this.zzZqF.zzVF(i);
        if (i != iZzCR) {
            iZzCR2 = this.zzZqF.getCount();
        }
        this.zzZqE.zzVF(iZzCR2);
        return z && iZzCR == this.zzZqC.length - 1;
    }

    @Override // com.aspose.words.zzMC
    public final void zzZP() {
        this.zzZqF.zzCQ();
        this.zzZqE.zzCQ();
    }

    private boolean zzZ(zzZBM zzzbm, int i, int i2, int i3) {
        while (zzzbm != null && this.zzZqC[i].zzZWu().zzZ(zzzbm, zzZVk())) {
            zzQ9 zzq9 = this.zzZqC[i];
            if (zzq9 instanceof zzPN) {
                return true;
            }
            if (zzq9 instanceof zzP0) {
                for (zzZBM zzzbmZzZ2O = zzzbm.zzZ2O(); zzzbmZzZ2O != null; zzzbmZzZ2O = zzzbmZzZ2O.zzZ2O()) {
                    if (zzZ(zzzbmZzZ2O, i - 1, i2, i3)) {
                        return true;
                    }
                }
                return false;
            }
            if (zzq9 instanceof zzS6) {
                zzzbm = zzzbm.zzZ2O();
                i--;
            } else {
                if (zzq9 instanceof zzQI) {
                    return i2 > i3 && zzZ(zzzbm.zzZ2Q(), i - 1, i2 - 1, i3);
                }
                throw new IllegalStateException("Unknown combinator type.");
            }
        }
        return false;
    }
}
