package com.aspose.slides.internal.p109ei;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p069cw.C2638du;
import com.aspose.slides.internal.p251li.C6045bz;
import com.aspose.slides.internal.p251li.C6061ix;
import com.aspose.slides.internal.p411sz.C10802k4;
import com.aspose.slides.internal.p427tt.C11113x1;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12019um;

/* JADX INFO: renamed from: com.aspose.slides.internal.ei.rv */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3740rv extends AbstractC3746x1 {
    /* JADX INFO: renamed from: k4 */
    public static double m15034k4(int i, int i2, double d) {
        switch (i2) {
            case 0:
            case 1:
            case 2:
                d *= 96.0d;
                break;
            case 3:
                d *= 72.0d;
                break;
            case 4:
                break;
            case 5:
                d *= 300.0d;
                break;
            case 6:
                d *= 25.399999618530273d;
                break;
            default:
                throw new ArgumentException("Invalid target GraphicsUnit");
        }
        switch (i) {
            case 0:
            case 1:
            case 2:
                return d / 96.0d;
            case 3:
                return d / 72.0d;
            case 4:
                return d;
            case 5:
                return d / 300.0d;
            case 6:
                return d / 25.399999618530273d;
            default:
                throw new ArgumentException("Invalid source GraphicsUnit");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo15036k4(C6061ix c6061ix, C12007ix c12007ix, C12013m9 c12013m9, C12019um c12019um, C2638du c2638du);

    @Override // com.aspose.slides.internal.p109ei.AbstractC3746x1
    /* JADX INFO: renamed from: kk */
    public void mo15013kk(C6045bz c6045bz, C2638du c2638du) {
        C12019um c12019umM12047fa;
        C6061ix c6061ix = (C6061ix) c6045bz;
        c2638du.m12072to(c6061ix.m24530to() & 255);
        c2638du.m12059k4(c6061ix.m24521dy(), c6061ix.m24529kk());
        if (c6061ix.m24518c5() != -1) {
            c2638du.m12044du(c6061ix.m24518c5());
            c12019umM12047fa = c2638du.m12047fa();
        } else {
            c12019umM12047fa = null;
        }
        C12019um c12019um = c12019umM12047fa;
        C12007ix c12007ixClone = c6061ix.m24519ck().mo19058k4().Clone();
        mo15036k4(c6061ix, c12007ixClone.Clone(), m15035k4(c2638du.m12041c5(), c2638du, c6045bz.m24443rv()), c12019um, c2638du);
    }

    /* JADX INFO: renamed from: k4 */
    private C12013m9 m15035k4(C12013m9 c12013m9, C2638du c2638du, C10802k4 c10802k4) {
        double dM15034k4;
        if (c12013m9.m56640fa() <= 2) {
            dM15034k4 = c2638du.m12050ix() <= 2 ? c12013m9.m56639dy() : (c10802k4.m52376k4().m24406jd() / 96.0f) * c12013m9.m56639dy();
        } else {
            dM15034k4 = (c12013m9.m56640fa() > 3 || c2638du.m12050ix() != 1) ? m15034k4(2, c2638du.m12050ix(), m15034k4(c12013m9.m56640fa(), c2638du.m12050ix(), (c10802k4.m52376k4().m24406jd() / 96.0f) * (c12013m9.m56639dy() / c2638du.m12069ne()))) : ((c2638du.m12069ne() * c12013m9.m56639dy()) * 96.0f) / 72.0f;
        }
        return C11113x1.m53658k4(c12013m9.m56651x1().m56527du(), (float) dM15034k4, c12013m9.m56642jd(), c2638du.m12050ix() != 1 ? c2638du.m12050ix() : 2);
    }
}
