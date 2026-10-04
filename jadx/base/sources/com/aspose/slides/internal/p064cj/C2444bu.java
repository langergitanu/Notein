package com.aspose.slides.internal.p064cj;

import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p147ga.C4242m9;
import com.aspose.slides.internal.p260ly.C6278ks;
import com.aspose.slides.internal.p310o3.AbstractC6973k4;
import com.aspose.slides.internal.p349q3.C9632d3;
import com.aspose.slides.internal.p349q3.C9723vw;

/* JADX INFO: renamed from: com.aspose.slides.internal.cj.bu */
/* JADX INFO: loaded from: classes3.dex */
public class C2444bu extends AbstractC6973k4 {
    @Override // com.aspose.slides.internal.p310o3.AbstractC6973k4
    /* JADX INFO: renamed from: x1 */
    public boolean mo11861x1(C9723vw c9723vw, C3149x1 c3149x1) {
        AbstractC6973k4.m27276k4(c9723vw, c3149x1);
        C9632d3 c9632d3 = (C9632d3) c9723vw;
        c3149x1.m13447k4(c9632d3.m47069k4() & 4294967295L);
        c3149x1.m13447k4(c9632d3.m47076x1() & 4294967295L);
        c3149x1.m13447k4(c9632d3.m47073kk() & 4294967295L);
        if (c9632d3.m47075to().length <= 0) {
            return true;
        }
        for (C6278ks c6278ks : c9632d3.m47075to()) {
            new C4242m9().m17071k4(c3149x1, c6278ks);
        }
        return true;
    }
}
