package com.aspose.slides.internal.p097e0;

import com.aspose.slides.internal.p150gi.AbstractC4275gi;
import com.aspose.slides.internal.p150gi.AbstractC4282kp;
import com.aspose.slides.internal.p150gi.C4262b3;
import com.aspose.slides.internal.p150gi.C4304vj;
import com.aspose.slides.internal.p380ri.C10009ck;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.e0.c6 */
/* JADX INFO: loaded from: classes3.dex */
public class C3512c6 extends C4262b3 {
    @Override // com.aspose.slides.internal.p150gi.C4262b3, com.aspose.slides.internal.p150gi.InterfaceC4268dq
    /* JADX INFO: renamed from: x1 */
    public AbstractC4282kp mo14062x1(int i, AbstractC4282kp abstractC4282kp, AbstractC4275gi abstractC4275gi, AbstractC3533um abstractC3533um) {
        String strM49139k4;
        String strMo9926j_ = abstractC4282kp.mo9926j_();
        int iM67429to = C14113y2.m67429to(strMo9926j_, '-');
        if (i == 134) {
            if (iM67429to == -1) {
                return abstractC4282kp;
            }
            strM49139k4 = C10009ck.m49139k4(strMo9926j_, 0, iM67429to);
        } else {
            if (i != 81 || iM67429to == -1) {
                return null;
            }
            int i2 = iM67429to + 1;
            int iM67434x1 = C14113y2.m67434x1(strMo9926j_, '-', i2);
            strM49139k4 = iM67434x1 != -1 ? C10009ck.m49139k4(strMo9926j_, i2, iM67434x1) : C14113y2.m67422kk(strMo9926j_, i2);
        }
        return C4304vj.m17277x1(strM49139k4);
    }
}
