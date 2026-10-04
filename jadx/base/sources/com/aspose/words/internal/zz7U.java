package com.aspose.words.internal;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final class zz7U implements Comparator<zzD2> {
    private static int zzZ(zzD2 zzd2, zzD2 zzd22) {
        long j = zzd22.zzux.zzuR - zzd2.zzux.zzuR;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzD2 zzd2, zzD2 zzd22) {
        return zzZ(zzd2, zzd22);
    }
}
