package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzW8 extends zzW6 {
    private zzCL zzZyC;

    public zzW8(zzCL zzcl, zzD8 zzd8) {
        super(zzd8);
        this.zzZyC = zzcl;
    }

    @Override // com.aspose.words.zzW6
    public final zz30 zz3C() {
        return zz33() ? this.zzZyC.zzZGt().zzZxo() : this.zzZyC.zzZHj();
    }

    @Override // com.aspose.words.zzW6
    public final Iterable<zz4A> zz3D() {
        return this.zzZyC.zzMi();
    }

    @Override // com.aspose.words.zzW6
    public final Iterable<zz30> zz3E() {
        return new zz2Y(this.zzZyC.zzMi(), zz33());
    }

    @Override // com.aspose.words.zzW6
    public final Object zzO8(int i) {
        if (zz33()) {
            if (zzYED.zzZ(this.zzZyC.zzZHj(), i)) {
                return zzZ(i, this.zzZyC.zzZHj());
            }
            return null;
        }
        if (zzYED.zzZ(zz34().zzZHj(), i)) {
            return zzZ(i, zz34().zzZHj());
        }
        return null;
    }

    @Override // com.aspose.words.zzW6
    public final void zzYo(boolean z) {
        this.zzZyC.zzZGq();
        zz3C();
    }
}
