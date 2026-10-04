package com.aspose.slides.internal.p060ca;

import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.ip */
/* JADX INFO: loaded from: classes3.dex */
public class C2131ip {

    /* JADX INFO: renamed from: k4 */
    private double f7341k4;

    /* JADX INFO: renamed from: x1 */
    private double f7342x1;

    /* JADX INFO: renamed from: k4 */
    public final double m10725k4() {
        return this.f7341k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final double m10727x1() {
        return this.f7342x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10726k4(double d, double d2) {
        double[] dArr = {this.f7341k4};
        double[] dArr2 = {this.f7342x1};
        m10724k4(d, d2, dArr, dArr2);
        this.f7341k4 = dArr[0];
        this.f7342x1 = dArr2[0];
    }

    /* JADX INFO: renamed from: k4 */
    private static void m10724k4(double d, double d2, double[] dArr, double[] dArr2) {
        double dM67496rv = C14116yg.m67496rv((d2 * d2) + (d * d));
        dArr[0] = d / dM67496rv;
        dArr2[0] = d2 / dM67496rv;
    }
}
