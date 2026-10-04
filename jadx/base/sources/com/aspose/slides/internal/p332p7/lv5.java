package com.aspose.slides.internal.p332p7;

import OoooooO.C21445Oooo;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.miui.penengine.p596e.C18773h;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class lv5 extends AbstractC7361bz {

    /* JADX INFO: renamed from: ix */
    private static final C7017h4 f26522ix = new C7017h4("text:global", "text:use-soft-page-breaks", "forms", "tracked-changes", "variable-decls", "sequence-decls", "user-field-decls", "dde-connection-decls", "alphabetical-index-auto-mark-file", "calculation-settings", "content-validations", "label-ranges", "page-sequence", C18773h.f57233c, ContextChain.TAG_PRODUCT, "list", "numbered-paragraph", "table", "a", "section", "soft-page-break", "table-of-content", "illustration-index", "table-index", "object-index", "user-index", "alphabetical-index", "bibliography", DrawToolFactory.LASSO_TYPE_RECT, "line", "polyline", "polygon", "regular-polygon", "path", "circle", "ellipse", "g", "page-thumbnail", "frame", "measure", "caption", "connector", "control", "scene", "custom-shape", "change", "change-start", "change-end", "named-expressions", "database-ranges", "data-pilot-tables", "consolidation", "dde-links");

    /* JADX INFO: renamed from: c5 */
    private au9 f26523c5;

    /* JADX INFO: renamed from: ck */
    private ozy f26524ck;

    /* JADX INFO: renamed from: du */
    private wyh f26525du;

    /* JADX INFO: renamed from: dy */
    private klp f26526dy;

    /* JADX INFO: renamed from: fa */
    private bwt f26527fa;

    /* JADX INFO: renamed from: h4 */
    private ht5 f26528h4;

    /* JADX INFO: renamed from: jd */
    private a4u f26529jd;

    /* JADX INFO: renamed from: k4 */
    private boolean f26530k4;

    /* JADX INFO: renamed from: kk */
    private wv6 f26531kk;

    /* JADX INFO: renamed from: ks */
    private n7b f26532ks;

    /* JADX INFO: renamed from: m9 */
    private ge7 f26533m9;

    /* JADX INFO: renamed from: ne */
    private vo4 f26534ne;

    /* JADX INFO: renamed from: rv */
    private tl4 f26535rv;

    /* JADX INFO: renamed from: to */
    private nxm f26536to;

    /* JADX INFO: renamed from: up */
    private List<C7394ca> f26537up;

    /* JADX INFO: renamed from: x1 */
    private boolean f26538x1;

    /* JADX INFO: renamed from: x6 */
    private scx f26539x6;

    /* JADX INFO: renamed from: yj */
    private fam f26540yj;

    public lv5() {
        m36464x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m36464x1() {
        this.f26530k4 = false;
        this.f26538x1 = false;
        this.f26537up = new List<>();
    }

    public lv5(final AbstractC13912i5 abstractC13912i5) {
        m36464x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.lv5.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = lv5.f26522ix.m27428k4(str);
                if (iM27428k4 == 0) {
                    lv5.this.f26530k4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                lv5.this.f26538x1 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.lv5.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                wiq wiqVar;
                List list2;
                String str;
                switch (lv5.f26522ix.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 2:
                        lv5.this.f26531kk = new wv6(abstractC13912i5);
                        return true;
                    case 3:
                        lv5.this.f26536to = new nxm(abstractC13912i5);
                        return true;
                    case 4:
                        lv5.this.f26525du = new wyh(abstractC13912i5);
                        return true;
                    case 5:
                        lv5.this.f26528h4 = new ht5(abstractC13912i5);
                        return true;
                    case 6:
                        lv5.this.f26533m9 = new ge7(abstractC13912i5);
                        return true;
                    case 7:
                        lv5.this.f26526dy = new klp(abstractC13912i5);
                        return true;
                    case 8:
                        lv5.this.f26523c5 = new au9(abstractC13912i5);
                        return true;
                    case 9:
                        lv5.this.f26529jd = new a4u(abstractC13912i5);
                        return true;
                    case 10:
                        lv5.this.f26524ck = new ozy(abstractC13912i5);
                        return true;
                    case 11:
                        lv5.this.f26527fa = new bwt(abstractC13912i5);
                        return true;
                    case 12:
                        nzw nzwVar = new nzw(abstractC13912i5);
                        list = lv5.this.f26537up;
                        c7394ca = new C7394ca("page-sequence", nzwVar);
                        list.addItem(c7394ca);
                        return true;
                    case 13:
                        kmn kmnVar = new kmn(abstractC13912i5);
                        list = lv5.this.f26537up;
                        c7394ca = new C7394ca(C18773h.f57233c, kmnVar);
                        list.addItem(c7394ca);
                        return true;
                    case 14:
                        C21445Oooo.OooO0OO(ContextChain.TAG_PRODUCT, new ok7(abstractC13912i5), lv5.this.f26537up);
                        return true;
                    case 15:
                        C22239OooO0oo.OooO00o("list", new lxj(abstractC13912i5), lv5.this.f26537up);
                        return true;
                    case 16:
                        kdz kdzVar = new kdz(abstractC13912i5);
                        list = lv5.this.f26537up;
                        c7394ca = new C7394ca("numbered-paragraph", kdzVar);
                        list.addItem(c7394ca);
                        return true;
                    case 17:
                        n6p n6pVar = new n6p(abstractC13912i5);
                        list = lv5.this.f26537up;
                        c7394ca = new C7394ca("table", n6pVar);
                        list.addItem(c7394ca);
                        return true;
                    case 18:
                        zg0 zg0Var = new zg0(abstractC13912i5);
                        list = lv5.this.f26537up;
                        c7394ca = new C7394ca("a", zg0Var);
                        list.addItem(c7394ca);
                        return true;
                    case 19:
                        gd6 gd6Var = new gd6(abstractC13912i5);
                        list = lv5.this.f26537up;
                        c7394ca = new C7394ca("section", gd6Var);
                        list.addItem(c7394ca);
                        return true;
                    case 20:
                        tfm tfmVar = new tfm(abstractC13912i5);
                        list = lv5.this.f26537up;
                        c7394ca = new C7394ca("soft-page-break", tfmVar);
                        list.addItem(c7394ca);
                        return true;
                    case 21:
                        oew oewVar = new oew(abstractC13912i5);
                        list = lv5.this.f26537up;
                        c7394ca = new C7394ca("table-of-content", oewVar);
                        list.addItem(c7394ca);
                        return true;
                    case 22:
                        ywb ywbVar = new ywb(abstractC13912i5);
                        list = lv5.this.f26537up;
                        c7394ca = new C7394ca("illustration-index", ywbVar);
                        list.addItem(c7394ca);
                        return true;
                    case 23:
                        etq etqVar = new etq(abstractC13912i5);
                        list = lv5.this.f26537up;
                        c7394ca = new C7394ca("table-index", etqVar);
                        list.addItem(c7394ca);
                        return true;
                    case 24:
                        c7p c7pVar = new c7p(abstractC13912i5);
                        list = lv5.this.f26537up;
                        c7394ca = new C7394ca("object-index", c7pVar);
                        list.addItem(c7394ca);
                        return true;
                    case 25:
                        f2w f2wVar = new f2w(abstractC13912i5);
                        list = lv5.this.f26537up;
                        c7394ca = new C7394ca("user-index", f2wVar);
                        list.addItem(c7394ca);
                        return true;
                    case 26:
                        f5k f5kVar = new f5k(abstractC13912i5);
                        list = lv5.this.f26537up;
                        c7394ca = new C7394ca("alphabetical-index", f5kVar);
                        list.addItem(c7394ca);
                        return true;
                    case 27:
                        mqt mqtVar = new mqt(abstractC13912i5);
                        list = lv5.this.f26537up;
                        c7394ca = new C7394ca("bibliography", mqtVar);
                        list.addItem(c7394ca);
                        return true;
                    case 28:
                        yxk yxkVar = new yxk(abstractC13912i5);
                        list = lv5.this.f26537up;
                        c7394ca = new C7394ca(DrawToolFactory.LASSO_TYPE_RECT, yxkVar);
                        list.addItem(c7394ca);
                        return true;
                    case 29:
                        er2 er2Var = new er2(abstractC13912i5);
                        list = lv5.this.f26537up;
                        c7394ca = new C7394ca("line", er2Var);
                        list.addItem(c7394ca);
                        return true;
                    case 30:
                        rpj rpjVar = new rpj(abstractC13912i5);
                        list = lv5.this.f26537up;
                        c7394ca = new C7394ca("polyline", rpjVar);
                        list.addItem(c7394ca);
                        return true;
                    case 31:
                        z4k z4kVar = new z4k(abstractC13912i5);
                        list = lv5.this.f26537up;
                        c7394ca = new C7394ca("polygon", z4kVar);
                        list.addItem(c7394ca);
                        return true;
                    case 32:
                        em0 em0Var = new em0(abstractC13912i5);
                        list = lv5.this.f26537up;
                        c7394ca = new C7394ca("regular-polygon", em0Var);
                        list.addItem(c7394ca);
                        return true;
                    case 33:
                        tzu tzuVar = new tzu(abstractC13912i5);
                        list = lv5.this.f26537up;
                        c7394ca = new C7394ca("path", tzuVar);
                        list.addItem(c7394ca);
                        return true;
                    case 34:
                        fmt fmtVar = new fmt(abstractC13912i5);
                        list = lv5.this.f26537up;
                        c7394ca = new C7394ca("circle", fmtVar);
                        list.addItem(c7394ca);
                        return true;
                    case 35:
                        sd3 sd3Var = new sd3(abstractC13912i5);
                        list = lv5.this.f26537up;
                        c7394ca = new C7394ca("ellipse", sd3Var);
                        list.addItem(c7394ca);
                        return true;
                    case 36:
                        pnk pnkVar = new pnk(abstractC13912i5);
                        list = lv5.this.f26537up;
                        c7394ca = new C7394ca("g", pnkVar);
                        list.addItem(c7394ca);
                        return true;
                    case 37:
                        klm klmVar = new klm(abstractC13912i5);
                        list = lv5.this.f26537up;
                        c7394ca = new C7394ca("page-thumbnail", klmVar);
                        list.addItem(c7394ca);
                        return true;
                    case 38:
                        vtn vtnVar = new vtn(abstractC13912i5);
                        list = lv5.this.f26537up;
                        c7394ca = new C7394ca("frame", vtnVar);
                        list.addItem(c7394ca);
                        return true;
                    case 39:
                        s0k s0kVar = new s0k(abstractC13912i5);
                        list = lv5.this.f26537up;
                        c7394ca = new C7394ca("measure", s0kVar);
                        list.addItem(c7394ca);
                        return true;
                    case 40:
                        zz0 zz0Var = new zz0(abstractC13912i5);
                        list = lv5.this.f26537up;
                        c7394ca = new C7394ca("caption", zz0Var);
                        list.addItem(c7394ca);
                        return true;
                    case 41:
                        p9u p9uVar = new p9u(abstractC13912i5);
                        list = lv5.this.f26537up;
                        c7394ca = new C7394ca("connector", p9uVar);
                        list.addItem(c7394ca);
                        return true;
                    case 42:
                        suk sukVar = new suk(abstractC13912i5);
                        list = lv5.this.f26537up;
                        c7394ca = new C7394ca("control", sukVar);
                        list.addItem(c7394ca);
                        return true;
                    case 43:
                        hhy hhyVar = new hhy(abstractC13912i5);
                        list = lv5.this.f26537up;
                        c7394ca = new C7394ca("scene", hhyVar);
                        list.addItem(c7394ca);
                        return true;
                    case 44:
                        h7e h7eVar = new h7e(abstractC13912i5);
                        list = lv5.this.f26537up;
                        c7394ca = new C7394ca("custom-shape", h7eVar);
                        list.addItem(c7394ca);
                        return true;
                    case 45:
                        wiqVar = new wiq(abstractC13912i5);
                        list2 = lv5.this.f26537up;
                        str = "change";
                        OooO.OooO0O0(str, wiqVar, list2);
                        return true;
                    case 46:
                        wiqVar = new wiq(abstractC13912i5);
                        list2 = lv5.this.f26537up;
                        str = "change-start";
                        OooO.OooO0O0(str, wiqVar, list2);
                        return true;
                    case 47:
                        wiqVar = new wiq(abstractC13912i5);
                        list2 = lv5.this.f26537up;
                        str = "change-end";
                        OooO.OooO0O0(str, wiqVar, list2);
                        return true;
                    case 48:
                        lv5.this.f26540yj = new fam(abstractC13912i5);
                        return true;
                    case 49:
                        lv5.this.f26532ks = new n7b(abstractC13912i5);
                        return true;
                    case 50:
                        lv5.this.f26535rv = new tl4(abstractC13912i5);
                        return true;
                    case 51:
                        lv5.this.f26539x6 = new scx(abstractC13912i5);
                        return true;
                    case 52:
                        lv5.this.f26534ne = new vo4(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        wiq wiqVar;
        String strM29539k4;
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f26530k4;
        String str3 = TelemetryEventStrings.Value.FALSE;
        if (z) {
            c3059ii.m12955x1("text:global", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z2 = this.f26538x1;
        if (z2) {
            if (z2) {
                str3 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("text:use-soft-page-breaks", str3);
        }
        wv6 wv6Var = this.f26531kk;
        if (wv6Var != null) {
            wv6Var.mo6846k4("office", c3059ii, "forms");
        }
        nxm nxmVar = this.f26536to;
        if (nxmVar != null) {
            nxmVar.mo6846k4("text", c3059ii, "tracked-changes");
        }
        wyh wyhVar = this.f26525du;
        if (wyhVar != null) {
            wyhVar.mo6846k4("text", c3059ii, "variable-decls");
        }
        ht5 ht5Var = this.f26528h4;
        if (ht5Var != null) {
            ht5Var.mo6846k4("text", c3059ii, "sequence-decls");
        }
        ge7 ge7Var = this.f26533m9;
        if (ge7Var != null) {
            ge7Var.mo6846k4("text", c3059ii, "user-field-decls");
        }
        klp klpVar = this.f26526dy;
        if (klpVar != null) {
            klpVar.mo6846k4("text", c3059ii, "dde-connection-decls");
        }
        au9 au9Var = this.f26523c5;
        if (au9Var != null) {
            au9Var.mo6846k4("text", c3059ii, "alphabetical-index-auto-mark-file");
        }
        a4u a4uVar = this.f26529jd;
        if (a4uVar != null) {
            a4uVar.mo6846k4("table", c3059ii, "calculation-settings");
        }
        ozy ozyVar = this.f26524ck;
        if (ozyVar != null) {
            ozyVar.mo6846k4("table", c3059ii, "content-validations");
        }
        bwt bwtVar = this.f26527fa;
        if (bwtVar != null) {
            bwtVar.mo6846k4("table", c3059ii, "label-ranges");
        }
        List.Enumerator<C7394ca> it = this.f26537up.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f26522ix.m27428k4(next.m29539k4())) {
                    case 12:
                        ((nzw) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 13:
                        ((kmn) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 14:
                        ((ok7) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 15:
                        ((lxj) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 16:
                        ((kdz) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 17:
                        ((n6p) next.m29541kk()).mo6846k4("table", c3059ii, next.m29539k4());
                        continue;
                    case 18:
                        ((zg0) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 19:
                        ((gd6) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 20:
                        ((tfm) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 21:
                        ((oew) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 22:
                        ((ywb) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 23:
                        ((etq) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 24:
                        ((c7p) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 25:
                        ((f2w) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 26:
                        ((f5k) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 27:
                        ((mqt) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 28:
                        ((yxk) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 29:
                        ((er2) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 30:
                        ((rpj) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 31:
                        ((z4k) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 32:
                        ((em0) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 33:
                        ((tzu) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 34:
                        ((fmt) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 35:
                        ((sd3) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 36:
                        ((pnk) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 37:
                        ((klm) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 38:
                        ((vtn) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 39:
                        ((s0k) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 40:
                        ((zz0) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 41:
                        ((p9u) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 42:
                        ((suk) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 43:
                        ((hhy) next.m29541kk()).mo6846k4("dr3d", c3059ii, next.m29539k4());
                        continue;
                    case 44:
                        ((h7e) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 45:
                        wiqVar = (wiq) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        break;
                    case 46:
                        wiqVar = (wiq) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        break;
                    case 47:
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
        fam famVar = this.f26540yj;
        if (famVar != null) {
            famVar.mo6846k4("table", c3059ii, "named-expressions");
        }
        n7b n7bVar = this.f26532ks;
        if (n7bVar != null) {
            n7bVar.mo6846k4("table", c3059ii, "database-ranges");
        }
        tl4 tl4Var = this.f26535rv;
        if (tl4Var != null) {
            tl4Var.mo6846k4("table", c3059ii, "data-pilot-tables");
        }
        scx scxVar = this.f26539x6;
        if (scxVar != null) {
            scxVar.mo6846k4("table", c3059ii, "consolidation");
        }
        vo4 vo4Var = this.f26534ne;
        if (vo4Var != null) {
            vo4Var.mo6846k4("table", c3059ii, "dde-links");
        }
        c3059ii.mo21898jd();
    }
}
