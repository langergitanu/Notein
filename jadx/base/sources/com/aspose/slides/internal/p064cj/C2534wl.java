package com.aspose.slides.internal.p064cj;

import com.aspose.slides.internal.p049bx.C1879h4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p310o3.AbstractC6973k4;
import com.aspose.slides.internal.p349q3.C9624bv;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: renamed from: com.aspose.slides.internal.cj.wl */
/* JADX INFO: loaded from: classes3.dex */
public class C2534wl extends AbstractC6973k4 {
    @Override // com.aspose.slides.internal.p310o3.AbstractC6973k4
    /* JADX INFO: renamed from: x1 */
    public boolean mo11861x1(C9723vw c9723vw, C3149x1 c3149x1) {
        long position = c3149x1.m13442k4().getPosition();
        AbstractC6973k4.m27276k4(c9723vw, c3149x1);
        C9624bv c9624bv = (C9624bv) c9723vw;
        c3149x1.m13447k4(c9624bv.m46989k4() & 4294967295L);
        c3149x1.m13447k4(c9624bv.m46998x1() & 4294967295L);
        c3149x1.m13447k4(c9624bv.m46993kk() & 4294967295L);
        c3149x1.m13447k4(c9624bv.m46996to() & 4294967295L);
        c3149x1.m13447k4(c9624bv.m46987h4() & 4294967295L);
        c3149x1.m13447k4(c9624bv.m46995m9() & 4294967295L);
        new C1879h4(position, c9624bv.m47766lr(), c9624bv.m46993kk(), c9624bv.m46996to(), c9624bv.m46987h4(), c9624bv.m46995m9(), (int) (c9624bv.m46998x1() & C18177fb.f54859s)).m9798k4(c3149x1, c9723vw);
        return true;
    }
}
