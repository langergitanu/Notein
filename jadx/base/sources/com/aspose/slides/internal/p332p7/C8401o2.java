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

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.o2 */
/* JADX INFO: loaded from: classes4.dex */
public class C8401o2 extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f27684k4 = C8057k6.m35132k4("none");

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f27685m9 = new C7017h4("r:embed", "r:link", "cstate", "alphaBiLevel", "alphaCeiling", "alphaFloor", "alphaInv", "alphaMod", "alphaModFix", "alphaRepl", "biLevel", "blur", "clrChange", "clrRepl", "duotone", "fillOverlay", "grayscl", "hsl", "lum", "tint", "extLst");

    /* JADX INFO: renamed from: du */
    private List<C7394ca> f27686du;

    /* JADX INFO: renamed from: h4 */
    private C8397nz f27687h4;

    /* JADX INFO: renamed from: kk */
    private String f27688kk;

    /* JADX INFO: renamed from: to */
    private int f27689to;

    /* JADX INFO: renamed from: x1 */
    private String f27690x1;

    public C8401o2() {
        m37959h4();
    }

    /* JADX INFO: renamed from: h4 */
    private void m37959h4() {
        this.f27690x1 = "";
        this.f27688kk = "";
        this.f27689to = f27684k4;
        this.f27686du = new List<>();
    }

    /* JADX INFO: renamed from: kk */
    public final List<C7394ca> m37968kk() {
        return this.f27686du;
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC7414ck m37970to() {
        return this.f27687h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m37971x1() {
        return this.f27688kk;
    }

    public C8401o2(final AbstractC13912i5 abstractC13912i5) {
        m37959h4();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.o2.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8401o2.f27685m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8401o2.this.f27690x1 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C8401o2.this.f27688kk = str2;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                C8401o2.this.f27689to = C8057k6.m35132k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.o2.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (C8401o2.f27685m9.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 3:
                        C7770gj c7770gj = new C7770gj(abstractC13912i5);
                        list = C8401o2.this.f27686du;
                        c7394ca = new C7394ca("alphaBiLevel", c7770gj);
                        break;
                    case 4:
                        C8635qx c8635qx = new C8635qx(abstractC13912i5);
                        list = C8401o2.this.f27686du;
                        c7394ca = new C7394ca("alphaCeiling", c8635qx);
                        break;
                    case 5:
                        C8239m3 c8239m3 = new C8239m3(abstractC13912i5);
                        list = C8401o2.this.f27686du;
                        c7394ca = new C7394ca("alphaFloor", c8239m3);
                        break;
                    case 6:
                        C8295mx c8295mx = new C8295mx(abstractC13912i5);
                        list = C8401o2.this.f27686du;
                        c7394ca = new C7394ca("alphaInv", c8295mx);
                        break;
                    case 7:
                        C9417zz c9417zz = new C9417zz(abstractC13912i5);
                        list = C8401o2.this.f27686du;
                        c7394ca = new C7394ca("alphaMod", c9417zz);
                        break;
                    case 8:
                        C9250y1 c9250y1 = new C9250y1(abstractC13912i5);
                        list = C8401o2.this.f27686du;
                        c7394ca = new C7394ca("alphaModFix", c9250y1);
                        break;
                    case 9:
                        C7568eg c7568eg = new C7568eg(abstractC13912i5);
                        list = C8401o2.this.f27686du;
                        c7394ca = new C7394ca("alphaRepl", c7568eg);
                        break;
                    case 10:
                        C8495p8 c8495p8 = new C8495p8(abstractC13912i5);
                        list = C8401o2.this.f27686du;
                        c7394ca = new C7394ca("biLevel", c8495p8);
                        break;
                    case 11:
                        C8142kw c8142kw = new C8142kw(abstractC13912i5);
                        list = C8401o2.this.f27686du;
                        c7394ca = new C7394ca("blur", c8142kw);
                        break;
                    case 12:
                        C7291b2 c7291b2 = new C7291b2(abstractC13912i5);
                        list = C8401o2.this.f27686du;
                        c7394ca = new C7394ca("clrChange", c7291b2);
                        break;
                    case 13:
                        C8254mc c8254mc = new C8254mc(abstractC13912i5);
                        list = C8401o2.this.f27686du;
                        c7394ca = new C7394ca("clrRepl", c8254mc);
                        break;
                    case 14:
                        C9384zn c9384zn = new C9384zn(abstractC13912i5);
                        list = C8401o2.this.f27686du;
                        c7394ca = new C7394ca("duotone", c9384zn);
                        break;
                    case 15:
                        C8964ul c8964ul = new C8964ul(abstractC13912i5);
                        list = C8401o2.this.f27686du;
                        c7394ca = new C7394ca("fillOverlay", c8964ul);
                        break;
                    case 16:
                        C8588q9 c8588q9 = new C8588q9(abstractC13912i5);
                        list = C8401o2.this.f27686du;
                        c7394ca = new C7394ca("grayscl", c8588q9);
                        break;
                    case 17:
                        C8264mh c8264mh = new C8264mh(abstractC13912i5);
                        list = C8401o2.this.f27686du;
                        c7394ca = new C7394ca("hsl", c8264mh);
                        break;
                    case 18:
                        C7610ex c7610ex = new C7610ex(abstractC13912i5);
                        list = C8401o2.this.f27686du;
                        c7394ca = new C7394ca("lum", c7610ex);
                        break;
                    case 19:
                        C8171ld c8171ld = new C8171ld(abstractC13912i5);
                        list = C8401o2.this.f27686du;
                        c7394ca = new C7394ca("tint", c8171ld);
                        break;
                    case 20:
                        C8401o2.this.f27687h4 = new C8397nz(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
                list.addItem(c7394ca);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: kk */
    public final void m37969kk(String str) {
        this.f27688kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m37965k4(String str) {
        C7394ca c7394ca;
        switch (f27685m9.m27428k4(str)) {
            case 3:
                c7394ca = new C7394ca("alphaBiLevel", new C7770gj());
                break;
            case 4:
                c7394ca = new C7394ca("alphaCeiling", new C8635qx());
                break;
            case 5:
                c7394ca = new C7394ca("alphaFloor", new C8239m3());
                break;
            case 6:
                c7394ca = new C7394ca("alphaInv", new C8295mx());
                break;
            case 7:
                c7394ca = new C7394ca("alphaMod", new C9417zz());
                break;
            case 8:
                c7394ca = new C7394ca("alphaModFix", new C9250y1());
                break;
            case 9:
                c7394ca = new C7394ca("alphaRepl", new C7568eg());
                break;
            case 10:
                c7394ca = new C7394ca("biLevel", new C8495p8());
                break;
            case 11:
                c7394ca = new C7394ca("blur", new C8142kw());
                break;
            case 12:
                c7394ca = new C7394ca("clrChange", new C7291b2());
                break;
            case 13:
                c7394ca = new C7394ca("clrRepl", new C8254mc());
                break;
            case 14:
                c7394ca = new C7394ca("duotone", new C9384zn());
                break;
            case 15:
                c7394ca = new C7394ca("fillOverlay", new C8964ul());
                break;
            case 16:
                c7394ca = new C7394ca("grayscl", new C8588q9());
                break;
            case 17:
                c7394ca = new C7394ca("hsl", new C8264mh());
                break;
            case 18:
                c7394ca = new C7394ca("lum", new C7610ex());
                break;
            case 19:
                c7394ca = new C7394ca("tint", new C8171ld());
                break;
            default:
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        this.f27686du.addItem(c7394ca);
        return c7394ca;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m37972x1(String str) {
        this.f27690x1 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m37966k4() {
        return this.f27690x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37967k4(AbstractC7414ck abstractC7414ck) {
        this.f27687h4 = (C8397nz) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        if ("a".equals(c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main"))) {
            c3059ii.mo12953k4(str, str2, (String) null);
        } else {
            c3059ii.mo12953k4(str, str2, "http://schemas.openxmlformats.org/drawingml/2006/main");
        }
        if (!"".equals(this.f27690x1)) {
            if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
                c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
            }
            c3059ii.m12955x1("r:embed", this.f27690x1);
        }
        if (!"".equals(this.f27688kk)) {
            if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
                c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
            }
            c3059ii.m12955x1("r:link", this.f27688kk);
        }
        int i = this.f27689to;
        if (i != f27684k4) {
            c3059ii.m12955x1("cstate", C8057k6.m35133k4(i));
        }
        List.Enumerator<C7394ca> it = this.f27686du.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f27685m9.m27428k4(next.m29539k4())) {
                    case 3:
                        ((C7770gj) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 4:
                        ((C8635qx) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 5:
                        ((C8239m3) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 6:
                        ((C8295mx) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 7:
                        ((C9417zz) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 8:
                        ((C9250y1) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 9:
                        ((C7568eg) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 10:
                        ((C8495p8) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 11:
                        ((C8142kw) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 12:
                        ((C7291b2) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 13:
                        ((C8254mc) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 14:
                        ((C9384zn) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 15:
                        ((C8964ul) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 16:
                        ((C8588q9) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 17:
                        ((C8264mh) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 18:
                        ((C7610ex) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                        break;
                    case 19:
                        ((C8171ld) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
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
        C8397nz c8397nz = this.f27687h4;
        if (c8397nz != null) {
            c8397nz.mo6846k4("a", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
