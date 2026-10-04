package com.aspose.slides.internal.p064cj;

import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p147ga.C4237h4;
import com.aspose.slides.internal.p310o3.AbstractC6973k4;
import com.aspose.slides.internal.p349q3.C9641e0;
import com.aspose.slides.internal.p349q3.C9723vw;

/* JADX INFO: renamed from: com.aspose.slides.internal.cj.wy */
/* JADX INFO: loaded from: classes3.dex */
public class C2536wy extends AbstractC6973k4 {
    @Override // com.aspose.slides.internal.p310o3.AbstractC6973k4
    /* JADX INFO: renamed from: x1 */
    public boolean mo11861x1(C9723vw c9723vw, C3149x1 c3149x1) {
        AbstractC6973k4.m27276k4(c9723vw, c3149x1);
        C9641e0 c9641e0 = (C9641e0) c9723vw;
        c3149x1.m13447k4(c9641e0.m47167k4() & 4294967295L);
        int iM47766lr = c9641e0.m47766lr() - 12;
        long position = c3149x1.m13442k4().getPosition();
        new C4237h4().m17066k4(c3149x1, c9641e0.m47171x1());
        c3149x1.m13442k4().seek(position + ((long) iM47766lr), 0);
        return true;
    }
}
