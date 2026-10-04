package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZVU {
    private static com.aspose.words.internal.zzQG[] zzY(com.aspose.words.internal.zzQG[] zzqgArr, com.aspose.words.internal.zzQ6 zzq6, com.aspose.words.internal.zzQ6 zzq62) {
        com.aspose.words.internal.zzQ6[] zzq6Arr = {zzq6, zzq62};
        int[] iArr = {5, 6};
        ArrayList arrayList = new ArrayList();
        for (com.aspose.words.internal.zzQG zzqg : zzqgArr) {
            if (zzqg.getType() == 8) {
                for (int i = 0; i < 2; i++) {
                    com.aspose.words.internal.zzQG zzqgZzZ = zzZ(zzq6Arr[i], zzqg, iArr[i], zzqg.getOrder());
                    if (zzqgZzZ != null) {
                        com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzQG>) arrayList, zzqgZzZ);
                    }
                }
            }
        }
        return (com.aspose.words.internal.zzQG[]) arrayList.toArray(new com.aspose.words.internal.zzQG[0]);
    }

    public static com.aspose.words.internal.zzQG[] zzZ(com.aspose.words.internal.zzQG[] zzqgArr, com.aspose.words.internal.zzQ6 zzq6, com.aspose.words.internal.zzQ6 zzq62) {
        return zzY(zzqgArr, zzq6, zzq62);
    }

    private static com.aspose.words.internal.zzQG zzZ(com.aspose.words.internal.zzQ6 zzq6, com.aspose.words.internal.zzQG zzqg, int i, int i2) {
        com.aspose.words.internal.zzQ9 zzq9;
        com.aspose.words.internal.zzQ9 zzq92;
        if (zzq6 == null) {
            return null;
        }
        com.aspose.words.internal.zzQD zzqdZzYi = zzqg.zzYi(0);
        if (zzqdZzYi.getCount() != 4) {
            return null;
        }
        if (i == 5) {
            zzq9 = (com.aspose.words.internal.zzQ9) zzqdZzYi.zzYi(0).zzQc();
            zzq92 = (com.aspose.words.internal.zzQ9) zzqdZzYi.zzYi(1).zzQc();
        } else {
            if (i != 6) {
                return null;
            }
            zzq9 = (com.aspose.words.internal.zzQ9) zzqdZzYi.zzYi(2).zzQc();
            zzq92 = (com.aspose.words.internal.zzQ9) zzqdZzYi.zzYi(3).zzQc();
        }
        com.aspose.words.internal.zzQ6 zzq62 = new com.aspose.words.internal.zzQ6(zzqg.zzQv().zzQb() + zzq6.zzQb(), zzqg.zzQv().zzYm() + zzq6.zzYm(), zzqg.zzQv().zzQa() + zzq6.zzQa());
        zzq62.normalize();
        com.aspose.words.internal.zzQG zzqg2 = new com.aspose.words.internal.zzQG(zzq62, i, i2, (com.aspose.words.internal.zzOU) null, (com.aspose.words.internal.zzPY) null);
        com.aspose.words.internal.zzQD zzqd = new com.aspose.words.internal.zzQD();
        zzqd.zzZ(zzq9);
        zzqd.zzZ(zzq92);
        zzqg2.zzZ(zzqd);
        return zzqg2;
    }
}
