package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ln */
/* JADX INFO: loaded from: classes4.dex */
public class C8201ln extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f26444kk = new C7017h4("borderBoxPr", "e");

    /* JADX INFO: renamed from: k4 */
    private C9278ye f26445k4;

    /* JADX INFO: renamed from: x1 */
    private C9085w3 f26446x1;

    public C8201ln() {
        this.f26446x1 = new C9085w3();
    }

    /* JADX INFO: renamed from: x1 */
    public final C9085w3 m36336x1() {
        return this.f26446x1;
    }

    public C8201ln(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ln.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8201ln.f26444kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8201ln.this.f26445k4 = new C9278ye(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C8201ln.this.f26446x1 = new C9085w3(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C9278ye m36334k4() {
        return this.f26445k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m36335k4(C9278ye c9278ye) {
        this.f26445k4 = c9278ye;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C9278ye c9278ye = this.f26445k4;
        if (c9278ye != null) {
            c9278ye.mo6846k4("m", c3059ii, "borderBoxPr");
        }
        this.f26446x1.mo6846k4("m", c3059ii, "e");
        c3059ii.mo21898jd();
    }
}
