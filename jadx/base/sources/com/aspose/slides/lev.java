package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p472w8.C11902kk;
import com.aspose.slides.internal.p472w8.C11909up;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12023wl;

/* JADX INFO: loaded from: classes3.dex */
class lev implements InterfaceC1225hv {

    /* JADX INFO: renamed from: du */
    private C12014ne f45977du;

    /* JADX INFO: renamed from: h4 */
    private final C11909up f45978h4;

    /* JADX INFO: renamed from: k4 */
    public final boolean f45979k4;

    /* JADX INFO: renamed from: kk */
    private final C11902kk f45980kk;

    /* JADX INFO: renamed from: to */
    private final C11902kk f45981to;

    /* JADX INFO: renamed from: x1 */
    private final float[] f45982x1;

    public lev(C12023wl c12023wl, boolean z, int i, boolean z2) {
        this.f45977du = new C12014ne();
        this.f45979k4 = z;
        C12003du c12003duClone = C12003du.m56460uz().Clone();
        C12003du c12003duClone2 = C12003du.m56385i5().Clone();
        if (z2) {
            C12003du[] c12003duArr = {c12003duClone};
            C12003du[] c12003duArr2 = {c12003duClone2};
            C3085sv.m13086k4(c12003duArr, c12003duArr2);
            c12003duArr[0].CloneTo(c12003duClone);
            c12003duArr2[0].CloneTo(c12003duClone2);
        }
        C12003du[] c12003duArr3 = new C12003du[7];
        if (z) {
            c12003duArr3[0] = c12003duClone;
            c12003duArr3[1] = c12003duClone;
            c12003duArr3[2] = c12003duClone2;
            c12003duArr3[3] = c12003duClone2;
            c12003duArr3[4] = c12003duClone2;
            c12003duArr3[5] = c12003duClone;
            c12003duArr3[6] = c12003duClone;
        } else {
            c12003duArr3[0] = c12003duClone2;
            c12003duArr3[1] = c12003duClone2;
            c12003duArr3[2] = c12003duClone;
            c12003duArr3[3] = c12003duClone;
            c12003duArr3[4] = c12003duClone;
            c12003duArr3[5] = c12003duClone2;
            c12003duArr3[6] = c12003duClone2;
        }
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.5f, 1.0f, 1.0f, 1.0f};
        this.f45982x1 = fArr;
        m64385k4(z, 0.0f, fArr);
        C11902kk c11902kk = new C11902kk(4);
        this.f45980kk = c11902kk;
        c11902kk.m55667k4(c12003duArr3);
        c11902kk.m55666k4(fArr);
        C11902kk c11902kk2 = new C11902kk(4);
        this.f45981to = c11902kk2;
        c11902kk2.m55667k4(c12003duArr3);
        c11902kk2.m55666k4(fArr);
        C12014ne c12014ne = new C12014ne(0, 0, c12023wl.m56865x1(), c12023wl.m56862kk());
        this.f45977du = c12014ne;
        this.f45978h4 = C11909up.m55708k4(c12014ne, c12003duClone, c12003duClone2, i);
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        this.f45978h4.dispose();
    }

    @Override // com.aspose.slides.fsr
    /* JADX INFO: renamed from: k4 */
    public final void mo3090k4(float f, AbstractC12008jd abstractC12008jd) {
        m64385k4(this.f45979k4, f, this.f45982x1);
        this.f45978h4.m55726k4(this.f45981to);
        this.f45978h4.m55726k4(this.f45980kk);
        abstractC12008jd.mo17594x1(this.f45978h4, this.f45977du.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private static void m64385k4(boolean z, float f, float[] fArr) {
        if (!z) {
            f = 1.0f - f;
        }
        float f2 = 1.0f - f;
        float f3 = f2 * 0.5f;
        float f4 = (1.0f + f) * 0.5f;
        fArr[1] = f3 * f2;
        fArr[2] = f3;
        fArr[4] = f4;
        fArr[5] = (f2 * f4) + f;
    }
}
