package com.aspose.slides.internal.p430tx;

import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.p559ms.System.Xml.C13851ai;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.up */
/* JADX INFO: loaded from: classes4.dex */
public class C11222up extends C11232x6 {
    /* JADX INFO: renamed from: yj */
    private void m54026yj(C11212rv c11212rv) {
        C11169ak c11169akM53978x1;
        C11186g8 c11186g8M53964to = c11212rv.m53964to();
        boolean z = false;
        boolean z2 = false;
        do {
            int iM53734fa = c11186g8M53964to.m53734fa();
            boolean z3 = true;
            if (iM53734fa == 1) {
                c11212rv.m53983x6();
                String strM53741ks = c11186g8M53964to.m53741ks();
                String strM53753yj = c11186g8M53964to.m53753yj();
                if (!C13851ai.m65152k4(strM53741ks, c11186g8M53964to.m53740kk().f15174xi)) {
                    throw c11212rv.m53973vj();
                }
                if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15135q3)) {
                    if (z) {
                        throw XsltException.create("'Xsl:when' must precede the 'Xsl:otherwise' element.", new String[0]);
                    }
                    c11169akM53978x1 = c11212rv.m53978x1(1);
                } else {
                    if (!C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15103gf)) {
                        throw c11212rv.m53973vj();
                    }
                    if (z) {
                        throw XsltException.create("An 'Xsl:choose' element can have only one 'Xsl:otherwise' child.", new String[0]);
                    }
                    boolean z4 = z2;
                    c11169akM53978x1 = c11212rv.m53978x1(2);
                    z = true;
                    z3 = z4;
                }
                m54134k4(c11169akM53978x1);
                c11212rv.m53955ne();
                z2 = z3;
            } else if (iM53734fa != 5 && iM53734fa != 6 && iM53734fa != 7 && iM53734fa != 8) {
                throw XsltException.create("The contents of '{0}' are invalid.", "choose");
            }
        } while (c11212rv.m53913du());
        if (!z2) {
            throw XsltException.create("An 'Xsl:choose' element must have at least one 'Xsl:when' child.", new String[0]);
        }
    }

    @Override // com.aspose.slides.internal.p430tx.C11232x6
    /* JADX INFO: renamed from: x1 */
    public void mo53671x1(C11212rv c11212rv) {
        m53853to(c11212rv);
        if (c11212rv.m53924h4()) {
            m54026yj(c11212rv);
            c11212rv.m53954m9();
        }
    }
}
