package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class q7e extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f28779x1 = new C7017h4("option");

    /* JADX INFO: renamed from: k4 */
    private int f28780k4;

    public q7e() {
        m39376kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m39376kk() {
        this.f28780k4 = 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m39378k4() {
        return this.f28780k4;
    }

    public q7e(AbstractC13912i5 abstractC13912i5) {
        m39376kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.q7e.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (q7e.f28779x1.m27428k4(str) != 0) {
                    return false;
                }
                q7e.this.f28780k4 = C7737g9.m32354k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39379k4(int i) {
        this.f28780k4 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("option", C7737g9.m32355k4(this.f28780k4));
        c3059ii.mo21898jd();
    }
}
