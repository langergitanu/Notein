package com.aspose.slides.internal.p386rs;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p171hq.C4616ca;
import com.aspose.slides.internal.p251li.C6045bz;
import com.aspose.slides.internal.p251li.C6100yj;
import com.aspose.slides.internal.p403so.C10281s7;
import com.aspose.slides.internal.p542z7.AbstractC13453k4;
import com.aspose.slides.internal.p542z7.C13454kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.rs.ck */
/* JADX INFO: loaded from: classes4.dex */
public class C10061ck extends AbstractC13453k4 {
    @Override // com.aspose.slides.internal.p542z7.AbstractC13453k4
    /* JADX INFO: renamed from: k4 */
    public boolean mo49687k4(C6045bz[] c6045bzArr, AbstractC3150x6 abstractC3150x6) {
        C6100yj c6100yj = new C6100yj(c6045bzArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        c6100yj.m24717k4(c3134k4.m13384uz());
        c6100yj.m24722kk(c3134k4.m13386x6());
        c6100yj.m24718k4((C4616ca) new C10281s7().m50235k4(c3134k4));
        c6100yj.m24727x1(c3134k4.m13384uz());
        if (c6100yj.m24711c5()) {
            c6100yj.m24720k4(C13454kk.m62591kk(c6100yj.m24726up(), c3134k4));
        } else {
            boolean zM24724kk = c6100yj.m24724kk();
            long jM24726up = c6100yj.m24726up();
            if (zM24724kk) {
                c6100yj.m24720k4(C13454kk.m62595x1(jM24726up, c3134k4));
            } else {
                c6100yj.m24720k4(C13454kk.m62593to(jM24726up, c3134k4));
            }
        }
        c6045bzArr[0] = c6100yj;
        return true;
    }
}
