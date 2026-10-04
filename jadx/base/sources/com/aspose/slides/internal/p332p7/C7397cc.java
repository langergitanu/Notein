package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.cc */
/* JADX INFO: loaded from: classes4.dex */
public class C7397cc extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f21023to = new C7017h4("ax:persistence", "r:id", "ocxPr");

    /* JADX INFO: renamed from: k4 */
    private int f21024k4;

    /* JADX INFO: renamed from: kk */
    private List<C8315n7> f21025kk;

    /* JADX INFO: renamed from: x1 */
    private String f21026x1;

    public C7397cc() {
        m29549du();
    }

    /* JADX INFO: renamed from: du */
    private void m29549du() {
        this.f21024k4 = -1;
        this.f21025kk = new List<>();
    }

    /* JADX INFO: renamed from: kk */
    public final C8315n7[] m29556kk() {
        return this.f21025kk.toArray(new C8315n7[0]);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m29557x1() {
        return this.f21024k4;
    }

    public C7397cc(final AbstractC13912i5 abstractC13912i5) {
        m29549du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.cc.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7397cc.f21023to.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7397cc.this.f21024k4 = C7997jf.m34671k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C7397cc.this.f21026x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.cc.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C7397cc.f21023to.m27428k4(abstractC13912i5.mo65023fa()) != 2) {
                    return false;
                }
                C7397cc.this.f21025kk.addItem(new C8315n7(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8315n7 m29554k4() {
        C8315n7 c8315n7 = new C8315n7();
        this.f21025kk.addItem(c8315n7);
        return c8315n7;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29555k4(int i) {
        this.f21024k4 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f21024k4;
        if (i != -1) {
            c3059ii.m12955x1("ax:persistence", C7997jf.m34672k4(i));
        }
        if (this.f21026x1 != null) {
            if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
                c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
            }
            c3059ii.m12955x1("r:id", this.f21026x1);
        }
        List.Enumerator<C8315n7> it = this.f21025kk.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("ax", c3059ii, "ocxPr");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
