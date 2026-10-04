package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ox */
/* JADX INFO: loaded from: classes4.dex */
public class C8480ox extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f28140x1 = new C7017h4("val");

    /* JADX INFO: renamed from: k4 */
    private int f28141k4;

    public C8480ox() {
        m38494x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m38494x1() {
        this.f28141k4 = 0;
    }

    public C8480ox(AbstractC13912i5 abstractC13912i5) {
        m38494x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ox.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8480ox.f28140x1.m27428k4(str) != 0) {
                    return false;
                }
                C8480ox.this.f28141k4 = C8998v3.m42710k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("val", C8998v3.m42711k4(this.f28141k4));
        c3059ii.mo21898jd();
    }
}
