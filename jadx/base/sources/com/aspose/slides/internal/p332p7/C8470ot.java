package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ot */
/* JADX INFO: loaded from: classes4.dex */
public class C8470ot extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f28093kk = new C7017h4(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, "val");

    /* JADX INFO: renamed from: k4 */
    private String f28094k4;

    /* JADX INFO: renamed from: x1 */
    private String f28095x1;

    public C8470ot() {
        m38441x1();
    }

    public C8470ot(AbstractC13912i5 abstractC13912i5) {
        m38441x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ot.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8470ot.f28093kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8470ot.this.f28094k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8470ot.this.f28095x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m38441x1() {
        this.f28094k4 = "";
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (!"".equals(this.f28094k4)) {
            c3059ii.m12955x1(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, this.f28094k4);
        }
        c3059ii.m12955x1("val", this.f28095x1);
        c3059ii.mo21898jd();
    }
}
