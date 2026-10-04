package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class BehaviorFactory implements IBehaviorFactory {
    @Override // com.aspose.slides.IBehaviorFactory
    public final IColorEffect createColorEffect() {
        return new ColorEffect();
    }

    @Override // com.aspose.slides.IBehaviorFactory
    public final ICommandEffect createCommandEffect() {
        return new CommandEffect();
    }

    @Override // com.aspose.slides.IBehaviorFactory
    public final IFilterEffect createFilterEffect() {
        return new FilterEffect();
    }

    @Override // com.aspose.slides.IBehaviorFactory
    public final IMotionEffect createMotionEffect() {
        return new MotionEffect();
    }

    @Override // com.aspose.slides.IBehaviorFactory
    public final IPropertyEffect createPropertyEffect() {
        return new PropertyEffect();
    }

    @Override // com.aspose.slides.IBehaviorFactory
    public final IRotationEffect createRotationEffect() {
        return new RotationEffect();
    }

    @Override // com.aspose.slides.IBehaviorFactory
    public final IScaleEffect createScaleEffect() {
        return new ScaleEffect();
    }

    @Override // com.aspose.slides.IBehaviorFactory
    public final ISetEffect createSetEffect() {
        return new SetEffect();
    }
}
