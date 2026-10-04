package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.cg */
/* JADX INFO: loaded from: classes4.dex */
public final class C7405cg extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f21062x1 = new C7017h4("val");

    /* JADX INFO: renamed from: k4 */
    private double f21063k4;

    public C7405cg() {
        this.f21063k4 = Double.NaN;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m29595k4() {
        return this.f21063k4;
    }

    public C7405cg(AbstractC13912i5 abstractC13912i5) {
        this();
        while (abstractC13912i5.mo65047to()) {
            if (!"xmlns".equals(abstractC13912i5.mo65060yj()) && f21062x1.m27428k4(AbstractC7361bz.m29293kk(abstractC13912i5)) == 0) {
                this.f21063k4 = AbstractC7361bz.m29300yj(abstractC13912i5.mo65042rv());
            }
        }
        abstractC13912i5.mo65020du();
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29596k4(double d) {
        this.f21063k4 = d;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("val", C13850af.m65101k4(this.f21063k4));
        c3059ii.mo21898jd();
    }
}
