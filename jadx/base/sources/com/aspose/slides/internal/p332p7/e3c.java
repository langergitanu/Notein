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
public class e3c extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f21987kk = new C7017h4("script", "event-listeners");

    /* JADX INFO: renamed from: k4 */
    private List<pv7> f21988k4;

    /* JADX INFO: renamed from: x1 */
    private hec f21989x1;

    public e3c() {
        m30780x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m30780x1() {
        this.f21988k4 = new List<>();
    }

    public e3c(final AbstractC13912i5 abstractC13912i5) {
        m30780x1();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.e3c.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = e3c.f21987kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    e3c.this.f21988k4.addItem(new pv7(abstractC13912i5));
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    e3c.this.f21989x1 = new hec(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<pv7> it = this.f21988k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("office", c3059ii, "script");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        hec hecVar = this.f21989x1;
        if (hecVar != null) {
            hecVar.mo6846k4("office", c3059ii, "event-listeners");
        }
        c3059ii.mo21898jd();
    }
}
