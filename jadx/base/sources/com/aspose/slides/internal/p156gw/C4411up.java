package com.aspose.slides.internal.p156gw;

import androidx.concurrent.futures.OooO00o;

/* JADX INFO: renamed from: com.aspose.slides.internal.gw.up */
/* JADX INFO: loaded from: classes.dex */
final class C4411up {

    /* JADX INFO: renamed from: du */
    int f12104du;

    /* JADX INFO: renamed from: dy */
    private double f12105dy;

    /* JADX INFO: renamed from: h4 */
    private C4411up f12106h4;

    /* JADX INFO: renamed from: k4 */
    AbstractC4393ck f12107k4;

    /* JADX INFO: renamed from: kk */
    int f12108kk;

    /* JADX INFO: renamed from: m9 */
    private int f12109m9;

    /* JADX INFO: renamed from: to */
    double f12110to;

    /* JADX INFO: renamed from: x1 */
    int f12111x1;

    public C4411up(AbstractC4393ck abstractC4393ck, int i) {
        this(abstractC4393ck, i, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public int m18002k4(C4411up c4411up, double[] dArr) {
        if (c4411up == this.f12106h4) {
            double d = dArr[0];
            double d2 = this.f12105dy;
            if (d < d2) {
                if (dArr[1] > d2) {
                    dArr[1] = d2;
                }
                return this.f12109m9;
            }
        }
        if (this == c4411up.f12106h4) {
            double d3 = dArr[0];
            double d4 = c4411up.f12105dy;
            if (d3 < d4) {
                if (dArr[1] > d4) {
                    dArr[1] = d4;
                }
                return 0 - c4411up.f12109m9;
            }
        }
        int iMo17873k4 = this.f12107k4.mo17873k4(c4411up.f12107k4, dArr);
        this.f12106h4 = c4411up;
        this.f12105dy = dArr[1];
        this.f12109m9 = iMo17873k4;
        return iMo17873k4;
    }

    /* JADX INFO: renamed from: kk */
    public int m18006kk() {
        return this.f12104du;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Edge[");
        sb.append(this.f12107k4);
        sb.append(", ");
        sb.append(this.f12111x1 == 0 ? "L" : "R");
        sb.append(", ");
        int i = this.f12108kk;
        return OooO00o.OooO0OO(sb, i == 1 ? "I" : i == -1 ? "O" : "N", "]");
    }

    /* JADX INFO: renamed from: x1 */
    public int m18007x1() {
        return this.f12111x1;
    }

    public C4411up(AbstractC4393ck abstractC4393ck, int i, int i2) {
        this.f12107k4 = abstractC4393ck;
        this.f12111x1 = i;
        this.f12108kk = i2;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC4393ck m18003k4() {
        return this.f12107k4;
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m18008x1(double d, int i) {
        return this.f12108kk == i && this.f12110to >= d;
    }

    /* JADX INFO: renamed from: k4 */
    public void m18004k4(double d, int i) {
        this.f12110to = d;
        this.f12108kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    public void m18005k4(int i) {
        this.f12104du = i;
    }
}
