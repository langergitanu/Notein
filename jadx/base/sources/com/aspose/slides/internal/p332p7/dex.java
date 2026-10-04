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
public class dex extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f21607kk = new C7017h4("r", "cellSmartTag");

    /* JADX INFO: renamed from: k4 */
    private String f21608k4;

    /* JADX INFO: renamed from: x1 */
    private List<ytw> f21609x1;

    public dex() {
        m30316x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m30316x1() {
        this.f21609x1 = new List<>();
    }

    public dex(final AbstractC13912i5 abstractC13912i5) {
        m30316x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.dex.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (dex.f21607kk.m27428k4(str) != 0) {
                    return false;
                }
                dex.this.f21608k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.dex.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (dex.f21607kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                dex.this.f21609x1.addItem(new ytw(abstractC13912i5));
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("r", this.f21608k4);
        List.Enumerator<ytw> it = this.f21609x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("ssml", c3059ii, "cellSmartTag");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
