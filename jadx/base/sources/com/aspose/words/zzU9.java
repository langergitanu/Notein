package com.aspose.words;

import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
final class zzU9 implements Comparator<zzUC> {
    private static int zzZ(zzUC zzuc, zzUC zzuc2) {
        return (((zzuc.zzZZc() * 100) + (zzuc.zzZZb() * 1000)) + zzuc2.zzZZa()) - (((zzuc2.zzZZc() * 100) + (zzuc2.zzZZb() * 1000)) + zzuc.zzZZa());
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzUC zzuc, zzUC zzuc2) {
        return zzZ(zzuc, zzuc2);
    }
}
