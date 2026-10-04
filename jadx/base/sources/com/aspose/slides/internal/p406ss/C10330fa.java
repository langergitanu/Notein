package com.aspose.slides.internal.p406ss;

import com.aspose.slides.internal.p057c6.C1983k4;
import com.aspose.slides.internal.p057c6.InterfaceC1981h4;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p475wh.C12007ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.ss.fa */
/* JADX INFO: loaded from: classes4.dex */
public class C10330fa extends AbstractC10344up {
    public C10330fa(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 56;
    }

    @Override // com.aspose.slides.internal.p406ss.AbstractC10327ck
    /* JADX INFO: renamed from: k4 */
    public C12007ix mo50341k4(C1983k4 c1983k4) {
        C12007ix c12007ix;
        InterfaceC1981h4 interfaceC1981h4M50336du = m50336du(0);
        InterfaceC1981h4 interfaceC1981h4M50340h4 = m50340h4(0);
        new C12007ix();
        int iM8127x1 = m50346wp().m8127x1();
        if (iM8127x1 == 140 || iM8127x1 == 205) {
            c12007ix = new C12007ix(0.0f, c1983k4.f6948x1 - m50409kp().mo9886x1(interfaceC1981h4M50336du), m50409kp().mo9886x1(interfaceC1981h4M50336du), c1983k4.f6947k4);
            interfaceC1981h4M50336du = interfaceC1981h4M50340h4;
        } else {
            c12007ix = new C12007ix(0.0f, c1983k4.f6948x1 - m50409kp().mo9886x1(interfaceC1981h4M50340h4), c1983k4.f6947k4, m50409kp().mo9886x1(interfaceC1981h4M50340h4));
        }
        if (m50394ss() == 48) {
            m50393k4(c12007ix.Clone(), this.f36768h4.m50389wp(), interfaceC1981h4M50336du);
        }
        return c12007ix;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "region-after";
    }

    @Override // com.aspose.slides.internal.p406ss.AbstractC10327ck
    /* JADX INFO: renamed from: ts */
    public String mo50345ts() {
        return "xsl-region-after";
    }
}
