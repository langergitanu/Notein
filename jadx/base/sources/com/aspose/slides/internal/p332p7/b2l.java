package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class b2l extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f20402kk = new C7017h4("table:database-name", "table:query-name");

    /* JADX INFO: renamed from: k4 */
    private String f20403k4;

    /* JADX INFO: renamed from: x1 */
    private String f20404x1;

    public b2l() {
    }

    public b2l(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.b2l.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = b2l.f20402kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    b2l.this.f20403k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                b2l.this.f20404x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("table:database-name", this.f20403k4);
        c3059ii.m12955x1("table:query-name", this.f20404x1);
        c3059ii.mo21898jd();
    }
}
