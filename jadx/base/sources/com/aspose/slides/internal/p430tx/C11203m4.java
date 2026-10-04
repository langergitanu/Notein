package com.aspose.slides.internal.p430tx;

import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.C13890ei;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.m4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11203m4 extends AbstractC11200ks {

    /* JADX INFO: renamed from: k4 */
    private C13890ei[] f38605k4;

    /* JADX INFO: renamed from: x1 */
    private String f38606x1;

    @Override // com.aspose.slides.internal.p430tx.AbstractC11197k4
    /* JADX INFO: renamed from: k4 */
    public void mo53668k4(C11234xw c11234xw, C11231x1 c11231x1) {
        int iM54107kk = c11231x1.m54107kk();
        if (iM54107kk == 0) {
            c11231x1.m54114x1(0);
            c11231x1.m54094k4(2);
            if (c11231x1.m54111to() >= this.f38605k4.length) {
                c11231x1.m54091jd();
                return;
            }
            C11189h4 c11189h4M53885k4 = c11234xw.m54199m9().m53885k4(this.f38605k4[c11231x1.m54111to()]);
            c11231x1.m54089dy();
            c11234xw.m54181k4(c11189h4M53885k4, c11231x1.m54090h4());
            return;
        }
        if (iM54107kk != 2) {
            C6005k4.m24259k4("Invalid Container action execution state");
        } else {
            if (c11231x1.m54111to() >= this.f38605k4.length) {
                c11231x1.m54091jd();
                return;
            }
            C11189h4 c11189h4M53885k42 = c11234xw.m54199m9().m53885k4(this.f38605k4[c11231x1.m54111to()]);
            c11231x1.m54089dy();
            c11234xw.m54181k4(c11189h4M53885k42, c11231x1.m54090h4());
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void m53857x1(C11212rv c11212rv) {
        String strM53752x6 = c11212rv.m53964to().m53752x6();
        this.f38606x1 = strM53752x6;
        if (strM53752x6.length() == 0) {
            this.f38605k4 = new C13890ei[0];
            return;
        }
        String[] strArrM65133v4 = C13850af.m65133v4(this.f38606x1);
        try {
            this.f38605k4 = new C13890ei[strArrM65133v4.length];
            for (int i = 0; i < strArrM65133v4.length; i++) {
                this.f38605k4[i] = c11212rv.m53927jd(strArrM65133v4[i]);
            }
        } catch (XsltException e) {
            if (!c11212rv.m53919fa()) {
                throw e;
            }
            this.f38605k4 = new C13890ei[0];
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C13890ei[] m53856k4() {
        return this.f38605k4;
    }
}
