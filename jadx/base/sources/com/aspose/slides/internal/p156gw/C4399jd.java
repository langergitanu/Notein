package com.aspose.slides.internal.p156gw;

import com.aspose.slides.internal.p156gw.InterfaceC4413v4;
import com.aspose.slides.internal.p472w8.C11913yj;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.aspose.slides.internal.gw.jd */
/* JADX INFO: loaded from: classes.dex */
class C4399jd implements InterfaceC4413v4 {

    /* JADX INFO: renamed from: k4 */
    AbstractC4392c5 f12019k4;

    /* JADX INFO: renamed from: kk */
    int f12020kk;

    /* JADX INFO: renamed from: x1 */
    C11913yj f12021x1;

    public C4399jd(AbstractC4392c5 abstractC4392c5, C11913yj c11913yj) {
        this.f12019k4 = abstractC4392c5;
        this.f12021x1 = c11913yj;
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: k4 */
    public int mo17817k4(double[] dArr) {
        if (mo17821x1()) {
            throw new NoSuchElementException("cubic iterator iterator out of bounds");
        }
        int i = 0;
        if (this.f12020kk == 0) {
            dArr[0] = this.f12019k4.mo17853k4();
            dArr[1] = this.f12019k4.mo17857x1();
        } else {
            dArr[0] = this.f12019k4.mo17854kk();
            dArr[1] = this.f12019k4.mo17856to();
            dArr[2] = this.f12019k4.mo17851du();
            dArr[3] = this.f12019k4.mo17852h4();
            dArr[4] = this.f12019k4.mo17855m9();
            dArr[5] = this.f12019k4.mo17850c5();
            i = 3;
        }
        C11913yj c11913yj = this.f12021x1;
        if (c11913yj != null) {
            c11913yj.m55770k4(dArr, 0, dArr, 0, this.f12020kk == 0 ? 1 : 3);
        }
        return i;
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: kk */
    public void mo17820kk() {
        this.f12020kk++;
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: x1 */
    public boolean mo17821x1() {
        return this.f12020kk > 1;
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: k4 */
    public int mo17818k4(float[] fArr) {
        if (mo17821x1()) {
            throw new NoSuchElementException("cubic iterator iterator out of bounds");
        }
        int i = 0;
        if (this.f12020kk == 0) {
            fArr[0] = (float) this.f12019k4.mo17853k4();
            fArr[1] = (float) this.f12019k4.mo17857x1();
        } else {
            fArr[0] = (float) this.f12019k4.mo17854kk();
            fArr[1] = (float) this.f12019k4.mo17856to();
            fArr[2] = (float) this.f12019k4.mo17851du();
            fArr[3] = (float) this.f12019k4.mo17852h4();
            fArr[4] = (float) this.f12019k4.mo17855m9();
            fArr[5] = (float) this.f12019k4.mo17850c5();
            i = 3;
        }
        C11913yj c11913yj = this.f12021x1;
        if (c11913yj != null) {
            c11913yj.m55773k4(fArr, 0, fArr, 0, this.f12020kk == 0 ? 1 : 3);
        }
        return i;
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: k4 */
    public InterfaceC4413v4.k4 mo17819k4() {
        return InterfaceC4413v4.k4.WIND_NON_ZERO;
    }
}
