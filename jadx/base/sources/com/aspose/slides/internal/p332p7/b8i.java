package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class b8i extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f20447kk = new C7017h4("anim:name", "anim:value");

    /* JADX INFO: renamed from: k4 */
    private String f20448k4;

    /* JADX INFO: renamed from: x1 */
    private String f20449x1;

    public b8i() {
    }

    public b8i(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.b8i.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = b8i.f20447kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    b8i.this.f20448k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                b8i.this.f20449x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("anim:name", this.f20448k4);
        c3059ii.m12955x1("anim:value", this.f20449x1);
        c3059ii.mo21898jd();
    }
}
