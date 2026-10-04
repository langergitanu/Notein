package com.aspose.slides;

import com.aspose.slides.internal.p332p7.C7254aj;
import com.aspose.slides.internal.p332p7.C8646r2;

/* JADX INFO: renamed from: com.aspose.slides.bn */
/* JADX INFO: loaded from: classes3.dex */
class C0824bn extends AbstractC0910dq {

    /* JADX INFO: renamed from: du */
    private boolean f4218du;

    /* JADX INFO: renamed from: k4 */
    private boolean f4219k4;

    /* JADX INFO: renamed from: kk */
    private double f4220kk;

    /* JADX INFO: renamed from: to */
    private boolean f4221to;

    /* JADX INFO: renamed from: x1 */
    private double f4222x1;

    public C0824bn(C7254aj c7254aj) {
        this.f4220kk = 360.0d;
        m5211k4(2);
        m5213x1(2);
        for (C8646r2 c8646r2 : c7254aj.m28286x1()) {
            if (c8646r2.m39851k4() == 37) {
                this.f4219k4 = "alongPath".equals(c8646r2.m39852x1());
            }
            if (c8646r2.m39851k4() == 45) {
                this.f4222x1 = AbstractC0910dq.m5205k4(c8646r2.m39852x1(), 0.0d) % 360.0d;
            }
            if (c8646r2.m39851k4() == 43) {
                this.f4220kk = AbstractC0910dq.m5205k4(c8646r2.m39852x1(), 0.0d) % 360.0d;
            }
            if (c8646r2.m39851k4() == 47) {
                this.f4221to = "trans".equals(c8646r2.m39852x1());
            }
            if (c8646r2.m39851k4() == 12) {
                this.f4218du = "fNode".equals(c8646r2.m39852x1());
            }
            if (c8646r2.m39851k4() == 54) {
                m5213x1(AbstractC0910dq.m5209x1(c8646r2.m39852x1()));
            }
            if (c8646r2.m39851k4() == 21) {
                m5211k4(AbstractC0910dq.m5206k4(c8646r2.m39852x1()));
            }
        }
    }

    /* JADX INFO: renamed from: du */
    public double m4270du() {
        return this.f4220kk;
    }

    /* JADX INFO: renamed from: h4 */
    public boolean m4271h4() {
        return this.f4218du;
    }

    /* JADX INFO: renamed from: kk */
    public boolean m4272kk() {
        return this.f4219k4;
    }

    /* JADX INFO: renamed from: to */
    public double m4273to() {
        return this.f4222x1;
    }
}
