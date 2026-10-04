package com.aspose.slides.internal.p062cf;

import com.aspose.slides.internal.p347px.AbstractC9576ak;
import com.aspose.slides.internal.p347px.C9578b3;
import com.aspose.slides.internal.p347px.C9601uz;
import com.aspose.slides.internal.p347px.C9603wl;
import com.aspose.slides.internal.p347px.C9604wy;
import com.aspose.slides.internal.p347px.C9605x1;
import com.aspose.slides.internal.p437u9.C11296k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.cf.k4 */
/* JADX INFO: loaded from: classes3.dex */
public class C2422k4 extends C2421h4 {

    /* JADX INFO: renamed from: k4 */
    private int[] f8380k4;

    /* JADX INFO: renamed from: kk */
    private long f8381kk;

    /* JADX INFO: renamed from: x1 */
    private long f8382x1;

    public C2422k4(int i, int i2, AbstractC9576ak abstractC9576ak) {
        super(i, i2, abstractC9576ak);
    }

    @Override // com.aspose.slides.internal.p062cf.C2421h4
    /* JADX INFO: renamed from: k4 */
    public int mo11841k4(int i) {
        long j = i;
        long j2 = this.f8382x1;
        if (j < (j2 & 4294967295L) || j >= (((j2 & 4294967295L) + (this.f8381kk & 4294967295L)) & 4294967295L)) {
            return 0;
        }
        return this.f8380k4[(int) ((j - (j2 & 4294967295L)) & 4294967295L)] & 65535;
    }

    @Override // com.aspose.slides.internal.p062cf.C2421h4
    /* JADX INFO: renamed from: k4 */
    public C9604wy mo11842k4(C9603wl c9603wl) {
        C9604wy c9604wy = new C9604wy(((C9605x1) m11844k4()).m46916kk());
        int i = (int) this.f8382x1;
        while (true) {
            char c = (char) i;
            if (c > (((this.f8382x1 & 4294967295L) + (this.f8381kk & 4294967295L)) & 4294967295L)) {
                return c9604wy;
            }
            int iMo11841k4 = mo11841k4(c);
            if (iMo11841k4 != 0) {
                C9601uz c9601uzClone = c9603wl.m46903k4(iMo11841k4).Clone();
                C9578b3 c9578b3 = new C9578b3(c, iMo11841k4, c9601uzClone.f34734k4 & 65535, c9601uzClone.f34735x1);
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
        c11296k4.m54278kk();
        c11296k4.m54278kk();
        this.f8382x1 = c11296k4.m54278kk();
        long jM54278kk = c11296k4.m54278kk();
        this.f8381kk = jM54278kk;
        this.f8380k4 = new int[(int) (jM54278kk & 4294967295L)];
        for (int i = 0; i < (this.f8381kk & 4294967295L); i++) {
            this.f8380k4[i] = c11296k4.m54274du();
        }
        super.mo11843k4(c11296k4);
    }
}
