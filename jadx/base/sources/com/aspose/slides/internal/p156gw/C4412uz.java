package com.aspose.slides.internal.p156gw;

import com.aspose.slides.internal.p156gw.InterfaceC4413v4;
import com.aspose.slides.internal.p472w8.C11913yj;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.aspose.slides.internal.gw.uz */
/* JADX INFO: loaded from: classes.dex */
class C4412uz implements InterfaceC4413v4 {

    /* JADX INFO: renamed from: k4 */
    AbstractC4409u4 f12112k4;

    /* JADX INFO: renamed from: kk */
    int f12113kk;

    /* JADX INFO: renamed from: x1 */
    C11913yj f12114x1;

    public C4412uz(AbstractC4409u4 abstractC4409u4, C11913yj c11913yj) {
        this.f12112k4 = abstractC4409u4;
        this.f12114x1 = c11913yj;
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: k4 */
    public int mo17817k4(double[] dArr) {
        if (mo17821x1()) {
            throw new NoSuchElementException("line iterator out of bounds");
        }
        int i = 1;
        if (this.f12113kk == 0) {
            dArr[0] = this.f12112k4.mo17986k4();
            dArr[1] = this.f12112k4.mo17990x1();
            i = 0;
        } else {
            dArr[0] = this.f12112k4.mo17988kk();
            dArr[1] = this.f12112k4.mo17989to();
        }
        C11913yj c11913yj = this.f12114x1;
        if (c11913yj != null) {
            c11913yj.m55770k4(dArr, 0, dArr, 0, 1);
        }
        return i;
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: kk */
    public void mo17820kk() {
        this.f12113kk++;
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: x1 */
    public boolean mo17821x1() {
        return this.f12113kk > 1;
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: k4 */
    public int mo17818k4(float[] fArr) {
        if (mo17821x1()) {
            throw new NoSuchElementException("line iterator out of bounds");
        }
        int i = 1;
        if (this.f12113kk == 0) {
            fArr[0] = (float) this.f12112k4.mo17986k4();
            fArr[1] = (float) this.f12112k4.mo17990x1();
            i = 0;
        } else {
            fArr[0] = (float) this.f12112k4.mo17988kk();
            fArr[1] = (float) this.f12112k4.mo17989to();
        }
        C11913yj c11913yj = this.f12114x1;
        if (c11913yj != null) {
            c11913yj.m55773k4(fArr, 0, fArr, 0, 1);
        }
        return i;
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: k4 */
    public InterfaceC4413v4.k4 mo17819k4() {
        return InterfaceC4413v4.k4.WIND_NON_ZERO;
    }
}
