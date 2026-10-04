package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14081nv;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class rr4 extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f29464to = new C7017h4("readOnlyRecommended", "userName", "reservationPassword");

    /* JADX INFO: renamed from: k4 */
    private boolean f29465k4;

    /* JADX INFO: renamed from: kk */
    private int f29466kk;

    /* JADX INFO: renamed from: x1 */
    private String f29467x1;

    public rr4() {
        m40192x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m40192x1() {
        this.f29465k4 = false;
        this.f29466kk = 65535;
    }

    public rr4(AbstractC13912i5 abstractC13912i5) {
        m40192x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.rr4.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = rr4.f29464to.m27428k4(str);
                if (iM27428k4 == 0) {
                    rr4.this.f29465k4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    rr4.this.f29467x1 = str2;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                rr4.this.f29466kk = C14081nv.m67064k4(str2, 515);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f29465k4;
        if (z) {
            c3059ii.m12955x1("readOnlyRecommended", z ? "1" : "0");
        }
        String str3 = this.f29467x1;
        if (str3 != null) {
            c3059ii.m12955x1("userName", str3);
        }
        int i = this.f29466kk;
        if ((i & 65535) != 65535) {
            c3059ii.m12955x1("reservationPassword", C14057f9.m66587k4(i & 65535, "X4"));
        }
        c3059ii.mo21898jd();
    }
}
