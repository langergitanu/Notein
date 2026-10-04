package com.aspose.slides.internal.p442uj;

import com.aspose.slides.internal.p019ac.C1352to;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p183ij.C5019ne;
import com.aspose.slides.internal.p183ij.C5071x6;
import com.aspose.slides.internal.p206jj.C5485kk;
import com.aspose.slides.internal.p498xe.C12521uz;
import o00OoOo.C25068OooO00o;

/* JADX INFO: renamed from: com.aspose.slides.internal.uj.up */
/* JADX INFO: loaded from: classes4.dex */
public class C11413up {
    /* JADX INFO: renamed from: k4 */
    public final boolean m54496k4(C5019ne[] c5019neArr, AbstractC3150x6 abstractC3150x6) {
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        C5071x6 c5071x6 = new C5071x6(c5019neArr[0]);
        c5071x6.m21618k4((C12521uz) C25068OooO00o.OooO00o(c3134k4));
        long jM13384uz = c3134k4.m13384uz();
        c5071x6.m21617k4(jM13384uz);
        long j = jM13384uz & 4294967295L;
        c5071x6.m21620k4(new C1352to[(int) j]);
        long jM7974k4 = 0;
        for (int i = 0; i < j; i++) {
            C1352to c1352to = (C1352to) new C5485kk().m22575k4(c3134k4);
            jM7974k4 = ((jM7974k4 & 4294967295L) + (c1352to.m7974k4() & 4294967295L)) & 4294967295L;
            c5071x6.m21622k4()[i] = c1352to;
        }
        c5071x6.m21619k4(c3134k4.m13372dy((int) jM7974k4));
        c5019neArr[0] = c5071x6;
        return true;
    }
}
