package com.aspose.slides.internal.p064cj;

import com.aspose.slides.internal.p049bx.C1879h4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p147ga.C4232c5;
import com.aspose.slides.internal.p310o3.AbstractC6973k4;
import com.aspose.slides.internal.p349q3.C9625bz;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p500xi.C12535to;

/* JADX INFO: renamed from: com.aspose.slides.internal.cj.ak */
/* JADX INFO: loaded from: classes3.dex */
public class C2436ak extends AbstractC6973k4 {
    @Override // com.aspose.slides.internal.p310o3.AbstractC6973k4
    /* JADX INFO: renamed from: x1 */
    public boolean mo11861x1(C9723vw c9723vw, C3149x1 c3149x1) {
        long position = c3149x1.m13442k4().getPosition();
        AbstractC6973k4.m27276k4(c9723vw, c3149x1);
        C9625bz c9625bz = (C9625bz) c9723vw;
        c3149x1.m13447k4(c9625bz.m47003k4() & 4294967295L);
        c3149x1.m13447k4(c9625bz.m47013x1() & 4294967295L);
        c3149x1.m13447k4(c9625bz.m47008kk() & 4294967295L);
        c3149x1.m13447k4(c9625bz.m47011to() & 4294967295L);
        c3149x1.m13447k4(c9625bz.m47002h4() & 4294967295L);
        new C4232c5().m17061k4(c3149x1, c9625bz.m47010m9());
        new C1879h4(position, c9625bz.m47766lr(), c9625bz.m47013x1(), c9625bz.m47008kk(), c9625bz.m47011to(), c9625bz.m47002h4(), 0).m9798k4(c3149x1, (C12535to) c9625bz.m47001dy());
        return true;
    }
}
