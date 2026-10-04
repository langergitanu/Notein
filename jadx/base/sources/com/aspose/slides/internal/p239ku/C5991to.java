package com.aspose.slides.internal.p239ku;

import com.aspose.slides.internal.p019ac.C1360yj;
import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p183ij.C5031qn;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p191it.AbstractC5121dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: renamed from: com.aspose.slides.internal.ku.to */
/* JADX INFO: loaded from: classes.dex */
public class C5991to extends AbstractC5121dy {
    @Override // com.aspose.slides.internal.p191it.AbstractC5121dy
    /* JADX INFO: renamed from: du */
    public void mo21977du(C5061vw c5061vw, C4201h4 c4201h4) {
        C5031qn c5031qn = (C5031qn) c5061vw;
        C1360yj c1360yj = (C1360yj) C7019kk.m27452k4((Object) c4201h4.m16776x6().m16793k4(c5031qn.m21390k4()), C1360yj.class);
        if (c1360yj != null) {
            int[] iArr = new int[(int) c5031qn.m21393x1()];
            for (int i = 0; i < ((int) c5031qn.m21393x1()); i++) {
                if (i < c1360yj.m8059kk().length) {
                    iArr[i] = c1360yj.m8059kk()[i].m7942k4();
                }
            }
            c1360yj.m8057k4(iArr);
            c1360yj.m8060x1((int) (c5031qn.m21393x1() & C18177fb.f54859s));
        }
    }
}
