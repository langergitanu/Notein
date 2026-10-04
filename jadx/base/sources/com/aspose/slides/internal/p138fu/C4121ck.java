package com.aspose.slides.internal.p138fu;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p154gr.C4375kk;
import com.aspose.slides.internal.p420th.C10950bv;
import com.aspose.slides.internal.p420th.C10971um;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12018u4;

/* JADX INFO: renamed from: com.aspose.slides.internal.fu.ck */
/* JADX INFO: loaded from: classes.dex */
public class C4121ck {

    /* JADX INFO: renamed from: k4 */
    private static final C11913yj f11287k4 = new C11913yj();

    /* JADX INFO: renamed from: k4 */
    public static C10971um m16485k4(C12018u4 c12018u4) {
        C10971um c10971um = new C10971um();
        C11896dy c11896dyM55504k4 = C11896dy.m55504k4(c12018u4);
        if (C4375kk.m17631k4(c11896dyM55504k4)) {
            c10971um.m52930k4(C10950bv.m52892k4(c11896dyM55504k4.m55565kk(), true));
        }
        return c10971um;
    }

    /* JADX INFO: renamed from: x1 */
    private static C12007ix m16487x1(C3134k4 c3134k4) {
        return C12007ix.m56541k4(c3134k4.m13386x6(), c3134k4.m13386x6(), c3134k4.m13386x6(), c3134k4.m13386x6());
    }

    /* JADX INFO: renamed from: k4 */
    public static C12018u4 m16486k4(C3134k4 c3134k4) {
        c3134k4.m13384uz();
        c3134k4.m13384uz();
        long jM13384uz = c3134k4.m13384uz();
        c3134k4.m13384uz();
        m16487x1(c3134k4);
        C11896dy c11896dy = new C11896dy();
        for (int i = 0; i < (4294967295L & jM13384uz); i++) {
            c11896dy.m55578x1(m16487x1(c3134k4).Clone());
        }
        return new C12018u4(c11896dy);
    }
}
