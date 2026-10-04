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
public class ut6 extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f31413x1 = new C7017h4("rPr");

    /* JADX INFO: renamed from: k4 */
    private List<C7394ca> f31414k4;

    public ut6() {
        m42550x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m42550x1() {
        this.f31414k4 = new List<>();
    }

    public ut6(final AbstractC13912i5 abstractC13912i5) {
        m42550x1();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ut6.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (ut6.f31413x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                ut6.this.f31414k4.addItem(new C7394ca("rPr", new mrm(abstractC13912i5)));
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C7394ca> it = this.f31414k4.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                if (f31413x1.m27428k4(next.m29539k4()) == 0) {
                    ((mrm) next.m29541kk()).mo6846k4("w", c3059ii, next.m29539k4());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
