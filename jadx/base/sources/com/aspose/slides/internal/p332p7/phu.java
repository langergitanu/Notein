package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class phu extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f28424kk = new C7017h4("text:id", "text:outline-level");

    /* JADX INFO: renamed from: k4 */
    private String f28425k4;

    /* JADX INFO: renamed from: x1 */
    private long f28426x1;

    public phu() {
        m38919x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m38919x1() {
        this.f28426x1 = 4294967295L;
    }

    public phu(AbstractC13912i5 abstractC13912i5) {
        m38919x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.phu.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = phu.f28424kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    phu.this.f28425k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                phu.this.f28426x1 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("text:id", this.f28425k4);
        long j = this.f28426x1;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("text:outline-level", C13850af.m65147x1(j));
        }
        c3059ii.mo21898jd();
    }
}
