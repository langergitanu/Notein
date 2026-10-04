package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IImageTransformOperationCollection extends com.aspose.slides.Collections.Generic.IGenericCollection<IImageTransformOperation> {
    IAlphaBiLevel addAlphaBiLevelEffect(float f);

    IAlphaCeiling addAlphaCeilingEffect();

    IAlphaFloor addAlphaFloorEffect();

    IAlphaInverse addAlphaInverseEffect();

    IAlphaModulate addAlphaModulateEffect();

    IAlphaModulateFixed addAlphaModulateFixedEffect(float f);

    IAlphaReplace addAlphaReplaceEffect(float f);

    IBiLevel addBiLevelEffect(float f);

    IBlur addBlurEffect(double d, boolean z);

    IColorChange addColorChangeEffect();

    IColorReplace addColorReplaceEffect();

    IDuotone addDuotoneEffect();

    IFillOverlay addFillOverlayEffect();

    IGrayScale addGrayScaleEffect();

    IHSL addHSLEffect(float f, float f2, float f3);

    ILuminance addLuminanceEffect(float f, float f2);

    ITint addTintEffect(float f, float f2);

    IImageTransformOperation get_Item(int i);

    void removeAt(int i);
}
