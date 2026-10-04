package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class z1e extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f33647x1 = new C7017h4("text:c");

    /* JADX INFO: renamed from: k4 */
    private long f33648k4;

    public z1e() {
        m45324kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m45324kk() {
        this.f33648k4 = 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m45326k4() {
        return this.f33648k4;
    }

    public z1e(AbstractC13912i5 abstractC13912i5) {
        m45324kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.z1e.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (z1e.f33647x1.m27428k4(str) != 0) {
                    return false;
                }
                z1e.this.f33648k4 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f33648k4;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("text:c", C13850af.m65147x1(j));
        }
        c3059ii.mo21898jd();
    }
}
