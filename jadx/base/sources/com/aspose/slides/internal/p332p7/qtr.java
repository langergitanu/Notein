package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14081nv;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class qtr extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f29022du = new C7017h4("password", "sqref", "name", "securityDescriptor");

    /* JADX INFO: renamed from: k4 */
    private int f29023k4;

    /* JADX INFO: renamed from: kk */
    private String f29024kk;

    /* JADX INFO: renamed from: to */
    private String f29025to;

    /* JADX INFO: renamed from: x1 */
    private String f29026x1;

    public qtr() {
        m39677x1();
    }

    public qtr(AbstractC13912i5 abstractC13912i5) {
        m39677x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.qtr.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = qtr.f29022du.m27428k4(str);
                if (iM27428k4 == 0) {
                    qtr.this.f29023k4 = C14081nv.m67064k4(str2, 515);
                    return true;
                }
                if (iM27428k4 == 1) {
                    qtr.this.f29026x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    qtr.this.f29024kk = str2;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                qtr.this.f29025to = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m39677x1() {
        this.f29023k4 = 65535;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f29023k4;
        if ((i & 65535) != 65535) {
            c3059ii.m12955x1("password", C14057f9.m66587k4(i & 65535, "X4"));
        }
        c3059ii.m12955x1("sqref", this.f29026x1);
        c3059ii.m12955x1("name", this.f29024kk);
        String str3 = this.f29025to;
        if (str3 != null) {
            c3059ii.m12955x1("securityDescriptor", str3);
        }
        c3059ii.mo21898jd();
    }
}
