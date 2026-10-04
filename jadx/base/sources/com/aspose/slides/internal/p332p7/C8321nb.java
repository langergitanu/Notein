package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.nb */
/* JADX INFO: loaded from: classes4.dex */
public class C8321nb extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f27191kk = new C7017h4(C18437z2.f56754h, "pri");

    /* JADX INFO: renamed from: k4 */
    private String f27192k4;

    /* JADX INFO: renamed from: x1 */
    private long f27193x1;

    public C8321nb() {
    }

    public C8321nb(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.nb.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8321nb.f27191kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8321nb.this.f27192k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8321nb.this.f27193x1 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m37342k4() {
        return this.f27192k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1(C18437z2.f56754h, this.f27192k4);
        c3059ii.m12955x1("pri", C13850af.m65147x1(this.f27193x1));
        c3059ii.mo21898jd();
    }
}
