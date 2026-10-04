package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.yb */
/* JADX INFO: loaded from: classes4.dex */
public class C9269yb extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f33298du = new C7017h4("Id", "CanonicalizationMethod", "SignatureMethod", "Reference");

    /* JADX INFO: renamed from: k4 */
    private String f33299k4;

    /* JADX INFO: renamed from: kk */
    private C7206a1 f33300kk;

    /* JADX INFO: renamed from: to */
    private List<C7408ci> f33301to;

    /* JADX INFO: renamed from: x1 */
    private C8736s3 f33302x1;

    public C9269yb() {
        m44897du();
        this.f33302x1 = new C8736s3();
        this.f33300kk = new C7206a1();
    }

    /* JADX INFO: renamed from: du */
    private void m44897du() {
        this.f33301to = new List<>();
    }

    /* JADX INFO: renamed from: kk */
    public final C7206a1 m44904kk() {
        return this.f33300kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8736s3 m44905x1() {
        return this.f33302x1;
    }

    public C9269yb(final AbstractC13912i5 abstractC13912i5) {
        m44897du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.yb.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C9269yb.f33298du.m27428k4(str) != 0) {
                    return false;
                }
                C9269yb.this.f33299k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.yb.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C9269yb.f33298du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    C9269yb.this.f33302x1 = new C8736s3(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C9269yb.this.f33300kk = new C7206a1(abstractC13912i5);
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    C9269yb.this.f33301to.addItem(new C7408ci(abstractC13912i5));
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7408ci m44903k4() {
        C7408ci c7408ci = new C7408ci();
        this.f33301to.addItem(c7408ci);
        return c7408ci;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f33299k4;
        if (str3 != null) {
            c3059ii.m12955x1("Id", str3);
        }
        this.f33302x1.mo6846k4("", c3059ii, "CanonicalizationMethod");
        this.f33300kk.mo6846k4("", c3059ii, "SignatureMethod");
        List.Enumerator<C7408ci> it = this.f33301to.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("", c3059ii, "Reference");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
