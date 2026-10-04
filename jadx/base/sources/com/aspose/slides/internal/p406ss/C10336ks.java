package com.aspose.slides.internal.p406ss;

import com.aspose.slides.internal.p057c6.C1983k4;
import com.aspose.slides.internal.p057c6.InterfaceC1981h4;
import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p057c6.InterfaceC1986to;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p150gi.C4273fa;
import com.aspose.slides.internal.p475wh.C12007ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.ss.ks */
/* JADX INFO: loaded from: classes4.dex */
public class C10336ks extends AbstractC10327ck {

    /* JADX INFO: renamed from: c5 */
    private InterfaceC1984kk f36802c5;

    /* JADX INFO: renamed from: dy */
    private InterfaceC1986to f36803dy;

    /* JADX INFO: renamed from: m9 */
    private C4273fa f36804m9;

    public C10336ks(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 58;
    }

    @Override // com.aspose.slides.internal.p406ss.AbstractC10327ck
    /* JADX INFO: renamed from: k4 */
    public C12007ix mo50341k4(C1983k4 c1983k4) {
        int iMo9886x1;
        InterfaceC1984kk interfaceC1984kk;
        InterfaceC1981h4 interfaceC1981h4M50336du = m50336du(5);
        InterfaceC1981h4 interfaceC1981h4M50340h4 = m50340h4(5);
        int iM8127x1 = m50346wp().m8127x1();
        if (iM8127x1 == 121) {
            iMo9886x1 = this.f36804m9.f11655to.mo9886x1(interfaceC1981h4M50336du);
            interfaceC1984kk = this.f36804m9.f11653kk;
        } else if (iM8127x1 == 140 || iM8127x1 == 205) {
            iMo9886x1 = this.f36804m9.f11652k4.mo9886x1(interfaceC1981h4M50336du);
            interfaceC1984kk = this.f36804m9.f11656x1;
        } else {
            iMo9886x1 = this.f36804m9.f11653kk.mo9886x1(interfaceC1981h4M50336du);
            interfaceC1984kk = this.f36804m9.f11655to;
        }
        int iMo9886x12 = interfaceC1984kk.mo9886x1(interfaceC1981h4M50336du);
        return new C12007ix(iMo9886x1, this.f36804m9.f11649du.m17133to(interfaceC1981h4M50340h4).mo9877dy().mo9886x1(interfaceC1981h4M50340h4), (c1983k4.f6947k4 - iMo9886x1) - iMo9886x12, (c1983k4.f6948x1 - r3) - this.f36804m9.f11651h4.m17133to(interfaceC1981h4M50340h4).mo9877dy().mo9886x1(interfaceC1981h4M50340h4));
    }

    /* JADX INFO: renamed from: kp */
    public final int m50368kp() {
        return this.f36802c5.mo9884to();
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "region-body";
    }

    /* JADX INFO: renamed from: ss */
    public final int m50369ss() {
        return this.f36803dy.mo9884to();
    }

    @Override // com.aspose.slides.internal.p406ss.AbstractC10327ck
    /* JADX INFO: renamed from: ts */
    public String mo50345ts() {
        return "xsl-region-body";
    }

    @Override // com.aspose.slides.internal.p406ss.AbstractC10327ck, com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        super.mo14090k4(abstractC3533um);
        this.f36804m9 = abstractC3533um.m14399m9();
        this.f36803dy = abstractC3533um.m14385du(74).mo9878h4();
        this.f36802c5 = abstractC3533um.m14385du(75).mo9877dy();
        if (m50369ss() <= 1 || m50343qm() != 126) {
            return;
        }
        m14118up().mo14360x1(this, m14105ks(), m14106m_());
    }
}
