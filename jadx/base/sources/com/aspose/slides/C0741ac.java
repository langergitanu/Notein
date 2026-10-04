package com.aspose.slides;

import com.aspose.slides.internal.p332p7.C7254aj;
import com.aspose.slides.internal.p332p7.C8646r2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.ac */
/* JADX INFO: loaded from: classes3.dex */
class C0741ac extends AbstractC0910dq {

    /* JADX INFO: renamed from: k4 */
    private double f3871k4;

    public C0741ac(C7254aj c7254aj) {
        this.f3871k4 = 0.0d;
        m5211k4(2);
        m5213x1(2);
        for (C8646r2 c8646r2 : c7254aj.m28286x1()) {
            if (c8646r2.m39851k4() == 1) {
                this.f3871k4 = C14116yg.m67475k4(AbstractC0910dq.m5205k4(c8646r2.m39852x1(), 0.0d));
            } else if (c8646r2.m39851k4() == 21) {
                m5211k4(AbstractC0910dq.m5206k4(c8646r2.m39852x1()));
            } else if (c8646r2.m39851k4() == 54) {
                m5213x1(AbstractC0910dq.m5209x1(c8646r2.m39852x1()));
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    public final double m3474kk() {
        return this.f3871k4;
    }
}
