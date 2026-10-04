package com.aspose.slides.internal.p292n5;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p251li.C6045bz;
import com.aspose.slides.internal.p280ms.C6490k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.n5.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6741k4 {

    /* JADX INFO: renamed from: k4 */
    private final AbstractC3150x6 f18579k4;

    public C6741k4(AbstractC3150x6 abstractC3150x6) {
        this.f18579k4 = abstractC3150x6;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m26600k4(C6045bz[] c6045bzArr) {
        for (C6045bz c6045bz : c6045bzArr) {
            long position = this.f18579k4.getPosition();
            AbstractC6744x1.m26609k4(c6045bz, this.f18579k4);
            C6742kk.m26601k4(c6045bz.m24450x6()).mo9558x1(c6045bz, this.f18579k4);
            int iMo24441m9 = c6045bz.mo24441m9() - ((int) (this.f18579k4.getPosition() - position));
            if (iMo24441m9 > 0) {
                this.f18579k4.seek(iMo24441m9, 1);
            } else if (iMo24441m9 < 0) {
                throw new C6490k4("Writed more bytes than the record size.");
            }
        }
    }
}
