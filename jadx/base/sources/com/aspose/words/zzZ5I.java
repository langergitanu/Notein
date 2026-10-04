package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ5I {
    private boolean zzYeu;
    private boolean zzYev;

    public zzZ5I() {
        this(false, false);
    }

    public static zzZ5I zzW(long j, int i, int i2) {
        return new zzZ5I(Float.intBitsToFloat((int) j) > ((float) i), com.aspose.words.internal.zzZPY.zzYC(j) > ((float) i2));
    }

    public static zzZ5I zzZ(zzYM2 zzym2, zzYM2 zzym22, int i, int i2) {
        boolean z = false;
        boolean z2 = !zzym2.zzYnC() && zzym2.getValue() > i;
        if (!zzym22.zzYnC() && zzym22.getValue() > i2) {
            z = true;
        }
        return new zzZ5I(z2, z);
    }

    public final boolean zzYRb() {
        return this.zzYeu;
    }

    public final boolean zzYRc() {
        return this.zzYev;
    }

    public zzZ5I(boolean z, boolean z2) {
        this.zzYev = z;
        this.zzYeu = z2;
    }
}
