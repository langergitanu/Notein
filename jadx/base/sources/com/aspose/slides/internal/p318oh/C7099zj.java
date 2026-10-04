package com.aspose.slides.internal.p318oh;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p539z4.AbstractC13373f9;
import com.aspose.slides.internal.p539z4.C13378gk;
import com.aspose.slides.internal.p539z4.C13398qm;
import com.aspose.slides.internal.p539z4.C13430yo;

/* JADX INFO: renamed from: com.aspose.slides.internal.oh.zj */
/* JADX INFO: loaded from: classes4.dex */
public class C7099zj extends AbstractC7052e0 {

    /* JADX INFO: renamed from: k4 */
    private final long f19222k4;

    /* JADX INFO: renamed from: x1 */
    private final int f19223x1;

    public C7099zj(long j, int i) {
        this.f19222k4 = j;
        this.f19223x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC13373f9 m27620k4(C3134k4 c3134k4) {
        long position = c3134k4.m13371ck().getPosition();
        C13378gk c13378gk = new C13378gk();
        if ((this.f19222k4 & 2) > 0) {
            c13378gk.m62115k4((C13430yo) new C7073ri().m27594k4(c3134k4));
        }
        if (this.f19223x1 - ((int) (c3134k4.m13371ck().getPosition() - position)) > 24) {
            c13378gk.m62114k4((C13398qm) new C7092wy().m27613k4(c3134k4));
        }
        return c13378gk;
    }
}
