package com.aspose.slides.internal.p451uw;

import com.aspose.slides.internal.p069cw.AbstractC2640kk;
import com.aspose.slides.internal.p069cw.C2638du;
import com.aspose.slides.internal.p251li.C6045bz;
import com.aspose.slides.internal.p251li.C6080t6;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12018u4;

/* JADX INFO: renamed from: com.aspose.slides.internal.uw.to */
/* JADX INFO: loaded from: classes4.dex */
public class C11564to extends AbstractC2640kk {
    @Override // com.aspose.slides.internal.p069cw.AbstractC2640kk
    /* JADX INFO: renamed from: x1 */
    public void mo12099x1(C6045bz c6045bz, C2638du c2638du) {
        C6080t6 c6080t6 = (C6080t6) c6045bz;
        C12018u4 c12018u4 = new C12018u4(c6080t6.m24628to().mo19058k4().Clone().Clone());
        C11913yj c11913yjM12070rv = c2638du.m12070rv();
        c11913yjM12070rv.m55769k4(c2638du.m12071to(), 1);
        c12018u4.m56771x1(c11913yjM12070rv);
        int iM24627kk = c6080t6.m24627kk() & 255;
        if (iM24627kk == 0) {
            c2638du.m12062k4(c12018u4);
            return;
        }
        if (iM24627kk == 1) {
            c2638du.m12064kk().m56761kk(c12018u4);
            return;
        }
        if (iM24627kk == 2) {
            c2638du.m12064kk().m56766to(c12018u4);
            return;
        }
        if (iM24627kk == 3) {
            c2638du.m12064kk().m56746du(c12018u4);
        } else if (iM24627kk == 4) {
            c2638du.m12064kk().m56774x1(c12018u4);
        } else {
            if (iM24627kk != 5) {
                return;
            }
            c2638du.m12064kk().m56753k4(c12018u4);
        }
    }
}
