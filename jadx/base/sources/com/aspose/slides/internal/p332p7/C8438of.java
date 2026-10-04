package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.of */
/* JADX INFO: loaded from: classes4.dex */
public class C8438of extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f27919x1 = new C7017h4("rad");

    /* JADX INFO: renamed from: k4 */
    private double f27920k4;

    public C8438of() {
        m38233kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m38233kk() {
        this.f27920k4 = Double.NaN;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m38235k4() {
        return this.f27920k4;
    }

    public C8438of(AbstractC13912i5 abstractC13912i5) {
        m38233kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.of.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8438of.f27919x1.m27428k4(str) != 0) {
                    return false;
                }
                C8438of.this.f27920k4 = C13850af.m65132uz(str2) / 12700.0d;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38236k4(double d) {
        this.f27920k4 = d;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("rad", C22238OooO0oO.OooO00o(this.f27920k4, 12700.0d, 14));
        c3059ii.mo21898jd();
    }
}
