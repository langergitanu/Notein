package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.c3 */
/* JADX INFO: loaded from: classes4.dex */
public class C7374c3 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f20894kk = new C7017h4("w", "extLst");

    /* JADX INFO: renamed from: k4 */
    private double f20895k4;

    /* JADX INFO: renamed from: x1 */
    private C8397nz f20896x1;

    public C7374c3() {
        m29402to();
    }

    /* JADX INFO: renamed from: to */
    private void m29402to() {
        this.f20895k4 = Double.NaN;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m29403k4() {
        return this.f20895k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC7414ck m29406x1() {
        return this.f20896x1;
    }

    public C7374c3(final AbstractC13912i5 abstractC13912i5) {
        m29402to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.c3.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7374c3.f20894kk.m27428k4(str) != 0) {
                    return false;
                }
                C7374c3.this.f20895k4 = C13850af.m65132uz(str2) / 12700.0d;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.c3.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C7374c3.f20894kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                C7374c3.this.f20896x1 = new C8397nz(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29404k4(double d) {
        this.f20895k4 = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29405k4(AbstractC7414ck abstractC7414ck) {
        this.f20896x1 = (C8397nz) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("w", C22238OooO0oO.OooO00o(this.f20895k4, 12700.0d, 14));
        C8397nz c8397nz = this.f20896x1;
        if (c8397nz != null) {
            c8397nz.mo6846k4("a", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
