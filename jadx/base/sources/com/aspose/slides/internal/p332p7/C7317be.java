package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.be */
/* JADX INFO: loaded from: classes4.dex */
public class C7317be extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f20535x1 = new C7017h4("z");

    /* JADX INFO: renamed from: k4 */
    private double f20536k4;

    public C7317be() {
        m28863kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m28863kk() {
        this.f20536k4 = 0.0d;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m28865k4() {
        return this.f20536k4;
    }

    public C7317be(AbstractC13912i5 abstractC13912i5) {
        m28863kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.be.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7317be.f20535x1.m27428k4(str) != 0) {
                    return false;
                }
                C7317be.this.f20536k4 = C13850af.m65132uz(str2) / 12700.0d;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m28866k4(double d) {
        this.f20536k4 = d;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        double d = this.f20536k4;
        if (d != 0.0d) {
            c3059ii.m12955x1("z", C22238OooO0oO.OooO00o(d, 12700.0d, 14));
        }
        c3059ii.mo21898jd();
    }
}
