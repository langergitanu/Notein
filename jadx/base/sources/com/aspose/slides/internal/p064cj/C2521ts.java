package com.aspose.slides.internal.p064cj;

import com.aspose.slides.internal.p049bx.C1894x6;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p147ga.C4241ks;
import com.aspose.slides.internal.p310o3.AbstractC6973k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p349q3.C9726wp;

/* JADX INFO: renamed from: com.aspose.slides.internal.cj.ts */
/* JADX INFO: loaded from: classes3.dex */
public class C2521ts extends AbstractC6973k4 {
    @Override // com.aspose.slides.internal.p310o3.AbstractC6973k4
    /* JADX INFO: renamed from: x1 */
    public boolean mo11861x1(C9723vw c9723vw, C3149x1 c3149x1) {
        long position = c3149x1.m13442k4().getPosition();
        AbstractC6973k4.m27276k4(c9723vw, c3149x1);
        C9726wp c9726wp = (C9726wp) c9723vw;
        new C1894x6().m9814k4(c3149x1, c9726wp.m47784k4());
        c3149x1.m13447k4(c9726wp.m47792x1() & 4294967295L);
        c3149x1.m13447k4(C7019kk.m27435du(Float.valueOf(c9726wp.m47790kk()), 13));
        c3149x1.m13447k4(C7019kk.m27435du(Float.valueOf(c9726wp.m47791to()), 13));
        new C4241ks(position, false).m17070k4(c3149x1, c9726wp.m47783h4());
        return true;
    }
}
