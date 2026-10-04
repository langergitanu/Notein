package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.u0 */
/* JADX INFO: loaded from: classes4.dex */
public class C8913u0 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f31006kk = new C7017h4("entityType", "entityId");

    /* JADX INFO: renamed from: k4 */
    private int f31007k4;

    /* JADX INFO: renamed from: x1 */
    private String f31008x1;

    public C8913u0() {
        m42059x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m42059x1() {
        this.f31007k4 = 0;
    }

    public C8913u0(AbstractC13912i5 abstractC13912i5) {
        m42059x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.u0.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8913u0.f31006kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8913u0.this.f31007k4 = C8798sr.m41220k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8913u0.this.f31008x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("entityType", C8798sr.m41221k4(this.f31007k4));
        c3059ii.m12955x1("entityId", this.f31008x1);
        c3059ii.mo21898jd();
    }
}
