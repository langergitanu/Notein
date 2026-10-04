package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.C7254aj;
import com.aspose.slides.internal.p332p7.C8646r2;

/* JADX INFO: loaded from: classes3.dex */
class xld extends AbstractC0910dq {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f50147du = new C7017h4("1D", "2D");

    /* JADX INFO: renamed from: k4 */
    private int f50148k4;

    /* JADX INFO: renamed from: kk */
    private int f50149kk;

    /* JADX INFO: renamed from: to */
    private int f50150to;

    /* JADX INFO: renamed from: x1 */
    private int f50151x1;

    public xld(C7254aj c7254aj) {
        this.f50148k4 = 2;
        this.f50151x1 = 2;
        this.f50149kk = 2;
        m5211k4(2);
        m5213x1(2);
        this.f50150to = 0;
        for (C8646r2 c8646r2 : c7254aj.m28286x1()) {
            if (c8646r2.m39851k4() == 22) {
                this.f50148k4 = AbstractC0910dq.m5208kk(c8646r2.m39852x1());
            } else if (c8646r2.m39851k4() == 27) {
                this.f50151x1 = AbstractC0910dq.m5206k4(c8646r2.m39852x1());
            } else if (c8646r2.m39851k4() == 28) {
                this.f50149kk = AbstractC0910dq.m5209x1(c8646r2.m39852x1());
            } else if (c8646r2.m39851k4() == 21) {
                m5211k4(AbstractC0910dq.m5206k4(c8646r2.m39852x1()));
            } else if (c8646r2.m39851k4() == 54) {
                m5213x1(AbstractC0910dq.m5209x1(c8646r2.m39852x1()));
            } else if (c8646r2.m39851k4() == 17) {
                this.f50150to = m73476to(c8646r2.m39852x1());
            }
        }
    }

    /* JADX INFO: renamed from: du */
    public final int m73477du() {
        return this.f50149kk;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m73478h4() {
        return this.f50150to;
    }

    /* JADX INFO: renamed from: kk */
    public final int m73479kk() {
        return this.f50148k4;
    }

    /* JADX INFO: renamed from: to */
    public final int m73480to() {
        return this.f50151x1;
    }

    /* JADX INFO: renamed from: to */
    private int m73476to(String str) {
        return f50147du.m27428k4(str) != 1 ? 0 : 1;
    }
}
