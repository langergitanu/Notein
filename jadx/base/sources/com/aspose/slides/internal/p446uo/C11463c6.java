package com.aspose.slides.internal.p446uo;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p018aa.C1326ne;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p132fj.C4051ts;
import com.aspose.slides.internal.p488x0.C12347u4;

/* JADX INFO: renamed from: com.aspose.slides.internal.uo.c6 */
/* JADX INFO: loaded from: classes4.dex */
public class C11463c6 {
    /* JADX INFO: renamed from: k4 */
    public final boolean m54516k4(C4051ts[] c4051tsArr, AbstractC3150x6 abstractC3150x6) {
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        long jM13384uz = c3134k4.m13384uz();
        if ((4294967295L & jM13384uz) != 2596720087L) {
            return false;
        }
        c4051tsArr[0].m16093k4(jM13384uz);
        c4051tsArr[0].m16095k4(c3134k4.m13381rv());
        c4051tsArr[0].m16094k4((C12347u4) new C1326ne().m7811k4(c3134k4));
        c4051tsArr[0].m16092k4(c3134k4.m13382u4());
        int iM13386x6 = c3134k4.m13386x6();
        if (iM13386x6 != 0) {
            throw new ArgumentException("MUST be 0x00000000");
        }
        c4051tsArr[0].m16099x1(iM13386x6);
        c4051tsArr[0].m16100x1(c3134k4.m13381rv());
        return true;
    }
}
