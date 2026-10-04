package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.jg */
/* JADX INFO: loaded from: classes4.dex */
public class C7999jg extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f25117to = new C7017h4("plotSurface", "series", "extLst");

    /* JADX INFO: renamed from: k4 */
    private C9101wb f25118k4;

    /* JADX INFO: renamed from: kk */
    private C7249ah f25119kk;

    /* JADX INFO: renamed from: x1 */
    private List<C8324nc> f25120x1;

    public C7999jg() {
        m34681m9();
    }

    /* JADX INFO: renamed from: m9 */
    private void m34681m9() {
        this.f25120x1 = new List<>();
    }

    /* JADX INFO: renamed from: du */
    public final C7249ah m34682du() {
        return this.f25119kk;
    }

    /* JADX INFO: renamed from: kk */
    public final C9101wb m34685kk() {
        return this.f25118k4;
    }

    /* JADX INFO: renamed from: to */
    public final C8324nc[] m34686to() {
        return this.f25120x1.toArray(new C8324nc[0]);
    }

    /* JADX INFO: renamed from: x1 */
    public final C8324nc m34687x1() {
        C8324nc c8324nc = new C8324nc();
        this.f25120x1.addItem(c8324nc);
        return c8324nc;
    }

    public C7999jg(final AbstractC13912i5 abstractC13912i5) {
        m34681m9();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.jg.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7999jg.f25117to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7999jg.this.f25118k4 = new C9101wb(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C7999jg.this.f25120x1.addItem(new C8324nc(abstractC13912i5));
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C7999jg.this.f25119kk = new C7249ah(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C9101wb m34683k4() {
        if (this.f25118k4 != null) {
            throw new Exception("Only one <plotSurface> element can be added.");
        }
        C9101wb c9101wb = new C9101wb();
        this.f25118k4 = c9101wb;
        return c9101wb;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34684k4(C7249ah c7249ah) {
        this.f25119kk = c7249ah;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C9101wb c9101wb = this.f25118k4;
        if (c9101wb != null) {
            c9101wb.mo6846k4("cx", c3059ii, "plotSurface");
        }
        List.Enumerator<C8324nc> it = this.f25120x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("cx", c3059ii, "series");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C7249ah c7249ah = this.f25119kk;
        if (c7249ah != null) {
            c7249ah.mo6846k4("cx", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
