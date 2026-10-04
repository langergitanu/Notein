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

/* JADX INFO: loaded from: classes4.dex */
public class uih extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f31297to = new C7017h4("summaryZmObj", "gridLayout", "fixedLayout", "extLst");

    /* JADX INFO: renamed from: k4 */
    private List<zxr> f31298k4;

    /* JADX INFO: renamed from: kk */
    private ltr f31299kk;

    /* JADX INFO: renamed from: x1 */
    private C7394ca f31300x1;

    public uih() {
        m42400du();
    }

    /* JADX INFO: renamed from: du */
    private void m42400du() {
        this.f31298k4 = new List<>();
    }

    /* JADX INFO: renamed from: kk */
    public final C7394ca m42407kk() {
        return this.f31300x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final zxr[] m42408x1() {
        return this.f31298k4.toArray(new zxr[0]);
    }

    public uih(final AbstractC13912i5 abstractC13912i5) {
        m42400du();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.uih.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                uih uihVar;
                C7394ca c7394ca;
                int iM27428k4 = uih.f31297to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 != 0) {
                    if (iM27428k4 == 1) {
                        uihVar = uih.this;
                        c7394ca = new C7394ca("gridLayout", new x8n(abstractC13912i5));
                    } else if (iM27428k4 == 2) {
                        uihVar = uih.this;
                        c7394ca = new C7394ca("fixedLayout", new hxc(abstractC13912i5));
                    } else {
                        if (iM27428k4 != 3) {
                            return false;
                        }
                        uih.this.f31299kk = new ltr(abstractC13912i5);
                    }
                    uihVar.f31300x1 = c7394ca;
                } else {
                    uih.this.f31298k4.addItem(new zxr(abstractC13912i5));
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m42405k4(String str) {
        C7394ca c7394ca;
        if (this.f31300x1 != null) {
            throw new Exception("SummaryZoom already is initialized.");
        }
        int iM27428k4 = f31297to.m27428k4(str);
        if (iM27428k4 == 1) {
            c7394ca = new C7394ca("gridLayout", new x8n());
        } else {
            if (iM27428k4 != 2) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("fixedLayout", new hxc());
        }
        this.f31300x1 = c7394ca;
        return this.f31300x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final zxr m42406k4() {
        zxr zxrVar = new zxr();
        this.f31298k4.addItem(zxrVar);
        return zxrVar;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("psuz", str2, "http://schemas.microsoft.com/office/powerpoint/2016/summaryzoom");
        if (c3059ii.mo12952k4("http://schemas.microsoft.com/office/powerpoint/2016/6/main") == null) {
            c3059ii.m12954to("xmlns", "p166", null, "http://schemas.microsoft.com/office/powerpoint/2016/6/main");
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main") == null) {
            c3059ii.m12954to("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/presentationml/2006/main") == null) {
            c3059ii.m12954to("xmlns", ContextChain.TAG_PRODUCT, null, "http://schemas.openxmlformats.org/presentationml/2006/main");
        }
        List.Enumerator<zxr> it = this.f31298k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("psuz", c3059ii, "summaryZmObj");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C7394ca c7394ca = this.f31300x1;
        if (c7394ca != null) {
            int iM27428k4 = f31297to.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 1) {
                ((x8n) this.f31300x1.m29541kk()).mo6846k4("psuz", c3059ii, this.f31300x1.m29539k4());
            } else if (iM27428k4 == 2) {
                ((hxc) this.f31300x1.m29541kk()).mo6846k4("psuz", c3059ii, this.f31300x1.m29539k4());
            }
        }
        ltr ltrVar = this.f31299kk;
        if (ltrVar != null) {
            ltrVar.mo6846k4("psuz", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
