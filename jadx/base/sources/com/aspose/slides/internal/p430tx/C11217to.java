package com.aspose.slides.internal.p430tx;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;
import com.aspose.slides.p559ms.System.Xml.C13851ai;
import com.aspose.slides.p559ms.System.Xml.C13890ei;
import com.huawei.hms.network.embedded.C18358t1;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.to */
/* JADX INFO: loaded from: classes4.dex */
public class C11217to extends C11232x6 {

    /* JADX INFO: renamed from: du */
    private static C11217to f38701du = new C11217to();

    /* JADX INFO: renamed from: k4 */
    private int f38702k4 = -1;

    /* JADX INFO: renamed from: to */
    private C13890ei f38703to;

    public C11217to() {
    }

    /* JADX INFO: renamed from: k4 */
    public static C11217to m54017k4() {
        return f38701du;
    }

    /* JADX INFO: renamed from: yj */
    private void m54019yj(C11212rv c11212rv) {
        C11193j2 c11193j2M53962sv;
        C11186g8 c11186g8M53964to = c11212rv.m53964to();
        if (c11212rv.m53924h4()) {
            do {
                int iM53734fa = c11186g8M53964to.m53734fa();
                if (iM53734fa == 1) {
                    c11212rv.m53983x6();
                    String strM53741ks = c11186g8M53964to.m53741ks();
                    String strM53753yj = c11186g8M53964to.m53753yj();
                    if (!C13851ai.m65152k4(strM53741ks, c11186g8M53964to.m53740kk().f15174xi)) {
                        throw c11212rv.m53973vj();
                    }
                    if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15163vt)) {
                        c11193j2M53962sv = c11212rv.m53962sv();
                    } else {
                        if (!C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15096e8)) {
                            throw c11212rv.m53973vj();
                        }
                        C11206nv c11206nvM53918f9 = c11212rv.m53918f9();
                        m54141x1(c11206nvM53918f9.m53816kk());
                        c11193j2M53962sv = c11206nvM53918f9;
                    }
                    m54134k4(c11193j2M53962sv);
                    c11212rv.m53955ne();
                } else if (iM53734fa != 5 && iM53734fa != 6 && iM53734fa != 7 && iM53734fa != 8) {
                    throw XsltException.create("The contents of '{0}' are invalid.", "apply-templates");
                }
            } while (c11212rv.m53913du());
            c11212rv.m53954m9();
        }
    }

    @Override // com.aspose.slides.internal.p430tx.AbstractC11200ks
    /* JADX INFO: renamed from: kk */
    public boolean mo53670kk(C11212rv c11212rv) {
        String strM53753yj = c11212rv.m53964to().m53753yj();
        String strM53752x6 = c11212rv.m53964to().m53752x6();
        if (C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15088d4)) {
            this.f38702k4 = c11212rv.m53987yj(strM53752x6);
            return true;
        }
        if (!C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15085ca)) {
            return false;
        }
        this.f38703to = (c11212rv.f38652to && C18358t1.g.f56183c.equals(strM53752x6)) ? C11212rv.f38637du : c11212rv.m53927jd(strM53752x6);
        return true;
    }

    @Override // com.aspose.slides.internal.p430tx.C11232x6
    /* JADX INFO: renamed from: x1 */
    public void mo53671x1(C11212rv c11212rv) {
        m53853to(c11212rv);
        m54019yj(c11212rv);
    }

    private C11217to(C13890ei c13890ei) {
        this.f38703to = c13890ei;
    }

    /* JADX INFO: renamed from: k4 */
    public static C11217to m54018k4(C13890ei c13890ei) {
        return (c13890ei == null || c13890ei.m65287kk()) ? m54017k4() : new C11217to(c13890ei);
    }

    @Override // com.aspose.slides.internal.p430tx.C11232x6, com.aspose.slides.internal.p430tx.AbstractC11197k4
    /* JADX INFO: renamed from: k4 */
    public void mo53668k4(C11234xw c11234xw, C11231x1 c11231x1) {
        AbstractC10929m9 abstractC10929m9M54173k4;
        AbstractC10929m9 abstractC10929m9M54173k42;
        int iM54107kk = c11231x1.m54107kk();
        if (iM54107kk == 0) {
            c11234xw.m54200rv();
            c11234xw.m54168h4();
            ArrayList arrayList = this.f38758x1;
            if (arrayList != null && arrayList.size() > 0) {
                c11234xw.m54184k4(c11231x1);
                c11231x1.m54094k4(2);
                return;
            }
            if (this.f38702k4 != -1) {
                abstractC10929m9M54173k4 = c11234xw.m54173k4(c11231x1.m54090h4(), this.f38702k4);
            } else {
                if (!c11231x1.m54088du().mo21871u4()) {
                    c11231x1.m54091jd();
                    return;
                }
                abstractC10929m9M54173k4 = c11231x1.m54088du().mo21845h4(9);
            }
            c11231x1.m54115x1(abstractC10929m9M54173k4);
            if (c11234xw.m54201to().size() != 0) {
                c11231x1.m54103k4(c11234xw, c11234xw.m54201to());
            }
            c11231x1.m54094k4(3);
            if (!c11231x1.m54109kk(c11234xw)) {
                c11231x1.m54091jd();
                return;
            }
            c11231x1.m54094k4(4);
            c11234xw.m54180k4(c11231x1.m54110m9(), this.f38703to, null);
            c11231x1.m54094k4(5);
            return;
        }
        if (iM54107kk == 2) {
            if (this.f38702k4 != -1) {
                abstractC10929m9M54173k42 = c11234xw.m54173k4(c11231x1.m54090h4(), this.f38702k4);
            } else {
                if (!c11231x1.m54088du().mo21871u4()) {
                    c11231x1.m54091jd();
                    return;
                }
                abstractC10929m9M54173k42 = c11231x1.m54088du().mo21845h4(9);
            }
            c11231x1.m54115x1(abstractC10929m9M54173k42);
            if (c11234xw.m54201to().size() != 0) {
                c11231x1.m54103k4(c11234xw, c11234xw.m54201to());
            }
            c11231x1.m54094k4(3);
            if (!c11231x1.m54109kk(c11234xw)) {
                c11231x1.m54091jd();
                return;
            }
            c11231x1.m54094k4(4);
            c11234xw.m54180k4(c11231x1.m54110m9(), this.f38703to, null);
            c11231x1.m54094k4(5);
            return;
        }
        if (iM54107kk == 3) {
            if (!c11231x1.m54109kk(c11234xw)) {
                c11231x1.m54091jd();
                return;
            }
            c11231x1.m54094k4(4);
            c11234xw.m54180k4(c11231x1.m54110m9(), this.f38703to, null);
            c11231x1.m54094k4(5);
            return;
        }
        if (iM54107kk == 4) {
            c11234xw.m54180k4(c11231x1.m54110m9(), this.f38703to, null);
            c11231x1.m54094k4(5);
        } else {
            if (iM54107kk != 5) {
                C6005k4.m24259k4("Invalid ApplyTemplatesAction execution state");
                return;
            }
            c11231x1.m54094k4(3);
            if (!c11231x1.m54109kk(c11234xw)) {
                c11231x1.m54091jd();
                return;
            }
            c11231x1.m54094k4(4);
            c11234xw.m54180k4(c11231x1.m54110m9(), this.f38703to, null);
            c11231x1.m54094k4(5);
        }
    }
}
