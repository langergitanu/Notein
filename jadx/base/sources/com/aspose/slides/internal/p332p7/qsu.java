package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class qsu extends AbstractC7361bz {

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f29000dy = new C7017h4("presentation:use-header-name", "presentation:use-footer-name", "presentation:use-date-time-name", "style:page-layout-name", "draw:style-name", "forms", DrawToolFactory.LASSO_TYPE_RECT, "line", "polyline", "polygon", "regular-polygon", "path", "circle", "ellipse", "g", "page-thumbnail", "frame", "measure", "caption", "connector", "control", "scene", "custom-shape");

    /* JADX INFO: renamed from: du */
    private String f29001du;

    /* JADX INFO: renamed from: h4 */
    private wv6 f29002h4;

    /* JADX INFO: renamed from: k4 */
    private String f29003k4;

    /* JADX INFO: renamed from: kk */
    private String f29004kk;

    /* JADX INFO: renamed from: m9 */
    private List<C7394ca> f29005m9;

    /* JADX INFO: renamed from: to */
    private String f29006to;

    /* JADX INFO: renamed from: x1 */
    private String f29007x1;

    public qsu() {
        m39653to();
    }

    /* JADX INFO: renamed from: x1 */
    public final List<C7394ca> m39656x1() {
        return this.f29005m9;
    }

    public qsu(final AbstractC13912i5 abstractC13912i5) {
        m39653to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.qsu.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = qsu.f29000dy.m27428k4(str);
                if (iM27428k4 == 0) {
                    qsu.this.f29003k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    qsu.this.f29007x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    qsu.this.f29004kk = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    qsu.this.f29006to = str2;
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                qsu.this.f29001du = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.qsu.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (qsu.f29000dy.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 5:
                        qsu.this.f29002h4 = new wv6(abstractC13912i5);
                        return true;
                    case 6:
                        yxk yxkVar = new yxk(abstractC13912i5);
                        list = qsu.this.f29005m9;
                        c7394ca = new C7394ca(DrawToolFactory.LASSO_TYPE_RECT, yxkVar);
                        break;
                    case 7:
                        er2 er2Var = new er2(abstractC13912i5);
                        list = qsu.this.f29005m9;
                        c7394ca = new C7394ca("line", er2Var);
                        break;
                    case 8:
                        rpj rpjVar = new rpj(abstractC13912i5);
                        list = qsu.this.f29005m9;
                        c7394ca = new C7394ca("polyline", rpjVar);
                        break;
                    case 9:
                        z4k z4kVar = new z4k(abstractC13912i5);
                        list = qsu.this.f29005m9;
                        c7394ca = new C7394ca("polygon", z4kVar);
                        break;
                    case 10:
                        em0 em0Var = new em0(abstractC13912i5);
                        list = qsu.this.f29005m9;
                        c7394ca = new C7394ca("regular-polygon", em0Var);
                        break;
                    case 11:
                        tzu tzuVar = new tzu(abstractC13912i5);
                        list = qsu.this.f29005m9;
                        c7394ca = new C7394ca("path", tzuVar);
                        break;
                    case 12:
                        fmt fmtVar = new fmt(abstractC13912i5);
                        list = qsu.this.f29005m9;
                        c7394ca = new C7394ca("circle", fmtVar);
                        break;
                    case 13:
                        sd3 sd3Var = new sd3(abstractC13912i5);
                        list = qsu.this.f29005m9;
                        c7394ca = new C7394ca("ellipse", sd3Var);
                        break;
                    case 14:
                        pnk pnkVar = new pnk(abstractC13912i5);
                        list = qsu.this.f29005m9;
                        c7394ca = new C7394ca("g", pnkVar);
                        break;
                    case 15:
                        klm klmVar = new klm(abstractC13912i5);
                        list = qsu.this.f29005m9;
                        c7394ca = new C7394ca("page-thumbnail", klmVar);
                        break;
                    case 16:
                        vtn vtnVar = new vtn(abstractC13912i5);
                        list = qsu.this.f29005m9;
                        c7394ca = new C7394ca("frame", vtnVar);
                        break;
                    case 17:
                        s0k s0kVar = new s0k(abstractC13912i5);
                        list = qsu.this.f29005m9;
                        c7394ca = new C7394ca("measure", s0kVar);
                        break;
                    case 18:
                        zz0 zz0Var = new zz0(abstractC13912i5);
                        list = qsu.this.f29005m9;
                        c7394ca = new C7394ca("caption", zz0Var);
                        break;
                    case 19:
                        p9u p9uVar = new p9u(abstractC13912i5);
                        list = qsu.this.f29005m9;
                        c7394ca = new C7394ca("connector", p9uVar);
                        break;
                    case 20:
                        suk sukVar = new suk(abstractC13912i5);
                        list = qsu.this.f29005m9;
                        c7394ca = new C7394ca("control", sukVar);
                        break;
                    case 21:
                        hhy hhyVar = new hhy(abstractC13912i5);
                        list = qsu.this.f29005m9;
                        c7394ca = new C7394ca("scene", hhyVar);
                        break;
                    case 22:
                        h7e h7eVar = new h7e(abstractC13912i5);
                        list = qsu.this.f29005m9;
                        c7394ca = new C7394ca("custom-shape", h7eVar);
                        break;
                    default:
                        return false;
                }
                list.addItem(c7394ca);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: to */
    private void m39653to() {
        this.f29005m9 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m39655k4() {
        return this.f29006to;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f29003k4;
        if (str3 != null) {
            c3059ii.m12955x1("presentation:use-header-name", str3);
        }
        String str4 = this.f29007x1;
        if (str4 != null) {
            c3059ii.m12955x1("presentation:use-footer-name", str4);
        }
        String str5 = this.f29004kk;
        if (str5 != null) {
            c3059ii.m12955x1("presentation:use-date-time-name", str5);
        }
        String str6 = this.f29006to;
        if (str6 != null) {
            c3059ii.m12955x1("style:page-layout-name", str6);
        }
        String str7 = this.f29001du;
        if (str7 != null) {
            c3059ii.m12955x1("draw:style-name", str7);
        }
        wv6 wv6Var = this.f29002h4;
        if (wv6Var != null) {
            wv6Var.mo6846k4("office", c3059ii, "forms");
        }
        List.Enumerator<C7394ca> it = this.f29005m9.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f29000dy.m27428k4(next.m29539k4())) {
                    case 6:
                        ((yxk) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 7:
                        ((er2) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 8:
                        ((rpj) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 9:
                        ((z4k) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 10:
                        ((em0) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 11:
                        ((tzu) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 12:
                        ((fmt) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 13:
                        ((sd3) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 14:
                        ((pnk) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 15:
                        ((klm) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 16:
                        ((vtn) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 17:
                        ((s0k) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 18:
                        ((zz0) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 19:
                        ((p9u) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 20:
                        ((suk) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 21:
                        ((hhy) next.m29541kk()).mo6846k4("dr3d", c3059ii, next.m29539k4());
                        break;
                    case 22:
                        ((h7e) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        c3059ii.mo21898jd();
    }
}
