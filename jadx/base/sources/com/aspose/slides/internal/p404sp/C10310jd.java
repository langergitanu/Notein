package com.aspose.slides.internal.p404sp;

import com.aspose.slides.internal.p115eq.C3786fa;
import com.aspose.slides.internal.p136fr.C4113k4;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.sp.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C10310jd {

    /* JADX INFO: renamed from: k4 */
    private float f36730k4;

    /* JADX INFO: renamed from: kk */
    private float f36731kk;

    /* JADX INFO: renamed from: to */
    private float f36732to;

    /* JADX INFO: renamed from: x1 */
    private float f36733x1;

    public C10310jd() {
    }

    /* JADX INFO: renamed from: k4 */
    public static C10310jd m50275k4(String str) {
        if (C14113y2.m67411k4(str)) {
            return null;
        }
        String[] strArrM67417k4 = C14113y2.m67417k4(str, new String[]{" ", ","}, 1);
        if (strArrM67417k4.length < 4) {
            return null;
        }
        C10310jd c10310jd = new C10310jd();
        try {
            c10310jd.f36730k4 = C10308dy.m50271k4(strArrM67417k4[0], 0.0f);
            c10310jd.f36733x1 = C10308dy.m50271k4(strArrM67417k4[1], 0.0f);
            c10310jd.f36731kk = C10308dy.m50271k4(strArrM67417k4[2], 0.0f);
            c10310jd.f36732to = C10308dy.m50271k4(strArrM67417k4[3], 0.0f);
            return c10310jd;
        } catch (RuntimeException e) {
            if (C4113k4.f11284k4) {
                return c10310jd;
            }
            throw e;
        }
    }

    public String toString() {
        return C14113y2.m67402k4("{0} {1} {2} {3}", C10308dy.m50272k4(this.f36730k4), C10308dy.m50272k4(this.f36733x1), C10308dy.m50272k4(this.f36731kk), C10308dy.m50272k4(this.f36732to));
    }

    public C10310jd(float f, float f2, float f3, float f4) {
        this.f36730k4 = f;
        this.f36733x1 = f2;
        this.f36731kk = f3;
        this.f36732to = f4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12007ix m50276k4(C3786fa c3786fa) {
        return new C12007ix(c3786fa.m15131kk(this.f36730k4), c3786fa.m15131kk(this.f36733x1), c3786fa.m15131kk(this.f36731kk), c3786fa.m15131kk(this.f36732to));
    }
}
