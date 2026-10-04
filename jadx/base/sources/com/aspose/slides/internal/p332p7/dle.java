package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class dle extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f21694kk = new C7017h4("w_Type", "w_Val");

    /* JADX INFO: renamed from: k4 */
    private int f21695k4;

    /* JADX INFO: renamed from: x1 */
    private String f21696x1;

    public dle() {
        m30401x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m30401x1() {
        this.f21695k4 = 0;
    }

    public dle(AbstractC13912i5 abstractC13912i5) {
        m30401x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.dle.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = dle.f21694kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    dle.this.f21695k4 = hq1.m33575k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                dle.this.f21696x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f21695k4;
        if (i != 0) {
            c3059ii.m12955x1("w:type", hq1.m33576k4(i));
        }
        String str3 = this.f21696x1;
        if (str3 != null) {
            c3059ii.m12955x1("w:val", str3);
        }
        c3059ii.mo21898jd();
    }
}
