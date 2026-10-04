package com.aspose.slides.internal.p218k5;

import com.aspose.slides.internal.p040bg.AbstractC1697k4;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p349q3.C9649ga;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.k5.dy */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5610dy extends AbstractC1697k4 {
    public AbstractC5610dy(AbstractC5612k4 abstractC5612k4) {
        super(abstractC5612k4);
    }

    @Override // com.aspose.slides.internal.p040bg.AbstractC1697k4
    /* JADX INFO: renamed from: h4 */
    public void mo9143h4(C9723vw c9723vw, C3585h4 c3585h4) {
        mo12689k4((C9649ga) c9723vw, c3585h4);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12014ne m22996k4(int i, int i2, int i3, int i4) {
        if (i3 < 0) {
            i += i3;
            i3 = C14116yg.m67482k4(i3);
        }
        if (i4 < 0) {
            i2 += i4;
            i4 = C14116yg.m67482k4(i4);
        }
        return new C12014ne(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo12689k4(C9649ga c9649ga, C3585h4 c3585h4);
}
