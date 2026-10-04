package com.aspose.slides.internal.p430tx;

import com.aspose.slides.p559ms.System.Xml.C13851ai;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.yd */
/* JADX INFO: loaded from: classes4.dex */
public class C11237yd extends C11232x6 {

    /* JADX INFO: renamed from: k4 */
    private int f38789k4 = -1;

    /* JADX INFO: renamed from: to */
    private C11232x6 f38790to;

    @Override // com.aspose.slides.internal.p430tx.C11232x6, com.aspose.slides.internal.p430tx.AbstractC11197k4
    /* JADX INFO: renamed from: k4 */
    public void mo53668k4(C11234xw c11234xw, C11231x1 c11231x1) {
        int iM54107kk = c11231x1.m54107kk();
        if (iM54107kk == 0) {
            if (this.f38790to != null) {
                c11234xw.m54168h4();
                c11234xw.m54181k4(this.f38790to, c11231x1.m54090h4());
                c11231x1.m54094k4(2);
                return;
            }
            c11231x1.m54115x1(c11234xw.m54173k4(c11231x1.m54090h4(), this.f38789k4));
            if (this.f38790to != null) {
                c11231x1.m54103k4(c11234xw, c11234xw.m54201to());
            }
            c11231x1.m54094k4(3);
            if (!c11231x1.m54109kk(c11234xw)) {
                c11231x1.m54091jd();
                return;
            }
            c11231x1.m54094k4(4);
            c11234xw.m54185k4(c11231x1, c11231x1.m54110m9());
            c11231x1.m54094k4(5);
            return;
        }
        if (iM54107kk == 2) {
            c11231x1.m54115x1(c11234xw.m54173k4(c11231x1.m54090h4(), this.f38789k4));
            if (this.f38790to != null) {
                c11231x1.m54103k4(c11234xw, c11234xw.m54201to());
            }
            c11231x1.m54094k4(3);
            if (!c11231x1.m54109kk(c11234xw)) {
                c11231x1.m54091jd();
                return;
            }
            c11231x1.m54094k4(4);
            c11234xw.m54185k4(c11231x1, c11231x1.m54110m9());
            c11231x1.m54094k4(5);
            return;
        }
        if (iM54107kk == 3) {
            if (!c11231x1.m54109kk(c11234xw)) {
                c11231x1.m54091jd();
                return;
            }
            c11231x1.m54094k4(4);
            c11234xw.m54185k4(c11231x1, c11231x1.m54110m9());
            c11231x1.m54094k4(5);
            return;
        }
        if (iM54107kk == 4) {
            c11234xw.m54185k4(c11231x1, c11231x1.m54110m9());
            c11231x1.m54094k4(5);
        } else {
            if (iM54107kk != 5) {
                return;
            }
            c11231x1.m54094k4(3);
            if (!c11231x1.m54109kk(c11234xw)) {
                c11231x1.m54091jd();
                return;
            }
            c11231x1.m54094k4(4);
            c11234xw.m54185k4(c11231x1, c11231x1.m54110m9());
            c11231x1.m54094k4(5);
        }
    }

    @Override // com.aspose.slides.internal.p430tx.AbstractC11200ks
    /* JADX INFO: renamed from: kk */
    public boolean mo53670kk(C11212rv c11212rv) {
        String strM53753yj = c11212rv.m53964to().m53753yj();
        String strM53752x6 = c11212rv.m53964to().m53752x6();
        if (!C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15088d4)) {
            return false;
        }
        this.f38789k4 = c11212rv.m53987yj(strM53752x6);
        return true;
    }

    @Override // com.aspose.slides.internal.p430tx.C11232x6
    /* JADX INFO: renamed from: x1 */
    public void mo53671x1(C11212rv c11212rv) {
        m53853to(c11212rv);
        m53852k4(c11212rv, this.f38789k4 != -1, "select");
        c11212rv.m53981x1(false);
        if (c11212rv.m53924h4()) {
            m54214yj(c11212rv);
            m54128fa(c11212rv);
            c11212rv.m53954m9();
        }
    }

    /* JADX INFO: renamed from: yj */
    public final void m54214yj(C11212rv c11212rv) {
        C11186g8 c11186g8M53964to = c11212rv.m53964to();
        do {
            int iM53734fa = c11186g8M53964to.m53734fa();
            if (iM53734fa != 1) {
                if (iM53734fa == 4) {
                    return;
                }
                if (iM53734fa == 5) {
                    m54135k4(c11212rv.m53985xw());
                }
            } else {
                if (!C13851ai.m65152k4(c11186g8M53964to.m53741ks(), c11186g8M53964to.m53740kk().f15174xi) || !C13851ai.m65152k4(c11186g8M53964to.m53753yj(), c11186g8M53964to.m53740kk().f15163vt)) {
                    return;
                }
                if (this.f38790to == null) {
                    this.f38790to = new C11232x6();
                }
                this.f38790to.m54134k4(c11212rv.m53962sv());
            }
        } while (c11186g8M53964to.m53735h4());
    }
}
