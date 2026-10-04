package com.aspose.slides.internal.p137ft;

import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p042bn.C1756ts;
import com.aspose.slides.internal.p042bn.C1758um;
import com.aspose.slides.internal.p075d5.AbstractC3024x1;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p100e4.C3572qq;
import com.aspose.slides.internal.p186in.C5105k4;
import com.aspose.slides.internal.p190is.AbstractC5117x1;
import com.aspose.slides.internal.p190is.C5115kk;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p283mv.C6547ar;
import com.aspose.slides.internal.p283mv.C6553c6;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p501xj.C12537k4;
import com.aspose.slides.internal.p501xj.C12538kk;
import com.aspose.slides.internal.p501xj.C12540x1;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ft.kk */
/* JADX INFO: loaded from: classes.dex */
public class C4118kk extends AbstractC4119x1 {
    public C4118kk(AbstractC3150x6 abstractC3150x6) {
        super(abstractC3150x6);
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC3024x1 m16481k4() {
        C5105k4 c5105k4 = new C5105k4();
        C1756ts c1756ts = new C1756ts();
        C6553c6 c6553c6 = new C6553c6();
        long position = m16483kk().getPosition();
        C1756ts[] c1756tsArr = {c1756ts};
        boolean zM26381k4 = c6553c6.m26381k4(c1756tsArr, m16483kk());
        C1756ts c1756ts2 = c1756tsArr[0];
        if (zM26381k4) {
            C12014ne c12014neClone = c1756ts2.m9425k4().m58223h4().Clone();
            if (c12014neClone.m56663c5() != 0 && c12014neClone.m56683x1() != 0) {
                c5105k4.m21945k4(c1756ts2);
            }
        } else {
            m16483kk().seek(position, 0);
        }
        C1758um[] c1758umArr = {new C1758um()};
        boolean zM26380k4 = new C6547ar().m26380k4(c1758umArr, m16483kk());
        C1758um c1758um = c1758umArr[0];
        if (!zM26380k4) {
            throw new C12538kk();
        }
        c5105k4.m21946k4(c1758um);
        do {
            if (m16483kk().getPosition() >= (((((c5105k4.m21944jd().m9451to() & 4294967295L) * 2) & 4294967295L) + ((long) (c5105k4.m21940ck() != null ? c5105k4.m21940ck().m9430kk() : 0))) & 4294967295L)) {
                break;
            }
            C1752sv c1752sv = new C1752sv();
            long position2 = m16483kk().getPosition();
            C1752sv[] c1752svArr = {c1752sv};
            boolean zM21975k4 = AbstractC5117x1.m21975k4(c1752svArr, m16483kk());
            C1752sv c1752sv2 = c1752svArr[0];
            if (!zM21975k4) {
                throw new C12540x1("Unable to read wmf records");
            }
            AbstractC5117x1 abstractC5117x1M21970k4 = C5115kk.m21970k4(c1752sv2.m9405yj());
            c1752svArr[0] = c1752sv2;
            boolean zMo21976x1 = abstractC5117x1M21970k4.mo21976x1(c1752svArr, m16483kk());
            C1752sv c1752sv3 = c1752svArr[0];
            if (zMo21976x1) {
                c5105k4.m12729k4().addItem(c1752sv3);
            } else {
                C6005k4.m24263kk(C14113y2.m67408k4("***Error***: Failed to read wmf record. Type:", C14042ak.m66410k4(C3572qq.class, c1752sv3.m9405yj())));
            }
            if (c1752sv3.m9405yj() == 0) {
                break;
            }
            long jM9402up = (((c1752sv3.m9402up() & 4294967295L) * 2) & 4294967295L) - ((long) ((int) (m16483kk().getPosition() - position2)));
            if (jM9402up > 0) {
                m16483kk().seek(jM9402up, 1);
            } else if (jM9402up < 0) {
                throw new C12537k4("Readed more bytes than the record size.");
            }
        } while (m16483kk().getPosition() + 6 <= (((((c5105k4.m21944jd().m9451to() & 4294967295L) * 2) & 4294967295L) + ((long) (c5105k4.m21940ck() != null ? c5105k4.m21940ck().m9430kk() : 0))) & 4294967295L));
        return c5105k4;
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m16482x1() {
        long position = m16483kk().getPosition();
        try {
            if (!new C6553c6().m26381k4(new C1756ts[]{new C1756ts()}, m16483kk())) {
                m16483kk().seek(position, 0);
            }
            boolean z = !(!new C6547ar().m26380k4(new C1758um[]{new C1758um()}, m16483kk()));
            m16483kk().seek(position, 0);
            return z;
        } catch (Throwable th) {
            m16483kk().seek(position, 0);
            throw th;
        }
    }
}
