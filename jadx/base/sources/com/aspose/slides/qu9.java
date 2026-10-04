package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.C7254aj;
import com.aspose.slides.internal.p332p7.C8646r2;
import com.aspose.slides.p559ms.System.C14080ne;

/* JADX INFO: loaded from: classes3.dex */
class qu9 extends AbstractC0910dq {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f48391c5 = new C7017h4("bal", "fixed", "endCnv", "tR", "bL", "bR", "tL");

    /* JADX INFO: renamed from: du */
    private int f48392du;

    /* JADX INFO: renamed from: dy */
    private int f48393dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f48394h4;

    /* JADX INFO: renamed from: k4 */
    private int f48395k4;

    /* JADX INFO: renamed from: kk */
    private boolean f48396kk;

    /* JADX INFO: renamed from: m9 */
    private int f48397m9;

    /* JADX INFO: renamed from: to */
    private boolean f48398to;

    /* JADX INFO: renamed from: x1 */
    private int f48399x1;

    public qu9(C7254aj c7254aj) {
        this.f48395k4 = 0;
        this.f48399x1 = 2;
        this.f48396kk = false;
        this.f48398to = true;
        this.f48392du = 0;
        this.f48394h4 = true;
        this.f48397m9 = 2;
        this.f48393dy = 2;
        m5211k4(2);
        m5213x1(2);
        for (C8646r2 c8646r2 : c7254aj.m28286x1()) {
            if (c8646r2.m39851k4() == 6) {
                this.f48395k4 = m69756to(c8646r2.m39852x1());
            } else if (c8646r2.m39851k4() == 7) {
                this.f48399x1 = C14080ne.m67015to(c8646r2.m39852x1());
            } else if (c8646r2.m39851k4() == 29) {
                this.f48396kk = "ctr".equals(c8646r2.m39852x1());
            } else if (c8646r2.m39851k4() == 11) {
                this.f48398to = "sameDir".equals(c8646r2.m39852x1());
            } else if (c8646r2.m39851k4() == 19) {
                this.f48392du = m69755du(c8646r2.m39852x1());
            } else if (c8646r2.m39851k4() == 18) {
                this.f48394h4 = "row".equals(c8646r2.m39852x1());
            } else if (c8646r2.m39851k4() == 27) {
                this.f48397m9 = AbstractC0910dq.m5206k4(c8646r2.m39852x1());
            } else if (c8646r2.m39851k4() == 28) {
                this.f48393dy = AbstractC0910dq.m5209x1(c8646r2.m39852x1());
            } else if (c8646r2.m39851k4() == 21) {
                m5211k4(AbstractC0910dq.m5206k4(c8646r2.m39852x1()));
            } else if (c8646r2.m39851k4() == 54) {
                m5213x1(AbstractC0910dq.m5209x1(c8646r2.m39852x1()));
            }
        }
    }

    /* JADX INFO: renamed from: du */
    private int m69755du(String str) {
        int iM27428k4 = f48391c5.m27428k4(str);
        if (iM27428k4 == 3) {
            return 1;
        }
        if (iM27428k4 != 4) {
            return iM27428k4 != 5 ? 0 : 3;
        }
        return 2;
    }

    /* JADX INFO: renamed from: c5 */
    public final int m69757c5() {
        return this.f48397m9;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m69759dy() {
        return this.f48394h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m69760h4() {
        return this.f48398to;
    }

    /* JADX INFO: renamed from: jd */
    public final int m69761jd() {
        return this.f48393dy;
    }

    /* JADX INFO: renamed from: kk */
    public final int m69762kk() {
        return this.f48395k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m69763m9() {
        return this.f48392du;
    }

    /* JADX INFO: renamed from: to */
    public final int m69764to() {
        return this.f48399x1;
    }

    /* JADX INFO: renamed from: to */
    private int m69756to(String str) {
        int iM27428k4 = f48391c5.m27428k4(str);
        if (iM27428k4 != 0) {
            return iM27428k4 != 1 ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m69758du() {
        return this.f48396kk;
    }
}
