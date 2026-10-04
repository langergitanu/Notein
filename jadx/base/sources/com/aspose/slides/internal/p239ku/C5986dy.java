package com.aspose.slides.internal.p239ku;

import com.aspose.slides.internal.p019ac.C1360yj;
import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p183ij.C4970d3;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p191it.AbstractC5121dy;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ku.dy */
/* JADX INFO: loaded from: classes.dex */
public class C5986dy extends AbstractC5121dy {
    @Override // com.aspose.slides.internal.p191it.AbstractC5121dy
    /* JADX INFO: renamed from: du */
    public void mo21977du(C5061vw c5061vw, C4201h4 c4201h4) {
        C4970d3 c4970d3 = (C4970d3) c5061vw;
        C1360yj c1360yj = (C1360yj) C7019kk.m27452k4((Object) c4201h4.m16776x6().m16793k4(c4970d3.m20899k4()), C1360yj.class);
        if (c1360yj != null) {
            int[] iArrM8061x1 = c1360yj.m8061x1();
            for (int i = 0; i < ((int) c4970d3.m20903kk()); i++) {
                if (i < c1360yj.m8059kk().length) {
                    iArrM8061x1[(int) (((c4970d3.m20906x1() & 4294967295L) + ((long) i)) & 4294967295L)] = c4970d3.m20905to()[i].m7942k4();
                }
            }
            c1360yj.m8057k4(iArrM8061x1);
        }
    }
}
