package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.o0 */
/* JADX INFO: loaded from: classes4.dex */
public class C8399o0 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f27673kk = new C7017h4("Id", "Reference");

    /* JADX INFO: renamed from: k4 */
    private String f27674k4;

    /* JADX INFO: renamed from: x1 */
    private List<C7408ci> f27675x1;

    public C8399o0() {
        m37949to();
    }

    /* JADX INFO: renamed from: to */
    private void m37949to() {
        this.f27675x1 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final C7408ci[] m37951x1() {
        return this.f27675x1.toArray(new C7408ci[0]);
    }

    public C8399o0(final AbstractC13912i5 abstractC13912i5) {
        m37949to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.o0.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8399o0.f27673kk.m27428k4(str) != 0) {
                    return false;
                }
                C8399o0.this.f27674k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.o0.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C8399o0.f27673kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                C8399o0.this.f27675x1.addItem(new C7408ci(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7408ci m37950k4() {
        C7408ci c7408ci = new C7408ci();
        this.f27675x1.addItem(c7408ci);
        return c7408ci;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f27674k4;
        if (str3 != null) {
            c3059ii.m12955x1("Id", str3);
        }
        List.Enumerator<C7408ci> it = this.f27675x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("", c3059ii, "Reference");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
