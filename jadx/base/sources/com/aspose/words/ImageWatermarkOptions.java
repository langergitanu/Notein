package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class ImageWatermarkOptions {
    private double zzYj5 = 0.0d;
    private boolean zzYj4 = true;

    private void zzWN(double d) {
        this.zzYj5 = com.aspose.words.internal.zzZ4.zzZ(d, 0.0d, 0.0d, 65.5d, 65.5d, true, "Scale");
    }

    public double getScale() {
        return this.zzYj5;
    }

    public boolean isWashout() {
        return this.zzYj4;
    }

    public void setScale(double d) {
        zzWN(d);
    }

    public final boolean zzYVK() {
        return this.zzYj5 == 0.0d;
    }

    public void isWashout(boolean z) {
        this.zzYj4 = z;
    }
}
