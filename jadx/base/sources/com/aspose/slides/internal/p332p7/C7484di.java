package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.di */
/* JADX INFO: loaded from: classes4.dex */
public class C7484di extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f21657x1 = new C7017h4("cxn");

    /* JADX INFO: renamed from: k4 */
    private List<C8869th> f21658k4;

    public C7484di() {
        m30361to();
    }

    /* JADX INFO: renamed from: to */
    private void m30361to() {
        this.f21658k4 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final C8869th[] m30363x1() {
        return this.f21658k4.toArray(new C8869th[0]);
    }

    public C7484di(final AbstractC13912i5 abstractC13912i5) {
        m30361to();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.di.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C7484di.f21657x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                C7484di.this.f21658k4.addItem(new C8869th(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8869th m30362k4() {
        C8869th c8869th = new C8869th();
        this.f21658k4.addItem(c8869th);
        return c8869th;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C8869th> it = this.f21658k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("a", c3059ii, "cxn");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
