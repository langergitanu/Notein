package com.aspose.slides.internal.p037b9;

import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p183ij.C4987ga;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p191it.AbstractC5125k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.b9.dy */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1668dy extends AbstractC5125k4 {
    @Override // com.aspose.slides.internal.p191it.AbstractC5125k4
    /* JADX INFO: renamed from: du */
    public void mo9056du(C5061vw c5061vw, C4201h4 c4201h4) {
        mo9061k4((C4987ga) c5061vw, c4201h4);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12014ne m9060k4(int i, int i2, int i3, int i4) {
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
    public abstract void mo9061k4(C4987ga c4987ga, C4201h4 c4201h4);
}
