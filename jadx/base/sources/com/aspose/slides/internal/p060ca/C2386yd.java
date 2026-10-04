package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.yd */
/* JADX INFO: loaded from: classes3.dex */
public class C2386yd extends AbstractC2047di {

    /* JADX INFO: renamed from: dy */
    private int f8257dy;

    public C2386yd(int i) {
        this.f8257dy = i;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2047di
    /* JADX INFO: renamed from: k4 */
    public C2412zn mo10365k4(C2317u4 c2317u4) {
        return new C2008b3(c2317u4, this.f8257dy);
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2047di
    /* JADX INFO: renamed from: k4 */
    public void mo10367k4(C2412zn c2412zn) {
        C2008b3 c2008b3 = (C2008b3) c2412zn;
        int iM10233k4 = c2008b3.m10233k4();
        if (iM10233k4 != 0) {
            if (iM10233k4 == 1) {
                this.f7073to.m11121k4(c2008b3.m10234kk());
                return;
            } else {
                if (iM10233k4 != 2) {
                    return;
                }
                this.f7073to.m11121k4(c2008b3.m10235to());
                return;
            }
        }
        String strM10232du = c2008b3.m10232du();
        if (strM10232du == null) {
            m10368k4(strM10232du);
            return;
        }
        m10364k4().mo10395k4(strM10232du);
        if (("hintmask".equals(strM10232du) || "cntrmask".equals(strM10232du)) && this.f7073to.m11120k4() > 0) {
            long jM27438h4 = C7019kk.m27438h4(Double.valueOf(mo10370tq().m11123to()), 14);
            if (jM27438h4 != 0) {
                for (int i = 0; i < jM27438h4; i++) {
                    c2008b3.m11830h4();
                    this.f7073to.m11121k4(c2008b3.m10236x1());
                }
            }
            m10364k4().mo10395k4("pickupyourfreakingmask");
        }
    }
}
