package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7506dr;
import com.aspose.slides.internal.p332p7.C7782go;
import com.aspose.slides.internal.p332p7.C7965iw;
import com.aspose.slides.internal.p332p7.C8376ns;
import com.aspose.slides.internal.p332p7.C8832t3;
import com.aspose.slides.internal.p332p7.C9085w3;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.e3 */
/* JADX INFO: loaded from: classes3.dex */
class C0925e3 {
    /* JADX INFO: renamed from: k4 */
    public static MathDelimiter m5336k4(C7965iw c7965iw, gnb gnbVar) {
        List list = new List();
        for (C9085w3 c9085w3 : c7965iw.m34503x1()) {
            list.addItem(jz7.m63584k4(c9085w3, gnbVar));
        }
        MathDelimiter mathDelimiter = new MathDelimiter(list, null);
        if (c7965iw.m34500k4() != null) {
            C8832t3 c8832t3M34500k4 = c7965iw.m34500k4();
            if (c8832t3M34500k4.m41527x1() != null) {
                mathDelimiter.setBeginningCharacter(c8832t3M34500k4.m41527x1().m37838k4());
            }
            if (c8832t3M34500k4.m41523kk() != null) {
                mathDelimiter.setSeparatorCharacter(c8832t3M34500k4.m41523kk().m37838k4());
            }
            if (c8832t3M34500k4.m41526to() != null) {
                mathDelimiter.setEndingCharacter(c8832t3M34500k4.m41526to().m37838k4());
            }
            if (c8832t3M34500k4.m41517du() != null) {
                mathDelimiter.setGrowToMatchOperandHeight(c8832t3M34500k4.m41517du().m45981k4() == 0 || c8832t3M34500k4.m41517du().m45981k4() == 1);
            }
            if (c8832t3M34500k4.m41518h4() != null) {
                mathDelimiter.setDelimiterShape(C14459sk.m70653k4(c8832t3M34500k4.m41518h4().m30548k4()));
            }
            C13727kg.m63827k4(mathDelimiter.f2748k4, c8832t3M34500k4.m41525m9(), gnbVar);
        }
        return mathDelimiter;
    }

    /* JADX INFO: renamed from: k4 */
    public static C7965iw m5337k4(MathDelimiter mathDelimiter, u8s u8sVar) {
        boolean zM27456k4;
        C7965iw c7965iw = new C7965iw();
        final C8832t3 c8832t3 = new C8832t3();
        if (mathDelimiter != null && !mathDelimiter.m1978x1()) {
            C8376ns c8376ns = new C8376ns();
            c8376ns.m37839k4(mathDelimiter.getBeginningCharacter());
            c8832t3.m41521k4(c8376ns);
            C8376ns c8376ns2 = new C8376ns();
            c8376ns2.m37839k4(mathDelimiter.getSeparatorCharacter());
            c8832t3.m41528x1(c8376ns2);
            C8376ns c8376ns3 = new C8376ns();
            c8376ns3.m37839k4(mathDelimiter.getEndingCharacter());
            c8832t3.m41524kk(c8376ns3);
            c8832t3.m41522k4(diq.m5107k4(mathDelimiter.getGrowToMatchOperandHeight()));
            C7506dr c7506dr = new C7506dr();
            c7506dr.m30549k4(C14459sk.m70654x1(mathDelimiter.getDelimiterShape()));
            c8832t3.m41520k4(c7506dr);
            C13727kg.m63826k4(mathDelimiter.f2748k4, new AbstractC4685kk<C7782go>() { // from class: com.aspose.slides.e3.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c8832t3) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.m_CT_DPrElementData.AddCtrlPr()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C7782go invoke() {
                    return c8832t3.m41519k4();
                }
            }, u8sVar);
        }
        c7965iw.m34501k4(c8832t3);
        if (mathDelimiter != null && mathDelimiter.getArguments() != null) {
            IGenericEnumerator<IMathElement> it = mathDelimiter.getArguments().iterator();
            while (it.hasNext()) {
                try {
                    c7965iw.m34502k4(jz7.m63586k4(it.next(), u8sVar));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (zM27456k4) {
                return c7965iw;
            }
        }
        return c7965iw;
    }
}
