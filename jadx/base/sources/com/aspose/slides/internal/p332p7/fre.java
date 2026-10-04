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
public class fre extends AbstractC7361bz {

    /* JADX INFO: renamed from: ks */
    private static final C7017h4 f23000ks = new C7017h4("presentation:use-header-name", "presentation:use-footer-name", "presentation:use-date-time-name", "draw:name", "draw:style-name", "draw:master-page-name", "presentation:presentation-page-layout-name", "draw:id", "draw:nav-order", "forms", DrawToolFactory.LASSO_TYPE_RECT, "line", "polyline", "polygon", "regular-polygon", "path", "circle", "ellipse", "g", "page-thumbnail", "frame", "measure", "caption", "connector", "control", "scene", "custom-shape", "animations", "animate", "set", "animateMotion", "animateColor", "animateTransform", "transitionFilter", "par", "seq", "iterate", "audio", "command", "notes", "annotation");

    /* JADX INFO: renamed from: c5 */
    private String f23001c5;

    /* JADX INFO: renamed from: ck */
    private List<C7394ca> f23002ck;

    /* JADX INFO: renamed from: du */
    private String f23003du;

    /* JADX INFO: renamed from: dy */
    private String f23004dy;

    /* JADX INFO: renamed from: fa */
    private C7394ca f23005fa;

    /* JADX INFO: renamed from: h4 */
    private String f23006h4;

    /* JADX INFO: renamed from: jd */
    private wv6 f23007jd;

    /* JADX INFO: renamed from: k4 */
    private String f23008k4;

    /* JADX INFO: renamed from: kk */
    private String f23009kk;

    /* JADX INFO: renamed from: m9 */
    private String f23010m9;

    /* JADX INFO: renamed from: to */
    private String f23011to;

    /* JADX INFO: renamed from: up */
    private qsu f23012up;

    /* JADX INFO: renamed from: x1 */
    private String f23013x1;

    /* JADX INFO: renamed from: yj */
    private List<fx0> f23014yj;

    public fre() {
        m32018fa();
    }

    /* JADX INFO: renamed from: fa */
    private void m32018fa() {
        this.f23002ck = new List<>();
        this.f23014yj = new List<>();
    }

    /* JADX INFO: renamed from: c5 */
    public final qsu m32030c5() {
        return this.f23012up;
    }

    /* JADX INFO: renamed from: du */
    public final String m32031du() {
        return this.f23006h4;
    }

