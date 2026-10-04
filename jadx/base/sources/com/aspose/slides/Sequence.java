package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class Sequence implements ISequence {

    /* JADX INFO: renamed from: k4 */
    Shape f3289k4;

    /* JADX INFO: renamed from: kk */
    private ge9 f3290kk = new ge9();

    /* JADX INFO: renamed from: x1 */
    private AnimationTimeLine f3291x1;

    public Sequence(AnimationTimeLine animationTimeLine) {
        this.f3291x1 = animationTimeLine;
    }

    @Override // com.aspose.slides.ISequence
    public final IEffect addEffect(IChart iChart, int i, int i2, int i3, int i4, int i5) {
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
        }
        Effect effect = (Effect) addEffect(iChart, i3, i4, i5);
        effect.m1375kk().m7552c5(i);
        effect.m1375kk().m7560h4(i2);
        return effect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.ISequence
    public final void clear() {
        List list = new List();
        IGenericEnumerator<ITextAnimation> it = this.f3291x1.f200kk.iterator();
        while (it.hasNext()) {
            try {
                TextAnimation textAnimation = (TextAnimation) it.next();
                if (textAnimation.m2886k4() == this) {
                    list.addItem(textAnimation);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        List.Enumerator it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                this.f3291x1.f200kk.m2891k4().removeItem((TextAnimation) it2.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        m2530k4().m6576to().clear();
    }

    @Override // com.aspose.slides.ISequence
    public final int getCount() {
        return m2530k4().m6576to().size();
    }

    @Override // com.aspose.slides.ISequence
    public final IEffect[] getEffectsByParagraph(IParagraph iParagraph) {
        List list = new List();
        List.Enumerator<IEffect> it = m2530k4().m6576to().iterator();
        while (it.hasNext()) {
            try {
                Effect effect = (Effect) it.next();
                if (effect.m1372k4() == ((Paragraph) iParagraph) || effect.m1377x1() == ((Paragraph) iParagraph)) {
                    list.addItem(effect);
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        IEffect[] iEffectArr = new IEffect[list.size()];
        list.copyTo(iEffectArr);
        return iEffectArr;
    }

    @Override // com.aspose.slides.ISequence
    public final IEffect[] getEffectsByShape(IShape iShape) {
        List list = new List();
        List.Enumerator<IEffect> it = m2530k4().m6576to().iterator();
        while (it.hasNext()) {
            try {
                Effect effect = (Effect) it.next();
                if (effect.m1375kk().m7584to() == iShape) {
                    list.addItem(effect);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        IEffect[] iEffectArr = new IEffect[list.size()];
        list.copyTo(iEffectArr);
        return iEffectArr;
    }

    @Override // com.aspose.slides.ISequence
    public final IShape getTriggerShape() {
        return this.f3289k4;
    }

    @Override // com.aspose.slides.ISequence
    public final IEffect get_Item(int i) {
        return (Effect) m2530k4().m6576to().get_Item(i);
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IEffect> iterator() {
        return m2530k4().m6576to().iterator();
    }

    public final IGenericEnumerator<IEffect> iteratorJava() {
        return m2530k4().m6576to().iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final Effect m2529k4(IShape iShape, int i, int i2, int i3, int i4) {
        m2530k4().m6571k4(iShape);
        m2530k4().m6579x1(i4);
        m2528k4(iShape, i, i2, i3);
        m2530k4().m6571k4((IShape) null);
        Effect effect = (Effect) m2530k4().m6576to().get_Item(m2530k4().m6576to().size() - 1);
        effect.getTiming().setTriggerType(i4);
        return effect;
    }

    @Override // com.aspose.slides.ISequence
    public final void remove(IEffect iEffect) {
        if (iEffect != null) {
            ((TextAnimation) iEffect.getTextAnimation()).m2890x1().m73332k4().removeItem(iEffect);
        }
        m2530k4().m6576to().removeItem(iEffect);
    }

    @Override // com.aspose.slides.ISequence
    public final void removeAt(int i) {
        if (m2530k4().m6576to().get_Item(i) != null) {
            ((TextAnimation) ((Effect) m2530k4().m6576to().get_Item(i)).getTextAnimation()).m2890x1().m73332k4().removeItem(m2530k4().m6576to().get_Item(i));
        }
        m2530k4().m6576to().removeAt(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.ISequence
    public final void removeByShape(IShape iShape) {
        List list = new List();
        List.Enumerator it = m2530k4().m6576to().iterator();
        while (it.hasNext()) {
            try {
                Effect effect = (Effect) it.next();
                if (effect.m1375kk().m7584to() == iShape) {
                    list.addItem(effect);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = list.iterator();
        while (it.hasNext()) {
            try {
                remove((Effect) it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.ISequence
    public final void setTriggerShape(IShape iShape) {
        this.f3289k4 = (Shape) iShape;
    }

    /* JADX INFO: renamed from: x1 */
    public final AnimationTimeLine m2531x1() {
        return this.f3291x1;
    }

    @Override // com.aspose.slides.ISequence
    public final IEffect addEffect(IChart iChart, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("seriesIndex");
        }
        if (i3 < 0) {
            throw new ArgumentOutOfRangeException("categoriesIndex");
        }
        Effect effect = (Effect) addEffect(iChart, i4, i5, i6);
        effect.m1375kk().m7563jd(i);
        effect.m1375kk().m7580m9(i2);
        effect.m1375kk().m7557dy(i3);
        return effect;
    }

    @Override // com.aspose.slides.ISequence
    public final int getCount(IShape iShape) {
        List.Enumerator<IEffect> it = m2530k4().m6576to().iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                if (((Effect) it.next()).m1375kk().m7584to() == iShape) {
                    i++;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: k4 */
    public final ge9 m2530k4() {
        return this.f3290kk;
    }

    /* JADX INFO: renamed from: k4 */
    private void m2528k4(IShape iShape, int i, int i2, int i3) {
        com.aspose.slides.internal.p332p7.rx0 rx0VarM69256k4 = put.m69256k4(C14113y2.m67402k4(C1243i8.m7547k4(i, i2, i3, (Shape) iShape), ContextChain.TAG_PRODUCT, "a"));
        SortedList sortedList = new SortedList();
        Shape shape = (Shape) C7019kk.m27452k4((Object) iShape, Shape.class);
        if (shape != null) {
            sortedList.set_Item(C13850af.m65147x1(shape.m2584wp()), iShape);
        }
        x9t.m73234k4(this, (com.aspose.slides.internal.p332p7.rx0) null, rx0VarM69256k4, new yqd(sortedList));
    }

    @Override // com.aspose.slides.ISequence
    public final IEffect addEffect(IParagraph iParagraph, int i, int i2, int i3) {
        Paragraph paragraph = (Paragraph) iParagraph;
        paragraph.m2153c5();
        IShape iShape = (IShape) C7019kk.m27452k4((Object) paragraph.m2154ck().m2179kk().m2924kk(), IShape.class);
        if (iShape == null) {
            throw new InvalidOperationException("Paragraph should be assigned to the IShape");
        }
        Effect effectM2529k4 = m2529k4(iShape, i, i2, C1243i8.m7545k4(i, i2), i3);
        TextAnimation textAnimation = new TextAnimation();
        textAnimation.m2888k4(this);
        textAnimation.f3508kk = true;
        this.f3291x1.f200kk.m2892k4(textAnimation);
        textAnimation.m2890x1().m73334k4(effectM2529k4);
        textAnimation.m2890x1().m73335k4(iShape);
        textAnimation.m2890x1().m73332k4().addItem(effectM2529k4);
        effectM2529k4.m1375kk().m7569k4(textAnimation);
        effectM2529k4.m1375kk().m7591x1(this.f3291x1.m249k4().m386fa());
        if (effectM2529k4.m1375kk().m7590x1() > effectM2529k4.m1375kk().m7564k4()) {
            effectM2529k4.m1375kk().m7566k4(effectM2529k4.m1375kk().m7590x1());
        }
        int iM2167m9 = paragraph.m2167m9();
        effectM2529k4.m1374k4(iM2167m9, iM2167m9, paragraph.m2154ck());
        return effectM2529k4;
    }

    @Override // com.aspose.slides.ISequence
    public final IEffect addEffect(IShape iShape, int i, int i2, int i3) {
        Effect effectM2529k4 = m2529k4(iShape, i, i2, C1243i8.m7545k4(i, i2), i3);
        if (C7019kk.m27469x1(iShape, AutoShape.class)) {
            TextAnimation textAnimation = new TextAnimation();
            textAnimation.m2888k4(this);
            this.f3291x1.f200kk.m2892k4(textAnimation);
            textAnimation.m2890x1().m73334k4(effectM2529k4);
            textAnimation.m2890x1().m73335k4(iShape);
            textAnimation.f3507k4 = 0;
            textAnimation.m2890x1().m73332k4().addItem(effectM2529k4);
            effectM2529k4.m1375kk().m7569k4(textAnimation);
        }
        effectM2529k4.m1375kk().m7591x1(this.f3291x1.m249k4().m386fa());
        if (effectM2529k4.m1375kk().m7590x1() > effectM2529k4.m1375kk().m7564k4()) {
            effectM2529k4.m1375kk().m7566k4(effectM2529k4.m1375kk().m7590x1());
        }
        return effectM2529k4;
    }
}
