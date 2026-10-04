package com.aspose.slides.internal.p220k7;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p227kg.C5673k4;
import com.aspose.slides.internal.p277mm.C6400x1;
import com.aspose.slides.internal.p359qf.C9856du;
import com.aspose.slides.internal.p421tk.C10988bz;
import com.aspose.slides.internal.p421tk.C11004ix;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12019um;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.k7.rv */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5636rv extends AbstractC5642x1 {
    /* JADX INFO: renamed from: k4 */
    public static double m23030k4(int i, int i2, double d) {
        if (m23032k4(i) && m23032k4(i2)) {
            return d;
        }
        switch (i) {
            case 0:
            case 1:
            case 2:
                d /= 96.0d;
                break;
            case 3:
                d /= 72.0d;
                break;
            case 4:
                break;
            case 5:
                d /= 300.0d;
                break;
            case 6:
                d /= 25.399999618530273d;
                break;
            default:
                throw new ArgumentException("Invalid GraphicsUnit");
        }
        switch (i2) {
            case 0:
            case 2:
                return d * 96.0d;
            case 1:
                return d * 96.0d;
            case 3:
                return d * 72.0d;
            case 4:
                return d;
            case 5:
                return d * 300.0d;
            case 6:
                return d * 25.399999618530273d;
            default:
                throw new ArgumentException("Invalid GraphicsUnit");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo23033k4(C11004ix c11004ix, C12007ix c12007ix, C12013m9 c12013m9, C12019um c12019um, C9856du c9856du);

    @Override // com.aspose.slides.internal.p220k7.AbstractC5642x1
    /* JADX INFO: renamed from: kk */
    public void mo23010kk(C10988bz c10988bz, C9856du c9856du) {
        C12019um c12019umM48632ck;
        C11004ix c11004ix = (C11004ix) c10988bz;
        c9856du.m48661to(c11004ix.m53289to() & 255);
        c9856du.m48648k4(c11004ix.m53288m9(), c11004ix.m53287kk());
        if (c11004ix.m53280dy() != -1) {
            c9856du.m48634du(c11004ix.m53280dy());
            c12019umM48632ck = c9856du.m48632ck();
        } else {
            c12019umM48632ck = null;
        }
        C12019um c12019um = c12019umM48632ck;
        C12007ix c12007ixClone = c11004ix.m53281jd().mo62062k4().Clone();
        C12013m9 c12013m9M23031k4 = (C12013m9) c9856du.m48635dy().deepClone();
        if (C14116yg.m67480k4(c10988bz.m53204ks().m23131k4().m53171c5() - 96.0f) > 0.001d) {
            c12013m9M23031k4 = m23031k4(c12013m9M23031k4, c9856du, c10988bz.m53204ks());
        }
        mo23033k4(c11004ix, c12007ixClone.Clone(), c12013m9M23031k4, c12019um, c9856du);
    }

    /* JADX INFO: renamed from: k4 */
    private C12013m9 m23031k4(C12013m9 c12013m9, C9856du c9856du, C5673k4 c5673k4) {
        double dM23030k4;
        if (m23032k4(c12013m9.m56640fa())) {
            dM23030k4 = m23032k4(c9856du.m48668x6()) ? c12013m9.m56639dy() : (c5673k4.m23131k4().m53171c5() / 96.0f) * c12013m9.m56639dy();
        } else {
            float fM48659rv = c9856du.m48659rv();
            if (c9856du.m48668x6() == 1) {
                fM48659rv = 1.0f;
            }
            dM23030k4 = m23030k4(c12013m9.m56640fa(), c9856du.m48668x6(), (c5673k4.m23131k4().m53171c5() / 96.0f) * (c12013m9.m56639dy() / fM48659rv));
        }
        return C6400x1.m26263k4(c12013m9.m56651x1().m56527du(), (float) dM23030k4, c12013m9.m56642jd(), c9856du.m48668x6() == 1 ? 2 : c9856du.m48668x6());
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m23032k4(int i) {
        return i == 1 || i == 2 || i == 0;
    }
}
