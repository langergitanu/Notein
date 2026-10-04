package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.od */
/* JADX INFO: loaded from: classes4.dex */
public class C8428od extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f27877to = new C7017h4("dx", "dy", "dz");

    /* JADX INFO: renamed from: k4 */
    private double f27878k4;

    /* JADX INFO: renamed from: kk */
    private double f27879kk;

    /* JADX INFO: renamed from: x1 */
    private double f27880x1;

    public C8428od() {
        m38185du();
    }

    /* JADX INFO: renamed from: du */
    private void m38185du() {
        this.f27878k4 = Double.NaN;
        this.f27880x1 = Double.NaN;
        this.f27879kk = Double.NaN;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m38190k4() {
        return this.f27878k4;
    }

    /* JADX INFO: renamed from: kk */
    public final double m38192kk() {
        return this.f27879kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final double m38194x1() {
        return this.f27880x1;
    }

    public C8428od(AbstractC13912i5 abstractC13912i5) {
        m38185du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.od.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8428od.f27877to.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8428od.this.f27878k4 = C13850af.m65132uz(str2) / 12700.0d;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C8428od.this.f27880x1 = C13850af.m65132uz(str2) / 12700.0d;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                C8428od.this.f27879kk = C13850af.m65132uz(str2) / 12700.0d;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38191k4(double d) {
        this.f27878k4 = d;
    }

    /* JADX INFO: renamed from: kk */
    public final void m38193kk(double d) {
        this.f27879kk = d;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m38195x1(double d) {
        this.f27880x1 = d;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("dx", C22238OooO0oO.OooO00o(this.f27878k4, 12700.0d, 14));
        c3059ii.m12955x1("dy", C22238OooO0oO.OooO00o(this.f27880x1, 12700.0d, 14));
        c3059ii.m12955x1("dz", C22238OooO0oO.OooO00o(this.f27879kk, 12700.0d, 14));
        c3059ii.mo21898jd();
    }
}
