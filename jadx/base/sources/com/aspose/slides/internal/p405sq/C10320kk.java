package com.aspose.slides.internal.p405sq;

import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.sq.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C10320kk extends AbstractC10321m9 {

    /* JADX INFO: renamed from: k4 */
    private C12003du f36747k4;

    public C10320kk(C1569kk c1569kk, C12003du c12003du) {
        super(c1569kk);
        C12003du c12003du2 = new C12003du();
        this.f36747k4 = c12003du2;
        c12003du.CloneTo(c12003du2);
    }

    /* JADX INFO: renamed from: k4 */
    public String m50307k4() {
        return (this.f36747k4.m56501c5() & 255) == 0 ? C12003du.m56458up().m56508k4() : C14113y2.m67402k4("#{0:x8}", Long.valueOf(((long) this.f36747k4.m56506h4()) & 4294967295L));
    }
}
