package com.aspose.slides.internal.p386rs;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p110ek.C3749k4;
import com.aspose.slides.internal.p171hq.C4616ca;
import com.aspose.slides.internal.p251li.C6045bz;
import com.aspose.slides.internal.p251li.C6061ix;
import com.aspose.slides.internal.p403so.C10281s7;
import com.aspose.slides.internal.p542z7.AbstractC13453k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.rs.x6 */
/* JADX INFO: loaded from: classes4.dex */
public class C10104x6 extends AbstractC13453k4 {
    @Override // com.aspose.slides.internal.p542z7.AbstractC13453k4
    /* JADX INFO: renamed from: k4 */
    public boolean mo49687k4(C6045bz[] c6045bzArr, AbstractC3150x6 abstractC3150x6) {
        C6061ix c6061ix = new C6061ix(c6045bzArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        long position = abstractC3150x6.getPosition();
        c6061ix.m24528kk(c3134k4.m13386x6());
        c6061ix.m24531to(c3134k4.m13386x6());
        c6061ix.m24520du(c3134k4.m13386x6());
        c6061ix.m24524k4((C4616ca) new C10281s7().m50235k4(c3134k4));
        c6061ix.m24525k4(C3749k4.m15052to(c6061ix.m24523jd(), c3134k4));
        c6061ix.m24526k4(c3134k4.m13372dy(c6061ix.mo24432H_() - ((int) (abstractC3150x6.getPosition() - position))));
        c6045bzArr[0] = c6061ix;
        return true;
    }
}
