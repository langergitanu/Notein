package com.aspose.slides.internal.p332p7;

import OoooooO.C21445Oooo;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.miui.penengine.p596e.C18773h;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class gd6 extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f23374c5 = new C7017h4("text:style-name", "text:name", "text:protected", "text:protection-key", "text:display", "text:condition", "section-source", "dde-source", C18773h.f57233c, ContextChain.TAG_PRODUCT, "list", "numbered-paragraph", "table", "a", "section", "soft-page-break", "table-of-content", "illustration-index", "table-index", "object-index", "user-index", "alphabetical-index", "bibliography", DrawToolFactory.LASSO_TYPE_RECT, "line", "polyline", "polygon", "regular-polygon", "path", "circle", "ellipse", "g", "page-thumbnail", "frame", "measure", "caption", "connector", "control", "scene", "custom-shape", "change", "change-start", "change-end");

    /* JADX INFO: renamed from: du */
    private int f23375du;

    /* JADX INFO: renamed from: dy */
    private List<C7394ca> f23376dy;

    /* JADX INFO: renamed from: h4 */
    private String f23377h4;

    /* JADX INFO: renamed from: k4 */
    private String f23378k4;

    /* JADX INFO: renamed from: kk */
    private byte f23379kk;

    /* JADX INFO: renamed from: m9 */
    private C7394ca f23380m9;

    /* JADX INFO: renamed from: to */
    private String f23381to;

    /* JADX INFO: renamed from: x1 */
    private String f23382x1;

    public gd6() {
        m32469x1();
    }

    public gd6(final AbstractC13912i5 abstractC13912i5) {
        m32469x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.gd6.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = gd6.f23374c5.m27428k4(str);
                if (iM27428k4 == 0) {
                    gd6.this.f23378k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    gd6.this.f23382x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    gd6.this.f23379kk = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    gd6.this.f23381to = str2;
                    return true;
                }
                if (iM27428k4 == 4) {
                    gd6.this.f23375du = pga.m38899k4(str2);
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                gd6.this.f23377h4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.gd6.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                gd6 gd6Var;
                C7394ca c7394ca;
                List list;
                C7394ca c7394ca2;
                wiq wiqVar;
                List list2;
                String str;
                switch (gd6.f23374c5.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 6:
                        gd6Var = gd6.this;
                        c7394ca = new C7394ca("section-source", new oaq(abstractC13912i5));
                        gd6Var.f23380m9 = c7394ca;
                        return true;
                    case 7:
                        gd6Var = gd6.this;
                        c7394ca = new C7394ca("dde-source", new xtg(abstractC13912i5));
                        gd6Var.f23380m9 = c7394ca;
                        return true;
                    case 8:
                        kmn kmnVar = new kmn(abstractC13912i5);
                        list = gd6.this.f23376dy;
                        c7394ca2 = new C7394ca(C18773h.f57233c, kmnVar);
                        list.addItem(c7394ca2);
                        return true;
                    case 9:
                        C21445Oooo.OooO0OO(ContextChain.TAG_PRODUCT, new ok7(abstractC13912i5), gd6.this.f23376dy);
                        return true;
                    case 10:
                        C22239OooO0oo.OooO00o("list", new lxj(abstractC13912i5), gd6.this.f23376dy);
                        return true;
                    case 11:
                        kdz kdzVar = new kdz(abstractC13912i5);
                        list = gd6.this.f23376dy;
                        c7394ca2 = new C7394ca("numbered-paragraph", kdzVar);
                        list.addItem(c7394ca2);
                        return true;
                    case 12:
                        n6p n6pVar = new n6p(abstractC13912i5);
                        list = gd6.this.f23376dy;
                        c7394ca2 = new C7394ca("table", n6pVar);
                        list.addItem(c7394ca2);
                        return true;
                    case 13:
                        zg0 zg0Var = new zg0(abstractC13912i5);
                        list = gd6.this.f23376dy;
                        c7394ca2 = new C7394ca("a", zg0Var);
                        list.addItem(c7394ca2);
                        return true;
                    case 14:
                        gd6 gd6Var2 = new gd6(abstractC13912i5);
                        list = gd6.this.f23376dy;
                        c7394ca2 = new C7394ca("section", gd6Var2);
                        list.addItem(c7394ca2);
                        return true;
                    case 15:
                        tfm tfmVar = new tfm(abstractC13912i5);
                        list = gd6.this.f23376dy;
                        c7394ca2 = new C7394ca("soft-page-break", tfmVar);
                        list.addItem(c7394ca2);
                        return true;
                    case 16:
                        oew oewVar = new oew(abstractC13912i5);
                        list = gd6.this.f23376dy;
                        c7394ca2 = new C7394ca("table-of-content", oewVar);
                        list.addItem(c7394ca2);
                        return true;
                    case 17:
                        ywb ywbVar = new ywb(abstractC13912i5);
                        list = gd6.this.f23376dy;
                        c7394ca2 = new C7394ca("illustration-index", ywbVar);
                        list.addItem(c7394ca2);
                        return true;
                    case 18:
                        etq etqVar = new etq(abstractC13912i5);
                        list = gd6.this.f23376dy;
                        c7394ca2 = new C7394ca("table-index", etqVar);
                        list.addItem(c7394ca2);
                        return true;
                    case 19:
                        c7p c7pVar = new c7p(abstractC13912i5);
                        list = gd6.this.f23376dy;
                        c7394ca2 = new C7394ca("object-index", c7pVar);
                        list.addItem(c7394ca2);
                        return true;
                    case 20:
                        f2w f2wVar = new f2w(abstractC13912i5);
                        list = gd6.this.f23376dy;
                        c7394ca2 = new C7394ca("user-index", f2wVar);
                        list.addItem(c7394ca2);
                        return true;
                    case 21:
                        f5k f5kVar = new f5k(abstractC13912i5);
                        list = gd6.this.f23376dy;
                        c7394ca2 = new C7394ca("alphabetical-index", f5kVar);
                        list.addItem(c7394ca2);
                        return true;
                    case 22:
                        mqt mqtVar = new mqt(abstractC13912i5);
                        list = gd6.this.f23376dy;
                        c7394ca2 = new C7394ca("bibliography", mqtVar);
                        list.addItem(c7394ca2);
                        return true;
                    case 23:
                        yxk yxkVar = new yxk(abstractC13912i5);
                        list = gd6.this.f23376dy;
                        c7394ca2 = new C7394ca(DrawToolFactory.LASSO_TYPE_RECT, yxkVar);
                        list.addItem(c7394ca2);
                        return true;
                    case 24:
                        er2 er2Var = new er2(abstractC13912i5);
                        list = gd6.this.f23376dy;
                        c7394ca2 = new C7394ca("line", er2Var);
                        list.addItem(c7394ca2);
                        return true;
                    case 25:
                        rpj rpjVar = new rpj(abstractC13912i5);
                        list = gd6.this.f23376dy;
                        c7394ca2 = new C7394ca("polyline", rpjVar);
                        list.addItem(c7394ca2);
                        return true;
                    case 26:
                        z4k z4kVar = new z4k(abstractC13912i5);
                        list = gd6.this.f23376dy;
                        c7394ca2 = new C7394ca("polygon", z4kVar);
                        list.addItem(c7394ca2);
                        return true;
                    case 27:
                        em0 em0Var = new em0(abstractC13912i5);
                        list = gd6.this.f23376dy;
                        c7394ca2 = new C7394ca("regular-polygon", em0Var);
                        list.addItem(c7394ca2);
                        return true;
                    case 28:
                        tzu tzuVar = new tzu(abstractC13912i5);
                        list = gd6.this.f23376dy;
                        c7394ca2 = new C7394ca("path", tzuVar);
                        list.addItem(c7394ca2);
                        return true;
                    case 29:
                        fmt fmtVar = new fmt(abstractC13912i5);
                        list = gd6.this.f23376dy;
                        c7394ca2 = new C7394ca("circle", fmtVar);
                        list.addItem(c7394ca2);
                        return true;
                    case 30:
                        sd3 sd3Var = new sd3(abstractC13912i5);
                        list = gd6.this.f23376dy;
                        c7394ca2 = new C7394ca("ellipse", sd3Var);
                        list.addItem(c7394ca2);
                        return true;
                    case 31:
                        pnk pnkVar = new pnk(abstractC13912i5);
                        list = gd6.this.f23376dy;
                        c7394ca2 = new C7394ca("g", pnkVar);
                        list.addItem(c7394ca2);
                        return true;
                    case 32:
                        klm klmVar = new klm(abstractC13912i5);
                        list = gd6.this.f23376dy;
                        c7394ca2 = new C7394ca("page-thumbnail", klmVar);
                        list.addItem(c7394ca2);
                        return true;
                    case 33:
                        vtn vtnVar = new vtn(abstractC13912i5);
                        list = gd6.this.f23376dy;
                        c7394ca2 = new C7394ca("frame", vtnVar);
                        list.addItem(c7394ca2);
                        return true;
                    case 34:
                        s0k s0kVar = new s0k(abstractC13912i5);
                        list = gd6.this.f23376dy;
                        c7394ca2 = new C7394ca("measure", s0kVar);
                        list.addItem(c7394ca2);
                        return true;
                    case 35:
                        zz0 zz0Var = new zz0(abstractC13912i5);
                        list = gd6.this.f23376dy;
                        c7394ca2 = new C7394ca("caption", zz0Var);
                        list.addItem(c7394ca2);
                        return true;
                    case 36:
                        p9u p9uVar = new p9u(abstractC13912i5);
                        list = gd6.this.f23376dy;
                        c7394ca2 = new C7394ca("connector", p9uVar);
                        list.addItem(c7394ca2);
                        return true;
                    case 37:
                        suk sukVar = new suk(abstractC13912i5);
                        list = gd6.this.f23376dy;
                        c7394ca2 = new C7394ca("control", sukVar);
                        list.addItem(c7394ca2);
                        return true;
                    case 38:
                        hhy hhyVar = new hhy(abstractC13912i5);
                        list = gd6.this.f23376dy;
                        c7394ca2 = new C7394ca("scene", hhyVar);
                        list.addItem(c7394ca2);
                        return true;
                    case 39:
                        h7e h7eVar = new h7e(abstractC13912i5);
                        list = gd6.this.f23376dy;
                        c7394ca2 = new C7394ca("custom-shape", h7eVar);
                        list.addItem(c7394ca2);
                        return true;
                    case 40:
                        wiqVar = new wiq(abstractC13912i5);
                        list2 = gd6.this.f23376dy;
                        str = "change";
                        OooO.OooO0O0(str, wiqVar, list2);
                        return true;
                    case 41:
                        wiqVar = new wiq(abstractC13912i5);
                        list2 = gd6.this.f23376dy;
                        str = "change-start";
                        OooO.OooO0O0(str, wiqVar, list2);
                        return true;
                    case 42:
                        wiqVar = new wiq(abstractC13912i5);
                        list2 = gd6.this.f23376dy;
                        str = "change-end";
                        OooO.OooO0O0(str, wiqVar, list2);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m32469x1() {
        this.f23379kk = (byte) -1;
        this.f23375du = 0;
        this.f23376dy = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        wiq wiqVar;
        String strM29539k4;
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f23378k4;
        if (str3 != null) {
            c3059ii.m12955x1("text:style-name", str3);
        }
        c3059ii.m12955x1("text:name", this.f23382x1);
        byte b = this.f23379kk;
        if (b != -1) {
            c3059ii.m12955x1("text:protected", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str4 = this.f23381to;
        if (str4 != null) {
            c3059ii.m12955x1("text:protection-key", str4);
        }
        int i = this.f23375du;
        if (i != 0) {
            c3059ii.m12955x1("text:display", pga.m38900k4(i));
        }
        String str5 = this.f23377h4;
        if (str5 != null) {
            c3059ii.m12955x1("text:condition", str5);
        }
        C7394ca c7394ca = this.f23380m9;
        if (c7394ca != null) {
            int iM27428k4 = f23374c5.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 6) {
                ((oaq) this.f23380m9.m29541kk()).mo6846k4("text", c3059ii, this.f23380m9.m29539k4());
            } else if (iM27428k4 == 7) {
                ((xtg) this.f23380m9.m29541kk()).mo6846k4("office", c3059ii, this.f23380m9.m29539k4());
            }
        }
        List.Enumerator<C7394ca> it = this.f23376dy.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f23374c5.m27428k4(next.m29539k4())) {
                    case 8:
                        ((kmn) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 9:
                        ((ok7) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 10:
                        ((lxj) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 11:
                        ((kdz) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 12:
                        ((n6p) next.m29541kk()).mo6846k4("table", c3059ii, next.m29539k4());
                        continue;
                    case 13:
                        ((zg0) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 14:
                        ((gd6) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 15:
                        ((tfm) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 16:
                        ((oew) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 17:
                        ((ywb) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 18:
                        ((etq) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 19:
                        ((c7p) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 20:
                        ((f2w) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 21:
                        ((f5k) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 22:
                        ((mqt) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 23:
                        ((yxk) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 24:
                        ((er2) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 25:
                        ((rpj) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 26:
                        ((z4k) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 27:
                        ((em0) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 28:
                        ((tzu) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 29:
                        ((fmt) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 30:
                        ((sd3) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 31:
                        ((pnk) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 32:
                        ((klm) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 33:
                        ((vtn) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 34:
                        ((s0k) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 35:
                        ((zz0) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 36:
                        ((p9u) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 37:
                        ((suk) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 38:
                        ((hhy) next.m29541kk()).mo6846k4("dr3d", c3059ii, next.m29539k4());
                        continue;
                    case 39:
                        ((h7e) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 40:
                        wiqVar = (wiq) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        break;
                    case 41:
                        wiqVar = (wiq) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        break;
                    case 42:
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
