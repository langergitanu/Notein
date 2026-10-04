package com.aspose.slides.internal.p085dk;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p138fu.C4135yj;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13938ms;

/* JADX INFO: renamed from: com.aspose.slides.internal.dk.x1 */
/* JADX INFO: loaded from: classes3.dex */
public class C3179x1 {

    /* JADX INFO: renamed from: k4 */
    private final C13938ms f9451k4;

    public C3179x1(AbstractC3150x6 abstractC3150x6) {
        abstractC3150x6.setPosition(0L);
        C13938ms c13938msM16584k4 = C4135yj.m16584k4(abstractC3150x6);
        this.f9451k4 = c13938msM16584k4;
        c13938msM16584k4.m65487xk();
    }

    /* JADX INFO: renamed from: m9 */
    private boolean m13608m9() {
        return this.f9451k4.mo65048u4();
    }

    /* JADX INFO: renamed from: du */
    public final String m13609du() {
        return this.f9451k4.mo65023fa();
    }

    /* JADX INFO: renamed from: h4 */
    public final String m13610h4() {
        return this.f9451k4.mo65042rv();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m13611k4(String str, String str2) {
        while (true) {
            if (!this.f9451k4.mo65047to()) {
                break;
            }
            if (C14113y2.m67363du(m13609du(), str)) {
                str2 = this.f9451k4.mo65042rv();
                break;
            }
        }
        this.f9451k4.mo65020du();
        return str2;
    }

    /* JADX INFO: renamed from: kk */
    public final String m13615kk() {
        return this.f9451k4.mo65052v4();
    }

    /* JADX INFO: renamed from: to */
    public final String m13616to() {
        String strM65481e0 = this.f9451k4.m65481e0();
        while (true) {
            if (this.f9451k4.mo65028jd() != 13 && this.f9451k4.mo65028jd() != 3) {
                return strM65481e0;
            }
            this.f9451k4.mo65026h4();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m13617x1() {
        while (this.f9451k4.mo65047to()) {
            if (!"xmlns".equals(this.f9451k4.mo65060yj())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13612k4() {
        this.f9451k4.mo65020du();
        if (m13608m9()) {
            return;
        }
        String strM13609du = m13609du();
        while (!m13618x1(strM13609du)) {
            this.f9451k4.mo65026h4();
            if (this.f9451k4.mo65028jd() == 1) {
                this.f9451k4.mo65208bv();
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m13618x1(String str) {
        return this.f9451k4.mo65028jd() == 15 && C14113y2.m67363du(m13609du(), str);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m13613k4(String str) {
        return m13614k4(str, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0017, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m13614k4(String str, int i) {
        this.f9451k4.mo65020du();
        if (m13608m9() && C14113y2.m67363du(m13609du(), str)) {
            return false;
        }
        while (this.f9451k4.mo65026h4()) {
            int iMo65028jd = this.f9451k4.mo65028jd();
            if (iMo65028jd != 1) {
                if (iMo65028jd != 3) {
                    switch (iMo65028jd) {
                        case 13:
                            if ((i & 4) != 0) {
                                return true;
                            }
                            break;
                        case 14:
                            if ((i & 2) != 0) {
                                return true;
                            }
                            break;
                        case 15:
                            if (m13618x1(str)) {
                                return false;
                            }
                            break;
                    }
                } else if ((i & 1) != 0) {
                }
            }
            return true;
        }
        return false;
    }
}
