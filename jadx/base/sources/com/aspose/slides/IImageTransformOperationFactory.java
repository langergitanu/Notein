package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IImageTransformOperationFactory {
    IAlphaCeiling createAlphCeiling();

    IAlphaBiLevel createAlphaBiLevel(float f);

    IAlphaFloor createAlphaFloor();

    IAlphaInverse createAlphaInverse();

    IAlphaModulate createAlphaModulate();

    IAlphaModulateFixed createAlphaModulateFixed(float f);

    IAlphaReplace createAlphaReplace(float f);

    IBiLevel createBiLevel(float f);

    IBlur createBlur(double d, boolean z);

    IColorChange createColorChange();

    IColorReplace createColorReplace();

    IDuotone createDuotone();

    IFillOverlay createFillOverlay();

    IGrayScale createGrayScale();

    IHSL createHSL(float f, float f2, float f3);

    ILuminance createLuminance(float f, float f2);

    ITint createTint(float f, float f2);
}
