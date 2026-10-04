package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.h9 */
/* JADX INFO: loaded from: classes4.dex */
public class C7830h9 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f23999kk = new C7017h4("bld", "rev");

    /* JADX INFO: renamed from: k4 */
    private String f24000k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f24001x1;

    public C7830h9() {
        m33236x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m33236x1() {
        this.f24000k4 = "allAtOnce";
        this.f24001x1 = false;
    }

    public C7830h9(AbstractC13912i5 abstractC13912i5) {
        m33236x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.h9.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7830h9.f23999kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7830h9.this.f24000k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C7830h9.this.f24001x1 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (!"allAtOnce".equals(this.f24000k4)) {
            c3059ii.m12955x1("bld", this.f24000k4);
        }
        boolean z = this.f24001x1;
        if (z) {
            c3059ii.m12955x1("rev", z ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }
}
