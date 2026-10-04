package com.aspose.slides.internal.p071cz;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.yu */
/* JADX INFO: loaded from: classes3.dex */
final class C2985yu {

    /* JADX INFO: renamed from: k4 */
    private C2842o2 f8821k4 = new C2842o2();

    /* JADX INFO: renamed from: kk */
    private C2857pd f8822kk;

    /* JADX INFO: renamed from: x1 */
    private C2842o2 f8823x1;

    public C2985yu(C2857pd c2857pd, C2842o2 c2842o2) {
        C2842o2 c2842o22 = new C2842o2();
        this.f8823x1 = c2842o22;
        this.f8822kk = c2857pd;
        c2842o2.CloneTo(c2842o22);
        m12636du();
    }

    /* JADX INFO: renamed from: du */
    private void m12636du() {
        double d;
        double d2;
        double d3;
        int i = 0;
        if (this.f8822kk.m12463x1().m12284k4() > 0) {
            C2977y9[] c2977y9ArrM12286x1 = this.f8822kk.m12463x1().m12286x1();
            double dM12440kk = -1.7976931348623157E308d;
            double d4 = Double.MAX_VALUE;
            if (c2977y9ArrM12286x1.length > 0) {
                int i2 = 0;
                double dM12437k4 = Double.MAX_VALUE;
                double dM12443x1 = Double.MAX_VALUE;
                double dM12442to = -1.7976931348623157E308d;
                while (i < c2977y9ArrM12286x1.length) {
                    C2977y9 c2977y9 = c2977y9ArrM12286x1[i];
                    if (c2977y9.m12626k4() > 0) {
                        if (i2 == 0) {
                            i2 = 1;
                        }
                        C2842o2 c2842o2Clone = c2977y9.m12625h4().Clone();
                        if (c2842o2Clone.m12437k4() < dM12437k4) {
                            dM12437k4 = c2842o2Clone.m12437k4();
                        }
                        if (c2842o2Clone.m12443x1() < dM12443x1) {
                            dM12443x1 = c2842o2Clone.m12443x1();
                        }
                        if (c2842o2Clone.m12440kk() > dM12440kk) {
                            dM12440kk = c2842o2Clone.m12440kk();
                        }
                        if (c2842o2Clone.m12442to() > dM12442to) {
                            dM12442to = c2842o2Clone.m12442to();
                        }
                    }
                    i++;
                }
                double d5 = dM12437k4;
                d = dM12440kk;
                d3 = d5;
                double d6 = dM12443x1;
                d2 = dM12442to;
                d4 = d6;
                i = i2;
            } else {
                d = -1.7976931348623157E308d;
                d2 = -1.7976931348623157E308d;
                d3 = Double.MAX_VALUE;
            }
            this.f8821k4 = new C2842o2(d3, d4, d, d2);
        }
        if (i == 0) {
            this.f8823x1.CloneTo(this.f8821k4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public double m12637k4() {
        return this.f8823x1.m12442to() - this.f8823x1.m12443x1();
    }

    /* JADX INFO: renamed from: kk */
    public C2842o2 m12639kk() {
        return this.f8821k4;
    }

    /* JADX INFO: renamed from: to */
    public C2857pd m12640to() {
        return this.f8822kk;
    }

    /* JADX INFO: renamed from: x1 */
    public C2842o2 m12641x1() {
        return this.f8823x1;
    }

    /* JADX INFO: renamed from: k4 */
    public void m12638k4(C2865q1 c2865q1, double d) {
        for (C2977y9 c2977y9 : this.f8822kk.m12463x1()) {
            int iM12626k4 = c2977y9.m12626k4();
            for (int i = 0; i < iM12626k4; i++) {
                c2977y9.m12628k4(i, C2968xo.m12598k4(c2865q1, C2968xo.m12599k4(C2865q1.m12475k4(c2977y9.m12627k4(i), c2865q1).Clone(), d)).Clone());
            }
        }
        this.f8823x1.m12438k4(c2865q1.Clone(), d).CloneTo(this.f8823x1);
        m12636du();
    }
}
