package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class kia extends AbstractC7361bz {

    /* JADX INFO: renamed from: yj */
    private static final C7017h4 f25678yj = new C7017h4("style:name", "style:display-name", "style:page-layout-name", "draw:style-name", "style:next-style-name", "header", "header-left", "footer", "footer-left", "forms", "style", DrawToolFactory.LASSO_TYPE_RECT, "line", "polyline", "polygon", "regular-polygon", "path", "circle", "ellipse", "g", "page-thumbnail", "frame", "measure", "caption", "connector", "control", "scene", "custom-shape", "notes");

    /* JADX INFO: renamed from: c5 */
    private gga f25679c5;

    /* JADX INFO: renamed from: ck */
    private List<lzc> f25680ck;

    /* JADX INFO: renamed from: du */
    private String f25681du;

    /* JADX INFO: renamed from: dy */
    private psc f25682dy;

    /* JADX INFO: renamed from: fa */
    private List<C7394ca> f25683fa;

    /* JADX INFO: renamed from: h4 */
    private twr f25684h4;

    /* JADX INFO: renamed from: jd */
    private wv6 f25685jd;

    /* JADX INFO: renamed from: k4 */
    private String f25686k4;

    /* JADX INFO: renamed from: kk */
    private String f25687kk;

    /* JADX INFO: renamed from: m9 */
    private dmj f25688m9;

    /* JADX INFO: renamed from: to */
    private String f25689to;

    /* JADX INFO: renamed from: up */
    private qsu f25690up;

    /* JADX INFO: renamed from: x1 */
    private String f25691x1;

    public kia() {
        m35418m9();
        this.f25684h4 = new twr();
        this.f25682dy = new psc();
    }

    /* JADX INFO: renamed from: m9 */
    private void m35418m9() {
        this.f25680ck = new List<>();
        this.f25683fa = new List<>();
    }

    /* JADX INFO: renamed from: du */
    public final qsu m35422du() {
        return this.f25690up;
    }

    /* JADX INFO: renamed from: kk */
    public final String m35425kk() {
        return this.f25689to;
    }

    /* JADX INFO: renamed from: to */
    public final List<C7394ca> m35427to() {
        return this.f25683fa;
    }

    public kia(final AbstractC13912i5 abstractC13912i5) {
        m35418m9();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.kia.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = kia.f25678yj.m27428k4(str);
                if (iM27428k4 == 0) {
                    kia.this.f25686k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    kia.this.f25691x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    kia.this.f25687kk = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    kia.this.f25689to = str2;
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                kia.this.f25681du = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.kia.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (kia.f25678yj.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 5:
                        kia.this.f25684h4 = new twr(abstractC13912i5);
                        return true;
                    case 6:
                        kia.this.f25688m9 = new dmj(abstractC13912i5);
                        return true;
                    case 7:
                        kia.this.f25682dy = new psc(abstractC13912i5);
                        return true;
                    case 8:
                        kia.this.f25679c5 = new gga(abstractC13912i5);
                        return true;
                    case 9:
                        kia.this.f25685jd = new wv6(abstractC13912i5);
                        return true;
                    case 10:
                        kia.this.f25680ck.addItem(new lzc(abstractC13912i5));
                        return true;
                    case 11:
                        yxk yxkVar = new yxk(abstractC13912i5);
                        list = kia.this.f25683fa;
                        c7394ca = new C7394ca(DrawToolFactory.LASSO_TYPE_RECT, yxkVar);
                        break;
                    case 12:
                        er2 er2Var = new er2(abstractC13912i5);
                        list = kia.this.f25683fa;
                        c7394ca = new C7394ca("line", er2Var);
                        break;
                    case 13:
                        rpj rpjVar = new rpj(abstractC13912i5);
                        list = kia.this.f25683fa;
                        c7394ca = new C7394ca("polyline", rpjVar);
                        break;
                    case 14:
                        z4k z4kVar = new z4k(abstractC13912i5);
                        list = kia.this.f25683fa;
                        c7394ca = new C7394ca("polygon", z4kVar);
                        break;
                    case 15:
                        em0 em0Var = new em0(abstractC13912i5);
                        list = kia.this.f25683fa;
                        c7394ca = new C7394ca("regular-polygon", em0Var);
                        break;
                    case 16:
                        tzu tzuVar = new tzu(abstractC13912i5);
                        list = kia.this.f25683fa;
                        c7394ca = new C7394ca("path", tzuVar);
                        break;
                    case 17:
                        fmt fmtVar = new fmt(abstractC13912i5);
                        list = kia.this.f25683fa;
                        c7394ca = new C7394ca("circle", fmtVar);
                        break;
                    case 18:
                        sd3 sd3Var = new sd3(abstractC13912i5);
                        list = kia.this.f25683fa;
                        c7394ca = new C7394ca("ellipse", sd3Var);
                        break;
                    case 19:
                        pnk pnkVar = new pnk(abstractC13912i5);
                        list = kia.this.f25683fa;
                        c7394ca = new C7394ca("g", pnkVar);
                        break;
                    case 20:
                        klm klmVar = new klm(abstractC13912i5);
                        list = kia.this.f25683fa;
                        c7394ca = new C7394ca("page-thumbnail", klmVar);
                        break;
                    case 21:
                        vtn vtnVar = new vtn(abstractC13912i5);
                        list = kia.this.f25683fa;
                        c7394ca = new C7394ca("frame", vtnVar);
                        break;
                    case 22:
                        s0k s0kVar = new s0k(abstractC13912i5);
                        list = kia.this.f25683fa;
                        c7394ca = new C7394ca("measure", s0kVar);
                        break;
                    case 23:
                        zz0 zz0Var = new zz0(abstractC13912i5);
                        list = kia.this.f25683fa;
                        c7394ca = new C7394ca("caption", zz0Var);
                        break;
                    case 24:
                        p9u p9uVar = new p9u(abstractC13912i5);
                        list = kia.this.f25683fa;
                        c7394ca = new C7394ca("connector", p9uVar);
                        break;
                    case 25:
                        suk sukVar = new suk(abstractC13912i5);
                        list = kia.this.f25683fa;
                        c7394ca = new C7394ca("control", sukVar);
                        break;
                    case 26:
                        hhy hhyVar = new hhy(abstractC13912i5);
                        list = kia.this.f25683fa;
                        c7394ca = new C7394ca("scene", hhyVar);
                        break;
                    case 27:
                        h7e h7eVar = new h7e(abstractC13912i5);
                        list = kia.this.f25683fa;
                        c7394ca = new C7394ca("custom-shape", h7eVar);
                        break;
                    case 28:
                        kia.this.f25690up = new qsu(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
                list.addItem(c7394ca);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m35423k4(String str) {
        C7394ca c7394ca;
        switch (f25678yj.m27428k4(str)) {
            case 11:
                c7394ca = new C7394ca(DrawToolFactory.LASSO_TYPE_RECT, new yxk());
                break;
            case 12:
                c7394ca = new C7394ca("line", new er2());
                break;
            case 13:
                c7394ca = new C7394ca("polyline", new rpj());
                break;
            case 14:
                c7394ca = new C7394ca("polygon", new z4k());
                break;
            case 15:
                c7394ca = new C7394ca("regular-polygon", new em0());
                break;
            case 16:
                c7394ca = new C7394ca("path", new tzu());
                break;
            case 17:
                c7394ca = new C7394ca("circle", new fmt());
                break;
            case 18:
                c7394ca = new C7394ca("ellipse", new sd3());
                break;
            case 19:
                c7394ca = new C7394ca("g", new pnk());
                break;
            case 20:
                c7394ca = new C7394ca("page-thumbnail", new klm());
                break;
            case 21:
                c7394ca = new C7394ca("frame", new vtn());
                break;
            case 22:
                c7394ca = new C7394ca("measure", new s0k());
                break;
            case 23:
                c7394ca = new C7394ca("caption", new zz0());
                break;
            case 24:
                c7394ca = new C7394ca("connector", new p9u());
                break;
            case 25:
                c7394ca = new C7394ca("control", new suk());
                break;
            case 26:
                c7394ca = new C7394ca("scene", new hhy());
                break;
            case 27:
                c7394ca = new C7394ca("custom-shape", new h7e());
                break;
            default:
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        this.f25683fa.addItem(c7394ca);
        return c7394ca;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m35429x1() {
        return this.f25687kk;
    }

    /* JADX INFO: renamed from: kk */
    public final void m35426kk(String str) {
        this.f25687kk = str;
    }

    /* JADX INFO: renamed from: to */
    public final void m35428to(String str) {
        this.f25689to = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m35430x1(String str) {
        this.f25686k4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m35424k4() {
        return this.f25686k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("style:name", this.f25686k4);
        String str3 = this.f25691x1;
        if (str3 != null) {
            c3059ii.m12955x1("style:display-name", str3);
        }
        c3059ii.m12955x1("style:page-layout-name", this.f25687kk);
        String str4 = this.f25689to;
        if (str4 != null) {
            c3059ii.m12955x1("draw:style-name", str4);
        }
        String str5 = this.f25681du;
        if (str5 != null) {
            c3059ii.m12955x1("style:next-style-name", str5);
        }
        twr twrVar = this.f25684h4;
        if (twrVar != null) {
            twrVar.mo6846k4("style", c3059ii, "header");
        }
        dmj dmjVar = this.f25688m9;
        if (dmjVar != null) {
            dmjVar.mo6846k4("style", c3059ii, "header-left");
        }
        psc pscVar = this.f25682dy;
        if (pscVar != null) {
            pscVar.mo6846k4("style", c3059ii, "footer");
        }
        gga ggaVar = this.f25679c5;
        if (ggaVar != null) {
            ggaVar.mo6846k4("style", c3059ii, "footer-left");
        }
        wv6 wv6Var = this.f25685jd;
        if (wv6Var != null) {
            wv6Var.mo6846k4("office", c3059ii, "forms");
        }
        List.Enumerator<C7394ca> it = this.f25680ck.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("style", c3059ii, "style");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = this.f25683fa.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f25678yj.m27428k4(next.m29539k4())) {
                    case 11:
                        ((yxk) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 12:
                        ((er2) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 13:
                        ((rpj) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 14:
                        ((z4k) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 15:
                        ((em0) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 16:
                        ((tzu) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 17:
                        ((fmt) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 18:
                        ((sd3) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 19:
                        ((pnk) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 20:
                        ((klm) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 21:
                        ((vtn) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 22:
                        ((s0k) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 23:
                        ((zz0) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 24:
                        ((p9u) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 25:
                        ((suk) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 26:
                        ((hhy) next.m29541kk()).mo6846k4("dr3d", c3059ii, next.m29539k4());
                        break;
                    case 27:
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
        qsu qsuVar = this.f25690up;
        if (qsuVar != null) {
            qsuVar.mo6846k4("presentation", c3059ii, "notes");
        }
        c3059ii.mo21898jd();
    }
}
