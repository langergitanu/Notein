package com.aspose.slides;

import com.aspose.slides.internal.p332p7.C7254aj;
import com.aspose.slides.internal.p332p7.C8646r2;

/* JADX INFO: loaded from: classes3.dex */
class xji extends AbstractC0910dq {

    /* JADX INFO: renamed from: du */
    private int f50120du;

    /* JADX INFO: renamed from: h4 */
    private int f50121h4;

    /* JADX INFO: renamed from: k4 */
    private String f50122k4;

    /* JADX INFO: renamed from: kk */
    private String f50123kk;

    /* JADX INFO: renamed from: m9 */
    private int f50124m9;

    /* JADX INFO: renamed from: to */
    private int f50125to;

    /* JADX INFO: renamed from: x1 */
    private String f50126x1;

    public xji(C7254aj c7254aj) {
        this.f50125to = 4;
        this.f50120du = 4;
        this.f50121h4 = 0;
        this.f50124m9 = 0;
        for (C8646r2 c8646r2 : c7254aj.m28286x1()) {
            if (c8646r2.m39851k4() == 22) {
                this.f50125to = AbstractC0910dq.m5208kk(c8646r2.m39852x1());
            } else if (c8646r2.m39851k4() == 53) {
                this.f50120du = AbstractC0910dq.m5208kk(c8646r2.m39852x1());
            } else if (c8646r2.m39851k4() == 33) {
                this.f50121h4 = "aft".equals(c8646r2.m39852x1()) ? 1 : 0;
            } else if (c8646r2.m39851k4() == 34) {
                this.f50124m9 = !"step".equals(c8646r2.m39852x1()) ? 1 : 0;
            } else if (c8646r2.m39851k4() == 36) {
                this.f50122k4 = c8646r2.m39852x1();
            } else if (c8646r2.m39851k4() == 32) {
                this.f50123kk = c8646r2.m39852x1();
            } else if (c8646r2.m39851k4() == 35) {
                this.f50126x1 = c8646r2.m39852x1();
            }
        }
    }

    /* JADX INFO: renamed from: du */
    public final String m73444du() {
        return this.f50123kk;
    }

    /* JADX INFO: renamed from: dy */
    public final int m73445dy() {
        return this.f50124m9;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m73446h4() {
        return this.f50125to;
    }

    /* JADX INFO: renamed from: kk */
    public final String m73447kk() {
        return this.f50122k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m73448m9() {
        return this.f50121h4;
    }

    /* JADX INFO: renamed from: to */
    public final String m73449to() {
        return this.f50126x1;
    }
}
