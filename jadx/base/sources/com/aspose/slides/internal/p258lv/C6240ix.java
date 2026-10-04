package com.aspose.slides.internal.p258lv;

import com.aspose.slides.internal.p420th.AbstractC10972up;
import com.aspose.slides.internal.p420th.AbstractC10973uz;
import com.aspose.slides.internal.p420th.C10955du;
import com.aspose.slides.internal.p420th.C10971um;
import com.aspose.slides.internal.p420th.C10974v4;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.lv.ix */
/* JADX INFO: loaded from: classes4.dex */
public class C6240ix extends AbstractC10972up {

    /* JADX INFO: renamed from: k4 */
    private float f17669k4;

    /* JADX INFO: renamed from: kk */
    private float f17670kk;

    /* JADX INFO: renamed from: to */
    private float f17671to;

    /* JADX INFO: renamed from: x1 */
    private float f17672x1;

    private C6240ix() {
    }

    /* JADX INFO: renamed from: kk */
    public static C12007ix m25273kk(C10971um c10971um) {
        C6240ix c6240ix = new C6240ix();
        c6240ix.m53112x1((AbstractC10973uz) c10971um);
        float f = c6240ix.f17669k4;
        float f2 = c6240ix.f17672x1;
        return new C12007ix(f, f2, c6240ix.f17670kk - f, c6240ix.f17671to - f2);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13523k4(C10955du c10955du) {
        m25272k4(c10955du.m52919k4().m53050k4().Clone());
        m25272k4(c10955du.m52919k4().m53057x1().Clone());
        m25272k4(c10955du.m52919k4().m53053kk().Clone());
        m25272k4(c10955du.m52919k4().m53055to().Clone());
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13528k4(C10974v4 c10974v4) {
        for (int i = 0; i < c10974v4.m53117k4().size(); i++) {
            m25272k4(c10974v4.m53117k4().get_Item(i).Clone().Clone());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m25272k4(C12025x6 c12025x6) {
        if (c12025x6.m56897x1() > this.f17670kk) {
            this.f17670kk = c12025x6.m56897x1();
        }
        if (c12025x6.m56895kk() > this.f17671to) {
            this.f17671to = c12025x6.m56895kk();
        }
        if (c12025x6.m56897x1() < this.f17669k4) {
            this.f17669k4 = c12025x6.m56897x1();
        }
        if (c12025x6.m56895kk() < this.f17672x1) {
            this.f17672x1 = c12025x6.m56895kk();
        }
    }
}
