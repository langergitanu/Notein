package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class abb extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f19932to = new C7017h4("style:condition", "style:apply-style-name", "style:base-cell-address");

    /* JADX INFO: renamed from: k4 */
    private String f19933k4;

    /* JADX INFO: renamed from: kk */
    private String f19934kk;

    /* JADX INFO: renamed from: x1 */
    private String f19935x1;

    public abb() {
    }

    public abb(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.abb.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = abb.f19932to.m27428k4(str);
                if (iM27428k4 == 0) {
                    abb.this.f19933k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    abb.this.f19935x1 = str2;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                abb.this.f19934kk = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("style:condition", this.f19933k4);
        c3059ii.m12955x1("style:apply-style-name", this.f19935x1);
        String str3 = this.f19934kk;
        if (str3 != null) {
            c3059ii.m12955x1("style:base-cell-address", str3);
        }
        c3059ii.mo21898jd();
    }
}
