package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.vy */
/* JADX INFO: loaded from: classes4.dex */
public class C9073vy extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f32052kk = new C7017h4(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, "val");

    /* JADX INFO: renamed from: k4 */
    private String f32053k4;

    /* JADX INFO: renamed from: x1 */
    private String f32054x1;

    public C9073vy() {
        m43341x1();
    }

    public C9073vy(AbstractC13912i5 abstractC13912i5) {
        m43341x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.vy.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C9073vy.f32052kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    C9073vy.this.f32053k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C9073vy.this.f32054x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m43341x1() {
        this.f32053k4 = "";
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (!"".equals(this.f32053k4)) {
            c3059ii.m12955x1(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, this.f32053k4);
        }
        c3059ii.m12955x1("val", this.f32054x1);
        c3059ii.mo21898jd();
    }
}
