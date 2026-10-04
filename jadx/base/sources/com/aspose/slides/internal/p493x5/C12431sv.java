package com.aspose.slides.internal.p493x5;

import com.aspose.slides.internal.p181ig.C4832gk;
import com.aspose.slides.internal.p181ig.C4879y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.x5.sv */
/* JADX INFO: loaded from: classes5.dex */
public class C12431sv extends AbstractC12411j5 {
    @Override // com.aspose.slides.internal.p493x5.AbstractC12411j5
    /* JADX INFO: renamed from: k4 */
    public void mo58011k4(C4832gk c4832gk, C4879y2 c4879y2) {
        c4879y2.m20173jd();
        char cM20190x1 = c4879y2.m20190x1();
        if (cM20190x1 == '\t' || cM20190x1 == '\n' || cM20190x1 == '\f' || cM20190x1 == '\r' || cM20190x1 == ' ') {
            if (c4832gk.m19982yj()) {
                c4832gk.m19967k4(AbstractC12411j5.f41423m9);
                return;
            } else {
                mo58012x1(c4832gk, c4879y2);
                return;
            }
        }
        if (cM20190x1 == '/') {
            if (c4832gk.m19982yj()) {
                c4832gk.m19967k4(AbstractC12411j5.f41402du);
                return;
            } else {
                mo58012x1(c4832gk, c4879y2);
                return;
            }
        }
        if (cM20190x1 != '>') {
            if (!c4879y2.m20186rv()) {
                mo58012x1(c4832gk, c4879y2);
                return;
            } else {
                c4832gk.m19956c5().m20091k4(c4879y2.m20190x1());
                c4832gk.m19960fa().m26780k4(c4879y2.m20190x1());
                return;
            }
        }
        if (!c4832gk.m19982yj()) {
            mo58012x1(c4832gk, c4879y2);
        } else {
            c4832gk.m19971kk();
            c4832gk.m19967k4(AbstractC12411j5.f41416k4);
        }
    }

    @Override // com.aspose.slides.internal.p493x5.AbstractC12411j5
    /* JADX INFO: renamed from: x1 */
    public void mo58012x1(C4832gk c4832gk, C4879y2 c4879y2) {
        c4832gk.m19968k4("</" + c4832gk.m19960fa());
        c4832gk.m19967k4(AbstractC12411j5.f41411he);
        c4832gk.m19978x1();
    }
}
