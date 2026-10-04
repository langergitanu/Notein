package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZVW {
    private static com.aspose.words.internal.zzQG[] zzY(com.aspose.words.internal.zzQG[] zzqgArr, float f) {
        ArrayList arrayList = new ArrayList(zzqgArr.length);
        com.aspose.words.internal.zzQB zzqb = new com.aspose.words.internal.zzQB();
        zzqb.zzY(0.0d, 0.0d, -f);
        for (com.aspose.words.internal.zzQG zzqg : zzqgArr) {
            com.aspose.words.internal.zzQG zzqg2 = new com.aspose.words.internal.zzQG(new com.aspose.words.internal.zzQ6(0.0d, 0.0d, -1.0d), zzqg.getOrder(), zzqg.zzZ2(), zzqg.zzZ1(), zzqg.getCount());
            zzqg2.zzY(zzqg.zzZ1());
            for (int i = 0; i < zzqg.getCount(); i++) {
                com.aspose.words.internal.zzQD zzqdZzYi = zzqg.zzYi(i);
                com.aspose.words.internal.zzQD zzqd = new com.aspose.words.internal.zzQD(zzqdZzYi.getCount(), zzqdZzYi.isClosed());
                for (int i2 = 0; i2 < zzqdZzYi.getCount(); i2++) {
                    zzqd.zzZ(zzqb.zzY(zzqdZzYi.zzYi(i2)));
                }
                zzqg2.zzZ(zzqd);
            }
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzQG>) arrayList, zzqg2);
        }
        return (com.aspose.words.internal.zzQG[]) arrayList.toArray(new com.aspose.words.internal.zzQG[0]);
    }

    public static com.aspose.words.internal.zzQG[] zzZ(com.aspose.words.internal.zzQG[] zzqgArr, float f) {
        return zzY(zzqgArr, f);
    }
}
