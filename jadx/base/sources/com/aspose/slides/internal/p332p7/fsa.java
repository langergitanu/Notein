package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class fsa extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f23021kk = new C7017h4("w_CustomMarkFollows", "w_Id");

    /* JADX INFO: renamed from: k4 */
    private int f23022k4;

    /* JADX INFO: renamed from: x1 */
    private int f23023x1;

    public fsa() {
        m32052x1();
    }

    public fsa(AbstractC13912i5 abstractC13912i5) {
        m32052x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.fsa.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = fsa.f23021kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    fsa.this.f23022k4 = vn6.m43185k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                fsa.this.f23023x1 = C13850af.m65151yj(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m32052x1() {
        this.f23022k4 = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f23022k4;
        if (i != 0) {
            c3059ii.m12955x1("w:customMarkFollows", vn6.m43186k4(i));
        }
        c3059ii.m12955x1("w:id", C13850af.m65103k4(this.f23023x1));
        c3059ii.mo21898jd();
    }
}
