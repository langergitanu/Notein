package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYCO {
    static zzYCO zzXnE = new zzYCO(0.0f, 0.0f);
    private float zzHg;
    private float zzXnF;

    public zzYCO(float f, float f2) {
        this.zzXnF = f;
        this.zzHg = f2;
    }

    public static zzYCO zzVO(int i, int i2) {
        return new zzYCO(i / 1000.0f, i2 / 1000.0f);
    }

    public final float getLength() {
        return this.zzHg;
    }

    public final float zzYbM() {
        return this.zzXnF;
    }
}
