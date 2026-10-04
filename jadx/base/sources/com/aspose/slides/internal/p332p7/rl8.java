package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class rl8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f29352to = new C7017h4("w_Uri", "w_Name", "w_Val");

    /* JADX INFO: renamed from: k4 */
    private String f29353k4;

    /* JADX INFO: renamed from: kk */
    private String f29354kk;

    /* JADX INFO: renamed from: x1 */
    private String f29355x1;

    public rl8() {
    }

    public rl8(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.rl8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = rl8.f29352to.m27428k4(str);
                if (iM27428k4 == 0) {
                    rl8.this.f29353k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    rl8.this.f29355x1 = str2;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                rl8.this.f29354kk = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f29353k4;
        if (str3 != null) {
            c3059ii.m12955x1("w:uri", str3);
        }
        c3059ii.m12955x1("w:name", this.f29355x1);
        c3059ii.m12955x1("w:val", this.f29354kk);
        c3059ii.mo21898jd();
    }
}
