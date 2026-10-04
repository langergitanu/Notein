package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.t1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8828t1 extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f30527x1 = new C7017h4("val");

    /* JADX INFO: renamed from: k4 */
    private boolean f30528k4;

    public C8828t1() {
        this.f30528k4 = true;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("val", this.f30528k4 ? "1" : "0");
        c3059ii.mo21898jd();
    }

    public C8828t1(AbstractC13912i5 abstractC13912i5) {
        this();
        String strMo65050up = abstractC13912i5.mo65050up();
        while (abstractC13912i5.mo65047to()) {
            if (!"xmlns".equals(abstractC13912i5.mo65060yj())) {
                if (f30527x1.m27428k4(C14113y2.m67363du(abstractC13912i5.mo13292k4(abstractC13912i5.mo65060yj()), strMo65050up) ? abstractC13912i5.mo65023fa() : abstractC13912i5.mo65019ck()) != 0) {
                    throw new Exception(C14113y2.m67408k4("Unknown attribute \"", abstractC13912i5.mo65019ck(), "\""));
                }
                this.f30528k4 = C13850af.m65068c5(abstractC13912i5.mo65042rv());
            }
        }
        abstractC13912i5.mo65020du();
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m41466k4(boolean z) {
        this.f30528k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m41467k4() {
        return this.f30528k4;
    }
}
