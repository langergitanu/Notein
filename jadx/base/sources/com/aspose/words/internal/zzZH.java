package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZH extends zz7 {
    private long zzYV;
    private boolean zzYu;
    private int zzYv;

    public zzZH(float f, float f2) {
        this(zzZPW.zzG(f, f2), 0, false);
    }

    public final float getHeight() {
        return zzZPW.zzYz(this.zzYV);
    }

    public final int getHeightPixels() {
        return zzAN.zzZG((((double) zzZPW.zzYz(this.zzYV)) / 72.0d) * 96.0d);
    }

    public final int getPaperTray() {
        return this.zzYv;
    }

    public final long getSize() {
        return this.zzYV;
    }

    public final float getWidth() {
        return Float.intBitsToFloat((int) this.zzYV);
    }

    public final int getWidthPixels() {
        return zzAN.zzZG((((double) getWidth()) / 72.0d) * 96.0d);
    }

    @Override // com.aspose.words.internal.zz7, com.aspose.words.internal.zzZL
    public final void zzZ(zz6 zz6Var) throws Exception {
        zz6Var.zzZ(this);
        super.zzZ(zz6Var);
        zz6Var.zzY(this);
    }

    public final boolean zzZ3() {
        return this.zzYu;
    }

    public zzZH(long j, int i, boolean z) {
        this.zzYV = j;
        this.zzYv = i;
        this.zzYu = z;
    }
}
