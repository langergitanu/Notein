package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzIQ extends zzIW {
    @Override // com.aspose.words.zzIW
    public final long zzC(float f, float f2) {
        return com.aspose.words.internal.zzZPW.zzG(f2, f);
    }

    @Override // com.aspose.words.zzIW
    public final float zzYb(long j) {
        return Float.intBitsToFloat((int) j);
    }

    @Override // com.aspose.words.zzIW
    public final float zzYc(long j) {
        return com.aspose.words.internal.zzZPW.zzYz(j);
    }

    @Override // com.aspose.words.zzIW
    public final void zzZ(zz9K zz9k, float f, zzB6 zzb6) {
        zzb6.zzY(f, zz9k);
    }

    @Override // com.aspose.words.zzIW
    public final void zzZ(zz9K zz9k, long j, zzB6 zzb6) {
        zzb6.zzZ(Float.intBitsToFloat((int) j), zz9k);
    }

    @Override // com.aspose.words.zzIW
    public final float zzZ(float f, long j, int i, int i2) {
        if (i == 0) {
            return (Float.intBitsToFloat((int) j) - f) / 2.0f;
        }
        if (i == 1) {
            return 0.0f;
        }
        if (i == 2) {
            return Float.intBitsToFloat((int) j) - f;
        }
        throw new IllegalStateException("Unexpected node alignment.");
    }
}
