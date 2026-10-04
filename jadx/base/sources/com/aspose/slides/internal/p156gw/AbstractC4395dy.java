package com.aspose.slides.internal.p156gw;

import java.util.Enumeration;
import java.util.Vector;

/* JADX INFO: renamed from: com.aspose.slides.internal.gw.dy */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4395dy {

    /* JADX INFO: renamed from: du */
    double f11998du;

    /* JADX INFO: renamed from: h4 */
    double f11999h4;

    /* JADX INFO: renamed from: kk */
    double f12001kk;

    /* JADX INFO: renamed from: to */
    double f12003to;

    /* JADX INFO: renamed from: k4 */
    int f12000k4 = 0;

    /* JADX INFO: renamed from: x1 */
    double[] f12004x1 = new double[10];

    /* JADX INFO: renamed from: m9 */
    private Vector f12002m9 = new Vector();

    /* JADX INFO: renamed from: com.aspose.slides.internal.gw.dy$k4 */
    public static final class k4 extends AbstractC4395dy {
        public k4(double d, double d2, double d3, double d4) {
            super(d, d2, d3, d4);
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4395dy
        /* JADX INFO: renamed from: k4 */
        public void mo17882k4(double d, double d2, int i) {
            int i2;
            if (d >= d2) {
                return;
            }
            int i3 = 0;
            while (i3 < this.f12000k4 && d > this.f12004x1[i3 + 1]) {
                i3 += 2;
            }
            double d3 = d2;
            int i4 = i3;
            int i5 = i4;
            double d4 = d;
            while (true) {
                i2 = this.f12000k4;
                if (i4 >= i2) {
                    break;
                }
                double[] dArr = this.f12004x1;
                int i6 = i4 + 1;
                double d5 = dArr[i4];
                i4 += 2;
                double d6 = dArr[i6];
                if (d3 < d5) {
                    int i7 = i5 + 1;
                    dArr[i5] = d4;
                    i5 += 2;
                    dArr[i7] = d3;
                    d4 = d5;
                } else {
                    if (d4 < d5) {
                        d5 = d4;
                        d4 = d5;
                    }
                    if (d3 >= d6) {
                        d6 = d3;
                        d3 = d6;
                    }
                    if (d4 == d3) {
                        d4 = d5;
                    } else {
                        if (d4 > d3) {
                            double d7 = d3;
                            d3 = d4;
                            d4 = d7;
                        }
                        if (d5 != d4) {
                            int i8 = i5 + 1;
                            dArr[i5] = d5;
                            i5 += 2;
                            dArr[i8] = d4;
                        }
                        d4 = d3;
                    }
                    if (d4 >= d6) {
                        d3 = d6;
                        break;
                    }
                }
                d3 = d6;
            }
            if (i5 < i4 && i4 < i2) {
                double[] dArr2 = this.f12004x1;
                C4398ix.m17908k4(dArr2, i4, dArr2, i5, i2 - i4);
            }
            int i9 = (this.f12000k4 - i4) + i5;
            if (d4 < d3) {
                double[] dArr3 = this.f12004x1;
                if (i9 >= dArr3.length) {
                    double[] dArr4 = new double[i9 + 10];
                    C4398ix.m17908k4(dArr3, 0, dArr4, 0, i9);
                    this.f12004x1 = dArr4;
                }
                double[] dArr5 = this.f12004x1;
                int i10 = i9 + 1;
                dArr5[i9] = d4;
                i9 += 2;
                dArr5[i10] = d3;
            }
            this.f12000k4 = i9;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4395dy
        /* JADX INFO: renamed from: k4 */
        public final boolean mo17883k4(double d, double d2) {
            if (this.f12000k4 == 2) {
                double[] dArr = this.f12004x1;
                if (dArr[0] <= d && dArr[1] >= d2) {
                    return true;
                }
            }
            return false;
        }
    }

    public AbstractC4395dy(double d, double d2, double d3, double d4) {
        this.f12001kk = d;
        this.f12003to = d2;
        this.f11998du = d3;
        this.f11999h4 = d4;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m17880du() {
        return this.f12000k4 == 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m17881k4() {
        return this.f12001kk;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo17882k4(double d, double d2, int i);

    /* JADX INFO: renamed from: k4 */
    public abstract boolean mo17883k4(double d, double d2);

    /* JADX INFO: renamed from: kk */
    public final double m17884kk() {
        return this.f11998du;
    }

    /* JADX INFO: renamed from: to */
    public final double m17885to() {
        return this.f11999h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final double m17886x1() {
        return this.f12003to;
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC4395dy m17879k4(Vector vector, double d, double d2, double d3, double d4) {
        k4 k4Var = new k4(d, d2, d3, d4);
        Enumeration enumerationElements = vector.elements();
        while (enumerationElements.hasMoreElements()) {
            if (((AbstractC4393ck) enumerationElements.nextElement()).mo17876k4(k4Var)) {
                return null;
            }
        }
        return k4Var;
    }
}
