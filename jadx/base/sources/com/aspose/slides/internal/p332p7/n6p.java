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
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class n6p extends AbstractC7361bz {

    /* JADX INFO: renamed from: wl */
    private static final C7017h4 f27133wl = new C7017h4("table:name", "table:style-name", "table:template-name", "table:use-first-row-styles", "table:use-last-row-styles", "table:use-first-column-styles", "table:use-last-column-styles", "table:use-banding-rows-styles", "table:use-banding-columns-styles", "table:protected", "table:protection-key", "table:print", "table:print-ranges", "table:is-sub-table", "table-source", "dde-source", "scenario", "forms", "shapes", "table-column-group", "table-columns", "table-column", "table-header-columns", "table-row-group", "table-rows", "table-row", "table-header-rows", "soft-page-break");

    /* JADX INFO: renamed from: c5 */
    private boolean f27134c5;

    /* JADX INFO: renamed from: ck */
    private String f27135ck;

    /* JADX INFO: renamed from: du */
    private boolean f27136du;

    /* JADX INFO: renamed from: dy */
    private boolean f27137dy;

    /* JADX INFO: renamed from: fa */
    private boolean f27138fa;

    /* JADX INFO: renamed from: h4 */
    private boolean f27139h4;

    /* JADX INFO: renamed from: ix */
    private jhr f27140ix;

    /* JADX INFO: renamed from: jd */
    private boolean f27141jd;

    /* JADX INFO: renamed from: k4 */
    private String f27142k4;

    /* JADX INFO: renamed from: kk */
    private String f27143kk;

    /* JADX INFO: renamed from: ks */
    private z4d f27144ks;

    /* JADX INFO: renamed from: m9 */
    private boolean f27145m9;

    /* JADX INFO: renamed from: ne */
    private wv6 f27146ne;

    /* JADX INFO: renamed from: rv */
    private xtg f27147rv;

    /* JADX INFO: renamed from: to */
    private boolean f27148to;

    /* JADX INFO: renamed from: u4 */
    private List<C7394ca> f27149u4;

    /* JADX INFO: renamed from: up */
    private String f27150up;

    /* JADX INFO: renamed from: uz */
    private List<C7394ca> f27151uz;

    /* JADX INFO: renamed from: x1 */
    private String f27152x1;

    /* JADX INFO: renamed from: x6 */
    private bfq f27153x6;

    /* JADX INFO: renamed from: yj */
    private boolean f27154yj;

    public n6p() {
        m37260fa();
    }

    /* JADX INFO: renamed from: fa */
    private void m37260fa() {
        this.f27148to = false;
        this.f27136du = false;
        this.f27139h4 = false;
        this.f27145m9 = false;
        this.f27137dy = false;
        this.f27134c5 = false;
        this.f27141jd = false;
        this.f27138fa = true;
        this.f27154yj = false;
        this.f27149u4 = new List<>();
        this.f27151uz = new List<>();
    }

    /* JADX INFO: renamed from: c5 */
    public final List<C7394ca> m37278c5() {
        return this.f27149u4;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m37280dy() {
        return this.f27134c5;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m37281h4() {
        return this.f27145m9;
    }

    /* JADX INFO: renamed from: jd */
    public final List<C7394ca> m37282jd() {
        return this.f27151uz;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m37287m9() {
        return this.f27137dy;
    }

    public n6p(final AbstractC13912i5 abstractC13912i5) {
        m37260fa();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.n6p.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (n6p.f27133wl.m27428k4(str)) {
                    case 0:
                        n6p.this.f27142k4 = str2;
                        break;
                    case 1:
                        n6p.this.f27152x1 = str2;
                        break;
                    case 2:
                        n6p.this.f27143kk = str2;
                        break;
                    case 3:
                        n6p.this.f27148to = C13850af.m65068c5(str2);
                        break;
                    case 4:
                        n6p.this.f27136du = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        n6p.this.f27139h4 = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        n6p.this.f27145m9 = C13850af.m65068c5(str2);
                        break;
                    case 7:
                        n6p.this.f27137dy = C13850af.m65068c5(str2);
                        break;
                    case 8:
                        n6p.this.f27134c5 = C13850af.m65068c5(str2);
                        break;
                    case 9:
                        n6p.this.f27141jd = C13850af.m65068c5(str2);
                        break;
                    case 10:
                        n6p.this.f27135ck = str2;
                        break;
                    case 11:
                        n6p.this.f27138fa = C13850af.m65068c5(str2);
                        break;
                    case 12:
                        n6p.this.f27150up = str2;
                        break;
                    case 13:
                        n6p.this.f27154yj = C13850af.m65068c5(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.n6p.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (n6p.f27133wl.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 14:
                        n6p.this.f27144ks = new z4d(abstractC13912i5);
                        return true;
                    case 15:
                        n6p.this.f27147rv = new xtg(abstractC13912i5);
                        return true;
                    case 16:
                        n6p.this.f27153x6 = new bfq(abstractC13912i5);
                        return true;
                    case 17:
                        n6p.this.f27146ne = new wv6(abstractC13912i5);
                        return true;
                    case 18:
                        n6p.this.f27140ix = new jhr(abstractC13912i5);
                        return true;
                    case 19:
                        fa3 fa3Var = new fa3(abstractC13912i5);
                        list = n6p.this.f27149u4;
                        c7394ca = new C7394ca("table-column-group", fa3Var);
                        break;
                    case 20:
                        ed2 ed2Var = new ed2(abstractC13912i5);
                        list = n6p.this.f27149u4;
                        c7394ca = new C7394ca("table-columns", ed2Var);
                        break;
                    case 21:
                        k6w k6wVar = new k6w(abstractC13912i5);
                        list = n6p.this.f27149u4;
                        c7394ca = new C7394ca("table-column", k6wVar);
                        break;
                    case 22:
                        nt8 nt8Var = new nt8(abstractC13912i5);
                        list = n6p.this.f27149u4;
                        c7394ca = new C7394ca("table-header-columns", nt8Var);
                        break;
                    case 23:
                        mrd mrdVar = new mrd(abstractC13912i5);
                        list = n6p.this.f27151uz;
                        c7394ca = new C7394ca("table-row-group", mrdVar);
                        break;
                    case 24:
                        awn awnVar = new awn(abstractC13912i5);
                        list = n6p.this.f27151uz;
                        c7394ca = new C7394ca("table-rows", awnVar);
                        break;
                    case 25:
                        exz exzVar = new exz(abstractC13912i5);
                        list = n6p.this.f27151uz;
                        c7394ca = new C7394ca("table-row", exzVar);
                        break;
                    case 26:
                        hi8 hi8Var = new hi8(abstractC13912i5);
                        list = n6p.this.f27151uz;
                        c7394ca = new C7394ca("table-header-rows", hi8Var);
                        break;
                    case 27:
                        tfm tfmVar = new tfm(abstractC13912i5);
                        list = n6p.this.f27151uz;
                        c7394ca = new C7394ca("soft-page-break", tfmVar);
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
    public final boolean m37279du() {
        return this.f27139h4;
    }

    /* JADX INFO: renamed from: kk */
    public final void m37285kk(String str) {
        this.f27142k4 = str;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m37288to() {
        return this.f27136du;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7394ca m37289x1(String str) {
        C7394ca c7394ca;
        switch (f27133wl.m27428k4(str)) {
            case 23:
                c7394ca = new C7394ca("table-row-group", new mrd());
                break;
            case 24:
                c7394ca = new C7394ca("table-rows", new awn());
                break;
            case 25:
                c7394ca = new C7394ca("table-row", new exz());
                break;
            case 26:
                c7394ca = new C7394ca("table-header-rows", new hi8());
                break;
            case 27:
                c7394ca = new C7394ca("soft-page-break", new tfm());
                break;
            default:
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        this.f27151uz.addItem(c7394ca);
        return c7394ca;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m37283k4(String str) {
        C7394ca c7394ca;
        switch (f27133wl.m27428k4(str)) {
            case 19:
                c7394ca = new C7394ca("table-column-group", new fa3());
                break;
            case 20:
                c7394ca = new C7394ca("table-columns", new ed2());
                break;
            case 21:
                c7394ca = new C7394ca("table-column", new k6w());
                break;
            case 22:
                c7394ca = new C7394ca("table-header-columns", new nt8());
                break;
            default:
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        this.f27149u4.addItem(c7394ca);
        return c7394ca;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m37286kk() {
        return this.f27148to;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m37290x1() {
        return this.f27143kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m37284k4() {
        return this.f27142k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("table:name", this.f27142k4);
        String str3 = this.f27152x1;
        if (str3 != null) {
            c3059ii.m12955x1("table:style-name", str3);
        }
        String str4 = this.f27143kk;
        if (str4 != null) {
            c3059ii.m12955x1("table:template-name", str4);
        }
        boolean z = this.f27148to;
        String str5 = TelemetryEventStrings.Value.FALSE;
        if (z) {
            c3059ii.m12955x1("table:use-first-row-styles", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z2 = this.f27136du;
        if (z2) {
            c3059ii.m12955x1("table:use-last-row-styles", z2 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z3 = this.f27139h4;
        if (z3) {
            c3059ii.m12955x1("table:use-first-column-styles", z3 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z4 = this.f27145m9;
        if (z4) {
            c3059ii.m12955x1("table:use-last-column-styles", z4 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z5 = this.f27137dy;
        if (z5) {
            c3059ii.m12955x1("table:use-banding-rows-styles", z5 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z6 = this.f27134c5;
        if (z6) {
            c3059ii.m12955x1("table:use-banding-columns-styles", z6 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z7 = this.f27141jd;
        if (z7) {
            c3059ii.m12955x1("table:protected", z7 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str6 = this.f27135ck;
        if (str6 != null) {
            c3059ii.m12955x1("table:protection-key", str6);
        }
        boolean z8 = this.f27138fa;
        if (!z8) {
            c3059ii.m12955x1("table:print", z8 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str7 = this.f27150up;
        if (str7 != null) {
            c3059ii.m12955x1("table:print-ranges", str7);
        }
        boolean z9 = this.f27154yj;
        if (z9) {
            if (z9) {
                str5 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("table:is-sub-table", str5);
        }
        z4d z4dVar = this.f27144ks;
        if (z4dVar != null) {
            z4dVar.mo6846k4("table", c3059ii, "table-source");
        }
        xtg xtgVar = this.f27147rv;
        if (xtgVar != null) {
            xtgVar.mo6846k4("office", c3059ii, "dde-source");
        }
        bfq bfqVar = this.f27153x6;
        if (bfqVar != null) {
            bfqVar.mo6846k4("table", c3059ii, "scenario");
        }
        wv6 wv6Var = this.f27146ne;
        if (wv6Var != null) {
            wv6Var.mo6846k4("office", c3059ii, "forms");
        }
        jhr jhrVar = this.f27140ix;
        if (jhrVar != null) {
            jhrVar.mo6846k4("table", c3059ii, "shapes");
        }
        List.Enumerator<C7394ca> it = this.f27149u4.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f27133wl.m27428k4(next.m29539k4())) {
                    case 19:
                        ((fa3) next.m29541kk()).mo6846k4("table", c3059ii, next.m29539k4());
                        break;
                    case 20:
                        ((ed2) next.m29541kk()).mo6846k4("table", c3059ii, next.m29539k4());
                        break;
                    case 21:
                        ((k6w) next.m29541kk()).mo6846k4("table", c3059ii, next.m29539k4());
                        break;
                    case 22:
                        ((nt8) next.m29541kk()).mo6846k4("table", c3059ii, next.m29539k4());
                        break;
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = this.f27151uz.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next2 = it.next();
                switch (f27133wl.m27428k4(next2.m29539k4())) {
                    case 23:
                        ((mrd) next2.m29541kk()).mo6846k4("table", c3059ii, next2.m29539k4());
                        break;
                    case 24:
                        ((awn) next2.m29541kk()).mo6846k4("table", c3059ii, next2.m29539k4());
                        break;
                    case 25:
                        ((exz) next2.m29541kk()).mo6846k4("table", c3059ii, next2.m29539k4());
                        break;
                    case 26:
                        ((hi8) next2.m29541kk()).mo6846k4("table", c3059ii, next2.m29539k4());
                        break;
                    case 27:
                        ((tfm) next2.m29541kk()).mo6846k4("text", c3059ii, next2.m29539k4());
                        break;
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        c3059ii.mo21898jd();
    }
}
