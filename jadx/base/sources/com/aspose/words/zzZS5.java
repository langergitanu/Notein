package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZS5 {
    public static zzZS6 zzZ(zzZS8 zzzs8, int i) {
        return i == 0 ? new zzYBA(zzzs8, 1, false) : new zzYB9(zzzs8);
    }

    public static zzZS6 zzZ(zzZS8 zzzs8, int i, int i2, com.aspose.words.internal.zzZYG<Object> zzzyg, IWarningCallback iWarningCallback) {
        if (i2 == 1) {
            return new zzYNV(zzzs8, zzzyg, iWarningCallback);
        }
        return new zzYBA(zzzs8, i, true);
    }
}
