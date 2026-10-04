package com.aspose.slides.internal.p097e0;

import com.aspose.slides.internal.p150gi.AbstractC4275gi;
import com.aspose.slides.internal.p150gi.AbstractC4282kp;
import com.aspose.slides.internal.p150gi.C4288qq;
import com.aspose.slides.internal.p150gi.InterfaceC4268dq;

/* JADX INFO: renamed from: com.aspose.slides.internal.e0.xk */
/* JADX INFO: loaded from: classes3.dex */
public class C3541xk implements InterfaceC4268dq {
    @Override // com.aspose.slides.internal.p150gi.InterfaceC4268dq
    /* JADX INFO: renamed from: x1 */
    public final AbstractC4282kp mo14062x1(int i, AbstractC4282kp abstractC4282kp, AbstractC4275gi abstractC4275gi, AbstractC3533um abstractC3533um) {
        int i2;
        String str;
        int iMo17251du = abstractC4282kp.mo17251du();
        if (iMo17251du == 93) {
            if (i == 266) {
                return C4288qq.m17258k4(93, "NO_WRAP");
            }
            return null;
        }
        if (iMo17251du != 179) {
            return null;
        }
        if (i == 143) {
            i2 = 108;
            str = "PRESERVE";
        } else {
            if (i == 266) {
                return C4288qq.m17258k4(93, "NO_WRAP");
            }
            if (i != 261) {
                if (i != 262) {
                    return null;
                }
                i2 = 108;
                str = "PRESERVE";
            } else {
                i2 = 48;
                str = "FALSE";
            }
        }
        return C4288qq.m17258k4(i2, str);
    }
}
