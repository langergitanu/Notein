package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3144um;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.Xml.AbstractC13943n5;
import com.aspose.slides.p559ms.System.Xml.C13938ms;
import com.aspose.slides.p559ms.System.Xml.C13940my;
import com.aspose.slides.p559ms.System.Xml.C13991ub;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class mai {
    /* JADX INFO: renamed from: k4 */
    public static ggf m36737k4(AbstractC7414ck abstractC7414ck) {
        if (abstractC7414ck == null) {
            return null;
        }
        for (C8290mt c8290mt : abstractC7414ck.mo29643k4()) {
            C13940my c13940myM65165k4 = c8290mt.m37126x1().getDocumentElement().getAttributes().m65165k4("uri");
            if (c13940myM65165k4 != null && "{E76CE94A-603C-4142-B9EB-6D1370010A27}".equals(c13940myM65165k4.getValue())) {
                return m36738k4(c8290mt.m37126x1());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public static svz m36742kk(AbstractC7414ck abstractC7414ck) {
        if (abstractC7414ck == null) {
            return null;
        }
        for (C8290mt c8290mt : abstractC7414ck.mo29643k4()) {
            C13940my c13940myM65165k4 = c8290mt.m37126x1().getDocumentElement().getAttributes().m65165k4("uri");
            if (c13940myM65165k4 != null && "{FD5EFAAD-0ECE-453E-9831-46B23BE46B34}".equals(c13940myM65165k4.getValue())) {
                return m36743kk(c8290mt.m37126x1());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: to */
    public static dki m36745to(AbstractC7414ck abstractC7414ck) {
        if (abstractC7414ck == null) {
            return null;
        }
        for (C8290mt c8290mt : abstractC7414ck.mo29643k4()) {
            C13940my c13940myM65165k4 = c8290mt.m37126x1().getDocumentElement().getAttributes().m65165k4("uri");
            if (c13940myM65165k4 != null && "{1BD7E111-0CB8-44D6-8891-C1BB2F81B7CC}".equals(c13940myM65165k4.getValue())) {
                return m36746to(c8290mt.m37126x1());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    private static h2b m36747x1(AbstractC7414ck abstractC7414ck, String str) {
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
    private static ggf m36738k4(XmlDocument xmlDocument) {
        if (xmlDocument != null) {
            try {
                C3144um c3144um = new C3144um(xmlDocument.getDocumentElement().getOuterXml());
                try {
                    C13938ms c13938ms = new C13938ms(c3144um);
                    try {
                        c13938ms.m65615k4((AbstractC13943n5) null);
                        while (!c13938ms.mo65015ar()) {
                            c13938ms.mo65026h4();
                            if ("discardImageEditData".equals(c13938ms.mo65023fa())) {
                                return new ggf(c13938ms);
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

    /* JADX INFO: renamed from: kk */
    private static svz m36743kk(XmlDocument xmlDocument) {
        if (xmlDocument != null) {
            try {
                C3144um c3144um = new C3144um(xmlDocument.getDocumentElement().getOuterXml());
                try {
                    C13938ms c13938ms = new C13938ms(c3144um);
                    try {
                        c13938ms.m65615k4((AbstractC13943n5) null);
                        while (!c13938ms.mo65015ar()) {
                            c13938ms.mo65026h4();
                            if ("chartTrackingRefBased".equals(c13938ms.mo65023fa())) {
                                return new svz(c13938ms);
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

    /* JADX INFO: renamed from: to */
    private static dki m36746to(XmlDocument xmlDocument) {
        if (xmlDocument != null) {
            try {
                C3144um c3144um = new C3144um(xmlDocument.getDocumentElement().getOuterXml());
                try {
                    C13938ms c13938ms = new C13938ms(c3144um);
                    try {
                        c13938ms.m65615k4((AbstractC13943n5) null);
                        while (!c13938ms.mo65015ar()) {
                            c13938ms.mo65026h4();
                            if ("readonlyRecommended".equals(c13938ms.mo65023fa())) {
                                return new dki(c13938ms);
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

    /* JADX INFO: renamed from: x1 */
    public static n6c m36748x1(AbstractC7414ck abstractC7414ck) {
        if (abstractC7414ck == null) {
            return null;
        }
        for (C8290mt c8290mt : abstractC7414ck.mo29643k4()) {
            C13940my c13940myM65165k4 = c8290mt.m37126x1().getDocumentElement().getAttributes().m65165k4("uri");
            if (c13940myM65165k4 != null && "{D31A062A-798A-4329-ABDD-BBA856620510}".equals(c13940myM65165k4.getValue())) {
                return m36749x1(c8290mt.m37126x1());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private static h2b m36739k4(AbstractC7414ck abstractC7414ck, String str) {
        h2b h2bVarM36747x1 = m36747x1(abstractC7414ck, str);
        return h2bVarM36747x1 == null ? (h2b) abstractC7414ck.mo29646x1() : h2bVarM36747x1;
    }

    /* JADX INFO: renamed from: kk */
    public static void m36744kk(AbstractC7414ck abstractC7414ck, boolean z) {
        h2b h2bVarM36739k4 = m36739k4(abstractC7414ck, "{1BD7E111-0CB8-44D6-8891-C1BB2F81B7CC}");
        try {
            C3152yj c3152yj = new C3152yj();
            try {
                C13991ub c13991ub = new C13991ub(c3152yj, AbstractC6747ar.m26635ix());
                try {
                    c13991ub.mo12953k4(ContextChain.TAG_PRODUCT, "ext", "http://schemas.openxmlformats.org/presentationml/2006/main");
                    c13991ub.m65806to("uri", "{1BD7E111-0CB8-44D6-8891-C1BB2F81B7CC}");
                    c13991ub.mo12953k4("p1710", "readonlyRecommended", "http://schemas.microsoft.com/office/powerpoint/2017/10/main");
                    c13991ub.m65806to("val", z ? "1" : "0");
                    c13991ub.mo21898jd();
                    c13991ub.mo21898jd();
                    c13991ub.mo21896h4();
                    c3152yj.setPosition(0L);
                    if (h2bVarM36739k4.m37126x1() == null) {
                        h2bVarM36739k4.m37125k4(new XmlDocument());
                        h2bVarM36739k4.m37126x1().setXmlResolver(null);
                    }
                    h2bVarM36739k4.m37126x1().load(c3152yj);
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

    /* JADX INFO: renamed from: x1 */
    private static n6c m36749x1(XmlDocument xmlDocument) {
        if (xmlDocument != null) {
            try {
                C3144um c3144um = new C3144um(xmlDocument.getDocumentElement().getOuterXml());
                try {
                    C13938ms c13938ms = new C13938ms(c3144um);
                    try {
                        c13938ms.m65615k4((AbstractC13943n5) null);
                        while (!c13938ms.mo65015ar()) {
                            c13938ms.mo65026h4();
                            if ("defaultImageDpi".equals(c13938ms.mo65023fa())) {
                                return new n6c(c13938ms);
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
    public static void m36740k4(AbstractC7414ck abstractC7414ck, long j) {
        h2b h2bVarM36739k4 = m36739k4(abstractC7414ck, "{D31A062A-798A-4329-ABDD-BBA856620510}");
        try {
            C3152yj c3152yj = new C3152yj();
            try {
                C13991ub c13991ub = new C13991ub(c3152yj, AbstractC6747ar.m26635ix());
                try {
                    c13991ub.mo12953k4(ContextChain.TAG_PRODUCT, "ext", "http://schemas.openxmlformats.org/presentationml/2006/main");
                    c13991ub.m65806to("uri", "{D31A062A-798A-4329-ABDD-BBA856620510}");
                    c13991ub.mo12953k4("p14", "defaultImageDpi", "http://schemas.microsoft.com/office/powerpoint/2010/main");
                    c13991ub.m65806to("val", C14114y9.m67465x1(j));
                    c13991ub.mo21898jd();
                    c13991ub.mo21898jd();
                    c13991ub.mo21896h4();
                    c3152yj.setPosition(0L);
                    if (h2bVarM36739k4.m37126x1() == null) {
                        h2bVarM36739k4.m37125k4(new XmlDocument());
                        h2bVarM36739k4.m37126x1().setXmlResolver(null);
                    }
                    h2bVarM36739k4.m37126x1().load(c3152yj);
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

    /* JADX INFO: renamed from: x1 */
    public static void m36750x1(AbstractC7414ck abstractC7414ck, boolean z) {
        h2b h2bVarM36739k4 = m36739k4(abstractC7414ck, "{FD5EFAAD-0ECE-453E-9831-46B23BE46B34}");
        try {
            C3152yj c3152yj = new C3152yj();
            try {
                C13991ub c13991ub = new C13991ub(c3152yj, AbstractC6747ar.m26635ix());
                try {
                    c13991ub.mo12953k4(ContextChain.TAG_PRODUCT, "ext", "http://schemas.openxmlformats.org/presentationml/2006/main");
                    c13991ub.m65806to("uri", "{FD5EFAAD-0ECE-453E-9831-46B23BE46B34}");
                    c13991ub.mo12953k4("p15", "chartTrackingRefBased", "http://schemas.microsoft.com/office/powerpoint/2012/main");
                    c13991ub.m65806to("val", z ? "1" : "0");
                    c13991ub.mo21898jd();
                    c13991ub.mo21898jd();
                    c13991ub.mo21896h4();
                    c3152yj.setPosition(0L);
                    if (h2bVarM36739k4.m37126x1() == null) {
                        h2bVarM36739k4.m37125k4(new XmlDocument());
                        h2bVarM36739k4.m37126x1().setXmlResolver(null);
                    }
                    h2bVarM36739k4.m37126x1().load(c3152yj);
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

    /* JADX INFO: renamed from: k4 */
    public static void m36741k4(AbstractC7414ck abstractC7414ck, boolean z) {
        h2b h2bVarM36739k4 = m36739k4(abstractC7414ck, "{E76CE94A-603C-4142-B9EB-6D1370010A27}");
        try {
            C3152yj c3152yj = new C3152yj();
            try {
                C13991ub c13991ub = new C13991ub(c3152yj, AbstractC6747ar.m26635ix());
                try {
                    c13991ub.mo12953k4(ContextChain.TAG_PRODUCT, "ext", "http://schemas.openxmlformats.org/presentationml/2006/main");
                    c13991ub.m65806to("uri", "{E76CE94A-603C-4142-B9EB-6D1370010A27}");
                    c13991ub.mo12953k4("p14", "discardImageEditData", "http://schemas.microsoft.com/office/powerpoint/2010/main");
                    c13991ub.m65806to("val", z ? "1" : "0");
                    c13991ub.mo21898jd();
                    c13991ub.mo21898jd();
                    c13991ub.mo21896h4();
                    c3152yj.setPosition(0L);
                    if (h2bVarM36739k4.m37126x1() == null) {
                        h2bVarM36739k4.m37125k4(new XmlDocument());
                        h2bVarM36739k4.m37126x1().setXmlResolver(null);
                    }
                    h2bVarM36739k4.m37126x1().load(c3152yj);
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
