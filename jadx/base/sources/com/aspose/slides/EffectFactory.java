package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class EffectFactory implements IEffectFactory {

    /* JADX INFO: renamed from: k4 */
    private static final ImageTransformOperationFactory f2147k4 = new ImageTransformOperationFactory();

    /* JADX INFO: renamed from: k4 */
    public static ImageTransformOperationFactory m1380k4() {
        return f2147k4;
    }

    @Override // com.aspose.slides.IEffectFactory
    public final IGlow createGlow() {
        return new Glow(null);
    }

    @Override // com.aspose.slides.IEffectFactory
    public final IInnerShadow createInnerShadow() {
        return new InnerShadow(null);
    }

    @Override // com.aspose.slides.IEffectFactory
    public final IOuterShadow createOuterShadow() {
        return new OuterShadow(null);
    }

    @Override // com.aspose.slides.IEffectFactory
    public final IPresetShadow createPresetShadow() {
        return new PresetShadow(null);
    }

    @Override // com.aspose.slides.IEffectFactory
    public final IReflection createReflection() {
        return new Reflection(null);
    }

    @Override // com.aspose.slides.IEffectFactory
    public final ISoftEdge createSoftEdge() {
        return new SoftEdge(null);
    }

    @Override // com.aspose.slides.IEffectFactory
    public final IImageTransformOperationFactory getImageTransformOperationFactory() {
        return f2147k4;
    }
}
