package com.aspose.slides.internal.p220k7;

import com.aspose.slides.internal.p359qf.C9856du;
import com.aspose.slides.internal.p421tk.C10988bz;
import com.aspose.slides.internal.p421tk.C10992ck;
import com.aspose.slides.internal.p475wh.C12004dy;
import com.aspose.slides.internal.p475wh.C12013m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.k7.dy */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5625dy extends AbstractC5642x1 {
    /* JADX INFO: renamed from: k4 */
    public final float m23013k4(C12013m9 c12013m9) {
        C12004dy c12004dyM56651x1 = c12013m9.m56651x1();
        return (c12013m9.m56639dy() * c12004dyM56651x1.m56536x1(c12013m9.m56642jd())) / c12004dyM56651x1.m56535to(c12013m9.m56642jd());
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo23014k4(C10992ck c10992ck, C9856du c9856du);

    @Override // com.aspose.slides.internal.p220k7.AbstractC5642x1
    /* JADX INFO: renamed from: kk */
    public void mo23010kk(C10988bz c10988bz, C9856du c9856du) {
        C10992ck c10992ck = (C10992ck) c10988bz;
        c9856du.m48661to(c10992ck.m53231kk() & 255);
        c9856du.m48648k4(c10992ck.m53234to(), c10992ck.m53223fa());
        mo23014k4(c10992ck, c9856du);
    }
}
