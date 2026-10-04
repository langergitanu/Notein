package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class TextAnimationCollection implements ITextAnimationCollection {

    /* JADX INFO: renamed from: k4 */
    private final List<ITextAnimation> f3511k4 = new List<>();

    public final TextAnimation add() {
        TextAnimation textAnimation = new TextAnimation();
        m2892k4(textAnimation);
        return textAnimation;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f3511k4.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.ITextAnimationCollection
    public final ITextAnimation get_Item(int i) {
        return this.f3511k4.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<ITextAnimation> iterator() {
        return this.f3511k4.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<ITextAnimation> iteratorJava() {
        return this.f3511k4.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final List<ITextAnimation> m2891k4() {
        return this.f3511k4;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f3511k4.size();
    }

    @Override // com.aspose.slides.ITextAnimationCollection
    public final ITextAnimation[] get_Item(IShape iShape) {
        List list = new List();
        IGenericEnumerator<ITextAnimation> it = iterator();
        while (it.hasNext()) {
            try {
                ITextAnimation next = it.next();
                if (((TextAnimation) next).m2890x1().m73331du() == iShape) {
                    list.addItem(next);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return (ITextAnimation[]) list.toArray(new ITextAnimation[0]);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2892k4(TextAnimation textAnimation) {
        this.f3511k4.addItem(textAnimation);
    }
}
