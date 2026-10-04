package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IPresetShadow extends IAccessiblePVIObject<IPresetShadowEffectiveData>, IImageTransformOperation {
    float getDirection();

    double getDistance();

    int getPreset();

    IColorFormat getShadowColor();

    void setDirection(float f);

    void setDistance(double d);

    void setPreset(int i);
}
