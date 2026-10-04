package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.IDataLabel;
import com.aspose.slides.IDataLabelFormat;
import com.aspose.slides.ILayoutable;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3144um;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.AbstractC13958qb;
import com.aspose.slides.p559ms.System.Xml.C13938ms;
import com.aspose.slides.p559ms.System.Xml.C13940my;
import com.miui.penengine.p596e.C18773h;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.qf */
/* JADX INFO: loaded from: classes4.dex */
public class C8599qf {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f28856c5 = new C7017h4("showLeaderLines", "spPr", "leaderLines", "layout", "dlblFieldTable", "showDataLabelsRange");

    /* JADX INFO: renamed from: du */
    private C9387zo f28857du;

    /* JADX INFO: renamed from: dy */
    private C8093kj f28858dy;

    /* JADX INFO: renamed from: h4 */
    private C8828t1 f28859h4;

    /* JADX INFO: renamed from: k4 */
    private C8828t1 f28860k4;

    /* JADX INFO: renamed from: kk */
    private C8087kh f28861kk;

    /* JADX INFO: renamed from: m9 */
    private List<C8093kj> f28862m9;

    /* JADX INFO: renamed from: to */
    private C7943in f28863to;

    /* JADX INFO: renamed from: x1 */
    private C8087kh f28864x1;

