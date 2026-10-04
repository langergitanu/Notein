package com.aspose.slides.internal.p318oh;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p539z4.AbstractC13373f9;
import com.aspose.slides.internal.p539z4.C13364c5;
import com.aspose.slides.internal.p539z4.C13370dy;
import com.aspose.slides.internal.p539z4.C13377gi;
import com.aspose.slides.internal.p539z4.C13385jd;
import com.aspose.slides.internal.p539z4.C13430yo;

/* JADX INFO: renamed from: com.aspose.slides.internal.oh.c6 */
/* JADX INFO: loaded from: classes4.dex */
public class C7047c6 extends AbstractC7052e0 {

    /* JADX INFO: renamed from: k4 */
    private final long f19212k4;

    public C7047c6(long j) {
        this.f19212k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC13373f9 m27569k4(C3134k4 c3134k4) {
        C13377gi c13377gi = new C13377gi();
        if ((this.f19212k4 & 2) > 0) {
            c13377gi.m62109k4((C13430yo) new C7073ri().m27594k4(c3134k4));
        }
        C13370dy[] c13370dyArr = new C13370dy[2];
        long j = this.f19212k4;
        long j2 = 8 & j;
        if ((4 & j) == 0) {
            if (j2 != 0) {
                if ((j & 16) == 0) {
                    c13370dyArr[1] = (C13385jd) new C7050du().m27572k4(c3134k4);
                } else {
                    c13370dyArr[0] = (C13385jd) new C7050du().m27572k4(c3134k4);
                    c13370dyArr[1] = (C13385jd) new C7050du().m27572k4(c3134k4);
                }
            }
        } else if (j2 == 0) {
            if ((j & 16) == 0) {
                c13370dyArr[0] = (C13364c5) new C7079to().m27600k4(c3134k4);
            } else {
                c13370dyArr[0] = (C13385jd) new C7050du().m27572k4(c3134k4);
            }
        }
        c13377gi.m62110k4(c13370dyArr);
        return c13377gi;
    }
}
