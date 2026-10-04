package com.aspose.slides.internal.p413t1;

import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p183ij.C5075y2;
import com.aspose.slides.internal.p191it.AbstractC5120du;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12018u4;

/* JADX INFO: renamed from: com.aspose.slides.internal.t1.up */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10831up extends AbstractC5120du {
    @Override // com.aspose.slides.internal.p191it.AbstractC5120du
    /* JADX INFO: renamed from: du */
    public void mo16615du(C5061vw c5061vw, C4201h4 c4201h4) {
        AbstractC12024x1 abstractC12024x1M16679c5;
        C5075y2 c5075y2 = (C5075y2) c5061vw;
        C12014ne c12014neClone = c5075y2.m21636k4().m58249dy().Clone();
        C12018u4 c12018u4M56768x1 = c4201h4.m16744s7().m56768x1();
        c12018u4M56768x1.m56773x1(c12014neClone.Clone());
        if (mo16633k4(c12018u4M56768x1, c4201h4) || (abstractC12024x1M16679c5 = c4201h4.m16679c5()) == null) {
            return;
        }
        mo16632k4(abstractC12024x1M16679c5, c5075y2.m21641x1().m7984kk(), c4201h4);
    }

    @Override // com.aspose.slides.internal.p191it.AbstractC5120du
    /* JADX INFO: renamed from: h4 */
    public boolean mo16667h4(C5061vw c5061vw, C4201h4 c4201h4) {
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo16632k4(AbstractC12024x1 abstractC12024x1, C12018u4 c12018u4, C4201h4 c4201h4);

    /* JADX INFO: renamed from: k4 */
    public abstract boolean mo16633k4(C12018u4 c12018u4, C4201h4 c4201h4);
}
