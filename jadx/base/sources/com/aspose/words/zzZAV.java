package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
interface zzZAV {
    int getFillType();

    int getFillableBackColor();

    int getFillableBackThemeColor() throws Exception;

    double getFillableBackTintAndShade();

    int getFillableBaseForeColor();

    int getFillableForeColor();

    int getFillableForeThemeColor() throws Exception;

    double getFillableForeTintAndShade();

    byte[] getFillableImageBytes() throws Exception;

    zzZ90 getFillableThemeProvider();

    double getFillableTransparency();

    boolean getFillableVisible();

    int getFilledColor();

    double getGradientAngle();

    GradientStopCollection getGradientStops();

    int getGradientStyle();

    int getGradientVariant();

    double getOldOpacity();

    int getPatternType() throws Exception;

    int getPresetTexture() throws Exception;

    boolean getRotateWithObject();

    int getTextureAlignment();

    double getTransparency(zzBW zzbw);

    void oneColorGradient(int i, int i2, double d);

    void patterned(int i);

    void presetTextured(int i);

    void setFill(zzZAW zzzaw);

    void setFillableBackColor(int i);

    void setFillableBackThemeColor(int i) throws Exception;

    void setFillableBackTintAndShade(double d);

    void setFillableForeColor(int i);

    void setFillableForeThemeColor(int i) throws Exception;

    void setFillableForeTintAndShade(double d);

    void setFillableTransparency(double d);

    void setFillableVisible(boolean z);

    void setFilledColor(int i);

    void setGradientAngle(double d);

    void setImage(byte[] bArr);

    void setOldOpacity(double d);

    void setRotateWithObject(boolean z);

    void setTextureAlignment(int i);

    void setTransparency(zzBW zzbw, double d);

    void solid();

    void twoColorGradient(int i, int i2);
}
