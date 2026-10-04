package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IEffectFactory {
    IGlow createGlow();

    IInnerShadow createInnerShadow();

    IOuterShadow createOuterShadow();

    IPresetShadow createPresetShadow();

    IReflection createReflection();

    ISoftEdge createSoftEdge();

    IImageTransformOperationFactory getImageTransformOperationFactory();
}
