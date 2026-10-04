package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class hgt extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f24080kk = new C7017h4("table:cell-range-address", "filter");

    /* JADX INFO: renamed from: k4 */
    private String f24081k4;

    /* JADX INFO: renamed from: x1 */
    private ku2 f24082x1;

    public hgt() {
    }

    public hgt(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.hgt.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (hgt.f24080kk.m27428k4(str) != 0) {
                    return false;
                }
                hgt.this.f24081k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.hgt.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (hgt.f24080kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                hgt.this.f24082x1 = new ku2(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("table:cell-range-address", this.f24081k4);
        ku2 ku2Var = this.f24082x1;
        if (ku2Var != null) {
            ku2Var.mo6846k4("table", c3059ii, "filter");
        }
        c3059ii.mo21898jd();
    }
}
