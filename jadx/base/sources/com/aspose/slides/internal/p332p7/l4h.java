package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class l4h extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f26133kk = new C7017h4("array");

    /* JADX INFO: renamed from: k4 */
    private boolean f26134k4;

    /* JADX INFO: renamed from: x1 */
    private String f26135x1;

    public l4h() {
        m35911x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m35911x1() {
        this.f26134k4 = false;
    }

    public l4h(AbstractC13912i5 abstractC13912i5) {
        m35911x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.l4h.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (l4h.f26133kk.m27428k4(str) != 0) {
                    return false;
                }
                l4h.this.f26134k4 = C13850af.m65068c5(str2);
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        abstractC13912i5.mo65026h4();
        this.f26135x1 = abstractC13912i5.mo65042rv();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f26134k4;
        if (z) {
            c3059ii.m12955x1("array", z ? "1" : "0");
        }
        c3059ii.mo21918x1(this.f26135x1);
        c3059ii.mo21898jd();
    }
}
