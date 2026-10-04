package com.aspose.slides.internal.p430tx;

import com.aspose.slides.internal.p243l6.C6005k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.ck */
/* JADX INFO: loaded from: classes4.dex */
public class C11178ck extends AbstractC11197k4 {
    @Override // com.aspose.slides.internal.p430tx.AbstractC11197k4
    /* JADX INFO: renamed from: k4 */
    public void mo53668k4(C11234xw c11234xw, C11231x1 c11231x1) {
        int iM54107kk = c11231x1.m54107kk();
        if (iM54107kk != 0) {
            if (iM54107kk != 2) {
                C6005k4.m24259k4("Invalid BuiltInRuleTextAction execution state");
                return;
            } else {
                c11234xw.m54197kk(c11231x1.m54113x1());
                c11231x1.m54091jd();
                return;
            }
        }
        String strM54177k4 = c11234xw.m54177k4(c11231x1.m54090h4().mo21834kk());
        if (c11234xw.m54192k4(strM54177k4, false)) {
            c11231x1.m54091jd();
        } else {
            c11231x1.m54105k4(strM54177k4);
            c11231x1.m54094k4(2);
        }
    }
}
