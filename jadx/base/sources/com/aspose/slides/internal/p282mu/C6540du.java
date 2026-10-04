package com.aspose.slides.internal.p282mu;

import java.io.Serializable;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: com.aspose.slides.internal.mu.du */
/* JADX INFO: loaded from: classes4.dex */
final class C6540du implements Serializable, Cloneable {

    /* JADX INFO: renamed from: k4 */
    private final double[][] f18283k4;

    /* JADX INFO: renamed from: kk */
    private final int f18284kk;

    /* JADX INFO: renamed from: x1 */
    private final int f18285x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.mu.du$k4 */
    public static class k4 {
        /* JADX INFO: renamed from: k4 */
        public static double m26345k4(double d, double d2) {
            if (Math.abs(d) > Math.abs(d2)) {
                double d3 = d2 / d;
                return Math.sqrt((d3 * d3) + 1.0d) * Math.abs(d);
            }
            if (d2 == 0.0d) {
                return 0.0d;
            }
            double d4 = d / d2;
            return Math.sqrt((d4 * d4) + 1.0d) * Math.abs(d2);
        }
    }

    public C6540du(int i, int i2) {
        this.f18285x1 = i;
        this.f18284kk = i2;
        this.f18283k4 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i, i2);
    }

    public Object clone() {
        return m26341k4();
    }

    /* JADX INFO: renamed from: du */
    public int m26340du() {
        return this.f18284kk;
    }

    /* JADX INFO: renamed from: k4 */
    public C6540du m26341k4() {
        C6540du c6540du = new C6540du(this.f18285x1, this.f18284kk);
        double[][] dArrM26344x1 = c6540du.m26344x1();
        for (int i = 0; i < this.f18285x1; i++) {
            for (int i2 = 0; i2 < this.f18284kk; i2++) {
                dArrM26344x1[i][i2] = this.f18283k4[i][i2];
            }
        }
        return c6540du;
    }

    /* JADX INFO: renamed from: kk */
    public double[][] m26342kk() {
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, this.f18285x1, this.f18284kk);
        for (int i = 0; i < this.f18285x1; i++) {
            for (int i2 = 0; i2 < this.f18284kk; i2++) {
                dArr[i][i2] = this.f18283k4[i][i2];
            }
        }
        return dArr;
    }

    /* JADX INFO: renamed from: to */
    public int m26343to() {
        return this.f18285x1;
    }

    /* JADX INFO: renamed from: x1 */
    public double[][] m26344x1() {
        return this.f18283k4;
    }

    public C6540du(double[][] dArr) {
        this.f18285x1 = dArr.length;
        this.f18284kk = dArr[0].length;
        for (int i = 0; i < this.f18285x1; i++) {
            if (dArr[i].length != this.f18284kk) {
                throw new IllegalArgumentException("All rows must have the same length.");
            }
        }
        this.f18283k4 = dArr;
    }
}
