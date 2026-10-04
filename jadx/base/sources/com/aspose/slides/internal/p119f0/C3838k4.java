package com.aspose.slides.internal.p119f0;

import com.aspose.slides.internal.p353q7.AbstractC9768f9;
import com.aspose.slides.internal.p353q7.C9757ar;
import com.aspose.slides.internal.p353q7.C9777kp;
import com.aspose.slides.internal.p353q7.C9792um;
import com.aspose.slides.internal.p353q7.C9797wp;
import com.aspose.slides.internal.p353q7.C9799x1;
import com.aspose.slides.internal.p505xn.C12564kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.f0.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C3838k4 extends C3837h4 {

    /* JADX INFO: renamed from: k4 */
    private int[] f10454k4;

    /* JADX INFO: renamed from: kk */
    private long f10455kk;

    /* JADX INFO: renamed from: x1 */
    private long f10456x1;

    public C3838k4(int i, int i2, AbstractC9768f9 abstractC9768f9) {
        super(i, i2, abstractC9768f9);
    }

    @Override // com.aspose.slides.internal.p119f0.C3837h4
    /* JADX INFO: renamed from: k4 */
    public int mo15360k4(int i) {
        long j = i;
        long j2 = this.f10456x1;
        if (j < (j2 & 4294967295L) || j >= (((j2 & 4294967295L) + (this.f10455kk & 4294967295L)) & 4294967295L)) {
            return 0;
        }
        return this.f10454k4[(int) ((j - (j2 & 4294967295L)) & 4294967295L)] & 65535;
    }

    @Override // com.aspose.slides.internal.p119f0.C3837h4
    /* JADX INFO: renamed from: k4 */
    public C9777kp mo15361k4(C9792um c9792um) {
        C9777kp c9777kp = new C9777kp(((C9799x1) m15367to()).m48299kk());
        int i = (int) this.f10456x1;
        while (true) {
            char c = (char) i;
            if (c > (((this.f10456x1 & 4294967295L) + (this.f10455kk & 4294967295L)) & 4294967295L)) {
                return c9777kp;
            }
            int iMo15360k4 = mo15360k4(c);
            if (iMo15360k4 != 0) {
                C9757ar c9757arClone = c9792um.m48252k4(iMo15360k4).Clone();
                C9797wp c9797wp = new C9797wp(c, iMo15360k4, c9757arClone.f35245k4 & 65535, c9757arClone.f35246x1);
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
        c12564kk.m58604kk();
        c12564kk.m58604kk();
        this.f10456x1 = c12564kk.m58604kk();
        long jM58604kk = c12564kk.m58604kk();
        this.f10455kk = jM58604kk;
        this.f10454k4 = new int[(int) (jM58604kk & 4294967295L)];
        for (int i = 0; i < (this.f10455kk & 4294967295L); i++) {
            this.f10454k4[i] = c12564kk.m58600du();
        }
        super.mo15362k4(c12564kk);
    }
}
