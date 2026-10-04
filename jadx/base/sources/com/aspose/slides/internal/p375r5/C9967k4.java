package com.aspose.slides.internal.p375r5;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p069cw.AbstractC2640kk;
import com.aspose.slides.internal.p069cw.C2638du;
import com.aspose.slides.internal.p171hq.AbstractC4615c6;
import com.aspose.slides.internal.p171hq.C4612bv;
import com.aspose.slides.internal.p171hq.C4625g8;
import com.aspose.slides.internal.p171hq.C4630he;
import com.aspose.slides.internal.p171hq.C4633j2;
import com.aspose.slides.internal.p171hq.C4646nv;
import com.aspose.slides.internal.p171hq.C4648qm;
import com.aspose.slides.internal.p171hq.C4652rv;
import com.aspose.slides.internal.p171hq.C4674xk;
import com.aspose.slides.internal.p171hq.C4675xw;
import com.aspose.slides.internal.p251li.C6045bz;
import com.aspose.slides.internal.p251li.C6097xk;

/* JADX INFO: renamed from: com.aspose.slides.internal.r5.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C9967k4 extends AbstractC2640kk {
    @Override // com.aspose.slides.internal.p069cw.AbstractC2640kk
    /* JADX INFO: renamed from: x1 */
    public void mo12099x1(C6045bz c6045bz, C2638du c2638du) {
        Object objM19333kk;
        AbstractC4615c6 abstractC4615c6;
        C6097xk c6097xk = (C6097xk) c6045bz;
        if (c6097xk.m24698kk() && c6097xk.m24692jd() == null) {
            return;
        }
        int iM24691dy = c6097xk.m24691dy() & 255;
        switch (c6097xk.m24699to()) {
            case 0:
                throw new NotSupportedException("Invalid objects are not supported");
            case 1:
                C4652rv c4652rv = (C4652rv) c6097xk.m24692jd();
                objM19333kk = c4652rv.m19333kk();
                abstractC4615c6 = c4652rv;
                break;
            case 2:
                C4633j2 c4633j2 = (C4633j2) c6097xk.m24692jd();
                objM19333kk = c4633j2.m19160to();
                abstractC4615c6 = c4633j2;
                break;
            case 3:
                C4675xw c4675xw = (C4675xw) c6097xk.m24692jd();
                objM19333kk = c4675xw.m19486dy();
                abstractC4615c6 = c4675xw;
                break;
            case 4:
                C4630he c4630he = (C4630he) c6097xk.m24692jd();
                objM19333kk = c4630he.m19138kk();
                abstractC4615c6 = c4630he;
                break;
            case 5:
                C4648qm c4648qm = (C4648qm) c6097xk.m24692jd();
                objM19333kk = c4648qm.m19308k4().mo19130x1();
                abstractC4615c6 = c4648qm;
                break;
            case 6:
                C4674xk c4674xk = (C4674xk) c6097xk.m24692jd();
                objM19333kk = c4674xk.m19471dy();
                abstractC4615c6 = c4674xk;
                break;
            case 7:
                C4646nv c4646nv = (C4646nv) c6097xk.m24692jd();
                objM19333kk = c4646nv.m19265ne();
                abstractC4615c6 = c4646nv;
                break;
            case 8:
                C4625g8 c4625g8 = (C4625g8) c6097xk.m24692jd();
                objM19333kk = c4625g8.m19102m9();
                abstractC4615c6 = c4625g8;
                break;
            case 9:
                C4612bv c4612bv = (C4612bv) c6097xk.m24692jd();
                objM19333kk = c4612bv.m19041kk();
                abstractC4615c6 = c4612bv;
                break;
            default:
                throw new ArgumentOutOfRangeException();
        }
        c2638du.m12058k4(iM24691dy, objM19333kk, abstractC4615c6);
    }
}
