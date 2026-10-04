package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C8897tu;

/* JADX INFO: loaded from: classes3.dex */
class ktl {
    /* JADX INFO: renamed from: k4 */
    public static void m64163k4(ILayoutSlide iLayoutSlide, final C8897tu c8897tu, sdp sdpVar) {
        tgu tguVarM1849x6 = ((LayoutSlide) iLayoutSlide).m1849x6();
        if (c8897tu.m41940yj() == null) {
            c8897tu.m41930kk();
        }
        C13670j2.m63195k4(iLayoutSlide.getTimeline(), iLayoutSlide.getShapes(), c8897tu.m41940yj(), new gi8(sdpVar.m70580k4(), sdpVar.m70576du()));
        c8897tu.m41940yj().m31096k4(tguVarM1849x6.m5310x1());
        c8897tu.m41940yj().m31094k4(tguVarM1849x6.m5306kk());
        C14869z1.m74189k4(iLayoutSlide, c8897tu.m41919ck(), sdpVar);
        C14349qj.m69677x1(((BaseThemeManager) iLayoutSlide.getThemeManager()).m423to(), c8897tu.m41925k4());
        qas.m69499k4(iLayoutSlide.getSlideShowTransition(), c8897tu.m41938x1(), sdpVar.m70580k4());
        c8897tu.m41926k4(iLayoutSlide.getLayoutType());
        c8897tu.m41929k4(iLayoutSlide.getShowMasterShapes());
        C14189nn.m68098k4(tguVarM1849x6.m71155ck(), new AbstractC4685kk<com.aspose.slides.internal.p332p7.qvp>() { // from class: com.aspose.slides.ktl.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8897tu) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.SlideLayoutElementData.AddHf()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public com.aspose.slides.internal.p332p7.qvp invoke() {
                return c8897tu.m41935to();
            }
        });
        c8897tu.m41927k4(tguVarM1849x6.m71163up());
        c8897tu.m41939x1(tguVarM1849x6.m71156dy());
        c8897tu.m41928k4(tguVarM1849x6.m71154c5());
        c8897tu.m41931kk(tguVarM1849x6.m71158jd());
        c8897tu.m41936to(tguVarM1849x6.m71157fa());
    }
}
