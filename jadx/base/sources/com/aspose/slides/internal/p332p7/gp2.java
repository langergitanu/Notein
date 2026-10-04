package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class gp2 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f23670kk = new C7017h4("table:id", "change-track-table-cell");

    /* JADX INFO: renamed from: k4 */
    private String f23671k4;

    /* JADX INFO: renamed from: x1 */
    private fmm f23672x1;

    public gp2() {
        this.f23672x1 = new fmm();
    }

    public gp2(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.gp2.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (gp2.f23670kk.m27428k4(str) != 0) {
                    return false;
                }
                gp2.this.f23671k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.gp2.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (gp2.f23670kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                gp2.this.f23672x1 = new fmm(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f23671k4;
        if (str3 != null) {
            c3059ii.m12955x1("table:id", str3);
        }
        this.f23672x1.mo6846k4("table", c3059ii, "change-track-table-cell");
        c3059ii.mo21898jd();
    }
}
