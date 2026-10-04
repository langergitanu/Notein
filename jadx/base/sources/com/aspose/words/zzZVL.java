package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZVL extends zzZVP {
    @Override // com.aspose.words.zzZBP
    public final com.aspose.words.internal.zzQG[] zzZ(com.aspose.words.internal.zzQG[] zzqgArr, float f, com.aspose.words.internal.zzOU zzou, com.aspose.words.internal.zzPY zzpy, int i) {
        ArrayList arrayList = new ArrayList(i);
        com.aspose.words.internal.zzQG[] zzqgArr2 = new com.aspose.words.internal.zzQG[zzqgArr.length];
        for (int i2 = 0; i2 < zzqgArr.length; i2++) {
            com.aspose.words.internal.zzQG zzqg = zzqgArr[i2];
            com.aspose.words.internal.zzQG zzqg2 = new com.aspose.words.internal.zzQG(new com.aspose.words.internal.zzQ6(), 8, zzqg.getOrder(), zzqg.zzZ2(), zzqg.zzZ1());
            for (int i3 = 0; i3 < zzqg.getCount(); i3++) {
                com.aspose.words.internal.zzQD zzqdZzYi = zzqg.zzYi(i3);
                for (int i4 = 0; i4 < zzqdZzYi.getCount(); i4++) {
                    com.aspose.words.internal.zzQ9 zzq9 = (com.aspose.words.internal.zzQ9) zzqdZzYi.zzYi(i4).zzQc();
                    com.aspose.words.internal.zzQ9 zzq92 = (com.aspose.words.internal.zzQ9) zzq9.zzQc();
                    zzq92.zz9(-f);
                    com.aspose.words.internal.zzQD zzqd = new com.aspose.words.internal.zzQD();
                    zzqd.zzZ(zzq9);
                    zzqd.zzZ(zzq92);
                    zzqg2.zzZ(zzqd);
                }
            }
            zzqgArr2[i2] = zzqg2;
        }
        com.aspose.words.internal.zzZQG.zzZ(arrayList, (Object[]) zzqgArr2);
        return (com.aspose.words.internal.zzQG[]) arrayList.toArray(new com.aspose.words.internal.zzQG[0]);
    }
}
