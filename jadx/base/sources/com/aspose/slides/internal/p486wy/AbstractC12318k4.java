package com.aspose.slides.internal.p486wy;

import com.aspose.slides.Collections.Generic.OooO00o;
import com.aspose.slides.internal.p486wy.C12314dy;

/* JADX INFO: renamed from: com.aspose.slides.internal.wy.k4 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12318k4 extends C12317jd {

    /* JADX INFO: renamed from: ks */
    private int f41186ks;

    /* JADX INFO: renamed from: rv */
    private k4 f41187rv;

    /* JADX INFO: renamed from: x6 */
    private int f41188x6;

    /* JADX INFO: renamed from: yj */
    private int f41189yj;

    /* JADX INFO: renamed from: com.aspose.slides.internal.wy.k4$k4 */
    public static class k4 extends C12314dy.k4 {

        /* JADX INFO: renamed from: k4 */
        public int f41190k4;

        public k4(int i, int i2, int i3) {
            super(i, i2, i3);
            this.f41190k4 = 0;
        }
    }

    public AbstractC12318k4() {
        this.f41189yj = 0;
        this.f41186ks = 0;
        this.f41187rv = null;
        this.f41188x6 = 0;
    }

    @Override // com.aspose.slides.internal.p486wy.C12317jd, com.aspose.slides.internal.p486wy.C12314dy
    /* JADX INFO: renamed from: ar */
    public int mo57569ar() {
        return mo8658e_();
    }

    /* JADX INFO: renamed from: c5 */
    public final void m57591c5(int i) {
        this.f41189yj = i;
    }

    /* JADX INFO: renamed from: ck */
    public final void m57592ck(int i) {
        this.f41187rv.f41190k4 = i;
    }

    /* JADX INFO: renamed from: fa */
    public final void m57593fa(int i) {
        this.f41188x6 = i;
    }

    /* JADX INFO: renamed from: jd */
    public final void m57594jd(int i) {
        this.f41186ks = i;
    }

    @Override // com.aspose.slides.internal.p486wy.C12317jd, com.aspose.slides.internal.p486wy.C12314dy
    /* JADX INFO: renamed from: k4 */
    public boolean mo57567k4(double d, int i, int i2) {
        double d2;
        double d3;
        double d4;
        double d5;
        k4 k4Var = this.f41187rv;
        if (k4Var == null) {
            return false;
        }
        if (d < 0.0d) {
            if (this.f41189yj < 0) {
                d3 = ((double) k4Var.f41176x1) / ((double) k4Var.f41174kk);
                d4 = i2;
                d5 = i;
            } else {
                d3 = ((double) k4Var.f41174kk) / ((double) k4Var.f41176x1);
                d4 = i;
                d5 = i2;
            }
            d2 = (d4 / d5) * d3;
        } else {
            d2 = 1.0d;
        }
        this.f41189yj = OooO00o.OooO00o(((double) (this.f41189yj - k4Var.f41190k4)) * d, d2, 14) + this.f41187rv.f41190k4;
        this.f41186ks = OooO00o.OooO00o(this.f41186ks, d, 14);
        k4 k4Var2 = this.f41187rv;
        int i3 = k4Var2.f41175to;
        k4Var2.f41175to = OooO00o.OooO00o(((double) i3) * d2, d, 14);
        this.f6214k4 = (this.f41187rv.f41175to - i3) + this.f6214k4;
        return false;
    }

    @Override // com.aspose.slides.internal.p486wy.C12317jd, com.aspose.slides.internal.p486wy.C12314dy
    /* JADX INFO: renamed from: qq */
    public int mo57575qq() {
        return m57577um();
    }

    /* JADX INFO: renamed from: u4 */
    public final int m57595u4() {
        return this.f41189yj;
    }

    /* JADX INFO: renamed from: uz */
    public final int m57596uz() {
        return this.f41186ks;
    }

    /* JADX INFO: renamed from: wl */
    public final int m57597wl() {
        return this.f41188x6;
    }

    public AbstractC12318k4(int i, int i2, int i3) {
        this.f41189yj = 0;
        this.f41186ks = 0;
        this.f41187rv = null;
        this.f41188x6 = 0;
        this.f41187rv = new k4(i, i2, i3);
    }
}
