package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14049c6;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class Effect implements IEffect, InterfaceC14397rj {

    /* JADX INFO: renamed from: c5 */
    private ParagraphCollection f2135c5;

    /* JADX INFO: renamed from: ck */
    private int f2136ck;

    /* JADX INFO: renamed from: du */
    int f2137du;

    /* JADX INFO: renamed from: dy */
    private final C1243i8 f2138dy;

    /* JADX INFO: renamed from: h4 */
    private IColorFormat f2139h4;

    /* JADX INFO: renamed from: jd */
    private int f2140jd;

    /* JADX INFO: renamed from: k4 */
    Sequence f2141k4;

    /* JADX INFO: renamed from: kk */
    Timing f2142kk;

    /* JADX INFO: renamed from: m9 */
    private float f2143m9;

    /* JADX INFO: renamed from: to */
    int f2144to;

    /* JADX INFO: renamed from: x1 */
    BehaviorCollection f2145x1;

    public Effect(Sequence sequence) {
        C1243i8 c1243i8 = new C1243i8();
        this.f2138dy = c1243i8;
        this.f2145x1 = new BehaviorCollection();
        c1243i8.m7566k4(-1);
        c1243i8.m7559h4();
        this.f2145x1 = new BehaviorCollection();
        this.f2142kk = new Timing(this);
        this.f2144to = -1;
        this.f2137du = -1;
        this.f2141k4 = sequence;
        this.f2145x1.f1096k4 = this;
        this.f2140jd = 0;
        setAfterAnimationColor(new ColorFormat(sequence.m2531x1().m249k4()));
        this.f2136ck = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        r4 = ((com.aspose.slides.Timing) r1.getTiming()).m3017k4() + r1.getTiming().getTriggerDelayTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a1, code lost:
    
        r4 = ((com.aspose.slides.Timing) r1.getTiming()).m3017k4();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e6, code lost:
    
        r4 = ((com.aspose.slides.Timing) r1.getTiming()).m3017k4() / 0.8f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0126, code lost:
    
        r4 = ((com.aspose.slides.Timing) r1.getTiming()).m3017k4() * 10.0f;
     */
    /* JADX INFO: renamed from: du */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private float m1360du() {
        IGenericEnumerator<IBehavior> it;
        int type = getType();
        if (type != 0) {
            float fM3017k4 = 0.0f;
            if (type == 13) {
                IGenericEnumerator<IBehavior> it2 = getBehaviors().iterator();
                while (true) {
                    try {
                        if (!it2.hasNext()) {
                            break;
                        }
                        IBehavior next = it2.next();
                        if (C7019kk.m27469x1(next, FilterEffect.class)) {
                            break;
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
                return fM3017k4;
            }
            if (type == 46) {
                IGenericEnumerator<IBehavior> it3 = getBehaviors().iterator();
                while (true) {
                    try {
                        if (!it3.hasNext()) {
                            break;
                        }
                        IBehavior next2 = it3.next();
                        if (C7019kk.m27469x1(next2, FilterEffect.class)) {
                            break;
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                            it3.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
                return fM3017k4;
            }
            if (type != 128) {
                if (type == 150) {
                    it = getBehaviors().iterator();
                    while (true) {
                        try {
                            if (!it.hasNext()) {
                                break;
                            }
                            IBehavior next3 = it.next();
                            if (C7019kk.m27469x1(next3, PropertyEffect.class)) {
                                break;
                            }
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                        }
                    }
                    return fM3017k4;
                }
                if (type != 8) {
                    if (type != 9) {
                        return ((Timing) getBehaviors().get_Item(getBehaviors().getCount() - 1).getTiming()).m3017k4();
                    }
                }
            }
            it = getBehaviors().iterator();
            while (true) {
                try {
                    if (!it.hasNext()) {
                        break;
                    }
                    IBehavior next4 = it.next();
                    if (C7019kk.m27469x1(next4, FilterEffect.class)) {
                        break;
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
            return fM3017k4;
        }
        Timing timing = (Timing) getBehaviors().get_Item(getBehaviors().getCount() - 1).getTiming();
        return timing.getTriggerDelayTime() + timing.m3017k4();
    }

    /* JADX INFO: renamed from: dy */
    private void m1362dy(float f) {
        float fM3017k4;
        float fM3017k42;
        float fM3017k43;
        IGenericEnumerator<IBehavior> it = getBehaviors().iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            try {
                IBehavior next = it.next();
                Timing timing = (Timing) next.getTiming();
                if (C7019kk.m27469x1(next, SetEffect.class)) {
                    timing.m3018k4(0.001f);
                    if (C14113y2.m67363du("hidden", (String) C7019kk.m27452k4(((ISetEffect) next).getTo(), String.class))) {
                        fM3017k4 = timing.m3017k4();
                        timing.setTriggerDelayTime(f - fM3017k4);
                    }
                } else {
                    if (C7019kk.m27469x1(next, FilterEffect.class)) {
                        timing.m3018k4((getPresetClassType() == 0 ? 0.29f : 0.09f) * f);
                        if (getPresetClassType() == 1) {
                            fM3017k4 = timing.m3017k4();
                            timing.setTriggerDelayTime(f - fM3017k4);
                        } else {
                            timing.setTriggerDelayTime(0.0f);
                        }
                    } else if (C7019kk.m27469x1(next, PropertyEffect.class)) {
                        if (i == 0) {
                            timing.m3018k4(0.91f * f);
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    timing.m3018k4(0.33f * f);
                                    if (getPresetClassType() == 0) {
                                        fM3017k43 = timing.m3017k4();
                                    }
                                } else {
                                    if (i != 3) {
                                        if (i == 4) {
                                            if (getPresetClassType() == 0) {
                                                timing.m3018k4(0.08f * f);
                                            } else {
                                                timing.m3018k4(0.165f * f);
                                            }
                                        } else if (i == 5) {
                                            timing.m3018k4(0.08f * f);
                                        } else if (i == 6) {
                                            timing.m3018k4(0.09f * f);
                                            fM3017k42 = timing.m3017k4();
                                            timing.setTriggerDelayTime(f - fM3017k42);
                                        }
                                        timing.setTriggerDelayTime(0.83f * f);
                                    } else if (getPresetClassType() == 0) {
                                        timing.m3018k4(0.165f * f);
                                    } else {
                                        timing.m3018k4(0.33f * f);
                                        fM3017k43 = timing.m3017k4();
                                    }
                                    timing.setTriggerDelayTime(0.66f * f);
                                }
                                timing.setTriggerDelayTime(fM3017k43);
                            } else if (getPresetClassType() == 0) {
                                timing.m3018k4(0.33f * f);
                            } else {
                                timing.m3018k4(0.09f * f);
                                fM3017k42 = timing.m3017k4();
                                timing.setTriggerDelayTime(f - fM3017k42);
                            }
                            i++;
                        }
                        timing.setTriggerDelayTime(0.0f);
                        i++;
                    } else if (C7019kk.m27469x1(next, ScaleEffect.class)) {
                        if (i2 == 0) {
                            timing.m3018k4(0.013f * f);
                            timing.setTriggerDelayTime(0.325f * f);
                        } else if (i2 == 1) {
                            timing.m3018k4(0.083f * f);
                            timing.setTriggerDelayTime(0.338f * f);
                        } else if (i2 == 2) {
                            timing.m3018k4(0.013f * f);
                            timing.setTriggerDelayTime(0.656f * f);
                        } else if (i2 == 3) {
                            timing.m3018k4(0.083f * f);
                            timing.setTriggerDelayTime(0.669f * f);
                        } else if (i2 == 4) {
                            timing.m3018k4(0.013f * f);
                            timing.setTriggerDelayTime(0.821f * f);
                        } else if (i2 == 5) {
                            timing.m3018k4(0.083f * f);
                            timing.setTriggerDelayTime(0.834f * f);
                        } else if (i2 == 6) {
                            timing.m3018k4(0.013f * f);
                            timing.setTriggerDelayTime(0.904f * f);
                        } else if (i2 == 7) {
                            timing.m3018k4(0.083f * f);
                            timing.setTriggerDelayTime(0.917f * f);
                        }
                        i2++;
                    }
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
    }

    /* JADX INFO: renamed from: h4 */
    private float m1363h4() {
        IGenericEnumerator<IBehavior> it;
        int type = getType();
        if (type != 3) {
            float fM3017k4 = 0.0f;
            if (type != 42) {
                if (type == 44 || type == 129) {
                    it = getBehaviors().iterator();
                    while (it.hasNext()) {
                        try {
                            IBehavior next = it.next();
                            if (C7019kk.m27469x1(next, ColorEffect.class) || C7019kk.m27469x1(next, PropertyEffect.class)) {
                                fM3017k4 += ((Timing) next.getTiming()).m3017k4();
                            }
                        } finally {
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return fM3017k4;
                }
                if (type != 140) {
                    if (type != 144) {
                        if (type != 145) {
                            return ((Timing) getBehaviors().get_Item(0).getTiming()).m3017k4();
                        }
                    }
                }
            }
            it = getBehaviors().iterator();
            while (it.hasNext()) {
                try {
                    IBehavior next2 = it.next();
                    if (!C7019kk.m27469x1(next2, FilterEffect.class) && !C7019kk.m27469x1(next2, SetEffect.class)) {
                    }
                    fM3017k4 = ((Timing) next2.getTiming()).m3017k4();
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            return fM3017k4;
        }
        Timing timing = (Timing) getBehaviors().get_Item(getBehaviors().getCount() - 1).getTiming();
        return timing.getTriggerDelayTime() + timing.m3017k4();
    }

    /* JADX INFO: renamed from: k4 */
    private byte m1365k4(int i) {
        byte b = 1;
        if (i != 1) {
            b = 2;
            if (i != 2) {
                b = 3;
                if (i != 3) {
                    b = 5;
                    if (i != 4) {
                        return i != 5 ? (byte) 0 : (byte) 4;
                    }
                }
            }
        }
        return b;
    }

    /* JADX INFO: renamed from: m9 */
    private void m1369m9(float f) {
        IGenericEnumerator<IBehavior> it = getBehaviors().iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                IBehavior next = it.next();
                Timing timing = (Timing) next.getTiming();
                if (C7019kk.m27469x1(next, SetEffect.class)) {
                    timing.m3018k4(0.001f);
                    if (C14113y2.m67363du("hidden", (String) C7019kk.m27452k4(((ISetEffect) next).getTo(), String.class))) {
                        timing.setTriggerDelayTime(f - timing.m3017k4());
                    }
                } else {
                    float f2 = 0.0f;
                    if (C7019kk.m27469x1(next, FilterEffect.class)) {
                        timing.m3018k4(f);
                        timing.setTriggerDelayTime(0.0f);
                    } else if (C7019kk.m27469x1(next, PropertyEffect.class)) {
                        if (i == 0 || i == 4) {
                            timing.m3018k4(0.5f * f);
                            timing.setTriggerDelayTime(0.0f);
                        } else if (i == 1 || i == 5) {
                            timing.m3018k4(f * 0.5f);
                            if (getPresetClassType() != 0) {
                                f2 = 0.5f;
                            }
                            timing.setTriggerDelayTime(f2 * f);
                        } else if (i == 2 || i == 6) {
                            timing.m3018k4(0.5f * f);
                            timing.setTriggerDelayTime(f - timing.m3017k4());
                        } else if (i == 3) {
                            timing.m3018k4(f);
                        }
                        i++;
                    }
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
    }

    @Override // com.aspose.slides.IEffect
    public final IColorFormat getAfterAnimationColor() {
        return this.f2139h4;
    }

    @Override // com.aspose.slides.IEffect
    public final int getAfterAnimationType() {
        return this.f2140jd;
    }

    @Override // com.aspose.slides.IEffect
    public final int getAnimateTextType() {
        return this.f2136ck;
    }

    @Override // com.aspose.slides.IEffect
    public final IBehaviorCollection getBehaviors() {
        return this.f2145x1;
    }

    @Override // com.aspose.slides.IEffect
    public final float getDelayBetweenTextParts() {
        return this.f2143m9;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return null;
    }

    @Override // com.aspose.slides.IEffect
    public final int getPresetClassType() {
        return m1375kk().m7587up();
    }

    @Override // com.aspose.slides.IEffect
    public final ISequence getSequence() {
        return this.f2141k4;
    }

    @Override // com.aspose.slides.IEffect
    public final IAudio getSound() {
        return this.f2138dy.m7583rv();
    }

    @Override // com.aspose.slides.IEffect
    public final boolean getStopPreviousSound() {
        return this.f2138dy.m7594x6();
    }

    @Override // com.aspose.slides.IEffect
    public final int getSubtype() {
        return m1375kk().m7578ks();
    }

    @Override // com.aspose.slides.IEffect
    public final IShape getTargetShape() {
        return m1375kk().m7584to();
    }

    @Override // com.aspose.slides.IEffect
    public final ITextAnimation getTextAnimation() {
        return m1375kk().m7554du();
    }

    @Override // com.aspose.slides.IEffect
    public final ITiming getTiming() {
        return this.f2142kk;
    }

    @Override // com.aspose.slides.IEffect
    public final int getType() {
        return m1375kk().m7595yj();
    }

    /* JADX INFO: renamed from: kk */
    public final C1243i8 m1375kk() {
        return this.f2138dy;
    }

    @Override // com.aspose.slides.IEffect
    public final void setAfterAnimationColor(IColorFormat iColorFormat) {
        this.f2139h4 = iColorFormat;
    }

    @Override // com.aspose.slides.IEffect
    public final void setAfterAnimationType(int i) {
        this.f2140jd = i;
        if (i != 1) {
            ((ColorFormat) getAfterAnimationColor()).m1071dy();
        }
    }

    @Override // com.aspose.slides.IEffect
    public final void setAnimateTextType(int i) {
        this.f2136ck = i;
        if (i == 0) {
            setDelayBetweenTextParts(0.0f);
        }
    }

    @Override // com.aspose.slides.IEffect
    public final void setBehaviors(IBehaviorCollection iBehaviorCollection) {
        this.f2145x1 = (BehaviorCollection) iBehaviorCollection;
    }

    @Override // com.aspose.slides.IEffect
    public final void setDelayBetweenTextParts(float f) {
        this.f2143m9 = f;
    }

    @Override // com.aspose.slides.IEffect
    public final void setPresetClassType(int i) {
        m1375kk().m7575kk(i);
        Effect effectM2529k4 = this.f2141k4.m2529k4(m1375kk().m7584to(), m1375kk().m7595yj(), m1375kk().m7578ks(), m1375kk().m7587up(), getTiming().getTriggerType());
        this.f2145x1.clear();
        this.f2145x1 = effectM2529k4.f2145x1;
        m1375kk().m7593x1(effectM2529k4.m1375kk().m7553ck());
        m1375kk().m7565k4(m1365k4(i));
        ((Timing) getTiming()).m3019k4(((Timing) effectM2529k4.getTiming()).m3021x1());
        this.f2141k4.remove(effectM2529k4);
    }

    @Override // com.aspose.slides.IEffect
    public final void setSound(IAudio iAudio) {
        this.f2138dy.m7567k4(iAudio);
        this.f2138dy.m7571k4((com.aspose.slides.internal.p332p7.rqz) null);
        if (iAudio != null) {
            this.f2138dy.m7576kk(false);
        }
    }

    @Override // com.aspose.slides.IEffect
    public final void setStopPreviousSound(boolean z) {
        this.f2138dy.m7576kk(z);
        this.f2138dy.m7571k4((com.aspose.slides.internal.p332p7.rqz) null);
        if (z) {
            this.f2138dy.m7567k4((IAudio) null);
        }
    }

    @Override // com.aspose.slides.IEffect
    public final void setSubtype(int i) {
        m1375kk().m7555du(i);
        Effect effectM2529k4 = this.f2141k4.m2529k4(m1375kk().m7584to(), m1375kk().m7595yj(), m1375kk().m7578ks(), m1375kk().m7587up(), getTiming().getTriggerType());
        this.f2145x1.clear();
        this.f2145x1 = effectM2529k4.f2145x1;
        m1375kk().m7593x1(effectM2529k4.m1375kk().m7553ck());
        ((Timing) getTiming()).m3019k4(((Timing) effectM2529k4.getTiming()).m3021x1());
        this.f2141k4.remove(effectM2529k4);
    }

    @Override // com.aspose.slides.IEffect
    public final void setTiming(ITiming iTiming) {
        this.f2142kk = (Timing) iTiming;
    }

    @Override // com.aspose.slides.IEffect
    public final void setType(int i) {
        m1375kk().m7585to(i);
        Effect effect = (Effect) this.f2141k4.addEffect(m1375kk().m7584to(), m1375kk().m7595yj(), 0, getTiming().getTriggerType());
        this.f2145x1.clear();
        this.f2145x1 = effect.f2145x1;
        m1375kk().m7593x1(effect.m1375kk().m7553ck());
        m1375kk().m7575kk(effect.m1375kk().m7587up());
        m1375kk().m7555du(effect.m1375kk().m7578ks());
        m1375kk().m7565k4(m1365k4(m1375kk().m7587up()));
        ((Timing) getTiming()).m3019k4(((Timing) effect.getTiming()).m3021x1());
        this.f2141k4.remove(effect);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        r3 = ((com.aspose.slides.Timing) r1.getTiming()).m3017k4() + r1.getTiming().getTriggerDelayTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a7, code lost:
    
        r0 = ((com.aspose.slides.Timing) r3.getTiming()).m3017k4();
     */
    /* JADX INFO: renamed from: to */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m1376to() {
        IGenericEnumerator<IBehavior> it;
        float fM3017k4;
        if (getPresetClassType() == 0) {
            return m1360du();
        }
        if (getPresetClassType() == 1) {
            it = getBehaviors().iterator();
            while (true) {
                try {
                    if (!it.hasNext()) {
                        fM3017k4 = 0.0f;
                        break;
                    }
                    IBehavior next = it.next();
                    if (C7019kk.m27469x1(next, SetEffect.class) && C14113y2.m67363du("hidden", (String) C7019kk.m27452k4(((ISetEffect) next).getTo(), String.class))) {
                        break;
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            return fM3017k4;
        }
        if (getPresetClassType() == 2) {
            return m1363h4();
        }
        if (getPresetClassType() != 3) {
            return this.f2142kk.m3017k4();
        }
        float fM3017k42 = this.f2142kk.m3017k4();
        it = getBehaviors().iterator();
        while (true) {
            try {
                if (!it.hasNext()) {
                    break;
                }
                IBehavior next2 = it.next();
                if (C7019kk.m27469x1(next2, MotionEffect.class)) {
                    break;
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
        return fM3017k42;
    }

    /* JADX INFO: renamed from: x1 */
    public final Paragraph m1377x1() {
        int i;
        ParagraphCollection paragraphCollection = this.f2135c5;
        if (paragraphCollection == null || (i = this.f2137du) <= -1) {
            return null;
        }
        return (Paragraph) paragraphCollection.get_Item(i);
    }

    /* JADX INFO: renamed from: du */
    private void m1361du(float f) {
        float fM3017k4;
        float fM3017k42;
        IGenericEnumerator<IBehavior> it = getBehaviors().iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                IBehavior next = it.next();
                Timing timing = (Timing) next.getTiming();
                if (C7019kk.m27469x1(next, SetEffect.class)) {
                    timing.m3018k4(0.001f);
                    if (C14113y2.m67363du("hidden", (String) C7019kk.m27452k4(((ISetEffect) next).getTo(), String.class))) {
                        fM3017k4 = timing.m3017k4();
                        timing.setTriggerDelayTime(f - fM3017k4);
                    }
                } else {
                    if (C7019kk.m27469x1(next, FilterEffect.class)) {
                        timing.m3018k4(0.8f * f);
                        if (getPresetClassType() == 1) {
                            fM3017k4 = timing.m3017k4();
                            timing.setTriggerDelayTime(f - fM3017k4);
                        }
                    } else if (C7019kk.m27469x1(next, PropertyEffect.class)) {
                        if (i == 0) {
                            timing.m3018k4(0.8f * f);
                            if (getPresetClassType() == 1) {
                                fM3017k42 = timing.m3017k4();
                                timing.setTriggerDelayTime(f - fM3017k42);
                            }
                            i++;
                        } else if (i < 3) {
                            if (getPresetClassType() != 0) {
                                f = 0.2f;
                            }
                            timing.m3018k4(f * f);
                            i++;
                        } else {
                            timing.m3018k4((getPresetClassType() == 0 ? 0.2f : 0.8f) * f);
                            fM3017k42 = timing.m3017k4();
                            timing.setTriggerDelayTime(f - fM3017k42);
                            i++;
                        }
                    }
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
    }

    /* JADX INFO: renamed from: h4 */
    private void m1364h4(float f) {
        float fM3017k4;
        float fM3017k42;
        IGenericEnumerator<IBehavior> it = getBehaviors().iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            try {
                IBehavior next = it.next();
                Timing timing = (Timing) next.getTiming();
                float f2 = 0.0f;
                if (C7019kk.m27469x1(next, SetEffect.class)) {
                    String str = (String) C7019kk.m27452k4(((ISetEffect) next).getTo(), String.class);
                    if (C14113y2.m67363du("hidden", str)) {
                        timing.m3018k4(0.001f);
                        timing.setTriggerDelayTime(f - timing.m3017k4());
                    } else if (C14113y2.m67363du("visible", str)) {
                        timing.m3018k4(0.001f);
                        timing.setTriggerDelayTime(0.0f);
                    } else {
                        timing.m3018k4(0.385f * f);
                    }
                } else if (C7019kk.m27469x1(next, FilterEffect.class)) {
                    timing.m3018k4(0.385f * f);
                    if (getPresetClassType() != 0) {
                        f2 = 0.615f;
                    }
                    timing.setTriggerDelayTime(f2 * f);
                } else if (C7019kk.m27469x1(next, ScaleEffect.class)) {
                    if (i == 0) {
                        timing.m3018k4(0.385f * f);
                        if (getPresetClassType() == 1) {
                            fM3017k4 = timing.m3017k4();
                            timing.setTriggerDelayTime(f - fM3017k4);
                        }
                        i++;
                    } else {
                        timing.m3018k4(0.615f * f);
                        if (getPresetClassType() == 0) {
                            fM3017k4 = timing.m3017k4();
                            timing.setTriggerDelayTime(f - fM3017k4);
                        }
                        i++;
                    }
                } else if (C7019kk.m27469x1(next, PropertyEffect.class)) {
                    if (i2 == 0 || i2 == 2) {
                        timing.m3018k4(0.615f * f);
                        if (getPresetClassType() == 0) {
                            fM3017k42 = timing.m3017k4();
                            timing.setTriggerDelayTime(f - fM3017k42);
                        }
                        i2++;
                    } else {
                        if (i2 == 1 || i2 == 3) {
                            timing.m3018k4((getPresetClassType() == 0 ? 0.615f : 0.385f) * f);
                            fM3017k42 = timing.m3017k4();
                            timing.setTriggerDelayTime(f - fM3017k42);
                        }
                        i2++;
                    }
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
    }

    /* JADX INFO: renamed from: kk */
    private void m1368kk(float f) {
        IGenericEnumerator<IBehavior> it = getBehaviors().iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                IBehavior next = it.next();
                Timing timing = (Timing) next.getTiming();
                if (C7019kk.m27469x1(next, SetEffect.class)) {
                    timing.m3018k4(0.001f);
                    if (C14113y2.m67363du("hidden", (String) C7019kk.m27452k4(((ISetEffect) next).getTo(), String.class))) {
                        timing.setTriggerDelayTime(f - timing.m3017k4());
                    }
                } else if (C7019kk.m27469x1(next, FilterEffect.class)) {
                    timing.m3018k4(f);
                } else if (C7019kk.m27469x1(next, PropertyEffect.class)) {
                    if (i == 0) {
                        timing.m3018k4(f);
                    } else {
                        if (i == 1) {
                            timing.m3018k4((getPresetClassType() == 0 ? 0.9f : 0.1f) * f);
                        } else {
                            timing.m3018k4((getPresetClassType() == 1 ? 0.9f : 0.1f) * f);
                            timing.setTriggerDelayTime(f - timing.m3017k4());
                        }
                    }
                    i++;
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
    }

    /* JADX INFO: renamed from: to */
    private void m1370to(float f) {
        float fM3017k4;
        IGenericEnumerator<IBehavior> it = getBehaviors().iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                IBehavior next = it.next();
                Timing timing = (Timing) next.getTiming();
                if (C7019kk.m27469x1(next, SetEffect.class)) {
                    timing.m3018k4(0.001f);
                    if (C14113y2.m67363du("hidden", (String) C7019kk.m27452k4(((ISetEffect) next).getTo(), String.class))) {
                        fM3017k4 = timing.m3017k4();
                        timing.setTriggerDelayTime(f - fM3017k4);
                    }
                } else if (C7019kk.m27469x1(next, FilterEffect.class)) {
                    timing.m3018k4(0.1f * f);
                    if (getPresetClassType() == 1) {
                        fM3017k4 = timing.m3017k4();
                        timing.setTriggerDelayTime(f - fM3017k4);
                    }
                } else if (C7019kk.m27469x1(next, PropertyEffect.class)) {
                    float f2 = 0.0f;
                    if (i == 0) {
                        timing.m3018k4((getPresetClassType() == 0 ? 0.4f : 0.6f) * f);
                        if (getPresetClassType() == 1) {
                            timing.setTriggerDelayTime(f2);
                        }
                        i++;
                    } else {
                        if (i == 1) {
                            timing.m3018k4(0.4f * f);
                            if (getPresetClassType() == 1) {
                                timing.setTriggerDelayTime(f - timing.m3017k4());
                            }
                        } else if (i == 2) {
                            timing.m3018k4(0.6f * f);
                            if (getPresetClassType() == 0) {
                                f2 = f * 0.4f;
                            }
                            timing.setTriggerDelayTime(f2);
                        } else {
                            timing.m3018k4((getPresetClassType() == 0 ? 0.6f : 0.4f) * f);
                            timing.setTriggerDelayTime((getPresetClassType() == 0 ? 0.4f : 0.6f) * f);
                        }
                        i++;
                    }
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
    }

    /* JADX INFO: renamed from: x1 */
    private void m1371x1(float f) {
        IGenericEnumerator<IBehavior> it;
        IGenericEnumerator<IBehavior> it2;
        boolean zM27456k4;
        int type = getType();
        int i = 0;
        float f2 = 0.0f;
        if (type == 3) {
            it = getBehaviors().iterator();
            while (it.hasNext()) {
                try {
                    IBehavior next = it.next();
                    Timing timing = (Timing) next.getTiming();
                    if (C7019kk.m27469x1(next, SetEffect.class) || C7019kk.m27469x1(next, ColorEffect.class)) {
                        timing.m3018k4(0.95f * f);
                        timing.setTriggerDelayTime(f - timing.m3017k4());
                    } else if (C7019kk.m27469x1(next, ScaleEffect.class)) {
                        if (i == 0) {
                            timing.m3018k4(f * 0.1f);
                            timing.setTriggerDelayTime(0.0f);
                        } else if (i < 1) {
                            timing.m3018k4(f * 0.1f);
                            timing.setTriggerDelayTime(timing.m3017k4());
                        } else {
                            timing.m3018k4(0.3f * f);
                            timing.setTriggerDelayTime(f - timing.m3017k4());
                        }
                        i++;
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
                return;
            }
            return;
        }
        if (type != 42) {
            if (type == 44 || type == 129) {
                it2 = getBehaviors().iterator();
                while (it2.hasNext()) {
                    try {
                        ((Timing) it2.next().getTiming()).m3018k4(f * 0.5f);
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                    return;
                }
                return;
            }
            if (type == 140) {
                float f3 = 0.2f * f;
                float fM3017k4 = f3;
                while (i < getBehaviors().getCount()) {
                    Timing timing2 = (Timing) getBehaviors().get_Item(i).getTiming();
                    if (i == 0) {
                        timing2.m3018k4(f * 0.1f);
                    } else {
                        timing2.m3018k4(f3);
                        timing2.setTriggerDelayTime(fM3017k4);
                        fM3017k4 += timing2.m3017k4();
                    }
                    i++;
                }
                return;
            }
            if (type != 144) {
                if (type != 145) {
                    it2 = getBehaviors().iterator();
                    while (it2.hasNext()) {
                        try {
                            ((Timing) it2.next().getTiming()).m3018k4(f);
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                it2.dispose();
                            }
                        }
                    }
                    if (zM27456k4) {
                        return;
                    } else {
                        return;
                    }
                }
                it = getBehaviors().iterator();
                while (it.hasNext()) {
                    try {
                        IBehavior next2 = it.next();
                        Timing timing3 = (Timing) next2.getTiming();
                        if (C7019kk.m27469x1(next2, MotionEffect.class)) {
                            timing3.m3018k4(f * 0.5f);
                        } else if (C7019kk.m27469x1(next2, RotationEffect.class)) {
                            float f4 = 0.25f * f;
                            timing3.m3018k4(f4);
                            timing3.setTriggerDelayTime(f2);
                            f2 += f4;
                        }
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                    return;
                }
                return;
            }
        }
        it = getBehaviors().iterator();
        while (it.hasNext()) {
            try {
                IBehavior next3 = it.next();
                if (C7019kk.m27469x1(next3, FilterEffect.class) || C7019kk.m27469x1(next3, SetEffect.class)) {
                    ((Timing) next3.getTiming()).m3018k4(f);
                } else if (C7019kk.m27469x1(next3, ScaleEffect.class) || C7019kk.m27469x1(next3, ColorEffect.class)) {
                    ((Timing) next3.getTiming()).m3018k4(f * 0.5f);
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final Paragraph m1372k4() {
        int i;
        ParagraphCollection paragraphCollection = this.f2135c5;
        if (paragraphCollection == null || (i = this.f2144to) <= -1) {
            return null;
        }
        return (Paragraph) paragraphCollection.get_Item(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1373k4(float f) {
        IGenericEnumerator<IBehavior> it;
        if (getPresetClassType() >= 2) {
            if (getPresetClassType() == 2) {
                m1371x1(f);
                return;
            }
            if (getPresetClassType() != 3) {
                this.f2142kk.m3018k4(f);
                return;
            }
            it = getBehaviors().iterator();
            while (it.hasNext()) {
                try {
                    IBehavior next = it.next();
                    if (C7019kk.m27469x1(next, MotionEffect.class)) {
                        ((Timing) next.getTiming()).m3018k4(f);
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
                return;
            }
            return;
        }
        int type = getType();
        if (type == 8) {
            m1369m9(f);
            return;
        }
        if (type == 9) {
            m1362dy(f);
            return;
        }
        if (type == 13) {
            m1370to(f);
            return;
        }
        if (type == 46) {
            m1361du(f);
            return;
        }
        if (type == 128) {
            m1368kk(f);
            return;
        }
        if (type == 150) {
            m1364h4(f);
            return;
        }
        it = getBehaviors().iterator();
        while (it.hasNext()) {
            try {
                IBehavior next2 = it.next();
                Timing timing = (Timing) next2.getTiming();
                if (C7019kk.m27469x1(next2, ISetEffect.class)) {
                    timing.setDuration(0.001f);
                    if (C14113y2.m67363du("hidden", (String) C7019kk.m27452k4(((ISetEffect) next2).getTo(), String.class)) || getType() == 0) {
                        timing.setTriggerDelayTime(f - timing.m3017k4());
                    }
                } else {
                    timing.setDuration(f);
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1374k4(int i, int i2, ParagraphCollection paragraphCollection) {
        if (paragraphCollection == null) {
            return;
        }
        this.f2144to = i;
        this.f2137du = i2;
        this.f2135c5 = paragraphCollection;
        paragraphCollection.f2958x1.mo27432x1(new AbstractC14049c6<bjb>() { // from class: com.aspose.slides.Effect.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Animation.Effect.OnParagraphRemoved(System.Object,Aspose.Slides.ParagraphEventArgs)";
            }

            @Override // com.aspose.slides.p559ms.System.AbstractC14049c6
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public void mo1379k4(Object obj, bjb bjbVar) {
                Effect.this.m1367k4(obj, bjbVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public void m1367k4(Object obj, bjb bjbVar) {
        int count;
        if (C14067j2.m66729x1((ParagraphCollection) obj, this.f2135c5)) {
            if (this.f2135c5.getCount() == 0) {
                count = -1;
                this.f2144to = -1;
            } else {
                int i = this.f2144to;
                if (i < 0) {
                    this.f2144to = 0;
                } else if (i > this.f2135c5.getCount() - 1) {
                    this.f2144to = this.f2135c5.getCount() - 1;
                }
                int i2 = this.f2137du;
                if (i2 < 0) {
                    this.f2137du = 0;
                    return;
                } else if (i2 <= this.f2135c5.getCount() - 1) {
                    return;
                } else {
                    count = this.f2135c5.getCount() - 1;
                }
            }
            this.f2137du = count;
        }
    }
}
