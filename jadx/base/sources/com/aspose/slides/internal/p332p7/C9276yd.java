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

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.yd */
/* JADX INFO: loaded from: classes4.dex */
public class C9276yd extends AbstractC7361bz {

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f33334dy = new C7017h4("uniqueId", "minVer", NoteMeta.PROPERTY_TITLE, "desc", "catLst", "styleLbl", "extLst");

    /* JADX INFO: renamed from: du */
    private C9263y8 f33335du;

    /* JADX INFO: renamed from: h4 */
    private List<C8030jq> f33336h4;

    /* JADX INFO: renamed from: k4 */
    private String f33337k4;

    /* JADX INFO: renamed from: kk */
    private List<C8155l3> f33338kk;

    /* JADX INFO: renamed from: m9 */
    private C8397nz f33339m9;

    /* JADX INFO: renamed from: to */
    private List<C7831ha> f33340to;

    /* JADX INFO: renamed from: x1 */
    private String f33341x1;

    public C9276yd() {
        m44933du();
    }

    /* JADX INFO: renamed from: du */
    private void m44933du() {
        this.f33337k4 = "";
        this.f33341x1 = "http://schemas.openxmlformats.org/drawingml/2006/diagram";
        this.f33338kk = new List<>();
        this.f33340to = new List<>();
        this.f33336h4 = new List<>();
    }

    public C9276yd(final AbstractC13912i5 abstractC13912i5) {
        m44933du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.yd.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C9276yd.f33334dy.m27428k4(str);
                if (iM27428k4 == 0) {
                    C9276yd.this.f33337k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C9276yd.this.f33341x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.yd.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                AbstractC7361bz c8155l3;
                List list;
                int iM27428k4 = C9276yd.f33334dy.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 2) {
                    c8155l3 = new C8155l3(abstractC13912i5);
                    list = C9276yd.this.f33338kk;
                } else if (iM27428k4 == 3) {
                    c8155l3 = new C7831ha(abstractC13912i5);
                    list = C9276yd.this.f33340to;
                } else {
                    if (iM27428k4 == 4) {
                        C9276yd.this.f33335du = new C9263y8(abstractC13912i5);
                        return true;
                    }
                    if (iM27428k4 != 5) {
                        if (iM27428k4 != 6) {
                            return false;
                        }
                        C9276yd.this.f33339m9 = new C8397nz(abstractC13912i5);
                        return true;
                    }
                    c8155l3 = new C8030jq(abstractC13912i5);
                    list = C9276yd.this.f33336h4;
                }
                list.addItem(c8155l3);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: kk */
    public final C8030jq[] m44943kk() {
        return this.f33336h4.toArray(new C8030jq[0]);
    }

    /* JADX INFO: renamed from: x1 */
    public final C9263y8 m44944x1() {
        return this.f33335du;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m44942k4() {
        return this.f33337k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("dgm", str2, "http://schemas.openxmlformats.org/drawingml/2006/diagram");
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main") == null) {
            c3059ii.m12954to("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
        }
        if (!"".equals(this.f33337k4)) {
            c3059ii.m12955x1("uniqueId", this.f33337k4);
        }
        if (!"http://schemas.openxmlformats.org/drawingml/2006/diagram".equals(this.f33341x1)) {
            c3059ii.m12955x1("minVer", this.f33341x1);
        }
        List.Enumerator<C8155l3> it = this.f33338kk.iterator();
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
        List.Enumerator<C8030jq> it2 = this.f33340to.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().mo6846k4("dgm", c3059ii, "desc");
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        C9263y8 c9263y8 = this.f33335du;
        if (c9263y8 != null) {
            c9263y8.mo6846k4("dgm", c3059ii, "catLst");
        }
        it2 = this.f33336h4.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().mo6846k4("dgm", c3059ii, "styleLbl");
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        C8397nz c8397nz = this.f33339m9;
        if (c8397nz != null) {
            c8397nz.mo6846k4("dgm", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
