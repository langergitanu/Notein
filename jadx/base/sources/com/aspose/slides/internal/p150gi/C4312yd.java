package com.aspose.slides.internal.p150gi;

import com.aspose.slides.internal.p051bz.C1904ar;
import com.aspose.slides.internal.p051bz.C1925um;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p150gi.C4288qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.microsoft.identity.common.java.marker.PerfConstants;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.yd */
/* JADX INFO: loaded from: classes.dex */
public class C4312yd extends C4288qq.k4 {
    public C4312yd(int i) {
        super(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC4282kp mo14415k4(AbstractC3533um abstractC3533um, String str, AbstractC3524ks abstractC3524ks) {
        int i;
        String str2;
        if (C14113y2.m67363du(str, "inherit")) {
            return super.mo14415k4(abstractC3533um, str, abstractC3524ks);
        }
        AbstractC4282kp abstractC4282kpMo17217k4 = mo17217k4(m17225kk(str));
        int iMo17251du = abstractC4282kpMo17217k4 != null ? abstractC4282kpMo17217k4.mo17251du() : -1;
        if (iMo17251du == 167 || iMo17251du == 168) {
            int iMo17251du2 = abstractC3533um.m14398kk(108).mo17251du();
            if (iMo17251du != 167) {
                switch (iMo17251du2) {
                    case 169:
                    case 170:
                        i = 169;
                        str2 = PerfConstants.ScenarioConstants.SCENARIO_NON_BROKERED_ACQUIRE_TOKEN_SILENTLY;
                        abstractC4282kpMo17217k4 = C4288qq.m17258k4(i, str2);
                        break;
                }
            } else {
                switch (iMo17251du2) {
                    case 169:
                        abstractC4282kpMo17217k4 = C4288qq.m17258k4(170, PerfConstants.ScenarioConstants.SCENARIO_BROKERED_ACQUIRE_TOKEN_SILENTLY);
                        break;
                    case 170:
                        abstractC4282kpMo17217k4 = C4288qq.m17258k4(171, PerfConstants.ScenarioConstants.SCENARIO_GENERATE_AT_POP_ASYMMETRIC_KEYPAIR);
                        break;
                    case 171:
                        abstractC4282kpMo17217k4 = C4288qq.m17258k4(172, "400");
                        break;
                    case 172:
                        abstractC4282kpMo17217k4 = C4288qq.m17258k4(173, "500");
                        break;
                    case 173:
                        abstractC4282kpMo17217k4 = C4288qq.m17258k4(174, "600");
                        break;
                    case 174:
                        abstractC4282kpMo17217k4 = C4288qq.m17258k4(175, "700");
                        break;
                    case 175:
                        abstractC4282kpMo17217k4 = C4288qq.m17258k4(176, "800");
                        break;
                    case 176:
                    case 177:
                        i = 177;
                        str2 = "900";
                        abstractC4282kpMo17217k4 = C4288qq.m17258k4(i, str2);
                        break;
                }
            }
        } else if (iMo17251du == -1) {
            abstractC4282kpMo17217k4 = C1925um.m9912k4(str, new C1904ar(this, abstractC3533um));
        }
        return abstractC4282kpMo17217k4 != null ? mo17139x1(abstractC4282kpMo17217k4, abstractC3533um, abstractC3524ks) : abstractC4282kpMo17217k4;
    }
}
