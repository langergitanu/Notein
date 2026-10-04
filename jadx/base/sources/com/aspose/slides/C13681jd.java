package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7782go;
import com.aspose.slides.internal.p332p7.C7877hs;
import com.aspose.slides.internal.p332p7.C8376ns;
import com.aspose.slides.internal.p332p7.C8847ta;

/* JADX INFO: renamed from: com.aspose.slides.jd */
/* JADX INFO: loaded from: classes3.dex */
class C13681jd {
    /* JADX INFO: renamed from: k4 */
    public static MathAccent m63283k4(C8847ta c8847ta, gnb gnbVar) {
        if (c8847ta == null) {
            throw new ArgumentNullException("accElementData");
        }
        MathAccent mathAccent = new MathAccent(jz7.m63584k4(c8847ta.m41622x1(), gnbVar));
        if (c8847ta.m41620k4() != null) {
            if (c8847ta.m41620k4().m33607x1() != null) {
                mathAccent.setCharacter(c8847ta.m41620k4().m33607x1().m37838k4());
            }
            C13727kg.m63827k4(mathAccent.f2717k4, c8847ta.m41620k4().m33606kk(), gnbVar);
        }
        return mathAccent;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63284k4(MathAccent mathAccent, C8847ta c8847ta, u8s u8sVar) {
        if (mathAccent == null) {
            throw new ArgumentNullException("domObject");
        }
        if (c8847ta == null) {
            throw new ArgumentNullException("accElementData");
        }
        final C7877hs c7877hs = new C7877hs();
        C8376ns c8376ns = new C8376ns();
        c8376ns.m37839k4(mathAccent.getCharacter());
        c7877hs.m33605k4(c8376ns);
        C13727kg.m63826k4(mathAccent.f2717k4, new AbstractC4685kk<C7782go>() { // from class: com.aspose.slides.jd.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c7877hs) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.m_CT_AccPrElementData.AddCtrlPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C7782go invoke() {
                return c7877hs.m33604k4();
            }
        }, u8sVar);
        c8847ta.m41621k4(c7877hs);
        jz7.m63587k4(c8847ta.m41622x1(), mathAccent.getBase(), u8sVar);
    }
}
