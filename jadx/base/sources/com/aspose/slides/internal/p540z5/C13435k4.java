package com.aspose.slides.internal.p540z5;

import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p135fp.C4091dy;
import com.aspose.slides.internal.p135fp.C4102rv;
import com.aspose.slides.internal.p291n4.C6739k4;
import com.aspose.slides.internal.p291n4.C6740x1;
import com.aspose.slides.internal.p299ni.InterfaceC6906k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.C13590ak;

/* JADX INFO: renamed from: com.aspose.slides.internal.z5.k4 */
/* JADX INFO: loaded from: classes5.dex */
public class C13435k4 {

    /* JADX INFO: renamed from: du */
    private int f44951du;

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC6906k4 f44952k4;

    /* JADX INFO: renamed from: kk */
    private final int f44953kk;

    /* JADX INFO: renamed from: to */
    private final int f44954to;

    /* JADX INFO: renamed from: x1 */
    private final C4102rv f44955x1;

    public C13435k4(int i, int i2, InterfaceC6906k4 interfaceC6906k4, C6740x1 c6740x1) {
        this.f44954to = i;
        this.f44953kk = i2;
        this.f44952k4 = interfaceC6906k4;
        this.f44951du = i2 * i;
        C6739k4 c6739k4 = new C6739k4();
        c6739k4.m26526k4(C13590ak.m62705k4(c6740x1.m26568jd()));
        C4102rv c4102rv = new C4102rv(c6739k4, i, i2);
        this.f44955x1 = c4102rv;
        c4102rv.m16383k4(new C4091dy());
    }

    /* JADX INFO: renamed from: k4 */
    public void m62520k4(int[] iArr, C12014ne c12014ne) {
        this.f44955x1.m62810kk(c12014ne.Clone(), iArr);
        int iM56683x1 = this.f44951du - (c12014ne.m56683x1() * c12014ne.m56663c5());
        this.f44951du = iM56683x1;
        if (iM56683x1 == 0) {
            C3152yj c3152yj = new C3152yj();
            try {
                this.f44955x1.m62728k4(c3152yj);
                byte[] array = c3152yj.toArray();
                this.f44952k4.mo27041k4(array, array.length);
                this.f44952k4.mo27038k4(this.f44953kk);
            } finally {
                c3152yj.dispose();
            }
        }
    }
}
