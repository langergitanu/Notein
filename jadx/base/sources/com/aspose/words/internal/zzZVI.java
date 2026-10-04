package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZVI implements zzF5 {
    private double zz7q;
    private double zz7r;
    private double zz7s;

    @Override // com.aspose.words.internal.zzF5
    public final double getHeight() {
        return this.zz7s + this.zz7r;
    }

    @Override // com.aspose.words.internal.zzF5
    public final double getLineSpacing() {
        return this.zz7q;
    }

    public final void reset() {
        this.zz7s = 0.0d;
        this.zz7r = 0.0d;
        this.zz7q = 0.0d;
    }

    public final void setLineSpacing(double d) {
        this.zz7q = d;
    }

    public final void zzY(zzF5 zzf5) {
        if (zzf5 == null) {
            return;
        }
        this.zz7s = Math.max(this.zz7s, zzf5.zzY9());
        this.zz7r = Math.max(this.zz7r, zzf5.zzY8());
        this.zz7q = Math.max(this.zz7q, zzf5.getLineSpacing());
    }

    @Override // com.aspose.words.internal.zzF5
    public final double zzY8() {
        return this.zz7r;
    }

    @Override // com.aspose.words.internal.zzF5
    public final double zzY9() {
        return this.zz7s;
    }

    public final void zzZq(double d) {
        this.zz7r = d;
    }

    public final void zzZr(double d) {
        this.zz7s = d;
    }
}
