package com.aspose.slides.internal.p430tx;

import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.p559ms.System.Xml.C13851ai;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.m2 */
/* JADX INFO: loaded from: classes4.dex */
public class C11202m2 extends AbstractC11200ks {

    /* JADX INFO: renamed from: kk */
    private static AbstractC11197k4 f38602kk = new C11178ck();

    /* JADX INFO: renamed from: k4 */
    private int f38603k4 = -1;

    /* JADX INFO: renamed from: x1 */
    private boolean f38604x1;

    /* JADX INFO: renamed from: k4 */
    public static AbstractC11197k4 m53854k4() {
        return f38602kk;
    }

    @Override // com.aspose.slides.internal.p430tx.AbstractC11200ks
    /* JADX INFO: renamed from: kk */
    public boolean mo53670kk(C11212rv c11212rv) {
        String strM53753yj = c11212rv.m53964to().m53753yj();
        String strM53752x6 = c11212rv.m53964to().m53752x6();
        if (C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15088d4)) {
            this.f38603k4 = c11212rv.m53987yj(strM53752x6);
            return true;
        }
        if (!C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15073ar)) {
            return false;
        }
        this.f38604x1 = c11212rv.m53916dy(strM53752x6);
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    public void m53855x1(C11212rv c11212rv) {
        m53853to(c11212rv);
        m53852k4(c11212rv, this.f38603k4 != -1, "select");
        m53850du(c11212rv);
    }

    @Override // com.aspose.slides.internal.p430tx.AbstractC11197k4
    /* JADX INFO: renamed from: k4 */
    public void mo53668k4(C11234xw c11234xw, C11231x1 c11231x1) {
        int iM54107kk = c11231x1.m54107kk();
        if (iM54107kk != 0) {
            if (iM54107kk != 2) {
                C6005k4.m24259k4("Invalid ValueOfAction execution state");
                return;
            } else {
                c11234xw.m54197kk(c11231x1.m54113x1());
                c11231x1.m54091jd();
                return;
            }
        }
        String strM54178k4 = c11234xw.m54178k4(c11231x1, this.f38603k4);
        if (c11234xw.m54192k4(strM54178k4, this.f38604x1)) {
            c11231x1.m54091jd();
        } else {
            c11231x1.m54105k4(strM54178k4);
            c11231x1.m54094k4(2);
        }
    }
}
