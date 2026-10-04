package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.xk */
/* JADX INFO: loaded from: classes3.dex */
public class C2370xk extends AbstractC2047di {
    @Override // com.aspose.slides.internal.p060ca.AbstractC2047di
    /* JADX INFO: renamed from: k4 */
    public C2412zn mo10365k4(C2317u4 c2317u4) {
        return new C2028c6(c2317u4);
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2047di
    /* JADX INFO: renamed from: k4 */
    public void mo10367k4(C2412zn c2412zn) {
        C2193mc c2193mc;
        double dM10311x1;
        C2028c6 c2028c6 = (C2028c6) c2412zn;
        InterfaceC2087fj interfaceC2087fj = (InterfaceC2087fj) C7019kk.m27452k4((Object) m10364k4(), InterfaceC2087fj.class);
        if (interfaceC2087fj != null) {
            interfaceC2087fj.mo10396k4(false);
        }
        int iM10308k4 = c2028c6.m10308k4();
        if (iM10308k4 != 0) {
            if (iM10308k4 == 1) {
                c2193mc = this.f7073to;
                dM10311x1 = c2028c6.m10311x1();
            } else if (iM10308k4 == 2) {
                c2193mc = this.f7073to;
                dM10311x1 = c2028c6.m10309kk();
            }
            c2193mc.m11121k4(dM10311x1);
        } else {
            String strM10310to = c2028c6.m10310to();
            if (strM10310to == null) {
                m10368k4(strM10310to);
            } else {
                m10364k4().mo10395k4(strM10310to);
            }
        }
        int iM11831m9 = c2028c6.m11831m9();
        if (interfaceC2087fj == null || interfaceC2087fj.mo10405ts()) {
            return;
        }
        for (int iM11831m92 = c2028c6.m11831m9(); iM11831m92 < iM11831m9; iM11831m92++) {
            interfaceC2087fj.mo10383c6().writeByte(c2028c6.m11829dy().m11473k4(iM11831m92));
        }
    }
}
