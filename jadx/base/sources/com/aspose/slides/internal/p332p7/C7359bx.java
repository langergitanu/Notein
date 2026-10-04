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
import com.facebook.common.callercontext.ContextChain;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.bx */
/* JADX INFO: loaded from: classes4.dex */
public class C7359bx extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f20770x1 = new C7017h4("relSizeAnchor", "absSizeAnchor");

    /* JADX INFO: renamed from: k4 */
    private List<C7394ca> f20771k4;

    public C7359bx() {
        m29208kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m29208kk() {
        this.f20771k4 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C7394ca> m29210k4() {
        return this.f20771k4;
    }

    public C7359bx(final AbstractC13912i5 abstractC13912i5) {
        m29208kk();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.bx.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                int iM27428k4 = C7359bx.f20770x1.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C9271yc c9271yc = new C9271yc(abstractC13912i5);
                    list = C7359bx.this.f20771k4;
                    c7394ca = new C7394ca("relSizeAnchor", c9271yc);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C7822h5 c7822h5 = new C7822h5(abstractC13912i5);
                    list = C7359bx.this.f20771k4;
                    c7394ca = new C7394ca("absSizeAnchor", c7822h5);
                }
                list.addItem(c7394ca);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m29211k4(String str) {
        C7394ca c7394ca;
        int iM27428k4 = f20770x1.m27428k4(str);
        if (iM27428k4 == 0) {
            c7394ca = new C7394ca("relSizeAnchor", new C9271yc());
        } else {
            if (iM27428k4 != 1) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("absSizeAnchor", new C7822h5());
        }
        this.f20771k4.addItem(c7394ca);
        return c7394ca;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("c", str2, "http://schemas.openxmlformats.org/drawingml/2006/chart");
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/chartDrawing") == null) {
            c3059ii.m12954to("xmlns", "cdr", null, "http://schemas.openxmlformats.org/drawingml/2006/chartDrawing");
        }
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
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/markup-compatibility/2006") == null) {
            c3059ii.m12954to("xmlns", "mc", null, "http://schemas.openxmlformats.org/markup-compatibility/2006");
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/presentationml/2006/main") == null) {
            c3059ii.m12954to("xmlns", ContextChain.TAG_PRODUCT, null, "http://schemas.openxmlformats.org/presentationml/2006/main");
        }
        if (c3059ii.mo12952k4("http://schemas.microsoft.com/office/powerpoint/2010/main") == null) {
            c3059ii.m12954to("xmlns", "p14", null, "http://schemas.microsoft.com/office/powerpoint/2010/main");
        }
        List.Enumerator<C7394ca> it = this.f20771k4.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM27428k4 = f20770x1.m27428k4(next.m29539k4());
                if (iM27428k4 == 0) {
                    ((C9271yc) next.m29541kk()).mo6846k4("cdr", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 1) {
                    ((C7822h5) next.m29541kk()).mo6846k4("cdr", c3059ii, next.m29539k4());
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
