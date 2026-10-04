package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class ImageSize {
    private double zzE;
    private double zzF;
    private int zzYj6;
    private int zzid;

    public ImageSize(int i, int i2) {
        this(i, i2, 96.0d, 96.0d);
    }

    public int getHeightPixels() {
        return this.zzYj6;
    }

    public double getHeightPoints() {
        return ConvertUtil.pixelToPoint(this.zzYj6, this.zzE);
    }

    public double getHorizontalResolution() {
        return this.zzF;
    }

    public double getVerticalResolution() {
        return this.zzE;
    }

    public int getWidthPixels() {
        return this.zzid;
    }

    public double getWidthPoints() {
        return ConvertUtil.pixelToPoint(this.zzid, this.zzF);
    }

    public final boolean isValid() {
        return getWidthPixels() > 0 && getHeightPixels() > 0;
    }

    public final int zzDN() {
        return com.aspose.words.internal.zzSA.zzU(this.zzYj6, this.zzE);
    }

    public final int zzDO() {
        return com.aspose.words.internal.zzSA.zzU(this.zzid, this.zzF);
    }

    public ImageSize(int i, int i2, double d, double d2) {
        this.zzid = i;
        this.zzYj6 = i2;
        this.zzF = d;
        this.zzE = d2;
    }

    public ImageSize(com.aspose.words.internal.zzEG zzeg) {
        this.zzid = zzeg.getWidth();
        this.zzYj6 = zzeg.getHeight();
        this.zzF = zzeg.getHorizontalResolution();
        this.zzE = zzeg.getVerticalResolution();
    }
}
