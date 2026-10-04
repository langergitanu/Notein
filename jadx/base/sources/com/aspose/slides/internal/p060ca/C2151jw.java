package com.aspose.slides.internal.p060ca;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.jw */
/* JADX INFO: loaded from: classes3.dex */
public class C2151jw extends AbstractC2047di {
    @Override // com.aspose.slides.internal.p060ca.AbstractC2047di
    /* JADX INFO: renamed from: k4 */
    public C2412zn mo10365k4(C2317u4 c2317u4) {
        return new C2381y2(c2317u4);
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2047di
    /* JADX INFO: renamed from: k4 */
    public void mo10367k4(C2412zn c2412zn) {
        C2381y2 c2381y2 = (C2381y2) c2412zn;
        int iM11723k4 = c2381y2.m11723k4();
        if (iM11723k4 == 0) {
            String strM11725to = c2381y2.m11725to();
            if (strM11725to == null) {
                m10368k4(strM11725to);
                return;
            } else {
                m10364k4().mo10395k4(strM11725to);
                return;
            }
        }
        if (iM11723k4 == 1) {
            this.f7073to.m11121k4(c2381y2.m11726x1());
        } else {
            if (iM11723k4 != 2) {
                return;
            }
            this.f7073to.m11121k4(c2381y2.m11724kk());
        }
    }
}
