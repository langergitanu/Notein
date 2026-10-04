package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.C7626f0;
import com.aspose.slides.internal.p332p7.C8294mw;
import com.aspose.slides.internal.p332p7.C8952ug;
import com.aspose.slides.internal.p332p7.C8970uq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class shm {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f48851k4 = new C7017h4("strRef", "rich", "txData");

    /* JADX INFO: renamed from: k4 */
    public static void m70626k4(IOverridableText iOverridableText, AbstractC4685kk<C8970uq> abstractC4685kk, AbstractC4685kk<C8952ug> abstractC4685kk2, u8s u8sVar) {
        ITextFrame textFrameForOverriding = iOverridableText.getTextFrameForOverriding();
        if (textFrameForOverriding != null && textFrameForOverriding.getParagraphs().getCount() != 0) {
            hn7.m7242k4(textFrameForOverriding, (C8952ug) abstractC4685kk.invoke().m42524k4("rich").m29542x1(), u8sVar);
        }
        C13691jl.m63396k4(iOverridableText.getTextFormat(), abstractC4685kk2, u8sVar, iOverridableText);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70627k4(IOverridableText iOverridableText, C8294mw c8294mw, C8952ug c8952ug, gnb gnbVar) {
        if (c8294mw == null && c8952ug == null) {
            return;
        }
        if (c8294mw != null) {
            int iM27428k4 = f48851k4.m27428k4(c8294mw.m37149k4().m29539k4());
            if (iM27428k4 == 0) {
                C7626f0 c7626f0 = (C7626f0) c8294mw.m37149k4().m29542x1();
                if (c7626f0 != null && c7626f0.m31515kk() != null && c7626f0.m31515kk().m39373to() != null && (c7626f0.m31515kk().m39372kk().m38332k4() & 4294967295L) > 0 && c7626f0.m31515kk().m39373to().length > 0) {
                    if (iOverridableText.getTextFrameForOverriding() != null) {
                        iOverridableText.getTextFrameForOverriding().setText(c7626f0.m31515kk().m39373to()[0].m43592x1());
                    } else {
                        iOverridableText.addTextFrameForOverriding(c7626f0.m31515kk().m39373to()[0].m43592x1());
                    }
                }
            } else if (iM27428k4 == 1) {
                C8952ug c8952ug2 = (C8952ug) c8294mw.m37149k4().m29542x1();
                if (iOverridableText.getTextFrameForOverriding() == null) {
                    iOverridableText.addTextFrameForOverriding("");
                    iOverridableText.getTextFrameForOverriding().getParagraphs().clear();
                }
                hn7.m7241k4(iOverridableText.getTextFrameForOverriding(), c8952ug2, gnbVar);
            } else {
                if (iM27428k4 != 2) {
                    throw new Exception(C14113y2.m67408k4("Unknown element \"", c8294mw.m37149k4().m29539k4(), "\""));
                }
                if (iOverridableText.getTextFrameForOverriding() == null) {
                    iOverridableText.addTextFrameForOverriding("");
                    iOverridableText.getTextFrameForOverriding().getParagraphs().clear();
                }
                hn7.m7241k4(iOverridableText.getTextFrameForOverriding(), c8952ug, gnbVar);
            }
        }
        C13691jl.m63398k4(iOverridableText.getTextFormat(), c8952ug, gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70628k4(IOverridableText iOverridableText, C8970uq c8970uq, C8952ug c8952ug, gnb gnbVar) {
        if (c8970uq == null && c8952ug == null) {
            return;
        }
        if (c8970uq != null) {
            int iM27428k4 = f48851k4.m27428k4(c8970uq.m42523k4().m29539k4());
            if (iM27428k4 == 0) {
                C7626f0 c7626f0 = (C7626f0) c8970uq.m42523k4().m29542x1();
                if (c7626f0 != null && c7626f0.m31515kk() != null && c7626f0.m31515kk().m39373to() != null && (c7626f0.m31515kk().m39372kk().m38332k4() & 4294967295L) > 0) {
                    String strM43592x1 = c7626f0.m31515kk().m39373to().length > 0 ? c7626f0.m31515kk().m39373to()[0].m43592x1() : C14113y2.f47374k4;
                    if (iOverridableText.getTextFrameForOverriding() != null) {
                        iOverridableText.getTextFrameForOverriding().setText(strM43592x1);
                    } else {
                        iOverridableText.addTextFrameForOverriding(strM43592x1);
                    }
                }
            } else {
                if (iM27428k4 != 1) {
                    throw new Exception(C14113y2.m67408k4("Unknown element \"", c8970uq.m42523k4().m29539k4(), "\""));
                }
                C8952ug c8952ug2 = (C8952ug) c8970uq.m42523k4().m29542x1();
                if (iOverridableText.getTextFrameForOverriding() == null) {
                    iOverridableText.addTextFrameForOverriding("");
                    iOverridableText.getTextFrameForOverriding().getParagraphs().clear();
                }
                hn7.m7241k4(iOverridableText.getTextFrameForOverriding(), c8952ug2, gnbVar);
            }
        }
        C13691jl.m63398k4(iOverridableText.getTextFormat(), c8952ug, gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m70629k4(ITextFrame iTextFrame) {
        return (iTextFrame == null || iTextFrame.getParagraphs().getCount() == 0) ? false : true;
    }
}
