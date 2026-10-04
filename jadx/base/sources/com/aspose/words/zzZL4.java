package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZL4 {
    private float zzYIs;
    private float zzYIt;
    private float zzYu9;
    private com.aspose.words.internal.zzP9 zzYua;

    public zzZL4(com.aspose.words.internal.zzP9 zzp9, float f, float f2, float f3) {
        this.zzYua = zzp9;
        this.zzYIt = f;
        this.zzYIs = f2;
        this.zzYu9 = f3;
    }

    public final float getRotation() {
        return this.zzYu9;
    }

    public final float getScaleX() {
        return this.zzYIt;
    }

    public final float getScaleY() {
        return this.zzYIs;
    }

    public final com.aspose.words.internal.zzP9 zzZ54() {
        return this.zzYua;
    }

    public zzZL4() {
        this(new com.aspose.words.internal.zzP9(), 1.0f, 1.0f, 0.0f);
    }
}
