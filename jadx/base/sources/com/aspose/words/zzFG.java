package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzFG {
    private zzF8[] zzZdr = new zzF8[49];

    private static void zzL7(int i) {
        if (i <= 0 || i > 48) {
            throw new IllegalArgumentException("Style must be in range between 1 and 48 inclusive.");
        }
    }

    public final zzF8 zzL8(int i) {
        zzL7(i);
        zzF8 zzf8 = null;
        while (i > 0 && zzf8 == null) {
            zzf8 = this.zzZdr[i];
            i--;
        }
        return zzf8;
    }

    public final void zzZ(int i, zzF8 zzf8) {
        zzL7(i);
        this.zzZdr[i] = zzf8;
    }
}
