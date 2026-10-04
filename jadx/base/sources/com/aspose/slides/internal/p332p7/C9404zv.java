package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.zv */
/* JADX INFO: loaded from: classes4.dex */
public class C9404zv extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f34170x1 = new C7017h4("mc");

    /* JADX INFO: renamed from: k4 */
    private List<C8338ng> f34171k4;

    public C9404zv() {
        m45958to();
    }

    /* JADX INFO: renamed from: to */
    private void m45958to() {
        this.f34171k4 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final C8338ng[] m45960x1() {
        return this.f34171k4.toArray(new C8338ng[0]);
    }

    public C9404zv(final AbstractC13912i5 abstractC13912i5) {
        m45958to();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.zv.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C9404zv.f34170x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                C9404zv.this.f34171k4.addItem(new C8338ng(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8338ng m45959k4() {
        C8338ng c8338ng = new C8338ng();
        this.f34171k4.addItem(c8338ng);
        return c8338ng;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C8338ng> it = this.f34171k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("m", c3059ii, "mc");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
