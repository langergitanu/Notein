package com.aspose.slides.internal.p548zf;

import com.aspose.slides.internal.p069cw.C2638du;
import com.aspose.slides.internal.p109ei.AbstractC3734k4;
import com.aspose.slides.internal.p109ei.AbstractC3740rv;
import com.aspose.slides.internal.p251li.C6061ix;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12019um;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.zf.yj */
/* JADX INFO: loaded from: classes5.dex */
public class C13588yj extends AbstractC3740rv {

    /* JADX INFO: renamed from: k4 */
    private final AbstractC3734k4 f45142k4 = new C13585wl(this);

    @Override // com.aspose.slides.internal.p109ei.AbstractC3746x1
    /* JADX INFO: renamed from: k4 */
    public AbstractC3734k4 mo15042k4() {
        return this.f45142k4;
    }

    @Override // com.aspose.slides.internal.p109ei.AbstractC3740rv
    /* JADX INFO: renamed from: k4 */
    public void mo15036k4(C6061ix c6061ix, C12007ix c12007ix, C12013m9 c12013m9, C12019um c12019um, C2638du c2638du) {
        AbstractC12008jd abstractC12008jd = (AbstractC12008jd) c2638du.m12052k4();
        if (C14116yg.m67480k4(c12007ix.m56550c5()) < 0.001d || C14116yg.m67480k4(c12007ix.m56575x1()) < 0.001d) {
            abstractC12008jd.mo17554k4(c6061ix.m24522fa(), c12013m9, c2638du.m12067m9(), c12007ix.m56557jd(), c12007ix.m56551ck(), c12019um);
        } else {
            abstractC12008jd.mo17556k4(c6061ix.m24522fa(), c12013m9, c2638du.m12067m9(), c12007ix.Clone(), c12019um);
        }
    }
}
