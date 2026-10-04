package com.aspose.slides.internal.p062cf;

import com.aspose.slides.internal.p347px.AbstractC9576ak;
import com.aspose.slides.internal.p347px.C9578b3;
import com.aspose.slides.internal.p347px.C9601uz;
import com.aspose.slides.internal.p347px.C9603wl;
import com.aspose.slides.internal.p347px.C9604wy;
import com.aspose.slides.internal.p347px.C9605x1;
import com.aspose.slides.internal.p437u9.C11296k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.cf.du */
/* JADX INFO: loaded from: classes3.dex */
public class C2420du extends C2421h4 {

    /* JADX INFO: renamed from: k4 */
    private int f8374k4;

    /* JADX INFO: renamed from: kk */
    private int[] f8375kk;

    /* JADX INFO: renamed from: x1 */
    private int f8376x1;

    public C2420du(int i, int i2, AbstractC9576ak abstractC9576ak) {
        super(i, i2, abstractC9576ak);
    }

    @Override // com.aspose.slides.internal.p062cf.C2421h4
    /* JADX INFO: renamed from: k4 */
    public int mo11841k4(int i) {
        int i2 = this.f8374k4;
        if (i < (i2 & 65535) || i >= (i2 & 65535) + (this.f8376x1 & 65535)) {
            return 0;
        }
        return this.f8375kk[i - (i2 & 65535)] & 65535;
    }

    @Override // com.aspose.slides.internal.p062cf.C2421h4
    /* JADX INFO: renamed from: k4 */
    public C9604wy mo11842k4(C9603wl c9603wl) {
        C9604wy c9604wy = new C9604wy(((C9605x1) m11844k4()).m46916kk());
        int i = this.f8374k4;
        while (true) {
            char c = (char) i;
            if (c > (this.f8374k4 & 65535) + (this.f8376x1 & 65535)) {
                return c9604wy;
            }
            int iMo11841k4 = mo11841k4(c);
            if (iMo11841k4 != 0) {
                C9601uz c9601uzClone = c9603wl.m46903k4(iMo11841k4).Clone();
                C9578b3 c9578b3 = new C9578b3(c, iMo11841k4, 65535 & c9601uzClone.f34734k4, c9601uzClone.f34735x1);
                c9604wy.m46908k4(c9578b3);
                if (c9578b3.m46757x1() == 0) {
                    c9604wy.m46911x1(c9578b3);
                }
            }
            i = c + 1;
        }
    }

    @Override // com.aspose.slides.internal.p062cf.C2421h4
    /* JADX INFO: renamed from: k4 */
    public void mo11843k4(C11296k4 c11296k4) {
        c11296k4.m54274du();
        c11296k4.m54274du();
        this.f8374k4 = c11296k4.m54274du();
        int iM54274du = c11296k4.m54274du();
        this.f8376x1 = iM54274du;
        this.f8375kk = new int[iM54274du & 65535];
        for (int i = 0; i < (this.f8376x1 & 65535); i++) {
            this.f8375kk[i] = c11296k4.m54274du();
        }
        super.mo11843k4(c11296k4);
    }
}
