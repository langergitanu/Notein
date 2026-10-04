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
public class o5n extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f27718x1 = new C7017h4("layer");

    /* JADX INFO: renamed from: k4 */
    private List<wsu> f27719k4;

    public o5n() {
        m38015kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m38015kk() {
        this.f27719k4 = new List<>();
    }

    public o5n(final AbstractC13912i5 abstractC13912i5) {
        m38015kk();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.o5n.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (o5n.f27718x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                o5n.this.f27719k4.addItem(new wsu(abstractC13912i5));
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<wsu> it = this.f27719k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("draw", c3059ii, "layer");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final wsu[] m38017k4() {
        return this.f27719k4.toArray(new wsu[0]);
    }
}
