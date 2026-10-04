package com.aspose.slides.internal.p413t1;

import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p183ij.C5048tq;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p191it.AbstractC5120du;
import com.aspose.slides.internal.p475wh.C12016rv;

/* JADX INFO: renamed from: com.aspose.slides.internal.t1.fa */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10816fa extends AbstractC5120du {
    @Override // com.aspose.slides.internal.p191it.AbstractC5120du
    /* JADX INFO: renamed from: du */
    public void mo16615du(C5061vw c5061vw, C4201h4 c4201h4) {
        C5048tq c5048tq = (C5048tq) c5061vw;
        if (c4201h4.m16781yj()) {
            c4201h4.m16755up().m55546k4(c4201h4.m16757uz().Clone(), c5048tq.m21477k4().m58197kk().Clone());
            c4201h4.m16772x1(c5048tq.m21477k4().m58197kk().Clone());
        } else {
            if (c4201h4.m16688dy() != null) {
                mo16671k4(c5048tq.m21477k4().m58197kk().Clone(), c4201h4);
            }
            c4201h4.m16718k4(c5048tq.m21477k4().m58197kk().Clone());
        }
    }

    @Override // com.aspose.slides.internal.p191it.AbstractC5120du
    /* JADX INFO: renamed from: h4 */
    public boolean mo16667h4(C5061vw c5061vw, C4201h4 c4201h4) {
        return !c4201h4.m16781yj();
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo16671k4(C12016rv c12016rv, C4201h4 c4201h4);
}
