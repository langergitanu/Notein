package com.aspose.slides.internal.p071cz;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.n2 */
/* JADX INFO: loaded from: classes3.dex */
class C2828n2 {

    /* JADX INFO: renamed from: k4 */
    private C2842o2 f8685k4;

    public C2828n2(C2842o2 c2842o2) {
        C2842o2 c2842o22 = new C2842o2();
        this.f8685k4 = c2842o22;
        c2842o2.CloneTo(c2842o22);
    }

    /* JADX INFO: renamed from: k4 */
    public double m12411k4(double d) {
        double dM12440kk = (this.f8685k4.m12440kk() - d) / this.f8685k4.m12441m9();
        if (dM12440kk == 1.0d) {
            dM12440kk -= 1.0E-10d;
        }
        return 1.0d - dM12440kk;
    }

    /* JADX INFO: renamed from: x1 */
    public double m12413x1(double d) {
        double dM12442to = (this.f8685k4.m12442to() - d) / this.f8685k4.m12434dy();
        if (dM12442to == 1.0d) {
            dM12442to -= 1.0E-10d;
        }
        return 1.0d - dM12442to;
    }

    public C2828n2(C2985yu[] c2985yuArr) {
        this.f8685k4 = new C2842o2();
        if (c2985yuArr.length == 0) {
            this.f8685k4 = new C2842o2();
            return;
        }
        double dM12440kk = -1.7976931348623157E308d;
        double dM12442to = -1.7976931348623157E308d;
        double dM12437k4 = Double.MAX_VALUE;
        double dM12443x1 = Double.MAX_VALUE;
        for (C2985yu c2985yu : c2985yuArr) {
            C2842o2 c2842o2Clone = c2985yu.m12639kk().Clone();
            dM12437k4 = c2842o2Clone.m12437k4() < dM12437k4 ? c2842o2Clone.m12437k4() : dM12437k4;
            dM12440kk = c2842o2Clone.m12440kk() > dM12440kk ? c2842o2Clone.m12440kk() : dM12440kk;
            if (c2985yu.m12640to().m12463x1().m12284k4() > 0) {
                dM12443x1 = c2842o2Clone.m12443x1() < dM12443x1 ? c2842o2Clone.m12443x1() : dM12443x1;
                if (c2842o2Clone.m12442to() > dM12442to) {
                    dM12442to = c2842o2Clone.m12442to();
                }
            }
        }
        this.f8685k4 = new C2842o2(dM12437k4, dM12443x1, dM12440kk, dM12442to);
    }

    /* JADX INFO: renamed from: k4 */
    public C2842o2 m12412k4() {
        return this.f8685k4;
    }
}
