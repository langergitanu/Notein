package com.aspose.slides.internal.p493x5;

import com.aspose.slides.internal.p181ig.C4832gk;
import com.aspose.slides.internal.p181ig.C4879y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.x5.k4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12414k4 extends AbstractC12411j5 {
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
            c4832gk.m19956c5().m20089du();
            c4832gk.m19956c5().m20101x1((char) 65533);
            c4832gk.m19967k4(AbstractC12411j5.f41403dy);
            return;
        }
        if (cM20190x1 != ' ') {
            if (cM20190x1 != '\"' && cM20190x1 != '\'') {
                if (cM20190x1 == '/') {
                    c4832gk.m19967k4(AbstractC12411j5.f41402du);
                    return;
                }
                if (cM20190x1 == '\t' || cM20190x1 == '\n' || cM20190x1 == '\f' || cM20190x1 == '\r') {
                    return;
                }
                switch (cM20190x1) {
                    case '<':
                        break;
                    case '=':
                        c4832gk.m19967k4(AbstractC12411j5.f41414jd);
                        break;
                    case '>':
                        c4832gk.m19971kk();
                        c4832gk.m19967k4(AbstractC12411j5.f41416k4);
                        break;
                    default:
                        mo58012x1(c4832gk, c4879y2);
                        break;
                }
                return;
            }
            c4832gk.m19979x1(this);
            mo58012x1(c4832gk, c4879y2);
        }
    }

    @Override // com.aspose.slides.internal.p493x5.AbstractC12411j5
    /* JADX INFO: renamed from: x1 */
    public void mo58012x1(C4832gk c4832gk, C4879y2 c4879y2) {
        c4832gk.m19956c5().m20089du();
        c4832gk.m19956c5().m20101x1(c4879y2.m20190x1());
        c4832gk.m19967k4(AbstractC12411j5.f41403dy);
    }
}
