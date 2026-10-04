package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.mk */
/* JADX INFO: loaded from: classes4.dex */
public class C8272mk extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f26898kk = new C7017h4("v:ext", C18437z2.f56754h);

    /* JADX INFO: renamed from: k4 */
    private int f26899k4;

    /* JADX INFO: renamed from: x1 */
    private int f26900x1;

    public C8272mk() {
        m36989x1();
    }

    public C8272mk(AbstractC13912i5 abstractC13912i5) {
        m36989x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.mk.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8272mk.f26898kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8272mk.this.f26899k4 = dmv.m30455k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8272mk.this.f26900x1 = C9249y0.m44758k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m36989x1() {
        this.f26899k4 = 0;
        this.f26900x1 = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f26899k4;
        if (i != 0) {
            c3059ii.m12955x1("v:ext", dmv.m30456k4(i));
        }
        int i2 = this.f26900x1;
        if (i2 != 0) {
            c3059ii.m12955x1(C18437z2.f56754h, C9249y0.m44759k4(i2));
        }
        c3059ii.mo21898jd();
    }
}
