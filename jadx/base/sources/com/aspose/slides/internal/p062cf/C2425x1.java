package com.aspose.slides.internal.p062cf;

import com.aspose.slides.internal.p347px.AbstractC9576ak;
import com.aspose.slides.internal.p347px.C9578b3;
import com.aspose.slides.internal.p347px.C9601uz;
import com.aspose.slides.internal.p347px.C9603wl;
import com.aspose.slides.internal.p347px.C9604wy;
import com.aspose.slides.internal.p347px.C9605x1;
import com.aspose.slides.internal.p437u9.C11296k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.cf.x1 */
/* JADX INFO: loaded from: classes3.dex */
public class C2425x1 extends C2421h4 {

    /* JADX INFO: renamed from: k4 */
    private k4[] f8403k4;

    /* JADX INFO: renamed from: com.aspose.slides.internal.cf.x1$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        public long f8404k4;

        /* JADX INFO: renamed from: kk */
        public long f8405kk;

        /* JADX INFO: renamed from: x1 */
        public long f8406x1;

        private k4() {
        }
    }

    public C2425x1(int i, int i2, AbstractC9576ak abstractC9576ak) {
        super(i, i2, abstractC9576ak);
    }

    @Override // com.aspose.slides.internal.p062cf.C2421h4
    /* JADX INFO: renamed from: k4 */
    public int mo11841k4(int i) {
        int i2 = 0;
        while (true) {
            k4[] k4VarArr = this.f8403k4;
            if (i2 >= k4VarArr.length) {
                break;
            }
            long j = i;
            k4 k4Var = k4VarArr[i2];
            long j2 = k4Var.f8404k4;
            if (j >= (j2 & 4294967295L) && j <= (k4Var.f8406x1 & 4294967295L)) {
                return (int) ((((k4Var.f8405kk & 4294967295L) + j) & 4294967295L) - (j2 & 4294967295L));
            }
            if (j < (k4Var.f8406x1 & 4294967295L) && j < (j2 & 4294967295L)) {
                break;
            }
            i2++;
        }
        return 0;
    }

    @Override // com.aspose.slides.internal.p062cf.C2421h4
    /* JADX INFO: renamed from: k4 */
    public C9604wy mo11842k4(C9603wl c9603wl) {
        C9604wy c9604wy = new C9604wy(((C9605x1) m11844k4()).m46916kk());
        int i = 0;
        while (true) {
            k4[] k4VarArr = this.f8403k4;
            if (i >= k4VarArr.length) {
                return c9604wy;
            }
            long j = k4VarArr[i].f8404k4;
            while (true) {
                long j2 = j & 4294967295L;
                k4 k4Var = this.f8403k4[i];
                if (j2 <= (k4Var.f8406x1 & 4294967295L)) {
                    int i2 = (int) ((((k4Var.f8405kk & 4294967295L) + j2) & 4294967295L) - (4294967295L & k4Var.f8404k4));
                    C9601uz c9601uzClone = c9603wl.m46903k4(i2).Clone();
                    C9578b3 c9578b3 = new C9578b3((int) j, i2, c9601uzClone.f34734k4 & 65535, c9601uzClone.f34735x1);
                    c9604wy.m46908k4(c9578b3);
                    if (c9578b3.m46757x1() == 0) {
                        c9604wy.m46911x1(c9578b3);
                    }
                    j++;
                }
            }
            i++;
        }
    }

    @Override // com.aspose.slides.internal.p062cf.C2421h4
    /* JADX INFO: renamed from: k4 */
    public void mo11843k4(C11296k4 c11296k4) {
        c11296k4.m54278kk();
        c11296k4.m54278kk();
        long jM54278kk = c11296k4.m54278kk();
        this.f8403k4 = new k4[(int) jM54278kk];
        for (int i = 0; i < (4294967295L & jM54278kk); i++) {
            this.f8403k4[i] = new k4();
            this.f8403k4[i].f8404k4 = c11296k4.m54278kk();
            this.f8403k4[i].f8406x1 = c11296k4.m54278kk();
            this.f8403k4[i].f8405kk = c11296k4.m54278kk();
        }
        super.mo11843k4(c11296k4);
    }
}
