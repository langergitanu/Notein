package com.aspose.slides.internal.p403so;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p171hq.AbstractC4623f9;
import com.aspose.slides.internal.p171hq.C4662up;
import com.aspose.slides.internal.p171hq.C4675xw;
import com.aspose.slides.internal.p280ms.C6490k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.so.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C10273m9 extends AbstractC10258e0 {
    /* JADX INFO: renamed from: k4 */
    public AbstractC4623f9 m50227k4(C3134k4 c3134k4) {
        C4662up c4662up = new C4662up();
        c4662up.m19381k4(c3134k4.m13386x6());
        long position = c3134k4.m13371ck().getPosition();
        c4662up.m19382k4((C4675xw) new C10283sv().m50237k4(c3134k4));
        if (((int) (c3134k4.m13371ck().getPosition() - position)) <= c4662up.m19383x1()) {
            return c4662up;
        }
        throw new C6490k4("Stream position is out of object bounds.");
    }
}
