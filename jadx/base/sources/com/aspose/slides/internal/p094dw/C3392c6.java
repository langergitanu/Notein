package com.aspose.slides.internal.p094dw;

import com.aspose.slides.exceptions.InvalidDataException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p260ly.C6284u4;
import com.aspose.slides.internal.p349q3.C9705sv;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p422tl.C11064x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.dw.c6 */
/* JADX INFO: loaded from: classes3.dex */
public class C3392c6 {
    /* JADX INFO: renamed from: k4 */
    public static boolean m13950k4(C9723vw[] c9723vwArr, AbstractC3150x6 abstractC3150x6) {
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        C9705sv c9705sv = new C9705sv(c9723vwArr[0]);
        c9705sv.m47650k4(c3134k4.m13384uz());
        c9705sv.m47655x1(c3134k4.m13384uz() & 4294967295L);
        if ((c9705sv.m47649k4() & 4294967295L) > 0) {
            long position = c3134k4.m13371ck().getPosition();
            c9705sv.m47651k4((C6284u4) new C11064x6().m53496k4(c3134k4));
            if (((int) (c3134k4.m13371ck().getPosition() - position)) != (4294967295L & c9705sv.m47649k4())) {
                throw new InvalidDataException();
            }
        }
        c9723vwArr[0] = c9705sv;
        return true;
    }
}
