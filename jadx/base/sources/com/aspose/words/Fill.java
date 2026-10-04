package com.aspose.words;

import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public class Fill {
    private zzZAV zzZ3V;

    public Fill(zzZAV zzzav) {
        this.zzZ3V = zzzav;
    }

    private void zzZa(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        byte[] bArr = new byte[(int) zzzop.getLength()];
        zzzop.read(bArr, 0, (int) zzzop.getLength());
        this.zzZ3V.setImage(bArr);
    }

    public int getBackColor() {
        return this.zzZ3V.getFillableBackColor();
    }

    public int getBackThemeColor() throws Exception {
        return this.zzZ3V.getFillableBackThemeColor();
    }

    public double getBackTintAndShade() {
        return this.zzZ3V.getFillableBackTintAndShade();
    }

    public int getBaseForeColor() {
        return this.zzZ3V.getFillableBaseForeColor();
    }

    public int getColor() {
        return this.zzZ3V.getFilledColor();
    }

    public int getFillType() {
        if (!this.zzZ3V.getFillableVisible()) {
            return 1;
        }
        switch (this.zzZ3V.getFillType()) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 6;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
                return 3;
            case 9:
                return 5;
            default:
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: FillType");
        }
    }

    public int getForeColor() {
        return this.zzZ3V.getFillableForeColor();
    }

    public int getForeThemeColor() throws Exception {
        return this.zzZ3V.getFillableForeThemeColor();
    }

    public double getForeTintAndShade() {
        return this.zzZ3V.getFillableForeTintAndShade();
    }

    public double getGradientAngle() {
        return this.zzZ3V.getGradientAngle();
    }

    public GradientStopCollection getGradientStops() {
        return this.zzZ3V.getGradientStops();
    }

    public int getGradientStyle() {
        return this.zzZ3V.getGradientStyle();
    }

    public int getGradientVariant() {
        return this.zzZ3V.getGradientVariant();
    }

    public byte[] getImageBytes() throws Exception {
        return this.zzZ3V.getFillableImageBytes();
    }

    public double getOpacity() {
        return this.zzZ3V.getOldOpacity();
    }

    public int getPattern() throws Exception {
        return this.zzZ3V.getPatternType();
    }

    public int getPresetTexture() throws Exception {
        return this.zzZ3V.getPresetTexture();
    }

    public boolean getRotateWithObject() {
        return this.zzZ3V.getRotateWithObject();
    }

    public int getTextureAlignment() {
        return this.zzZ3V.getTextureAlignment();
    }

    public double getTransparency() {
        return this.zzZ3V.getFillableTransparency();
    }

    public boolean getVisible() {
        return this.zzZ3V.getFillableVisible();
    }

    public void oneColorGradient(int i, int i2, double d) {
        this.zzZ3V.oneColorGradient(i, i2, d);
    }

    public void patterned(int i) {
        if (i == -1) {
            throw new IllegalArgumentException("PatternType.None cannot be applied directly.");
        }
        this.zzZ3V.patterned(i);
    }

    public void presetTextured(int i) {
        if (i == -1) {
            throw new IllegalArgumentException("PresetTexture.None cannot be applied directly.");
        }
        this.zzZ3V.presetTextured(i);
    }

    public void setBackColor(int i) {
        this.zzZ3V.setFillableBackColor(i);
    }

    public void setBackThemeColor(int i) throws Exception {
        this.zzZ3V.setFillableBackThemeColor(i);
    }

    public void setBackTintAndShade(double d) {
        this.zzZ3V.setFillableBackTintAndShade(d);
    }

    public void setColor(int i) {
        this.zzZ3V.setFilledColor(i);
    }

    public void setForeColor(int i) {
        this.zzZ3V.setFillableForeColor(i);
    }

    public void setForeThemeColor(int i) throws Exception {
        this.zzZ3V.setFillableForeThemeColor(i);
    }

    public void setForeTintAndShade(double d) {
        this.zzZ3V.setFillableForeTintAndShade(d);
    }

    public void setGradientAngle(double d) {
        this.zzZ3V.setGradientAngle(d);
    }

    public void setImage(String str) throws Exception {
        this.zzZ3V.setImage(com.aspose.words.internal.zzZOU.zzVi(str));
    }

    public void setOpacity(double d) {
        com.aspose.words.internal.zzZ4.zzZ(d, 0.0d, 1.0d, "Opacity");
        this.zzZ3V.setOldOpacity(d);
    }

    public void setRotateWithObject(boolean z) {
        this.zzZ3V.setRotateWithObject(z);
    }

    public void setTextureAlignment(int i) {
        this.zzZ3V.setTextureAlignment(i);
    }

    public void setTransparency(double d) {
        com.aspose.words.internal.zzZ4.zzZ(d, 0.0d, 1.0d, "Transparency");
        this.zzZ3V.setFillableTransparency(d);
    }

    public void setVisible(boolean z) {
        this.zzZ3V.setFillableVisible(z);
    }

    public void solid() {
        this.zzZ3V.solid();
    }

    public void twoColorGradient(int i, int i2) {
        this.zzZ3V.twoColorGradient(i, i2);
    }

    public void oneColorGradient(int i, int i2, int i3, double d) {
        this.zzZ3V.oneColorGradient(i2, 1, d);
        this.zzZ3V.setFillableForeColor(i);
        this.zzZ3V.oneColorGradient(i2, i3, d);
    }

    public void solid(int i) {
        this.zzZ3V.solid();
        this.zzZ3V.setFillableForeColor(i);
    }

    public void twoColorGradient(int i, int i2, int i3, int i4) {
        this.zzZ3V.twoColorGradient(i3, 1);
        this.zzZ3V.setFillableForeColor(i);
        this.zzZ3V.setFillableBackColor(i2);
        this.zzZ3V.twoColorGradient(i3, i4);
    }

    public void patterned(int i, int i2, int i3) {
        patterned(i);
        this.zzZ3V.setFillableForeColor(i2);
        this.zzZ3V.setFillableBackColor(i3);
    }

    public void setImage(InputStream inputStream) throws Exception {
        zzZa(com.aspose.words.internal.zzZOP.zzY(inputStream));
    }

    public void setImage(byte[] bArr) {
        this.zzZ3V.setImage(bArr);
    }
}
