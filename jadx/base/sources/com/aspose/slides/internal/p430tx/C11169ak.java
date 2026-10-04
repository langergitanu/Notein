package com.aspose.slides.internal.p430tx;

import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.p559ms.System.Xml.C13851ai;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.ak */
/* JADX INFO: loaded from: classes4.dex */
public class C11169ak extends C11232x6 {

    /* JADX INFO: renamed from: k4 */
    private int f38455k4;

    /* JADX INFO: renamed from: to */
    private int f38456to = -1;

    public C11169ak(int i) {
        this.f38455k4 = i;
    }

    @Override // com.aspose.slides.internal.p430tx.C11232x6, com.aspose.slides.internal.p430tx.AbstractC11197k4
    /* JADX INFO: renamed from: k4 */
    public void mo53668k4(C11234xw c11234xw, C11231x1 c11231x1) {
        int iM54107kk = c11231x1.m54107kk();
        if (iM54107kk != 0) {
            if (iM54107kk != 1) {
                C6005k4.m24259k4("Invalid IfAction execution state");
                return;
            }
            int i = this.f38455k4;
            if (i == 1 || i == 2) {
                c11231x1.m54087ck();
            }
            c11231x1.m54091jd();
            return;
        }
        int i2 = this.f38455k4;
        if ((i2 == 0 || i2 == 1) && !c11234xw.m54164du(c11231x1, this.f38456to)) {
            c11231x1.m54091jd();
        } else {
            c11234xw.m54184k4(c11231x1);
            c11231x1.m54094k4(1);
        }
    }

    @Override // com.aspose.slides.internal.p430tx.AbstractC11200ks
    /* JADX INFO: renamed from: kk */
    public boolean mo53670kk(C11212rv c11212rv) {
        String strM53753yj = c11212rv.m53964to().m53753yj();
        String strM53752x6 = c11212rv.m53964to().m53752x6();
        if (!C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15121lm) || this.f38455k4 == 2) {
            return false;
        }
        this.f38456to = c11212rv.m53958rv(strM53752x6);
        return true;
    }

    @Override // com.aspose.slides.internal.p430tx.C11232x6
    /* JADX INFO: renamed from: x1 */
    public void mo53671x1(C11212rv c11212rv) {
        m53853to(c11212rv);
        if (this.f38455k4 != 2) {
            m53852k4(c11212rv, this.f38456to != -1, "test");
        }
        if (c11212rv.m53924h4()) {
            m54128fa(c11212rv);
            c11212rv.m53954m9();
        }
    }
}
