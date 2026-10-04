package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3144um;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13938ms;
import com.aspose.slides.p559ms.System.Xml.C13940my;
import com.aspose.slides.p559ms.System.Xml.C13991ub;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ip */
/* JADX INFO: loaded from: classes4.dex */
public class C7948ip {
    /* JADX INFO: renamed from: k4 */
    public static C8256md m34354k4(AbstractC7414ck abstractC7414ck) {
        if (abstractC7414ck == null) {
            return null;
        }
        for (C8290mt c8290mt : abstractC7414ck.mo29643k4()) {
            C13940my c13940myM65165k4 = c8290mt.m37126x1().getDocumentElement().getAttributes().m65165k4("uri");
            if (c13940myM65165k4 != null && "{6F2FDCE9-48DA-4B69-8628-5D25D57E5C99}".equals(c13940myM65165k4.getValue())) {
                return m34355k4(c8290mt.m37126x1());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: kk */
    private static C8093kj m34357kk(AbstractC7414ck abstractC7414ck, String str) {
        if (abstractC7414ck == null) {
            return null;
        }
        for (C8290mt c8290mt : abstractC7414ck.mo29643k4()) {
            C13940my c13940myM65165k4 = c8290mt.m37126x1().getDocumentElement().getAttributes().m65165k4("uri");
            if (c13940myM65165k4 != null && C14113y2.m67363du(c13940myM65165k4.getValue(), str)) {
                return (C8093kj) c8290mt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    private static C8093kj m34358x1(AbstractC7414ck abstractC7414ck, String str) {
        C8093kj c8093kjM34357kk = m34357kk(abstractC7414ck, str);
        if (c8093kjM34357kk != null) {
            return c8093kjM34357kk;
        }
        C8093kj c8093kj = (C8093kj) abstractC7414ck.mo29646x1();
        c8093kj.mo28310k4(C14113y2.m67402k4("<c:ext xmlns:c =\"{0}\" uri=\"{1}\" xmlns:c14=\"{2}\" xmlns:a=\"{3}\"></c:ext>", "http://schemas.openxmlformats.org/drawingml/2006/chart", str, "http://schemas.microsoft.com/office/drawing/2007/8/2/chart", "http://schemas.openxmlformats.org/drawingml/2006/main"));
        return c8093kj;
    }

    /* JADX INFO: renamed from: k4 */
    private static C8256md m34355k4(XmlDocument xmlDocument) {
        if (xmlDocument == null) {
            return null;
        }
        try {
            C3144um c3144um = new C3144um(xmlDocument.getDocumentElement().getOuterXml());
            try {
                C13938ms c13938ms = new C13938ms(c3144um);
                try {
                    c13938ms.m65616kk(true);
                    c13938ms.mo65026h4();
                    while (!c13938ms.mo65015ar()) {
                        c13938ms.mo65026h4();
                        if ("solidFill".equals(c13938ms.mo65023fa())) {
                            return new C8256md(c13938ms);
                        }
                    }
                    return null;
                } finally {
                    c13938ms.dispose();
                }
            } finally {
                c3144um.dispose();
            }
        } catch (RuntimeException e) {
            C3085sv.m13082k4(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m34356k4(AbstractC7414ck abstractC7414ck, String str) {
        C8093kj c8093kjM34358x1 = m34358x1(abstractC7414ck, "{6F2FDCE9-48DA-4B69-8628-5D25D57E5C99}");
        try {
            C3152yj c3152yj = new C3152yj();
            try {
                C13991ub c13991ub = new C13991ub(c3152yj, AbstractC6747ar.m26635ix());
                try {
                    c13991ub.mo12953k4("c", "ext", "http://schemas.openxmlformats.org/drawingml/2006/chart");
                    c13991ub.m65806to("uri", "{6F2FDCE9-48DA-4B69-8628-5D25D57E5C99}");
                    c13991ub.mo12953k4("c14", "invertSolidFillFmt", "http://schemas.microsoft.com/office/drawing/2007/8/2/chart");
                    c13991ub.mo12953k4("c14", "spPr", "http://schemas.microsoft.com/office/drawing/2007/8/2/chart");
                    c13991ub.mo12953k4("a", "solidFill", "http://schemas.openxmlformats.org/drawingml/2006/main");
                    c13991ub.mo12953k4("a", "srgbClr", "http://schemas.openxmlformats.org/drawingml/2006/main");
                    c13991ub.m65806to("val", str);
                    c13991ub.mo21898jd();
                    c13991ub.mo21898jd();
                    c13991ub.mo12953k4("a", "ln", "http://schemas.openxmlformats.org/drawingml/2006/main");
                    c13991ub.mo12953k4("a", "noFill", "http://schemas.openxmlformats.org/drawingml/2006/main");
                    c13991ub.mo21898jd();
                    c13991ub.mo21898jd();
                    c13991ub.mo12953k4("a", "effectLst", "http://schemas.openxmlformats.org/drawingml/2006/main");
                    c13991ub.mo21898jd();
                    c13991ub.mo21898jd();
                    c13991ub.mo21898jd();
                    c13991ub.mo21898jd();
                    c13991ub.mo21896h4();
                    c3152yj.setPosition(0L);
                    c8093kjM34358x1.m37126x1().load(c3152yj);
                } finally {
                    c13991ub.dispose();
                }
            } finally {
                c3152yj.dispose();
            }
        } catch (RuntimeException e) {
            C3085sv.m13082k4(e);
        }
    }
}
