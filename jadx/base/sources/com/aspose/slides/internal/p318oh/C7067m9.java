package com.aspose.slides.internal.p318oh;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p501xj.C12537k4;
import com.aspose.slides.internal.p539z4.AbstractC13373f9;
import com.aspose.slides.internal.p539z4.C13412up;
import com.aspose.slides.internal.p539z4.C13425xw;

/* JADX INFO: renamed from: com.aspose.slides.internal.oh.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C7067m9 extends AbstractC7052e0 {
    /* JADX INFO: renamed from: k4 */
    public AbstractC13373f9 m27588k4(C3134k4 c3134k4) {
        C13412up c13412up = new C13412up();
        c13412up.m62368k4(c3134k4.m13386x6());
        long position = c3134k4.m13371ck().getPosition();
        c13412up.m62369k4((C13425xw) new C7077sv().m27598k4(c3134k4));
        if (((int) (c3134k4.m13371ck().getPosition() - position)) <= c13412up.m62370x1()) {
            return c13412up;
        }
        throw new C12537k4("Stream position is out of object bounds.");
    }
}
