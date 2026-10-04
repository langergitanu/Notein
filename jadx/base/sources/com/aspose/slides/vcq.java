package com.aspose.slides;

import com.aspose.slides.internal.p332p7.C7308ba;
import com.aspose.slides.internal.p332p7.C8574q3;
import com.aspose.slides.internal.p332p7.C8916u3;

/* JADX INFO: loaded from: classes3.dex */
class vcq extends wsu {

    /* JADX INFO: renamed from: k4 */
    private boolean f49488k4;

    /* JADX INFO: renamed from: x1 */
    private int f49489x1;

    public vcq(C8916u3 c8916u3) {
        if (!"conn".equals(c8916u3.m42082x1())) {
            this.f49489x1 = "none".equals(c8916u3.m42082x1()) ? -1 : C8574q3.m39320k4(c8916u3.m42082x1());
        } else {
            this.f49488k4 = true;
            this.f49489x1 = -1;
        }
    }

    /* JADX INFO: renamed from: ck */
    private C8916u3 m72174ck() {
        return (C8916u3) m72921ne();
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m72175c5() {
        return m72174ck().m42077du();
    }

    /* JADX INFO: renamed from: du */
    public final boolean m72176du() {
        return m72174ck().m42081to();
    }

    /* JADX INFO: renamed from: dy */
    public final int m72177dy() {
        return m72174ck().m42080kk();
    }

    /* JADX INFO: renamed from: h4 */
    public final double m72178h4() {
        return m72174ck().m42079k4();
    }

    /* JADX INFO: renamed from: jd */
    public final C7308ba[] m72179jd() {
        if (m72174ck().m42078h4() != null) {
            return m72174ck().m42078h4().m44093k4();
        }
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public final int m72180kk() {
        return this.f49489x1;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m72181to() {
        return this.f49488k4;
    }
}
