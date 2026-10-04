package com.aspose.slides.internal.p258lv;

import com.aspose.slides.internal.p151gj.C4318fa;
import com.aspose.slides.internal.p151gj.C4320jd;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p420th.C10971um;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p505xn.C12565ks;

/* JADX INFO: renamed from: com.aspose.slides.internal.lv.v4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6255v4 extends C6257wy {
    public C6255v4(C6258x1 c6258x1) {
        super(c6258x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25378k4(C10971um c10971um, short s) {
        C12007ix c12007ixClone = C6240ix.m25273kk(c10971um).Clone();
        if (c12007ixClone.m56571to() < -32768.0f || c12007ixClone.m56571to() > 32767.0f || c12007ixClone.m56556h4() < -32768.0f || c12007ixClone.m56556h4() > 32767.0f || c12007ixClone.m56554dy() < -32768.0f || c12007ixClone.m56554dy() > 32767.0f || c12007ixClone.m56558k4() < -32768.0f || c12007ixClone.m56558k4() > 32767.0f) {
            return;
        }
        C6260yd c6260yd = new C6260yd(m25385m9());
        c6260yd.m25413k4();
        m25384h4().m25293x1(s);
        m25384h4().m25284k4(C12565ks.m58608k4(c12007ixClone.m56571to()), C12565ks.m58608k4(c12007ixClone.m56556h4()), C12565ks.m58608k4(c12007ixClone.m56554dy()), C12565ks.m58608k4(c12007ixClone.m56558k4()));
        m25384h4().m25284k4(C12565ks.m58608k4(c12007ixClone.m56571to()), C12565ks.m58608k4(c12007ixClone.m56556h4()), C12565ks.m58608k4(c12007ixClone.m56554dy()), C12565ks.m58608k4(c12007ixClone.m56558k4()));
        m25384h4().m25294x1(0, 5, false);
        m25384h4().m25294x1(0, 1, false);
        m25384h4().m25294x1(0, 1, false);
        m25384h4().m25294x1(0, 1, false);
        new C6236du(m25385m9()).m25256k4((c10971um.m53107x1() == null || !C6251u4.m25364kk(c10971um)) ? new C4318fa(C5656k4.f15509cw) : c10971um.m53107x1());
        new C6253up(m25385m9()).m25370k4(c10971um.m53098k4() != null ? c10971um.m53098k4() : new C4320jd(C5656k4.f15629ze, 1.0f));
        m25384h4().m25294x1(1, 4, false);
        m25384h4().m25294x1(1, 4, false);
        C6233bv c6233bv = new C6233bv(m25385m9());
        c6233bv.m25244x1();
        c6233bv.m25242kk();
        new C6254uz(m25385m9()).m25377kk(c10971um);
        c6233bv.m25239k4();
        c6260yd.m25414k4(83);
    }
}
