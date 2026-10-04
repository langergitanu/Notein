package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.vc */
/* JADX INFO: loaded from: classes4.dex */
public class C9024vc extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f31724to = new C7017h4("ax", "ay", "az");

    /* JADX INFO: renamed from: k4 */
    private float f31725k4;

    /* JADX INFO: renamed from: kk */
    private float f31726kk;

    /* JADX INFO: renamed from: x1 */
    private float f31727x1;

    public C9024vc() {
        m42922x1();
    }

    public C9024vc(AbstractC13912i5 abstractC13912i5) {
        m42922x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.vc.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C9024vc.f31724to.m27428k4(str);
                if (iM27428k4 == 0) {
                    C9024vc.this.f31725k4 = C13850af.m65151yj(str2) / 60000.0f;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C9024vc.this.f31727x1 = C13850af.m65151yj(str2) / 60000.0f;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                C9024vc.this.f31726kk = C13850af.m65151yj(str2) / 60000.0f;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m42922x1() {
        this.f31725k4 = 0.0f;
        this.f31727x1 = 0.0f;
        this.f31726kk = 0.0f;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (this.f31725k4 != 0.0f) {
            OooO00o.OooO00o(r6 * 60000.0f, 14, c3059ii, "ax");
        }
        if (this.f31727x1 != 0.0f) {
            OooO00o.OooO00o(r6 * 60000.0f, 14, c3059ii, "ay");
        }
        if (this.f31726kk != 0.0f) {
            OooO00o.OooO00o(r6 * 60000.0f, 14, c3059ii, "az");
        }
        c3059ii.mo21898jd();
    }
}
