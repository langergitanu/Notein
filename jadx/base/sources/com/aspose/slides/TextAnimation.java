package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class TextAnimation implements ITextAnimation {

    /* JADX INFO: renamed from: kk */
    boolean f3508kk;

    /* JADX INFO: renamed from: to */
    private Sequence f3509to;

    /* JADX INFO: renamed from: k4 */
    int f3507k4 = 0;

    /* JADX INFO: renamed from: x1 */
    int f3510x1 = -1;

    /* JADX INFO: renamed from: du */
    private xdm f3506du = new xdm();

    /* JADX INFO: renamed from: k4 */
    private Effect m2884k4(Effect effect, int i) {
        Effect effectM2529k4 = m2886k4().m2529k4(m2890x1().m73331du(), effect.getType(), effect.getSubtype(), i, effect.getTiming().getTriggerType());
        effectM2529k4.getBehaviors().clear();
        IGenericEnumerator<IBehavior> it = effect.getBehaviors().iterator();
        while (it.hasNext()) {
            try {
                effectM2529k4.getBehaviors().add(it.next());
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        ((Timing) effectM2529k4.getTiming()).m3020k4(effect.getTiming());
        effectM2529k4.m1375kk().m7566k4(effect.m1375kk().m7564k4());
        effectM2529k4.m1375kk().m7591x1(m2886k4().m2531x1().m249k4().m386fa());
        return effectM2529k4;
    }

    @Override // com.aspose.slides.ITextAnimation
    public final IEffect addEffect(int i, int i2, int i3) {
        Effect effectM2529k4 = m2886k4().m2529k4(m2890x1().m73331du(), i, i2, C1243i8.m7545k4(i, i2), i3);
        m2890x1().m73332k4().addItem(effectM2529k4);
        m2889kk();
        return effectM2529k4;
    }

    @Override // com.aspose.slides.ITextAnimation
    public final int getBuildType() {
        return this.f3507k4;
    }

    @Override // com.aspose.slides.ITextAnimation
    public final IEffect getEffectAnimateBackgroundShape() {
        return m2890x1().m73339x1();
    }

    /* JADX INFO: renamed from: kk */
    public final void m2889kk() {
        List.Enumerator<IEffect> it = m2890x1().m73332k4().iterator();
        while (it.hasNext()) {
            try {
                ((Effect) it.next()).m1375kk().m7569k4(this);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.ITextAnimation
    public final void setBuildType(int i) {
        int i2 = this.f3507k4;
        this.f3507k4 = i;
        m2887k4(i2);
    }

    @Override // com.aspose.slides.ITextAnimation
    public final void setEffectAnimateBackgroundShape(IEffect iEffect) {
        if (m2890x1().m73339x1() != null) {
            m2886k4().m2530k4().m6576to().removeItem(m2890x1().m73339x1());
            m2890x1().m73332k4().removeItem(m2890x1().m73339x1());
            m2890x1().m73334k4((IEffect) null);
        }
        if (iEffect != null) {
            m2890x1().m73334k4(iEffect);
            m2886k4().m2530k4().m6576to().insertItem(0, iEffect);
            m2890x1().m73332k4().insertItem(0, iEffect);
        }
        m2889kk();
    }

    /* JADX INFO: renamed from: x1 */
    public final xdm m2890x1() {
        return this.f3506du;
    }

    /* JADX INFO: renamed from: k4 */
    public final Sequence m2886k4() {
        return this.f3509to;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2887k4(int i) {
        IAutoShape iAutoShape;
        int i2;
        if (this.f3507k4 == 0 || (iAutoShape = (IAutoShape) C7019kk.m27452k4((Object) m2890x1().m73331du(), IAutoShape.class)) == null || iAutoShape.getTextFrame() == null) {
            return;
        }
        if (i == 0) {
            for (IEffect iEffect : m2886k4().getEffectsByShape(iAutoShape)) {
                if (iEffect.getTextAnimation() != null && iEffect.getTextAnimation().getBuildType() == 0) {
                    ((TextAnimation) iEffect.getTextAnimation()).f3507k4 = 1;
                }
            }
        }
        switch (this.f3507k4) {
            case 1:
                i2 = -1;
                break;
            case 2:
                m2885k4(iAutoShape, 0, i);
                return;
            case 3:
                m2885k4(iAutoShape, 1, i);
                return;
            case 4:
                i2 = 2;
                break;
            case 5:
                i2 = 3;
                break;
            case 6:
                i2 = 4;
                break;
            default:
                return;
        }
        m2885k4(iAutoShape, i2, i);
    }

    /* JADX INFO: renamed from: k4 */
    private void m2885k4(IAutoShape iAutoShape, int i, int i2) {
        IEffect[] array = m2890x1().m73332k4().toArray(new IEffect[0]);
        if (array.length == 0) {
            return;
        }
        ParagraphCollection paragraphCollection = (ParagraphCollection) iAutoShape.getTextFrame().getParagraphs();
        List list = new List();
        for (int i3 = 0; i3 < paragraphCollection.getCount(); i3++) {
            if (!C14113y2.m67411k4(paragraphCollection.get_Item(i3).getText())) {
                list.addItem(Integer.valueOf(i3));
            }
        }
        if (list.size() == 0 && paragraphCollection.getCount() == 0) {
            return;
        }
        Effect effect = (Effect) array[0];
        effect.m1375kk().m7570k4((com.aspose.slides.internal.p332p7.a9h) null);
        for (IEffect iEffect : array) {
            Effect effect2 = (Effect) iEffect;
            if (effect2.f2144to > -1 || effect2.f2137du > -1 || effect2.m1375kk().m7551c5() != null) {
                m2886k4().m2530k4().m6576to().removeItem(effect2);
                m2890x1().m73332k4().removeItem(effect2);
            }
        }
        int iM7545k4 = C1243i8.m7545k4(effect.getType(), effect.getSubtype());
        if (list.size() == 0) {
            if (i2 > 0) {
                effect.m1374k4(0, 0, (ParagraphCollection) iAutoShape.getTextFrame().getParagraphs());
            } else {
                Effect effectM2884k4 = m2884k4(effect, iM7545k4);
                effectM2884k4.getTiming().setTriggerType(2);
                effectM2884k4.m1374k4(0, 0, (ParagraphCollection) iAutoShape.getTextFrame().getParagraphs());
                m2890x1().m73332k4().addItem(effectM2884k4);
            }
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue = ((Integer) list.get_Item(i4)).intValue();
            if (i4 == 0 && i2 > 0 && m2890x1().m73339x1() == null) {
                effect.m1374k4(iIntValue, iIntValue, (ParagraphCollection) iAutoShape.getTextFrame().getParagraphs());
            } else {
                Effect effectM2884k42 = m2884k4(effect, iM7545k4);
                if (this.f3507k4 == 1 || paragraphCollection.get_Item(i4).getParagraphFormat().getDepth() > i) {
                    effectM2884k42.getTiming().setTriggerType(2);
                }
                effectM2884k42.m1374k4(iIntValue, iIntValue, (ParagraphCollection) iAutoShape.getTextFrame().getParagraphs());
                m2890x1().m73332k4().addItem(effectM2884k42);
            }
        }
        m2889kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2888k4(Sequence sequence) {
        this.f3509to = sequence;
    }
}
