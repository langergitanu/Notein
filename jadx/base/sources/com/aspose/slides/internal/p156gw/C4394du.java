package com.aspose.slides.internal.p156gw;

import com.aspose.slides.internal.p156gw.InterfaceC4413v4;
import com.aspose.slides.internal.p472w8.C11913yj;
import java.util.NoSuchElementException;
import java.util.Vector;

/* JADX INFO: renamed from: com.aspose.slides.internal.gw.du */
/* JADX INFO: loaded from: classes.dex */
class C4394du implements InterfaceC4413v4 {

    /* JADX INFO: renamed from: du */
    private AbstractC4393ck f11993du;

    /* JADX INFO: renamed from: k4 */
    private C11913yj f11994k4;

    /* JADX INFO: renamed from: kk */
    private int f11995kk;

    /* JADX INFO: renamed from: to */
    private AbstractC4393ck f11996to;

    /* JADX INFO: renamed from: x1 */
    private Vector f11997x1;

    public C4394du(Vector vector, C11913yj c11913yj) {
        this.f11997x1 = vector;
        this.f11994k4 = c11913yj;
        if (vector.size() >= 1) {
            this.f11993du = (AbstractC4393ck) vector.get(0);
        }
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: k4 */
    public int mo17817k4(double[] dArr) {
        int i;
        int i2 = 1;
        if (this.f11996to != null) {
            AbstractC4393ck abstractC4393ck = this.f11993du;
            if (abstractC4393ck == null || abstractC4393ck.mo17809kk() == 0) {
                return 4;
            }
            dArr[0] = this.f11993du.mo17797c5();
            dArr[1] = this.f11993du.mo17804jd();
            i = 1;
        } else {
            AbstractC4393ck abstractC4393ck2 = this.f11993du;
            if (abstractC4393ck2 == null) {
                throw new NoSuchElementException("area iterator out of bounds");
            }
            int iMo17805k4 = abstractC4393ck2.mo17805k4(dArr);
            int iMo17809kk = this.f11993du.mo17809kk();
            if (iMo17809kk == 0) {
                i = 1;
                i2 = iMo17805k4;
            } else {
                i2 = iMo17805k4;
                i = iMo17809kk;
            }
        }
        C11913yj c11913yj = this.f11994k4;
        if (c11913yj != null) {
            c11913yj.m55770k4(dArr, 0, dArr, 0, i);
        }
        return i2;
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: kk */
    public void mo17820kk() {
        if (this.f11996to != null) {
            this.f11996to = null;
            return;
        }
        this.f11996to = this.f11993du;
        int i = this.f11995kk + 1;
        this.f11995kk = i;
        if (i >= this.f11997x1.size()) {
            this.f11993du = null;
            return;
        }
        AbstractC4393ck abstractC4393ck = (AbstractC4393ck) this.f11997x1.get(this.f11995kk);
        this.f11993du = abstractC4393ck;
        if (abstractC4393ck.mo17809kk() != 0 && this.f11996to.mo17798ck() == this.f11993du.mo17797c5() && this.f11996to.mo17802fa() == this.f11993du.mo17804jd()) {
            this.f11996to = null;
        }
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: x1 */
    public boolean mo17821x1() {
        return this.f11996to == null && this.f11993du == null;
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: k4 */
    public int mo17818k4(float[] fArr) {
        int i;
        double[] dArr = new double[6];
        int iMo17817k4 = mo17817k4(dArr);
        if (iMo17817k4 == 4) {
            i = 0;
        } else if (iMo17817k4 == 2) {
            i = 2;
        } else {
            i = 3;
            if (iMo17817k4 != 3) {
                i = 1;
            }
        }
        for (int i2 = 0; i2 < i * 2; i2++) {
            fArr[i2] = (float) dArr[i2];
        }
        return iMo17817k4;
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: k4 */
    public InterfaceC4413v4.k4 mo17819k4() {
        return InterfaceC4413v4.k4.WIND_NON_ZERO;
    }
}
