package com.aspose.slides.internal.p386rs;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p251li.C6045bz;
import com.aspose.slides.internal.p251li.C6067ks;
import com.aspose.slides.internal.p542z7.AbstractC13453k4;
import com.aspose.slides.internal.p542z7.C13454kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.rs.up */
/* JADX INFO: loaded from: classes4.dex */
public class C10094up extends AbstractC13453k4 {
    @Override // com.aspose.slides.internal.p542z7.AbstractC13453k4
    /* JADX INFO: renamed from: k4 */
    public boolean mo49687k4(C6045bz[] c6045bzArr, AbstractC3150x6 abstractC3150x6) {
        C6067ks c6067ks = new C6067ks(c6045bzArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        c6067ks.m24569k4(c3134k4.m13384uz());
        if (c6067ks.m24567dy()) {
            c6067ks.m24570k4(C13454kk.m62591kk(c6067ks.m24568jd(), c3134k4));
        } else {
            boolean zM24573to = c6067ks.m24573to();
            long jM24568jd = c6067ks.m24568jd();
            if (zM24573to) {
                c6067ks.m24570k4(C13454kk.m62595x1(jM24568jd, c3134k4));
            } else {
                c6067ks.m24570k4(C13454kk.m62593to(jM24568jd, c3134k4));
            }
        }
        c6045bzArr[0] = c6067ks;
        return true;
    }
}
