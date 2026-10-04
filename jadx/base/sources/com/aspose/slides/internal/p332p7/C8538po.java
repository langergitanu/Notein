package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.po */
/* JADX INFO: loaded from: classes4.dex */
public class C8538po extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f28512x1 = new C7017h4("extraClrScheme");

    /* JADX INFO: renamed from: k4 */
    private List<C7660fc> f28513k4;

    public C8538po() {
        m39034to();
    }

    /* JADX INFO: renamed from: to */
    private void m39034to() {
        this.f28513k4 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final C7660fc[] m39036x1() {
        return this.f28513k4.toArray(new C7660fc[0]);
    }

    public C8538po(final AbstractC13912i5 abstractC13912i5) {
        m39034to();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.po.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C8538po.f28512x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                C8538po.this.f28513k4.addItem(new C7660fc(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7660fc m39035k4() {
        C7660fc c7660fc = new C7660fc();
        this.f28513k4.addItem(c7660fc);
        return c7660fc;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C7660fc> it = this.f28513k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("a", c3059ii, "extraClrScheme");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
