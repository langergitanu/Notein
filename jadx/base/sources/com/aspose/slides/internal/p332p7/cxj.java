package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class cxj extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f21361to = new C7017h4("table:label-cell-range-address", "table:data-cell-range-address", "table:orientation");

    /* JADX INFO: renamed from: k4 */
    private String f21362k4;

    /* JADX INFO: renamed from: kk */
    private int f21363kk;

    /* JADX INFO: renamed from: x1 */
    private String f21364x1;

    public cxj() {
        m29970x1();
    }

    public cxj(AbstractC13912i5 abstractC13912i5) {
        m29970x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.cxj.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = cxj.f21361to.m27428k4(str);
                if (iM27428k4 == 0) {
                    cxj.this.f21362k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    cxj.this.f21364x1 = str2;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                cxj.this.f21363kk = c0l.m29347k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m29970x1() {
        this.f21363kk = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("table:label-cell-range-address", this.f21362k4);
        c3059ii.m12955x1("table:data-cell-range-address", this.f21364x1);
        c3059ii.m12955x1("table:orientation", c0l.m29348k4(this.f21363kk));
        c3059ii.mo21898jd();
    }
}
