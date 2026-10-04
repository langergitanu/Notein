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
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class pnk extends AbstractC7361bz {

    /* JADX INFO: renamed from: uz */
    private static final C7017h4 f28483uz = new C7017h4("svg:y", "draw:z-index", "draw:name", "draw:id", "draw:style-name", "draw:class-names", "presentation:style-name", "presentation:class-names", "table:end-cell-address", "table:end-x", "table:end-y", "table:table-background", "text:anchor-type", "text:anchor-page-number", "draw:caption-id", NoteMeta.PROPERTY_TITLE, "desc", "event-listeners", "glue-point", DrawToolFactory.LASSO_TYPE_RECT, "line", "polyline", "polygon", "regular-polygon", "path", "circle", "ellipse", "g", "page-thumbnail", "frame", "measure", "caption", "connector", "control", "scene", "custom-shape");

    /* JADX INFO: renamed from: c5 */
    private String f28484c5;

    /* JADX INFO: renamed from: ck */
    private String f28485ck;

    /* JADX INFO: renamed from: du */
    private String f28486du;

    /* JADX INFO: renamed from: dy */
    private String f28487dy;

    /* JADX INFO: renamed from: fa */
    private byte f28488fa;

    /* JADX INFO: renamed from: h4 */
    private String f28489h4;

    /* JADX INFO: renamed from: ix */
    private List<a7l> f28490ix;

    /* JADX INFO: renamed from: jd */
    private String f28491jd;

    /* JADX INFO: renamed from: k4 */
    private String f28492k4;

    /* JADX INFO: renamed from: kk */
    private String f28493kk;

    /* JADX INFO: renamed from: ks */
    private String f28494ks;

    /* JADX INFO: renamed from: m9 */
    private String f28495m9;

    /* JADX INFO: renamed from: ne */
    private hec f28496ne;

    /* JADX INFO: renamed from: rv */
    private String f28497rv;

    /* JADX INFO: renamed from: to */
    private String f28498to;

    /* JADX INFO: renamed from: u4 */
    private List<C7394ca> f28499u4;

    /* JADX INFO: renamed from: up */
    private int f28500up;

    /* JADX INFO: renamed from: x1 */
    private long f28501x1;

    /* JADX INFO: renamed from: x6 */
    private String f28502x6;

    /* JADX INFO: renamed from: yj */
    private long f28503yj;

    public pnk() {
        m39000du();
    }

    /* JADX INFO: renamed from: kk */
    public final List<C7394ca> m39023kk() {
        return this.f28499u4;
    }

    public pnk(final AbstractC13912i5 abstractC13912i5) {
        m39000du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.pnk.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (pnk.f28483uz.m27428k4(str)) {
                    case 0:
                        pnk.this.f28492k4 = str2;
                        break;
                    case 1:
                        pnk.this.f28501x1 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 2:
                        pnk.this.f28493kk = str2;
                        break;
                    case 3:
                        pnk.this.f28498to = str2;
                        break;
                    case 4:
                        pnk.this.f28486du = str2;
                        break;
                    case 5:
                        pnk.this.f28489h4 = str2;
                        break;
                    case 6:
                        pnk.this.f28495m9 = str2;
                        break;
                    case 7:
                        pnk.this.f28487dy = str2;
                        break;
                    case 8:
                        pnk.this.f28484c5 = str2;
                        break;
                    case 9:
                        pnk.this.f28491jd = str2;
                        break;
                    case 10:
                        pnk.this.f28485ck = str2;
                        break;
                    case 11:
                        pnk.this.f28488fa = AbstractC7361bz.m29296rv(str2);
                        break;
                    case 12:
                        pnk.this.f28500up = gle.m32620k4(str2);
                        break;
                    case 13:
                        pnk.this.f28503yj = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 14:
                        pnk.this.f28494ks = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.pnk.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (pnk.f28483uz.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 15:
                        pnk.this.f28497rv = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            pnk pnkVar = pnk.this;
                            pnkVar.f28497rv = C14113y2.m67400k4(pnkVar.f28497rv, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    case 16:
                        pnk.this.f28502x6 = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            pnk pnkVar2 = pnk.this;
                            pnkVar2.f28502x6 = C14113y2.m67400k4(pnkVar2.f28502x6, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    case 17:
                        pnk.this.f28496ne = new hec(abstractC13912i5);
                        return true;
                    case 18:
                        pnk.this.f28490ix.addItem(new a7l(abstractC13912i5));
                        return true;
                    case 19:
                        yxk yxkVar = new yxk(abstractC13912i5);
                        list = pnk.this.f28499u4;
                        c7394ca = new C7394ca(DrawToolFactory.LASSO_TYPE_RECT, yxkVar);
                        break;
                    case 20:
                        er2 er2Var = new er2(abstractC13912i5);
                        list = pnk.this.f28499u4;
                        c7394ca = new C7394ca("line", er2Var);
                        break;
                    case 21:
                        rpj rpjVar = new rpj(abstractC13912i5);
                        list = pnk.this.f28499u4;
                        c7394ca = new C7394ca("polyline", rpjVar);
                        break;
                    case 22:
                        z4k z4kVar = new z4k(abstractC13912i5);
                        list = pnk.this.f28499u4;
                        c7394ca = new C7394ca("polygon", z4kVar);
                        break;
                    case 23:
                        em0 em0Var = new em0(abstractC13912i5);
                        list = pnk.this.f28499u4;
                        c7394ca = new C7394ca("regular-polygon", em0Var);
                        break;
                    case 24:
                        tzu tzuVar = new tzu(abstractC13912i5);
                        list = pnk.this.f28499u4;
                        c7394ca = new C7394ca("path", tzuVar);
                        break;
                    case 25:
                        fmt fmtVar = new fmt(abstractC13912i5);
                        list = pnk.this.f28499u4;
                        c7394ca = new C7394ca("circle", fmtVar);
                        break;
                    case 26:
                        sd3 sd3Var = new sd3(abstractC13912i5);
                        list = pnk.this.f28499u4;
                        c7394ca = new C7394ca("ellipse", sd3Var);
                        break;
                    case 27:
                        pnk pnkVar3 = new pnk(abstractC13912i5);
                        list = pnk.this.f28499u4;
                        c7394ca = new C7394ca("g", pnkVar3);
                        break;
                    case 28:
                        klm klmVar = new klm(abstractC13912i5);
                        list = pnk.this.f28499u4;
                        c7394ca = new C7394ca("page-thumbnail", klmVar);
                        break;
                    case 29:
                        vtn vtnVar = new vtn(abstractC13912i5);
                        list = pnk.this.f28499u4;
                        c7394ca = new C7394ca("frame", vtnVar);
                        break;
                    case 30:
                        s0k s0kVar = new s0k(abstractC13912i5);
                        list = pnk.this.f28499u4;
                        c7394ca = new C7394ca("measure", s0kVar);
                        break;
                    case 31:
                        zz0 zz0Var = new zz0(abstractC13912i5);
                        list = pnk.this.f28499u4;
                        c7394ca = new C7394ca("caption", zz0Var);
                        break;
                    case 32:
                        p9u p9uVar = new p9u(abstractC13912i5);
                        list = pnk.this.f28499u4;
                        c7394ca = new C7394ca("connector", p9uVar);
                        break;
                    case 33:
                        suk sukVar = new suk(abstractC13912i5);
                        list = pnk.this.f28499u4;
                        c7394ca = new C7394ca("control", sukVar);
                        break;
                    case 34:
                        hhy hhyVar = new hhy(abstractC13912i5);
                        list = pnk.this.f28499u4;
                        c7394ca = new C7394ca("scene", hhyVar);
                        break;
                    case 35:
                        h7e h7eVar = new h7e(abstractC13912i5);
                        list = pnk.this.f28499u4;
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

    /* JADX INFO: renamed from: du */
    private void m39000du() {
        this.f28501x1 = 4294967295L;
        this.f28488fa = (byte) -1;
        this.f28500up = 0;
        this.f28503yj = 4294967295L;
        this.f28490ix = new List<>();
        this.f28499u4 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final String m39024x1() {
        return this.f28498to;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m39021k4(String str) {
        C7394ca c7394ca;
        switch (f28483uz.m27428k4(str)) {
            case 19:
                c7394ca = new C7394ca(DrawToolFactory.LASSO_TYPE_RECT, new yxk());
                break;
            case 20:
                c7394ca = new C7394ca("line", new er2());
                break;
            case 21:
                c7394ca = new C7394ca("polyline", new rpj());
                break;
            case 22:
                c7394ca = new C7394ca("polygon", new z4k());
                break;
            case 23:
                c7394ca = new C7394ca("regular-polygon", new em0());
                break;
            case 24:
                c7394ca = new C7394ca("path", new tzu());
                break;
            case 25:
                c7394ca = new C7394ca("circle", new fmt());
                break;
            case 26:
                c7394ca = new C7394ca("ellipse", new sd3());
                break;
            case 27:
                c7394ca = new C7394ca("g", new pnk());
                break;
            case 28:
                c7394ca = new C7394ca("page-thumbnail", new klm());
                break;
            case 29:
                c7394ca = new C7394ca("frame", new vtn());
                break;
            case 30:
                c7394ca = new C7394ca("measure", new s0k());
                break;
            case 31:
                c7394ca = new C7394ca("caption", new zz0());
                break;
            case 32:
                c7394ca = new C7394ca("connector", new p9u());
                break;
            case 33:
                c7394ca = new C7394ca("control", new suk());
                break;
            case 34:
                c7394ca = new C7394ca("scene", new hhy());
                break;
            case 35:
                c7394ca = new C7394ca("custom-shape", new h7e());
                break;
            default:
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        this.f28499u4.addItem(c7394ca);
        return c7394ca;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m39022k4() {
        return this.f28493kk;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f28492k4;
        if (str3 != null) {
            c3059ii.m12955x1("svg:y", str3);
        }
        long j = this.f28501x1;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("draw:z-index", C13850af.m65147x1(j));
        }
        String str4 = this.f28493kk;
        if (str4 != null) {
            c3059ii.m12955x1("draw:name", str4);
        }
        String str5 = this.f28498to;
        if (str5 != null) {
            c3059ii.m12955x1("draw:id", str5);
        }
        String str6 = this.f28486du;
        if (str6 != null) {
            c3059ii.m12955x1("draw:style-name", str6);
        }
        String str7 = this.f28489h4;
        if (str7 != null) {
            c3059ii.m12955x1("draw:class-names", str7);
        }
        String str8 = this.f28495m9;
        if (str8 != null) {
            c3059ii.m12955x1("presentation:style-name", str8);
        }
        String str9 = this.f28487dy;
        if (str9 != null) {
            c3059ii.m12955x1("presentation:class-names", str9);
        }
        String str10 = this.f28484c5;
        if (str10 != null) {
            c3059ii.m12955x1("table:end-cell-address", str10);
        }
        String str11 = this.f28491jd;
        if (str11 != null) {
            c3059ii.m12955x1("table:end-x", str11);
        }
        String str12 = this.f28485ck;
        if (str12 != null) {
            c3059ii.m12955x1("table:end-y", str12);
        }
        byte b = this.f28488fa;
        if (b != -1) {
            c3059ii.m12955x1("table:table-background", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        int i = this.f28500up;
        if (i != 0) {
            c3059ii.m12955x1("text:anchor-type", gle.m32621k4(i));
        }
        long j2 = this.f28503yj;
        if ((j2 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("text:anchor-page-number", C13850af.m65147x1(j2));
        }
        String str13 = this.f28494ks;
        if (str13 != null) {
            c3059ii.m12955x1("draw:caption-id", str13);
        }
        String str14 = this.f28497rv;
        if (str14 != null) {
            m29301k4("svg", c3059ii, NoteMeta.PROPERTY_TITLE, str14, false);
        }
        String str15 = this.f28502x6;
        if (str15 != null) {
            m29301k4("svg", c3059ii, "desc", str15, false);
        }
        hec hecVar = this.f28496ne;
        if (hecVar != null) {
            hecVar.mo6846k4("office", c3059ii, "event-listeners");
        }
        List.Enumerator<C7394ca> it = this.f28490ix.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("draw", c3059ii, "glue-point");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = this.f28499u4.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f28483uz.m27428k4(next.m29539k4())) {
                    case 19:
                        ((yxk) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 20:
                        ((er2) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 21:
                        ((rpj) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 22:
                        ((z4k) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 23:
                        ((em0) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 24:
                        ((tzu) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 25:
                        ((fmt) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 26:
                        ((sd3) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 27:
                        ((pnk) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 28:
                        ((klm) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 29:
                        ((vtn) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 30:
                        ((s0k) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 31:
                        ((zz0) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 32:
                        ((p9u) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 33:
                        ((suk) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 34:
                        ((hhy) next.m29541kk()).mo6846k4("dr3d", c3059ii, next.m29539k4());
                        break;
                    case 35:
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
        c3059ii.mo21898jd();
    }
}
