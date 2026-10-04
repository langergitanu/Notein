package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class qn8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f28956kk = new C7017h4("w_Val", "w_Id");

    /* JADX INFO: renamed from: k4 */
    private long f28957k4;

    /* JADX INFO: renamed from: x1 */
    private int f28958x1;

    public qn8() {
        m39600x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m39600x1() {
        this.f28958x1 = 0;
    }

    public qn8(AbstractC13912i5 abstractC13912i5) {
        m39600x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.qn8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = qn8.f28956kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    qn8.this.f28957k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                qn8.this.f28958x1 = C13850af.m65151yj(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("w:val", C13850af.m65147x1(this.f28957k4));
        int i = this.f28958x1;
        if (i != 0) {
            c3059ii.m12955x1("w:id", C13850af.m65103k4(i));
        }
        c3059ii.mo21898jd();
    }
}
