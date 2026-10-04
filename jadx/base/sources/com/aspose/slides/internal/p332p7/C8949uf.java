package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.uf */
/* JADX INFO: loaded from: classes4.dex */
public class C8949uf extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f31248kk = new C7017h4("viewportSz", "extLst");

    /* JADX INFO: renamed from: k4 */
    private double f31249k4;

    /* JADX INFO: renamed from: x1 */
    private C8397nz f31250x1;

    public C8949uf() {
        m42349kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m42349kk() {
        this.f31249k4 = Double.NaN;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m42351k4() {
        return this.f31249k4;
    }

    public C8949uf(final AbstractC13912i5 abstractC13912i5) {
        m42349kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.uf.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8949uf.f31248kk.m27428k4(str) != 0) {
                    return false;
                }
                C8949uf.this.f31249k4 = C13850af.m65132uz(str2) / 12700.0d;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.uf.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C8949uf.f31248kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                C8949uf.this.f31250x1 = new C8397nz(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m42352k4(double d) {
        this.f31249k4 = d;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C6005k4.m24262k4(!C14044b3.m66437kk(this.f31249k4), "Required property \"ViewportSz\" is uninitialized.");
        c3059ii.m12955x1("viewportSz", C22238OooO0oO.OooO00o(this.f31249k4, 12700.0d, 14));
        C8397nz c8397nz = this.f31250x1;
        if (c8397nz != null) {
            c8397nz.mo6846k4("am3d", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
