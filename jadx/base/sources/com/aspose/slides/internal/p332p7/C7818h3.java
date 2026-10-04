package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.h3 */
/* JADX INFO: loaded from: classes4.dex */
public class C7818h3 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f23848kk = new C7017h4("useDef", "dataModel");

    /* JADX INFO: renamed from: k4 */
    private boolean f23849k4;

    /* JADX INFO: renamed from: x1 */
    private C7406ch f23850x1;

    public C7818h3() {
        m33056x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m33056x1() {
        this.f23849k4 = false;
    }

    public C7818h3(final AbstractC13912i5 abstractC13912i5) {
        m33056x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.h3.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7818h3.f23848kk.m27428k4(str) != 0) {
                    return false;
                }
                C7818h3.this.f23849k4 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.h3.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C7818h3.f23848kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                C7818h3.this.f23850x1 = new C7406ch(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f23849k4;
        if (z) {
            c3059ii.m12955x1("useDef", z ? "1" : "0");
        }
        C7406ch c7406ch = this.f23850x1;
        if (c7406ch != null) {
            c7406ch.mo6846k4("dgm", c3059ii, "dataModel");
        }
        c3059ii.mo21898jd();
    }
}
