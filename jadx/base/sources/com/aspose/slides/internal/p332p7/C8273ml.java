package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ml */
/* JADX INFO: loaded from: classes4.dex */
public class C8273ml extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f26902kk = new C7017h4("def", "tblStyle");

    /* JADX INFO: renamed from: k4 */
    private C14047bz f26903k4 = new C14047bz();

    /* JADX INFO: renamed from: x1 */
    private List<C7565ef> f26904x1;

    public C8273ml() {
        m36990du();
    }

    /* JADX INFO: renamed from: du */
    private void m36990du() {
        C14047bz.f47172k4.CloneTo(this.f26903k4);
        this.f26904x1 = new List<>();
    }

    /* JADX INFO: renamed from: kk */
    public final C7565ef[] m36996kk() {
        return this.f26904x1.toArray(new C7565ef[0]);
    }

    /* JADX INFO: renamed from: x1 */
    public final C14047bz m36997x1() {
        return this.f26903k4;
    }

    public C8273ml(final AbstractC13912i5 abstractC13912i5) {
        m36990du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ml.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8273ml.f26902kk.m27428k4(str) != 0) {
                    return false;
                }
                C8273ml.this.f26903k4 = new C14047bz(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ml.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C8273ml.f26902kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                C8273ml.this.f26904x1.addItem(new C7565ef(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7565ef m36994k4() {
        C7565ef c7565ef = new C7565ef();
        this.f26904x1.addItem(c7565ef);
        return c7565ef;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m36995k4(C14047bz c14047bz) {
        c14047bz.CloneTo(this.f26903k4);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("a", str2, "http://schemas.openxmlformats.org/drawingml/2006/main");
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        c3059ii.m12955x1("def", C14113y2.m67408k4("{", OooOO0.OooO00o(this.f26903k4), "}"));
        List.Enumerator<C7565ef> it = this.f26904x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("a", c3059ii, "tblStyle");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
