package com.aspose.slides.internal.p097e0;

import com.aspose.slides.internal.p150gi.AbstractC4275gi;
import com.aspose.slides.internal.p150gi.AbstractC4282kp;
import com.aspose.slides.internal.p150gi.C4288qq;
import com.aspose.slides.internal.p150gi.C4301uz;
import com.aspose.slides.internal.p150gi.InterfaceC4268dq;

/* JADX INFO: renamed from: com.aspose.slides.internal.e0.dq */
/* JADX INFO: loaded from: classes3.dex */
public class C3514dq implements InterfaceC4268dq {
    @Override // com.aspose.slides.internal.p150gi.InterfaceC4268dq
    /* JADX INFO: renamed from: x1 */
    public final AbstractC4282kp mo14062x1(int i, AbstractC4282kp abstractC4282kp, AbstractC4275gi abstractC4275gi, AbstractC3533um abstractC3533um) {
        int iMo17251du = abstractC4282kp.mo17251du();
        if (iMo17251du == 12) {
            if (i == 3) {
                return new C4301uz(C4288qq.m17258k4(9, "AUTO"));
            }
            if (i == 4) {
                return C4288qq.m17258k4(12, "BASELINE");
            }
            if (i == 15) {
                return new C4301uz(C4288qq.m17258k4(12, "BASELINE"));
            }
            if (i != 88) {
                return null;
            }
            return C4288qq.m17258k4(9, "AUTO");
        }
        if (iMo17251du == 20) {
            if (i == 3) {
                return new C4301uz(C4288qq.m17258k4(9, "AUTO"));
            }
            if (i == 4) {
                return C4288qq.m17258k4(4, "AFTER_EDGE");
            }
            if (i == 15) {
                return new C4301uz(C4288qq.m17258k4(12, "BASELINE"));
            }
            if (i != 88) {
                return null;
            }
            return C4288qq.m17258k4(9, "AUTO");
        }
        if (iMo17251du == 84) {
            if (i == 3) {
                return new C4301uz(C4288qq.m17258k4(9, "AUTO"));
            }
            if (i == 4) {
                return C4288qq.m17258k4(84, "MIDDLE");
            }
            if (i == 15) {
                return new C4301uz(C4288qq.m17258k4(12, "BASELINE"));
            }
            if (i != 88) {
                return null;
            }
            return C4288qq.m17258k4(9, "AUTO");
        }
        if (iMo17251du == 137) {
            if (i == 3) {
                return new C4301uz(C4288qq.m17258k4(9, "AUTO"));
            }
            if (i == 4) {
                return C4288qq.m17258k4(12, "BASELINE");
            }
            if (i == 15) {
                return new C4301uz(C4288qq.m17258k4(137, "SUB"));
            }
            if (i != 88) {
                return null;
            }
            return C4288qq.m17258k4(9, "AUTO");
        }
        if (iMo17251du == 138) {
            if (i == 3) {
                return new C4301uz(C4288qq.m17258k4(9, "AUTO"));
            }
            if (i == 4) {
                return C4288qq.m17258k4(12, "BASELINE");
            }
            if (i == 15) {
                return new C4301uz(C4288qq.m17258k4(138, "SUPER"));
            }
            if (i != 88) {
                return null;
            }
            return C4288qq.m17258k4(9, "AUTO");
        }
        switch (iMo17251du) {
            case 143:
                if (i == 3) {
                    return new C4301uz(C4288qq.m17258k4(9, "AUTO"));
                }
                if (i == 4) {
                    return C4288qq.m17258k4(141, "TEXT_AFTER_EDGE");
                }
                if (i == 15) {
                    return new C4301uz(C4288qq.m17258k4(12, "BASELINE"));
                }
                if (i != 88) {
                    return null;
                }
                return C4288qq.m17258k4(9, "AUTO");
            case 144:
                if (i == 3) {
                    return new C4301uz(C4288qq.m17258k4(9, "AUTO"));
                }
                if (i == 4) {
                    return C4288qq.m17258k4(142, "TEXT_BEFORE_EDGE");
                }
                if (i == 15) {
                    return new C4301uz(C4288qq.m17258k4(12, "BASELINE"));
                }
                if (i != 88) {
                    return null;
                }
                return C4288qq.m17258k4(9, "AUTO");
            case 145:
                if (i == 3) {
                    return new C4301uz(C4288qq.m17258k4(9, "AUTO"));
                }
                if (i == 4) {
                    return C4288qq.m17258k4(14, "BEFORE_EDGE");
                }
                if (i == 15) {
                    return new C4301uz(C4288qq.m17258k4(12, "BASELINE"));
                }
                if (i != 88) {
                    return null;
                }
                return C4288qq.m17258k4(9, "AUTO");
            default:
                if (i == 3) {
                    return abstractC4282kp;
                }
                if (i == 4) {
                    return C4288qq.m17258k4(12, "BASELINE");
                }
                if (i == 15) {
                    return new C4301uz(C4288qq.m17258k4(12, "BASELINE"));
                }
                if (i != 88) {
                    return null;
                }
                return C4288qq.m17258k4(9, "AUTO");
        }
    }
}
