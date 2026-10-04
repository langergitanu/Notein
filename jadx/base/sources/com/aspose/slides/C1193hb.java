package com.aspose.slides;

import com.aspose.slides.internal.p332p7.C7254aj;
import com.aspose.slides.internal.p332p7.C8646r2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.hb */
/* JADX INFO: loaded from: classes3.dex */
class C1193hb extends AbstractC0910dq {

    /* JADX INFO: renamed from: k4 */
    private int f5477k4;

    /* JADX INFO: renamed from: x1 */
    private int f5478x1;

    public C1193hb(C7254aj c7254aj) {
        m5213x1(2);
        m5211k4(2);
        this.f5477k4 = 1;
        this.f5478x1 = 4;
        for (C8646r2 c8646r2 : c7254aj.m28286x1()) {
            if (c8646r2.m39851k4() == 21) {
                m5211k4(AbstractC0910dq.m5206k4(c8646r2.m39852x1()));
            } else if (c8646r2.m39851k4() == 54) {
                m5213x1(AbstractC0910dq.m5209x1(c8646r2.m39852x1()));
            } else if (c8646r2.m39851k4() == 20) {
                m7091to(c8646r2.m39852x1());
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    public final int m7092kk() {
        return this.f5477k4;
    }

    /* JADX INFO: renamed from: to */
    public final int m7093to() {
        return this.f5478x1;
    }

    /* JADX INFO: renamed from: to */
    private void m7091to(String str) {
        if (str.length() > 1) {
            char cCharAt = str.charAt(0);
            if (cCharAt == 't') {
                this.f5477k4 = 1;
            } else if (cCharAt == 'l') {
                this.f5477k4 = 3;
            } else if (cCharAt == 'b') {
                this.f5477k4 = 2;
            } else if (cCharAt == 'r') {
                this.f5477k4 = 4;
            }
            String strM67422kk = C14113y2.m67422kk(str, 1);
            if ("L".equals(strM67422kk)) {
                this.f5478x1 = 2;
                return;
            }
            if ("R".equals(strM67422kk)) {
                this.f5478x1 = 3;
                return;
            }
            if ("T".equals(strM67422kk)) {
                this.f5478x1 = 0;
                return;
            }
            if ("B".equals(strM67422kk)) {
                this.f5478x1 = 1;
            } else if ("CtrCh".equals(strM67422kk)) {
                this.f5478x1 = 4;
            } else if ("CtrDes".equals(strM67422kk)) {
                this.f5478x1 = 5;
            }
        }
    }
}
