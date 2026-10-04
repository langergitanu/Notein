package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.huawei.hms.network.inner.api.NetworkService;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class lzp extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f26622kk = new C7017h4("config:name", "config-item-map-entry");

    /* JADX INFO: renamed from: k4 */
    private String f26623k4;

    /* JADX INFO: renamed from: x1 */
    private List<ntz> f26624x1;

    public lzp() {
        m36556x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m36556x1() {
        this.f26624x1 = new List<>();
    }

    public lzp(final AbstractC13912i5 abstractC13912i5) {
        m36556x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.lzp.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (lzp.f26622kk.m27428k4(str) != 0) {
                    return false;
                }
                lzp.this.f26623k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.lzp.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (lzp.f26622kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                lzp.this.f26624x1.addItem(new ntz(abstractC13912i5));
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("config:name", this.f26623k4);
        List.Enumerator<ntz> it = this.f26624x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4(NetworkService.Constants.CONFIG_SERVICE, c3059ii, "config-item-map-entry");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
