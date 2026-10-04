package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class dr1 extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f21801du = new C7017h4("table:name", "table:cell-range-address", "table:base-cell-address", "table:range-usable-as");

    /* JADX INFO: renamed from: k4 */
    private String f21802k4;

    /* JADX INFO: renamed from: kk */
    private String f21803kk;

    /* JADX INFO: renamed from: to */
    private String f21804to;

    /* JADX INFO: renamed from: x1 */
    private String f21805x1;

    public dr1() {
        m30555x1();
    }

    public dr1(AbstractC13912i5 abstractC13912i5) {
        m30555x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.dr1.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = dr1.f21801du.m27428k4(str);
                if (iM27428k4 == 0) {
                    dr1.this.f21802k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    dr1.this.f21805x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    dr1.this.f21803kk = str2;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                dr1.this.f21804to = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m30555x1() {
        this.f21804to = "none";
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("table:name", this.f21802k4);
        c3059ii.m12955x1("table:cell-range-address", this.f21805x1);
        String str3 = this.f21803kk;
        if (str3 != null) {
            c3059ii.m12955x1("table:base-cell-address", str3);
        }
        if (!"none".equals(this.f21804to)) {
            c3059ii.m12955x1("table:range-usable-as", this.f21804to);
        }
        c3059ii.mo21898jd();
    }
}
