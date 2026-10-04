package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.miui.penengine.p596e.C18773h;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.p4 */
/* JADX INFO: loaded from: classes4.dex */
public class C8491p4 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private double f28217kk;

    /* JADX INFO: renamed from: to */
    private int f28218to;

    /* JADX INFO: renamed from: x1 */
    private double f28219x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f28216k4 = C7977j5.m34561k4("circle");

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f28215du = new C7017h4("w", C18773h.f57233c, "prst");

    public C8491p4() {
        m38607du();
    }

    /* JADX INFO: renamed from: du */
    private void m38607du() {
        this.f28219x1 = 6.0d;
        this.f28217kk = 6.0d;
        this.f28218to = f28216k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m38612k4() {
        return this.f28219x1;
    }

    /* JADX INFO: renamed from: kk */
    public final int m38615kk() {
        return this.f28218to;
    }

    /* JADX INFO: renamed from: x1 */
    public final double m38616x1() {
        return this.f28217kk;
    }

    public C8491p4(AbstractC13912i5 abstractC13912i5) {
        m38607du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.p4.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8491p4.f28215du.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8491p4.this.f28219x1 = C13850af.m65132uz(str2) / 12700.0d;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C8491p4.this.f28217kk = C13850af.m65132uz(str2) / 12700.0d;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                C8491p4.this.f28218to = C7977j5.m34561k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m38617x1(double d) {
        this.f28217kk = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38613k4(double d) {
        this.f28219x1 = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38614k4(int i) {
        this.f28218to = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        double d = this.f28219x1;
        if (d != 6.0d) {
            c3059ii.m12955x1("w", C22238OooO0oO.OooO00o(d, 12700.0d, 14));
        }
        double d2 = this.f28217kk;
        if (d2 != 6.0d) {
            c3059ii.m12955x1(C18773h.f57233c, C22238OooO0oO.OooO00o(d2, 12700.0d, 14));
        }
        int i = this.f28218to;
        if (i != f28216k4) {
            c3059ii.m12955x1("prst", C7977j5.m34562k4(i));
        }
        c3059ii.mo21898jd();
    }
}
