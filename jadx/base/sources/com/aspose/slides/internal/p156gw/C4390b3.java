package com.aspose.slides.internal.p156gw;

import com.aspose.slides.internal.p156gw.InterfaceC4413v4;
import com.aspose.slides.internal.p472w8.C11913yj;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.aspose.slides.internal.gw.b3 */
/* JADX INFO: loaded from: classes.dex */
class C4390b3 implements InterfaceC4413v4 {

    /* JADX INFO: renamed from: du */
    C11913yj f11960du;

    /* JADX INFO: renamed from: h4 */
    int f11961h4;

    /* JADX INFO: renamed from: k4 */
    double f11962k4;

    /* JADX INFO: renamed from: kk */
    double f11963kk;

    /* JADX INFO: renamed from: to */
    double f11964to;

    /* JADX INFO: renamed from: x1 */
    double f11965x1;

    public C4390b3(AbstractC4415wy abstractC4415wy, C11913yj c11913yj) {
        this.f11962k4 = abstractC4415wy.mo17784h4();
        this.f11965x1 = abstractC4415wy.mo17787m9();
        this.f11963kk = abstractC4415wy.mo17781c5();
        double dMo17785jd = abstractC4415wy.mo17785jd();
        this.f11964to = dMo17785jd;
        this.f11960du = c11913yj;
        if (this.f11963kk < 0.0d || dMo17785jd < 0.0d) {
            this.f11961h4 = 6;
        }
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: k4 */
    public int mo17817k4(double[] dArr) {
        if (mo17821x1()) {
            throw new NoSuchElementException("rect iterator out of bounds");
        }
        int i = this.f11961h4;
        if (i == 5) {
            return 4;
        }
        double d = this.f11962k4;
        dArr[0] = d;
        double d2 = this.f11965x1;
        dArr[1] = d2;
        if (i == 1 || i == 2) {
            dArr[0] = d + this.f11963kk;
        }
        if (i == 2 || i == 3) {
            dArr[1] = d2 + this.f11964to;
        }
        C11913yj c11913yj = this.f11960du;
        if (c11913yj != null) {
            c11913yj.m55770k4(dArr, 0, dArr, 0, 1);
        }
        return this.f11961h4 == 0 ? 0 : 1;
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: kk */
    public void mo17820kk() {
        this.f11961h4++;
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: x1 */
    public boolean mo17821x1() {
        return this.f11961h4 > 5;
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: k4 */
    public int mo17818k4(float[] fArr) {
        if (mo17821x1()) {
            throw new NoSuchElementException("rect iterator out of bounds");
        }
        int i = this.f11961h4;
        if (i == 5) {
            return 4;
        }
        float f = (float) this.f11962k4;
        fArr[0] = f;
        float f2 = (float) this.f11965x1;
        fArr[1] = f2;
        if (i == 1 || i == 2) {
            fArr[0] = f + ((float) this.f11963kk);
        }
        if (i == 2 || i == 3) {
            fArr[1] = f2 + ((float) this.f11964to);
        }
        C11913yj c11913yj = this.f11960du;
        if (c11913yj != null) {
            c11913yj.m55773k4(fArr, 0, fArr, 0, 1);
        }
        return this.f11961h4 == 0 ? 0 : 1;
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: k4 */
    public InterfaceC4413v4.k4 mo17819k4() {
        return InterfaceC4413v4.k4.WIND_NON_ZERO;
    }
}
