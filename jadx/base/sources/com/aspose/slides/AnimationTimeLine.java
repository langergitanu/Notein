package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class AnimationTimeLine extends DomObject<BaseSlide> implements IAnimationTimeLine {

    /* JADX INFO: renamed from: k4 */
    SequenceCollection f199k4;

    /* JADX INFO: renamed from: kk */
    TextAnimationCollection f200kk;

    /* JADX INFO: renamed from: x1 */
    Sequence f201x1;

    public AnimationTimeLine(BaseSlide baseSlide) {
        super(baseSlide);
        this.f200kk = new TextAnimationCollection();
        this.f199k4 = new SequenceCollection(this);
        Sequence sequence = new Sequence(this);
        this.f201x1 = sequence;
        sequence.m2530k4().m6568k4((byte) 3);
    }

    @Override // com.aspose.slides.IAnimationTimeLine
    public final ISequenceCollection getInteractiveSequences() {
        return this.f199k4;
    }

    @Override // com.aspose.slides.IAnimationTimeLine
    public final ISequence getMainSequence() {
        return this.f201x1;
    }

    @Override // com.aspose.slides.IAnimationTimeLine
    public final ITextAnimationCollection getTextAnimationCollection() {
        return this.f200kk;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final BaseSlide m249k4() {
        return (BaseSlide) this.f2127h4;
    }
}
