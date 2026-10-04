package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.l3 */
/* JADX INFO: loaded from: classes4.dex */
public class C8155l3 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f26061kk = new C7017h4(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, "val");

    /* JADX INFO: renamed from: k4 */
    private String f26062k4;

    /* JADX INFO: renamed from: x1 */
    private String f26063x1;

    public C8155l3() {
        m35837x1();
    }

    public C8155l3(AbstractC13912i5 abstractC13912i5) {
        m35837x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.l3.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8155l3.f26061kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8155l3.this.f26062k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8155l3.this.f26063x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m35837x1() {
        this.f26062k4 = "";
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (!"".equals(this.f26062k4)) {
            c3059ii.m12955x1(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, this.f26062k4);
        }
        c3059ii.m12955x1("val", this.f26063x1);
        c3059ii.mo21898jd();
    }
}
