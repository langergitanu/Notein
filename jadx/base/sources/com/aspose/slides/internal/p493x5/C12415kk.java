package com.aspose.slides.internal.p493x5;

import com.aspose.slides.internal.p181ig.C4832gk;
import com.aspose.slides.internal.p181ig.C4879y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.x5.kk */
/* JADX INFO: loaded from: classes5.dex */
public class C12415kk extends AbstractC12411j5 {
    @Override // com.aspose.slides.internal.p493x5.AbstractC12411j5
    /* JADX INFO: renamed from: k4 */
    public void mo58011k4(C4832gk c4832gk, C4879y2 c4879y2) {
        AbstractC12411j5 abstractC12411j5;
        c4879y2.m20173jd();
        if (!c4879y2.m20181kk()) {
            char cM20190x1 = c4879y2.m20190x1();
            if (cM20190x1 == '\t' || cM20190x1 == '\n' || cM20190x1 == '\f' || cM20190x1 == ' ') {
                return;
            }
            if (cM20190x1 != '>') {
                if (c4879y2.m20182kk("PUBLIC", true)) {
                    abstractC12411j5 = AbstractC12411j5.f41420lr;
                } else if (c4879y2.m20182kk("SYSTEM", true)) {
                    abstractC12411j5 = AbstractC12411j5.f41451xk;
                } else {
                    c4832gk.m19979x1(this);
                    c4832gk.m19957ck().m20126k4(true);
                    abstractC12411j5 = AbstractC12411j5.f41442v4;
                }
            }
            c4832gk.m19967k4(abstractC12411j5);
        }
        c4832gk.m19979x1(this);
        c4832gk.m19957ck().m20126k4(true);
        c4832gk.m19974m9();
        abstractC12411j5 = AbstractC12411j5.f41416k4;
        c4832gk.m19967k4(abstractC12411j5);
    }
}
