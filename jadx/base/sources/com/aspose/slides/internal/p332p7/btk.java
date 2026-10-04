package com.aspose.slides.internal.p332p7;

import Oooo0o0.C20986OooO0o0;
import OoooooO.C21445Oooo;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.miui.penengine.p596e.C18773h;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class btk extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private String f20706c5;

    /* JADX INFO: renamed from: du */
    private String f20708du;

    /* JADX INFO: renamed from: dy */
    private double f20709dy;

    /* JADX INFO: renamed from: fa */
    private byte f20710fa;

    /* JADX INFO: renamed from: h4 */
    private String f20711h4;

    /* JADX INFO: renamed from: kk */
    private long f20713kk;

    /* JADX INFO: renamed from: ks */
    private ud9 f20714ks;

    /* JADX INFO: renamed from: m9 */
    private int f20715m9;

    /* JADX INFO: renamed from: ne */
    private List<C7394ca> f20716ne;

    /* JADX INFO: renamed from: rv */
    private vdg f20717rv;

    /* JADX INFO: renamed from: to */
    private String f20718to;

    /* JADX INFO: renamed from: up */
    private String f20719up;

    /* JADX INFO: renamed from: x6 */
    private udt f20720x6;

    /* JADX INFO: renamed from: yj */
    private boolean f20721yj;

    /* JADX INFO: renamed from: k4 */
    public static final C14084qq f20704k4 = C14084qq.f47299x1.Clone();

    /* JADX INFO: renamed from: x1 */
    public static final C14077m4 f20705x1 = C14077m4.f47265kk.Clone();

    /* JADX INFO: renamed from: ix */
    private static final C7017h4 f20703ix = new C7017h4("table:number-columns-repeated", "table:style-name", "table:content-validation-name", "table:formula", "office:value-type", "office:value", "office:currency", "office:date-value", "office:time-value", "office:boolean-value", "office:string-value", "table:protect", "cell-range-source", "annotation", "detective", C18773h.f57233c, ContextChain.TAG_PRODUCT, "list", "numbered-paragraph", "table", "a", "section", "soft-page-break", "table-of-content", "illustration-index", "table-index", "object-index", "user-index", "alphabetical-index", "bibliography", DrawToolFactory.LASSO_TYPE_RECT, "line", "polyline", "polygon", "regular-polygon", "path", "circle", "ellipse", "g", "page-thumbnail", "frame", "measure", "caption", "connector", "control", "scene", "custom-shape", "change", "change-start", "change-end");

    /* JADX INFO: renamed from: jd */
    private C14084qq f20712jd = new C14084qq();

    /* JADX INFO: renamed from: ck */
    private C14077m4 f20707ck = new C14077m4();

    public btk() {
        m29139to();
    }

    /* JADX INFO: renamed from: x1 */
    public final List<C7394ca> m29143x1() {
        return this.f20716ne;
    }

    public btk(final AbstractC13912i5 abstractC13912i5) {
        m29139to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.btk.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (btk.f20703ix.m27428k4(str)) {
                    case 0:
                        btk.this.f20713kk = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 1:
                        btk.this.f20718to = str2;
                        break;
                    case 2:
                        btk.this.f20708du = str2;
                        break;
                    case 3:
                        btk.this.f20711h4 = str2;
                        break;
                    case 4:
                        btk.this.f20715m9 = b3e.m28701k4(str2);
                        break;
                    case 5:
                        btk.this.f20709dy = AbstractC7361bz.m29300yj(str2);
                        break;
                    case 6:
                        btk.this.f20706c5 = str2;
                        break;
                    case 7:
                        C14084qq.m67089k4(str2, C11697x1.m55252to(), 16).CloneTo(btk.this.f20712jd);
                        break;
                    case 8:
                        AbstractC7361bz.m29294ks(str2).CloneTo(btk.this.f20707ck);
                        break;
                    case 9:
                        btk.this.f20710fa = AbstractC7361bz.m29296rv(str2);
                        break;
                    case 10:
                        btk.this.f20719up = str2;
                        break;
                    case 11:
                        btk.this.f20721yj = C13850af.m65068c5(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.btk.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                wiq wiqVar;
                List list2;
                String str;
                switch (btk.f20703ix.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 12:
                        btk.this.f20714ks = new ud9(abstractC13912i5);
                        return true;
                    case 13:
                        btk.this.f20717rv = new vdg(abstractC13912i5);
                        return true;
                    case 14:
                        btk.this.f20720x6 = new udt(abstractC13912i5);
                        return true;
                    case 15:
                        kmn kmnVar = new kmn(abstractC13912i5);
                        list = btk.this.f20716ne;
                        c7394ca = new C7394ca(C18773h.f57233c, kmnVar);
                        list.addItem(c7394ca);
                        return true;
                    case 16:
                        C21445Oooo.OooO0OO(ContextChain.TAG_PRODUCT, new ok7(abstractC13912i5), btk.this.f20716ne);
                        return true;
                    case 17:
                        C22239OooO0oo.OooO00o("list", new lxj(abstractC13912i5), btk.this.f20716ne);
                        return true;
                    case 18:
                        kdz kdzVar = new kdz(abstractC13912i5);
                        list = btk.this.f20716ne;
                        c7394ca = new C7394ca("numbered-paragraph", kdzVar);
                        list.addItem(c7394ca);
                        return true;
                    case 19:
                        n6p n6pVar = new n6p(abstractC13912i5);
                        list = btk.this.f20716ne;
                        c7394ca = new C7394ca("table", n6pVar);
                        list.addItem(c7394ca);
                        return true;
                    case 20:
                        zg0 zg0Var = new zg0(abstractC13912i5);
                        list = btk.this.f20716ne;
                        c7394ca = new C7394ca("a", zg0Var);
                        list.addItem(c7394ca);
                        return true;
                    case 21:
                        gd6 gd6Var = new gd6(abstractC13912i5);
                        list = btk.this.f20716ne;
                        c7394ca = new C7394ca("section", gd6Var);
                        list.addItem(c7394ca);
                        return true;
                    case 22:
                        tfm tfmVar = new tfm(abstractC13912i5);
                        list = btk.this.f20716ne;
                        c7394ca = new C7394ca("soft-page-break", tfmVar);
                        list.addItem(c7394ca);
                        return true;
                    case 23:
                        oew oewVar = new oew(abstractC13912i5);
                        list = btk.this.f20716ne;
                        c7394ca = new C7394ca("table-of-content", oewVar);
                        list.addItem(c7394ca);
                        return true;
                    case 24:
                        ywb ywbVar = new ywb(abstractC13912i5);
                        list = btk.this.f20716ne;
                        c7394ca = new C7394ca("illustration-index", ywbVar);
                        list.addItem(c7394ca);
                        return true;
                    case 25:
                        etq etqVar = new etq(abstractC13912i5);
                        list = btk.this.f20716ne;
                        c7394ca = new C7394ca("table-index", etqVar);
                        list.addItem(c7394ca);
                        return true;
                    case 26:
                        c7p c7pVar = new c7p(abstractC13912i5);
                        list = btk.this.f20716ne;
                        c7394ca = new C7394ca("object-index", c7pVar);
                        list.addItem(c7394ca);
                        return true;
                    case 27:
                        f2w f2wVar = new f2w(abstractC13912i5);
                        list = btk.this.f20716ne;
                        c7394ca = new C7394ca("user-index", f2wVar);
                        list.addItem(c7394ca);
                        return true;
                    case 28:
                        f5k f5kVar = new f5k(abstractC13912i5);
                        list = btk.this.f20716ne;
                        c7394ca = new C7394ca("alphabetical-index", f5kVar);
                        list.addItem(c7394ca);
                        return true;
                    case 29:
                        mqt mqtVar = new mqt(abstractC13912i5);
                        list = btk.this.f20716ne;
                        c7394ca = new C7394ca("bibliography", mqtVar);
                        list.addItem(c7394ca);
                        return true;
                    case 30:
                        yxk yxkVar = new yxk(abstractC13912i5);
                        list = btk.this.f20716ne;
                        c7394ca = new C7394ca(DrawToolFactory.LASSO_TYPE_RECT, yxkVar);
                        list.addItem(c7394ca);
                        return true;
                    case 31:
                        er2 er2Var = new er2(abstractC13912i5);
                        list = btk.this.f20716ne;
                        c7394ca = new C7394ca("line", er2Var);
                        list.addItem(c7394ca);
                        return true;
                    case 32:
                        rpj rpjVar = new rpj(abstractC13912i5);
                        list = btk.this.f20716ne;
                        c7394ca = new C7394ca("polyline", rpjVar);
                        list.addItem(c7394ca);
                        return true;
                    case 33:
                        z4k z4kVar = new z4k(abstractC13912i5);
                        list = btk.this.f20716ne;
                        c7394ca = new C7394ca("polygon", z4kVar);
                        list.addItem(c7394ca);
                        return true;
                    case 34:
                        em0 em0Var = new em0(abstractC13912i5);
                        list = btk.this.f20716ne;
                        c7394ca = new C7394ca("regular-polygon", em0Var);
                        list.addItem(c7394ca);
                        return true;
                    case 35:
                        tzu tzuVar = new tzu(abstractC13912i5);
                        list = btk.this.f20716ne;
                        c7394ca = new C7394ca("path", tzuVar);
                        list.addItem(c7394ca);
                        return true;
                    case 36:
                        fmt fmtVar = new fmt(abstractC13912i5);
                        list = btk.this.f20716ne;
                        c7394ca = new C7394ca("circle", fmtVar);
                        list.addItem(c7394ca);
                        return true;
                    case 37:
                        sd3 sd3Var = new sd3(abstractC13912i5);
                        list = btk.this.f20716ne;
                        c7394ca = new C7394ca("ellipse", sd3Var);
                        list.addItem(c7394ca);
                        return true;
                    case 38:
                        pnk pnkVar = new pnk(abstractC13912i5);
                        list = btk.this.f20716ne;
                        c7394ca = new C7394ca("g", pnkVar);
                        list.addItem(c7394ca);
                        return true;
                    case 39:
                        klm klmVar = new klm(abstractC13912i5);
                        list = btk.this.f20716ne;
                        c7394ca = new C7394ca("page-thumbnail", klmVar);
                        list.addItem(c7394ca);
                        return true;
                    case 40:
                        vtn vtnVar = new vtn(abstractC13912i5);
                        list = btk.this.f20716ne;
                        c7394ca = new C7394ca("frame", vtnVar);
                        list.addItem(c7394ca);
                        return true;
                    case 41:
                        s0k s0kVar = new s0k(abstractC13912i5);
                        list = btk.this.f20716ne;
                        c7394ca = new C7394ca("measure", s0kVar);
                        list.addItem(c7394ca);
                        return true;
                    case 42:
                        zz0 zz0Var = new zz0(abstractC13912i5);
                        list = btk.this.f20716ne;
                        c7394ca = new C7394ca("caption", zz0Var);
                        list.addItem(c7394ca);
                        return true;
                    case 43:
                        p9u p9uVar = new p9u(abstractC13912i5);
                        list = btk.this.f20716ne;
                        c7394ca = new C7394ca("connector", p9uVar);
                        list.addItem(c7394ca);
                        return true;
                    case 44:
                        suk sukVar = new suk(abstractC13912i5);
                        list = btk.this.f20716ne;
                        c7394ca = new C7394ca("control", sukVar);
                        list.addItem(c7394ca);
                        return true;
                    case 45:
                        hhy hhyVar = new hhy(abstractC13912i5);
                        list = btk.this.f20716ne;
                        c7394ca = new C7394ca("scene", hhyVar);
                        list.addItem(c7394ca);
                        return true;
                    case 46:
                        h7e h7eVar = new h7e(abstractC13912i5);
                        list = btk.this.f20716ne;
                        c7394ca = new C7394ca("custom-shape", h7eVar);
                        list.addItem(c7394ca);
                        return true;
                    case 47:
                        wiqVar = new wiq(abstractC13912i5);
                        list2 = btk.this.f20716ne;
                        str = "change";
                        OooO.OooO0O0(str, wiqVar, list2);
                        return true;
                    case 48:
                        wiqVar = new wiq(abstractC13912i5);
                        list2 = btk.this.f20716ne;
                        str = "change-start";
                        OooO.OooO0O0(str, wiqVar, list2);
                        return true;
                    case 49:
                        wiqVar = new wiq(abstractC13912i5);
                        list2 = btk.this.f20716ne;
                        str = "change-end";
                        OooO.OooO0O0(str, wiqVar, list2);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: to */
    private void m29139to() {
        this.f20713kk = 1L;
        this.f20715m9 = 0;
        this.f20709dy = Double.NaN;
        f20704k4.CloneTo(this.f20712jd);
        f20705x1.CloneTo(this.f20707ck);
        this.f20710fa = (byte) -1;
        this.f20721yj = false;
        this.f20716ne = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m29142k4() {
        return this.f20718to;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        wiq wiqVar;
        String strM29539k4;
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f20713kk;
        if ((4294967295L & j) != 1) {
            c3059ii.m12955x1("table:number-columns-repeated", C13850af.m65147x1(j));
        }
        String str3 = this.f20718to;
        if (str3 != null) {
            c3059ii.m12955x1("table:style-name", str3);
        }
        String str4 = this.f20708du;
        if (str4 != null) {
            c3059ii.m12955x1("table:content-validation-name", str4);
        }
        String str5 = this.f20711h4;
        if (str5 != null) {
            c3059ii.m12955x1("table:formula", str5);
        }
        int i = this.f20715m9;
        if (i != 0) {
            c3059ii.m12955x1("office:value-type", b3e.m28702k4(i));
        }
        if (!C14044b3.m66437kk(this.f20709dy)) {
            c3059ii.m12955x1("office:value", C13850af.m65101k4(this.f20709dy));
        }
        String str6 = this.f20706c5;
        if (str6 != null) {
            c3059ii.m12955x1("office:currency", str6);
        }
        if (C14084qq.m67078dy(this.f20712jd, f20704k4)) {
            C20986OooO0o0.OooO0O0(this.f20712jd, "yyyy-MM-ddTHH:mm:ss.fffffffK", c3059ii, "office:date-value");
        }
        if (C14077m4.m66795du(this.f20707ck, f20705x1)) {
            C22240OooOO0o.OooO00o(this.f20707ck, c3059ii, "office:time-value");
        }
        byte b = this.f20710fa;
        String str7 = TelemetryEventStrings.Value.FALSE;
        if (b != -1) {
            c3059ii.m12955x1("office:boolean-value", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str8 = this.f20719up;
        if (str8 != null) {
            c3059ii.m12955x1("office:string-value", str8);
        }
        boolean z = this.f20721yj;
        if (z) {
            if (z) {
                str7 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("table:protect", str7);
        }
        ud9 ud9Var = this.f20714ks;
        if (ud9Var != null) {
            ud9Var.mo6846k4("table", c3059ii, "cell-range-source");
        }
        vdg vdgVar = this.f20717rv;
        if (vdgVar != null) {
            vdgVar.mo6846k4("office", c3059ii, "annotation");
        }
        udt udtVar = this.f20720x6;
        if (udtVar != null) {
            udtVar.mo6846k4("table", c3059ii, "detective");
        }
        List.Enumerator<C7394ca> it = this.f20716ne.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f20703ix.m27428k4(next.m29539k4())) {
                    case 15:
                        ((kmn) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 16:
                        ((ok7) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 17:
                        ((lxj) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 18:
                        ((kdz) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 19:
                        ((n6p) next.m29541kk()).mo6846k4("table", c3059ii, next.m29539k4());
                        continue;
                    case 20:
                        ((zg0) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 21:
                        ((gd6) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 22:
                        ((tfm) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 23:
                        ((oew) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 24:
                        ((ywb) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 25:
                        ((etq) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 26:
                        ((c7p) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 27:
                        ((f2w) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 28:
                        ((f5k) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 29:
                        ((mqt) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        continue;
                    case 30:
                        ((yxk) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 31:
                        ((er2) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 32:
                        ((rpj) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 33:
                        ((z4k) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 34:
                        ((em0) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 35:
                        ((tzu) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 36:
                        ((fmt) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 37:
                        ((sd3) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 38:
                        ((pnk) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 39:
                        ((klm) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 40:
                        ((vtn) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 41:
                        ((s0k) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 42:
                        ((zz0) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 43:
                        ((p9u) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 44:
                        ((suk) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 45:
                        ((hhy) next.m29541kk()).mo6846k4("dr3d", c3059ii, next.m29539k4());
                        continue;
                    case 46:
                        ((h7e) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        continue;
                    case 47:
                        wiqVar = (wiq) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        break;
                    case 48:
                        wiqVar = (wiq) next.m29541kk();
                        strM29539k4 = next.m29539k4();
                        break;
                    case 49:
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
