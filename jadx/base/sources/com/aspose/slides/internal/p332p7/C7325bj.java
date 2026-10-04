package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.bj */
/* JADX INFO: loaded from: classes4.dex */
public class C7325bj extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f20573x1 = new C7017h4("e");

    /* JADX INFO: renamed from: k4 */
    private List<C9085w3> f20574k4;

    public C7325bj() {
        m28914to();
    }

    /* JADX INFO: renamed from: to */
    private void m28914to() {
        this.f20574k4 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final C9085w3[] m28916x1() {
        return this.f20574k4.toArray(new C9085w3[0]);
    }

    public C7325bj(final AbstractC13912i5 abstractC13912i5) {
        m28914to();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.bj.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C7325bj.f20573x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                C7325bj.this.f20574k4.addItem(new C9085w3(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C9085w3 m28915k4() {
        C9085w3 c9085w3 = new C9085w3();
        this.f20574k4.addItem(c9085w3);
        return c9085w3;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C9085w3> it = this.f20574k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("m", c3059ii, "e");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
