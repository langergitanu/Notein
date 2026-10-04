package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.aw */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0765aw extends AbstractC13836mg {

    /* JADX INFO: renamed from: x1 */
    private C0886d8 f3962x1;

    public AbstractC0765aw(C0886d8 c0886d8) {
        super(c0886d8.m5003ks());
        this.f3962x1 = c0886d8;
    }

    /* JADX INFO: renamed from: k4 */
    public static double m3755k4(double d) {
        if (C14044b3.m66425h4(C14116yg.m67475k4(d)).length() <= 11) {
            return d;
        }
        int length = C14044b3.m66425h4(C14116yg.m67475k4(d)).length();
        double length2 = C14116yg.m67475k4(d % 1.0d) > 0.0d ? C14044b3.m66425h4(C14116yg.m67475k4(r2)).length() - 2 : 0.0d;
        if (length2 <= 0.0d) {
            return d;
        }
        double d2 = length - 11;
        if (d2 > length2) {
            return C14116yg.m67477k4(d, 0);
        }
        int iM27462to = C7019kk.m27462to(Double.valueOf(length2 - d2), 14);
        if (iM27462to > 15) {
            iM27462to = 15;
        }
        return C14116yg.m67477k4(d, iM27462to);
    }

    /* JADX INFO: renamed from: ck */
    public final C0886d8 m3756ck() {
        return this.f3962x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final String m3757m9() {
        return this.f3962x1.m5012up().m64957kk();
    }
}
