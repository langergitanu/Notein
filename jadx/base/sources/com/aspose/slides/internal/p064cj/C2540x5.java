package com.aspose.slides.internal.p064cj;

import com.aspose.slides.internal.p049bx.C1894x6;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p147ga.C4241ks;
import com.aspose.slides.internal.p260ly.C6288wl;
import com.aspose.slides.internal.p310o3.AbstractC6973k4;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p349q3.C9750zm;

/* JADX INFO: renamed from: com.aspose.slides.internal.cj.x5 */
/* JADX INFO: loaded from: classes3.dex */
public class C2540x5 extends AbstractC6973k4 {
    @Override // com.aspose.slides.internal.p310o3.AbstractC6973k4
    /* JADX INFO: renamed from: x1 */
    public boolean mo11861x1(C9723vw c9723vw, C3149x1 c3149x1) {
        long position = c3149x1.m13442k4().getPosition();
        AbstractC6973k4.m27276k4(c9723vw, c3149x1);
        C9750zm c9750zm = new C9750zm(c9723vw);
        new C1894x6().m9814k4(c3149x1, c9750zm.m47961k4());
        c3149x1.m13447k4(c9750zm.m47970x1() & 4294967295L);
        c3149x1.m13445k4(c9750zm.m47967kk());
        c3149x1.m13445k4(c9750zm.m47969to());
        c3149x1.m13447k4(c9750zm.m47960h4() & 4294967295L);
        for (C6288wl c6288wl : c9750zm.m47968m9()) {
            new C4241ks(position, false).m17070k4(c3149x1, c6288wl);
        }
        return true;
    }
}
