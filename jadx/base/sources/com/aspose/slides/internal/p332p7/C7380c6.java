package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.IDataLabelCollection;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3144um;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.C13938ms;
import com.aspose.slides.p559ms.System.Xml.C13991ub;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.c6 */
/* JADX INFO: loaded from: classes4.dex */
public class C7380c6 extends AbstractC7268ar {
    /* JADX INFO: renamed from: k4 */
    public static C9358zc m29434k4(AbstractC7414ck abstractC7414ck) {
        C3144um c3144um;
        C8093kj c8093kjM28418k4 = AbstractC7268ar.m28418k4(abstractC7414ck, "{02D57815-91ED-43cb-92C2-25804820EDAC}");
        if (c8093kjM28418k4 == null) {
            return null;
        }
        try {
            c3144um = new C3144um(c8093kjM28418k4.m37126x1().getDocumentElement().getInnerXml());
        } catch (RuntimeException e) {
            C3085sv.m13082k4(e);
        }
        try {
            C13938ms c13938ms = new C13938ms(c3144um);
            try {
                c13938ms.m65616kk(true);
                while (!c13938ms.mo65015ar() && c13938ms.mo65028jd() != 1) {
                    c13938ms.mo65026h4();
                }
                if (c13938ms.mo65015ar()) {
                    c13938ms.dispose();
                    return null;
                }
                C9358zc c9358zc = new C9358zc(c13938ms);
                c13938ms.dispose();
                return c9358zc;
            } catch (Throwable th) {
                c13938ms.dispose();
                throw th;
            }
        } finally {
            c3144um.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m29435k4(AbstractC7414ck abstractC7414ck, IDataLabelCollection iDataLabelCollection, String str, List<String> list) {
        AbstractC7268ar.m28419x1(abstractC7414ck, "{02D57815-91ED-43cb-92C2-25804820EDAC}");
        if (iDataLabelCollection.getDefaultDataLabelFormat().getShowLabelValueFromCell()) {
            try {
                C3152yj c3152yj = new C3152yj();
                try {
                    C13991ub c13991ub = new C13991ub(c3152yj, AbstractC6747ar.m26635ix());
                    try {
                        C8093kj c8093kj = (C8093kj) abstractC7414ck.mo29646x1();
                        c13991ub.mo12953k4("c", "ext", "http://schemas.openxmlformats.org/drawingml/2006/chart");
                        c13991ub.m65806to("xmlns:c15", "http://schemas.microsoft.com/office/drawing/2012/chart");
                        c13991ub.m65806to("uri", "{02D57815-91ED-43cb-92C2-25804820EDAC}");
                        c13991ub.mo12953k4("c15", "datalabelsRange", "http://schemas.microsoft.com/office/drawing/2012/chart");
                        c13991ub.mo12953k4("c15", "f", "http://schemas.microsoft.com/office/drawing/2012/chart");
                        c13991ub.mo21918x1(str);
                        c13991ub.mo21898jd();
                        m29436k4(c13991ub, list);
                        c13991ub.mo21898jd();
                        c13991ub.mo21898jd();
                        c13991ub.mo21896h4();
                        c3152yj.setPosition(0L);
                        c8093kj.m37125k4(new XmlDocument());
                        c8093kj.m37126x1().setXmlResolver(null);
                        c8093kj.m37126x1().load(c3152yj);
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

    /* JADX INFO: renamed from: k4 */
    private static void m29436k4(C13991ub c13991ub, List<String> list) {
        c13991ub.mo12953k4("c15", "dlblRangeCache", "http://schemas.microsoft.com/office/drawing/2012/chart");
        c13991ub.mo12953k4("c", "ptCount", "http://schemas.openxmlformats.org/drawingml/2006/chart");
        c13991ub.m65801du("val", null, C13850af.m65103k4(list.size()));
        c13991ub.mo21898jd();
        for (int i = 0; i < list.size(); i++) {
            if (!C14113y2.m67411k4(list.get_Item(i))) {
                c13991ub.mo12953k4("c", TranslateLanguage.PORTUGUESE, "http://schemas.openxmlformats.org/drawingml/2006/chart");
                c13991ub.m65801du("idx", null, C13850af.m65103k4(i));
                c13991ub.mo12953k4("c", "v", "http://schemas.openxmlformats.org/drawingml/2006/chart");
                c13991ub.mo21918x1(list.get_Item(i));
                c13991ub.mo21898jd();
                c13991ub.mo21898jd();
            }
        }
        c13991ub.mo21898jd();
    }
}
