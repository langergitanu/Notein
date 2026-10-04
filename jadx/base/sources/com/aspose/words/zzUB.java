package com.aspose.words;

import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
final class zzUB implements Comparator<zzUC> {
    private static int zzZ(zzUC zzuc, zzUC zzuc2) {
        try {
            Border border = (Border) zzuc.getValue();
            Border border2 = (Border) zzuc2.getValue();
            return ((((border.zz8F() ? 1 : 0) * 10) + ((zzuc.zzZZc() * 100) + (zzuc.zzZZb() * 1000))) + zzuc.zzZZa()) - ((((border2.zz8F() ? 1 : 0) * 10) + ((zzuc2.zzZZc() * 100) + (zzuc2.zzZZb() * 1000))) + zzuc2.zzZZa());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzUC zzuc, zzUC zzuc2) {
        return zzZ(zzuc, zzuc2);
    }
}
