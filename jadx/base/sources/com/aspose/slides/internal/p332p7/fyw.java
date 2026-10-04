package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class fyw extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f23123kk = new C7017h4("text:style-name", "text:bibliography-data-field");

    /* JADX INFO: renamed from: k4 */
    private String f23124k4;

    /* JADX INFO: renamed from: x1 */
    private int f23125x1;

    public fyw() {
        m32178x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m32178x1() {
        this.f23125x1 = 0;
    }

    public fyw(AbstractC13912i5 abstractC13912i5) {
        m32178x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.fyw.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = fyw.f23123kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    fyw.this.f23124k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                fyw.this.f23125x1 = ssa.m41277k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f23124k4;
        if (str3 != null) {
            c3059ii.m12955x1("text:style-name", str3);
        }
        c3059ii.m12955x1("text:bibliography-data-field", ssa.m41278k4(this.f23125x1));
        c3059ii.mo21898jd();
    }
}
