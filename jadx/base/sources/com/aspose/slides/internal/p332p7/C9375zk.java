package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.zk */
/* JADX INFO: loaded from: classes4.dex */
public class C9375zk extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f33918x1 = new C7017h4("channelProperty");

    /* JADX INFO: renamed from: k4 */
    private List<C7479df> f33919k4;

    public C9375zk() {
        m45634kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m45634kk() {
        this.f33919k4 = new List<>();
    }

    public C9375zk(final AbstractC13912i5 abstractC13912i5) {
        m45634kk();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.zk.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C9375zk.f33918x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                C9375zk.this.f33919k4.addItem(new C7479df(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m45636k4(C7479df c7479df) {
        this.f33919k4.addItem(c7479df);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C7479df> it = this.f33919k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("inkml", c3059ii, "channelProperty");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final C7479df[] m45637k4() {
        return this.f33919k4.toArray(new C7479df[0]);
    }
}
