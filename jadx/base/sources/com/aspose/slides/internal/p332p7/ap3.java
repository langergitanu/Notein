package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3144um;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13943n5;
import com.aspose.slides.p559ms.System.Xml.C13938ms;
import com.aspose.slides.p559ms.System.Xml.C13940my;
import com.aspose.slides.p559ms.System.Xml.C13991ub;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class ap3 {
    /* JADX INFO: renamed from: k4 */
    private static h2b m28396k4(AbstractC7414ck abstractC7414ck, String str) {
        h2b h2bVarM28400x1 = m28400x1(abstractC7414ck, str);
        return h2bVarM28400x1 == null ? (h2b) abstractC7414ck.mo29646x1() : h2bVarM28400x1;
    }

    /* JADX INFO: renamed from: x1 */
    private static h2b m28400x1(AbstractC7414ck abstractC7414ck, String str) {
        if (abstractC7414ck == null) {
            return null;
        }
        for (C8290mt c8290mt : abstractC7414ck.mo29643k4()) {
            C13940my c13940myM65165k4 = c8290mt.m37126x1().getDocumentElement().getAttributes().m65165k4("uri");
            if (c13940myM65165k4 != null && C14113y2.m67363du(c13940myM65165k4.getValue(), str)) {
                return (h2b) c8290mt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public static zgi m28397k4(AbstractC7414ck abstractC7414ck) {
        if (abstractC7414ck == null) {
            return null;
        }
        for (C8290mt c8290mt : abstractC7414ck.mo29643k4()) {
            C13940my c13940myM65165k4 = c8290mt.m37126x1().getDocumentElement().getAttributes().m65165k4("uri");
            if (c13940myM65165k4 != null && "{2FDB2607-1784-4EEB-B798-7EB5836EED8A}".equals(c13940myM65165k4.getValue())) {
                return m28398k4(c8290mt.m37126x1());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private static zgi m28398k4(XmlDocument xmlDocument) {
        if (xmlDocument != null) {
            try {
                C3144um c3144um = new C3144um(xmlDocument.getDocumentElement().getOuterXml());
                try {
                    C13938ms c13938ms = new C13938ms(c3144um);
                    try {
                        c13938ms.m65615k4((AbstractC13943n5) null);
                        while (!c13938ms.mo65015ar()) {
                            c13938ms.mo65026h4();
                            if ("showMediaCtrls".equals(c13938ms.mo65023fa())) {
                                return new zgi(c13938ms);
                            }
                        }
                    } finally {
                        c13938ms.dispose();
                    }
                } finally {
                    c3144um.dispose();
                }
            } catch (RuntimeException e) {
                C3085sv.m13082k4(e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m28399k4(AbstractC7414ck abstractC7414ck, boolean z) {
        h2b h2bVarM28396k4 = m28396k4(abstractC7414ck, "{2FDB2607-1784-4EEB-B798-7EB5836EED8A}");
        try {
            C3152yj c3152yj = new C3152yj();
            try {
                C13991ub c13991ub = new C13991ub(c3152yj, AbstractC6747ar.m26635ix());
                try {
                    c13991ub.mo12953k4(ContextChain.TAG_PRODUCT, "ext", "http://schemas.openxmlformats.org/presentationml/2006/main");
                    c13991ub.m65806to("uri", "{2FDB2607-1784-4EEB-B798-7EB5836EED8A}");
                    c13991ub.mo12953k4("p14", "showMediaCtrls", "http://schemas.microsoft.com/office/powerpoint/2010/main");
                    c13991ub.m65806to("val", z ? "1" : "0");
                    c13991ub.mo21898jd();
                    c13991ub.mo21898jd();
                    c13991ub.mo21896h4();
                    c3152yj.setPosition(0L);
                    if (h2bVarM28396k4.m37126x1() == null) {
                        h2bVarM28396k4.m37125k4(new XmlDocument());
                        h2bVarM28396k4.m37126x1().setXmlResolver(null);
                    }
                    h2bVarM28396k4.m37126x1().load(c3152yj);
                    c13991ub.dispose();
                } catch (Throwable th) {
                    c13991ub.dispose();
                    throw th;
                }
            } finally {
                c3152yj.dispose();
            }
        } catch (RuntimeException e) {
            C3085sv.m13082k4(e);
        }
    }
}
