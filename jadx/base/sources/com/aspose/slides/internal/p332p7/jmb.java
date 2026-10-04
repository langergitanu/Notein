package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class jmb extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f25247du = new C7017h4("top", "percent", "val", "filterVal");

    /* JADX INFO: renamed from: k4 */
    private boolean f25248k4;

    /* JADX INFO: renamed from: kk */
    private double f25249kk;

    /* JADX INFO: renamed from: to */
    private double f25250to;

    /* JADX INFO: renamed from: x1 */
    private boolean f25251x1;

    public jmb() {
        m34829x1();
    }

    public jmb(AbstractC13912i5 abstractC13912i5) {
        m34829x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.jmb.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = jmb.f25247du.m27428k4(str);
                if (iM27428k4 == 0) {
                    jmb.this.f25248k4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    jmb.this.f25251x1 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    jmb.this.f25249kk = AbstractC7361bz.m29300yj(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                jmb.this.f25250to = AbstractC7361bz.m29300yj(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m34829x1() {
        this.f25248k4 = true;
        this.f25251x1 = false;
        this.f25249kk = Double.NaN;
        this.f25250to = Double.NaN;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f25248k4;
        if (!z) {
            c3059ii.m12955x1("top", z ? "1" : "0");
        }
        boolean z2 = this.f25251x1;
        if (z2) {
            c3059ii.m12955x1("percent", z2 ? "1" : "0");
        }
        c3059ii.m12955x1("val", C13850af.m65101k4(this.f25249kk));
        if (!C14044b3.m66437kk(this.f25250to)) {
            c3059ii.m12955x1("filterVal", C13850af.m65101k4(this.f25250to));
        }
        c3059ii.mo21898jd();
    }
}
