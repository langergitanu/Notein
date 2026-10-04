package com.aspose.slides.internal.p097e0;

import com.aspose.slides.internal.p150gi.AbstractC4275gi;
import com.aspose.slides.internal.p150gi.AbstractC4282kp;
import com.aspose.slides.internal.p150gi.C4288qq;
import com.aspose.slides.internal.p150gi.InterfaceC4268dq;

/* JADX INFO: renamed from: com.aspose.slides.internal.e0.qq */
/* JADX INFO: loaded from: classes3.dex */
public class C3528qq implements InterfaceC4268dq {
    @Override // com.aspose.slides.internal.p150gi.InterfaceC4268dq
    /* JADX INFO: renamed from: x1 */
    public final AbstractC4282kp mo14062x1(int i, AbstractC4282kp abstractC4282kp, AbstractC4275gi abstractC4275gi, AbstractC3533um abstractC3533um) {
        if (i == 133 || i == 132 || i == 131) {
            if (abstractC4282kp.mo17251du() == 178) {
                return abstractC4275gi.mo17216k4(null, 5632, abstractC3533um, "always", abstractC3533um.m14393k4());
            }
            return null;
        }
        if (i != 59 && i != 58) {
            return null;
        }
        int iMo17251du = abstractC4282kp.mo17251du();
        if (iMo17251du == 7) {
            return C4288qq.m17258k4(104, "PAGE");
        }
        if (iMo17251du == 73) {
            return C4288qq.m17258k4(44, "EVEN_PAGE");
        }
        if (iMo17251du != 120) {
            return null;
        }
        return C4288qq.m17258k4(100, "ODD_PAGE");
    }
}
