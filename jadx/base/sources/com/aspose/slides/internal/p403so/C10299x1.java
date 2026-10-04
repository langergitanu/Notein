package com.aspose.slides.internal.p403so;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p171hq.AbstractC4623f9;
import com.aspose.slides.internal.p171hq.C4629h4;
import com.aspose.slides.internal.p171hq.C4644m9;
import com.aspose.slides.internal.p171hq.C4656t6;
import com.aspose.slides.internal.p396sc.C10178dq;

/* JADX INFO: renamed from: com.aspose.slides.internal.so.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C10299x1 extends AbstractC10258e0 {

    /* JADX INFO: renamed from: k4 */
    private final C4629h4 f36723k4;

    public C10299x1(C4629h4 c4629h4) {
        this.f36723k4 = c4629h4;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC4623f9 m50253k4(C3134k4 c3134k4) {
        C4644m9 c4644m9 = new C4644m9();
        if (C10178dq.m50011x1(this.f36723k4.m19128m9())) {
            c4644m9.m19238k4((C4656t6) new C10251bz().m50206k4(c3134k4));
        }
        int iM19121jd = (this.f36723k4.m19121jd() * C10178dq.m50010k4(this.f36723k4.m19128m9())) / 8;
        int iM19120dy = this.f36723k4.m19120dy() - iM19121jd;
        int iM19119du = this.f36723k4.m19119du();
        byte[][] bArr = new byte[iM19119du][];
        for (int i = 0; i < iM19119du; i++) {
            bArr[i] = c3134k4.m13372dy(iM19121jd);
            c3134k4.m13371ck().seek(iM19120dy, 1);
        }
        c4644m9.m19239k4(bArr);
        return c4644m9;
    }
}
