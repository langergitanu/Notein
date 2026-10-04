package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.C7254aj;
import com.aspose.slides.internal.p332p7.C8646r2;

/* JADX INFO: renamed from: com.aspose.slides.ue */
/* JADX INFO: loaded from: classes3.dex */
class C14630ue extends AbstractC0910dq {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f49315du = new C7017h4("t", "b", "r", "l");

    /* JADX INFO: renamed from: k4 */
    private int f49316k4;

    /* JADX INFO: renamed from: kk */
    private int f49317kk;

    /* JADX INFO: renamed from: to */
    private int f49318to;

    /* JADX INFO: renamed from: x1 */
    private int f49319x1;

    public C14630ue(C7254aj c7254aj) {
        this.f49316k4 = 2;
        this.f49319x1 = 3;
        this.f49317kk = 0;
        this.f49318to = 0;
        m5213x1(2);
        m5211k4(2);
        for (C8646r2 c8646r2 : c7254aj.m28286x1()) {
            if (c8646r2.m39851k4() == 22) {
                this.f49316k4 = AbstractC0910dq.m5208kk(c8646r2.m39852x1());
            } else if (c8646r2.m39851k4() == 8) {
                this.f49319x1 = m71671to(c8646r2.m39852x1());
            } else if (c8646r2.m39851k4() == 40) {
                this.f49317kk = AbstractC0910dq.m5208kk(c8646r2.m39852x1());
            } else if (c8646r2.m39851k4() == 39) {
                this.f49318to = m71671to(c8646r2.m39852x1());
            } else if (c8646r2.m39851k4() == 21) {
                m5211k4(AbstractC0910dq.m5206k4(c8646r2.m39852x1()));
            } else if (c8646r2.m39851k4() == 54) {
                m5213x1(AbstractC0910dq.m5209x1(c8646r2.m39852x1()));
            }
        }
    }

    /* JADX INFO: renamed from: du */
    public final int m71672du() {
        return this.f49317kk;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m71673h4() {
        return this.f49318to;
    }

    /* JADX INFO: renamed from: kk */
    public final int m71674kk() {
        return this.f49316k4;
    }

    /* JADX INFO: renamed from: to */
    public final int m71675to() {
        return this.f49319x1;
    }

    /* JADX INFO: renamed from: to */
    private int m71671to(String str) {
        int iM27428k4 = f49315du.m27428k4(str);
        if (iM27428k4 == 0) {
            return 1;
        }
        if (iM27428k4 == 1) {
            return 2;
        }
        if (iM27428k4 != 2) {
            return iM27428k4 != 3 ? 0 : 3;
        }
        return 4;
    }
}
