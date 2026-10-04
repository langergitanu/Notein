package com.aspose.slides.internal.p318oh;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p288n1.C6682kk;
import com.aspose.slides.internal.p539z4.AbstractC13373f9;
import com.aspose.slides.internal.p539z4.C13383j2;
import com.aspose.slides.internal.p539z4.C13402rv;
import com.aspose.slides.internal.p539z4.C13417w6;

/* JADX INFO: renamed from: com.aspose.slides.internal.oh.kp */
/* JADX INFO: loaded from: classes4.dex */
public class C7064kp extends AbstractC7052e0 {

    /* JADX INFO: renamed from: k4 */
    private final int f19216k4;

    public C7064kp(int i) {
        this.f19216k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC13373f9 m27585k4(C3134k4 c3134k4) {
        C13383j2 c13383j2 = new C13383j2();
        long position = c3134k4.m13371ck().getPosition();
        c13383j2.m62058k4(C6682kk.m26433k4(c3134k4));
        c13383j2.m62154k4(c3134k4.m13386x6());
        c13383j2.m62156k4((C13417w6) new C7091wp().m27612k4(c3134k4));
        c13383j2.m62155k4((C13402rv) new C7061jd(this.f19216k4 - ((int) (c3134k4.m13371ck().getPosition() - position))).m27582k4(c3134k4));
        return c13383j2;
    }
}
