package com.aspose.words;

import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
final class zz94 implements Comparator<zzAN> {
    private static int zzZ(zzAN zzan, zzAN zzan2) {
        if (zzan == null && zzan2 == null) {
            return 0;
        }
        if (zzan == null) {
            return -1;
        }
        if (zzan2 == null) {
            return 1;
        }
        return zzan.zzZEy() - zzan2.zzZEy();
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzAN zzan, zzAN zzan2) {
        return zzZ(zzan, zzan2);
    }
}
