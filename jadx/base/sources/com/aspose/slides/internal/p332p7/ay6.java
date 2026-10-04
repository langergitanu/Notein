package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class ay6 extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f20319m9 = new C7017h4("r", ContextChain.TAG_INFRA, "s", "l", "t", "a");

    /* JADX INFO: renamed from: du */
    private boolean f20320du;

    /* JADX INFO: renamed from: h4 */
    private boolean f20321h4;

    /* JADX INFO: renamed from: k4 */
    private String f20322k4;

    /* JADX INFO: renamed from: kk */
    private boolean f20323kk;

    /* JADX INFO: renamed from: to */
    private boolean f20324to;

    /* JADX INFO: renamed from: x1 */
    private int f20325x1;

    public ay6() {
        m28610x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m28610x1() {
        this.f20325x1 = 0;
        this.f20323kk = false;
        this.f20324to = false;
        this.f20320du = false;
        this.f20321h4 = false;
    }

    public ay6(AbstractC13912i5 abstractC13912i5) {
        m28610x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ay6.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = ay6.f20319m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    ay6.this.f20322k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    ay6.this.f20325x1 = C13850af.m65151yj(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    ay6.this.f20323kk = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    ay6.this.f20324to = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 4) {
                    ay6.this.f20320du = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                ay6.this.f20321h4 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("r", this.f20322k4);
        int i = this.f20325x1;
        if (i != 0) {
            c3059ii.m12955x1(ContextChain.TAG_INFRA, C13850af.m65103k4(i));
        }
        boolean z = this.f20323kk;
        if (z) {
            c3059ii.m12955x1("s", z ? "1" : "0");
        }
        boolean z2 = this.f20324to;
        if (z2) {
            c3059ii.m12955x1("l", z2 ? "1" : "0");
        }
        boolean z3 = this.f20320du;
        if (z3) {
            c3059ii.m12955x1("t", z3 ? "1" : "0");
        }
        boolean z4 = this.f20321h4;
        if (z4) {
            c3059ii.m12955x1("a", z4 ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }
}
