package com.aspose.slides;

import com.aspose.slides.internal.p407st.C10426eo;

/* JADX INFO: renamed from: com.aspose.slides.m7 */
/* JADX INFO: loaded from: classes3.dex */
class C13823m7 {
    /* JADX INFO: renamed from: k4 */
    public static void m64785k4(ICommonSlideViewProperties iCommonSlideViewProperties, C10426eo c10426eo) {
        c10426eo.m50771x1().m51828k4().m51661k4(iCommonSlideViewProperties.getScale());
        c10426eo.m50771x1().m51832x1().m51661k4(iCommonSlideViewProperties.getScale());
        if (c10426eo.m50771x1().m51828k4().m51660k4() < 10) {
            c10426eo.m50771x1().m51828k4().m51661k4(10);
        }
        if (c10426eo.m50771x1().m51832x1().m51660k4() < 10) {
            c10426eo.m50771x1().m51832x1().m51661k4(10);
        }
        c10426eo.m50771x1().m51828k4().m51665x1(100);
        c10426eo.m50771x1().m51832x1().m51665x1(100);
        c10426eo.m50769k4(iCommonSlideViewProperties.getVariableScale());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64786k4(C10426eo c10426eo, ICommonSlideViewProperties iCommonSlideViewProperties) {
        if (c10426eo == null) {
            return;
        }
        iCommonSlideViewProperties.setVariableScale(c10426eo.m50770kk());
        iCommonSlideViewProperties.setScale(c10426eo.m50771x1().m51828k4().m51660k4());
    }
}
