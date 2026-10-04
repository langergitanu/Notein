package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.p9 */
/* JADX INFO: loaded from: classes4.dex */
public class C8499p9 extends AbstractC7361bz {

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f28245ck = new C7017h4("r:embed", "r:link", "spPr", "camera", "trans", "raster", "extLst", "objViewport", "winViewport", "ambientLight", "ptLight", "spotLight", "dirLight", "unkLight");

    /* JADX INFO: renamed from: c5 */
    private C7431cr f28246c5;

    /* JADX INFO: renamed from: du */
    private C7883hv f28247du;

    /* JADX INFO: renamed from: dy */
    private C7394ca f28248dy;

    /* JADX INFO: renamed from: h4 */
    private C8202lo f28249h4;

    /* JADX INFO: renamed from: jd */
    private List<C7394ca> f28250jd;

    /* JADX INFO: renamed from: k4 */
    private String f28251k4;

    /* JADX INFO: renamed from: kk */
    private C8087kh f28252kk;

    /* JADX INFO: renamed from: m9 */
    private C8397nz f28253m9;

    /* JADX INFO: renamed from: to */
    private C8311n6 f28254to;

    /* JADX INFO: renamed from: x1 */
    private String f28255x1;

    public C8499p9() {
        m38644h4();
        this.f28252kk = new C8087kh();
        this.f28254to = new C8311n6();
        this.f28247du = new C7883hv();
    }

    /* JADX INFO: renamed from: h4 */
    private void m38644h4() {
        this.f28251k4 = "";
        this.f28255x1 = "";
        this.f28250jd = new List<>();
    }

    /* JADX INFO: renamed from: kk */
    public final C8202lo m38657kk() {
        return this.f28249h4;
    }

    /* JADX INFO: renamed from: to */
    public final C7394ca m38658to() {
        return this.f28248dy;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8087kh m38659x1() {
        return this.f28252kk;
    }

    public C8499p9(final AbstractC13912i5 abstractC13912i5) {
        m38644h4();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.p9.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8499p9.f28245ck.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8499p9.this.f28251k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8499p9.this.f28255x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.p9.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C8499p9 c8499p9;
                C7394ca c7394ca;
                List list;
                C7394ca c7394ca2;
                switch (C8499p9.f28245ck.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 2:
                        C8499p9.this.f28252kk = new C8087kh(abstractC13912i5);
                        return true;
                    case 3:
                        C8499p9.this.f28254to = new C8311n6(abstractC13912i5);
                        return true;
                    case 4:
                        C8499p9.this.f28247du = new C7883hv(abstractC13912i5);
                        return true;
                    case 5:
                        C8499p9.this.f28249h4 = new C8202lo(abstractC13912i5);
                        return true;
                    case 6:
                        C8499p9.this.f28253m9 = new C8397nz(abstractC13912i5);
                        return true;
                    case 7:
                        c8499p9 = C8499p9.this;
                        c7394ca = new C7394ca("objViewport", new C8949uf(abstractC13912i5));
                        c8499p9.f28248dy = c7394ca;
                        return true;
                    case 8:
                        c8499p9 = C8499p9.this;
                        c7394ca = new C7394ca("winViewport", new C8649r4(abstractC13912i5));
                        c8499p9.f28248dy = c7394ca;
                        return true;
                    case 9:
                        C8499p9.this.f28246c5 = new C7431cr(abstractC13912i5);
                        return true;
                    case 10:
                        C8175le c8175le = new C8175le(abstractC13912i5);
                        list = C8499p9.this.f28250jd;
                        c7394ca2 = new C7394ca("ptLight", c8175le);
                        list.addItem(c7394ca2);
                        return true;
                    case 11:
                        C9350z8 c9350z8 = new C9350z8(abstractC13912i5);
                        list = C8499p9.this.f28250jd;
                        c7394ca2 = new C7394ca("spotLight", c9350z8);
                        list.addItem(c7394ca2);
                        return true;
                    case 12:
                        C8683rk c8683rk = new C8683rk(abstractC13912i5);
                        list = C8499p9.this.f28250jd;
                        c7394ca2 = new C7394ca("dirLight", c8683rk);
                        list.addItem(c7394ca2);
                        return true;
                    case 13:
                        C8489p2 c8489p2 = new C8489p2(abstractC13912i5);
                        list = C8499p9.this.f28250jd;
                        c7394ca2 = new C7394ca("unkLight", c8489p2);
                        list.addItem(c7394ca2);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final String m38655k4() {
        return this.f28251k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38656k4(String str) {
        this.f28251k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("am3d", str2, "http://schemas.microsoft.com/office/drawing/2017/model3d");
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main") == null) {
            c3059ii.m12954to("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
        }
        if (!"".equals(this.f28251k4)) {
            if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
                c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
            }
            c3059ii.m12955x1("r:embed", this.f28251k4);
        }
        if (!"".equals(this.f28255x1)) {
            if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
                c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
            }
            c3059ii.m12955x1("r:link", this.f28255x1);
        }
        this.f28252kk.mo6846k4("am3d", c3059ii, "spPr");
        this.f28254to.mo6846k4("am3d", c3059ii, "camera");
        this.f28247du.mo6846k4("am3d", c3059ii, "trans");
        C8202lo c8202lo = this.f28249h4;
        if (c8202lo != null) {
            c8202lo.mo6846k4("am3d", c3059ii, "raster");
        }
        C8397nz c8397nz = this.f28253m9;
        if (c8397nz != null) {
            c8397nz.mo6846k4("am3d", c3059ii, "extLst");
        }
        C7394ca c7394ca = this.f28248dy;
        if (c7394ca != null) {
            int iM27428k4 = f28245ck.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 7) {
                ((C8949uf) this.f28248dy.m29541kk()).mo6846k4("am3d", c3059ii, this.f28248dy.m29539k4());
            } else if (iM27428k4 == 8) {
                ((C8649r4) this.f28248dy.m29541kk()).mo6846k4("am3d", c3059ii, this.f28248dy.m29539k4());
            }
        }
        C7431cr c7431cr = this.f28246c5;
        if (c7431cr != null) {
            c7431cr.mo6846k4("am3d", c3059ii, "ambientLight");
        }
        List.Enumerator<C7394ca> it = this.f28250jd.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f28245ck.m27428k4(next.m29539k4())) {
                    case 10:
                        ((C8175le) next.m29541kk()).mo6846k4("am3d", c3059ii, next.m29539k4());
                        break;
                    case 11:
                        ((C9350z8) next.m29541kk()).mo6846k4("am3d", c3059ii, next.m29539k4());
                        break;
                    case 12:
                        ((C8683rk) next.m29541kk()).mo6846k4("am3d", c3059ii, next.m29539k4());
                        break;
                    case 13:
                        ((C8489p2) next.m29541kk()).mo6846k4("am3d", c3059ii, next.m29539k4());
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
        c3059ii.mo21898jd();
    }
}
