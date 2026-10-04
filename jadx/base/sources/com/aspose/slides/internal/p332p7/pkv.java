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
public class pkv extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f28458to = new C7017h4("style:name", "style:display-name", "placeholder");

    /* JADX INFO: renamed from: k4 */
    private String f28459k4;

    /* JADX INFO: renamed from: kk */
    private List<zlb> f28460kk;

    /* JADX INFO: renamed from: x1 */
    private String f28461x1;

    public pkv() {
        m38962kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m38962kk() {
        this.f28460kk = new List<>();
    }

    public pkv(final AbstractC13912i5 abstractC13912i5) {
        m38962kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.pkv.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = pkv.f28458to.m27428k4(str);
                if (iM27428k4 == 0) {
                    pkv.this.f28459k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                pkv.this.f28461x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.pkv.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (pkv.f28458to.m27428k4(abstractC13912i5.mo65023fa()) != 2) {
                    return false;
                }
                pkv.this.f28460kk.addItem(new zlb(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final String m38965k4() {
        return this.f28459k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("style:name", this.f28459k4);
        String str3 = this.f28461x1;
        if (str3 != null) {
            c3059ii.m12955x1("style:display-name", str3);
        }
        List.Enumerator<zlb> it = this.f28460kk.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("presentation", c3059ii, "placeholder");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
