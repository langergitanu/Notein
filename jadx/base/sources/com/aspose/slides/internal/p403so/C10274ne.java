package com.aspose.slides.internal.p403so;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p171hq.AbstractC4623f9;
import com.aspose.slides.internal.p171hq.C4612bv;
import com.aspose.slides.internal.p171hq.C4661um;
import com.aspose.slides.internal.p280ms.C6490k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.so.ne */
/* JADX INFO: loaded from: classes4.dex */
public class C10274ne extends AbstractC10258e0 {
    /* JADX INFO: renamed from: k4 */
    public AbstractC4623f9 m50228k4(C3134k4 c3134k4) {
        C4661um c4661um = new C4661um();
        c4661um.m19375k4(c3134k4.m13386x6());
        long position = c3134k4.m13371ck().getPosition();
        c4661um.m19376k4((C4612bv) new C10296wl().m50250k4(c3134k4));
        if (c4661um.m19378x1() == ((int) (c3134k4.m13371ck().getPosition() - position))) {
            return c4661um;
        }
        throw new C6490k4("Readed more bytes than the object size.");
    }
}