    /* JADX INFO: renamed from: dy */
    public final C7394ca m32033dy() {
        return this.f23005fa;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m32034h4() {
        return this.f23010m9;
    }

    /* JADX INFO: renamed from: jd */
    public final fx0[] m32035jd() {
        return this.f23014yj.toArray(new fx0[0]);
    }

    /* JADX INFO: renamed from: kk */
    public final String m32038kk() {
        return this.f23011to;
    }

    /* JADX INFO: renamed from: m9 */
    public final List<C7394ca> m32040m9() {
        return this.f23002ck;
    }

    /* JADX INFO: renamed from: to */
    public final String m32041to() {
        return this.f23003du;
    }

    public fre(final AbstractC13912i5 abstractC13912i5) {
        m32018fa();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.fre.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (fre.f23000ks.m27428k4(str)) {
                    case 0:
                        fre.this.f23008k4 = str2;
                        break;
                    case 1:
                        fre.this.f23013x1 = str2;
                        break;
                    case 2:
                        fre.this.f23009kk = str2;
                        break;
                    case 3:
                        fre.this.f23011to = str2;
                        break;
                    case 4:
                        fre.this.f23003du = str2;
                        break;
                    case 5:
                        fre.this.f23006h4 = str2;
                        break;
                    case 6:
                        fre.this.f23010m9 = str2;
                        break;
                    case 7:
                        fre.this.f23004dy = str2;
                        break;
                    case 8:
                        fre.this.f23001c5 = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.fre.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                fre freVar;
                C7394ca c7394ca2;
                switch (fre.f23000ks.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 9:
                        fre.this.f23007jd = new wv6(abstractC13912i5);
                        return true;
                    case 10:
                        yxk yxkVar = new yxk(abstractC13912i5);
                        list = fre.this.f23002ck;
                        c7394ca = new C7394ca(DrawToolFactory.LASSO_TYPE_RECT, yxkVar);
                        list.addItem(c7394ca);
                        return true;
                    case 11:
                        er2 er2Var = new er2(abstractC13912i5);
                        list = fre.this.f23002ck;
                        c7394ca = new C7394ca("line", er2Var);
                        list.addItem(c7394ca);
                        return true;
                    case 12:
                        rpj rpjVar = new rpj(abstractC13912i5);
                        list = fre.this.f23002ck;
                        c7394ca = new C7394ca("polyline", rpjVar);
                        list.addItem(c7394ca);
                        return true;
                    case 13:
                        z4k z4kVar = new z4k(abstractC13912i5);
                        list = fre.this.f23002ck;
                        c7394ca = new C7394ca("polygon", z4kVar);
                        list.addItem(c7394ca);
                        return true;
                    case 14:
                        em0 em0Var = new em0(abstractC13912i5);
                        list = fre.this.f23002ck;
                        c7394ca = new C7394ca("regular-polygon", em0Var);
                        list.addItem(c7394ca);
                        return true;
                    case 15:
                        tzu tzuVar = new tzu(abstractC13912i5);
                        list = fre.this.f23002ck;
                        c7394ca = new C7394ca("path", tzuVar);
                        list.addItem(c7394ca);
                        return true;
                    case 16:
                        fmt fmtVar = new fmt(abstractC13912i5);
                        list = fre.this.f23002ck;
                        c7394ca = new C7394ca("circle", fmtVar);
                        list.addItem(c7394ca);
                        return true;
                    case 17:
                        sd3 sd3Var = new sd3(abstractC13912i5);
                        list = fre.this.f23002ck;
                        c7394ca = new C7394ca("ellipse", sd3Var);
                        list.addItem(c7394ca);
                        return true;
                    case 18:
                        pnk pnkVar = new pnk(abstractC13912i5);
                        list = fre.this.f23002ck;
                        c7394ca = new C7394ca("g", pnkVar);
                        list.addItem(c7394ca);
                        return true;
                    case 19:
                        klm klmVar = new klm(abstractC13912i5);
                        list = fre.this.f23002ck;
                        c7394ca = new C7394ca("page-thumbnail", klmVar);
                        list.addItem(c7394ca);
                        return true;
                    case 20:
                        vtn vtnVar = new vtn(abstractC13912i5);
                        list = fre.this.f23002ck;
                        c7394ca = new C7394ca("frame", vtnVar);
                        list.addItem(c7394ca);
                        return true;
                    case 21:
                        s0k s0kVar = new s0k(abstractC13912i5);
                        list = fre.this.f23002ck;
                        c7394ca = new C7394ca("measure", s0kVar);
                        list.addItem(c7394ca);
                        return true;
                    case 22:
                        zz0 zz0Var = new zz0(abstractC13912i5);
                        list = fre.this.f23002ck;
                        c7394ca = new C7394ca("caption", zz0Var);
                        list.addItem(c7394ca);
                        return true;
                    case 23:
                        p9u p9uVar = new p9u(abstractC13912i5);
                        list = fre.this.f23002ck;
                        c7394ca = new C7394ca("connector", p9uVar);
                        list.addItem(c7394ca);
                        return true;
                    case 24:
                        suk sukVar = new suk(abstractC13912i5);
                        list = fre.this.f23002ck;
                        c7394ca = new C7394ca("control", sukVar);
                        list.addItem(c7394ca);
                        return true;
                    case 25:
                        hhy hhyVar = new hhy(abstractC13912i5);
                        list = fre.this.f23002ck;
                        c7394ca = new C7394ca("scene", hhyVar);
                        list.addItem(c7394ca);
                        return true;
                    case 26:
                        h7e h7eVar = new h7e(abstractC13912i5);
                        list = fre.this.f23002ck;
                        c7394ca = new C7394ca("custom-shape", h7eVar);
                        list.addItem(c7394ca);
                        return true;
                    case 27:
                        freVar = fre.this;
                        c7394ca2 = new C7394ca("animations", new ck8(abstractC13912i5));
                        freVar.f23005fa = c7394ca2;
                        return true;
                    case 28:
                        freVar = fre.this;
                        c7394ca2 = new C7394ca("animate", new C7543ea(abstractC13912i5));
                        freVar.f23005fa = c7394ca2;
                        return true;
                    case 29:
                        freVar = fre.this;
                        c7394ca2 = new C7394ca("set", new ett(abstractC13912i5));
                        freVar.f23005fa = c7394ca2;
                        return true;
                    case 30:
                        freVar = fre.this;
                        c7394ca2 = new C7394ca("animateMotion", new C9261y7(abstractC13912i5));
                        freVar.f23005fa = c7394ca2;
                        return true;
                    case 31:
                        freVar = fre.this;
                        c7394ca2 = new C7394ca("animateColor", new C7270as(abstractC13912i5));
                        freVar.f23005fa = c7394ca2;
                        return true;
                    case 32:
                        freVar = fre.this;
                        c7394ca2 = new C7394ca("animateTransform", new C7627f1(abstractC13912i5));
                        freVar.f23005fa = c7394ca2;
                        return true;
                    case 33:
                        freVar = fre.this;
                        c7394ca2 = new C7394ca("transitionFilter", new d5a(abstractC13912i5));
                        freVar.f23005fa = c7394ca2;
                        return true;
                    case 34:
                        freVar = fre.this;
                        c7394ca2 = new C7394ca("par", new idf(abstractC13912i5));
                        freVar.f23005fa = c7394ca2;
                        return true;
                    case 35:
                        freVar = fre.this;
                        c7394ca2 = new C7394ca("seq", new lft(abstractC13912i5));
                        freVar.f23005fa = c7394ca2;
                        return true;
                    case 36:
                        freVar = fre.this;
                        c7394ca2 = new C7394ca("iterate", new vbl(abstractC13912i5));
                        freVar.f23005fa = c7394ca2;
                        return true;
                    case 37:
                        freVar = fre.this;
                        c7394ca2 = new C7394ca("audio", new C8158l4(abstractC13912i5));
                        freVar.f23005fa = c7394ca2;
                        return true;
                    case 38:
                        freVar = fre.this;
                        c7394ca2 = new C7394ca("command", new fsr(abstractC13912i5));
                        freVar.f23005fa = c7394ca2;
                        return true;
                    case 39:
                        fre.this.f23012up = new qsu(abstractC13912i5);
                        return true;
                    case 40:
                        fre.this.f23014yj.addItem(new fx0(abstractC13912i5));
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final String m32043x1() {
        return this.f23009kk;
    }

    /* JADX INFO: renamed from: du */
    public final void m32032du(String str) {
        this.f23004dy = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m32036k4(String str) {
        C7394ca c7394ca;
        switch (f23000ks.m27428k4(str)) {
            case 10:
                c7394ca = new C7394ca(DrawToolFactory.LASSO_TYPE_RECT, new yxk());
                break;
            case 11:
                c7394ca = new C7394ca("line", new er2());
                break;
            case 12:
                c7394ca = new C7394ca("polyline", new rpj());
                break;
            case 13:
                c7394ca = new C7394ca("polygon", new z4k());
                break;
            case 14:
                c7394ca = new C7394ca("regular-polygon", new em0());
                break;
            case 15:
                c7394ca = new C7394ca("path", new tzu());
                break;
            case 16:
                c7394ca = new C7394ca("circle", new fmt());
                break;
            case 17:
                c7394ca = new C7394ca("ellipse", new sd3());
                break;
            case 18:
                c7394ca = new C7394ca("g", new pnk());
                break;
            case 19:
                c7394ca = new C7394ca("page-thumbnail", new klm());
                break;
            case 20:
                c7394ca = new C7394ca("frame", new vtn());
                break;
            case 21:
                c7394ca = new C7394ca("measure", new s0k());
                break;
            case 22:
                c7394ca = new C7394ca("caption", new zz0());
                break;
            case 23:
                c7394ca = new C7394ca("connector", new p9u());
                break;
            case 24:
                c7394ca = new C7394ca("control", new suk());
                break;
            case 25:
                c7394ca = new C7394ca("scene", new hhy());
                break;
            case 26:
                c7394ca = new C7394ca("custom-shape", new h7e());
                break;
            default:
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        this.f23002ck.addItem(c7394ca);
        return c7394ca;
    }

    /* JADX INFO: renamed from: kk */
    public final void m32039kk(String str) {
        this.f23003du = str;
    }

    /* JADX INFO: renamed from: to */
    public final void m32042to(String str) {
        this.f23006h4 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m32044x1(String str) {
        this.f23011to = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m32037k4() {
        return this.f23013x1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f23008k4;
        if (str3 != null) {
            c3059ii.m12955x1("presentation:use-header-name", str3);
        }
        String str4 = this.f23013x1;
        if (str4 != null) {
            c3059ii.m12955x1("presentation:use-footer-name", str4);
        }
        String str5 = this.f23009kk;
        if (str5 != null) {
            c3059ii.m12955x1("presentation:use-date-time-name", str5);
        }
        String str6 = this.f23011to;
        if (str6 != null) {
            c3059ii.m12955x1("draw:name", str6);
        }
        String str7 = this.f23003du;
        if (str7 != null) {
            c3059ii.m12955x1("draw:style-name", str7);
        }
        c3059ii.m12955x1("draw:master-page-name", this.f23006h4);
        String str8 = this.f23010m9;
        if (str8 != null) {
            c3059ii.m12955x1("presentation:presentation-page-layout-name", str8);
        }
        String str9 = this.f23004dy;
        if (str9 != null) {
            c3059ii.m12955x1("draw:id", str9);
        }
        String str10 = this.f23001c5;
        if (str10 != null) {
            c3059ii.m12955x1("draw:nav-order", str10);
        }
        wv6 wv6Var = this.f23007jd;
        if (wv6Var != null) {
            wv6Var.mo6846k4("office", c3059ii, "forms");
        }
        List.Enumerator<C7394ca> it = this.f23002ck.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f23000ks.m27428k4(next.m29539k4())) {
                    case 10:
                        ((yxk) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 11:
                        ((er2) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 12:
                        ((rpj) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 13:
                        ((z4k) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 14:
                        ((em0) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 15:
                        ((tzu) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 16:
                        ((fmt) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 17:
                        ((sd3) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 18:
                        ((pnk) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 19:
                        ((klm) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 20:
                        ((vtn) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 21:
                        ((s0k) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 22:
                        ((zz0) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 23:
                        ((p9u) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 24:
                        ((suk) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 25:
                        ((hhy) next.m29541kk()).mo6846k4("dr3d", c3059ii, next.m29539k4());
                        break;
                    case 26:
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
        C7394ca c7394ca = this.f23005fa;
        if (c7394ca != null) {
            switch (f23000ks.m27428k4(c7394ca.m29539k4())) {
                case 27:
                    ((ck8) this.f23005fa.m29541kk()).mo6846k4("presentation", c3059ii, this.f23005fa.m29539k4());
                    break;
                case 28:
                    ((C7543ea) this.f23005fa.m29541kk()).mo6846k4("anim", c3059ii, this.f23005fa.m29539k4());
                    break;
                case 29:
                    ((ett) this.f23005fa.m29541kk()).mo6846k4("anim", c3059ii, this.f23005fa.m29539k4());
                    break;
                case 30:
                    ((C9261y7) this.f23005fa.m29541kk()).mo6846k4("anim", c3059ii, this.f23005fa.m29539k4());
                    break;
                case 31:
                    ((C7270as) this.f23005fa.m29541kk()).mo6846k4("anim", c3059ii, this.f23005fa.m29539k4());
                    break;
                case 32:
                    ((C7627f1) this.f23005fa.m29541kk()).mo6846k4("anim", c3059ii, this.f23005fa.m29539k4());
                    break;
                case 33:
                    ((d5a) this.f23005fa.m29541kk()).mo6846k4("anim", c3059ii, this.f23005fa.m29539k4());
                    break;
                case 34:
                    ((idf) this.f23005fa.m29541kk()).mo6846k4("anim", c3059ii, this.f23005fa.m29539k4());
                    break;
                case 35:
                    ((lft) this.f23005fa.m29541kk()).mo6846k4("anim", c3059ii, this.f23005fa.m29539k4());
                    break;
                case 36:
                    ((vbl) this.f23005fa.m29541kk()).mo6846k4("anim", c3059ii, this.f23005fa.m29539k4());
                    break;
                case 37:
                    ((C8158l4) this.f23005fa.m29541kk()).mo6846k4("anim", c3059ii, this.f23005fa.m29539k4());
                    break;
                case 38:
                    ((fsr) this.f23005fa.m29541kk()).mo6846k4("anim", c3059ii, this.f23005fa.m29539k4());
                    break;
            }
        }
        qsu qsuVar = this.f23012up;
        if (qsuVar != null) {
            qsuVar.mo6846k4("presentation", c3059ii, "notes");
        }
        List.Enumerator<fx0> it2 = this.f23014yj.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().mo6846k4("officeooo", c3059ii, "annotation");
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
