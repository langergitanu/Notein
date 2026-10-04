package com.aspose.slides.internal.p430tx;

import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.p559ms.System.Xml.C13851ai;
import com.aspose.slides.p559ms.System.Xml.C13890ei;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11189h4 extends C11232x6 {

    /* JADX INFO: renamed from: k4 */
    public C13890ei f38536k4;

    /* JADX INFO: renamed from: yj */
    private void m53800yj(C11212rv c11212rv) {
        C11186g8 c11186g8M53964to = c11212rv.m53964to();
        if (c11212rv.m53924h4()) {
            do {
                int iM53734fa = c11186g8M53964to.m53734fa();
                if (iM53734fa == 1) {
                    c11212rv.m53983x6();
                    String strM53741ks = c11186g8M53964to.m53741ks();
                    String strM53753yj = c11186g8M53964to.m53753yj();
                    if (!C13851ai.m65152k4(strM53741ks, c11186g8M53964to.m53740kk().f15174xi) || !C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15106h4)) {
                        throw c11212rv.m53973vj();
                    }
                    m54134k4(c11212rv.m53972v4());
                    c11212rv.m53955ne();
                } else if (iM53734fa != 5 && iM53734fa != 6 && iM53734fa != 7 && iM53734fa != 8) {
                    throw XsltException.create("The contents of '{0}' are invalid.", "attribute-set");
                }
            } while (c11212rv.m53913du());
            c11212rv.m53954m9();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C13890ei m53801k4() {
        return this.f38536k4;
    }

    @Override // com.aspose.slides.internal.p430tx.AbstractC11200ks
    /* JADX INFO: renamed from: kk */
    public boolean mo53670kk(C11212rv c11212rv) {
        String strM53753yj = c11212rv.m53964to().m53753yj();
        String strM53752x6 = c11212rv.m53964to().m53752x6();
        if (C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15078bs)) {
            this.f38536k4 = c11212rv.m53927jd(strM53752x6);
            return true;
        }
        if (!C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15132o9)) {
            return false;
        }
        m54134k4(c11212rv.m53922gi());
        return true;
    }

    @Override // com.aspose.slides.internal.p430tx.C11232x6
    /* JADX INFO: renamed from: x1 */
    public void mo53671x1(C11212rv c11212rv) {
        m53853to(c11212rv);
        m53851k4(c11212rv, this.f38536k4, "name");
        m53800yj(c11212rv);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53802k4(C11189h4 c11189h4) {
        int i = 0;
        while (true) {
            AbstractC11197k4 abstractC11197k4M54131k4 = c11189h4.m54131k4(i);
            if (abstractC11197k4M54131k4 == null) {
                return;
            }
            m54134k4(abstractC11197k4M54131k4);
            i++;
        }
    }
}
