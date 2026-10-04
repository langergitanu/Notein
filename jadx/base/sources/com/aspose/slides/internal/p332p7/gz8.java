package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class gz8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f23804x1 = new C7017h4("showScrollbar");

    /* JADX INFO: renamed from: k4 */
    private boolean f23805k4;

    public gz8() {
        m33003kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m33003kk() {
        this.f23805k4 = true;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f23805k4;
        if (!z) {
            c3059ii.m12955x1("showScrollbar", z ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }

    public gz8(AbstractC13912i5 abstractC13912i5) {
        m33003kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.gz8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (gz8.f23804x1.m27428k4(str) != 0) {
                    return false;
                }
                gz8.this.f23805k4 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33005k4(boolean z) {
        this.f23805k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m33006k4() {
        return this.f23805k4;
    }
}
