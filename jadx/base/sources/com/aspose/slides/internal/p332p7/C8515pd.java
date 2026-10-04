package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3144um;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13958qb;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.C13938ms;
import com.aspose.slides.p559ms.System.Xml.C13940my;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.C13991ub;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.pd */
/* JADX INFO: loaded from: classes4.dex */
public class C8515pd {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f28392k4 = new C7017h4("noFill", "solidFill", "gradFill", "blipFill", "pattFill", "grpFill");

    /* JADX INFO: renamed from: k4 */
    public static C8618qp m38869k4(AbstractC7414ck abstractC7414ck) {
        return m38875kk(abstractC7414ck, "http://schemas.microsoft.com/office/drawing/2008/diagram");
    }

    /* JADX INFO: renamed from: kk */
    public static C7394ca m38874kk(AbstractC7414ck abstractC7414ck) {
        C7394ca c7394ca;
        C8618qp c8618qpM38875kk = m38875kk(abstractC7414ck, "{909E8E84-426E-40DD-AFC4-6F175D3DCCD1}");
        if (c8618qpM38875kk == null) {
            return null;
        }
        try {
            C3144um c3144um = new C3144um(c8618qpM38875kk.m37126x1().getDocumentElement().getOuterXml());
            try {
                C13938ms c13938ms = new C13938ms(c3144um);
                try {
                    c13938ms.mo65026h4();
                    while (!c13938ms.mo65015ar()) {
                        c13938ms.mo65026h4();
                        int iM27428k4 = f28392k4.m27428k4(c13938ms.mo65023fa());
                        if (iM27428k4 == 0) {
                            c7394ca = new C7394ca("noFill", new C8130kt(c13938ms));
                        } else if (iM27428k4 == 1) {
                            c7394ca = new C7394ca("solidFill", new C8256md(c13938ms));
                        } else if (iM27428k4 == 2) {
                            c7394ca = new C7394ca("gradFill", new C8403o4(c13938ms));
                        } else if (iM27428k4 == 3) {
                            c7394ca = new C7394ca("blipFill", new C9220xo(c13938ms));
                        } else if (iM27428k4 == 4) {
                            c7394ca = new C7394ca("pattFill", new C7416cl(c13938ms));
                        } else if (iM27428k4 == 5) {
                            c7394ca = new C7394ca("grpFill", new C9112wh(c13938ms));
                        }
                        return c7394ca;
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

    /* JADX INFO: renamed from: to */
    public static C7394ca m38876to(AbstractC7414ck abstractC7414ck) {
        C8618qp c8618qpM38875kk = m38875kk(abstractC7414ck, "{AF507438-7753-43E0-B8FC-AC1667EBCBE1}");
        if (c8618qpM38875kk == null) {
            return null;
        }
        try {
            C3144um c3144um = new C3144um(c8618qpM38875kk.m37126x1().getDocumentElement().getOuterXml());
            try {
                C13938ms c13938ms = new C13938ms(c3144um);
                try {
                    c13938ms.mo65026h4();
                    while (!c13938ms.mo65015ar()) {
                        c13938ms.mo65026h4();
                        if ("effectLst".equals(c13938ms.mo65023fa())) {
                            return new C7394ca("effectLst", new C8490p3(c13938ms));
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

    /* JADX INFO: renamed from: x1 */
    public static C7632f3 m38877x1(AbstractC7414ck abstractC7414ck) {
        C8618qp c8618qpM38875kk = m38875kk(abstractC7414ck, "{E40237B7-FDA0-4F09-8148-C483321AD2D9}");
        if (c8618qpM38875kk == null) {
            return null;
        }
        try {
            C3144um c3144um = new C3144um(c8618qpM38875kk.m37126x1().getDocumentElement().getOuterXml());
            try {
                C13938ms c13938ms = new C13938ms(c3144um);
                try {
                    c13938ms.mo65026h4();
                    while (!c13938ms.mo65015ar()) {
                        c13938ms.mo65026h4();
                        if (c13938ms.mo65028jd() == 1) {
                            return new C7632f3(c13938ms);
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
    public static void m38870k4(AbstractC7414ck abstractC7414ck, C7632f3 c7632f3) {
        C8618qp c8618qpM38878x1 = m38878x1(abstractC7414ck, "{E40237B7-FDA0-4F09-8148-C483321AD2D9}");
        try {
            C3152yj c3152yj = new C3152yj();
            try {
                C13991ub c13991ub = new C13991ub(c3152yj, AbstractC6747ar.m26635ix());
                try {
                    c13991ub.mo12953k4("a", "ext", "http://schemas.openxmlformats.org/drawingml/2006/main");
                    c13991ub.m65806to("uri", "{E40237B7-FDA0-4F09-8148-C483321AD2D9}");
                    m38872k4(c13991ub, c7632f3);
                    c13991ub.mo21898jd();
                    c13991ub.mo21896h4();
                    c3152yj.setPosition(0L);
                    c8618qpM38878x1.m37126x1().load(c3152yj);
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

    /* JADX INFO: renamed from: kk */
    private static C8618qp m38875kk(AbstractC7414ck abstractC7414ck, String str) {
        if (abstractC7414ck == null) {
            return null;
        }
        for (C8290mt c8290mt : abstractC7414ck.mo29643k4()) {
            C13940my c13940myM65165k4 = c8290mt.m37126x1().getDocumentElement().getAttributes().m65165k4("uri");
            if (c13940myM65165k4 != null && C14113y2.m67363du(c13940myM65165k4.getValue(), str)) {
                return (C8618qp) c8290mt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public static C8618qp m38878x1(AbstractC7414ck abstractC7414ck, String str) {
        C8618qp c8618qpM38875kk = m38875kk(abstractC7414ck, str);
        if (c8618qpM38875kk != null) {
            return c8618qpM38875kk;
        }
        C8618qp c8618qp = (C8618qp) abstractC7414ck.mo29646x1();
        c8618qp.mo28310k4(C14113y2.m67402k4("<a:ext uri=\"{0}\" xmlns:a=\"{1}\"></a:ext>", str, "http://schemas.openxmlformats.org/drawingml/2006/main"));
        return c8618qp;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m38871k4(AbstractC7414ck abstractC7414ck, String str) {
        C8618qp c8618qpM38878x1 = m38878x1(abstractC7414ck, "http://schemas.microsoft.com/office/drawing/2008/diagram");
        C13981tl c13981tlCreateElement = c8618qpM38878x1.m37126x1().createElement("dsp", "dataModelExt", "http://schemas.microsoft.com/office/drawing/2008/diagram");
        c13981tlCreateElement.m65910kk("relId", str);
        c13981tlCreateElement.m65910kk("minVer", "http://schemas.openxmlformats.org/drawingml/2006/main");
        c8618qpM38878x1.m37126x1().getDocumentElement().appendChild(c13981tlCreateElement);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m38872k4(AbstractC13958qb abstractC13958qb, C7632f3 c7632f3) {
        abstractC13958qb.mo12953k4("dgm14", "cNvPr", "http://schemas.microsoft.com/office/drawing/2010/diagram");
        abstractC13958qb.m65806to("id", C13850af.m65147x1(c7632f3.m31579kk()));
        abstractC13958qb.m65806to("name", c7632f3.m31582to());
        if (!"".equals(c7632f3.m31570du())) {
            abstractC13958qb.m65806to("descr", c7632f3.m31570du());
        }
        if (c7632f3.m31572h4() != null) {
            abstractC13958qb.m65806to(NoteMeta.PROPERTY_TITLE, c7632f3.m31572h4());
        }
        if (c7632f3.m31581m9()) {
            abstractC13958qb.m65806to("hidden", c7632f3.m31581m9() ? "1" : "0");
        }
        if (c7632f3.m31571dy() != null) {
            m38873k4(abstractC13958qb, "hlinkClick", c7632f3.m31571dy());
        }
        if (c7632f3.m31569c5() != null) {
            m38873k4(abstractC13958qb, "hlinkHover", c7632f3.m31569c5());
        }
        abstractC13958qb.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    private static void m38873k4(AbstractC13958qb abstractC13958qb, String str, C7473dd c7473dd) {
        abstractC13958qb.mo12953k4("a", str, (String) null);
        abstractC13958qb.m65809x1("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        if (c7473dd.m30297x1() != null) {
            abstractC13958qb.m65809x1("r", "id", null, c7473dd.m30297x1());
        }
        if (!"".equals(c7473dd.m30291kk())) {
            abstractC13958qb.m65806to("invalidUrl", c7473dd.m30291kk());
        }
        if (!"".equals(c7473dd.m30295to())) {
            abstractC13958qb.m65806to("action", c7473dd.m30295to());
        }
        if (!"".equals(c7473dd.m30282du())) {
            abstractC13958qb.m65806to("tgtFrame", c7473dd.m30282du());
        }
        if (!"".equals(c7473dd.m30285h4())) {
            abstractC13958qb.m65806to("tooltip", c7473dd.m30285h4());
        }
        if (!c7473dd.m30294m9()) {
            abstractC13958qb.m65806to("history", c7473dd.m30294m9() ? "1" : "0");
        }
        if (c7473dd.m30284dy()) {
            abstractC13958qb.m65806to("highlightClick", c7473dd.m30284dy() ? "1" : "0");
        }
        if (c7473dd.m30280c5()) {
            abstractC13958qb.m65806to("endSnd", c7473dd.m30280c5() ? "1" : "0");
        }
        if (c7473dd.m30286jd() != null) {
            abstractC13958qb.mo12953k4("a", "snd", (String) null);
            abstractC13958qb.m65801du("r", "embed", c7473dd.m30286jd().m38951k4());
            if (!"".equals(c7473dd.m30286jd().m38955x1())) {
                abstractC13958qb.m65806to("name", c7473dd.m30286jd().m38955x1());
            }
            if (c7473dd.m30286jd().m38954kk()) {
                abstractC13958qb.m65806to("builtIn", c7473dd.m30286jd().m38954kk() ? "1" : "0");
            }
            abstractC13958qb.mo21898jd();
        }
        abstractC13958qb.mo21898jd();
    }
}
