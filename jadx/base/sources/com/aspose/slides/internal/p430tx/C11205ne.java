package com.aspose.slides.internal.p430tx;

import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.p559ms.System.Xml.C13851ai;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.ne */
/* JADX INFO: loaded from: classes4.dex */
public class C11205ne extends C11232x6 {

    /* JADX INFO: renamed from: k4 */
    private String f38609k4;

    /* JADX INFO: renamed from: to */
    private boolean f38610to;

    @Override // com.aspose.slides.internal.p430tx.C11232x6, com.aspose.slides.internal.p430tx.AbstractC11197k4
    /* JADX INFO: renamed from: k4 */
    public void mo53668k4(C11234xw c11234xw, C11231x1 c11231x1) {
        while (c11234xw.m54211yj()) {
            int iM54107kk = c11231x1.m54107kk();
            int i = 5;
            if (iM54107kk != 0) {
                if (iM54107kk != 5) {
                    i = 7;
                    if (iM54107kk != 6) {
                        if (iM54107kk == 7) {
                            if (c11234xw.m54196kk(c11231x1.m54088du())) {
                                c11231x1.m54091jd();
                                return;
                            }
                            return;
                        } else if (iM54107kk != 8) {
                            C6005k4.m24259k4("Invalid CopyAction execution state");
                            return;
                        } else {
                            c11231x1.m54091jd();
                            return;
                        }
                    }
                    if (c11231x1.m54088du().mo21857kk() == 1 && !this.f38610to) {
                        c11234xw.m54184k4(c11231x1);
                        c11231x1.m54094k4(7);
                        return;
                    } else if (!c11234xw.m54210x1(c11231x1.m54088du())) {
                        return;
                    }
                } else {
                    c11231x1.m54094k4(6);
                    if (c11231x1.m54088du().mo21857kk() == 1) {
                        c11234xw.m54181k4(C11223uz.m54027k4(), c11231x1.m54090h4());
                        return;
                    }
                }
            } else if (C11234xw.m54159to(c11231x1.m54088du())) {
                c11234xw.m54184k4(c11231x1);
                c11231x1.m54094k4(8);
                return;
            } else if (!c11234xw.m54191k4(c11231x1.m54088du(), this.f38610to)) {
                return;
            }
            c11231x1.m54094k4(i);
        }
    }

    @Override // com.aspose.slides.internal.p430tx.AbstractC11200ks
    /* JADX INFO: renamed from: kk */
    public boolean mo53670kk(C11212rv c11212rv) {
        String strM53753yj = c11212rv.m53964to().m53753yj();
        String strM53752x6 = c11212rv.m53964to().m53752x6();
        if (!C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15132o9)) {
            return false;
        }
        this.f38609k4 = strM53752x6;
        m54134k4(c11212rv.m53922gi());
        return true;
    }

    @Override // com.aspose.slides.internal.p430tx.C11232x6
    /* JADX INFO: renamed from: x1 */
    public void mo53671x1(C11212rv c11212rv) {
        m53853to(c11212rv);
        if (c11212rv.m53924h4()) {
            m54128fa(c11212rv);
            c11212rv.m53954m9();
        }
        if (this.f38758x1 == null) {
            this.f38610to = true;
        }
    }
}
