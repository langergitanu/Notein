package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZVS extends zzZVP {
    private ArrayList<com.aspose.words.internal.zzQG> zzXb;
    private com.aspose.words.internal.zzOU zzYMB;
    private float zzYMC;

    public abstract com.aspose.words.internal.zzQD zzZ(com.aspose.words.internal.zzQ9 zzq9, com.aspose.words.internal.zzQ9 zzq92, com.aspose.words.internal.zzQ9 zzq93, com.aspose.words.internal.zzQ9 zzq94);

    public abstract com.aspose.words.internal.zzQG zzZ(int i, com.aspose.words.internal.zzQG zzqg, com.aspose.words.internal.zzQG zzqg2);

    @Override // com.aspose.words.zzZBP
    public final com.aspose.words.internal.zzQG[] zzZ(com.aspose.words.internal.zzQG[] zzqgArr, float f, com.aspose.words.internal.zzOU zzou, com.aspose.words.internal.zzPY zzpy, int i) {
        this.zzYMC = f;
        this.zzYMB = zzou;
        this.zzXb = new ArrayList<>(i);
        for (com.aspose.words.internal.zzQG zzqg : zzqgArr) {
            com.aspose.words.internal.zzPY zzpyZzZ1 = zzpy != null ? zzpy : zzqg.zzZ1();
            for (int i2 = 0; i2 < zzqg.getCount(); i2++) {
                zzZ(zzqg.zzYi(i2), zzpyZzZ1, zzqg.getOrder());
            }
        }
        return (com.aspose.words.internal.zzQG[]) this.zzXb.toArray(new com.aspose.words.internal.zzQG[0]);
    }

    private void zzZ(com.aspose.words.internal.zzQD zzqd, com.aspose.words.internal.zzPY zzpy, int i) {
        if (zzqd.getCount() == 1) {
            return;
        }
        com.aspose.words.internal.zzQG zzqgZzZ = null;
        int i2 = 0;
        int i3 = 1;
        for (int i4 = 0; i4 < zzqd.getCount(); i4++) {
            i2++;
            i3++;
            if (i2 == zzqd.getCount()) {
                i2 = 0;
            }
            if (i3 == zzqd.getCount()) {
                i3 = 0;
            }
            zzqgZzZ = zzZ(zzqgZzZ, new com.aspose.words.internal.zzQ9[]{(com.aspose.words.internal.zzQ9) zzqd.zzYi(i4).zzQc(), (com.aspose.words.internal.zzQ9) zzqd.zzYi(i2).zzQc(), (com.aspose.words.internal.zzQ9) zzqd.zzYi(i3).zzQc()}, zzpy, i);
        }
    }

    private com.aspose.words.internal.zzQG zzZ(com.aspose.words.internal.zzQG zzqg, com.aspose.words.internal.zzQ9[] zzq9Arr, com.aspose.words.internal.zzPY zzpy, int i) {
        if (zzqg == null) {
            zzqg = zzZ(i, zzq9Arr[0], zzq9Arr[1], zzpy);
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzXb, zzqg);
        com.aspose.words.internal.zzQG zzqgZzZ = zzZ(i, zzq9Arr[1], zzq9Arr[2], zzpy);
        com.aspose.words.internal.zzQG zzqgZzZ2 = zzZ(i, zzqg, zzqgZzZ);
        if (zzqgZzZ2 != null) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzXb, zzqgZzZ2);
        }
        return zzqgZzZ;
    }

    private com.aspose.words.internal.zzQG zzZ(int i, com.aspose.words.internal.zzQ9 zzq9, com.aspose.words.internal.zzQ9 zzq92, com.aspose.words.internal.zzPY zzpy) {
        com.aspose.words.internal.zzQ9 zzq93 = (com.aspose.words.internal.zzQ9) zzq9.zzQc();
        com.aspose.words.internal.zzQ9 zzq94 = (com.aspose.words.internal.zzQ9) zzq92.zzQc();
        zzq93.zz9(-this.zzYMC);
        zzq94.zz9(-this.zzYMC);
        com.aspose.words.internal.zzQ6 zzq6ZzX = new com.aspose.words.internal.zzQ6(zzq9, zzq93).zzX(new com.aspose.words.internal.zzQ6(zzq9, zzq92));
        zzq6ZzX.normalize();
        com.aspose.words.internal.zzQG zzqg = new com.aspose.words.internal.zzQG(zzq6ZzX, 8, i, this.zzYMB, zzpy);
        zzqg.zzZ(zzZ(zzq9, zzq92, zzq93, zzq94));
        return zzqg;
    }
}
