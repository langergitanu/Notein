package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C8037js;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.internal.p332p7.C8952ug;
import com.aspose.slides.internal.p332p7.C8970uq;
import com.aspose.slides.p559ms.System.C14044b3;

/* JADX INFO: loaded from: classes3.dex */
class adk {
    /* JADX INFO: renamed from: k4 */
    public static void m3503k4(ITrendline iTrendline, C8037js c8037js, gnb gnbVar) {
        if (c8037js == null) {
            return;
        }
        sdr sdrVarM3026k4 = ((Trendline) iTrendline).m3026k4();
        iTrendline.setTrendlineName(c8037js.m34940jd());
        C14864yx.m74128k4(iTrendline.getFormat(), c8037js.m34934ck(), gnbVar);
        iTrendline.setTrendlineType(c8037js.m34937fa().m41074k4());
        if (c8037js.m34951up() != null) {
            iTrendline.setOrder(c8037js.m34951up().m38179k4());
        }
        if (c8037js.m34955yj() != null) {
            iTrendline.setPeriod(c8037js.m34955yj().m38628k4());
        }
        if (c8037js.m34945ks() != null) {
            iTrendline.setForward(c8037js.m34945ks().m29595k4());
        }
        if (c8037js.m34948rv() != null) {
            iTrendline.setBackward(c8037js.m34948rv().m29595k4());
        }
        if (c8037js.m34954x6() != null) {
            iTrendline.setIntercept(c8037js.m34954x6().m29595k4());
        }
        if (c8037js.m34947ne() != null) {
            iTrendline.setDisplayRSquaredValue(c8037js.m34947ne().m41467k4());
        }
        if (c8037js.m34939ix() != null) {
            iTrendline.setDisplayEquation(c8037js.m34939ix().m41467k4());
        }
        if (c8037js.m34950u4() != null) {
            shm.m70628k4(iTrendline, c8037js.m34950u4().m44254to(), c8037js.m34950u4().m44253m9(), gnbVar);
            sdrVarM3026k4.m70591k4(c8037js.m34950u4().m44252kk());
            sdrVarM3026k4.m70590k4(c8037js.m34950u4().m44244du());
            sdrVarM3026k4.m70592k4(c8037js.m34950u4().m44246h4());
            sdrVarM3026k4.m70596x1(c8037js.m34950u4().m44245dy());
        }
        sdrVarM3026k4.m70589k4(c8037js.m34952uz());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3504k4(ITrendline iTrendline, final C8037js c8037js, u8s u8sVar) {
        if (iTrendline == null) {
            return;
        }
        sdr sdrVarM3026k4 = ((Trendline) iTrendline).m3026k4();
        c8037js.m34943k4(iTrendline.getTrendlineName());
        C14864yx.m74127k4(iTrendline.getFormat(), new AbstractC4685kk<C8087kh>() { // from class: com.aspose.slides.adk.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8037js) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_TrendlineElementData.AddSpPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8087kh invoke() {
                return c8037js.m34941k4();
            }
        }, u8sVar, null, false);
        c8037js.m34937fa().m41075k4(iTrendline.getTrendlineType());
        if (iTrendline.getTrendlineType() == 4) {
            c8037js.m34953x1().m38180k4(iTrendline.getOrder());
        }
        if (iTrendline.getTrendlineType() == 3) {
            c8037js.m34944kk().m38629k4(iTrendline.getPeriod());
        }
        if (!C14044b3.m66437kk(iTrendline.getForward())) {
            c8037js.m34949to().m29596k4(iTrendline.getForward());
        }
        if (!C14044b3.m66437kk(iTrendline.getBackward())) {
            c8037js.m34935du().m29596k4(iTrendline.getBackward());
        }
        if (!C14044b3.m66437kk(iTrendline.getIntercept())) {
            c8037js.m34938h4().m29596k4(iTrendline.getIntercept());
        }
        c8037js.m34946m9().m41466k4(iTrendline.getDisplayRSquaredValue());
        c8037js.m34936dy().m41466k4(iTrendline.getDisplayEquation());
        if ((iTrendline.getTextFrameForOverriding() != null && iTrendline.getTextFrameForOverriding().getParagraphs().getCount() != 0) || C13691jl.m63403k4(iTrendline.getTextFormat()) || sdrVarM3026k4.m70588k4() != null || sdrVarM3026k4.m70595x1() != null || sdrVarM3026k4.m70593kk() != null || sdrVarM3026k4.m70587du() != null) {
            c8037js.m34933c5();
            shm.m70626k4(iTrendline, new AbstractC4685kk<C8970uq>() { // from class: com.aspose.slides.adk.2
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c8037js.m34950u4()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_TrendlineLblElementData.AddTx()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8970uq invoke() {
                    return c8037js.m34950u4().m44247k4();
                }
            }, new AbstractC4685kk<C8952ug>() { // from class: com.aspose.slides.adk.3
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c8037js.m34950u4()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_TrendlineLblElementData.AddTxPr()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8952ug invoke() {
                    return c8037js.m34950u4().m44255x1();
                }
            }, u8sVar);
            c8037js.m34950u4().m44250k4(sdrVarM3026k4.m70588k4());
            c8037js.m34950u4().m44249k4(sdrVarM3026k4.m70595x1());
            c8037js.m34950u4().m44251k4(sdrVarM3026k4.m70593kk());
            c8037js.m34950u4().m44248k4(sdrVarM3026k4.m70587du());
        }
        c8037js.m34942k4(sdrVarM3026k4.m70594to());
    }
}
