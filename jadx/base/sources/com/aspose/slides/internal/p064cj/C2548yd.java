package com.aspose.slides.internal.p064cj;

import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p110ek.C3749k4;
import com.aspose.slides.internal.p147ga.C4235dy;
import com.aspose.slides.internal.p310o3.AbstractC6973k4;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p349q3.C9735xk;

/* JADX INFO: renamed from: com.aspose.slides.internal.cj.yd */
/* JADX INFO: loaded from: classes3.dex */
public class C2548yd extends AbstractC6973k4 {
    @Override // com.aspose.slides.internal.p310o3.AbstractC6973k4
    /* JADX INFO: renamed from: x1 */
    public boolean mo11861x1(C9723vw c9723vw, C3149x1 c3149x1) {
        long position = c3149x1.m13442k4().getPosition();
        AbstractC6973k4.m27276k4(c9723vw, c3149x1);
        C9735xk c9735xk = (C9735xk) c9723vw;
        c3149x1.m13447k4(c9735xk.m47839k4() & 4294967295L);
        c3149x1.m13447k4(c9735xk.m47846x1() & 4294967295L);
        if ((c9735xk.m47839k4() & 4294967295L) > 0) {
            c3149x1.m13442k4().seek(position + (c9735xk.m47846x1() & 4294967295L), 0);
            C4235dy.m17063k4(c3149x1, c9735xk.m47844kk());
        }
        C3749k4.m15047k4(c3149x1.m13442k4(), 4);
        c3149x1.m13447k4(c9735xk.m47845to() & 4294967295L);
        return true;
    }
}
