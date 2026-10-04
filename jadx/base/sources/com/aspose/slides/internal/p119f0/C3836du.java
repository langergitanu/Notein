package com.aspose.slides.internal.p119f0;

import com.aspose.slides.internal.p353q7.AbstractC9768f9;
import com.aspose.slides.internal.p353q7.C9757ar;
import com.aspose.slides.internal.p353q7.C9777kp;
import com.aspose.slides.internal.p353q7.C9792um;
import com.aspose.slides.internal.p353q7.C9797wp;
import com.aspose.slides.internal.p353q7.C9799x1;
import com.aspose.slides.internal.p505xn.C12564kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.f0.du */
/* JADX INFO: loaded from: classes.dex */
public class C3836du extends C3837h4 {

    /* JADX INFO: renamed from: k4 */
    private int f10448k4;

    /* JADX INFO: renamed from: kk */
    private int[] f10449kk;

    /* JADX INFO: renamed from: x1 */
    private int f10450x1;

    public C3836du(int i, int i2, AbstractC9768f9 abstractC9768f9) {
        super(i, i2, abstractC9768f9);
    }

    @Override // com.aspose.slides.internal.p119f0.C3837h4
    /* JADX INFO: renamed from: k4 */
    public int mo15360k4(int i) {
        int i2 = this.f10448k4;
        if (i < (i2 & 65535) || i >= (i2 & 65535) + (this.f10450x1 & 65535)) {
            return 0;
        }
        return this.f10449kk[i - (i2 & 65535)] & 65535;
    }

    @Override // com.aspose.slides.internal.p119f0.C3837h4
    /* JADX INFO: renamed from: k4 */
    public C9777kp mo15361k4(C9792um c9792um) {
        C9777kp c9777kp = new C9777kp(((C9799x1) m15367to()).m48299kk());
        int i = this.f10448k4;
        while (true) {
            char c = (char) i;
            if (c > (this.f10448k4 & 65535) + (this.f10450x1 & 65535)) {
                return c9777kp;
            }
            int iMo15360k4 = mo15360k4(c);
            if (iMo15360k4 != 0) {
                C9757ar c9757arClone = c9792um.m48252k4(iMo15360k4).Clone();
                C9797wp c9797wp = new C9797wp(c, iMo15360k4, 65535 & c9757arClone.f35245k4, c9757arClone.f35246x1);
                c9777kp.m48103k4(c9797wp);
                if (c9797wp.m48287x1() == 0) {
                    c9777kp.m48108x1(c9797wp);
                }
            }
            i = c + 1;
        }
    }

    @Override // com.aspose.slides.internal.p119f0.C3837h4
    /* JADX INFO: renamed from: k4 */
    public void mo15362k4(C12564kk c12564kk) {
        c12564kk.m58600du();
        c12564kk.m58600du();
        this.f10448k4 = c12564kk.m58600du();
        int iM58600du = c12564kk.m58600du();
        this.f10450x1 = iM58600du;
        this.f10449kk = new int[iM58600du & 65535];
        for (int i = 0; i < (this.f10450x1 & 65535); i++) {
            this.f10449kk[i] = c12564kk.m58600du();
        }
        super.mo15362k4(c12564kk);
    }
}
