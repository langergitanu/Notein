package com.aspose.slides.internal.p097e0;

import com.aspose.slides.internal.p150gi.AbstractC4275gi;
import com.aspose.slides.internal.p150gi.AbstractC4282kp;
import com.aspose.slides.internal.p150gi.C4262b3;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.e0.x1 */
/* JADX INFO: loaded from: classes3.dex */
public class C3539x1 extends C4262b3 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033 A[PHI: r6
      0x0033: PHI (r6v5 int) = (r6v4 int), (r6v6 int) binds: [B:17:0x003e, B:12:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.aspose.slides.internal.p150gi.C4262b3
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC4282kp mo14305k4(int i, AbstractC4282kp abstractC4282kp, AbstractC4275gi abstractC4275gi, AbstractC3533um abstractC3533um) {
        AbstractC4282kp abstractC4282kpM17122k4;
        int i2;
        String strM14278k4 = C3521jd.m14278k4(i);
        int size = abstractC4282kp.mo17208t_().size();
        int i3 = 0;
        if (C14113y2.m67364dy(strM14278k4, "-top") >= 0) {
            abstractC4282kpM17122k4 = m17122k4(abstractC4282kp, i3);
        } else if (C14113y2.m67364dy(strM14278k4, "-right") >= 0) {
            if (size > 1) {
                i3 = 1;
            }
            abstractC4282kpM17122k4 = m17122k4(abstractC4282kp, i3);
        } else if (C14113y2.m67364dy(strM14278k4, "-bottom") >= 0) {
            i2 = 2;
            if (size > 2) {
                i3 = i2;
            }
            abstractC4282kpM17122k4 = m17122k4(abstractC4282kp, i3);
        } else if (C14113y2.m67364dy(strM14278k4, "-left") >= 0) {
            i2 = 3;
            if (size <= 3) {
                if (size > 1) {
                }
            }
            abstractC4282kpM17122k4 = m17122k4(abstractC4282kp, i3);
        } else {
            abstractC4282kpM17122k4 = null;
        }
        return abstractC4282kpM17122k4 != null ? abstractC4275gi.m17213k4(abstractC3533um, abstractC4282kpM17122k4, (AbstractC3524ks) null) : abstractC4282kpM17122k4;
    }
}
