package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.sd */
/* JADX INFO: loaded from: classes4.dex */
public class C8758sd extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f30031kk = new C7017h4("bld", "animBg");

    /* JADX INFO: renamed from: k4 */
    private String f30032k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f30033x1;

    public C8758sd() {
        m40899x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m40899x1() {
        this.f30032k4 = "allAtOnce";
        this.f30033x1 = true;
    }

    public C8758sd(AbstractC13912i5 abstractC13912i5) {
        m40899x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.sd.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8758sd.f30031kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8758sd.this.f30032k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8758sd.this.f30033x1 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (!"allAtOnce".equals(this.f30032k4)) {
            c3059ii.m12955x1("bld", this.f30032k4);
        }
        boolean z = this.f30033x1;
        if (!z) {
            c3059ii.m12955x1("animBg", z ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }
}
