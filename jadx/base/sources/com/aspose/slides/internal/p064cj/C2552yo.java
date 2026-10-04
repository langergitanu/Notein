package com.aspose.slides.internal.p064cj;

import com.aspose.slides.internal.p049bx.C1894x6;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p147ga.C4241ks;
import com.aspose.slides.internal.p260ly.C6288wl;
import com.aspose.slides.internal.p310o3.AbstractC6973k4;
import com.aspose.slides.internal.p349q3.C9657ii;
import com.aspose.slides.internal.p349q3.C9723vw;

/* JADX INFO: renamed from: com.aspose.slides.internal.cj.yo */
/* JADX INFO: loaded from: classes3.dex */
public class C2552yo extends AbstractC6973k4 {
    @Override // com.aspose.slides.internal.p310o3.AbstractC6973k4
    /* JADX INFO: renamed from: x1 */
    public boolean mo11861x1(C9723vw c9723vw, C3149x1 c3149x1) {
        long position = c3149x1.m13442k4().getPosition();
        AbstractC6973k4.m27276k4(c9723vw, c3149x1);
        C9657ii c9657ii = (C9657ii) c9723vw;
        new C1894x6().m9814k4(c3149x1, c9657ii.m47278k4());
        c3149x1.m13447k4(c9657ii.m47287x1() & 4294967295L);
        c3149x1.m13445k4(c9657ii.m47284kk());
        c3149x1.m13445k4(c9657ii.m47286to());
        c3149x1.m13447k4(c9657ii.m47277h4() & 4294967295L);
        for (C6288wl c6288wl : c9657ii.m47285m9()) {
            new C4241ks(position, true).m17070k4(c3149x1, c6288wl);
        }
        return true;
    }
}
