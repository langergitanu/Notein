package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz65 implements zzZC9 {
    private int zzL4;
    private float zzZ2i;
    private boolean zzZ2q;
    private zz9K zzZ2s;
    private boolean zzZ7L;
    private float zzZ2h = Float.POSITIVE_INFINITY;
    private boolean zzZiG = true;

    public zz65(int i, zz9K zz9k) {
        this.zzL4 = i;
        this.zzZ2s = zz9k;
    }

    private void zzYR(float f) {
        if (Float.isInfinite(f)) {
            this.zzZ2h = f;
        } else {
            this.zzZ2h = zzB5.zzR(this.zzL4, f);
        }
    }

    @Override // com.aspose.words.zzZC9
    public final int getType() {
        return this.zzL4;
    }

    @Override // com.aspose.words.zzZC9
    public final void invalidate() {
        this.zzZiG = false;
    }

    @Override // com.aspose.words.zzZC9
    public final void zzX9(boolean z) {
        this.zzZ2q = true;
    }

    @Override // com.aspose.words.zzZC9
    public final void zzXa(boolean z) {
        this.zzZ7L = z;
    }

    public final void zzYQ(float f) {
        this.zzZ2i = f;
    }

    @Override // com.aspose.words.zzZC9
    public final void zzYS(float f) {
        zzYR(f);
    }

    @Override // com.aspose.words.zzZC9
    public final void zzYT(float f) {
        zzYR(f);
    }

    public final boolean zzZzd() {
        return this.zzZ7L;
    }

    public final float zzZze() {
        return this.zzZ2h;
    }

    @Override // com.aspose.words.zzZC9
    public final void zzZzf() {
        zzYR(this.zzZiG ? Float.POSITIVE_INFINITY : 0.0f);
        this.zzZ2q = false;
        this.zzZ7L = false;
        this.zzZ2i = Float.POSITIVE_INFINITY;
    }

    @Override // com.aspose.words.zzZC9
    public final boolean zzZzk() {
        return this.zzZ2q;
    }

    @Override // com.aspose.words.zzZC9
    public final zz9K zzZzn() {
        return this.zzZ2s;
    }

    @Override // com.aspose.words.zzZC9
    public final float zzZzp() {
        return this.zzZ2i;
    }

    @Override // com.aspose.words.zzZC9
    public final float zzZzq() {
        return this.zzZ2h;
    }

    @Override // com.aspose.words.zzZC9
    public final float zzZzr() {
        return this.zzZ2h;
    }

    @Override // com.aspose.words.zzZC9
    public final float zzZzs() {
        return this.zzZ2h;
    }
}
