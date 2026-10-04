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
public class zeg extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f33867x1 = new C7017h4("sheet");

    /* JADX INFO: renamed from: k4 */
    private List<pbm> f33868k4;

    public zeg() {
        m45583to();
    }

    /* JADX INFO: renamed from: to */
    private void m45583to() {
        this.f33868k4 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final pbm[] m45585x1() {
        return this.f33868k4.toArray(new pbm[0]);
    }

    public zeg(final AbstractC13912i5 abstractC13912i5) {
        m45583to();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.zeg.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (zeg.f33867x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                zeg.this.f33868k4.addItem(new pbm(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final pbm m45584k4() {
        pbm pbmVar = new pbm();
        this.f33868k4.addItem(pbmVar);
        return pbmVar;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<pbm> it = this.f33868k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("ssml", c3059ii, "sheet");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
