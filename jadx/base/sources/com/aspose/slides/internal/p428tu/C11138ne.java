package com.aspose.slides.internal.p428tu;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p132fj.C4037ne;
import com.aspose.slides.internal.p543z9.C13498x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.tu.ne */
/* JADX INFO: loaded from: classes4.dex */
public class C11138ne extends AbstractC11141rv {
    @Override // com.aspose.slides.internal.p428tu.AbstractC11141rv
    /* JADX INFO: renamed from: k4 */
    public boolean mo53663k4(C4037ne[] c4037neArr, C3134k4 c3134k4) {
        C13498x6 c13498x6 = new C13498x6(c4037neArr[0]);
        c13498x6.m62685to(c3134k4.m13382u4());
        long position = c3134k4.m13371ck().getPosition() - 12;
        c13498x6.m62682k4(c3134k4.m13372dy((int) ((((long) (c13498x6.m62683kk() & 65535)) + position) - c3134k4.m13371ck().getPosition())));
        long jM16068yj = ((((c13498x6.m16068yj() & 4294967295L) * 2) & 4294967295L) + position) - (position + ((long) (c13498x6.m62683kk() & 65535)));
        c13498x6.m62687x1(new byte[0]);
        c13498x6.m62684kk(c3134k4.m13372dy((int) jM16068yj));
        c4037neArr[0] = c13498x6;
        return true;
    }
}
