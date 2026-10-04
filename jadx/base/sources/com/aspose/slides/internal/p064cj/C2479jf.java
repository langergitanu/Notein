package com.aspose.slides.internal.p064cj;

import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p147ga.C4248x6;
import com.aspose.slides.internal.p260ly.C6267ar;
import com.aspose.slides.internal.p310o3.AbstractC6973k4;
import com.aspose.slides.internal.p349q3.C9708tl;
import com.aspose.slides.internal.p349q3.C9723vw;

/* JADX INFO: renamed from: com.aspose.slides.internal.cj.jf */
/* JADX INFO: loaded from: classes3.dex */
public class C2479jf extends AbstractC6973k4 {
    @Override // com.aspose.slides.internal.p310o3.AbstractC6973k4
    /* JADX INFO: renamed from: x1 */
    public boolean mo11861x1(C9723vw c9723vw, C3149x1 c3149x1) {
        AbstractC6973k4.m27276k4(c9723vw, c3149x1);
        C9708tl c9708tl = (C9708tl) c9723vw;
        c3149x1.m13447k4(c9708tl.m47666k4() & 4294967295L);
        if (c9708tl.m47672x1().length > 0) {
            for (C6267ar c6267ar : c9708tl.m47672x1()) {
                new C4248x6().m17077k4(c3149x1, c6267ar);
            }
        }
        c3149x1.m13450k4(c9708tl.m47671kk());
        return true;
    }
}
