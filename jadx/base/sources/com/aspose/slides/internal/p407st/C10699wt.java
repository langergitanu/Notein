package com.aspose.slides.internal.p407st;

import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.wt */
/* JADX INFO: loaded from: classes4.dex */
public class C10699wt extends AbstractC10376bv {
    public C10699wt() {
        m51409um().m51917k4(2005);
    }

    /* JADX INFO: renamed from: kk */
    private boolean m51950kk(AbstractC10571o4 abstractC10571o4) {
        return abstractC10571o4 instanceof C10497jm;
    }

    /* JADX INFO: renamed from: x1 */
    public int m51951x1() {
        int iM67483k4 = -1;
        for (int i = 0; i < m50513yj().size(); i++) {
            if (m51950kk(m50513yj().get_Item(i))) {
                iM67483k4 = C14116yg.m67483k4(iM67483k4, (int) m50513yj().get_Item(i).m51409um().m51922kk());
            }
        }
        return iM67483k4;
    }
}
