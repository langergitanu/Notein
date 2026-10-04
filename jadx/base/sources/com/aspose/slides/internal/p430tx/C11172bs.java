package com.aspose.slides.internal.p430tx;

import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13851ai;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.bs */
/* JADX INFO: loaded from: classes4.dex */
public class C11172bs extends AbstractC11200ks {

    /* JADX INFO: renamed from: k4 */
    private boolean f38463k4;

    /* JADX INFO: renamed from: x1 */
    private String f38464x1;

    /* JADX INFO: renamed from: h4 */
    private void m53680h4(C11212rv c11212rv) {
        if (c11212rv.m53924h4()) {
            C11186g8 c11186g8M53964to = c11212rv.m53964to();
            this.f38464x1 = C14113y2.f47374k4;
            do {
                switch (c11186g8M53964to.m53734fa()) {
                    case 4:
                    case 5:
                    case 6:
                        this.f38464x1 = C14113y2.m67400k4(this.f38464x1, c11186g8M53964to.m53752x6());
                        break;
                    case 7:
                    case 8:
                        break;
                    default:
                        throw c11212rv.m53973vj();
                }
            } while (c11212rv.m53913du());
            c11212rv.m53954m9();
        }
    }

    @Override // com.aspose.slides.internal.p430tx.AbstractC11197k4
    /* JADX INFO: renamed from: k4 */
    public void mo53668k4(C11234xw c11234xw, C11231x1 c11231x1) {
        if (c11231x1.m54107kk() != 0) {
            C6005k4.m24259k4("Invalid execution state in TextAction");
        } else if (c11234xw.m54192k4(this.f38464x1, this.f38463k4)) {
            c11231x1.m54091jd();
        }
    }

    @Override // com.aspose.slides.internal.p430tx.AbstractC11200ks
    /* JADX INFO: renamed from: kk */
    public boolean mo53670kk(C11212rv c11212rv) {
        String strM53753yj = c11212rv.m53964to().m53753yj();
        String strM53752x6 = c11212rv.m53964to().m53752x6();
        if (!C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15073ar)) {
            return false;
        }
        this.f38463k4 = c11212rv.m53916dy(strM53752x6);
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    public void m53681x1(C11212rv c11212rv) {
        m53853to(c11212rv);
        m53680h4(c11212rv);
    }
}
