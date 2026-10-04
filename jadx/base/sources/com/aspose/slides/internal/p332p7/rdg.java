package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class rdg extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f29256to = new C7017h4("w_Alignment", "w_RelativeTo", "w_Leader");

    /* JADX INFO: renamed from: k4 */
    private int f29257k4;

    /* JADX INFO: renamed from: kk */
    private int f29258kk;

    /* JADX INFO: renamed from: x1 */
    private int f29259x1;

    public rdg() {
        m39965x1();
    }

    public rdg(AbstractC13912i5 abstractC13912i5) {
        m39965x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.rdg.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = rdg.f29256to.m27428k4(str);
                if (iM27428k4 == 0) {
                    rdg.this.f29257k4 = umy.m42489k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    rdg.this.f29259x1 = jby.m34639k4(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                rdg.this.f29258kk = vzp.m43437k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m39965x1() {
        this.f29257k4 = 0;
        this.f29259x1 = 0;
        this.f29258kk = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("w:alignment", umy.m42490k4(this.f29257k4));
        c3059ii.m12955x1("w:relativeTo", jby.m34640k4(this.f29259x1));
        c3059ii.m12955x1("w:leader", vzp.m43438k4(this.f29258kk));
        c3059ii.mo21898jd();
    }
}
