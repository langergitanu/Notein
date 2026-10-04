package com.aspose.slides.internal.p451uw;

import com.aspose.slides.internal.p069cw.AbstractC2640kk;
import com.aspose.slides.internal.p069cw.C2638du;
import com.aspose.slides.internal.p251li.C6045bz;
import com.aspose.slides.internal.p251li.C6055f9;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p505xn.C12556ck;

/* JADX INFO: renamed from: com.aspose.slides.internal.uw.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C11563kk extends AbstractC2640kk {
    @Override // com.aspose.slides.internal.p069cw.AbstractC2640kk
    /* JADX INFO: renamed from: x1 */
    public void mo12099x1(C6045bz c6045bz, C2638du c2638du) {
        C6055f9 c6055f9 = (C6055f9) c6045bz;
        c2638du.m12076x1(c6055f9.m24497to() & 255);
        C11913yj c11913yjM12070rv = c2638du.m12070rv();
        c11913yjM12070rv.m55769k4(c2638du.m12071to(), 1);
        C12018u4 c12018u4M58560k4 = C12556ck.m58560k4(c2638du.m12051jd(), c11913yjM12070rv);
        int iM24496kk = c6055f9.m24496kk() & 255;
        if (iM24496kk == 0) {
            c2638du.m12062k4(c12018u4M58560k4);
            return;
        }
        if (iM24496kk == 1) {
            c2638du.m12062k4(C12556ck.m58561k4(AbstractC12008jd.m56582k4((AbstractC12002ck) c2638du.m12073u4()), c2638du.m12064kk(), c12018u4M58560k4));
            return;
        }
        if (iM24496kk == 2) {
            c2638du.m12064kk().m56766to(c12018u4M58560k4);
            return;
        }
        if (iM24496kk == 3) {
            c2638du.m12064kk().m56746du(c12018u4M58560k4);
        } else if (iM24496kk == 4) {
            c2638du.m12064kk().m56774x1(c12018u4M58560k4);
        } else {
            if (iM24496kk != 5) {
                return;
            }
            c2638du.m12064kk().m56753k4(c12018u4M58560k4);
        }
    }
}
