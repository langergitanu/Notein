package com.aspose.slides.internal.p430tx;

import com.aspose.slides.internal.p229ki.AbstractC5728qw;
import com.aspose.slides.internal.p229ki.C5709jw;
import com.aspose.slides.internal.p229ki.C5720na;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.C13851ai;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.qq */
/* JADX INFO: loaded from: classes4.dex */
public class C11209qq extends AbstractC11200ks {

    /* JADX INFO: renamed from: k4 */
    private int f38627k4 = -1;

    @Override // com.aspose.slides.internal.p430tx.AbstractC11197k4
    /* JADX INFO: renamed from: k4 */
    public void mo53668k4(C11234xw c11234xw, C11231x1 c11231x1) {
        int iM54107kk = c11231x1.m54107kk();
        if (iM54107kk != 0) {
            if (iM54107kk == 2) {
                c11234xw.m54197kk(c11231x1.m54113x1());
                c11231x1.m54091jd();
                return;
            } else {
                if (iM54107kk != 3) {
                    return;
                }
                c11231x1.m54091jd();
                return;
            }
        }
        AbstractC5728qw abstractC5728qwM54202to = c11234xw.m54202to(this.f38627k4);
        Object objMo23148k4 = abstractC5728qwM54202to.mo23148k4(c11231x1.m54090h4());
        if (C7019kk.m27469x1(objMo23148k4, AbstractC10929m9.class)) {
            c11234xw.m54181k4(C11228wl.m54076k4(), new C5709jw(abstractC5728qwM54202to));
            c11231x1.m54094k4(3);
            return;
        }
        AbstractC10925du abstractC10925du = (AbstractC10925du) C7019kk.m27452k4(objMo23148k4, AbstractC10925du.class);
        if (abstractC10925du != null) {
            c11234xw.m54181k4(C11228wl.m54076k4(), new C5720na(abstractC10925du));
            c11231x1.m54094k4(3);
            return;
        }
        String strM65148x1 = C13850af.m65148x1(objMo23148k4);
        if (c11234xw.m54197kk(strM65148x1)) {
            c11231x1.m54091jd();
        } else {
            c11231x1.m54105k4(strM65148x1);
            c11231x1.m54094k4(2);
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
        this.f38627k4 = c11212rv.m53987yj(strM53752x6);
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    public void m53881x1(C11212rv c11212rv) {
        m53853to(c11212rv);
        m53852k4(c11212rv, this.f38627k4 != -1, "select");
        m53850du(c11212rv);
    }
}
