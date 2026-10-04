package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.y4 */
/* JADX INFO: loaded from: classes3.dex */
class C2382y4 {

    /* JADX INFO: renamed from: du */
    private int f8237du;

    /* JADX INFO: renamed from: h4 */
    private int f8238h4;

    /* JADX INFO: renamed from: k4 */
    private boolean f8239k4 = false;

    /* JADX INFO: renamed from: kk */
    private double[][] f8240kk;

    /* JADX INFO: renamed from: to */
    private int f8241to;

    /* JADX INFO: renamed from: x1 */
    private double[][] f8242x1;

    /* JADX INFO: renamed from: k4 */
    public final void m11727k4(double d) {
        double[][] dArr = this.f8242x1;
        if (dArr == null) {
            int iM27462to = C7019kk.m27462to(Double.valueOf(d), 14);
            this.f8241to = iM27462to;
            this.f8242x1 = new double[iM27462to][];
            return;
        }
        int i = this.f8241to;
        if (i > 0) {
            dArr[dArr.length - i][this.f8238h4] = C14116yg.m67475k4(d);
            if (d < 0.0d) {
                this.f8241to--;
                this.f8238h4 = 0;
                return;
            }
            return;
        }
        double[][] dArr2 = this.f8240kk;
        if (dArr2 == null) {
            int iM27462to2 = C7019kk.m27462to(Double.valueOf(d), 14);
            this.f8237du = iM27462to2;
            this.f8240kk = new double[iM27462to2][];
            return;
        }
        int i2 = this.f8237du;
        if (i2 > 0) {
            dArr2[dArr2.length - i2][this.f8238h4] = C14116yg.m67475k4(d);
            if (d < 0.0d) {
                this.f8237du--;
                this.f8238h4 = 0;
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m11729kk() {
        this.f8239k4 = false;
    }

    /* JADX INFO: renamed from: x1 */
    public final double[][] m11730x1() {
        return this.f8242x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final double[][] m11728k4() {
        return this.f8240kk;
    }
}
