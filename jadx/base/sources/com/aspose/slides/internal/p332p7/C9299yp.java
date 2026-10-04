package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.yp */
/* JADX INFO: loaded from: classes4.dex */
public class C9299yp extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f33451x1 = new C7017h4("channel");

    /* JADX INFO: renamed from: k4 */
    private List<C7772gl> f33452k4;

    public C9299yp() {
        m45070kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m45070kk() {
        this.f33452k4 = new List<>();
    }

    public C9299yp(final AbstractC13912i5 abstractC13912i5) {
        m45070kk();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.yp.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C9299yp.f33451x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                C9299yp.this.f33452k4.addItem(new C7772gl(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m45072k4(C7772gl c7772gl) {
        this.f33452k4.addItem(c7772gl);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C7772gl> it = this.f33452k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("inkml", c3059ii, "channel");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final C7772gl[] m45073k4() {
        return this.f33452k4.toArray(new C7772gl[0]);
    }
}
