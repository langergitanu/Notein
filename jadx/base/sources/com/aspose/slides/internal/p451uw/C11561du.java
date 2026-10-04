package com.aspose.slides.internal.p451uw;

import com.aspose.slides.internal.p069cw.AbstractC2640kk;
import com.aspose.slides.internal.p069cw.C2638du;
import com.aspose.slides.internal.p251li.C6045bz;
import com.aspose.slides.internal.p251li.C6098xw;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12018u4;

/* JADX INFO: renamed from: com.aspose.slides.internal.uw.du */
/* JADX INFO: loaded from: classes4.dex */
public class C11561du extends AbstractC2640kk {
    @Override // com.aspose.slides.internal.p069cw.AbstractC2640kk
    /* JADX INFO: renamed from: x1 */
    public void mo12099x1(C6045bz c6045bz, C2638du c2638du) {
        C6098xw c6098xw = (C6098xw) c6045bz;
        c2638du.m12065kk(c6098xw.m24703to() & 255);
        C12018u4 c12018u4M56768x1 = c2638du.m12042ck().m56768x1();
        C11913yj c11913yjM12070rv = c2638du.m12070rv();
        int iM24402c5 = c6045bz.m24443rv().m52376k4().m24402c5() / 96;
        if (c2638du.m12050ix() == 1 && iM24402c5 > 1) {
            float f = iM24402c5;
            c11913yjM12070rv.m55769k4(new C11913yj(f, 0.0f, 0.0f, f, 0.0f, 0.0f), 1);
        }
        c11913yjM12070rv.m55769k4(c2638du.m12071to(), 1);
        c12018u4M56768x1.m56771x1(c11913yjM12070rv);
        int iM24702kk = c6098xw.m24702kk() & 255;
        if (iM24702kk == 0) {
            c2638du.m12062k4(c12018u4M56768x1);
            return;
        }
        if (iM24702kk == 1) {
            c2638du.m12064kk().m56761kk(c12018u4M56768x1);
            return;
        }
        if (iM24702kk == 2) {
            c2638du.m12064kk().m56766to(c12018u4M56768x1);
            return;
        }
        if (iM24702kk == 3) {
            c2638du.m12064kk().m56746du(c12018u4M56768x1);
        } else if (iM24702kk == 4) {
            c2638du.m12064kk().m56774x1(c12018u4M56768x1);
        } else {
            if (iM24702kk != 5) {
                return;
            }
            c2638du.m12064kk().m56753k4(c12018u4M56768x1);
        }
    }
}
