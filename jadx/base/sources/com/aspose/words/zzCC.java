package com.aspose.words;

import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
final class zzCC implements Comparator<zzCF> {
    private static int zzY(zzCF zzcf, zzCF zzcf2) {
        if (!com.aspose.words.internal.zzAN.zzVb(com.aspose.words.internal.zzZKT.zzF(zzcf.getValue(), zzcf2.getValue()))) {
            return com.aspose.words.internal.zzZKT.zzF(zzcf.getValue(), zzcf2.getValue());
        }
        if (com.aspose.words.internal.zzZKR.zzZ7(zzcf.getIndex(), zzcf2.getIndex()) != 0) {
            return com.aspose.words.internal.zzZKR.zzZ7(zzcf.getIndex(), zzcf2.getIndex());
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzCF zzcf, zzCF zzcf2) {
        return zzY(zzcf, zzcf2);
    }
}
