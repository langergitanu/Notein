package com.aspose.slides.internal.p156gw;

import com.aspose.slides.internal.p156gw.InterfaceC4413v4;
import com.aspose.slides.internal.p472w8.C11913yj;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.aspose.slides.internal.gw.yd */
/* JADX INFO: loaded from: classes.dex */
class C4418yd implements InterfaceC4413v4 {

    /* JADX INFO: renamed from: k4 */
    AbstractC4403lr f12135k4;

    /* JADX INFO: renamed from: kk */
    int f12136kk;

    /* JADX INFO: renamed from: x1 */
    C11913yj f12137x1;

    public C4418yd(AbstractC4403lr abstractC4403lr, C11913yj c11913yj) {
        this.f12135k4 = abstractC4403lr;
        this.f12137x1 = c11913yj;
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: k4 */
    public int mo17817k4(double[] dArr) {
        if (mo17821x1()) {
            throw new NoSuchElementException("quad iterator iterator out of bounds");
        }
        int i = 0;
        if (this.f12136kk == 0) {
            dArr[0] = this.f12135k4.m17958k4();
            dArr[1] = this.f12135k4.m17961x1();
        } else {
            dArr[0] = this.f12135k4.m17959kk();
            dArr[1] = this.f12135k4.m17960to();
            dArr[2] = this.f12135k4.m17956du();
            dArr[3] = this.f12135k4.m17957h4();
            i = 2;
        }
        C11913yj c11913yj = this.f12137x1;
        if (c11913yj != null) {
            c11913yj.m55770k4(dArr, 0, dArr, 0, this.f12136kk == 0 ? 1 : 2);
        }
        return i;
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: kk */
    public void mo17820kk() {
        this.f12136kk++;
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: x1 */
    public boolean mo17821x1() {
        return this.f12136kk > 1;
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: k4 */
    public int mo17818k4(float[] fArr) {
        if (mo17821x1()) {
            throw new NoSuchElementException("quad iterator iterator out of bounds");
        }
        int i = 0;
        if (this.f12136kk == 0) {
            fArr[0] = (float) this.f12135k4.m17958k4();
            fArr[1] = (float) this.f12135k4.m17961x1();
        } else {
            fArr[0] = (float) this.f12135k4.m17959kk();
            fArr[1] = (float) this.f12135k4.m17960to();
            fArr[2] = (float) this.f12135k4.m17956du();
            fArr[3] = (float) this.f12135k4.m17957h4();
            i = 2;
        }
        C11913yj c11913yj = this.f12137x1;
        if (c11913yj != null) {
            c11913yj.m55773k4(fArr, 0, fArr, 0, this.f12136kk == 0 ? 1 : 2);
        }
        return i;
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: k4 */
    public InterfaceC4413v4.k4 mo17819k4() {
        return InterfaceC4413v4.k4.WIND_NON_ZERO;
    }
}
