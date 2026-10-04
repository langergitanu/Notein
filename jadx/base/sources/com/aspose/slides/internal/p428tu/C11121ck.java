package com.aspose.slides.internal.p428tu;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p110ek.C3751to;
import com.aspose.slides.internal.p132fj.C4037ne;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p543z9.C13469fa;

/* JADX INFO: renamed from: com.aspose.slides.internal.tu.ck */
/* JADX INFO: loaded from: classes4.dex */
public class C11121ck extends AbstractC11141rv {
    @Override // com.aspose.slides.internal.p428tu.AbstractC11141rv
    /* JADX INFO: renamed from: k4 */
    public boolean mo53663k4(C4037ne[] c4037neArr, C3134k4 c3134k4) {
        C13469fa c13469fa = new C13469fa(c4037neArr[0]);
        c13469fa.m62645k4(c3134k4.m13384uz());
        if ((c13469fa.m62648kk() & 4294967295L) > (c13469fa.m16027x1() & 65535)) {
            C6005k4.m24264to("ByteCount SHOULD be greater than or equal to the value of the Size field");
            return false;
        }
        c13469fa.m62651to(c3134k4.m13384uz());
        c13469fa.m62647k4(C3751to.m15056k4(3L, c3134k4));
        c13469fa.m62646k4(c3134k4.m13372dy((int) ((((((c13469fa.m62648kk() & 4294967295L) - 4) & 4294967295L) - 4) & 4294967295L) - 24)));
        c4037neArr[0] = c13469fa;
        return true;
    }
}
