package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.zo */
/* JADX INFO: loaded from: classes4.dex */
public class C9387zo extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f33992x1 = new C7017h4("dlblFTEntry");

    /* JADX INFO: renamed from: k4 */
    private List<C8062k8> f33993k4;

    public C9387zo() {
        m45713kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m45713kk() {
        this.f33993k4 = new List<>();
    }

    public C9387zo(final AbstractC13912i5 abstractC13912i5) {
        m45713kk();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.zo.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C9387zo.f33992x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                C9387zo.this.f33993k4.addItem(new C8062k8(abstractC13912i5));
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("c", str2, "http://schemas.microsoft.com/office/drawing/2012/chart");
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/chart") == null) {
            c3059ii.m12954to("xmlns", "c", null, "http://schemas.openxmlformats.org/drawingml/2006/chart");
        }
        List.Enumerator<C8062k8> it = this.f33993k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("c", c3059ii, "dlblFTEntry");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final C8062k8[] m45715k4() {
        return this.f33993k4.toArray(new C8062k8[0]);
    }
}
