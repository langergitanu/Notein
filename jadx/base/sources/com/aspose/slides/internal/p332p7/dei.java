package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class dei extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f21604x1 = new C7017h4("spokes");

    /* JADX INFO: renamed from: k4 */
    private long f21605k4;

    public dei() {
        m30309kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m30309kk() {
        this.f21605k4 = 4L;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m30311k4() {
        return this.f21605k4;
    }

    public dei(AbstractC13912i5 abstractC13912i5) {
        m30309kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.dei.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (dei.f21604x1.m27428k4(str) != 0) {
                    return false;
                }
                dei.this.f21605k4 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m30312k4(long j) {
        this.f21605k4 = j;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f21605k4;
        if ((4294967295L & j) != 4) {
            c3059ii.m12955x1("spokes", C13850af.m65147x1(j));
        }
        c3059ii.mo21898jd();
    }
}
