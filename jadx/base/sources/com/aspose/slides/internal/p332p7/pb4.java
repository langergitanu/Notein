package com.aspose.slides.internal.p332p7;

import OoooooO.C21445Oooo;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;
import com.miui.penengine.p596e.C18773h;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class pb4 extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f28332c5 = new C7017h4("draw:chain-next-name", "draw:corner-radius", "fo:min-height", "fo:min-width", "fo:max-height", "fo:max-width", "text:id", C18773h.f57233c, ContextChain.TAG_PRODUCT, "list", "numbered-paragraph", "table", "a", "section", "soft-page-break", "table-of-content", "illustration-index", "table-index", "object-index", "user-index", "alphabetical-index", "bibliography", DrawToolFactory.LASSO_TYPE_RECT, "line", "polyline", "polygon", "regular-polygon", "path", "circle", "ellipse", "g", "page-thumbnail", "frame", "measure", "caption", "connector", "control", "scene", "custom-shape", "change", "change-start", "change-end");

    /* JADX INFO: renamed from: du */
    private String f28333du;

    /* JADX INFO: renamed from: dy */
    private List<C7394ca> f28334dy;

    /* JADX INFO: renamed from: h4 */
    private String f28335h4;

    /* JADX INFO: renamed from: k4 */
    private String f28336k4;

    /* JADX INFO: renamed from: kk */
    private String f28337kk;

    /* JADX INFO: renamed from: m9 */
    private String f28338m9;

    /* JADX INFO: renamed from: to */
    private String f28339to;

    /* JADX INFO: renamed from: x1 */
    private String f28340x1;

    public pb4() {
        m38774kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C7394ca> m38779k4() {
        return this.f28334dy;
    }

    public pb4(final AbstractC13912i5 abstractC13912i5) {
        m38774kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.pb4.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (pb4.f28332c5.m27428k4(str)) {
                    case 0:
                        pb4.this.f28336k4 = str2;
                        break;
                    case 1:
                        pb4.this.f28340x1 = str2;
                        break;
                    case 2:
                        pb4.this.f28337kk = str2;
                        break;
                    case 3:
                        pb4.this.f28339to = str2;
                        break;
                    case 4:
                        pb4.this.f28333du = str2;
                        break;
                    case 5:
                        pb4.this.f28335h4 = str2;
                        break;
                    case 6:
                        pb4.this.f28338m9 = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.pb4.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                wiq wiqVar;
                List list2;
                String str;
                switch (pb4.f28332c5.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 7:
                        kmn kmnVar = new kmn(abstractC13912i5);
                        list = pb4.this.f28334dy;
                        c7394ca = new C7394ca(C18773h.f57233c, kmnVar);
                        list.addItem(c7394ca);
                        return true;
                    case 8:
                        C21445Oooo.OooO0OO(ContextChain.TAG_PRODUCT, new ok7(abstractC13912i5), pb4.this.f28334dy);
                        return true;
                    case 9:
                        C22239OooO0oo.OooO00o("list", new lxj(abstractC13912i5), pb4.this.f28334dy);
                        return true;
                    case 10:
                        kdz kdzVar = new kdz(abstractC13912i5);
                        list = pb4.this.f28334dy;
                        c7394ca = new C7394ca("numbered-paragraph", kdzVar);
                        list.addItem(c7394ca);
                        return true;
                    case 11:
                        n6p n6pVar = new n6p(abstractC13912i5);
                        list = pb4.this.f28334dy;
                        c7394ca = new C7394ca("table", n6pVar);
                        list.addItem(c7394ca);
                        return true;
                    case 12:
                        zg0 zg0Var = new zg0(abstractC13912i5);
                        list = pb4.this.f28334dy;
                        c7394ca = new C7394ca("a", zg0Var);
                        list.addItem(c7394ca);
                        return true;
                    case 13:
                        gd6 gd6Var = new gd6(abstractC13912i5);
                        list = pb4.this.f28334dy;
                        c7394ca = new C7394ca("section", gd6Var);
                        list.addItem(c7394ca);
                        return true;
                    case 14:
                        tfm tfmVar = new tfm(abstractC13912i5);
                        list = pb4.this.f28334dy;
                        c7394ca = new C7394ca("soft-page-break", tfmVar);
                        list.addItem(c7394ca);
                        return true;
                    case 15:
                        oew oewVar = new oew(abstractC13912i5);
                        list = pb4.this.f28334dy;
                        c7394ca = new C7394ca("table-of-content", oewVar);
                        list.addItem(c7394ca);
                        return true;
                    case 16:
                        ywb ywbVar = new ywb(abstractC13912i5);
                        list = pb4.this.f28334dy;
                        c7394ca = new C7394ca("illustration-index", ywbVar);
                        list.addItem(c7394ca);
                        return true;
                    case 17:
                        etq etqVar = new etq(abstractC13912i5);
                        list = pb4.this.f28334dy;
                        c7394ca = new C7394ca("table-index", etqVar);
                        list.addItem(c7394ca);
                        return true;
                    case 18:
                        c7p c7pVar = new c7p(abstractC13912i5);
                        list = pb4.this.f28334dy;
                        c7394ca = new C7394ca("object-index", c7pVar);
                        list.addItem(c7394ca);
                        return true;
                    case 19:
                        f2w f2wVar = new f2w(abstractC13912i5);
                        list = pb4.this.f28334dy;
                        c7394ca = new C7394ca("user-index", f2wVar);
                        list.addItem(c7394ca);
                        return true;
                    case 20:
                        f5k f5kVar = new f5k(abstractC13912i5);
                        list = pb4.this.f28334dy;
                        c7394ca = new C7394ca("alphabetical-index", f5kVar);
                        list.addItem(c7394ca);
                        return true;
                    case 21:
                        mqt mqtVar = new mqt(abstractC13912i5);
                        list = pb4.this.f28334dy;
                        c7394ca = new C7394ca("bibliography", mqtVar);
                        list.addItem(c7394ca);
                        return true;
                    case 22:
                        yxk yxkVar = new yxk(abstractC13912i5);
                        list = pb4.this.f28334dy;
                        c7394ca = new C7394ca(DrawToolFactory.LASSO_TYPE_RECT, yxkVar);
                        list.addItem(c7394ca);
                        return true;
                    case 23:
                        er2 er2Var = new er2(abstractC13912i5);
                        list = pb4.this.f28334dy;
                        c7394ca = new C7394ca("line", er2Var);
                        list.addItem(c7394ca);
                        return true;
                    case 24:
                        rpj rpjVar = new rpj(abstractC13912i5);
                        list = pb4.this.f28334dy;
                        c7394ca = new C7394ca("polyline", rpjVar);
                        list.addItem(c7394ca);
                        return true;
                    case 25:
                        z4k z4kVar = new z4k(abstractC13912i5);
                        list = pb4.this.f28334dy;
                        c7394ca = new C7394ca("polygon", z4kVar);
                        list.addItem(c7394ca);
                        return true;
                    case 26:
                        em0 em0Var = new em0(abstractC13912i5);
                        list = pb4.this.f28334dy;
                        c7394ca = new C7394ca("regular-polygon", em0Var);
                        list.addItem(c7394ca);
                        return true;
                    case 27:
                        tzu tzuVar = new tzu(abstractC13912i5);
                        list = pb4.this.f28334dy;
                        c7394ca = new C7394ca("path", tzuVar);
                        list.addItem(c7394ca);
                        return true;
                    case 28:
                        fmt fmtVar = new fmt(abstractC13912i5);
                        list = pb4.this.f28334dy;
                        c7394ca = new C7394ca("circle", fmtVar);
                        list.addItem(c7394ca);
                        return true;
                    case 29:
                        sd3 sd3Var = new sd3(abstractC13912i5);
                        list = pb4.this.f28334dy;
                        c7394ca = new C7394ca("ellipse", sd3Var);
                        list.addItem(c7394ca);
                        return true;
                    case 30:
                        pnk pnkVar = new pnk(abstractC13912i5);
                        list = pb4.this.f28334dy;
                        c7394ca = new C7394ca("g", pnkVar);
                        list.addItem(c7394ca);
                        return true;
                    case 31:
                        klm klmVar = new klm(abstractC13912i5);
                        list = pb4.this.f28334dy;
                        c7394ca = new C7394ca("page-thumbnail", klmVar);
                        list.addItem(c7394ca);
                        return true;
                    case 32:
                        vtn vtnVar = new vtn(abstractC13912i5);
                        list = pb4.this.f28334dy;
                        c7394ca = new C7394ca("frame", vtnVar);
                        list.addItem(c7394ca);
                        return true;
                    case 33:
                        s0k s0kVar = new s0k(abstractC13912i5);
                        list = pb4.this.f28334dy;
                        c7394ca = new C7394ca("measure", s0kVar);
                        list.addItem(c7394ca);
                        return true;
                    case 34:
                        zz0 zz0Var = new zz0(abstractC13912i5);
                        list = pb4.this.f28334dy;
                        c7394ca = new C7394ca("caption", zz0Var);
                        list.addItem(c7394ca);
                        return true;
                    case 35:
                        p9u p9uVar = new p9u(abstractC13912i5);
                        list = pb4.this.f28334dy;
                        c7394ca = new C7394ca("connector", p9uVar);
                        list.addItem(c7394ca);
                        return true;
                    case 36:
                        suk sukVar = new suk(abstractC13912i5);
                        list = pb4.this.f28334dy;
                        c7394ca = new C7394ca("control", sukVar);
                        list.addItem(c7394ca);
                        return true;
                    case 37:
                        hhy hhyVar = new hhy(abstractC13912i5);
                        list = pb4.this.f28334dy;
                        c7394ca = new C7394ca("scene", hhyVar);
                        list.addItem(c7394ca);
                        return true;
                    case 38:
                        h7e h7eVar = new h7e(abstractC13912i5);
                        list = pb4.this.f28334dy;
                        c7394ca = new C7394ca("custom-shape", h7eVar);
                        list.addItem(c7394ca);
                        return true;
                    case 39:
                        wiqVar = new wiq(abstractC13912i5);
                        list2 = pb4.this.f28334dy;
                        str = "change";
                        OooO.OooO0O0(str, wiqVar, list2);
                        return true;
                    case 40:
                        wiqVar = new wiq(abstractC13912i5);
                        list2 = pb4.this.f28334dy;
                        str = "change-start";
                        OooO.OooO0O0(str, wiqVar, list2);
                        return true;
                    case 41:
                        wiqVar = new wiq(abstractC13912i5);
                        list2 = pb4.this.f28334dy;
                        str = "change-end";
                        OooO.OooO0O0(str, wiqVar, list2);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: kk */
    private void m38774kk() {
        this.f28334dy = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m38780k4(String str) {
        C7394ca c7394ca;
        switch (f28332c5.m27428k4(str)) {
            case 7:
                c7394ca = new C7394ca(C18773h.f57233c, new kmn());
                break;
            case 8:
                c7394ca = new C7394ca(ContextChain.TAG_PRODUCT, new ok7());
                break;
            case 9:
                c7394ca = new C7394ca("list", new lxj());
                break;
            case 10:
                c7394ca = new C7394ca("numbered-paragraph", new kdz());
                break;
            case 11:
                c7394ca = new C7394ca("table", new n6p());
                break;
            case 12:
                c7394ca = new C7394ca("a", new zg0());
                break;
            case 13:
                c7394ca = new C7394ca("section", new gd6());
                break;
            case 14:
                c7394ca = new C7394ca("soft-page-break", new tfm());
                break;
            case 15:
                c7394ca = new C7394ca("table-of-content", new oew());
                break;
            case 16:
                c7394ca = new C7394ca("illustration-index", new ywb());
                break;
            case 17:
                c7394ca = new C7394ca("table-index", new etq());
                break;
            case 18:
                c7394ca = new C7394ca("object-index", new c7p());
                break;
            case 19:
                c7394ca = new C7394ca("user-index", new f2w());
                break;
            case 20:
                c7394ca = new C7394ca("alphabetical-index", new f5k());
                break;
            case 21:
                c7394ca = new C7394ca("bibliography", new mqt());
                break;
            case 22:
                c7394ca = new C7394ca(DrawToolFactory.LASSO_TYPE_RECT, new yxk());
                break;
            case 23:
                c7394ca = new C7394ca("line", new er2());
                break;
            case 24:
                c7394ca = new C7394ca("polyline", new rpj());
                break;
            case 25:
                c7394ca = new C7394ca("polygon", new z4k());
                break;
            case 26:
                c7394ca = new C7394ca("regular-polygon", new em0());
                break;
            case 27:
                c7394ca = new C7394ca("path", new tzu());
                break;
            case 28:
                c7394ca = new C7394ca("circle", new fmt());
                break;
            case 29:
                c7394ca = new C7394ca("ellipse", new sd3());
                break;
            case 30:
                c7394ca = new C7394ca("g", new pnk());
                break;
            case 31:
                c7394ca = new C7394ca("page-thumbnail", new klm());
                break;
            case 32:
                c7394ca = new C7394ca("frame", new vtn());
                break;
            case 33:
                c7394ca = new C7394ca("measure", new s0k());
                break;
            case 34:
                c7394ca = new C7394ca("caption", new zz0());
                break;
            case 35:
                c7394ca = new C7394ca("connector", new p9u());
                break;
            case 36:
                c7394ca = new C7394ca("control", new suk());
                break;
            case 37:
                c7394ca = new C7394ca("scene", new hhy());
                break;
            case 38:
                c7394ca = new C7394ca("custom-shape", new h7e());
                break;
            case 39:
                c7394ca = new C7394ca("change", new wiq());
                break;
            case 40:
                c7394ca = new C7394ca("change-start", new wiq());
                break;
            case 41:
                c7394ca = new C7394ca("change-end", new wiq());
                break;
            default:
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        this.f28334dy.addItem(c7394ca);
        return c7394ca;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        wiq wiqVar;
        String strM29539k4;
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f28336k4;
        if (str3 != null) {
            c3059ii.m12955x1("draw:chain-next-name", str3);
        }
        String str4 = this.f28340x1;
        if (str4 != null) {
            c3059ii.m12955x1("draw:corner-radius", str4);
        }
        String str5 = this.f28337kk;
        if (str5 != null) {
            c3059ii.m12955x1("fo:min-height", str5);
        }
        String str6 = this.f28339to;
        if (str6 != null) {
            c3059ii.m12955x1("fo:min-width", str6);
        }
        String str7 = this.f28333du;
        if (str7 != null) {
            c3059ii.m12955x1("fo:max-height", str7);
        }
        String str8 = this.f28335h4;
        if (str8 != null) {
            c3059ii.m12955x1("fo:max-width", str8);
        }
        String str9 = this.f28338m9;
        if (str9 != null) {
            c3059ii.m12955x1("text:id", str9);
        }
        List.Enumerator<C7394ca> it = this.f28334dy.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f28332c5.m27428k4(next.m29539k4())) {
                    case 7:
                        ((kmn) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 8:
                        ((ok7) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 9:
                        ((lxj) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 10:
                        ((kdz) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 11:
                        ((n6p) next.m29541kk()).mo6846k4("table", c3059ii, next.m29539k4());
                        continue;
                    case 12:
                        ((zg0) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 13:
                        ((gd6) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 14:
                        ((tfm) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 15:
                        ((oew) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 16:
                        ((ywb) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 17:
                        ((etq) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 18:
                        ((c7p) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 19:
                        ((f2w) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 20:
                        ((f5k) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 21:
                        ((mqt) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 22:
                        ((yxk) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 23:
                        ((er2) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 24:
                        ((rpj) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 25:
                        ((z4k) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 26:
                        ((em0) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 27:
                        ((tzu) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 28:
                        ((fmt) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 29:
                        ((sd3) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 30:
                        ((pnk) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 31:
                        ((klm) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 32:
                        ((vtn) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 33:
                        ((s0k) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 34:
                        ((zz0) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 35:
                        ((p9u) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 36:
                        ((suk) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 37:
                        ((hhy) next.m29541kk()).mo6846k4("dr3d", c3059ii, next.m29539k4());
                        continue;
                    case 38:
                        ((h7e) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 39:
                        wiqVar = (wiq) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        break;
                    case 40:
                        wiqVar = (wiq) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        break;
                    case 41:
                        wiqVar = (wiq) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        break;
                }
                wiqVar.mo6846k4("text", c3059ii, strM29539k4);
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
