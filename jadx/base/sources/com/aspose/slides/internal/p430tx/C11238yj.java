package com.aspose.slides.internal.p430tx;

import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.yj */
/* JADX INFO: loaded from: classes4.dex */
public class C11238yj extends C11232x6 {
    @Override // com.aspose.slides.internal.p430tx.C11232x6, com.aspose.slides.internal.p430tx.AbstractC11197k4
    /* JADX INFO: renamed from: k4 */
    public void mo53668k4(C11234xw c11234xw, C11231x1 c11231x1) {
        int iM54107kk = c11231x1.m54107kk();
        if (iM54107kk == 0) {
            String str = C14113y2.f47374k4;
            if (c11234xw.m54188k4(8, str, str, str, false)) {
                c11234xw.m54184k4(c11231x1);
                c11231x1.m54094k4(1);
                return;
            }
            return;
        }
        if (iM54107kk != 1) {
            C6005k4.m24259k4("Invalid IfAction execution state");
        } else if (c11234xw.m54163du(8)) {
            c11231x1.m54091jd();
        }
    }

    @Override // com.aspose.slides.internal.p430tx.C11232x6
    /* JADX INFO: renamed from: x1 */
    public void mo53671x1(C11212rv c11212rv) {
        m53853to(c11212rv);
        if (c11212rv.m53924h4()) {
            m54128fa(c11212rv);
            c11212rv.m53954m9();
        }
    }
}
