package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class g2p extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f23180x1 = new C7017h4("w_Type");

    /* JADX INFO: renamed from: k4 */
    private int f23181k4;

    public g2p() {
        m32260x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m32260x1() {
        this.f23181k4 = 0;
    }

    public g2p(AbstractC13912i5 abstractC13912i5) {
        m32260x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.g2p.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (g2p.f23180x1.m27428k4(str) != 0) {
                    return false;
                }
                g2p.this.f23181k4 = j5x.m34565k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("w:type", j5x.m34566k4(this.f23181k4));
        c3059ii.mo21898jd();
    }
}
