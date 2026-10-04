package com.aspose.slides.internal.p430tx;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.p559ms.System.Xml.C13851ai;
import com.aspose.slides.p559ms.System.Xml.C13890ei;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.fa */
/* JADX INFO: loaded from: classes4.dex */
public class C11185fa extends C11232x6 {

    /* JADX INFO: renamed from: k4 */
    private C13890ei f38510k4;

    /* JADX INFO: renamed from: yj */
    private void m53728yj(C11212rv c11212rv) {
        C11186g8 c11186g8M53964to = c11212rv.m53964to();
        if (c11212rv.m53924h4()) {
            do {
                int iM53734fa = c11186g8M53964to.m53734fa();
                if (iM53734fa == 1) {
                    c11212rv.m53983x6();
                    String strM53741ks = c11186g8M53964to.m53741ks();
                    String strM53753yj = c11186g8M53964to.m53753yj();
                    if (!C13851ai.m65152k4(strM53741ks, c11186g8M53964to.m53740kk().f15174xi) || !C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15096e8)) {
                        throw c11212rv.m53973vj();
                    }
                    C11206nv c11206nvM53918f9 = c11212rv.m53918f9();
                    m54141x1(c11206nvM53918f9.m53816kk());
                    m54134k4(c11206nvM53918f9);
                    c11212rv.m53955ne();
                } else if (iM53734fa != 5 && iM53734fa != 6 && iM53734fa != 7 && iM53734fa != 8) {
                    throw XsltException.create("The contents of '{0}' are invalid.", "call-template");
                }
            } while (c11212rv.m53913du());
            c11212rv.m53954m9();
        }
    }

    @Override // com.aspose.slides.internal.p430tx.C11232x6, com.aspose.slides.internal.p430tx.AbstractC11197k4
    /* JADX INFO: renamed from: k4 */
    public void mo53668k4(C11234xw c11234xw, C11231x1 c11231x1) {
        int iM54107kk = c11231x1.m54107kk();
        if (iM54107kk != 0) {
            if (iM54107kk != 2) {
                if (iM54107kk != 3) {
                    C6005k4.m24259k4("Invalid CallTemplateAction execution state");
                    return;
                } else {
                    c11231x1.m54091jd();
                    return;
                }
            }
            C11183em c11183emM53864k4 = c11234xw.m54205x1().m53864k4(this.f38510k4);
            if (c11183emM53864k4 == null) {
                throw XsltException.create("The named template '{0}' does not exist.", this.f38510k4.toString());
            }
            c11231x1.m54094k4(3);
            c11234xw.m54181k4(c11183emM53864k4, c11231x1.m54090h4());
            return;
        }
        c11234xw.m54200rv();
        ArrayList arrayList = this.f38758x1;
        if (arrayList != null && arrayList.size() > 0) {
            c11234xw.m54184k4(c11231x1);
            c11231x1.m54094k4(2);
            return;
        }
        C11183em c11183emM53864k42 = c11234xw.m54205x1().m53864k4(this.f38510k4);
        if (c11183emM53864k42 == null) {
            throw XsltException.create("The named template '{0}' does not exist.", this.f38510k4.toString());
        }
        c11231x1.m54094k4(3);
        c11234xw.m54181k4(c11183emM53864k42, c11231x1.m54090h4());
    }

    @Override // com.aspose.slides.internal.p430tx.AbstractC11200ks
    /* JADX INFO: renamed from: kk */
    public boolean mo53670kk(C11212rv c11212rv) {
        String strM53753yj = c11212rv.m53964to().m53753yj();
        String strM53752x6 = c11212rv.m53964to().m53752x6();
        if (!C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15078bs)) {
            return false;
        }
        this.f38510k4 = c11212rv.m53927jd(strM53752x6);
        return true;
    }

    @Override // com.aspose.slides.internal.p430tx.C11232x6
    /* JADX INFO: renamed from: x1 */
    public void mo53671x1(C11212rv c11212rv) {
        m53853to(c11212rv);
        m53851k4(c11212rv, this.f38510k4, "name");
        m53728yj(c11212rv);
    }
}
