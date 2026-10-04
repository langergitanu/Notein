package com.aspose.slides.internal.p430tx;

import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.internal.p080dd.C3125bv;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14087rv;
import com.aspose.slides.p559ms.System.Xml.C13851ai;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.ts */
/* JADX INFO: loaded from: classes4.dex */
public class C11219ts extends C11232x6 {

    /* JADX INFO: renamed from: k4 */
    private boolean f38709k4;

    @Override // com.aspose.slides.internal.p430tx.C11232x6, com.aspose.slides.internal.p430tx.AbstractC11197k4
    /* JADX INFO: renamed from: k4 */
    public void mo53668k4(C11234xw c11234xw, C11231x1 c11231x1) {
        int iM54107kk = c11231x1.m54107kk();
        if (iM54107kk == 0) {
            c11234xw.m54183k4(new C11196jw(c11234xw, new C3125bv(C11697x1.m55250kk())));
            c11234xw.m54184k4(c11231x1);
            c11231x1.m54094k4(1);
        } else {
            if (iM54107kk != 1) {
                C6005k4.m24259k4("Invalid MessageAction execution state");
                return;
            }
            C11196jw c11196jw = (C11196jw) C7019kk.m27452k4((Object) c11234xw.m54198ks(), C11196jw.class);
            C14087rv.m67171x1(c11196jw.m53838k4().toString());
            if (this.f38709k4) {
                throw XsltException.create("Transform terminated: '{0}'.", c11196jw.m53838k4().toString());
            }
            c11231x1.m54091jd();
        }
    }

    @Override // com.aspose.slides.internal.p430tx.AbstractC11200ks
    /* JADX INFO: renamed from: kk */
    public boolean mo53670kk(C11212rv c11212rv) {
        String strM53753yj = c11212rv.m53964to().m53753yj();
        String strM53752x6 = c11212rv.m53964to().m53752x6();
        if (!C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15156u5)) {
            return false;
        }
        this.f38709k4 = c11212rv.m53916dy(strM53752x6);
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
    }
}
