package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C8115ko;
import com.aspose.slides.internal.p332p7.C8142kw;
import com.aspose.slides.internal.p332p7.C8395ny;
import com.aspose.slides.internal.p332p7.C8490p3;
import com.aspose.slides.internal.p332p7.C8964ul;
import com.aspose.slides.internal.p332p7.C9108wg;
import com.aspose.slides.internal.p332p7.C9199xh;
import com.aspose.slides.internal.p332p7.C9314yu;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.gq */
/* JADX INFO: loaded from: classes3.dex */
class C1158gq {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f5319k4 = new C7017h4("effectLst", "effectDag");

    /* JADX INFO: renamed from: com.aspose.slides.gq$k4 */
    public static abstract class k4 extends AbstractC14085qw {
        /* JADX INFO: renamed from: k4 */
        public abstract IEffectFormat mo3774k4();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6877k4(IEffectFormat iEffectFormat, C7394ca.k4 k4Var, u8s u8sVar) {
        if (iEffectFormat == null) {
            return;
        }
        EffectFormat effectFormat = (EffectFormat) iEffectFormat;
        if (effectFormat.m2138ix() && effectFormat.isNoEffects()) {
            effectFormat.m1385du();
        }
        if (effectFormat.m1390to()) {
            m6879k4(iEffectFormat, (C8490p3) k4Var.mo2788k4("effectLst").m29542x1(), u8sVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6878k4(final IEffectFormat iEffectFormat, C7394ca c7394ca, gnb gnbVar) {
        m6880k4(new k4() { // from class: com.aspose.slides.gq.1
            @Override // com.aspose.slides.C1158gq.k4
            /* JADX INFO: renamed from: k4 */
            public IEffectFormat mo3774k4() {
                return iEffectFormat;
            }
        }, c7394ca, gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6879k4(IEffectFormat iEffectFormat, final C8490p3 c8490p3, u8s u8sVar) {
        if (iEffectFormat == null || !((EffectFormat) iEffectFormat).m1390to()) {
            return;
        }
        if (iEffectFormat.getBlurEffect() != null) {
            C8142kw c8142kwM38598k4 = c8490p3.m38598k4();
            c8142kwM38598k4.m35757k4(iEffectFormat.getBlurEffect().getRadius());
            c8142kwM38598k4.m35758k4(iEffectFormat.getBlurEffect().getGrow());
        }
        C14489t7.m70979k4(iEffectFormat.getFillOverlayEffect(), new AbstractC4685kk<C8964ul>() { // from class: com.aspose.slides.gq.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8490p3) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_EffectListElementData.AddFillOverlay()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8964ul invoke() {
                return c8490p3.m38605x1();
            }
        }, u8sVar);
        C14261oz.m68916k4(iEffectFormat.getGlowEffect(), new AbstractC4685kk<C8395ny>() { // from class: com.aspose.slides.gq.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8490p3) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_EffectListElementData.AddGlow()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8395ny invoke() {
                return c8490p3.m38599kk();
            }
        });
        s3f.m70436k4(iEffectFormat.getInnerShadowEffect(), new AbstractC4685kk<C9108wg>() { // from class: com.aspose.slides.gq.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8490p3) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_EffectListElementData.AddInnerShdw()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C9108wg invoke() {
                return c8490p3.m38603to();
            }
        });
        uyw.m71993k4(iEffectFormat.getOuterShadowEffect(), new AbstractC4685kk<C9314yu>() { // from class: com.aspose.slides.gq.5
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8490p3) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_EffectListElementData.AddOuterShdw()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C9314yu invoke() {
                return c8490p3.m38593du();
            }
        });
        w7y.m72648k4(iEffectFormat.getPresetShadowEffect(), new AbstractC4685kk<C8115ko>() { // from class: com.aspose.slides.gq.6
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8490p3) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_EffectListElementData.AddPrstShdw()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8115ko invoke() {
                return c8490p3.m38596h4();
            }
        });
        akh.m3655k4(iEffectFormat.getReflectionEffect(), new AbstractC4685kk<C9199xh>() { // from class: com.aspose.slides.gq.7
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8490p3) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_EffectListElementData.AddReflection()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C9199xh invoke() {
                return c8490p3.m38601m9();
            }
        });
        if (iEffectFormat.getSoftEdgeEffect() != null) {
            c8490p3.m38594dy().m38236k4(iEffectFormat.getSoftEdgeEffect().getRadius());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6880k4(k4 k4Var, C7394ca c7394ca, gnb gnbVar) {
        if (c7394ca == null) {
            return;
        }
        IEffectFormat iEffectFormatMo3774k4 = k4Var.mo3774k4();
        int iM27428k4 = f5319k4.m27428k4(c7394ca.m29539k4());
        if (iM27428k4 != 0) {
            if (iM27428k4 != 1) {
                throw new Exception(C14113y2.m67408k4("Unknown element \"", c7394ca.m29539k4(), "\""));
            }
            return;
        }
        C8490p3 c8490p3 = (C8490p3) c7394ca.m29542x1();
        if (c8490p3.m38591c5() != null) {
            iEffectFormatMo3774k4.setBlurEffect(c8490p3.m38591c5().m35756k4(), c8490p3.m38591c5().m35759x1());
        }
        if (c8490p3.m38597jd() != null) {
            iEffectFormatMo3774k4.enableFillOverlayEffect();
            C14489t7.m70980k4(iEffectFormatMo3774k4.getFillOverlayEffect(), c8490p3.m38597jd(), gnbVar);
        }
        if (c8490p3.m38592ck() != null) {
            iEffectFormatMo3774k4.enableGlowEffect();
            C14261oz.m68917k4(iEffectFormatMo3774k4.getGlowEffect(), c8490p3.m38592ck());
        }
        if (c8490p3.m38595fa() != null) {
            iEffectFormatMo3774k4.enableInnerShadowEffect();
            s3f.m70437k4(iEffectFormatMo3774k4.getInnerShadowEffect(), c8490p3.m38595fa());
        }
        if (c8490p3.m38604up() != null) {
            iEffectFormatMo3774k4.enableOuterShadowEffect();
            uyw.m71994k4(iEffectFormatMo3774k4.getOuterShadowEffect(), c8490p3.m38604up());
        }
        if (c8490p3.m38606yj() != null) {
            iEffectFormatMo3774k4.enablePresetShadowEffect();
            w7y.m72649k4(iEffectFormatMo3774k4.getPresetShadowEffect(), c8490p3.m38606yj());
        }
        if (c8490p3.m38600ks() != null) {
            iEffectFormatMo3774k4.enableReflectionEffect();
            akh.m3656k4(iEffectFormatMo3774k4.getReflectionEffect(), c8490p3.m38600ks());
        }
        if (c8490p3.m38602rv() != null) {
            iEffectFormatMo3774k4.enableSoftEdgeEffect();
            bnn.m4274k4(iEffectFormatMo3774k4.getSoftEdgeEffect(), c8490p3.m38602rv());
        }
        if (iEffectFormatMo3774k4.isNoEffects()) {
            ((EffectFormat) iEffectFormatMo3774k4).m1385du();
        }
    }
}
