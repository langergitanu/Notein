package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.google.firebase.messaging.Constants;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.rb */
/* JADX INFO: loaded from: classes4.dex */
public class C8663rb extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f29232to = new C7017h4("externalData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "extLst");

    /* JADX INFO: renamed from: k4 */
    private C7887hy f29233k4;

    /* JADX INFO: renamed from: kk */
    private C7249ah f29234kk;

    /* JADX INFO: renamed from: x1 */
    private List<C8557py> f29235x1;

    public C8663rb() {
        m39942to();
    }

    /* JADX INFO: renamed from: to */
    private void m39942to() {
        this.f29235x1 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final C8557py[] m39945x1() {
        return this.f29235x1.toArray(new C8557py[0]);
    }

    public C8663rb(final AbstractC13912i5 abstractC13912i5) {
        m39942to();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.rb.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8663rb.f29232to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8663rb.this.f29233k4 = new C7887hy(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C8663rb.this.f29235x1.addItem(new C8557py(abstractC13912i5));
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C8663rb.this.f29234kk = new C7249ah(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8557py m39943k4() {
        C8557py c8557py = new C8557py();
        this.f29235x1.addItem(c8557py);
        return c8557py;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39944k4(C7887hy c7887hy) {
        this.f29233k4 = c7887hy;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7887hy c7887hy = this.f29233k4;
        if (c7887hy != null) {
            c7887hy.mo6846k4("cx", c3059ii, "externalData");
        }
        List.Enumerator<C8557py> it = this.f29235x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("cx", c3059ii, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C7249ah c7249ah = this.f29234kk;
        if (c7249ah != null) {
            c7249ah.mo6846k4("cx", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
