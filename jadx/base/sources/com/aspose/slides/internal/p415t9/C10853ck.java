package com.aspose.slides.internal.p415t9;

import com.aspose.slides.internal.p042bn.C1742ne;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p190is.C5116to;
import com.aspose.slides.internal.p197j1.C5148ck;
import com.aspose.slides.internal.p243l6.C6005k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.t9.ck */
/* JADX INFO: loaded from: classes4.dex */
public class C10853ck extends AbstractC10873rv {
    @Override // com.aspose.slides.internal.p415t9.AbstractC10873rv
    /* JADX INFO: renamed from: k4 */
    public boolean mo52417k4(C1742ne[] c1742neArr, C3134k4 c3134k4) {
        C5148ck c5148ck = new C5148ck(c1742neArr[0]);
        c5148ck.m22029k4(c3134k4.m13384uz());
        if ((c5148ck.m22032kk() & 4294967295L) > (c5148ck.m9365x1() & 65535)) {
            C6005k4.m24264to("ByteCount SHOULD be greater than or equal to the value of the Size field");
            return false;
        }
        c5148ck.m22033to(c3134k4.m13384uz());
        c5148ck.m22031k4(C5116to.m21971k4(3L, c3134k4));
        c5148ck.m22030k4(c3134k4.m13372dy((int) ((((((c5148ck.m22032kk() & 4294967295L) - 4) & 4294967295L) - 4) & 4294967295L) - 24)));
        c1742neArr[0] = c5148ck;
        return true;
    }
}
