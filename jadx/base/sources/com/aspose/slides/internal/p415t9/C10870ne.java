package com.aspose.slides.internal.p415t9;

import com.aspose.slides.internal.p042bn.C1742ne;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p197j1.C5167rv;

/* JADX INFO: renamed from: com.aspose.slides.internal.t9.ne */
/* JADX INFO: loaded from: classes4.dex */
public class C10870ne extends AbstractC10873rv {
    @Override // com.aspose.slides.internal.p415t9.AbstractC10873rv
    /* JADX INFO: renamed from: k4 */
    public boolean mo52417k4(C1742ne[] c1742neArr, C3134k4 c3134k4) {
        C5167rv c5167rv = new C5167rv(c1742neArr[0]);
        c5167rv.m22065to(c3134k4.m13382u4());
        long position = c3134k4.m13371ck().getPosition() - 12;
        c5167rv.m22062k4(c3134k4.m13372dy((int) ((((long) (c5167rv.m22063kk() & 65535)) + position) - c3134k4.m13371ck().getPosition())));
        long jM9402up = ((((c5167rv.m9402up() & 4294967295L) * 2) & 4294967295L) + position) - (position + ((long) (c5167rv.m22063kk() & 65535)));
        c5167rv.m22066x1(new byte[0]);
        c5167rv.m22064kk(c3134k4.m13372dy((int) jM9402up));
        c1742neArr[0] = c5167rv;
        return true;
    }
}
