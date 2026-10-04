package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class n6c extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f27130x1 = new C7017h4("val");

    /* JADX INFO: renamed from: k4 */
    private long f27131k4;

    public n6c() {
    }

    /* JADX INFO: renamed from: k4 */
    public final long m37254k4() {
        return this.f27131k4;
    }

    public n6c(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.n6c.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (n6c.f27130x1.m27428k4(str) != 0) {
                    return false;
                }
                n6c.this.f27131k4 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("p14", str2, "http://schemas.microsoft.com/office/powerpoint/2010/main");
        c3059ii.m12955x1("val", C13850af.m65147x1(this.f27131k4));
        c3059ii.mo21898jd();
    }
}
