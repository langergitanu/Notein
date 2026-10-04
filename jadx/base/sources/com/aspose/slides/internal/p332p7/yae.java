package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class yae extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f33293to = new C7017h4("w_Val", "w_EastAsia", "w_Bidi");

    /* JADX INFO: renamed from: k4 */
    private String f33294k4;

    /* JADX INFO: renamed from: kk */
    private String f33295kk;

    /* JADX INFO: renamed from: x1 */
    private String f33296x1;

    public yae() {
    }

    public yae(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.yae.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = yae.f33293to.m27428k4(str);
                if (iM27428k4 == 0) {
                    yae.this.f33294k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    yae.this.f33296x1 = str2;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                yae.this.f33295kk = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f33294k4;
        if (str3 != null) {
            c3059ii.m12955x1("w:val", str3);
        }
        String str4 = this.f33296x1;
        if (str4 != null) {
            c3059ii.m12955x1("w:eastAsia", str4);
        }
        String str5 = this.f33295kk;
        if (str5 != null) {
            c3059ii.m12955x1("w:bidi", str5);
        }
        c3059ii.mo21898jd();
    }
}
