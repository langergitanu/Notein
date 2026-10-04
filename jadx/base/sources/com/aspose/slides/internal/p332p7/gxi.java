package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class gxi extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f23782x1 = new C7017h4("Cert");

    /* JADX INFO: renamed from: k4 */
    private List<hgq> f23783k4;

    public gxi() {
        m32978kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m32978kk() {
        this.f23783k4 = new List<>();
    }

    public gxi(final AbstractC13912i5 abstractC13912i5) {
        m32978kk();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.gxi.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (gxi.f23782x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                gxi.this.f23783k4.addItem(new hgq(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final hgq m32980k4() {
        hgq hgqVar = new hgq();
        this.f23783k4.addItem(hgqVar);
        return hgqVar;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<hgq> it = this.f23783k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("xd", c3059ii, "Cert");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