    /* JADX WARN: Finally extract failed */
    public C8599qf(AbstractC7414ck abstractC7414ck) {
        C3144um c3144um;
        m39471k4(new List<>());
        if (abstractC7414ck == null) {
            return;
        }
        this.f28858dy = m39460k4(abstractC7414ck);
        m39461k4(m39480m9(), abstractC7414ck);
        C8093kj c8093kj = this.f28858dy;
        if (c8093kj == null) {
            return;
        }
        try {
            for (AbstractC13901ga abstractC13901ga : c8093kj.m37126x1().getDocumentElement()) {
                int iM27428k4 = f28856c5.m27428k4(abstractC13901ga.getLocalName());
                if (iM27428k4 == 0) {
                    c3144um = new C3144um(abstractC13901ga.getOuterXml());
                    try {
                        C13938ms c13938ms = new C13938ms(c3144um);
                        try {
                            c13938ms.m65616kk(true);
                            while (!c13938ms.mo65015ar() && c13938ms.mo65028jd() != 1) {
                                c13938ms.mo65026h4();
                            }
                            if (!c13938ms.mo65015ar()) {
                                m39476k4(new C8828t1(c13938ms));
                            }
                            c13938ms.dispose();
                        } catch (Throwable th) {
                            c13938ms.dispose();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else if (iM27428k4 == 1) {
                    c3144um = new C3144um(abstractC13901ga.getOuterXml());
                    try {
                        C13938ms c13938ms2 = new C13938ms(c3144um);
                        try {
                            c13938ms2.m65616kk(true);
                            while (!c13938ms2.mo65015ar() && c13938ms2.mo65028jd() != 1) {
                                c13938ms2.mo65026h4();
                            }
                            if (!c13938ms2.mo65015ar()) {
                                m39483x1(new C8087kh(c13938ms2));
                            }
                            c13938ms2.dispose();
                        } catch (Throwable th3) {
                            c13938ms2.dispose();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                } else if (iM27428k4 == 2) {
                    c3144um = new C3144um(abstractC13901ga.getOuterXml());
                    try {
                        C13938ms c13938ms3 = new C13938ms(c3144um);
                        try {
                            c13938ms3.m65616kk(true);
                            while (!c13938ms3.mo65015ar() && c13938ms3.mo65028jd() != 1) {
                                c13938ms3.mo65026h4();
                            }
                            if (!c13938ms3.mo65015ar()) {
                                m39475k4(new C7571eh(c13938ms3).m31083x1());
                            }
                            c13938ms3.dispose();
                        } catch (Throwable th5) {
                            c13938ms3.dispose();
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                } else if (iM27428k4 == 3) {
                    c3144um = new C3144um(abstractC13901ga.getOuterXml());
                    try {
                        C13938ms c13938ms4 = new C13938ms(c3144um);
                        try {
                            c13938ms4.m65616kk(true);
                            while (!c13938ms4.mo65015ar() && c13938ms4.mo65028jd() != 1) {
                                c13938ms4.mo65026h4();
                            }
                            if (!c13938ms4.mo65015ar()) {
                                m39474k4(new C7943in(c13938ms4));
                            }
                            c13938ms4.dispose();
                        } catch (Throwable th7) {
                            c13938ms4.dispose();
                            throw th7;
                        }
                    } catch (Throwable th8) {
                        throw th8;
                    }
                } else if (iM27428k4 == 4) {
                    c3144um = new C3144um(abstractC13901ga.getOuterXml());
                    try {
                        C13938ms c13938ms5 = new C13938ms(c3144um);
                        try {
                            c13938ms5.m65616kk(true);
                            while (!c13938ms5.mo65015ar() && c13938ms5.mo65028jd() != 1) {
                                c13938ms5.mo65026h4();
                            }
                            if (!c13938ms5.mo65015ar()) {
                                m39477k4(new C9387zo(c13938ms5));
                            }
                            c13938ms5.dispose();
                        } catch (Throwable th9) {
                            c13938ms5.dispose();
                            throw th9;
                        }
                    } catch (Throwable th10) {
                        throw th10;
                    }
                } else if (iM27428k4 == 5) {
                    c3144um = new C3144um(abstractC13901ga.getOuterXml());
                    try {
                        C13938ms c13938ms6 = new C13938ms(c3144um);
                        try {
                            c13938ms6.m65616kk(true);
                            while (!c13938ms6.mo65015ar() && c13938ms6.mo65028jd() != 1) {
                                c13938ms6.mo65026h4();
                            }
                            if (!c13938ms6.mo65015ar()) {
                                m39484x1(new C8828t1(c13938ms6));
                            }
                            c13938ms6.dispose();
                        } catch (Throwable th11) {
                            c13938ms6.dispose();
                            throw th11;
                        }
                    } finally {
                        c3144um.dispose();
                    }
                }
            }
        } catch (RuntimeException e) {
            C3085sv.m13082k4(e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C8093kj m39460k4(AbstractC7414ck abstractC7414ck) {
        if (abstractC7414ck == null) {
            return null;
        }
        for (C8290mt c8290mt : abstractC7414ck.mo29643k4()) {
            C13940my c13940myM65165k4 = c8290mt.m37126x1().getDocumentElement().getAttributes().m65165k4("uri");
            if (c13940myM65165k4 != null && "{CE6537A1-D6FC-4f65-9D91-7224C49458BB}".equals(c13940myM65165k4.getValue())) {
                return (C8093kj) c8290mt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: du */
    public final C9387zo m39466du() {
        return this.f28857du;
    }

    /* JADX INFO: renamed from: dy */
    public final C8093kj m39467dy() {
        return this.f28858dy;
    }

    /* JADX INFO: renamed from: h4 */
    public final C8828t1 m39468h4() {
        return this.f28859h4;
    }

    /* JADX INFO: renamed from: kk */
    public final C8087kh m39479kk() {
        return this.f28861kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final List<C8093kj> m39480m9() {
        return this.f28862m9;
    }

    /* JADX INFO: renamed from: to */
    public final C7943in m39481to() {
        return this.f28863to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8087kh m39482x1() {
        return this.f28864x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final C8093kj m39469k4(AbstractC7414ck abstractC7414ck, String str) {
        C8093kj c8093kjM39460k4 = m39460k4(abstractC7414ck);
        if (c8093kjM39460k4 != null) {
            return c8093kjM39460k4;
        }
        C8093kj c8093kj = (C8093kj) abstractC7414ck.mo29646x1();
        c8093kj.mo28310k4(C14113y2.m67402k4("<c:ext xmlns:c =\"{0}\" uri=\"{1}\" xmlns:c15=\"{2}\" xmlns:a=\"{3}\"></c:ext>", "http://schemas.openxmlformats.org/drawingml/2006/chart", str, "http://schemas.microsoft.com/office/drawing/2012/chart", "http://schemas.openxmlformats.org/drawingml/2006/main"));
        return c8093kj;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m39483x1(C8087kh c8087kh) {
        this.f28861kk = c8087kh;
    }

    /* JADX INFO: renamed from: k4 */
    public final C8828t1 m39470k4() {
        return this.f28860k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m39484x1(C8828t1 c8828t1) {
        this.f28859h4 = c8828t1;
    }

    /* JADX INFO: renamed from: x1 */
    private void m39465x1(AbstractC13958qb abstractC13958qb) {
        abstractC13958qb.mo12953k4("c15", "showDataLabelsRange", "http://schemas.microsoft.com/office/drawing/2012/chart");
        abstractC13958qb.m65806to("val", "1");
        abstractC13958qb.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39471k4(List<C8093kj> list) {
        this.f28862m9 = list;
    }

    /* JADX INFO: renamed from: k4 */
    private void m39461k4(List<C8093kj> list, AbstractC7414ck abstractC7414ck) {
        if (abstractC7414ck == null) {
            return;
        }
        for (C8290mt c8290mt : abstractC7414ck.mo29643k4()) {
            C13940my c13940myM65165k4 = c8290mt.m37126x1().getDocumentElement().getAttributes().m65165k4("uri");
            if (c13940myM65165k4 == null || !"{CE6537A1-D6FC-4f65-9D91-7224C49458BB}".equals(c13940myM65165k4.getValue())) {
                list.addItem((C8093kj) c8290mt);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39472k4(IDataLabel iDataLabel, C8087kh c8087kh, boolean z, C8093kj[] c8093kjArr, AbstractC7414ck abstractC7414ck) {
        if (c8087kh != null || iDataLabel.getDataLabelFormat().getShowLabelValueFromCell() || z || c8093kjArr.length != 0) {
            C8093kj c8093kjM39469k4 = m39469k4(abstractC7414ck, "{CE6537A1-D6FC-4f65-9D91-7224C49458BB}");
            if (iDataLabel.getDataLabelFormat().getShowLabelValueFromCell() || c8087kh != null || z) {
                try {
                    C3152yj c3152yj = new C3152yj();
                    try {
                        C3059ii c3059ii = new C3059ii(c3152yj, AbstractC6747ar.m26635ix());
                        try {
                            c3059ii.mo12953k4("c", "ext", "http://schemas.openxmlformats.org/drawingml/2006/chart");
                            if (c3059ii.mo12952k4("http://schemas.microsoft.com/office/drawing/2012/chart") == null) {
                                c3059ii.m12954to("xmlns", "c15", null, "http://schemas.microsoft.com/office/drawing/2012/chart");
                            }
                            c3059ii.m12955x1("uri", "{CE6537A1-D6FC-4f65-9D91-7224C49458BB}");
                            if (c8087kh != null) {
                                c8087kh.mo6846k4("c15", c3059ii, "spPr");
                            }
                            if (z) {
                                m39464k4(c3059ii, iDataLabel);
                            }
                            if (iDataLabel.getDataLabelFormat().getShowLabelValueFromCell()) {
                                m39465x1(c3059ii);
                            }
                            c3059ii.mo21898jd();
                            c3059ii.mo21896h4();
                            c3152yj.setPosition(0L);
                            c8093kjM39469k4.m37126x1().load(c3152yj);
                            c3059ii.dispose();
                        } catch (Throwable th) {
                            c3059ii.dispose();
                            throw th;
                        }
                    } finally {
                        c3152yj.dispose();
                    }
                } catch (RuntimeException e) {
                    C3085sv.m13082k4(e);
                }
            }
            if (c8093kjArr.length == 0) {
                return;
            }
            for (C8093kj c8093kj : c8093kjArr) {
                abstractC7414ck.mo29646x1().mo28310k4(c8093kj.mo28309k4());
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39473k4(IDataLabelFormat iDataLabelFormat, C8087kh c8087kh, boolean z, C8093kj[] c8093kjArr, AbstractC7414ck abstractC7414ck) {
        if (c8087kh != null || iDataLabelFormat.getShowLabelAsDataCallout() || z || iDataLabelFormat.getShowLabelValueFromCell() || c8093kjArr.length != 0) {
            C8093kj c8093kjM39469k4 = m39469k4(abstractC7414ck, "{CE6537A1-D6FC-4f65-9D91-7224C49458BB}");
            if (c8087kh != null || iDataLabelFormat.getShowLabelValueFromCell() || z) {
                try {
                    C3152yj c3152yj = new C3152yj();
                    try {
                        C3059ii c3059ii = new C3059ii(c3152yj, AbstractC6747ar.m26635ix());
                        try {
                            c3059ii.mo12953k4("c", "ext", "http://schemas.openxmlformats.org/drawingml/2006/chart");
                            c3059ii.m12955x1("uri", "{CE6537A1-D6FC-4f65-9D91-7224C49458BB}");
                            if (c3059ii.mo12952k4("http://schemas.microsoft.com/office/drawing/2012/chart") == null) {
                                c3059ii.m12954to("xmlns", "c15", null, "http://schemas.microsoft.com/office/drawing/2012/chart");
                            }
                            if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main") == null) {
                                c3059ii.m12954to("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
                            }
                            if (c8087kh != null) {
                                c8087kh.mo6846k4("c15", c3059ii, "spPr");
                            }
                            if (z) {
                                m39463k4((AbstractC13958qb) c3059ii);
                            }
                            if (m39482x1() != null) {
                                m39462k4(c3059ii);
                            }
                            if (iDataLabelFormat.getShowLabelValueFromCell()) {
                                m39465x1(c3059ii);
                            }
                            c3059ii.mo21898jd();
                            c3059ii.mo21896h4();
                            c3152yj.setPosition(0L);
                            c8093kjM39469k4.m37126x1().load(c3152yj);
                            c3059ii.dispose();
                        } catch (Throwable th) {
                            c3059ii.dispose();
                            throw th;
                        }
                    } finally {
                        c3152yj.dispose();
                    }
                } catch (RuntimeException e) {
                    C3085sv.m13082k4(e);
                }
            }
            if (c8093kjArr.length == 0) {
                return;
            }
            for (C8093kj c8093kj : c8093kjArr) {
                abstractC7414ck.mo29646x1().mo28310k4(c8093kj.mo28309k4());
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m39462k4(C3059ii c3059ii) {
        c3059ii.mo12953k4("c15", "leaderLines", "http://schemas.microsoft.com/office/drawing/2012/chart");
        m39482x1().mo6846k4("c", c3059ii, "spPr");
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39474k4(C7943in c7943in) {
        this.f28863to = c7943in;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39475k4(C8087kh c8087kh) {
        this.f28864x1 = c8087kh;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39476k4(C8828t1 c8828t1) {
        this.f28860k4 = c8828t1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39477k4(C9387zo c9387zo) {
        this.f28857du = c9387zo;
    }

    /* JADX INFO: renamed from: k4 */
    private void m39463k4(AbstractC13958qb abstractC13958qb) {
        abstractC13958qb.mo12953k4("c15", "showLeaderLines", "http://schemas.microsoft.com/office/drawing/2012/chart");
        abstractC13958qb.m65806to("val", "1");
        abstractC13958qb.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    private void m39464k4(AbstractC13958qb abstractC13958qb, ILayoutable iLayoutable) {
        abstractC13958qb.mo12953k4("c15", "layout", "http://schemas.microsoft.com/office/drawing/2012/chart");
        abstractC13958qb.mo12953k4("c", "manualLayout", "http://schemas.openxmlformats.org/drawingml/2006/chart");
        abstractC13958qb.mo12953k4("c", "w", "http://schemas.openxmlformats.org/drawingml/2006/chart");
        abstractC13958qb.m65806to("val", C14064he.m66711k4(iLayoutable.getWidth(), (InterfaceC14073kp) C11697x1.m55250kk()));
        abstractC13958qb.mo21898jd();
        abstractC13958qb.mo12953k4("c", C18773h.f57233c, "http://schemas.openxmlformats.org/drawingml/2006/chart");
        abstractC13958qb.m65806to("val", C14064he.m66711k4(iLayoutable.getHeight(), (InterfaceC14073kp) C11697x1.m55250kk()));
        abstractC13958qb.mo21898jd();
        abstractC13958qb.mo21898jd();
        abstractC13958qb.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m39478k4(C8093kj c8093kj) {
        return c8093kj == null || c8093kj.m37126x1().getDocumentElement().getChildNodes().mo23932k4() == 0;
    }
}
