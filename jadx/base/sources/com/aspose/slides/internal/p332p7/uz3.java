package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class uz3 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f31474kk = new C7017h4("text:id", "insertion", "deletion", "format-change");

    /* JADX INFO: renamed from: k4 */
    private String f31475k4;

    /* JADX INFO: renamed from: x1 */
    private C7394ca f31476x1;

    public uz3() {
    }

    public uz3(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.uz3.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (uz3.f31474kk.m27428k4(str) != 0) {
                    return false;
                }
                uz3.this.f31475k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.uz3.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                uz3 uz3Var;
                C7394ca c7394ca;
                int iM27428k4 = uz3.f31474kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    uz3Var = uz3.this;
                    c7394ca = new C7394ca("insertion", new kye(abstractC13912i5));
                } else if (iM27428k4 == 2) {
                    uz3Var = uz3.this;
                    c7394ca = new C7394ca("deletion", new apf(abstractC13912i5));
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    uz3Var = uz3.this;
                    c7394ca = new C7394ca("format-change", new kjx(abstractC13912i5));
                }
                uz3Var.f31476x1 = c7394ca;
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("text:id", this.f31475k4);
        C7394ca c7394ca = this.f31476x1;
        if (c7394ca != null) {
            int iM27428k4 = f31474kk.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 1) {
                ((kye) this.f31476x1.m29541kk()).mo6846k4("text", c3059ii, this.f31476x1.m29539k4());
            } else if (iM27428k4 == 2) {
                ((apf) this.f31476x1.m29541kk()).mo6846k4("text", c3059ii, this.f31476x1.m29539k4());
            } else if (iM27428k4 == 3) {
                ((kjx) this.f31476x1.m29541kk()).mo6846k4("text", c3059ii, this.f31476x1.m29539k4());
            }
        }
        c3059ii.mo21898jd();
    }
}
