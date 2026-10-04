package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: loaded from: classes3.dex */
public class SequenceCollection implements ISequenceCollection {

    /* JADX INFO: renamed from: k4 */
    AnimationTimeLine f3292k4;

    /* JADX INFO: renamed from: x1 */
    private final List<ISequence> f3293x1 = new List<>();

    public SequenceCollection(AnimationTimeLine animationTimeLine) {
        this.f3292k4 = animationTimeLine;
    }

    @Override // com.aspose.slides.ISequenceCollection
    public final ISequence add(IShape iShape) {
        Sequence sequence = new Sequence(this.f3292k4);
        sequence.setTriggerShape(iShape);
        sequence.m2530k4().m6568k4((byte) 4);
        this.f3293x1.addItem(sequence);
        return sequence;
    }

    @Override // com.aspose.slides.ISequenceCollection
    public final void clear() {
        this.f3293x1.clear();
    }

    @Override // com.aspose.slides.ISequenceCollection
    public final int getCount() {
        return this.f3293x1.size();
    }

    @Override // com.aspose.slides.ISequenceCollection
    public final ISequence get_Item(int i) {
        return this.f3293x1.get_Item(i);
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<ISequence> iterator() {
        return this.f3293x1.iterator();
    }

    public final IGenericEnumerator<ISequence> iteratorJava() {
        return this.f3293x1.iteratorJava();
    }

    @Override // com.aspose.slides.ISequenceCollection
    public final void remove(ISequence iSequence) {
        this.f3293x1.removeItem(iSequence);
    }

    @Override // com.aspose.slides.ISequenceCollection
    public final void removeAt(int i) {
        this.f3293x1.removeAt(i);
    }
}
