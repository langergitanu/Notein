package com.aspose.slides.internal.p109ei;

import com.aspose.slides.internal.p069cw.C2638du;
import com.aspose.slides.internal.p251li.C6045bz;
import com.aspose.slides.internal.p251li.C6049ck;
import com.aspose.slides.internal.p475wh.C12004dy;
import com.aspose.slides.internal.p475wh.C12013m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ei.dy */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3729dy extends AbstractC3746x1 {
    /* JADX INFO: renamed from: k4 */
    public final float m15016k4(C12013m9 c12013m9) {
        C12004dy c12004dyM56651x1 = c12013m9.m56651x1();
        return (c12013m9.m56639dy() * c12004dyM56651x1.m56536x1(c12013m9.m56642jd())) / c12004dyM56651x1.m56535to(c12013m9.m56642jd());
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo15017k4(C6049ck c6049ck, C2638du c2638du);

    @Override // com.aspose.slides.internal.p109ei.AbstractC3746x1
    /* JADX INFO: renamed from: kk */
    public void mo15013kk(C6045bz c6045bz, C2638du c2638du) {
        C6049ck c6049ck = (C6049ck) c6045bz;
        c2638du.m12072to(c6049ck.m24472kk() & 255);
        c2638du.m12059k4(c6049ck.m24475to(), c6049ck.m24477up());
        mo15017k4(c6049ck, c2638du);
    }
}
