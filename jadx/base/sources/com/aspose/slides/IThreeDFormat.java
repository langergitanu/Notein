package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IThreeDFormat extends IThreeDParamSource {
    IShapeBevel getBevelBottom();

    IShapeBevel getBevelTop();

    ICamera getCamera();

    IColorFormat getContourColor();

    double getContourWidth();

    double getDepth();

    IThreeDFormatEffectiveData getEffective();

    IColorFormat getExtrusionColor();

    double getExtrusionHeight();

    ILightRig getLightRig();

    int getMaterial();

    void setContourWidth(double d);

    void setDepth(double d);

    void setExtrusionHeight(double d);

    void setMaterial(int i);
}
