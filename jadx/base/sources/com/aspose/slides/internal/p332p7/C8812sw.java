package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.sw */
/* JADX INFO: loaded from: classes4.dex */
public class C8812sw extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f30437x1 = new C7017h4("val");

    /* JADX INFO: renamed from: k4 */
    private boolean f30438k4;

    public C8812sw() {
        m41369kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m41369kk() {
        this.f30438k4 = false;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f30438k4;
        if (z) {
            c3059ii.m12955x1("val", z ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }

    public C8812sw(AbstractC13912i5 abstractC13912i5) {
        m41369kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.sw.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8812sw.f30437x1.m27428k4(str) != 0) {
                    return false;
                }
                C8812sw.this.f30438k4 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m41371k4() {
        return this.f30438k4;
    }
}
