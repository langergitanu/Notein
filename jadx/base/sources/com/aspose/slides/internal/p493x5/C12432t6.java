package com.aspose.slides.internal.p493x5;

import com.aspose.slides.internal.p181ig.C4832gk;
import com.aspose.slides.internal.p181ig.C4879y2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.x5.t6 */
/* JADX INFO: loaded from: classes5.dex */
public class C12432t6 extends AbstractC12411j5 {
    @Override // com.aspose.slides.internal.p493x5.AbstractC12411j5
    /* JADX INFO: renamed from: k4 */
    public void mo58011k4(C4832gk c4832gk, C4879y2 c4879y2) {
        c4879y2.m20173jd();
        char cM20190x1 = c4879y2.m20190x1();
        if (cM20190x1 == '\t' || cM20190x1 == '\n' || cM20190x1 == '\f' || cM20190x1 == '\r' || cM20190x1 == ' ' || cM20190x1 == '/' || cM20190x1 == '>') {
            c4832gk.m19967k4(C14113y2.m67363du(c4832gk.m19960fa().toString(), "script") ? AbstractC12411j5.f41456zj : AbstractC12411j5.f41428qw);
            c4832gk.m19965k4(c4879y2.m20190x1());
        } else if (c4879y2.m20186rv()) {
            c4832gk.m19960fa().m26780k4(C14117yj.m67538rv(c4879y2.m20190x1()));
            c4832gk.m19965k4(c4879y2.m20190x1());
        } else {
            c4832gk.m19967k4(AbstractC12411j5.f41428qw);
            c4832gk.m19978x1();
        }
    }
}
