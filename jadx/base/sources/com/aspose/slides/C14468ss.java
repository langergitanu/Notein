package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p332p7.C7270as;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7543ea;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.C14042ak;

/* JADX INFO: renamed from: com.aspose.slides.ss */
/* JADX INFO: loaded from: classes3.dex */
class C14468ss {

    /* JADX INFO: renamed from: k4 */
    private static final Dictionary<String, k4> f48911k4;

    /* JADX INFO: renamed from: com.aspose.slides.ss$k4 */
    public static abstract class k4 extends AbstractC14085qw {
        private k4() {
        }

        /* JADX INFO: renamed from: k4 */
        public abstract cl1 mo70760k4(Effect effect, C7394ca c7394ca, c0z c0zVar);
    }

    static {
        Dictionary<String, k4> dictionary = new Dictionary<>();
        f48911k4 = dictionary;
        dictionary.set_Item("set", new k4() { // from class: com.aspose.slides.ss.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.OdpSerialization.PartParser.Animation.AnimBehaviorOdpDeserialization.CreateSet(Aspose.Slides.Animation.Effect,Aspose.Slides.PptxSerialization.PartParser.XmlParser.NamedObject,Aspose.Slides.OdpSerialization.OdpAnimDeserializationContext)";
            }

            @Override // com.aspose.slides.C14468ss.k4
            /* JADX INFO: renamed from: k4 */
            public cl1 mo70760k4(Effect effect, C7394ca c7394ca, c0z c0zVar) {
                return C14468ss.m70751h4(effect, c7394ca, c0zVar);
            }
        });
        dictionary.set_Item("animateColor", new k4() { // from class: com.aspose.slides.ss.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.OdpSerialization.PartParser.Animation.AnimBehaviorOdpDeserialization.CreateAnimColor(Aspose.Slides.Animation.Effect,Aspose.Slides.PptxSerialization.PartParser.XmlParser.NamedObject,Aspose.Slides.OdpSerialization.OdpAnimDeserializationContext)";
            }

            @Override // com.aspose.slides.C14468ss.k4
            /* JADX INFO: renamed from: k4 */
            public cl1 mo70760k4(Effect effect, C7394ca c7394ca, c0z c0zVar) {
                return C14468ss.m70756m9(effect, c7394ca, c0zVar);
            }
        });
        dictionary.set_Item("animate", new k4() { // from class: com.aspose.slides.ss.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.OdpSerialization.PartParser.Animation.AnimBehaviorOdpDeserialization.CreateAnim(Aspose.Slides.Animation.Effect,Aspose.Slides.PptxSerialization.PartParser.XmlParser.NamedObject,Aspose.Slides.OdpSerialization.OdpAnimDeserializationContext)";
            }

            @Override // com.aspose.slides.C14468ss.k4
            /* JADX INFO: renamed from: k4 */
            public cl1 mo70760k4(Effect effect, C7394ca c7394ca, c0z c0zVar) {
                return C14468ss.m70750dy(effect, c7394ca, c0zVar);
            }
        });
        dictionary.set_Item("transitionFilter", new k4() { // from class: com.aspose.slides.ss.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.OdpSerialization.PartParser.Animation.AnimBehaviorOdpDeserialization.CreateTransitionFilter(Aspose.Slides.Animation.Effect,Aspose.Slides.PptxSerialization.PartParser.XmlParser.NamedObject,Aspose.Slides.OdpSerialization.OdpAnimDeserializationContext)";
            }

            @Override // com.aspose.slides.C14468ss.k4
            /* JADX INFO: renamed from: k4 */
            public cl1 mo70760k4(Effect effect, C7394ca c7394ca, c0z c0zVar) {
                return C14468ss.m70748c5(effect, c7394ca, c0zVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c5 */
    public static cl1 m70748c5(Effect effect, C7394ca c7394ca, c0z c0zVar) {
        com.aspose.slides.internal.p332p7.d5a d5aVar = (com.aspose.slides.internal.p332p7.d5a) c7394ca.m29542x1();
        IFilterEffect iFilterEffectCreateFilterEffect = ((Sequence) effect.getSequence()).m2530k4().m6566jd().createFilterEffect();
        cl1 cl1Var = new cl1(d5aVar, iFilterEffectCreateFilterEffect);
        C14746wp.m72856k4(iFilterEffectCreateFilterEffect, cl1Var, c0zVar);
        return cl1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: dy */
    public static cl1 m70750dy(Effect effect, C7394ca c7394ca, c0z c0zVar) {
        C7543ea c7543ea = (C7543ea) c7394ca.m29542x1();
        IPropertyEffect iPropertyEffectCreatePropertyEffect = ((Sequence) effect.getSequence()).m2530k4().m6566jd().createPropertyEffect();
        cl1 cl1Var = new cl1(c7543ea, iPropertyEffectCreatePropertyEffect);
        C14746wp.m72857k4(iPropertyEffectCreatePropertyEffect, cl1Var, c0zVar);
        C14746wp.m72858k4(iPropertyEffectCreatePropertyEffect, c7543ea, c0zVar);
        return cl1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public static cl1 m70751h4(Effect effect, C7394ca c7394ca, c0z c0zVar) {
        ISetEffect iSetEffectCreateSetEffect = ((Sequence) effect.getSequence()).m2530k4().m6566jd().createSetEffect();
        cl1 cl1Var = new cl1((com.aspose.slides.internal.p332p7.ett) c7394ca.m29542x1(), iSetEffectCreateSetEffect);
        C14746wp.m72859k4(iSetEffectCreateSetEffect, cl1Var, c0zVar);
        return cl1Var;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte m70752k4(int i) {
        if (i == 0) {
            return (byte) -1;
        }
        if (i == 1) {
            return (byte) 0;
        }
        if (i == 2) {
            return (byte) 1;
        }
        throw new ArgumentOutOfRangeException("value", C14042ak.m66410k4(com.aspose.slides.internal.p332p7.lt4.class, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m9 */
    public static cl1 m70756m9(Effect effect, C7394ca c7394ca, c0z c0zVar) {
        return new cl1((C7270as) c7394ca.m29542x1(), ((Sequence) effect.getSequence()).m2530k4().m6566jd().createColorEffect());
    }

    /* JADX INFO: renamed from: x1 */
    public static int m70758x1(int i) {
        if (i == 0) {
            return -1;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 2;
        }
        throw new ArgumentOutOfRangeException("value", C14042ak.m66410k4(com.aspose.slides.internal.p332p7.agf.class, i));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70753k4(Effect effect, C7394ca c7394ca, c0z c0zVar) {
        if (effect == null) {
            throw new ArgumentNullException("effect");
        }
        if (c7394ca == null) {
            throw new ArgumentNullException("namedObject");
        }
        Dictionary<String, k4> dictionary = f48911k4;
        if (dictionary.containsKey(c7394ca.m29539k4())) {
            cl1 cl1VarMo70760k4 = dictionary.get_Item(c7394ca.m29539k4()).mo70760k4(effect, c7394ca, c0zVar);
            ((Behavior) cl1VarMo70760k4.m4632ne()).mo424k4().m72016k4(effect);
            effect.getBehaviors().add(cl1VarMo70760k4.m4632ne());
            m70754k4(cl1VarMo70760k4);
            if (effect.m1375kk().m7584to() == null) {
                C13742kp.m64089k4(effect, cl1VarMo70760k4.m4628k4(), c0zVar);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m70754k4(cl1 cl1Var) {
        IBehavior iBehaviorM4632ne = cl1Var.m4632ne();
        Timing timing = (Timing) iBehaviorM4632ne.getTiming();
        timing.m3018k4(s8r.m70490k4(cl1Var.m4631m9()) >= 0.001f ? s8r.m70490k4(cl1Var.m4631m9()) : 0.0f);
        if (wgi.m72731kk(cl1Var.m4626h4())) {
            timing.setTriggerDelayTime(s8r.m70490k4(cl1Var.m4626h4()));
        }
        timing.setAccelerate((float) cl1Var.m4625fa());
        timing.setDecelerate((float) cl1Var.m4635up());
        timing.setAutoReverse(cl1Var.m4638yj());
        timing.setRepeatCount(s8r.m70494x1(cl1Var.m4621c5(), 1.0f));
        timing.setRepeatDuration(s8r.m70491k4(cl1Var.m4624dy(), Float.NaN));
        timing.setRestart(C1145gi.m6676k4(cl1Var.m4627jd()));
        timing.m3019k4(C1145gi.m6686x1(cl1Var.m4622ck()));
        iBehaviorM4632ne.setAdditive(m70758x1(cl1Var.m4633rv()));
        iBehaviorM4632ne.setAccumulate(m70752k4(cl1Var.m4630ks()));
    }
}
