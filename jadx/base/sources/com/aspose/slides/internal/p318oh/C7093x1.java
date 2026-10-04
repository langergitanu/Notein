package com.aspose.slides.internal.p318oh;

import com.aspose.slides.internal.p026an.C1476dq;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p539z4.AbstractC13373f9;
import com.aspose.slides.internal.p539z4.C13379h4;
import com.aspose.slides.internal.p539z4.C13394m9;
import com.aspose.slides.internal.p539z4.C13406t6;

/* JADX INFO: renamed from: com.aspose.slides.internal.oh.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C7093x1 extends AbstractC7052e0 {

    /* JADX INFO: renamed from: k4 */
    private final C13379h4 f19220k4;

    public C7093x1(C13379h4 c13379h4) {
        this.f19220k4 = c13379h4;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC13373f9 m27614k4(C3134k4 c3134k4) {
        C13394m9 c13394m9 = new C13394m9();
        if (C1476dq.m8297x1(this.f19220k4.m62119du())) {
            c13394m9.m62230k4((C13406t6) new C7045bz().m27567k4(c3134k4));
        }
        int iM62118c5 = (this.f19220k4.m62118c5() * C1476dq.m8296k4(this.f19220k4.m62119du())) / 8;
        int iM62127m9 = this.f19220k4.m62127m9() - iM62118c5;
        int iM62128to = this.f19220k4.m62128to();
        byte[][] bArr = new byte[iM62128to][];
        for (int i = 0; i < iM62128to; i++) {
            bArr[i] = c3134k4.m13372dy(iM62118c5);
            c3134k4.m13371ck().seek(iM62127m9, 1);
        }
        c13394m9.m62231k4(bArr);
        return c13394m9;
    }
}
