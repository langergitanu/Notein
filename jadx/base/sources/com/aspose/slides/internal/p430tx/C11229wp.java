package com.aspose.slides.internal.p430tx;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.p559ms.System.Xml.C13851ai;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.wp */
/* JADX INFO: loaded from: classes4.dex */
public class C11229wp extends C11232x6 {

    /* JADX INFO: renamed from: du */
    private boolean f38734du;

    /* JADX INFO: renamed from: k4 */
    private String f38735k4;

    /* JADX INFO: renamed from: to */
    private String f38736to;

    @Override // com.aspose.slides.internal.p430tx.C11232x6, com.aspose.slides.internal.p430tx.AbstractC11197k4
    /* JADX INFO: renamed from: k4 */
    public void mo53668k4(C11234xw c11234xw, C11231x1 c11231x1) {
        int iM54107kk = c11231x1.m54107kk();
        if (iM54107kk != 0) {
            if (iM54107kk != 1) {
                C6005k4.m24259k4("Invalid Container action execution state");
                return;
            } else {
                c11231x1.m54091jd();
                return;
            }
        }
        if (!this.f38734du) {
            throw XsltException.create("'{0}' is not a recognized extension element.", this.f38735k4);
        }
        ArrayList arrayList = this.f38758x1;
        if (arrayList == null || arrayList.size() <= 0) {
            c11231x1.m54091jd();
        } else {
            c11234xw.m54184k4(c11231x1);
            c11231x1.m54094k4(1);
        }
    }

    @Override // com.aspose.slides.internal.p430tx.C11232x6
    /* JADX INFO: renamed from: x1 */
    public void mo53671x1(C11212rv c11212rv) {
        AbstractC10925du abstractC10925duDeepClone = c11212rv.m53964to().m53746to().deepClone();
        this.f38735k4 = abstractC10925duDeepClone.mo21846h4();
        abstractC10925duDeepClone.mo21864ne();
        this.f38736to = abstractC10925duDeepClone.mo21846h4();
        if (c11212rv.m53924h4()) {
            m54080yj(c11212rv);
            c11212rv.m53954m9();
        }
    }

    /* JADX INFO: renamed from: yj */
    public final void m54080yj(C11212rv c11212rv) {
        C11186g8 c11186g8M53964to = c11212rv.m53964to();
        do {
            if (C13851ai.m65152k4(c11186g8M53964to.m53741ks(), c11186g8M53964to.m53740kk().f15174xi) && C13851ai.m65152k4(c11186g8M53964to.m53753yj(), c11186g8M53964to.m53740kk().f15091dq)) {
                this.f38734du = true;
                if (c11212rv.m53924h4()) {
                    m54128fa(c11212rv);
                    c11212rv.m53954m9();
                }
            }
        } while (c11212rv.m53913du());
    }
}
