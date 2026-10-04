package com.aspose.slides.internal.p119f0;

import com.aspose.slides.internal.p353q7.AbstractC9768f9;
import com.aspose.slides.internal.p353q7.C9757ar;
import com.aspose.slides.internal.p353q7.C9777kp;
import com.aspose.slides.internal.p353q7.C9792um;
import com.aspose.slides.internal.p353q7.C9797wp;
import com.aspose.slides.internal.p353q7.C9799x1;
import com.aspose.slides.internal.p505xn.C12564kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.f0.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C3841x1 extends C3837h4 {

    /* JADX INFO: renamed from: k4 */
    private k4[] f10477k4;

    /* JADX INFO: renamed from: com.aspose.slides.internal.f0.x1$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        public long f10478k4;

        /* JADX INFO: renamed from: kk */
        public long f10479kk;

        /* JADX INFO: renamed from: x1 */
        public long f10480x1;

        private k4() {
        }
    }

    public C3841x1(int i, int i2, AbstractC9768f9 abstractC9768f9) {
        super(i, i2, abstractC9768f9);
    }

    @Override // com.aspose.slides.internal.p119f0.C3837h4
    /* JADX INFO: renamed from: k4 */
    public int mo15360k4(int i) {
        int i2 = 0;
        while (true) {
            k4[] k4VarArr = this.f10477k4;
            if (i2 >= k4VarArr.length) {
                break;
            }
            long j = i;
            k4 k4Var = k4VarArr[i2];
            long j2 = k4Var.f10478k4;
            if (j >= (j2 & 4294967295L) && j <= (k4Var.f10480x1 & 4294967295L)) {
                return (int) ((((k4Var.f10479kk & 4294967295L) + j) & 4294967295L) - (j2 & 4294967295L));
            }
            if (j < (k4Var.f10480x1 & 4294967295L) && j < (j2 & 4294967295L)) {
                break;
            }
            i2++;
        }
        return 0;
    }

    @Override // com.aspose.slides.internal.p119f0.C3837h4
    /* JADX INFO: renamed from: k4 */
    public C9777kp mo15361k4(C9792um c9792um) {
        C9777kp c9777kp = new C9777kp(((C9799x1) m15367to()).m48299kk());
        int i = 0;
        while (true) {
            k4[] k4VarArr = this.f10477k4;
            if (i >= k4VarArr.length) {
                return c9777kp;
            }
            long j = k4VarArr[i].f10478k4;
            while (true) {
                long j2 = j & 4294967295L;
                k4 k4Var = this.f10477k4[i];
                if (j2 <= (k4Var.f10480x1 & 4294967295L)) {
                    int i2 = (int) ((((k4Var.f10479kk & 4294967295L) + j2) & 4294967295L) - (4294967295L & k4Var.f10478k4));
                    C9757ar c9757arClone = c9792um.m48252k4(i2).Clone();
                    C9797wp c9797wp = new C9797wp((int) j, i2, c9757arClone.f35245k4 & 65535, c9757arClone.f35246x1);
                    c9777kp.m48103k4(c9797wp);
                    if (c9797wp.m48287x1() == 0) {
                        c9777kp.m48108x1(c9797wp);
                    }
                    j++;
                }
            }
            i++;
        }
    }

    @Override // com.aspose.slides.internal.p119f0.C3837h4
    /* JADX INFO: renamed from: k4 */
    public void mo15362k4(C12564kk c12564kk) {
        c12564kk.m58604kk();
        c12564kk.m58604kk();
        long jM58604kk = c12564kk.m58604kk();
        this.f10477k4 = new k4[(int) jM58604kk];
        for (int i = 0; i < (4294967295L & jM58604kk); i++) {
            this.f10477k4[i] = new k4();
            this.f10477k4[i].f10478k4 = c12564kk.m58604kk();
            this.f10477k4[i].f10480x1 = c12564kk.m58604kk();
            this.f10477k4[i].f10479kk = c12564kk.m58604kk();
        }
        super.mo15362k4(c12564kk);
    }
}
