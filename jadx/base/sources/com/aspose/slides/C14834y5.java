package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7274av;
import com.aspose.slides.internal.p332p7.C8001jh;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;

/* JADX INFO: renamed from: com.aspose.slides.y5 */
/* JADX INFO: loaded from: classes3.dex */
class C14834y5 {
    /* JADX INFO: renamed from: k4 */
    public static void m73745k4(IChartWall iChartWall, AbstractC4685kk<C8001jh> abstractC4685kk, u8s u8sVar) {
        if (m73747k4(iChartWall)) {
            final C8001jh c8001jhInvoke = abstractC4685kk.invoke();
            C14408rp c14408rpM770k4 = ((ChartWall) iChartWall).m770k4();
            c8001jhInvoke.m34692k4().m38333k4(((long) iChartWall.getThickness()) & 4294967295L);
            c8001jhInvoke.m34694k4(c14408rpM770k4.m70191k4());
            if (iChartWall.getPictureType() != -1) {
                if (c8001jhInvoke.m34691h4() == null) {
                    c8001jhInvoke.m34695kk();
                    c8001jhInvoke.m34691h4().m37125k4(new XmlDocument());
                    c8001jhInvoke.m34691h4().m37126x1().appendChild(c8001jhInvoke.m34691h4().m37126x1().createElement("c", "pictureOptions", "http://schemas.openxmlformats.org/drawingml/2006/chart"));
                }
                C13981tl c13981tlCreateElement = (C13981tl) fyw.m6354k4(c8001jhInvoke.m34691h4().m37126x1().getDocumentElement(), "pictureFormat", "http://schemas.openxmlformats.org/drawingml/2006/chart");
                if (c13981tlCreateElement == null) {
                    c13981tlCreateElement = c8001jhInvoke.m34691h4().m37126x1().createElement("c", "pictureFormat", "http://schemas.openxmlformats.org/drawingml/2006/chart");
                    c8001jhInvoke.m34691h4().m37126x1().getDocumentElement().appendChild(c13981tlCreateElement);
                }
                c13981tlCreateElement.m65910kk("val", C7274av.m28492k4(iChartWall.getPictureType()));
            }
            C14864yx.m74127k4(iChartWall.getFormat(), new AbstractC4685kk<C8087kh>() { // from class: com.aspose.slides.y5.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c8001jhInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_SurfaceElementData.AddSpPr()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8087kh invoke() {
                    return c8001jhInvoke.m34698x1();
                }
            }, u8sVar, null, false);
            c8001jhInvoke.m34693k4(c14408rpM770k4.m70194x1());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73746k4(IChartWall iChartWall, C8001jh c8001jh, gnb gnbVar) {
        String strM65906k4;
        if (c8001jh == null) {
            return;
        }
        C14408rp c14408rpM770k4 = ((ChartWall) iChartWall).m770k4();
        if (c8001jh.m34697to() != null) {
            iChartWall.setThickness((int) c8001jh.m34697to().m38332k4());
        }
        if (c8001jh.m34691h4() != null) {
            c14408rpM770k4.m70193k4(c8001jh.m34691h4());
            C13981tl c13981tl = (C13981tl) fyw.m6354k4(c8001jh.m34691h4().m37126x1().getDocumentElement(), "pictureFormat", "http://schemas.openxmlformats.org/drawingml/2006/chart");
            if (c13981tl != null && (strM65906k4 = c13981tl.m65906k4("val")) != null && !"".equals(strM65906k4)) {
                iChartWall.setPictureType(C7274av.f20235k4.m12963k4(strM65906k4));
            }
        }
        C14864yx.m74128k4(iChartWall.getFormat(), c8001jh.m34690du(), gnbVar);
        c14408rpM770k4.m70192k4(c8001jh.m34696m9());
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m73747k4(IChartWall iChartWall) {
        return iChartWall.getThickness() > 0 || C14864yx.m74129k4(iChartWall.getFormat(), null) || iChartWall.getPictureType() != -1;
    }
}
