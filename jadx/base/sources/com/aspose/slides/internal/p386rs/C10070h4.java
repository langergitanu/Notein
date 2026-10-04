package com.aspose.slides.internal.p386rs;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p251li.C6045bz;
import com.aspose.slides.internal.p251li.C6052dy;
import com.aspose.slides.internal.p542z7.AbstractC13453k4;
import com.aspose.slides.internal.p542z7.C13454kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.rs.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10070h4 extends AbstractC13453k4 {
    @Override // com.aspose.slides.internal.p542z7.AbstractC13453k4
    /* JADX INFO: renamed from: k4 */
    public boolean mo49687k4(C6045bz[] c6045bzArr, AbstractC3150x6 abstractC3150x6) {
        C6052dy c6052dy = new C6052dy(c6045bzArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        c6052dy.m24492kk(c3134k4.m13386x6());
        if (c6052dy.m24494to()) {
            c6052dy.m24490k4(C13454kk.m62594x1(c6052dy.m24487c5(), c3134k4));
        } else if (c6052dy.m24493kk()) {
            c6052dy.m24490k4(C13454kk.m62589k4(c6052dy.m24487c5(), c3134k4));
        } else {
            c6052dy.m24490k4(C13454kk.m62592kk(c6052dy.m24487c5(), c3134k4));
        }
        c6045bzArr[0] = c6052dy;
        return true;
    }
}
