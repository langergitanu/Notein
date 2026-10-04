package com.aspose.slides.internal.p097e0;

import com.aspose.slides.internal.p150gi.AbstractC4275gi;
import com.aspose.slides.internal.p150gi.AbstractC4282kp;
import com.aspose.slides.internal.p150gi.C4288qq;
import com.aspose.slides.internal.p150gi.InterfaceC4268dq;

/* JADX INFO: renamed from: com.aspose.slides.internal.e0.ar */
/* JADX INFO: loaded from: classes3.dex */
public class C3508ar implements InterfaceC4268dq {
    @Override // com.aspose.slides.internal.p150gi.InterfaceC4268dq
    /* JADX INFO: renamed from: x1 */
    public final AbstractC4282kp mo14062x1(int i, AbstractC4282kp abstractC4282kp, AbstractC4275gi abstractC4275gi, AbstractC3533um abstractC3533um) {
        int iMo17251du = abstractC4282kp.mo17251du();
        if (i == 1) {
            if (iMo17251du == 1) {
                return C4288qq.m17258k4(1, "ABSOLUTE");
            }
            if (iMo17251du == 51) {
                return C4288qq.m17258k4(51, "FIXED");
            }
            if (iMo17251du == 110 || iMo17251du == 136) {
                return C4288qq.m17258k4(110, "RELATIVE");
            }
            if (iMo17251du == 206) {
                return C4288qq.m17258k4(206, "ABSOLUTERELATIVE");
            }
            if (iMo17251du == 215) {
                return C4288qq.m17258k4(215, "INLINEABSOLUTE");
            }
        }
        if (i != 203) {
            return null;
        }
        if (iMo17251du != 1 && iMo17251du != 51) {
            if (iMo17251du == 110) {
                return C4288qq.m17258k4(110, "RELATIVE");
            }
            if (iMo17251du == 136) {
                return C4288qq.m17258k4(136, "STATIC");
            }
            if (iMo17251du == 206) {
                return C4288qq.m17258k4(206, "ABSOLUTERELATIVE");
            }
            if (iMo17251du != 215) {
                return null;
            }
            return C4288qq.m17258k4(215, "INLINEABSOLUTE");
        }
        return C4288qq.m17258k4(136, "STATIC");
    }
}
