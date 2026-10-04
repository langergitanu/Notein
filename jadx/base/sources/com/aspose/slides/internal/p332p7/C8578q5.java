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
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.q5 */
/* JADX INFO: loaded from: classes4.dex */
public class C8578q5 extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f28751m9 = new C7017h4("layout", "areaChart", "area3DChart", "lineChart", "line3DChart", "stockChart", "radarChart", "scatterChart", "pieChart", "pie3DChart", "doughnutChart", "barChart", "bar3DChart", "ofPieChart", "surfaceChart", "surface3DChart", "bubbleChart", "valAx", "catAx", "dateAx", "serAx", "dTable", "spPr", "extLst");

    /* JADX INFO: renamed from: du */
    private C8087kh f28752du;

    /* JADX INFO: renamed from: h4 */
    private C7683fo f28753h4;

    /* JADX INFO: renamed from: k4 */
    private C7943in f28754k4;

    /* JADX INFO: renamed from: kk */
    private List<C7394ca> f28755kk;

    /* JADX INFO: renamed from: to */
    private C8875tk f28756to;

    /* JADX INFO: renamed from: x1 */
    private List<C7394ca> f28757x1;

    public C8578q5() {
        m39335ck();
    }

    /* JADX INFO: renamed from: ck */
    private void m39335ck() {
        this.f28757x1 = new List<>();
        this.f28755kk = new List<>();
    }

    /* JADX INFO: renamed from: c5 */
    public final AbstractC7414ck m39343c5() {
        return this.f28753h4;
    }

    /* JADX INFO: renamed from: du */
    public final List<C7394ca> m39344du() {
        return this.f28757x1;
    }

    /* JADX INFO: renamed from: dy */
    public final C8087kh m39345dy() {
        return this.f28752du;
    }

    /* JADX INFO: renamed from: h4 */
    public final List<C7394ca> m39346h4() {
        return this.f28755kk;
    }

    /* JADX INFO: renamed from: kk */
    public final C8087kh m39350kk() {
        if (this.f28752du != null) {
            throw new Exception("Only one <spPr> element can be added.");
        }
        C8087kh c8087kh = new C8087kh();
        this.f28752du = c8087kh;
        return c8087kh;
    }

    /* JADX INFO: renamed from: m9 */
    public final C8875tk m39351m9() {
        return this.f28756to;
    }

    /* JADX INFO: renamed from: to */
    public final C7943in m39352to() {
        return this.f28754k4;
    }

    public C8578q5(final AbstractC13912i5 abstractC13912i5) {
        m39335ck();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.q5.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (C8578q5.f28751m9.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        C8578q5.this.f28754k4 = new C7943in(abstractC13912i5);
                        return true;
                    case 1:
                        C8958uj c8958uj = new C8958uj(abstractC13912i5);
                        list = C8578q5.this.f28757x1;
                        c7394ca = new C7394ca("areaChart", c8958uj);
                        break;
                    case 2:
                        C9230xs c9230xs = new C9230xs(abstractC13912i5);
                        list = C8578q5.this.f28757x1;
                        c7394ca = new C7394ca("area3DChart", c9230xs);
                        break;
                    case 3:
                        C8954ui c8954ui = new C8954ui(abstractC13912i5);
                        list = C8578q5.this.f28757x1;
                        c7394ca = new C7394ca("lineChart", c8954ui);
                        break;
                    case 4:
                        C7972j1 c7972j1 = new C7972j1(abstractC13912i5);
                        list = C8578q5.this.f28757x1;
                        c7394ca = new C7394ca("line3DChart", c7972j1);
                        break;
                    case 5:
                        C8554pw c8554pw = new C8554pw(abstractC13912i5);
                        list = C8578q5.this.f28757x1;
                        c7394ca = new C7394ca("stockChart", c8554pw);
                        break;
                    case 6:
                        C8673rg c8673rg = new C8673rg(abstractC13912i5);
                        list = C8578q5.this.f28757x1;
                        c7394ca = new C7394ca("radarChart", c8673rg);
                        break;
                    case 7:
                        C7743gb c7743gb = new C7743gb(abstractC13912i5);
                        list = C8578q5.this.f28757x1;
                        c7394ca = new C7394ca("scatterChart", c7743gb);
                        break;
                    case 8:
                        C7591eq c7591eq = new C7591eq(abstractC13912i5);
                        list = C8578q5.this.f28757x1;
                        c7394ca = new C7394ca("pieChart", c7591eq);
                        break;
                    case 9:
                        C7693fr c7693fr = new C7693fr(abstractC13912i5);
                        list = C8578q5.this.f28757x1;
                        c7394ca = new C7394ca("pie3DChart", c7693fr);
                        break;
                    case 10:
                        C8689rn c8689rn = new C8689rn(abstractC13912i5);
                        list = C8578q5.this.f28757x1;
                        c7394ca = new C7394ca("doughnutChart", c8689rn);
                        break;
                    case 11:
                        C7945io c7945io = new C7945io(abstractC13912i5);
                        list = C8578q5.this.f28757x1;
                        c7394ca = new C7394ca("barChart", c7945io);
                        break;
                    case 12:
                        C7635f4 c7635f4 = new C7635f4(abstractC13912i5);
                        list = C8578q5.this.f28757x1;
                        c7394ca = new C7394ca("bar3DChart", c7635f4);
                        break;
                    case 13:
                        C7275aw c7275aw = new C7275aw(abstractC13912i5);
                        list = C8578q5.this.f28757x1;
                        c7394ca = new C7394ca("ofPieChart", c7275aw);
                        break;
                    case 14:
                        C9401zt c9401zt = new C9401zt(abstractC13912i5);
                        list = C8578q5.this.f28757x1;
                        c7394ca = new C7394ca("surfaceChart", c9401zt);
                        break;
                    case 15:
                        C8670re c8670re = new C8670re(abstractC13912i5);
                        list = C8578q5.this.f28757x1;
                        c7394ca = new C7394ca("surface3DChart", c8670re);
                        break;
                    case 16:
                        C7720g2 c7720g2 = new C7720g2(abstractC13912i5);
                        list = C8578q5.this.f28757x1;
                        c7394ca = new C7394ca("bubbleChart", c7720g2);
                        break;
                    case 17:
                        C9267ya c9267ya = new C9267ya(abstractC13912i5);
                        list = C8578q5.this.f28755kk;
                        c7394ca = new C7394ca("valAx", c9267ya);
                        break;
                    case 18:
                        C8616qo c8616qo = new C8616qo(abstractC13912i5);
                        list = C8578q5.this.f28755kk;
                        c7394ca = new C7394ca("catAx", c8616qo);
                        break;
                    case 19:
                        C7222a9 c7222a9 = new C7222a9(abstractC13912i5);
                        list = C8578q5.this.f28755kk;
                        c7394ca = new C7394ca("dateAx", c7222a9);
                        break;
                    case 20:
                        C9218xn c9218xn = new C9218xn(abstractC13912i5);
                        list = C8578q5.this.f28755kk;
                        c7394ca = new C7394ca("serAx", c9218xn);
                        break;
                    case 21:
                        C8578q5.this.f28756to = new C8875tk(abstractC13912i5);
                        return true;
                    case 22:
                        C8578q5.this.f28752du = new C8087kh(abstractC13912i5);
                        return true;
                    case 23:
                        C8578q5.this.f28753h4 = new C7683fo(abstractC13912i5);
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
    public final C7394ca m39347k4(String str) {
        C7394ca c7394ca;
        switch (f28751m9.m27428k4(str)) {
            case 17:
                c7394ca = new C7394ca("valAx", new C9267ya());
                break;
            case 18:
                c7394ca = new C7394ca("catAx", new C8616qo());
                break;
            case 19:
                c7394ca = new C7394ca("dateAx", new C7222a9());
                break;
            case 20:
                c7394ca = new C7394ca("serAx", new C9218xn());
                break;
            default:
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        this.f28755kk.addItem(c7394ca);
        return c7394ca;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7394ca m39353x1(String str) {
        C7394ca c7394ca;
        switch (f28751m9.m27428k4(str)) {
            case 1:
                c7394ca = new C7394ca("areaChart", new C8958uj());
                break;
            case 2:
                c7394ca = new C7394ca("area3DChart", new C9230xs());
                break;
            case 3:
                c7394ca = new C7394ca("lineChart", new C8954ui());
                break;
            case 4:
                c7394ca = new C7394ca("line3DChart", new C7972j1());
                break;
            case 5:
                c7394ca = new C7394ca("stockChart", new C8554pw());
                break;
            case 6:
                c7394ca = new C7394ca("radarChart", new C8673rg());
                break;
            case 7:
                c7394ca = new C7394ca("scatterChart", new C7743gb());
                break;
            case 8:
                c7394ca = new C7394ca("pieChart", new C7591eq());
                break;
            case 9:
                c7394ca = new C7394ca("pie3DChart", new C7693fr());
                break;
            case 10:
                c7394ca = new C7394ca("doughnutChart", new C8689rn());
                break;
            case 11:
                c7394ca = new C7394ca("barChart", new C7945io());
                break;
            case 12:
                c7394ca = new C7394ca("bar3DChart", new C7635f4());
                break;
            case 13:
                c7394ca = new C7394ca("ofPieChart", new C7275aw());
                break;
            case 14:
                c7394ca = new C7394ca("surfaceChart", new C9401zt());
                break;
            case 15:
                c7394ca = new C7394ca("surface3DChart", new C8670re());
                break;
            case 16:
                c7394ca = new C7394ca("bubbleChart", new C7720g2());
                break;
            default:
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        this.f28757x1.addItem(c7394ca);
        return c7394ca;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8875tk m39354x1() {
        if (this.f28756to != null) {
            throw new Exception("Only one <dTable> element can be added.");
        }
        C8875tk c8875tk = new C8875tk();
        this.f28756to = c8875tk;
        return c8875tk;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7943in m39348k4() {
        if (this.f28754k4 != null) {
            throw new Exception("Only one <layout> element can be added.");
        }
        C7943in c7943in = new C7943in();
        this.f28754k4 = c7943in;
        return c7943in;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39349k4(AbstractC7414ck abstractC7414ck) {
        this.f28753h4 = (C7683fo) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7943in c7943in = this.f28754k4;
        if (c7943in != null) {
            c7943in.mo6846k4("c", c3059ii, "layout");
        }
        List.Enumerator<C7394ca> it = this.f28757x1.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f28751m9.m27428k4(next.m29539k4())) {
                    case 1:
                        ((C8958uj) next.m29541kk()).mo6846k4("c", c3059ii, next.m29539k4());
                        break;
                    case 2:
                        ((C9230xs) next.m29541kk()).mo6846k4("c", c3059ii, next.m29539k4());
                        break;
                    case 3:
                        ((C8954ui) next.m29541kk()).mo6846k4("c", c3059ii, next.m29539k4());
                        break;
                    case 4:
                        ((C7972j1) next.m29541kk()).mo6846k4("c", c3059ii, next.m29539k4());
                        break;
                    case 5:
                        ((C8554pw) next.m29541kk()).mo6846k4("c", c3059ii, next.m29539k4());
                        break;
                    case 6:
                        ((C8673rg) next.m29541kk()).mo6846k4("c", c3059ii, next.m29539k4());
                        break;
                    case 7:
                        ((C7743gb) next.m29541kk()).mo6846k4("c", c3059ii, next.m29539k4());
                        break;
                    case 8:
                        ((C7591eq) next.m29541kk()).mo6846k4("c", c3059ii, next.m29539k4());
                        break;
                    case 9:
                        ((C7693fr) next.m29541kk()).mo6846k4("c", c3059ii, next.m29539k4());
                        break;
                    case 10:
                        ((C8689rn) next.m29541kk()).mo6846k4("c", c3059ii, next.m29539k4());
                        break;
                    case 11:
                        ((C7945io) next.m29541kk()).mo6846k4("c", c3059ii, next.m29539k4());
                        break;
                    case 12:
                        ((C7635f4) next.m29541kk()).mo6846k4("c", c3059ii, next.m29539k4());
                        break;
                    case 13:
                        ((C7275aw) next.m29541kk()).mo6846k4("c", c3059ii, next.m29539k4());
                        break;
                    case 14:
                        ((C9401zt) next.m29541kk()).mo6846k4("c", c3059ii, next.m29539k4());
                        break;
                    case 15:
                        ((C8670re) next.m29541kk()).mo6846k4("c", c3059ii, next.m29539k4());
                        break;
                    case 16:
                        ((C7720g2) next.m29541kk()).mo6846k4("c", c3059ii, next.m29539k4());
                        break;
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = this.f28755kk.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next2 = it.next();
                switch (f28751m9.m27428k4(next2.m29539k4())) {
                    case 17:
                        ((C9267ya) next2.m29541kk()).mo6846k4("c", c3059ii, next2.m29539k4());
                        break;
                    case 18:
                        ((C8616qo) next2.m29541kk()).mo6846k4("c", c3059ii, next2.m29539k4());
                        break;
                    case 19:
                        ((C7222a9) next2.m29541kk()).mo6846k4("c", c3059ii, next2.m29539k4());
                        break;
                    case 20:
                        ((C9218xn) next2.m29541kk()).mo6846k4("c", c3059ii, next2.m29539k4());
                        break;
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        C8875tk c8875tk = this.f28756to;
        if (c8875tk != null) {
            c8875tk.mo6846k4("c", c3059ii, "dTable");
        }
        C8087kh c8087kh = this.f28752du;
        if (c8087kh != null) {
            c8087kh.mo6846k4("c", c3059ii, "spPr");
        }
        C7683fo c7683fo = this.f28753h4;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
