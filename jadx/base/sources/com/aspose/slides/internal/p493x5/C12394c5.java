package com.aspose.slides.internal.p493x5;

import com.aspose.slides.internal.p181ig.AbstractC4841k4;
import com.aspose.slides.internal.p181ig.C4832gk;
import com.aspose.slides.internal.p181ig.C4879y2;
import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: renamed from: com.aspose.slides.internal.x5.c5 */
/* JADX INFO: loaded from: classes5.dex */
public class C12394c5 extends AbstractC12411j5 {
    @Override // com.aspose.slides.internal.p493x5.AbstractC12411j5
    /* JADX INFO: renamed from: k4 */
    public void mo58011k4(C4832gk c4832gk, C4879y2 c4879y2) {
        c4879y2.m20173jd();
        if (c4879y2.m20181kk()) {
            c4832gk.m19979x1(this);
            c4832gk.m19967k4(AbstractC12411j5.f41416k4);
            c4832gk.m19978x1();
            return;
        }
        char cM20190x1 = c4879y2.m20190x1();
        if (cM20190x1 == 0) {
            c4832gk.m19979x1(this);
            c4832gk.m19956c5().m20099kk((char) 65533);
            return;
        }
        if (cM20190x1 == '\"') {
            c4832gk.m19967k4(AbstractC12411j5.f41455yj);
            return;
        }
        if (cM20190x1 != '&') {
            c4832gk.m19956c5().m20099kk(c4879y2.m20190x1());
            return;
        }
        char[] cArrM19970k4 = c4832gk.m19970k4(new C14093tq<>('\"'), true);
        AbstractC4841k4 abstractC4841k4M19956c5 = c4832gk.m19956c5();
        if (cArrM19970k4 != null) {
            abstractC4841k4M19956c5.m20096k4(cArrM19970k4);
        } else {
            abstractC4841k4M19956c5.m20099kk(c4879y2.m20190x1());
        }
    }
}
