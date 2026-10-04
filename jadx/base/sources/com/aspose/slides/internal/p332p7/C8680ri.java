package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ri */
/* JADX INFO: loaded from: classes4.dex */
public class C8680ri extends AbstractC7361bz {

    /* JADX INFO: renamed from: fa */
    private static final C7017h4 f29315fa = new C7017h4("uniqueId", "minVer", "defStyle", NoteMeta.PROPERTY_TITLE, "desc", "catLst", "sampData", "styleData", "clrData", "layoutNode", "extLst");

    /* JADX INFO: renamed from: c5 */
    private C7818h3 f29316c5;

    /* JADX INFO: renamed from: ck */
    private C8397nz f29317ck;

    /* JADX INFO: renamed from: du */
    private List<C9073vy> f29318du;

    /* JADX INFO: renamed from: dy */
    private C7818h3 f29319dy;

    /* JADX INFO: renamed from: h4 */
    private C8874tj f29320h4;

    /* JADX INFO: renamed from: jd */
    private C9103wc f29321jd;

    /* JADX INFO: renamed from: k4 */
    private String f29322k4;

    /* JADX INFO: renamed from: kk */
    private String f29323kk;

    /* JADX INFO: renamed from: m9 */
    private C7818h3 f29324m9;

    /* JADX INFO: renamed from: to */
    private List<C9415zy> f29325to;

    /* JADX INFO: renamed from: x1 */
    private String f29326x1;

    public C8680ri() {
        m40013du();
        this.f29321jd = new C9103wc();
    }

    /* JADX INFO: renamed from: du */
    private void m40013du() {
        this.f29322k4 = "";
        this.f29326x1 = "http://schemas.openxmlformats.org/drawingml/2006/diagram";
        this.f29323kk = "";
        this.f29325to = new List<>();
        this.f29318du = new List<>();
    }

    public C8680ri(final AbstractC13912i5 abstractC13912i5) {
        m40013du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ri.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8680ri.f29315fa.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8680ri.this.f29322k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C8680ri.this.f29326x1 = str2;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                C8680ri.this.f29323kk = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ri.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                AbstractC7361bz c9415zy;
                List list;
                switch (C8680ri.f29315fa.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 3:
                        c9415zy = new C9415zy(abstractC13912i5);
                        list = C8680ri.this.f29325to;
                        break;
                    case 4:
                        c9415zy = new C9073vy(abstractC13912i5);
                        list = C8680ri.this.f29318du;
                        break;
                    case 5:
                        C8680ri.this.f29320h4 = new C8874tj(abstractC13912i5);
                        return true;
                    case 6:
                        C8680ri.this.f29324m9 = new C7818h3(abstractC13912i5);
                        return true;
                    case 7:
                        C8680ri.this.f29319dy = new C7818h3(abstractC13912i5);
                        return true;
                    case 8:
                        C8680ri.this.f29316c5 = new C7818h3(abstractC13912i5);
                        return true;
                    case 9:
                        C8680ri.this.f29321jd = new C9103wc(abstractC13912i5);
                        return true;
                    case 10:
                        C8680ri.this.f29317ck = new C8397nz(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
                list.addItem(c9415zy);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: kk */
    public final C9103wc m40027kk() {
        return this.f29321jd;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8874tj m40028x1() {
        return this.f29320h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m40026k4() {
        return this.f29322k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("dgm", str2, "http://schemas.openxmlformats.org/drawingml/2006/diagram");
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main") == null) {
            c3059ii.m12954to("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/math") == null) {
            c3059ii.m12954to("xmlns", "m", null, "http://schemas.openxmlformats.org/officeDocument/2006/math");
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/wordprocessingml/2006/main") == null) {
            c3059ii.m12954to("xmlns", "w", null, "http://schemas.openxmlformats.org/wordprocessingml/2006/main");
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing") == null) {
            c3059ii.m12954to("xmlns", "wp", null, "http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing");
        }
        if (c3059ii.mo12952k4("http://schemas.microsoft.com/office/drawing/2010/main") == null) {
            c3059ii.m12954to("xmlns", "a14", null, "http://schemas.microsoft.com/office/drawing/2010/main");
        }
        if (!"".equals(this.f29322k4)) {
            c3059ii.m12955x1("uniqueId", this.f29322k4);
        }
        if (!"http://schemas.openxmlformats.org/drawingml/2006/diagram".equals(this.f29326x1)) {
            c3059ii.m12955x1("minVer", this.f29326x1);
        }
        if (!"".equals(this.f29323kk)) {
            c3059ii.m12955x1("defStyle", this.f29323kk);
        }
        List.Enumerator<C9073vy> it = this.f29325to.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("dgm", c3059ii, NoteMeta.PROPERTY_TITLE);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = this.f29318du.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("dgm", c3059ii, "desc");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C8874tj c8874tj = this.f29320h4;
        if (c8874tj != null) {
            c8874tj.mo6846k4("dgm", c3059ii, "catLst");
        }
        C7818h3 c7818h3 = this.f29324m9;
        if (c7818h3 != null) {
            c7818h3.mo6846k4("dgm", c3059ii, "sampData");
        }
        C7818h3 c7818h32 = this.f29319dy;
        if (c7818h32 != null) {
            c7818h32.mo6846k4("dgm", c3059ii, "styleData");
        }
        C7818h3 c7818h33 = this.f29316c5;
        if (c7818h33 != null) {
            c7818h33.mo6846k4("dgm", c3059ii, "clrData");
        }
        this.f29321jd.mo6846k4("dgm", c3059ii, "layoutNode");
        C8397nz c8397nz = this.f29317ck;
        if (c8397nz != null) {
            c8397nz.mo6846k4("dgm", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
